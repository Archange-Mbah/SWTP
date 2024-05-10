/*
 * generated by Xtext 2.32.0
 */
grammar InternalArduino;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.ArduinoGrammarAccess;

}

@parser::members {

 	private ArduinoGrammarAccess grammarAccess;

    public InternalArduinoParser(TokenStream input, ArduinoGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected ArduinoGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getComponentsComponentsParserRuleCall_0_0());
				}
				lv_components_0_0=rulecomponents
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"components",
						lv_components_0_0,
						"org.xtext.example.mydsl.Arduino.components");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getConnectionConnectionParserRuleCall_1_0());
				}
				lv_connection_1_0=ruleconnection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"connection",
						lv_connection_1_0,
						"org.xtext.example.mydsl.Arduino.connection");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getBehaviorBehaviorParserRuleCall_2_0());
				}
				lv_behavior_2_0=rulebehavior
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"behavior",
						lv_behavior_2_0,
						"org.xtext.example.mydsl.Arduino.behavior");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRulecomponents
entryRulecomponents returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComponentsRule()); }
	iv_rulecomponents=rulecomponents
	{ $current=$iv_rulecomponents.current; }
	EOF;

// Rule components
rulecomponents returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='component'
		{
			newLeafNode(otherlv_0, grammarAccess.getComponentsAccess().getComponentKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getComponentsAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getComponentsRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getComponentsAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='type'
		{
			newLeafNode(otherlv_3, grammarAccess.getComponentsAccess().getTypeKeyword_3());
		}
		otherlv_4='='
		{
			newLeafNode(otherlv_4, grammarAccess.getComponentsAccess().getEqualsSignKeyword_4());
		}
		otherlv_5='{'
		{
			newLeafNode(otherlv_5, grammarAccess.getComponentsAccess().getLeftCurlyBracketKeyword_5());
		}
		{
			newCompositeNode(grammarAccess.getComponentsAccess().getTypeParserRuleCall_6());
		}
		ruletype
		{
			afterParserOrEnumRuleCall();
		}
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getComponentsAccess().getRightCurlyBracketKeyword_7());
		}
		otherlv_8=','
		{
			newLeafNode(otherlv_8, grammarAccess.getComponentsAccess().getCommaKeyword_8());
		}
		otherlv_9='connectors'
		{
			newLeafNode(otherlv_9, grammarAccess.getComponentsAccess().getConnectorsKeyword_9());
		}
		otherlv_10='='
		{
			newLeafNode(otherlv_10, grammarAccess.getComponentsAccess().getEqualsSignKeyword_10());
		}
		otherlv_11='['
		{
			newLeafNode(otherlv_11, grammarAccess.getComponentsAccess().getLeftSquareBracketKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getComponentsAccess().getConnectorsConnectorsParserRuleCall_12_0());
				}
				lv_connectors_12_0=ruleconnectors
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComponentsRule());
					}
					add(
						$current,
						"connectors",
						lv_connectors_12_0,
						"org.xtext.example.mydsl.Arduino.connectors");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_13=']'
		{
			newLeafNode(otherlv_13, grammarAccess.getComponentsAccess().getRightSquareBracketKeyword_13());
		}
		(
			otherlv_14='states'
			{
				newLeafNode(otherlv_14, grammarAccess.getComponentsAccess().getStatesKeyword_14_0());
			}
			otherlv_15='='
			{
				newLeafNode(otherlv_15, grammarAccess.getComponentsAccess().getEqualsSignKeyword_14_1());
			}
			otherlv_16='['
			{
				newLeafNode(otherlv_16, grammarAccess.getComponentsAccess().getLeftSquareBracketKeyword_14_2());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getComponentsAccess().getComponent_stateComponent_stateParserRuleCall_14_3_0());
					}
					lv_component_state_17_0=rulecomponent_state
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getComponentsRule());
						}
						add(
							$current,
							"component_state",
							lv_component_state_17_0,
							"org.xtext.example.mydsl.Arduino.component_state");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			otherlv_18=']'
			{
				newLeafNode(otherlv_18, grammarAccess.getComponentsAccess().getRightSquareBracketKeyword_14_4());
			}
		)*
		otherlv_19='}'
		{
			newLeafNode(otherlv_19, grammarAccess.getComponentsAccess().getRightCurlyBracketKeyword_15());
		}
	)
;

// Entry rule entryRuletype
entryRuletype returns [String current=null]:
	{ newCompositeNode(grammarAccess.getTypeRule()); }
	iv_ruletype=ruletype
	{ $current=$iv_ruletype.current.getText(); }
	EOF;

// Rule type
ruletype returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='actor'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTypeAccess().getActorKeyword_0());
		}
		    |
		kw='sensor'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTypeAccess().getSensorKeyword_1());
		}
		    |
		kw='microcontroller'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTypeAccess().getMicrocontrollerKeyword_2());
		}
	)
;

// Entry rule entryRuleconnectors
entryRuleconnectors returns [String current=null]:
	{ newCompositeNode(grammarAccess.getConnectorsRule()); }
	iv_ruleconnectors=ruleconnectors
	{ $current=$iv_ruleconnectors.current.getText(); }
	EOF;

