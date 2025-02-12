package jetbrains.mps.lang.smodel.scripts;

/*Generated by MPS */

import jetbrains.mps.lang.script.runtime.BaseMigrationScript;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.script.runtime.AbstractMigrationRefactoring;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.model.SReference;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import org.jetbrains.mps.openapi.model.SNodeId;
import jetbrains.mps.smodel.StaticReference;
import jetbrains.mps.smodel.SModelInternal;
import jetbrains.mps.project.AbstractModule;

public class ISNode_MigrationScript extends BaseMigrationScript {
  public ISNode_MigrationScript(IOperationContext operationContext) {
    super("Migrate SNode to ISNode");
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "Replacing static field references referencing static fields declared in jetbrains.mps.smodel.SNode classified with static fields from org.jetbrains.mps.openapi.model.SNode";
      }

      public String getAdditionalInfo() {
        return "Replacing static field references referencing static fields declared in jetbrains.mps.smodel.SNode classified with static fields from org.jetbrains.mps.openapi.model.SNode";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.baseLanguage.structure.StaticFieldReference";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        SReference reference = SNodeOperations.getReference(node, SLinkOperations.findLinkDeclaration("jetbrains.mps.baseLanguage.structure.StaticFieldReference", "staticFieldDeclaration"));
        if (reference == null || jetbrains.mps.util.SNodeOperations.getTargetNodeSilently(reference) != null) {
          return false;
        }

        if (!(PersistenceFacade.getInstance().createModelReference("f:java_stub#6ed54515-acc8-4d1e-a16c-9fd6cfe951ea#jetbrains.mps.smodel(MPS.Core/jetbrains.mps.smodel@java_stub)").equals(reference.getTargetSModelReference()))) {
          return false;
        }

        SNodeId targetNodeId = reference.getTargetNodeId();
        return false;
      }

      public void doUpdateInstanceNode(SNode node) {
        SReference oldReference = SNodeOperations.getReference(node, SLinkOperations.findLinkDeclaration("jetbrains.mps.baseLanguage.structure.StaticFieldReference", "staticFieldDeclaration"));
        SReference newReference = new StaticReference(oldReference.getRole(), node, PersistenceFacade.getInstance().createModelReference("f:java_stub#8865b7a8-5271-43d3-884c-6fd1d9cfdd34#org.jetbrains.mps.openapi.model(MPS.OpenAPI/org.jetbrains.mps.openapi.model@java_stub)"), oldReference.getTargetNodeId(), ((jetbrains.mps.smodel.SReference) oldReference).getResolveInfo());
        node.setReference(oldReference.getRole(), null);
        node.setReference("staticFieldDeclaration", newReference);

        ((SModelInternal) node.getModel()).addModelImport(PersistenceFacade.getInstance().createModelReference("f:java_stub#8865b7a8-5271-43d3-884c-6fd1d9cfdd34#org.jetbrains.mps.openapi.model(MPS.OpenAPI/org.jetbrains.mps.openapi.model@java_stub)"), false);
        ((AbstractModule) node.getModel().getModule()).addDependency(PersistenceFacade.getInstance().createModuleReference("8865b7a8-5271-43d3-884c-6fd1d9cfdd34(MPS.OpenAPI)"), false);
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "Pull up and remove all methods from jetbrains.mps.smodel.SNode to org.jetbrains.mps.openapi.model.SNode";
      }

