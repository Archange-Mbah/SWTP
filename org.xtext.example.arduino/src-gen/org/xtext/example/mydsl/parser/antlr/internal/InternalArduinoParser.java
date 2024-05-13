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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalArduinoParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'component'", "'{'", "'type'", "'='", "'}'", "','", "'connectors'", "'['", "']'", "'states'", "'actor'", "'sensor'", "'microcontroller'", "'GND'", "'GND1'", "'GND2'", "'DIGITAL_IN'", "'A0'", "'ANALOG_IN'", "'ANALOG_X'", "'ANALOG_Y'", "'DIGITAL_BUTTON'", "'HIGH'", "'LOW'", "'connection'", "'new'", "'.'", "'behavior'", "'@startuml'", "'@enduml'", "'[*]'", "'-->'", "':'", "'delay'", "'.state'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalArduinoParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalArduinoParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalArduinoParser.tokenNames; }
    public String getGrammarFileName() { return "InternalArduino.g"; }



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




    // $ANTLR start "entryRuleModel"
    // InternalArduino.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalArduino.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalArduino.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalArduino.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_components_0_0= rulecomponents ) )* ( (lv_connection_1_0= ruleconnection ) ) ( (lv_behavior_2_0= rulebehavior ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_components_0_0 = null;

        EObject lv_connection_1_0 = null;

        EObject lv_behavior_2_0 = null;



        	enterRule();

        try {
            // InternalArduino.g:77:2: ( ( ( (lv_components_0_0= rulecomponents ) )* ( (lv_connection_1_0= ruleconnection ) ) ( (lv_behavior_2_0= rulebehavior ) ) ) )
            // InternalArduino.g:78:2: ( ( (lv_components_0_0= rulecomponents ) )* ( (lv_connection_1_0= ruleconnection ) ) ( (lv_behavior_2_0= rulebehavior ) ) )
            {
            // InternalArduino.g:78:2: ( ( (lv_components_0_0= rulecomponents ) )* ( (lv_connection_1_0= ruleconnection ) ) ( (lv_behavior_2_0= rulebehavior ) ) )
            // InternalArduino.g:79:3: ( (lv_components_0_0= rulecomponents ) )* ( (lv_connection_1_0= ruleconnection ) ) ( (lv_behavior_2_0= rulebehavior ) )
            {
            // InternalArduino.g:79:3: ( (lv_components_0_0= rulecomponents ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalArduino.g:80:4: (lv_components_0_0= rulecomponents )
            	    {
            	    // InternalArduino.g:80:4: (lv_components_0_0= rulecomponents )
            	    // InternalArduino.g:81:5: lv_components_0_0= rulecomponents
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getComponentsComponentsParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_components_0_0=rulecomponents();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"components",
            	    						lv_components_0_0,
            	    						"org.xtext.example.mydsl.Arduino.components");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalArduino.g:98:3: ( (lv_connection_1_0= ruleconnection ) )
            // InternalArduino.g:99:4: (lv_connection_1_0= ruleconnection )
            {
            // InternalArduino.g:99:4: (lv_connection_1_0= ruleconnection )
            // InternalArduino.g:100:5: lv_connection_1_0= ruleconnection
            {

            					newCompositeNode(grammarAccess.getModelAccess().getConnectionConnectionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_connection_1_0=ruleconnection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"connection",
            						lv_connection_1_0,
            						"org.xtext.example.mydsl.Arduino.connection");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalArduino.g:117:3: ( (lv_behavior_2_0= rulebehavior ) )
            // InternalArduino.g:118:4: (lv_behavior_2_0= rulebehavior )
            {
            // InternalArduino.g:118:4: (lv_behavior_2_0= rulebehavior )
            // InternalArduino.g:119:5: lv_behavior_2_0= rulebehavior
            {

            					newCompositeNode(grammarAccess.getModelAccess().getBehaviorBehaviorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_behavior_2_0=rulebehavior();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"behavior",
            						lv_behavior_2_0,
            						"org.xtext.example.mydsl.Arduino.behavior");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulecomponents"
    // InternalArduino.g:140:1: entryRulecomponents returns [EObject current=null] : iv_rulecomponents= rulecomponents EOF ;
    public final EObject entryRulecomponents() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecomponents = null;


        try {
            // InternalArduino.g:140:51: (iv_rulecomponents= rulecomponents EOF )
            // InternalArduino.g:141:2: iv_rulecomponents= rulecomponents EOF
            {
             newCompositeNode(grammarAccess.getComponentsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecomponents=rulecomponents();

            state._fsp--;

             current =iv_rulecomponents; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecomponents"


    // $ANTLR start "rulecomponents"
    // InternalArduino.g:147:1: rulecomponents returns [EObject current=null] : (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' otherlv_4= '=' otherlv_5= '{' ruletype otherlv_7= '}' otherlv_8= ',' otherlv_9= 'connectors' otherlv_10= '=' otherlv_11= '[' ( (lv_connectors_12_0= ruleconnectors ) )* otherlv_13= ']' otherlv_14= ',' (otherlv_15= 'states' otherlv_16= '=' otherlv_17= '[' ( (lv_component_state_18_0= rulecomponent_state ) )* otherlv_19= ']' )* otherlv_20= '}' ) ;
    public final EObject rulecomponents() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_connectors_12_0 = null;

        EObject lv_component_state_18_0 = null;



        	enterRule();

        try {
            // InternalArduino.g:153:2: ( (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' otherlv_4= '=' otherlv_5= '{' ruletype otherlv_7= '}' otherlv_8= ',' otherlv_9= 'connectors' otherlv_10= '=' otherlv_11= '[' ( (lv_connectors_12_0= ruleconnectors ) )* otherlv_13= ']' otherlv_14= ',' (otherlv_15= 'states' otherlv_16= '=' otherlv_17= '[' ( (lv_component_state_18_0= rulecomponent_state ) )* otherlv_19= ']' )* otherlv_20= '}' ) )
            // InternalArduino.g:154:2: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' otherlv_4= '=' otherlv_5= '{' ruletype otherlv_7= '}' otherlv_8= ',' otherlv_9= 'connectors' otherlv_10= '=' otherlv_11= '[' ( (lv_connectors_12_0= ruleconnectors ) )* otherlv_13= ']' otherlv_14= ',' (otherlv_15= 'states' otherlv_16= '=' otherlv_17= '[' ( (lv_component_state_18_0= rulecomponent_state ) )* otherlv_19= ']' )* otherlv_20= '}' )
            {
            // InternalArduino.g:154:2: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' otherlv_4= '=' otherlv_5= '{' ruletype otherlv_7= '}' otherlv_8= ',' otherlv_9= 'connectors' otherlv_10= '=' otherlv_11= '[' ( (lv_connectors_12_0= ruleconnectors ) )* otherlv_13= ']' otherlv_14= ',' (otherlv_15= 'states' otherlv_16= '=' otherlv_17= '[' ( (lv_component_state_18_0= rulecomponent_state ) )* otherlv_19= ']' )* otherlv_20= '}' )
            // InternalArduino.g:155:3: otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' otherlv_4= '=' otherlv_5= '{' ruletype otherlv_7= '}' otherlv_8= ',' otherlv_9= 'connectors' otherlv_10= '=' otherlv_11= '[' ( (lv_connectors_12_0= ruleconnectors ) )* otherlv_13= ']' otherlv_14= ',' (otherlv_15= 'states' otherlv_16= '=' otherlv_17= '[' ( (lv_component_state_18_0= rulecomponent_state ) )* otherlv_19= ']' )* otherlv_20= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentsAccess().getComponentKeyword_0());
            		
            // InternalArduino.g:159:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalArduino.g:160:4: (lv_name_1_0= RULE_ID )
            {
            // InternalArduino.g:160:4: (lv_name_1_0= RULE_ID )
            // InternalArduino.g:161:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getComponentsAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentsAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getComponentsAccess().getTypeKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getComponentsAccess().getEqualsSignKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getComponentsAccess().getLeftCurlyBracketKeyword_5());
            		

            			newCompositeNode(grammarAccess.getComponentsAccess().getTypeParserRuleCall_6());
            		
            pushFollow(FOLLOW_10);
            ruletype();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_7=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getComponentsAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_8=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_8, grammarAccess.getComponentsAccess().getCommaKeyword_8());
            		
            otherlv_9=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getComponentsAccess().getConnectorsKeyword_9());
            		
            otherlv_10=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_10, grammarAccess.getComponentsAccess().getEqualsSignKeyword_10());
            		
            otherlv_11=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_11, grammarAccess.getComponentsAccess().getLeftSquareBracketKeyword_11());
            		
            // InternalArduino.g:220:3: ( (lv_connectors_12_0= ruleconnectors ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=24 && LA2_0<=32)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalArduino.g:221:4: (lv_connectors_12_0= ruleconnectors )
            	    {
            	    // InternalArduino.g:221:4: (lv_connectors_12_0= ruleconnectors )
            	    // InternalArduino.g:222:5: lv_connectors_12_0= ruleconnectors
            	    {

            	    					newCompositeNode(grammarAccess.getComponentsAccess().getConnectorsConnectorsParserRuleCall_12_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_connectors_12_0=ruleconnectors();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComponentsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"connectors",
            	    						lv_connectors_12_0,
            	    						"org.xtext.example.mydsl.Arduino.connectors");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_13=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_13, grammarAccess.getComponentsAccess().getRightSquareBracketKeyword_13());
            		
            otherlv_14=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_14, grammarAccess.getComponentsAccess().getCommaKeyword_14());
            		
            // InternalArduino.g:247:3: (otherlv_15= 'states' otherlv_16= '=' otherlv_17= '[' ( (lv_component_state_18_0= rulecomponent_state ) )* otherlv_19= ']' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalArduino.g:248:4: otherlv_15= 'states' otherlv_16= '=' otherlv_17= '[' ( (lv_component_state_18_0= rulecomponent_state ) )* otherlv_19= ']'
            	    {
            	    otherlv_15=(Token)match(input,20,FOLLOW_8); 

            	    				newLeafNode(otherlv_15, grammarAccess.getComponentsAccess().getStatesKeyword_15_0());
            	    			
            	    otherlv_16=(Token)match(input,14,FOLLOW_13); 

            	    				newLeafNode(otherlv_16, grammarAccess.getComponentsAccess().getEqualsSignKeyword_15_1());
            	    			
            	    otherlv_17=(Token)match(input,18,FOLLOW_16); 

            	    				newLeafNode(otherlv_17, grammarAccess.getComponentsAccess().getLeftSquareBracketKeyword_15_2());
            	    			
            	    // InternalArduino.g:260:4: ( (lv_component_state_18_0= rulecomponent_state ) )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==RULE_ID) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalArduino.g:261:5: (lv_component_state_18_0= rulecomponent_state )
            	    	    {
            	    	    // InternalArduino.g:261:5: (lv_component_state_18_0= rulecomponent_state )
            	    	    // InternalArduino.g:262:6: lv_component_state_18_0= rulecomponent_state
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getComponentsAccess().getComponent_stateComponent_stateParserRuleCall_15_3_0());
            	    	    					
            	    	    pushFollow(FOLLOW_16);
            	    	    lv_component_state_18_0=rulecomponent_state();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getComponentsRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"component_state",
            	    	    							lv_component_state_18_0,
            	    	    							"org.xtext.example.mydsl.Arduino.component_state");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop3;
            	        }
            	    } while (true);

            	    otherlv_19=(Token)match(input,19,FOLLOW_15); 

            	    				newLeafNode(otherlv_19, grammarAccess.getComponentsAccess().getRightSquareBracketKeyword_15_4());
            	    			

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_20=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getComponentsAccess().getRightCurlyBracketKeyword_16());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecomponents"


    // $ANTLR start "entryRuletype"
    // InternalArduino.g:292:1: entryRuletype returns [String current=null] : iv_ruletype= ruletype EOF ;
    public final String entryRuletype() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletype = null;


        try {
            // InternalArduino.g:292:44: (iv_ruletype= ruletype EOF )
            // InternalArduino.g:293:2: iv_ruletype= ruletype EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletype=ruletype();

            state._fsp--;

             current =iv_ruletype.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletype"


    // $ANTLR start "ruletype"
    // InternalArduino.g:299:1: ruletype returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'actor' | kw= 'sensor' | kw= 'microcontroller' ) ;
    public final AntlrDatatypeRuleToken ruletype() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalArduino.g:305:2: ( (kw= 'actor' | kw= 'sensor' | kw= 'microcontroller' ) )
            // InternalArduino.g:306:2: (kw= 'actor' | kw= 'sensor' | kw= 'microcontroller' )
            {
            // InternalArduino.g:306:2: (kw= 'actor' | kw= 'sensor' | kw= 'microcontroller' )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt5=1;
                }
                break;
            case 22:
                {
                alt5=2;
                }
                break;
            case 23:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalArduino.g:307:3: kw= 'actor'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getActorKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalArduino.g:313:3: kw= 'sensor'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getSensorKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalArduino.g:319:3: kw= 'microcontroller'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getMicrocontrollerKeyword_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletype"


    // $ANTLR start "entryRuleconnectors"
    // InternalArduino.g:328:1: entryRuleconnectors returns [String current=null] : iv_ruleconnectors= ruleconnectors EOF ;
    public final String entryRuleconnectors() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleconnectors = null;


        try {
            // InternalArduino.g:328:50: (iv_ruleconnectors= ruleconnectors EOF )
            // InternalArduino.g:329:2: iv_ruleconnectors= ruleconnectors EOF
            {
             newCompositeNode(grammarAccess.getConnectorsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleconnectors=ruleconnectors();

            state._fsp--;

             current =iv_ruleconnectors.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleconnectors"


    // $ANTLR start "ruleconnectors"
    // InternalArduino.g:335:1: ruleconnectors returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'GND' | kw= 'GND1' | kw= 'GND2' | kw= 'DIGITAL_IN' | kw= 'A0' | kw= 'ANALOG_IN' | kw= 'ANALOG_X' | kw= 'ANALOG_Y' | kw= 'DIGITAL_BUTTON' ) ;
    public final AntlrDatatypeRuleToken ruleconnectors() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalArduino.g:341:2: ( (kw= 'GND' | kw= 'GND1' | kw= 'GND2' | kw= 'DIGITAL_IN' | kw= 'A0' | kw= 'ANALOG_IN' | kw= 'ANALOG_X' | kw= 'ANALOG_Y' | kw= 'DIGITAL_BUTTON' ) )
            // InternalArduino.g:342:2: (kw= 'GND' | kw= 'GND1' | kw= 'GND2' | kw= 'DIGITAL_IN' | kw= 'A0' | kw= 'ANALOG_IN' | kw= 'ANALOG_X' | kw= 'ANALOG_Y' | kw= 'DIGITAL_BUTTON' )
            {
            // InternalArduino.g:342:2: (kw= 'GND' | kw= 'GND1' | kw= 'GND2' | kw= 'DIGITAL_IN' | kw= 'A0' | kw= 'ANALOG_IN' | kw= 'ANALOG_X' | kw= 'ANALOG_Y' | kw= 'DIGITAL_BUTTON' )
            int alt6=9;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt6=1;
                }
                break;
            case 25:
                {
                alt6=2;
                }
                break;
            case 26:
                {
                alt6=3;
                }
                break;
            case 27:
                {
                alt6=4;
                }
                break;
            case 28:
                {
                alt6=5;
                }
                break;
            case 29:
                {
                alt6=6;
                }
                break;
            case 30:
                {
                alt6=7;
                }
                break;
            case 31:
                {
                alt6=8;
                }
                break;
            case 32:
                {
                alt6=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalArduino.g:343:3: kw= 'GND'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getConnectorsAccess().getGNDKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalArduino.g:349:3: kw= 'GND1'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getConnectorsAccess().getGND1Keyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalArduino.g:355:3: kw= 'GND2'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getConnectorsAccess().getGND2Keyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalArduino.g:361:3: kw= 'DIGITAL_IN'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getConnectorsAccess().getDIGITAL_INKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalArduino.g:367:3: kw= 'A0'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getConnectorsAccess().getA0Keyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalArduino.g:373:3: kw= 'ANALOG_IN'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getConnectorsAccess().getANALOG_INKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalArduino.g:379:3: kw= 'ANALOG_X'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getConnectorsAccess().getANALOG_XKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalArduino.g:385:3: kw= 'ANALOG_Y'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getConnectorsAccess().getANALOG_YKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalArduino.g:391:3: kw= 'DIGITAL_BUTTON'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getConnectorsAccess().getDIGITAL_BUTTONKeyword_8());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconnectors"


    // $ANTLR start "entryRulecomponent_state"
    // InternalArduino.g:400:1: entryRulecomponent_state returns [EObject current=null] : iv_rulecomponent_state= rulecomponent_state EOF ;
    public final EObject entryRulecomponent_state() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecomponent_state = null;


        try {
            // InternalArduino.g:400:56: (iv_rulecomponent_state= rulecomponent_state EOF )
            // InternalArduino.g:401:2: iv_rulecomponent_state= rulecomponent_state EOF
            {
             newCompositeNode(grammarAccess.getComponent_stateRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecomponent_state=rulecomponent_state();

            state._fsp--;

             current =iv_rulecomponent_state; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecomponent_state"


    // $ANTLR start "rulecomponent_state"
    // InternalArduino.g:407:1: rulecomponent_state returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ruleconnector_definition otherlv_3= '}' ) ;
    public final EObject rulecomponent_state() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalArduino.g:413:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ruleconnector_definition otherlv_3= '}' ) )
            // InternalArduino.g:414:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ruleconnector_definition otherlv_3= '}' )
            {
            // InternalArduino.g:414:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ruleconnector_definition otherlv_3= '}' )
            // InternalArduino.g:415:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ruleconnector_definition otherlv_3= '}'
            {
            // InternalArduino.g:415:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalArduino.g:416:4: (lv_name_0_0= RULE_ID )
            {
            // InternalArduino.g:416:4: (lv_name_0_0= RULE_ID )
            // InternalArduino.g:417:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_0_0, grammarAccess.getComponent_stateAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponent_stateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getComponent_stateAccess().getLeftCurlyBracketKeyword_1());
            		

            			newCompositeNode(grammarAccess.getComponent_stateAccess().getConnector_definitionParserRuleCall_2());
            		
            pushFollow(FOLLOW_10);
            ruleconnector_definition();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getComponent_stateAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecomponent_state"


    // $ANTLR start "entryRuleconnector_definition"
    // InternalArduino.g:452:1: entryRuleconnector_definition returns [String current=null] : iv_ruleconnector_definition= ruleconnector_definition EOF ;
    public final String entryRuleconnector_definition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleconnector_definition = null;


        try {
            // InternalArduino.g:452:60: (iv_ruleconnector_definition= ruleconnector_definition EOF )
            // InternalArduino.g:453:2: iv_ruleconnector_definition= ruleconnector_definition EOF
            {
             newCompositeNode(grammarAccess.getConnector_definitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleconnector_definition=ruleconnector_definition();

            state._fsp--;

             current =iv_ruleconnector_definition.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleconnector_definition"


    // $ANTLR start "ruleconnector_definition"
    // InternalArduino.g:459:1: ruleconnector_definition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_connectors_0= ruleconnectors kw= '=' this_LEVEL_2= ruleLEVEL ) ;
    public final AntlrDatatypeRuleToken ruleconnector_definition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_connectors_0 = null;

        AntlrDatatypeRuleToken this_LEVEL_2 = null;



        	enterRule();

        try {
            // InternalArduino.g:465:2: ( (this_connectors_0= ruleconnectors kw= '=' this_LEVEL_2= ruleLEVEL ) )
            // InternalArduino.g:466:2: (this_connectors_0= ruleconnectors kw= '=' this_LEVEL_2= ruleLEVEL )
            {
            // InternalArduino.g:466:2: (this_connectors_0= ruleconnectors kw= '=' this_LEVEL_2= ruleLEVEL )
            // InternalArduino.g:467:3: this_connectors_0= ruleconnectors kw= '=' this_LEVEL_2= ruleLEVEL
            {

            			newCompositeNode(grammarAccess.getConnector_definitionAccess().getConnectorsParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_connectors_0=ruleconnectors();

            state._fsp--;


            			current.merge(this_connectors_0);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,14,FOLLOW_18); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getConnector_definitionAccess().getEqualsSignKeyword_1());
            		

            			newCompositeNode(grammarAccess.getConnector_definitionAccess().getLEVELParserRuleCall_2());
            		
            pushFollow(FOLLOW_2);
            this_LEVEL_2=ruleLEVEL();

            state._fsp--;


            			current.merge(this_LEVEL_2);
            		

            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconnector_definition"


    // $ANTLR start "entryRuleLEVEL"
    // InternalArduino.g:496:1: entryRuleLEVEL returns [String current=null] : iv_ruleLEVEL= ruleLEVEL EOF ;
    public final String entryRuleLEVEL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLEVEL = null;


        try {
            // InternalArduino.g:496:45: (iv_ruleLEVEL= ruleLEVEL EOF )
            // InternalArduino.g:497:2: iv_ruleLEVEL= ruleLEVEL EOF
            {
             newCompositeNode(grammarAccess.getLEVELRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLEVEL=ruleLEVEL();

            state._fsp--;

             current =iv_ruleLEVEL.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLEVEL"


    // $ANTLR start "ruleLEVEL"
    // InternalArduino.g:503:1: ruleLEVEL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'HIGH' | kw= 'LOW' ) ;
    public final AntlrDatatypeRuleToken ruleLEVEL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalArduino.g:509:2: ( (kw= 'HIGH' | kw= 'LOW' ) )
            // InternalArduino.g:510:2: (kw= 'HIGH' | kw= 'LOW' )
            {
            // InternalArduino.g:510:2: (kw= 'HIGH' | kw= 'LOW' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==33) ) {
                alt7=1;
            }
            else if ( (LA7_0==34) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalArduino.g:511:3: kw= 'HIGH'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLEVELAccess().getHIGHKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalArduino.g:517:3: kw= 'LOW'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLEVELAccess().getLOWKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLEVEL"


    // $ANTLR start "entryRuleconnection"
    // InternalArduino.g:526:1: entryRuleconnection returns [EObject current=null] : iv_ruleconnection= ruleconnection EOF ;
    public final EObject entryRuleconnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconnection = null;


        try {
            // InternalArduino.g:526:51: (iv_ruleconnection= ruleconnection EOF )
            // InternalArduino.g:527:2: iv_ruleconnection= ruleconnection EOF
            {
             newCompositeNode(grammarAccess.getConnectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleconnection=ruleconnection();

            state._fsp--;

             current =iv_ruleconnection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleconnection"


    // $ANTLR start "ruleconnection"
    // InternalArduino.g:533:1: ruleconnection returns [EObject current=null] : ( () otherlv_1= 'connection' otherlv_2= '{' ( (lv_component_3_0= rulecomponent ) )* ( (lv_wiring_4_0= rulewiring ) )* otherlv_5= '}' ) ;
    public final EObject ruleconnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_component_3_0 = null;

        EObject lv_wiring_4_0 = null;



        	enterRule();

        try {
            // InternalArduino.g:539:2: ( ( () otherlv_1= 'connection' otherlv_2= '{' ( (lv_component_3_0= rulecomponent ) )* ( (lv_wiring_4_0= rulewiring ) )* otherlv_5= '}' ) )
            // InternalArduino.g:540:2: ( () otherlv_1= 'connection' otherlv_2= '{' ( (lv_component_3_0= rulecomponent ) )* ( (lv_wiring_4_0= rulewiring ) )* otherlv_5= '}' )
            {
            // InternalArduino.g:540:2: ( () otherlv_1= 'connection' otherlv_2= '{' ( (lv_component_3_0= rulecomponent ) )* ( (lv_wiring_4_0= rulewiring ) )* otherlv_5= '}' )
            // InternalArduino.g:541:3: () otherlv_1= 'connection' otherlv_2= '{' ( (lv_component_3_0= rulecomponent ) )* ( (lv_wiring_4_0= rulewiring ) )* otherlv_5= '}'
            {
            // InternalArduino.g:541:3: ()
            // InternalArduino.g:542:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConnectionAccess().getConnectionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getConnectionAccess().getConnectionKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getConnectionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalArduino.g:556:3: ( (lv_component_3_0= rulecomponent ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==36) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalArduino.g:557:4: (lv_component_3_0= rulecomponent )
            	    {
            	    // InternalArduino.g:557:4: (lv_component_3_0= rulecomponent )
            	    // InternalArduino.g:558:5: lv_component_3_0= rulecomponent
            	    {

            	    					newCompositeNode(grammarAccess.getConnectionAccess().getComponentComponentParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_component_3_0=rulecomponent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConnectionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"component",
            	    						lv_component_3_0,
            	    						"org.xtext.example.mydsl.Arduino.component");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalArduino.g:575:3: ( (lv_wiring_4_0= rulewiring ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalArduino.g:576:4: (lv_wiring_4_0= rulewiring )
            	    {
            	    // InternalArduino.g:576:4: (lv_wiring_4_0= rulewiring )
            	    // InternalArduino.g:577:5: lv_wiring_4_0= rulewiring
            	    {

            	    					newCompositeNode(grammarAccess.getConnectionAccess().getWiringWiringParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_wiring_4_0=rulewiring();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConnectionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"wiring",
            	    						lv_wiring_4_0,
            	    						"org.xtext.example.mydsl.Arduino.wiring");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getConnectionAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconnection"


    // $ANTLR start "entryRulecomponent"
    // InternalArduino.g:602:1: entryRulecomponent returns [EObject current=null] : iv_rulecomponent= rulecomponent EOF ;
    public final EObject entryRulecomponent() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecomponent = null;


        try {
            // InternalArduino.g:602:50: (iv_rulecomponent= rulecomponent EOF )
            // InternalArduino.g:603:2: iv_rulecomponent= rulecomponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecomponent=rulecomponent();

            state._fsp--;

             current =iv_rulecomponent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecomponent"


    // $ANTLR start "rulecomponent"
    // InternalArduino.g:609:1: rulecomponent returns [EObject current=null] : (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject rulecomponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalArduino.g:615:2: ( (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalArduino.g:616:2: (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalArduino.g:616:2: (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // InternalArduino.g:617:3: otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getNewKeyword_0());
            		
            // InternalArduino.g:621:3: ( (otherlv_1= RULE_ID ) )
            // InternalArduino.g:622:4: (otherlv_1= RULE_ID )
            {
            // InternalArduino.g:622:4: (otherlv_1= RULE_ID )
            // InternalArduino.g:623:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_1, grammarAccess.getComponentAccess().getComponentsComponentsCrossReference_1_0());
            				

            }


            }

            // InternalArduino.g:634:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalArduino.g:635:4: (lv_name_2_0= RULE_ID )
            {
            // InternalArduino.g:635:4: (lv_name_2_0= RULE_ID )
            // InternalArduino.g:636:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecomponent"


    // $ANTLR start "entryRulewiring"
    // InternalArduino.g:656:1: entryRulewiring returns [EObject current=null] : iv_rulewiring= rulewiring EOF ;
    public final EObject entryRulewiring() throws RecognitionException {
        EObject current = null;

        EObject iv_rulewiring = null;


        try {
            // InternalArduino.g:656:47: (iv_rulewiring= rulewiring EOF )
            // InternalArduino.g:657:2: iv_rulewiring= rulewiring EOF
            {
             newCompositeNode(grammarAccess.getWiringRule()); 
            pushFollow(FOLLOW_1);
            iv_rulewiring=rulewiring();

            state._fsp--;

             current =iv_rulewiring; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulewiring"


    // $ANTLR start "rulewiring"
    // InternalArduino.g:663:1: rulewiring returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_src_port_2_0= ruleconnectors ) ) otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (lv_tar_port_6_0= ruleconnectors ) ) ) ;
    public final EObject rulewiring() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_src_port_2_0 = null;

        AntlrDatatypeRuleToken lv_tar_port_6_0 = null;



        	enterRule();

        try {
            // InternalArduino.g:669:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_src_port_2_0= ruleconnectors ) ) otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (lv_tar_port_6_0= ruleconnectors ) ) ) )
            // InternalArduino.g:670:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_src_port_2_0= ruleconnectors ) ) otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (lv_tar_port_6_0= ruleconnectors ) ) )
            {
            // InternalArduino.g:670:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_src_port_2_0= ruleconnectors ) ) otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (lv_tar_port_6_0= ruleconnectors ) ) )
            // InternalArduino.g:671:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_src_port_2_0= ruleconnectors ) ) otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (lv_tar_port_6_0= ruleconnectors ) )
            {
            // InternalArduino.g:671:3: ( (otherlv_0= RULE_ID ) )
            // InternalArduino.g:672:4: (otherlv_0= RULE_ID )
            {
            // InternalArduino.g:672:4: (otherlv_0= RULE_ID )
            // InternalArduino.g:673:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWiringRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_0, grammarAccess.getWiringAccess().getSrcComponentCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,37,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getWiringAccess().getFullStopKeyword_1());
            		
            // InternalArduino.g:688:3: ( (lv_src_port_2_0= ruleconnectors ) )
            // InternalArduino.g:689:4: (lv_src_port_2_0= ruleconnectors )
            {
            // InternalArduino.g:689:4: (lv_src_port_2_0= ruleconnectors )
            // InternalArduino.g:690:5: lv_src_port_2_0= ruleconnectors
            {

            					newCompositeNode(grammarAccess.getWiringAccess().getSrc_portConnectorsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_src_port_2_0=ruleconnectors();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWiringRule());
            					}
            					set(
            						current,
            						"src_port",
            						lv_src_port_2_0,
            						"org.xtext.example.mydsl.Arduino.connectors");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getWiringAccess().getEqualsSignKeyword_3());
            		
            // InternalArduino.g:711:3: ( (otherlv_4= RULE_ID ) )
            // InternalArduino.g:712:4: (otherlv_4= RULE_ID )
            {
            // InternalArduino.g:712:4: (otherlv_4= RULE_ID )
            // InternalArduino.g:713:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWiringRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_4, grammarAccess.getWiringAccess().getTarComponentCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,37,FOLLOW_17); 

            			newLeafNode(otherlv_5, grammarAccess.getWiringAccess().getFullStopKeyword_5());
            		
            // InternalArduino.g:728:3: ( (lv_tar_port_6_0= ruleconnectors ) )
            // InternalArduino.g:729:4: (lv_tar_port_6_0= ruleconnectors )
            {
            // InternalArduino.g:729:4: (lv_tar_port_6_0= ruleconnectors )
            // InternalArduino.g:730:5: lv_tar_port_6_0= ruleconnectors
            {

            					newCompositeNode(grammarAccess.getWiringAccess().getTar_portConnectorsParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_tar_port_6_0=ruleconnectors();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWiringRule());
            					}
            					set(
            						current,
            						"tar_port",
            						lv_tar_port_6_0,
            						"org.xtext.example.mydsl.Arduino.connectors");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulewiring"


    // $ANTLR start "entryRulebehavior"
    // InternalArduino.g:751:1: entryRulebehavior returns [EObject current=null] : iv_rulebehavior= rulebehavior EOF ;
    public final EObject entryRulebehavior() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebehavior = null;


        try {
            // InternalArduino.g:751:49: (iv_rulebehavior= rulebehavior EOF )
            // InternalArduino.g:752:2: iv_rulebehavior= rulebehavior EOF
            {
             newCompositeNode(grammarAccess.getBehaviorRule()); 
            pushFollow(FOLLOW_1);
            iv_rulebehavior=rulebehavior();

            state._fsp--;

             current =iv_rulebehavior; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulebehavior"


    // $ANTLR start "rulebehavior"
    // InternalArduino.g:758:1: rulebehavior returns [EObject current=null] : ( () otherlv_1= 'behavior' otherlv_2= '{' otherlv_3= '@startuml' ( (lv_states_4_0= rulestate ) )* ( (lv_transitions_5_0= ruletransition ) )* otherlv_6= '@enduml' otherlv_7= '}' ) ;
    public final EObject rulebehavior() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_states_4_0 = null;

        EObject lv_transitions_5_0 = null;



        	enterRule();

        try {
            // InternalArduino.g:764:2: ( ( () otherlv_1= 'behavior' otherlv_2= '{' otherlv_3= '@startuml' ( (lv_states_4_0= rulestate ) )* ( (lv_transitions_5_0= ruletransition ) )* otherlv_6= '@enduml' otherlv_7= '}' ) )
            // InternalArduino.g:765:2: ( () otherlv_1= 'behavior' otherlv_2= '{' otherlv_3= '@startuml' ( (lv_states_4_0= rulestate ) )* ( (lv_transitions_5_0= ruletransition ) )* otherlv_6= '@enduml' otherlv_7= '}' )
            {
            // InternalArduino.g:765:2: ( () otherlv_1= 'behavior' otherlv_2= '{' otherlv_3= '@startuml' ( (lv_states_4_0= rulestate ) )* ( (lv_transitions_5_0= ruletransition ) )* otherlv_6= '@enduml' otherlv_7= '}' )
            // InternalArduino.g:766:3: () otherlv_1= 'behavior' otherlv_2= '{' otherlv_3= '@startuml' ( (lv_states_4_0= rulestate ) )* ( (lv_transitions_5_0= ruletransition ) )* otherlv_6= '@enduml' otherlv_7= '}'
            {
            // InternalArduino.g:766:3: ()
            // InternalArduino.g:767:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBehaviorAccess().getBehaviorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getBehaviorAccess().getBehaviorKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getBehaviorAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,39,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getBehaviorAccess().getStartumlKeyword_3());
            		
            // InternalArduino.g:785:3: ( (lv_states_4_0= rulestate ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    int LA10_2 = input.LA(2);

                    if ( (LA10_2==43) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // InternalArduino.g:786:4: (lv_states_4_0= rulestate )
            	    {
            	    // InternalArduino.g:786:4: (lv_states_4_0= rulestate )
            	    // InternalArduino.g:787:5: lv_states_4_0= rulestate
            	    {

            	    					newCompositeNode(grammarAccess.getBehaviorAccess().getStatesStateParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_23);
            	    lv_states_4_0=rulestate();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBehaviorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"states",
            	    						lv_states_4_0,
            	    						"org.xtext.example.mydsl.Arduino.state");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalArduino.g:804:3: ( (lv_transitions_5_0= ruletransition ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==41) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalArduino.g:805:4: (lv_transitions_5_0= ruletransition )
            	    {
            	    // InternalArduino.g:805:4: (lv_transitions_5_0= ruletransition )
            	    // InternalArduino.g:806:5: lv_transitions_5_0= ruletransition
            	    {

            	    					newCompositeNode(grammarAccess.getBehaviorAccess().getTransitionsTransitionParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_23);
            	    lv_transitions_5_0=ruletransition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBehaviorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"transitions",
            	    						lv_transitions_5_0,
            	    						"org.xtext.example.mydsl.Arduino.transition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_6=(Token)match(input,40,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getBehaviorAccess().getEndumlKeyword_6());
            		
            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getBehaviorAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulebehavior"


    // $ANTLR start "entryRuletransition"
    // InternalArduino.g:835:1: entryRuletransition returns [EObject current=null] : iv_ruletransition= ruletransition EOF ;
    public final EObject entryRuletransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletransition = null;


        try {
            // InternalArduino.g:835:51: (iv_ruletransition= ruletransition EOF )
            // InternalArduino.g:836:2: iv_ruletransition= ruletransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletransition=ruletransition();

            state._fsp--;

             current =iv_ruletransition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletransition"


    // $ANTLR start "ruletransition"
    // InternalArduino.g:842:1: ruletransition returns [EObject current=null] : ( (otherlv_0= '[*]' | ( (otherlv_1= RULE_ID ) ) ) otherlv_2= '-->' ( (otherlv_3= RULE_ID ) ) ( (lv_transition_effect_4_0= ruletransition_effect ) )? ) ;
    public final EObject ruletransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_transition_effect_4_0 = null;



        	enterRule();

        try {
            // InternalArduino.g:848:2: ( ( (otherlv_0= '[*]' | ( (otherlv_1= RULE_ID ) ) ) otherlv_2= '-->' ( (otherlv_3= RULE_ID ) ) ( (lv_transition_effect_4_0= ruletransition_effect ) )? ) )
            // InternalArduino.g:849:2: ( (otherlv_0= '[*]' | ( (otherlv_1= RULE_ID ) ) ) otherlv_2= '-->' ( (otherlv_3= RULE_ID ) ) ( (lv_transition_effect_4_0= ruletransition_effect ) )? )
            {
            // InternalArduino.g:849:2: ( (otherlv_0= '[*]' | ( (otherlv_1= RULE_ID ) ) ) otherlv_2= '-->' ( (otherlv_3= RULE_ID ) ) ( (lv_transition_effect_4_0= ruletransition_effect ) )? )
            // InternalArduino.g:850:3: (otherlv_0= '[*]' | ( (otherlv_1= RULE_ID ) ) ) otherlv_2= '-->' ( (otherlv_3= RULE_ID ) ) ( (lv_transition_effect_4_0= ruletransition_effect ) )?
            {
            // InternalArduino.g:850:3: (otherlv_0= '[*]' | ( (otherlv_1= RULE_ID ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==41) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalArduino.g:851:4: otherlv_0= '[*]'
                    {
                    otherlv_0=(Token)match(input,41,FOLLOW_24); 

                    				newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getLeftSquareBracketAsteriskRightSquareBracketKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalArduino.g:856:4: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalArduino.g:856:4: ( (otherlv_1= RULE_ID ) )
                    // InternalArduino.g:857:5: (otherlv_1= RULE_ID )
                    {
                    // InternalArduino.g:857:5: (otherlv_1= RULE_ID )
                    // InternalArduino.g:858:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_24); 

                    						newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getSrc_stateStateCrossReference_0_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,42,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalArduino.g:874:3: ( (otherlv_3= RULE_ID ) )
            // InternalArduino.g:875:4: (otherlv_3= RULE_ID )
            {
            // InternalArduino.g:875:4: (otherlv_3= RULE_ID )
            // InternalArduino.g:876:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getTar_stateStateCrossReference_2_0());
            				

            }


            }

            // InternalArduino.g:887:3: ( (lv_transition_effect_4_0= ruletransition_effect ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==43) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalArduino.g:888:4: (lv_transition_effect_4_0= ruletransition_effect )
                    {
                    // InternalArduino.g:888:4: (lv_transition_effect_4_0= ruletransition_effect )
                    // InternalArduino.g:889:5: lv_transition_effect_4_0= ruletransition_effect
                    {

                    					newCompositeNode(grammarAccess.getTransitionAccess().getTransition_effectTransition_effectParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_transition_effect_4_0=ruletransition_effect();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTransitionRule());
                    					}
                    					set(
                    						current,
                    						"transition_effect",
                    						lv_transition_effect_4_0,
                    						"org.xtext.example.mydsl.Arduino.transition_effect");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletransition"


    // $ANTLR start "entryRuletransition_effect"
    // InternalArduino.g:910:1: entryRuletransition_effect returns [EObject current=null] : iv_ruletransition_effect= ruletransition_effect EOF ;
    public final EObject entryRuletransition_effect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletransition_effect = null;


        try {
            // InternalArduino.g:910:58: (iv_ruletransition_effect= ruletransition_effect EOF )
            // InternalArduino.g:911:2: iv_ruletransition_effect= ruletransition_effect EOF
            {
             newCompositeNode(grammarAccess.getTransition_effectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletransition_effect=ruletransition_effect();

            state._fsp--;

             current =iv_ruletransition_effect; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletransition_effect"


    // $ANTLR start "ruletransition_effect"
    // InternalArduino.g:917:1: ruletransition_effect returns [EObject current=null] : (otherlv_0= ':' otherlv_1= 'delay' otherlv_2= '[' ( (lv_microseconds_3_0= RULE_INT ) ) otherlv_4= ']' ) ;
    public final EObject ruletransition_effect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_microseconds_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalArduino.g:923:2: ( (otherlv_0= ':' otherlv_1= 'delay' otherlv_2= '[' ( (lv_microseconds_3_0= RULE_INT ) ) otherlv_4= ']' ) )
            // InternalArduino.g:924:2: (otherlv_0= ':' otherlv_1= 'delay' otherlv_2= '[' ( (lv_microseconds_3_0= RULE_INT ) ) otherlv_4= ']' )
            {
            // InternalArduino.g:924:2: (otherlv_0= ':' otherlv_1= 'delay' otherlv_2= '[' ( (lv_microseconds_3_0= RULE_INT ) ) otherlv_4= ']' )
            // InternalArduino.g:925:3: otherlv_0= ':' otherlv_1= 'delay' otherlv_2= '[' ( (lv_microseconds_3_0= RULE_INT ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getTransition_effectAccess().getColonKeyword_0());
            		
            otherlv_1=(Token)match(input,44,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getTransition_effectAccess().getDelayKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getTransition_effectAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalArduino.g:937:3: ( (lv_microseconds_3_0= RULE_INT ) )
            // InternalArduino.g:938:4: (lv_microseconds_3_0= RULE_INT )
            {
            // InternalArduino.g:938:4: (lv_microseconds_3_0= RULE_INT )
            // InternalArduino.g:939:5: lv_microseconds_3_0= RULE_INT
            {
            lv_microseconds_3_0=(Token)match(input,RULE_INT,FOLLOW_28); 

            					newLeafNode(lv_microseconds_3_0, grammarAccess.getTransition_effectAccess().getMicrosecondsINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransition_effectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"microseconds",
            						lv_microseconds_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTransition_effectAccess().getRightSquareBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletransition_effect"


    // $ANTLR start "entryRulestate"
    // InternalArduino.g:963:1: entryRulestate returns [EObject current=null] : iv_rulestate= rulestate EOF ;
    public final EObject entryRulestate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestate = null;


        try {
            // InternalArduino.g:963:46: (iv_rulestate= rulestate EOF )
            // InternalArduino.g:964:2: iv_rulestate= rulestate EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestate=rulestate();

            state._fsp--;

             current =iv_rulestate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestate"


    // $ANTLR start "rulestate"
    // InternalArduino.g:970:1: rulestate returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.state' otherlv_4= '=' ( ( ruleFQN ) ) ) ;
    public final EObject rulestate() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalArduino.g:976:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.state' otherlv_4= '=' ( ( ruleFQN ) ) ) )
            // InternalArduino.g:977:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.state' otherlv_4= '=' ( ( ruleFQN ) ) )
            {
            // InternalArduino.g:977:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.state' otherlv_4= '=' ( ( ruleFQN ) ) )
            // InternalArduino.g:978:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.state' otherlv_4= '=' ( ( ruleFQN ) )
            {
            // InternalArduino.g:978:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalArduino.g:979:4: (lv_name_0_0= RULE_ID )
            {
            // InternalArduino.g:979:4: (lv_name_0_0= RULE_ID )
            // InternalArduino.g:980:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(lv_name_0_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,43,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getStateAccess().getColonKeyword_1());
            		
            // InternalArduino.g:1000:3: ( (otherlv_2= RULE_ID ) )
            // InternalArduino.g:1001:4: (otherlv_2= RULE_ID )
            {
            // InternalArduino.g:1001:4: (otherlv_2= RULE_ID )
            // InternalArduino.g:1002:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(otherlv_2, grammarAccess.getStateAccess().getComponentComponentCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,45,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getStateAccess().getStateKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getStateAccess().getEqualsSignKeyword_4());
            		
            // InternalArduino.g:1021:3: ( ( ruleFQN ) )
            // InternalArduino.g:1022:4: ( ruleFQN )
            {
            // InternalArduino.g:1022:4: ( ruleFQN )
            // InternalArduino.g:1023:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateRule());
            					}
            				

            					newCompositeNode(grammarAccess.getStateAccess().getComponent_stateComponent_stateCrossReference_5_0());
            				
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestate"


    // $ANTLR start "entryRuleFQN"
    // InternalArduino.g:1041:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalArduino.g:1041:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalArduino.g:1042:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // InternalArduino.g:1048:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalArduino.g:1054:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalArduino.g:1055:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalArduino.g:1055:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalArduino.g:1056:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalArduino.g:1063:3: (kw= '.' this_ID_2= RULE_ID )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==37) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalArduino.g:1064:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,37,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_31); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFQN"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000800000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000001FF080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000001FF000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001000008010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000030000000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000002L});

}