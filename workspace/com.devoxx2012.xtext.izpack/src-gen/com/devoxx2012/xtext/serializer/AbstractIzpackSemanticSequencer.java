package com.devoxx2012.xtext.serializer;

import com.devoxx2012.xtext.izpack.Author;
import com.devoxx2012.xtext.izpack.Constraint;
import com.devoxx2012.xtext.izpack.File;
import com.devoxx2012.xtext.izpack.Identification;
import com.devoxx2012.xtext.izpack.Installer;
import com.devoxx2012.xtext.izpack.IzpackPackage;
import com.devoxx2012.xtext.izpack.Locale;
import com.devoxx2012.xtext.izpack.Option;
import com.devoxx2012.xtext.izpack.Pack;
import com.devoxx2012.xtext.izpack.Packaging;
import com.devoxx2012.xtext.izpack.Panel;
import com.devoxx2012.xtext.izpack.Uninstall;
import com.devoxx2012.xtext.izpack.Variable;
import com.devoxx2012.xtext.services.IzpackGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmGenericArrayTypeReference;
import org.eclipse.xtext.common.types.JvmLowerBound;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmUpperBound;
import org.eclipse.xtext.common.types.JvmWildcardTypeReference;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.eclipse.xtext.xbase.serializer.XtypeSemanticSequencer;
import org.eclipse.xtext.xtype.XFunctionTypeRef;
import org.eclipse.xtext.xtype.XtypePackage;