      public String getAdditionalInfo() {
        return "Pull up and remove all methods from jetbrains.mps.smodel.SNode to org.jetbrains.mps.openapi.model.SNode";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.baseLanguage.structure.IMethodCall";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        SReference reference = SNodeOperations.getReference(node, SLinkOperations.findLinkDeclaration("jetbrains.mps.baseLanguage.structure.IMethodCall", "baseMethodDeclaration"));
        if (reference == null || jetbrains.mps.util.SNodeOperations.getTargetNodeSilently(reference) != null) {
          return false;
        }

        if (!(PersistenceFacade.getInstance().createModelReference("f:java_stub#6ed54515-acc8-4d1e-a16c-9fd6cfe951ea#jetbrains.mps.smodel(MPS.Core/jetbrains.mps.smodel@java_stub)").equals(reference.getTargetSModelReference()))) {
          return false;
        }

        SNodeId targetNodeId = reference.getTargetNodeId();
        if (jetbrains.mps.smodel.SNodeId.fromString("~SNode.getModel():org.jetbrains.mps.openapi.model.SModel").equals(targetNodeId)) {
          return true;
        }
        if (jetbrains.mps.smodel.SNodeId.fromString("~SNode.getNodeId():org.jetbrains.mps.openapi.model.SNodeId").equals(targetNodeId)) {
          return true;
        }
        if (jetbrains.mps.smodel.SNodeId.fromString("~SNode.getReference():org.jetbrains.mps.openapi.model.SNodeReference").equals(targetNodeId)) {
          return true;
        }
        if (jetbrains.mps.smodel.SNodeId.fromString("~SNode.getConcept():org.jetbrains.mps.openapi.language.SConcept").equals(targetNodeId)) {
          return true;
        }
        if (jetbrains.mps.smodel.SNodeId.fromString("~SNode.getPresentation():java.lang.String").equals(targetNodeId)) {
          return true;
        }
        if (jetbrains.mps.smodel.SNodeId.fromString("~SNode.getName():java.lang.String").equals(targetNodeId)) {
          return true;
        }
        if (jetbrains.mps.smodel.SNodeId.fromString("~SNode.addChild(java.lang.String,org.jetbrains.mps.openapi.model.SNode):void").equals(targetNodeId)) {
          return true;
        }
        if (jetbrains.mps.smodel.SNodeId.fromString("~SNode.insertChildBefore(java.lang.String,org.jetbrains.mps.openapi.model.SNode,org.jetbrains.mps.openapi.model.SNode):void").equals(targetNodeId)) {
          return true;
        }
        if (jetbrains.mps.smodel.SNodeId.fromString("~SNode.removeChild(org.jetbrains.mps.openapi.model.SNode):void").equals(targetNodeId)) {
          return true;
        }
        if (jetbrains.mps.smodel.SNodeId.fromString("~SNode.delete():void").equals(targetNodeId)) {
          return true;
        }
        if (jetbrains.mps.smodel.SNodeId.fromString("~SNode.getParent():org.jetbrains.mps.openapi.model.SNode").equals(targetNodeId)) {
          return true;
        }
        if (jetbrains.mps.smodel.SNodeId.fromString("~SNode.getContainingRoot():org.jetbrains.mps.openapi.model.SNode").equals(targetNodeId)) {
          return true;
        }
        if (jetbrains.mps.smodel.SNodeId.fromString("~SNode.getRoleInParent():java.lang.String").equals(targetNodeId)) {
          return true;
        }
        if (jetbrains.mps.smodel.SNodeId.fromString("~SNode.getFirstChild():org.jetbrains.mps.openapi.model.SNode").equals(targetNodeId)) {
          return true;
        }
        if (jetbrains.mps.smodel.SNodeId.fromString("~SNode.getPrevSibling():org.jetbrains.mps.openapi.model.SNode").equals(targetNodeId)) {
          return true;
        }
        if (jetbrains.mps.smodel.SNodeId.fromString("~SNode.getNextSibling():org.jetbrains.mps.openapi.model.SNode").equals(targetNodeId)) {
          return true;
        }
        if (jetbrains.mps.smodel.SNodeId.fromString("~SNode.getLastChild():org.jetbrains.mps.openapi.model.SNode").equals(targetNodeId)) {
          return true;
        }
        if (jetbrains.mps.smodel.SNodeId.fromString("~SNode.getChildren(java.lang.String):java.lang.Iterable").equals(targetNodeId)) {
          return true;
        }
        if (jetbrains.mps.smodel.SNodeId.fromString("~SNode.getChildren():java.lang.Iterable").equals(targetNodeId)) {
          return true;
        }
        if (jetbrains.mps.smodel.SNodeId.fromString("~SNode.setReferenceTarget(java.lang.String,org.jetbrains.mps.openapi.model.SNode):void").equals(targetNodeId)) {
          return true;
        }
        if (jetbrains.mps.smodel.SNodeId.fromString("~SNode.getReferenceTarget(java.lang.String):org.jetbrains.mps.openapi.model.SNode").equals(targetNodeId)) {
          return true;
        }
        if (jetbrains.mps.smodel.SNodeId.fromString("~SNode.getReference(java.lang.String):org.jetbrains.mps.openapi.model.SReference").equals(targetNodeId)) {
          return true;
        }
        if (jetbrains.mps.smodel.SNodeId.fromString("~SNode.setReference(java.lang.String,org.jetbrains.mps.openapi.model.SReference):void").equals(targetNodeId)) {
          return true;
        }
        if (jetbrains.mps.smodel.SNodeId.fromString("~SNode.getReferences():java.lang.Iterable").equals(targetNodeId)) {
          return true;
        }
        if (jetbrains.mps.smodel.SNodeId.fromString("~SNode.hasProperty(java.lang.String):boolean").equals(targetNodeId)) {
          return true;
        }
        if (jetbrains.mps.smodel.SNodeId.fromString("~SNode.getProperty(java.lang.String):java.lang.String").equals(targetNodeId)) {
          return true;
        }
        if (jetbrains.mps.smodel.SNodeId.fromString("~SNode.setProperty(java.lang.String,java.lang.String):void").equals(targetNodeId)) {
          return true;
        }
        if (jetbrains.mps.smodel.SNodeId.fromString("~SNode.getPropertyNames():java.lang.Iterable").equals(targetNodeId)) {
          return true;
        }
        if (jetbrains.mps.smodel.SNodeId.fromString("~SNode.getUserObject(java.lang.Object):java.lang.Object").equals(targetNodeId)) {
          return true;
        }
        if (jetbrains.mps.smodel.SNodeId.fromString("~SNode.putUserObject(java.lang.Object,java.lang.Object):void").equals(targetNodeId)) {
          return true;
        }
        if (jetbrains.mps.smodel.SNodeId.fromString("~SNode.getUserObjectKeys():java.lang.Iterable").equals(targetNodeId)) {
          return true;
        }
        return false;
      }

