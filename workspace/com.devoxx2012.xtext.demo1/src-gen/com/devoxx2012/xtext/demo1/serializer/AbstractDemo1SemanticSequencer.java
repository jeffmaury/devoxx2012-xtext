package com.devoxx2012.xtext.demo1.serializer;

import com.devoxx2012.xtext.demo1.demo1.Category;
import com.devoxx2012.xtext.demo1.demo1.Demo1Package;
import com.devoxx2012.xtext.demo1.demo1.Model;
import com.devoxx2012.xtext.demo1.demo1.RatioExpression;
import com.devoxx2012.xtext.demo1.demo1.Rule;
import com.devoxx2012.xtext.demo1.demo1.RuleExpression;
import com.devoxx2012.xtext.demo1.demo1.TestExpression;
import com.devoxx2012.xtext.demo1.services.Demo1GrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
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

@SuppressWarnings("restriction")
public class AbstractDemo1SemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected Demo1GrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == Demo1Package.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case Demo1Package.CATEGORY:
				if(context == grammarAccess.getCategoryRule()) {
					sequence_Category(context, (Category) semanticObject); 
					return; 
				}
				else break;
			case Demo1Package.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case Demo1Package.RATIO_EXPRESSION:
				if(context == grammarAccess.getRatioExpressionRule()) {
					sequence_RatioExpression(context, (RatioExpression) semanticObject); 
					return; 
				}
				else break;
			case Demo1Package.RULE:
				if(context == grammarAccess.getRuleRule()) {
					sequence_Rule(context, (Rule) semanticObject); 
					return; 
				}
				else break;
			case Demo1Package.RULE_EXPRESSION:
				if(context == grammarAccess.getRuleExpressionRule()) {
					sequence_RuleExpression(context, (RuleExpression) semanticObject); 
					return; 
				}
				else break;
			case Demo1Package.TEST_EXPRESSION:
				if(context == grammarAccess.getTestExpressionRule()) {
					sequence_TestExpression(context, (TestExpression) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Category(EObject context, Category semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Demo1Package.Literals.CATEGORY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Demo1Package.Literals.CATEGORY__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCategoryAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (categories+=Category+ rule=Rule)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ratio=INT
	 */
	protected void sequence_RatioExpression(EObject context, RatioExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Demo1Package.Literals.RATIO_EXPRESSION__RATIO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Demo1Package.Literals.RATIO_EXPRESSION__RATIO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRatioExpressionAccess().getRatioINTTerminalRuleCall_2_0(), semanticObject.getRatio());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (test=TestExpression ratio=RatioExpression)
	 */
	protected void sequence_RuleExpression(EObject context, RuleExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Demo1Package.Literals.RULE_EXPRESSION__TEST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Demo1Package.Literals.RULE_EXPRESSION__TEST));
			if(transientValues.isValueTransient(semanticObject, Demo1Package.Literals.RULE_EXPRESSION__RATIO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Demo1Package.Literals.RULE_EXPRESSION__RATIO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRuleExpressionAccess().getTestTestExpressionParserRuleCall_1_0(), semanticObject.getTest());
		feeder.accept(grammarAccess.getRuleExpressionAccess().getRatioRatioExpressionParserRuleCall_3_0(), semanticObject.getRatio());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (first=RuleExpression (next=Rule | next=RatioExpression)?)
	 */
	protected void sequence_Rule(EObject context, Rule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     category=[Category|ID]
	 */
	protected void sequence_TestExpression(EObject context, TestExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Demo1Package.Literals.TEST_EXPRESSION__CATEGORY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Demo1Package.Literals.TEST_EXPRESSION__CATEGORY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTestExpressionAccess().getCategoryCategoryIDTerminalRuleCall_2_0_1(), semanticObject.getCategory());
		feeder.finish();
	}
}