@SuppressWarnings("restriction")
public class AbstractIzpackSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected IzpackGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	@Inject
	protected Provider<XtypeSemanticSequencer> superSequencerProvider;
	 
	protected XtypeSemanticSequencer superSequencer; 
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.superSequencer = superSequencerProvider.get();
		this.superSequencer.init(sequencer, sequenceAcceptor, errorAcceptor); 
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == IzpackPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case IzpackPackage.AUTHOR:
				if(context == grammarAccess.getAuthorRule()) {
					sequence_Author(context, (Author) semanticObject); 
					return; 
				}
				else break;
			case IzpackPackage.CONSTRAINT:
				if(context == grammarAccess.getConstraintRule()) {
					sequence_Constraint(context, (Constraint) semanticObject); 
					return; 
				}
				else break;
			case IzpackPackage.FILE:
				if(context == grammarAccess.getFileRule()) {
					sequence_File(context, (File) semanticObject); 
					return; 
				}
				else break;
			case IzpackPackage.IDENTIFICATION:
				if(context == grammarAccess.getIdentificationRule()) {
					sequence_Identification(context, (Identification) semanticObject); 
					return; 
				}
				else break;
			case IzpackPackage.INSTALLER:
				if(context == grammarAccess.getInstallerRule()) {
					sequence_Installer(context, (Installer) semanticObject); 
					return; 
				}
				else break;
			case IzpackPackage.LOCALE:
				if(context == grammarAccess.getLocaleRule()) {
					sequence_Locale(context, (Locale) semanticObject); 
					return; 
				}
				else break;
			case IzpackPackage.OPTION:
				if(context == grammarAccess.getOptionRule()) {
					sequence_Option(context, (Option) semanticObject); 
					return; 
				}
				else break;
			case IzpackPackage.PACK:
				if(context == grammarAccess.getPackRule()) {
					sequence_Pack(context, (Pack) semanticObject); 
					return; 
				}
				else break;
			case IzpackPackage.PACKAGING:
				if(context == grammarAccess.getPackagingRule()) {
					sequence_Packaging(context, (Packaging) semanticObject); 
					return; 
				}
				else break;
			case IzpackPackage.PANEL:
				if(context == grammarAccess.getPanelRule()) {
					sequence_Panel(context, (Panel) semanticObject); 
					return; 
				}
				else break;
			case IzpackPackage.UNINSTALL:
				if(context == grammarAccess.getUninstallRule()) {
					sequence_Uninstall(context, (Uninstall) semanticObject); 
					return; 
				}
				else break;
			case IzpackPackage.VARIABLE:
				if(context == grammarAccess.getVariableRule()) {
					sequence_Variable(context, (Variable) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == TypesPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case TypesPackage.JVM_GENERIC_ARRAY_TYPE_REFERENCE:
				if(context == grammarAccess.getJvmArgumentTypeReferenceRule() ||
				   context == grammarAccess.getJvmTypeReferenceRule() ||
				   context == grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0()) {
					sequence_JvmTypeReference(context, (JvmGenericArrayTypeReference) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_LOWER_BOUND:
				if(context == grammarAccess.getJvmLowerBoundRule()) {
					sequence_JvmLowerBound(context, (JvmLowerBound) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_PARAMETERIZED_TYPE_REFERENCE:
				if(context == grammarAccess.getJvmArgumentTypeReferenceRule() ||
				   context == grammarAccess.getJvmParameterizedTypeReferenceRule() ||
				   context == grammarAccess.getJvmTypeReferenceRule() ||
				   context == grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0()) {
					sequence_JvmParameterizedTypeReference(context, (JvmParameterizedTypeReference) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_TYPE_PARAMETER:
				if(context == grammarAccess.getJvmTypeParameterRule()) {
					sequence_JvmTypeParameter(context, (JvmTypeParameter) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_UPPER_BOUND:
				if(context == grammarAccess.getJvmUpperBoundAndedRule()) {
					sequence_JvmUpperBoundAnded(context, (JvmUpperBound) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getJvmUpperBoundRule()) {
					sequence_JvmUpperBound(context, (JvmUpperBound) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_WILDCARD_TYPE_REFERENCE:
				if(context == grammarAccess.getJvmArgumentTypeReferenceRule() ||
				   context == grammarAccess.getJvmWildcardTypeReferenceRule()) {
					sequence_JvmWildcardTypeReference(context, (JvmWildcardTypeReference) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == XtypePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case XtypePackage.XFUNCTION_TYPE_REF:
				if(context == grammarAccess.getJvmArgumentTypeReferenceRule() ||
				   context == grammarAccess.getJvmTypeReferenceRule() ||
				   context == grammarAccess.getXFunctionTypeRefRule()) {
					sequence_XFunctionTypeRef(context, (XFunctionTypeRef) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=STRING email=STRING)
	 */
	protected void sequence_Author(EObject context, Author semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, IzpackPackage.Literals.AUTHOR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IzpackPackage.Literals.AUTHOR__NAME));
			if(transientValues.isValueTransient(semanticObject, IzpackPackage.Literals.AUTHOR__EMAIL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IzpackPackage.Literals.AUTHOR__EMAIL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAuthorAccess().getNameSTRINGTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAuthorAccess().getEmailSTRINGTerminalRuleCall_1_0(), semanticObject.getEmail());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (javaversion=STRING requiredJdk?='with jdk'? packed?='packed'?)
	 */
	protected void sequence_Constraint(EObject context, Constraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (path=STRING alias=STRING? destination=STRING override=OverrideFlag? os=OS?)
	 */
	protected void sequence_File(EObject context, File semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING version=STRING url=STRING? webdir=STRING?)
	 */
	protected void sequence_Identification(EObject context, Identification semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         identification=Identification 
	 *         authors+=Author* 
	 *         constraint=Constraint? 
	 *         uninstall=Uninstall? 
	 *         (summarylog=STRING installation?='write installation info'?)? 
	 *         packaging=Packaging? 
	 *         variables+=Variable* 
	 *         packs+=Pack+ 
	 *         locale=Locale 
	 *         panels+=Panel+
	 *     )
	 */
	protected void sequence_Installer(EObject context, Installer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     typeReference=JvmTypeReference
	 */
	protected void sequence_JvmLowerBound(EObject context, JvmLowerBound semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=[JvmType|QualifiedName] (arguments+=JvmArgumentTypeReference arguments+=JvmArgumentTypeReference*)?)
	 */
	protected void sequence_JvmParameterizedTypeReference(EObject context, JvmParameterizedTypeReference semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ValidID ((constraints+=JvmUpperBound constraints+=JvmUpperBoundAnded*) | constraints+=JvmLowerBound)?)
	 */
	protected void sequence_JvmTypeParameter(EObject context, JvmTypeParameter semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     componentType=JvmTypeReference_JvmGenericArrayTypeReference_0_1_0_0
	 */
	protected void sequence_JvmTypeReference(EObject context, JvmGenericArrayTypeReference semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     typeReference=JvmTypeReference
	 */
	protected void sequence_JvmUpperBoundAnded(EObject context, JvmUpperBound semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     typeReference=JvmTypeReference
	 */
	protected void sequence_JvmUpperBound(EObject context, JvmUpperBound semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((constraints+=JvmUpperBound | constraints+=JvmLowerBound)?)
	 */
	protected void sequence_JvmWildcardTypeReference(EObject context, JvmWildcardTypeReference semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     isocodes+=ISO3Code+
	 */
	protected void sequence_Locale(EObject context, Locale semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING value=STRING)
	 */
	protected void sequence_Option(EObject context, Option semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, IzpackPackage.Literals.OPTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IzpackPackage.Literals.OPTION__NAME));
			if(transientValues.isValueTransient(semanticObject, IzpackPackage.Literals.OPTION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IzpackPackage.Literals.OPTION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOptionAccess().getNameSTRINGTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getOptionAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         label=STRING 
	 *         optional?='optional'? 
	 *         loose?='loose'? 
	 *         keep?='keep'? 
	 *         parent=[Pack|ID]? 
	 *         files+=File* 
	 *         os=OS?
	 *     )
	 */
	protected void sequence_Pack(EObject context, Pack semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (class=JvmTypeReference options+=Option*)
	 */
	protected void sequence_Packaging(EObject context, Packaging semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID classname=JvmTypeReference jar=STRING)
	 */
	protected void sequence_Panel(EObject context, Panel semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, IzpackPackage.Literals.PANEL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IzpackPackage.Literals.PANEL__NAME));
			if(transientValues.isValueTransient(semanticObject, IzpackPackage.Literals.PANEL__CLASSNAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IzpackPackage.Literals.PANEL__CLASSNAME));
			if(transientValues.isValueTransient(semanticObject, IzpackPackage.Literals.PANEL__JAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IzpackPackage.Literals.PANEL__JAR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPanelAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPanelAccess().getClassnameJvmTypeReferenceParserRuleCall_1_0(), semanticObject.getClassname());
		feeder.accept(grammarAccess.getPanelAccess().getJarSTRINGTerminalRuleCall_2_0(), semanticObject.getJar());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING? path=STRING?)
	 */
	protected void sequence_Uninstall(EObject context, Uninstall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (isDynamic?='var'? name=ID value=STRING)
	 */
	protected void sequence_Variable(EObject context, Variable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((paramTypes+=JvmTypeReference paramTypes+=JvmTypeReference*)? returnType=JvmTypeReference)
	 */
	protected void sequence_XFunctionTypeRef(EObject context, XFunctionTypeRef semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
}