      public void doUpdateInstanceNode(SNode node) {
        SReference oldReference = SNodeOperations.getReference(node, SLinkOperations.findLinkDeclaration("jetbrains.mps.baseLanguage.structure.IMethodCall", "baseMethodDeclaration"));
        SReference newReference = new StaticReference(oldReference.getRole(), node, PersistenceFacade.getInstance().createModelReference("f:java_stub#8865b7a8-5271-43d3-884c-6fd1d9cfdd34#org.jetbrains.mps.openapi.model(MPS.OpenAPI/org.jetbrains.mps.openapi.model@java_stub)"), oldReference.getTargetNodeId(), ((jetbrains.mps.smodel.SReference) oldReference).getResolveInfo());
        node.setReference(oldReference.getRole(), null);
        node.setReference("baseMethodDeclaration", newReference);

        ((SModelInternal) node.getModel()).addModelImport(PersistenceFacade.getInstance().createModelReference("f:java_stub#8865b7a8-5271-43d3-884c-6fd1d9cfdd34#org.jetbrains.mps.openapi.model(MPS.OpenAPI/org.jetbrains.mps.openapi.model@java_stub)"), false);
        ((AbstractModule) node.getModel().getModule()).addDependency(PersistenceFacade.getInstance().createModuleReference("8865b7a8-5271-43d3-884c-6fd1d9cfdd34(MPS.OpenAPI)"), false);
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "Replacing static field references referencing static fields declared in jetbrains.mps.smodel.SNodePointer classified with static fields from org.jetbrains.mps.openapi.model.SNodeReference";
      }

