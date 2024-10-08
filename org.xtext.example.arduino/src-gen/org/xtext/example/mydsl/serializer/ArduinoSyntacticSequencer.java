/*
 * generated by Xtext 2.32.0
 */
package org.xtext.example.mydsl.serializer;

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
import org.xtext.example.mydsl.services.ArduinoGrammarAccess;

@SuppressWarnings("all")
public class ArduinoSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ArduinoGrammarAccess grammarAccess;
	protected AbstractElementAlias match_components___RightSquareBracketKeyword_15_4_StatesKeyword_15_0_EqualsSignKeyword_15_1_LeftSquareBracketKeyword_15_2__a;
	protected AbstractElementAlias match_components___StatesKeyword_15_0_EqualsSignKeyword_15_1_LeftSquareBracketKeyword_15_2_RightSquareBracketKeyword_15_4__a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ArduinoGrammarAccess) access;
		match_components___RightSquareBracketKeyword_15_4_StatesKeyword_15_0_EqualsSignKeyword_15_1_LeftSquareBracketKeyword_15_2__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getComponentsAccess().getRightSquareBracketKeyword_15_4()), new TokenAlias(false, false, grammarAccess.getComponentsAccess().getStatesKeyword_15_0()), new TokenAlias(false, false, grammarAccess.getComponentsAccess().getEqualsSignKeyword_15_1()), new TokenAlias(false, false, grammarAccess.getComponentsAccess().getLeftSquareBracketKeyword_15_2()));
		match_components___StatesKeyword_15_0_EqualsSignKeyword_15_1_LeftSquareBracketKeyword_15_2_RightSquareBracketKeyword_15_4__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getComponentsAccess().getStatesKeyword_15_0()), new TokenAlias(false, false, grammarAccess.getComponentsAccess().getEqualsSignKeyword_15_1()), new TokenAlias(false, false, grammarAccess.getComponentsAccess().getLeftSquareBracketKeyword_15_2()), new TokenAlias(false, false, grammarAccess.getComponentsAccess().getRightSquareBracketKeyword_15_4()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getConnector_definitionRule())
			return getconnector_definitionToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getTypeRule())
			return gettypeToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * connector_definition: connectors '=' LEVEL;
	 */
	protected String getconnector_definitionToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "GND = HIGH";
	}
	
	/**
	 * type: 'actor' | 'sensor' | 'microcontroller';
	 */
	protected String gettypeToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "actor";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_components___RightSquareBracketKeyword_15_4_StatesKeyword_15_0_EqualsSignKeyword_15_1_LeftSquareBracketKeyword_15_2__a.equals(syntax))
				emit_components___RightSquareBracketKeyword_15_4_StatesKeyword_15_0_EqualsSignKeyword_15_1_LeftSquareBracketKeyword_15_2__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_components___StatesKeyword_15_0_EqualsSignKeyword_15_1_LeftSquareBracketKeyword_15_2_RightSquareBracketKeyword_15_4__a.equals(syntax))
				emit_components___StatesKeyword_15_0_EqualsSignKeyword_15_1_LeftSquareBracketKeyword_15_2_RightSquareBracketKeyword_15_4__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     (']' 'states' '=' '[')*
	 *
	 * This ambiguous syntax occurs at:
	 *     component_state+=component_state (ambiguity) component_state+=component_state
	 *     connectors+=connectors ']' ',' 'states' '=' '[' (ambiguity) component_state+=component_state
	 *     name=ID '{' 'type' '=' '{' type '}' ',' 'connectors' '=' '[' ']' ',' 'states' '=' '[' (ambiguity) component_state+=component_state
	 
	 * </pre>
	 */
	protected void emit_components___RightSquareBracketKeyword_15_4_StatesKeyword_15_0_EqualsSignKeyword_15_1_LeftSquareBracketKeyword_15_2__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('states' '=' '[' ']')*
	 *
	 * This ambiguous syntax occurs at:
	 *     component_state+=component_state ']' (ambiguity) '}' (rule end)
	 *     connectors+=connectors ']' ',' (ambiguity) '}' (rule end)
	 *     name=ID '{' 'type' '=' '{' type '}' ',' 'connectors' '=' '[' ']' ',' (ambiguity) '}' (rule end)
	 
	 * </pre>
	 */
	protected void emit_components___StatesKeyword_15_0_EqualsSignKeyword_15_1_LeftSquareBracketKeyword_15_2_RightSquareBracketKeyword_15_4__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