// Rule connectors
ruleconnectors returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='GND'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getConnectorsAccess().getGNDKeyword_0());
		}
		    |
		kw='GND1'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getConnectorsAccess().getGND1Keyword_1());
		}
		    |
		kw='GND2'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getConnectorsAccess().getGND2Keyword_2());
		}
		    |
		kw='DIGITAL_IN'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getConnectorsAccess().getDIGITAL_INKeyword_3());
		}
		    |
		kw='A0'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getConnectorsAccess().getA0Keyword_4());
		}
	)
;

// Entry rule entryRulecomponent_state
entryRulecomponent_state returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComponent_stateRule()); }
	iv_rulecomponent_state=rulecomponent_state
	{ $current=$iv_rulecomponent_state.current; }
	EOF;

// Rule component_state
rulecomponent_state returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getComponent_stateAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getComponent_stateRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getComponent_stateAccess().getLeftCurlyBracketKeyword_1());
		}
		{
			newCompositeNode(grammarAccess.getComponent_stateAccess().getConnector_definitionParserRuleCall_2());
		}
		ruleconnector_definition
		{
			afterParserOrEnumRuleCall();
		}
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getComponent_stateAccess().getRightCurlyBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleconnector_definition
entryRuleconnector_definition returns [String current=null]:
	{ newCompositeNode(grammarAccess.getConnector_definitionRule()); }
	iv_ruleconnector_definition=ruleconnector_definition
	{ $current=$iv_ruleconnector_definition.current.getText(); }
	EOF;

// Rule connector_definition
ruleconnector_definition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getConnector_definitionAccess().getConnectorsParserRuleCall_0());
		}
		this_connectors_0=ruleconnectors
		{
			$current.merge(this_connectors_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		kw='='
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getConnector_definitionAccess().getEqualsSignKeyword_1());
		}
		{
			newCompositeNode(grammarAccess.getConnector_definitionAccess().getLEVELParserRuleCall_2());
		}
		this_LEVEL_2=ruleLEVEL
		{
			$current.merge(this_LEVEL_2);
		}
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleLEVEL
entryRuleLEVEL returns [String current=null]:
	{ newCompositeNode(grammarAccess.getLEVELRule()); }
	iv_ruleLEVEL=ruleLEVEL
	{ $current=$iv_ruleLEVEL.current.getText(); }
	EOF;

// Rule LEVEL
ruleLEVEL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='HIGH'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getLEVELAccess().getHIGHKeyword_0());
		}
		    |
		kw='LOW'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getLEVELAccess().getLOWKeyword_1());
		}
	)
;

// Entry rule entryRuleconnection
entryRuleconnection returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConnectionRule()); }
	iv_ruleconnection=ruleconnection
	{ $current=$iv_ruleconnection.current; }
	EOF;

// Rule connection
ruleconnection returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getConnectionAccess().getConnectionAction_0(),
					$current);
			}
		)
		otherlv_1='connection'
		{
			newLeafNode(otherlv_1, grammarAccess.getConnectionAccess().getConnectionKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getConnectionAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConnectionAccess().getComponentComponentParserRuleCall_3_0());
				}
				lv_component_3_0=rulecomponent
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConnectionRule());
					}
					add(
						$current,
						"component",
						lv_component_3_0,
						"org.xtext.example.mydsl.Arduino.component");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getConnectionAccess().getWiringWiringParserRuleCall_4_0());
				}
				lv_wiring_4_0=rulewiring
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConnectionRule());
					}
					add(
						$current,
						"wiring",
						lv_wiring_4_0,
						"org.xtext.example.mydsl.Arduino.wiring");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getConnectionAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRulecomponent
entryRulecomponent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComponentRule()); }
	iv_rulecomponent=rulecomponent
	{ $current=$iv_rulecomponent.current; }
	EOF;

// Rule component
rulecomponent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='new'
		{
			newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getNewKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getComponentRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getComponentAccess().getComponentsComponentsCrossReference_1_0());
				}
			)
		)
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getComponentRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRulewiring
entryRulewiring returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWiringRule()); }
	iv_rulewiring=rulewiring
	{ $current=$iv_rulewiring.current; }
	EOF;

// Rule wiring
rulewiring returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getWiringRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getWiringAccess().getSrcComponentCrossReference_0_0());
				}
			)
		)
		otherlv_1='.'
		{
			newLeafNode(otherlv_1, grammarAccess.getWiringAccess().getFullStopKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWiringAccess().getSrc_portConnectorsParserRuleCall_2_0());
				}
				lv_src_port_2_0=ruleconnectors
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWiringRule());
					}
					set(
						$current,
						"src_port",
						lv_src_port_2_0,
						"org.xtext.example.mydsl.Arduino.connectors");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='='
		{
			newLeafNode(otherlv_3, grammarAccess.getWiringAccess().getEqualsSignKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getWiringRule());
					}
				}
				otherlv_4=RULE_ID
				{
					newLeafNode(otherlv_4, grammarAccess.getWiringAccess().getTarComponentCrossReference_4_0());
				}
			)
		)
		otherlv_5='.'
		{
			newLeafNode(otherlv_5, grammarAccess.getWiringAccess().getFullStopKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWiringAccess().getTar_portConnectorsParserRuleCall_6_0());
				}
				lv_tar_port_6_0=ruleconnectors
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWiringRule());
					}
					set(
						$current,
						"tar_port",
						lv_tar_port_6_0,
						"org.xtext.example.mydsl.Arduino.connectors");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRulebehavior
