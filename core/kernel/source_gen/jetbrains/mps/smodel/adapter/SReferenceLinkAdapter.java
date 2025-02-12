package jetbrains.mps.smodel.adapter;

/*Generated by MPS */

import org.jetbrains.mps.openapi.language.SReferenceLink;
import org.jetbrains.mps.openapi.language.SScope;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.scope.Scope;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import org.jetbrains.annotations.NotNull;

public class SReferenceLinkAdapter extends SAbstractLinkAdapter implements SReferenceLink {


  public SReferenceLinkAdapter(String conceptName, String role) {
    super(conceptName, role);
  }



  @Override
  public boolean isReference() {
    return true;
  }



  public SScope getScope(SNode referenceNode) {
    // TODO scope = ModelConstraints.getReferenceDescriptor(conceptName, role).getScope() 
    Scope scope = null;
    if (scope != null) {
      return new SReferenceLinkAdapter.SScopeAdapter(scope, referenceNode);
    }
    return null;
  }

  public SScope getScope(SNode contextNode, @Nullable SContainmentLink link, int index) {
    // TODO scope = ModelConstraints.getReferenceDescriptor(conceptName, role, contextNode, link.role(), index).getScope() 
    Scope scope = null;
    if (scope != null) {
      return new SReferenceLinkAdapter.SScopeAdapter(scope, contextNode);
    }
    return null;
  }



  private static class SScopeAdapter implements SScope {
    private final SNode myContextNode;
    private final Scope myScope;


    private SScopeAdapter(@NotNull Scope scope, @NotNull SNode contextNode) {
      myScope = scope;
      myContextNode = contextNode;
    }



    public Iterable<SNode> getAvailableElements(@Nullable String prefix) {
      return myScope.getAvailableElements(prefix);
    }

    public boolean contains(SNode node) {
      return myScope.contains(node);
    }

    @Nullable
    public SNode resolve(@NotNull String string) {
      return myScope.resolve(myContextNode, string);
    }

    @Nullable
    public String getReferenceText(@NotNull SNode node) {
      return myScope.getReferenceText(myContextNode, node);
    }
  }
}