      public String getAdditionalInfo() {
        return "Replacing static field references referencing static fields declared in jetbrains.mps.smodel.SNodePointer classified with static fields from org.jetbrains.mps.openapi.model.SNodeReference";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.baseLanguage.structure.StaticFieldReference";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        SReference reference = SNodeOperations.getReference(node, SLinkOperations.findLinkDeclaration("jetbrains.mps.baseLanguage.structure.StaticFieldReference", "staticFieldDeclaration"));
        if (reference == null || jetbrains.mps.util.SNodeOperations.getTargetNodeSilently(reference) != null) {
          return false;
        }

        if (!(PersistenceFacade.getInstance().createModelReference("f:java_stub#6ed54515-acc8-4d1e-a16c-9fd6cfe951ea#jetbrains.mps.smodel(MPS.Core/jetbrains.mps.smodel@java_stub)").equals(reference.getTargetSModelReference()))) {
          return false;
        }

        SNodeId targetNodeId = reference.getTargetNodeId();
        return false;
      }

      public void doUpdateInstanceNode(SNode node) {
        SReference oldReference = SNodeOperations.getReference(node, SLinkOperations.findLinkDeclaration("jetbrains.mps.baseLanguage.structure.StaticFieldReference", "staticFieldDeclaration"));
        SReference newReference = new StaticReference(oldReference.getRole(), node, PersistenceFacade.getInstance().createModelReference("f:java_stub#8865b7a8-5271-43d3-884c-6fd1d9cfdd34#org.jetbrains.mps.openapi.model(MPS.OpenAPI/org.jetbrains.mps.openapi.model@java_stub)"), oldReference.getTargetNodeId(), ((jetbrains.mps.smodel.SReference) oldReference).getResolveInfo());
        node.setReference(oldReference.getRole(), null);
        node.setReference("staticFieldDeclaration", newReference);

        ((SModelInternal) node.getModel()).addModelImport(PersistenceFacade.getInstance().createModelReference("f:java_stub#8865b7a8-5271-43d3-884c-6fd1d9cfdd34#org.jetbrains.mps.openapi.model(MPS.OpenAPI/org.jetbrains.mps.openapi.model@java_stub)"), false);
        ((AbstractModule) node.getModel().getModule()).addDependency(PersistenceFacade.getInstance().createModuleReference("8865b7a8-5271-43d3-884c-6fd1d9cfdd34(MPS.OpenAPI)"), false);
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "Pull up and remove all methods from jetbrains.mps.smodel.SNodePointer to org.jetbrains.mps.openapi.model.SNodeReference";
      }

      public String getAdditionalInfo() {
        return "Pull up and remove all methods from jetbrains.mps.smodel.SNodePointer to org.jetbrains.mps.openapi.model.SNodeReference";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.baseLanguage.structure.IMethodCall";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        SReference reference = SNodeOperations.getReference(node, SLinkOperations.findLinkDeclaration("jetbrains.mps.baseLanguage.structure.IMethodCall", "baseMethodDeclaration"));
        if (reference == null || jetbrains.mps.util.SNodeOperations.getTargetNodeSilently(reference) != null) {
          return false;
        }

        if (!(PersistenceFacade.getInstance().createModelReference("f:java_stub#6ed54515-acc8-4d1e-a16c-9fd6cfe951ea#jetbrains.mps.smodel(MPS.Core/jetbrains.mps.smodel@java_stub)").equals(reference.getTargetSModelReference()))) {
          return false;
        }

        SNodeId targetNodeId = reference.getTargetNodeId();
        if (jetbrains.mps.smodel.SNodeId.fromString("~SNodeReference.resolve(org.jetbrains.mps.openapi.module.SRepository):org.jetbrains.mps.openapi.model.SNode").equals(targetNodeId)) {
          return true;
        }
        if (jetbrains.mps.smodel.SNodeId.fromString("~SNodeReference.getModelReference():org.jetbrains.mps.openapi.model.SModelReference").equals(targetNodeId)) {
          return true;
        }
        return false;
      }

