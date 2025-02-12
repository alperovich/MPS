package jetbrains.mps.ide.editor.resolver;

/*Generated by MPS */

import com.intellij.openapi.components.ApplicationComponent;
import jetbrains.mps.ide.MPSCoreComponents;
import jetbrains.mps.resolve.ResolverComponent;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class EditorResolverComponent implements ApplicationComponent {
  private EditorResolver myResolver;

  public EditorResolverComponent(MPSCoreComponents coreComponents) {
  }

  @Override
  public void initComponent() {
    myResolver = new EditorResolver();
    ResolverComponent.getInstance().addResolver(myResolver);
  }

  @Override
  public void disposeComponent() {
    ResolverComponent.getInstance().removeResolver(myResolver);
    myResolver = null;
  }

  @NonNls
  @NotNull
  @Override
  public String getComponentName() {
    return "MPS Editor-based Resolver Component";
  }
}
