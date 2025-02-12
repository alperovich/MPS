package jetbrains.mps.ide.ui.dialogs.properties.creators;

/*Generated by MPS */

import jetbrains.mps.util.Computable;
import java.util.List;
import org.jetbrains.mps.openapi.module.SModuleReference;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.project.DevKit;
import jetbrains.mps.FilteredGlobalScope;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.ide.ui.dialogs.properties.choosers.CommonChoosers;

public class DevKitChooser implements Computable<List<SModuleReference>> {
  public DevKitChooser() {
  }

  @Override
  public List<SModuleReference> compute() {
    final Wrappers._T<List<SModuleReference>> dkRefs = new Wrappers._T<List<SModuleReference>>();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        Iterable<DevKit> devkits = new FilteredGlobalScope().getVisibleDevkits();
        dkRefs.value = Sequence.fromIterable(devkits).select(new ISelector<DevKit, SModuleReference>() {
          public SModuleReference select(DevKit it) {
            return it.getModuleReference();
          }
        }).toListSequence();
      }
    });
    return CommonChoosers.showDialogModuleCollectionChooser(null, "devkit", dkRefs.value, null);
  }
}