      public void doUpdateInstanceNode(SNode node) {
        SReference oldReference = SNodeOperations.getReference(node, SLinkOperations.findLinkDeclaration("jetbrains.mps.baseLanguage.structure.IMethodCall", "baseMethodDeclaration"));
        SReference newReference = new StaticReference(oldReference.getRole(), node, PersistenceFacade.getInstance().createModelReference("f:java_stub#8865b7a8-5271-43d3-884c-6fd1d9cfdd34#org.jetbrains.mps.openapi.model(MPS.OpenAPI/org.jetbrains.mps.openapi.model@java_stub)"), oldReference.getTargetNodeId(), ((jetbrains.mps.smodel.SReference) oldReference).getResolveInfo());
        node.setReference(oldReference.getRole(), null);
        node.setReference("baseMethodDeclaration", newReference);

        ((SModelInternal) node.getModel()).addModelImport(PersistenceFacade.getInstance().createModelReference("f:java_stub#8865b7a8-5271-43d3-884c-6fd1d9cfdd34#org.jetbrains.mps.openapi.model(MPS.OpenAPI/org.jetbrains.mps.openapi.model@java_stub)"), false);
        ((AbstractModule) node.getModel().getModule()).addDependency(PersistenceFacade.getInstance().createModuleReference("8865b7a8-5271-43d3-884c-6fd1d9cfdd34(MPS.OpenAPI)"), false);
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "Replacing static field references referencing static fields declared in jetbrains.mps.smodel.SReference classified with static fields from org.jetbrains.mps.openapi.model.SReference";
      }

      public String getAdditionalInfo() {
        return "Replacing static field references referencing static fields declared in jetbrains.mps.smodel.SReference classified with static fields from org.jetbrains.mps.openapi.model.SReference";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.baseLanguage.structure.StaticFieldReference";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        SReference reference = SNodeOperations.getReference(node, SLinkOperations.findLinkDeclaration("jetbrains.mps.baseLanguage.structure.StaticFieldReference", "staticFieldDeclaration"));
        if (reference == null || jetbrains.mps.util.SNodeOperations.getTargetNodeSilently(reference) != null) {
          return false;
        }

        if (!(PersistenceFacade.getInstance().createModelReference("f:java_stub#6ed54515-acc8-4d1e-a16c-9fd6cfe951ea#jetbrains.mps.smodel(MPS.Core/jetbrains.mps.smodel@java_stub)").equals(reference.getTargetSModelReference()))) {
          return false;
        }

        SNodeId targetNodeId = reference.getTargetNodeId();
        return false;
      }

      public void doUpdateInstanceNode(SNode node) {
        SReference oldReference = SNodeOperations.getReference(node, SLinkOperations.findLinkDeclaration("jetbrains.mps.baseLanguage.structure.StaticFieldReference", "staticFieldDeclaration"));
        SReference newReference = new StaticReference(oldReference.getRole(), node, PersistenceFacade.getInstance().createModelReference("f:java_stub#8865b7a8-5271-43d3-884c-6fd1d9cfdd34#org.jetbrains.mps.openapi.model(MPS.OpenAPI/org.jetbrains.mps.openapi.model@java_stub)"), oldReference.getTargetNodeId(), ((jetbrains.mps.smodel.SReference) oldReference).getResolveInfo());
        node.setReference(oldReference.getRole(), null);
        node.setReference("staticFieldDeclaration", newReference);

        ((SModelInternal) node.getModel()).addModelImport(PersistenceFacade.getInstance().createModelReference("f:java_stub#8865b7a8-5271-43d3-884c-6fd1d9cfdd34#org.jetbrains.mps.openapi.model(MPS.OpenAPI/org.jetbrains.mps.openapi.model@java_stub)"), false);
        ((AbstractModule) node.getModel().getModule()).addDependency(PersistenceFacade.getInstance().createModuleReference("8865b7a8-5271-43d3-884c-6fd1d9cfdd34(MPS.OpenAPI)"), false);
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "Pull up and remove all methods from jetbrains.mps.smodel.SReference to org.jetbrains.mps.openapi.model.SReference";
      }