entryRulebehavior returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBehaviorRule()); }
	iv_rulebehavior=rulebehavior
	{ $current=$iv_rulebehavior.current; }
	EOF;

// Rule behavior
rulebehavior returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getBehaviorAccess().getBehaviorAction_0(),
					$current);
			}
		)
		otherlv_1='behavior'
		{
			newLeafNode(otherlv_1, grammarAccess.getBehaviorAccess().getBehaviorKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getBehaviorAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='@startuml'
		{
			newLeafNode(otherlv_3, grammarAccess.getBehaviorAccess().getStartumlKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getBehaviorAccess().getStatesStateParserRuleCall_4_0());
				}
				lv_states_4_0=rulestate
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBehaviorRule());
					}
					add(
						$current,
						"states",
						lv_states_4_0,
						"org.xtext.example.mydsl.Arduino.state");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getBehaviorAccess().getTransitionsTransitionParserRuleCall_5_0());
				}
				lv_transitions_5_0=ruletransition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBehaviorRule());
					}
					add(
						$current,
						"transitions",
						lv_transitions_5_0,
						"org.xtext.example.mydsl.Arduino.transition");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_6='@enduml'
		{
			newLeafNode(otherlv_6, grammarAccess.getBehaviorAccess().getEndumlKeyword_6());
		}
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getBehaviorAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuletransition
entryRuletransition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTransitionRule()); }
	iv_ruletransition=ruletransition
	{ $current=$iv_ruletransition.current; }
	EOF;

// Rule transition
ruletransition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='[*]'
			{
				newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getLeftSquareBracketAsteriskRightSquareBracketKeyword_0_0());
			}
			    |
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTransitionRule());
						}
					}
					otherlv_1=RULE_ID
					{
						newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getSrc_stateStateCrossReference_0_1_0());
					}
				)
			)
		)
		otherlv_2='-->'
		{
			newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransitionRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getTar_stateStateCrossReference_2_0());
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getTransitionAccess().getTransition_effectTransition_effectParserRuleCall_3_0());
				}
				lv_transition_effect_4_0=ruletransition_effect
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTransitionRule());
					}
					set(
						$current,
						"transition_effect",
						lv_transition_effect_4_0,
						"org.xtext.example.mydsl.Arduino.transition_effect");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuletransition_effect
entryRuletransition_effect returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTransition_effectRule()); }
	iv_ruletransition_effect=ruletransition_effect
	{ $current=$iv_ruletransition_effect.current; }
	EOF;

// Rule transition_effect
ruletransition_effect returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=':'
		{
			newLeafNode(otherlv_0, grammarAccess.getTransition_effectAccess().getColonKeyword_0());
		}
		otherlv_1='delay'
		{
			newLeafNode(otherlv_1, grammarAccess.getTransition_effectAccess().getDelayKeyword_1());
		}
		otherlv_2='['
		{
			newLeafNode(otherlv_2, grammarAccess.getTransition_effectAccess().getLeftSquareBracketKeyword_2());
		}
		(
			(
				lv_microseconds_3_0=RULE_INT
				{
					newLeafNode(lv_microseconds_3_0, grammarAccess.getTransition_effectAccess().getMicrosecondsINTTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransition_effectRule());
					}
					setWithLastConsumed(
						$current,
						"microseconds",
						lv_microseconds_3_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_4=']'
		{
			newLeafNode(otherlv_4, grammarAccess.getTransition_effectAccess().getRightSquareBracketKeyword_4());
		}
	)
;

// Entry rule entryRulestate
entryRulestate returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStateRule()); }
	iv_rulestate=rulestate
	{ $current=$iv_rulestate.current; }
	EOF;

// Rule state
rulestate returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStateRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getStateAccess().getColonKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStateRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getStateAccess().getComponentComponentCrossReference_2_0());
				}
			)
		)
		otherlv_3='.state'
		{
			newLeafNode(otherlv_3, grammarAccess.getStateAccess().getStateKeyword_3());
		}
		otherlv_4='='
		{
			newLeafNode(otherlv_4, grammarAccess.getStateAccess().getEqualsSignKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStateRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getStateAccess().getComponent_stateComponent_stateCrossReference_5_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleFQN
entryRuleFQN returns [String current=null]:
	{ newCompositeNode(grammarAccess.getFQNRule()); }
	iv_ruleFQN=ruleFQN
	{ $current=$iv_ruleFQN.current.getText(); }
	EOF;

// Rule FQN
ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
		}
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
			}
		)*
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
