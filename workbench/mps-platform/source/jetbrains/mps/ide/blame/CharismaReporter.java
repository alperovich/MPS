/*
 * Copyright 2003-2011 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jetbrains.mps.ide.blame;

import com.intellij.ide.DataManager;
import com.intellij.openapi.actionSystem.DataContext;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.diagnostic.ErrorReportSubmitter;
import com.intellij.openapi.diagnostic.IdeaLoggingEvent;
import com.intellij.openapi.diagnostic.SubmittedReportInfo;
import com.intellij.openapi.diagnostic.SubmittedReportInfo.SubmissionStatus;
import com.intellij.openapi.project.Project;
import com.intellij.util.Consumer;
import jetbrains.mps.ide.ThreadUtils;
import jetbrains.mps.ide.blame.dialog.BlameDialog;
import jetbrains.mps.ide.blame.dialog.BlameDialogComponent;
import jetbrains.mps.ide.blame.perform.Response;

import java.awt.*;

public class CharismaReporter extends ErrorReportSubmitter {
  @Override
  public String getReportActionText() {
    return "Report To JetBrains MPS Tracker";
  }

  @Override
  public void submitAsync(IdeaLoggingEvent[] events, String additionalInfo, Component parentComponent, Consumer<SubmittedReportInfo> consumer) {
    assert ThreadUtils.isEventDispatchThread();

    if (events.length == 0) {
      consumer.consume(new SubmittedReportInfo(null, null, SubmissionStatus.FAILED));
      return;
    }
    final DataContext dataContext = DataManager.getInstance().getDataContext(parentComponent);
    final Project project = PlatformDataKeys.PROJECT.getData(dataContext);

    BlameDialog blameDialog = BlameDialogComponent.getInstance().createDialog(project, parentComponent);
    blameDialog.addEx(events[0].getThrowable());
    blameDialog.setIssueTitle(events[0].getMessage());
    blameDialog.setDescription(additionalInfo);

    blameDialog.show();

    if (blameDialog.isCancelled()) {
      consumer.consume(new SubmittedReportInfo(null, "Cancelled issue submit", SubmissionStatus.FAILED));
    } else {
      Response response = blameDialog.getResult();
      assert response != null : "Response must not be null";
      assert response.isSuccess() : "Response is not 'cancelled' or 'success'";
      consumer.consume(new SubmittedReportInfo(null, "", SubmissionStatus.NEW_ISSUE));
    }
  }

  @Override
  public SubmittedReportInfo submit(IdeaLoggingEvent[] events, Component parentComponent) {
    // obsolete API
    return new SubmittedReportInfo(null, "0", SubmittedReportInfo.SubmissionStatus.FAILED);
  }
}