      public String getAdditionalInfo() {
        return "Pull up and remove all methods from jetbrains.mps.smodel.SReference to org.jetbrains.mps.openapi.model.SReference";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.baseLanguage.structure.IMethodCall";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        SReference reference = SNodeOperations.getReference(node, SLinkOperations.findLinkDeclaration("jetbrains.mps.baseLanguage.structure.IMethodCall", "baseMethodDeclaration"));
        if (reference == null || jetbrains.mps.util.SNodeOperations.getTargetNodeSilently(reference) != null) {
          return false;
        }

        if (!(PersistenceFacade.getInstance().createModelReference("f:java_stub#6ed54515-acc8-4d1e-a16c-9fd6cfe951ea#jetbrains.mps.smodel(MPS.Core/jetbrains.mps.smodel@java_stub)").equals(reference.getTargetSModelReference()))) {
          return false;
        }

        SNodeId targetNodeId = reference.getTargetNodeId();
        if (jetbrains.mps.smodel.SNodeId.fromString("~SReference.getRole():java.lang.String").equals(targetNodeId)) {
          return true;
        }
        if (jetbrains.mps.smodel.SNodeId.fromString("~SReference.getLink():org.jetbrains.mps.openapi.language.SReferenceLink").equals(targetNodeId)) {
          return true;
        }
        if (jetbrains.mps.smodel.SNodeId.fromString("~SReference.getSourceNode():org.jetbrains.mps.openapi.model.SNode").equals(targetNodeId)) {
          return true;
        }
        if (jetbrains.mps.smodel.SNodeId.fromString("~SReference.getTargetNode():org.jetbrains.mps.openapi.model.SNode").equals(targetNodeId)) {
          return true;
        }
        if (jetbrains.mps.smodel.SNodeId.fromString("~SReference.getTargetNodeReference():org.jetbrains.mps.openapi.model.SNodeReference").equals(targetNodeId)) {
          return true;
        }
        if (jetbrains.mps.smodel.SNodeId.fromString("~SReference.getTargetSModelReference():org.jetbrains.mps.openapi.model.SModelReference").equals(targetNodeId)) {
          return true;
        }
        if (jetbrains.mps.smodel.SNodeId.fromString("~SReference.getTargetNodeId():org.jetbrains.mps.openapi.model.SNodeId").equals(targetNodeId)) {
          return true;
        }
        return false;
      }

      public void doUpdateInstanceNode(SNode node) {
        SReference oldReference = SNodeOperations.getReference(node, SLinkOperations.findLinkDeclaration("jetbrains.mps.baseLanguage.structure.IMethodCall", "baseMethodDeclaration"));
        SReference newReference = new StaticReference(oldReference.getRole(), node, PersistenceFacade.getInstance().createModelReference("f:java_stub#8865b7a8-5271-43d3-884c-6fd1d9cfdd34#org.jetbrains.mps.openapi.model(MPS.OpenAPI/org.jetbrains.mps.openapi.model@java_stub)"), oldReference.getTargetNodeId(), ((jetbrains.mps.smodel.SReference) oldReference).getResolveInfo());
        node.setReference(oldReference.getRole(), null);
        node.setReference("baseMethodDeclaration", newReference);

        ((SModelInternal) node.getModel()).addModelImport(PersistenceFacade.getInstance().createModelReference("f:java_stub#8865b7a8-5271-43d3-884c-6fd1d9cfdd34#org.jetbrains.mps.openapi.model(MPS.OpenAPI/org.jetbrains.mps.openapi.model@java_stub)"), false);
        ((AbstractModule) node.getModel().getModule()).addDependency(PersistenceFacade.getInstance().createModuleReference("8865b7a8-5271-43d3-884c-6fd1d9cfdd34(MPS.OpenAPI)"), false);
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
    // whitespace 
  }
}
