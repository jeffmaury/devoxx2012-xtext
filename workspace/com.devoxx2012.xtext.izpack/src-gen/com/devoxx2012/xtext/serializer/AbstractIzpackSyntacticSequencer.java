package com.devoxx2012.xtext.serializer;

import com.devoxx2012.xtext.services.IzpackGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("restriction")
public class AbstractIzpackSyntacticSequencer extends AbstractSyntacticSequencer {

	protected IzpackGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Installer_ByKeyword_2_0_q;
	protected AbstractElementAlias match_Installer___UninstallKeyword_4_0_NoKeyword_4_1_0__q;
	protected AbstractElementAlias match_Packaging_OptionsKeyword_2_0_q;
	protected AbstractElementAlias match_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (IzpackGrammarAccess) access;
		match_Installer_ByKeyword_2_0_q = new TokenAlias(false, true, grammarAccess.getInstallerAccess().getByKeyword_2_0());
		match_Installer___UninstallKeyword_4_0_NoKeyword_4_1_0__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getInstallerAccess().getUninstallKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getInstallerAccess().getNoKeyword_4_1_0()));
		match_Packaging_OptionsKeyword_2_0_q = new TokenAlias(false, true, grammarAccess.getPackagingAccess().getOptionsKeyword_2_0());
		match_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Installer_ByKeyword_2_0_q.equals(syntax))
				emit_Installer_ByKeyword_2_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Installer___UninstallKeyword_4_0_NoKeyword_4_1_0__q.equals(syntax))
				emit_Installer___UninstallKeyword_4_0_NoKeyword_4_1_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Packaging_OptionsKeyword_2_0_q.equals(syntax))
				emit_Packaging_OptionsKeyword_2_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q.equals(syntax))
				emit_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'by'?
	 */
	protected void emit_Installer_ByKeyword_2_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('uninstall' 'no')?
	 */
	protected void emit_Installer___UninstallKeyword_4_0_NoKeyword_4_1_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'options'?
	 */
	protected void emit_Packaging_OptionsKeyword_2_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' ')')?
	 */
	protected void emit_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
