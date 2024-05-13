package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.ArduinoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalArduinoParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'actor'", "'sensor'", "'microcontroller'", "'GND'", "'GND1'", "'GND2'", "'DIGITAL_IN'", "'A0'", "'ANALOG_IN'", "'ANALOG_X'", "'ANALOG_Y'", "'DIGITAL_BUTTON'", "'HIGH'", "'LOW'", "'[*]'", "'component'", "'{'", "'type'", "'='", "'}'", "','", "'connectors'", "'['", "']'", "'states'", "'connection'", "'new'", "'.'", "'behavior'", "'@startuml'", "'@enduml'", "'-->'", "':'", "'delay'", "'.state'"
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

    	public void setGrammarAccess(ArduinoGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalArduino.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalArduino.g:54:1: ( ruleModel EOF )
            // InternalArduino.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalArduino.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalArduino.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalArduino.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalArduino.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalArduino.g:69:3: ( rule__Model__Group__0 )
            // InternalArduino.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulecomponents"
    // InternalArduino.g:78:1: entryRulecomponents : rulecomponents EOF ;
    public final void entryRulecomponents() throws RecognitionException {
        try {
            // InternalArduino.g:79:1: ( rulecomponents EOF )
            // InternalArduino.g:80:1: rulecomponents EOF
            {
             before(grammarAccess.getComponentsRule()); 
            pushFollow(FOLLOW_1);
            rulecomponents();

            state._fsp--;

             after(grammarAccess.getComponentsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulecomponents"


    // $ANTLR start "rulecomponents"
    // InternalArduino.g:87:1: rulecomponents : ( ( rule__Components__Group__0 ) ) ;
    public final void rulecomponents() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:91:2: ( ( ( rule__Components__Group__0 ) ) )
            // InternalArduino.g:92:2: ( ( rule__Components__Group__0 ) )
            {
            // InternalArduino.g:92:2: ( ( rule__Components__Group__0 ) )
            // InternalArduino.g:93:3: ( rule__Components__Group__0 )
            {
             before(grammarAccess.getComponentsAccess().getGroup()); 
            // InternalArduino.g:94:3: ( rule__Components__Group__0 )
            // InternalArduino.g:94:4: rule__Components__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Components__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecomponents"


    // $ANTLR start "entryRuletype"
    // InternalArduino.g:103:1: entryRuletype : ruletype EOF ;
    public final void entryRuletype() throws RecognitionException {
        try {
            // InternalArduino.g:104:1: ( ruletype EOF )
            // InternalArduino.g:105:1: ruletype EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruletype();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuletype"


    // $ANTLR start "ruletype"
    // InternalArduino.g:112:1: ruletype : ( ( rule__Type__Alternatives ) ) ;
    public final void ruletype() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:116:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalArduino.g:117:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalArduino.g:117:2: ( ( rule__Type__Alternatives ) )
            // InternalArduino.g:118:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalArduino.g:119:3: ( rule__Type__Alternatives )
            // InternalArduino.g:119:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruletype"


    // $ANTLR start "entryRuleconnectors"
    // InternalArduino.g:128:1: entryRuleconnectors : ruleconnectors EOF ;
    public final void entryRuleconnectors() throws RecognitionException {
        try {
            // InternalArduino.g:129:1: ( ruleconnectors EOF )
            // InternalArduino.g:130:1: ruleconnectors EOF
            {
             before(grammarAccess.getConnectorsRule()); 
            pushFollow(FOLLOW_1);
            ruleconnectors();

            state._fsp--;

             after(grammarAccess.getConnectorsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleconnectors"


    // $ANTLR start "ruleconnectors"
    // InternalArduino.g:137:1: ruleconnectors : ( ( rule__Connectors__Alternatives ) ) ;
    public final void ruleconnectors() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:141:2: ( ( ( rule__Connectors__Alternatives ) ) )
            // InternalArduino.g:142:2: ( ( rule__Connectors__Alternatives ) )
            {
            // InternalArduino.g:142:2: ( ( rule__Connectors__Alternatives ) )
            // InternalArduino.g:143:3: ( rule__Connectors__Alternatives )
            {
             before(grammarAccess.getConnectorsAccess().getAlternatives()); 
            // InternalArduino.g:144:3: ( rule__Connectors__Alternatives )
            // InternalArduino.g:144:4: rule__Connectors__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Connectors__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConnectorsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleconnectors"


    // $ANTLR start "entryRulecomponent_state"
    // InternalArduino.g:153:1: entryRulecomponent_state : rulecomponent_state EOF ;
    public final void entryRulecomponent_state() throws RecognitionException {
        try {
            // InternalArduino.g:154:1: ( rulecomponent_state EOF )
            // InternalArduino.g:155:1: rulecomponent_state EOF
            {
             before(grammarAccess.getComponent_stateRule()); 
            pushFollow(FOLLOW_1);
            rulecomponent_state();

            state._fsp--;

             after(grammarAccess.getComponent_stateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulecomponent_state"


    // $ANTLR start "rulecomponent_state"
    // InternalArduino.g:162:1: rulecomponent_state : ( ( rule__Component_state__Group__0 ) ) ;
    public final void rulecomponent_state() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:166:2: ( ( ( rule__Component_state__Group__0 ) ) )
            // InternalArduino.g:167:2: ( ( rule__Component_state__Group__0 ) )
            {
            // InternalArduino.g:167:2: ( ( rule__Component_state__Group__0 ) )
            // InternalArduino.g:168:3: ( rule__Component_state__Group__0 )
            {
             before(grammarAccess.getComponent_stateAccess().getGroup()); 
            // InternalArduino.g:169:3: ( rule__Component_state__Group__0 )
            // InternalArduino.g:169:4: rule__Component_state__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Component_state__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponent_stateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecomponent_state"


    // $ANTLR start "entryRuleconnector_definition"
    // InternalArduino.g:178:1: entryRuleconnector_definition : ruleconnector_definition EOF ;
    public final void entryRuleconnector_definition() throws RecognitionException {
        try {
            // InternalArduino.g:179:1: ( ruleconnector_definition EOF )
            // InternalArduino.g:180:1: ruleconnector_definition EOF
            {
             before(grammarAccess.getConnector_definitionRule()); 
            pushFollow(FOLLOW_1);
            ruleconnector_definition();

            state._fsp--;

             after(grammarAccess.getConnector_definitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleconnector_definition"


    // $ANTLR start "ruleconnector_definition"
    // InternalArduino.g:187:1: ruleconnector_definition : ( ( rule__Connector_definition__Group__0 ) ) ;
    public final void ruleconnector_definition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:191:2: ( ( ( rule__Connector_definition__Group__0 ) ) )
            // InternalArduino.g:192:2: ( ( rule__Connector_definition__Group__0 ) )
            {
            // InternalArduino.g:192:2: ( ( rule__Connector_definition__Group__0 ) )
            // InternalArduino.g:193:3: ( rule__Connector_definition__Group__0 )
            {
             before(grammarAccess.getConnector_definitionAccess().getGroup()); 
            // InternalArduino.g:194:3: ( rule__Connector_definition__Group__0 )
            // InternalArduino.g:194:4: rule__Connector_definition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Connector_definition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConnector_definitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleconnector_definition"


    // $ANTLR start "entryRuleLEVEL"
    // InternalArduino.g:203:1: entryRuleLEVEL : ruleLEVEL EOF ;
    public final void entryRuleLEVEL() throws RecognitionException {
        try {
            // InternalArduino.g:204:1: ( ruleLEVEL EOF )
            // InternalArduino.g:205:1: ruleLEVEL EOF
            {
             before(grammarAccess.getLEVELRule()); 
            pushFollow(FOLLOW_1);
            ruleLEVEL();

            state._fsp--;

             after(grammarAccess.getLEVELRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLEVEL"


    // $ANTLR start "ruleLEVEL"
    // InternalArduino.g:212:1: ruleLEVEL : ( ( rule__LEVEL__Alternatives ) ) ;
    public final void ruleLEVEL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:216:2: ( ( ( rule__LEVEL__Alternatives ) ) )
            // InternalArduino.g:217:2: ( ( rule__LEVEL__Alternatives ) )
            {
            // InternalArduino.g:217:2: ( ( rule__LEVEL__Alternatives ) )
            // InternalArduino.g:218:3: ( rule__LEVEL__Alternatives )
            {
             before(grammarAccess.getLEVELAccess().getAlternatives()); 
            // InternalArduino.g:219:3: ( rule__LEVEL__Alternatives )
            // InternalArduino.g:219:4: rule__LEVEL__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LEVEL__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLEVELAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLEVEL"


    // $ANTLR start "entryRuleconnection"
    // InternalArduino.g:228:1: entryRuleconnection : ruleconnection EOF ;
    public final void entryRuleconnection() throws RecognitionException {
        try {
            // InternalArduino.g:229:1: ( ruleconnection EOF )
            // InternalArduino.g:230:1: ruleconnection EOF
            {
             before(grammarAccess.getConnectionRule()); 
            pushFollow(FOLLOW_1);
            ruleconnection();

            state._fsp--;

             after(grammarAccess.getConnectionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleconnection"


    // $ANTLR start "ruleconnection"
    // InternalArduino.g:237:1: ruleconnection : ( ( rule__Connection__Group__0 ) ) ;
    public final void ruleconnection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:241:2: ( ( ( rule__Connection__Group__0 ) ) )
            // InternalArduino.g:242:2: ( ( rule__Connection__Group__0 ) )
            {
            // InternalArduino.g:242:2: ( ( rule__Connection__Group__0 ) )
            // InternalArduino.g:243:3: ( rule__Connection__Group__0 )
            {
             before(grammarAccess.getConnectionAccess().getGroup()); 
            // InternalArduino.g:244:3: ( rule__Connection__Group__0 )
            // InternalArduino.g:244:4: rule__Connection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Connection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConnectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleconnection"


    // $ANTLR start "entryRulecomponent"
    // InternalArduino.g:253:1: entryRulecomponent : rulecomponent EOF ;
    public final void entryRulecomponent() throws RecognitionException {
        try {
            // InternalArduino.g:254:1: ( rulecomponent EOF )
            // InternalArduino.g:255:1: rulecomponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            rulecomponent();

            state._fsp--;

             after(grammarAccess.getComponentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulecomponent"


    // $ANTLR start "rulecomponent"
    // InternalArduino.g:262:1: rulecomponent : ( ( rule__Component__Group__0 ) ) ;
    public final void rulecomponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:266:2: ( ( ( rule__Component__Group__0 ) ) )
            // InternalArduino.g:267:2: ( ( rule__Component__Group__0 ) )
            {
            // InternalArduino.g:267:2: ( ( rule__Component__Group__0 ) )
            // InternalArduino.g:268:3: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // InternalArduino.g:269:3: ( rule__Component__Group__0 )
            // InternalArduino.g:269:4: rule__Component__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecomponent"


    // $ANTLR start "entryRulewiring"
    // InternalArduino.g:278:1: entryRulewiring : rulewiring EOF ;
    public final void entryRulewiring() throws RecognitionException {
        try {
            // InternalArduino.g:279:1: ( rulewiring EOF )
            // InternalArduino.g:280:1: rulewiring EOF
            {
             before(grammarAccess.getWiringRule()); 
            pushFollow(FOLLOW_1);
            rulewiring();

            state._fsp--;

             after(grammarAccess.getWiringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulewiring"


    // $ANTLR start "rulewiring"
    // InternalArduino.g:287:1: rulewiring : ( ( rule__Wiring__Group__0 ) ) ;
    public final void rulewiring() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:291:2: ( ( ( rule__Wiring__Group__0 ) ) )
            // InternalArduino.g:292:2: ( ( rule__Wiring__Group__0 ) )
            {
            // InternalArduino.g:292:2: ( ( rule__Wiring__Group__0 ) )
            // InternalArduino.g:293:3: ( rule__Wiring__Group__0 )
            {
             before(grammarAccess.getWiringAccess().getGroup()); 
            // InternalArduino.g:294:3: ( rule__Wiring__Group__0 )
            // InternalArduino.g:294:4: rule__Wiring__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Wiring__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWiringAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulewiring"


    // $ANTLR start "entryRulebehavior"
    // InternalArduino.g:303:1: entryRulebehavior : rulebehavior EOF ;
    public final void entryRulebehavior() throws RecognitionException {
        try {
            // InternalArduino.g:304:1: ( rulebehavior EOF )
            // InternalArduino.g:305:1: rulebehavior EOF
            {
             before(grammarAccess.getBehaviorRule()); 
            pushFollow(FOLLOW_1);
            rulebehavior();

            state._fsp--;

             after(grammarAccess.getBehaviorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulebehavior"


    // $ANTLR start "rulebehavior"
    // InternalArduino.g:312:1: rulebehavior : ( ( rule__Behavior__Group__0 ) ) ;
    public final void rulebehavior() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:316:2: ( ( ( rule__Behavior__Group__0 ) ) )
            // InternalArduino.g:317:2: ( ( rule__Behavior__Group__0 ) )
            {
            // InternalArduino.g:317:2: ( ( rule__Behavior__Group__0 ) )
            // InternalArduino.g:318:3: ( rule__Behavior__Group__0 )
            {
             before(grammarAccess.getBehaviorAccess().getGroup()); 
            // InternalArduino.g:319:3: ( rule__Behavior__Group__0 )
            // InternalArduino.g:319:4: rule__Behavior__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Behavior__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBehaviorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulebehavior"


    // $ANTLR start "entryRuletransition"
    // InternalArduino.g:328:1: entryRuletransition : ruletransition EOF ;
    public final void entryRuletransition() throws RecognitionException {
        try {
            // InternalArduino.g:329:1: ( ruletransition EOF )
            // InternalArduino.g:330:1: ruletransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            ruletransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuletransition"


    // $ANTLR start "ruletransition"
    // InternalArduino.g:337:1: ruletransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruletransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:341:2: ( ( ( rule__Transition__Group__0 ) ) )
            // InternalArduino.g:342:2: ( ( rule__Transition__Group__0 ) )
            {
            // InternalArduino.g:342:2: ( ( rule__Transition__Group__0 ) )
            // InternalArduino.g:343:3: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // InternalArduino.g:344:3: ( rule__Transition__Group__0 )
            // InternalArduino.g:344:4: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruletransition"


    // $ANTLR start "entryRuletransition_effect"
    // InternalArduino.g:353:1: entryRuletransition_effect : ruletransition_effect EOF ;
    public final void entryRuletransition_effect() throws RecognitionException {
        try {
            // InternalArduino.g:354:1: ( ruletransition_effect EOF )
            // InternalArduino.g:355:1: ruletransition_effect EOF
            {
             before(grammarAccess.getTransition_effectRule()); 
            pushFollow(FOLLOW_1);
            ruletransition_effect();

            state._fsp--;

             after(grammarAccess.getTransition_effectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuletransition_effect"


    // $ANTLR start "ruletransition_effect"
    // InternalArduino.g:362:1: ruletransition_effect : ( ( rule__Transition_effect__Group__0 ) ) ;
    public final void ruletransition_effect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:366:2: ( ( ( rule__Transition_effect__Group__0 ) ) )
            // InternalArduino.g:367:2: ( ( rule__Transition_effect__Group__0 ) )
            {
            // InternalArduino.g:367:2: ( ( rule__Transition_effect__Group__0 ) )
            // InternalArduino.g:368:3: ( rule__Transition_effect__Group__0 )
            {
             before(grammarAccess.getTransition_effectAccess().getGroup()); 
            // InternalArduino.g:369:3: ( rule__Transition_effect__Group__0 )
            // InternalArduino.g:369:4: rule__Transition_effect__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Transition_effect__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransition_effectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruletransition_effect"


    // $ANTLR start "entryRulestate"
    // InternalArduino.g:378:1: entryRulestate : rulestate EOF ;
    public final void entryRulestate() throws RecognitionException {
        try {
            // InternalArduino.g:379:1: ( rulestate EOF )
            // InternalArduino.g:380:1: rulestate EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            rulestate();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulestate"


    // $ANTLR start "rulestate"
    // InternalArduino.g:387:1: rulestate : ( ( rule__State__Group__0 ) ) ;
    public final void rulestate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:391:2: ( ( ( rule__State__Group__0 ) ) )
            // InternalArduino.g:392:2: ( ( rule__State__Group__0 ) )
            {
            // InternalArduino.g:392:2: ( ( rule__State__Group__0 ) )
            // InternalArduino.g:393:3: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // InternalArduino.g:394:3: ( rule__State__Group__0 )
            // InternalArduino.g:394:4: rule__State__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulestate"


    // $ANTLR start "entryRuleFQN"
    // InternalArduino.g:403:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalArduino.g:404:1: ( ruleFQN EOF )
            // InternalArduino.g:405:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_1);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFQNRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // InternalArduino.g:412:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:416:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalArduino.g:417:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalArduino.g:417:2: ( ( rule__FQN__Group__0 ) )
            // InternalArduino.g:418:3: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // InternalArduino.g:419:3: ( rule__FQN__Group__0 )
            // InternalArduino.g:419:4: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFQNAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFQN"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalArduino.g:427:1: rule__Type__Alternatives : ( ( 'actor' ) | ( 'sensor' ) | ( 'microcontroller' ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:431:1: ( ( 'actor' ) | ( 'sensor' ) | ( 'microcontroller' ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalArduino.g:432:2: ( 'actor' )
                    {
                    // InternalArduino.g:432:2: ( 'actor' )
                    // InternalArduino.g:433:3: 'actor'
                    {
                     before(grammarAccess.getTypeAccess().getActorKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getActorKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArduino.g:438:2: ( 'sensor' )
                    {
                    // InternalArduino.g:438:2: ( 'sensor' )
                    // InternalArduino.g:439:3: 'sensor'
                    {
                     before(grammarAccess.getTypeAccess().getSensorKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getSensorKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalArduino.g:444:2: ( 'microcontroller' )
                    {
                    // InternalArduino.g:444:2: ( 'microcontroller' )
                    // InternalArduino.g:445:3: 'microcontroller'
                    {
                     before(grammarAccess.getTypeAccess().getMicrocontrollerKeyword_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getMicrocontrollerKeyword_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Connectors__Alternatives"
    // InternalArduino.g:454:1: rule__Connectors__Alternatives : ( ( 'GND' ) | ( 'GND1' ) | ( 'GND2' ) | ( 'DIGITAL_IN' ) | ( 'A0' ) | ( 'ANALOG_IN' ) | ( 'ANALOG_X' ) | ( 'ANALOG_Y' ) | ( 'DIGITAL_BUTTON' ) );
    public final void rule__Connectors__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:458:1: ( ( 'GND' ) | ( 'GND1' ) | ( 'GND2' ) | ( 'DIGITAL_IN' ) | ( 'A0' ) | ( 'ANALOG_IN' ) | ( 'ANALOG_X' ) | ( 'ANALOG_Y' ) | ( 'DIGITAL_BUTTON' ) )
            int alt2=9;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 16:
                {
                alt2=3;
                }
                break;
            case 17:
                {
                alt2=4;
                }
                break;
            case 18:
                {
                alt2=5;
                }
                break;
            case 19:
                {
                alt2=6;
                }
                break;
            case 20:
                {
                alt2=7;
                }
                break;
            case 21:
                {
                alt2=8;
                }
                break;
            case 22:
                {
                alt2=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalArduino.g:459:2: ( 'GND' )
                    {
                    // InternalArduino.g:459:2: ( 'GND' )
                    // InternalArduino.g:460:3: 'GND'
                    {
                     before(grammarAccess.getConnectorsAccess().getGNDKeyword_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getConnectorsAccess().getGNDKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArduino.g:465:2: ( 'GND1' )
                    {
                    // InternalArduino.g:465:2: ( 'GND1' )
                    // InternalArduino.g:466:3: 'GND1'
                    {
                     before(grammarAccess.getConnectorsAccess().getGND1Keyword_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getConnectorsAccess().getGND1Keyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalArduino.g:471:2: ( 'GND2' )
                    {
                    // InternalArduino.g:471:2: ( 'GND2' )
                    // InternalArduino.g:472:3: 'GND2'
                    {
                     before(grammarAccess.getConnectorsAccess().getGND2Keyword_2()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getConnectorsAccess().getGND2Keyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalArduino.g:477:2: ( 'DIGITAL_IN' )
                    {
                    // InternalArduino.g:477:2: ( 'DIGITAL_IN' )
                    // InternalArduino.g:478:3: 'DIGITAL_IN'
                    {
                     before(grammarAccess.getConnectorsAccess().getDIGITAL_INKeyword_3()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getConnectorsAccess().getDIGITAL_INKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalArduino.g:483:2: ( 'A0' )
                    {
                    // InternalArduino.g:483:2: ( 'A0' )
                    // InternalArduino.g:484:3: 'A0'
                    {
                     before(grammarAccess.getConnectorsAccess().getA0Keyword_4()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getConnectorsAccess().getA0Keyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalArduino.g:489:2: ( 'ANALOG_IN' )
                    {
                    // InternalArduino.g:489:2: ( 'ANALOG_IN' )
                    // InternalArduino.g:490:3: 'ANALOG_IN'
                    {
                     before(grammarAccess.getConnectorsAccess().getANALOG_INKeyword_5()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getConnectorsAccess().getANALOG_INKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalArduino.g:495:2: ( 'ANALOG_X' )
                    {
                    // InternalArduino.g:495:2: ( 'ANALOG_X' )
                    // InternalArduino.g:496:3: 'ANALOG_X'
                    {
                     before(grammarAccess.getConnectorsAccess().getANALOG_XKeyword_6()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getConnectorsAccess().getANALOG_XKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalArduino.g:501:2: ( 'ANALOG_Y' )
                    {
                    // InternalArduino.g:501:2: ( 'ANALOG_Y' )
                    // InternalArduino.g:502:3: 'ANALOG_Y'
                    {
                     before(grammarAccess.getConnectorsAccess().getANALOG_YKeyword_7()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getConnectorsAccess().getANALOG_YKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalArduino.g:507:2: ( 'DIGITAL_BUTTON' )
                    {
                    // InternalArduino.g:507:2: ( 'DIGITAL_BUTTON' )
                    // InternalArduino.g:508:3: 'DIGITAL_BUTTON'
                    {
                     before(grammarAccess.getConnectorsAccess().getDIGITAL_BUTTONKeyword_8()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getConnectorsAccess().getDIGITAL_BUTTONKeyword_8()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connectors__Alternatives"


    // $ANTLR start "rule__LEVEL__Alternatives"
    // InternalArduino.g:517:1: rule__LEVEL__Alternatives : ( ( 'HIGH' ) | ( 'LOW' ) );
    public final void rule__LEVEL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:521:1: ( ( 'HIGH' ) | ( 'LOW' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==23) ) {
                alt3=1;
            }
            else if ( (LA3_0==24) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalArduino.g:522:2: ( 'HIGH' )
                    {
                    // InternalArduino.g:522:2: ( 'HIGH' )
                    // InternalArduino.g:523:3: 'HIGH'
                    {
                     before(grammarAccess.getLEVELAccess().getHIGHKeyword_0()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getLEVELAccess().getHIGHKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArduino.g:528:2: ( 'LOW' )
                    {
                    // InternalArduino.g:528:2: ( 'LOW' )
                    // InternalArduino.g:529:3: 'LOW'
                    {
                     before(grammarAccess.getLEVELAccess().getLOWKeyword_1()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getLEVELAccess().getLOWKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LEVEL__Alternatives"


    // $ANTLR start "rule__Transition__Alternatives_0"
    // InternalArduino.g:538:1: rule__Transition__Alternatives_0 : ( ( '[*]' ) | ( ( rule__Transition__Src_stateAssignment_0_1 ) ) );
    public final void rule__Transition__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:542:1: ( ( '[*]' ) | ( ( rule__Transition__Src_stateAssignment_0_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==25) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalArduino.g:543:2: ( '[*]' )
                    {
                    // InternalArduino.g:543:2: ( '[*]' )
                    // InternalArduino.g:544:3: '[*]'
                    {
                     before(grammarAccess.getTransitionAccess().getLeftSquareBracketAsteriskRightSquareBracketKeyword_0_0()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getTransitionAccess().getLeftSquareBracketAsteriskRightSquareBracketKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArduino.g:549:2: ( ( rule__Transition__Src_stateAssignment_0_1 ) )
                    {
                    // InternalArduino.g:549:2: ( ( rule__Transition__Src_stateAssignment_0_1 ) )
                    // InternalArduino.g:550:3: ( rule__Transition__Src_stateAssignment_0_1 )
                    {
                     before(grammarAccess.getTransitionAccess().getSrc_stateAssignment_0_1()); 
                    // InternalArduino.g:551:3: ( rule__Transition__Src_stateAssignment_0_1 )
                    // InternalArduino.g:551:4: rule__Transition__Src_stateAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__Src_stateAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTransitionAccess().getSrc_stateAssignment_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Alternatives_0"


    // $ANTLR start "rule__Model__Group__0"
    // InternalArduino.g:559:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:563:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalArduino.g:564:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalArduino.g:571:1: rule__Model__Group__0__Impl : ( ( rule__Model__ComponentsAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:575:1: ( ( ( rule__Model__ComponentsAssignment_0 )* ) )
            // InternalArduino.g:576:1: ( ( rule__Model__ComponentsAssignment_0 )* )
            {
            // InternalArduino.g:576:1: ( ( rule__Model__ComponentsAssignment_0 )* )
            // InternalArduino.g:577:2: ( rule__Model__ComponentsAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getComponentsAssignment_0()); 
            // InternalArduino.g:578:2: ( rule__Model__ComponentsAssignment_0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==26) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalArduino.g:578:3: rule__Model__ComponentsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__ComponentsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getComponentsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalArduino.g:586:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:590:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalArduino.g:591:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalArduino.g:598:1: rule__Model__Group__1__Impl : ( ( rule__Model__ConnectionAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:602:1: ( ( ( rule__Model__ConnectionAssignment_1 ) ) )
            // InternalArduino.g:603:1: ( ( rule__Model__ConnectionAssignment_1 ) )
            {
            // InternalArduino.g:603:1: ( ( rule__Model__ConnectionAssignment_1 ) )
            // InternalArduino.g:604:2: ( rule__Model__ConnectionAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getConnectionAssignment_1()); 
            // InternalArduino.g:605:2: ( rule__Model__ConnectionAssignment_1 )
            // InternalArduino.g:605:3: rule__Model__ConnectionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__ConnectionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getConnectionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalArduino.g:613:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:617:1: ( rule__Model__Group__2__Impl )
            // InternalArduino.g:618:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalArduino.g:624:1: rule__Model__Group__2__Impl : ( ( rule__Model__BehaviorAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:628:1: ( ( ( rule__Model__BehaviorAssignment_2 ) ) )
            // InternalArduino.g:629:1: ( ( rule__Model__BehaviorAssignment_2 ) )
            {
            // InternalArduino.g:629:1: ( ( rule__Model__BehaviorAssignment_2 ) )
            // InternalArduino.g:630:2: ( rule__Model__BehaviorAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getBehaviorAssignment_2()); 
            // InternalArduino.g:631:2: ( rule__Model__BehaviorAssignment_2 )
            // InternalArduino.g:631:3: rule__Model__BehaviorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Model__BehaviorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getBehaviorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Components__Group__0"
    // InternalArduino.g:640:1: rule__Components__Group__0 : rule__Components__Group__0__Impl rule__Components__Group__1 ;
    public final void rule__Components__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:644:1: ( rule__Components__Group__0__Impl rule__Components__Group__1 )
            // InternalArduino.g:645:2: rule__Components__Group__0__Impl rule__Components__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Components__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Components__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Components__Group__0"


    // $ANTLR start "rule__Components__Group__0__Impl"
    // InternalArduino.g:652:1: rule__Components__Group__0__Impl : ( 'component' ) ;
    public final void rule__Components__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:656:1: ( ( 'component' ) )
            // InternalArduino.g:657:1: ( 'component' )
            {
            // InternalArduino.g:657:1: ( 'component' )
            // InternalArduino.g:658:2: 'component'
            {
             before(grammarAccess.getComponentsAccess().getComponentKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getComponentsAccess().getComponentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Components__Group__0__Impl"


    // $ANTLR start "rule__Components__Group__1"
    // InternalArduino.g:667:1: rule__Components__Group__1 : rule__Components__Group__1__Impl rule__Components__Group__2 ;
    public final void rule__Components__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:671:1: ( rule__Components__Group__1__Impl rule__Components__Group__2 )
            // InternalArduino.g:672:2: rule__Components__Group__1__Impl rule__Components__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Components__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Components__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Components__Group__1"


    // $ANTLR start "rule__Components__Group__1__Impl"
    // InternalArduino.g:679:1: rule__Components__Group__1__Impl : ( ( rule__Components__NameAssignment_1 ) ) ;
    public final void rule__Components__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:683:1: ( ( ( rule__Components__NameAssignment_1 ) ) )
            // InternalArduino.g:684:1: ( ( rule__Components__NameAssignment_1 ) )
            {
            // InternalArduino.g:684:1: ( ( rule__Components__NameAssignment_1 ) )
            // InternalArduino.g:685:2: ( rule__Components__NameAssignment_1 )
            {
             before(grammarAccess.getComponentsAccess().getNameAssignment_1()); 
            // InternalArduino.g:686:2: ( rule__Components__NameAssignment_1 )
            // InternalArduino.g:686:3: rule__Components__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Components__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentsAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Components__Group__1__Impl"


    // $ANTLR start "rule__Components__Group__2"
    // InternalArduino.g:694:1: rule__Components__Group__2 : rule__Components__Group__2__Impl rule__Components__Group__3 ;
    public final void rule__Components__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:698:1: ( rule__Components__Group__2__Impl rule__Components__Group__3 )
            // InternalArduino.g:699:2: rule__Components__Group__2__Impl rule__Components__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Components__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Components__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Components__Group__2"


    // $ANTLR start "rule__Components__Group__2__Impl"
    // InternalArduino.g:706:1: rule__Components__Group__2__Impl : ( '{' ) ;
    public final void rule__Components__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:710:1: ( ( '{' ) )
            // InternalArduino.g:711:1: ( '{' )
            {
            // InternalArduino.g:711:1: ( '{' )
            // InternalArduino.g:712:2: '{'
            {
             before(grammarAccess.getComponentsAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getComponentsAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Components__Group__2__Impl"


    // $ANTLR start "rule__Components__Group__3"
    // InternalArduino.g:721:1: rule__Components__Group__3 : rule__Components__Group__3__Impl rule__Components__Group__4 ;
    public final void rule__Components__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:725:1: ( rule__Components__Group__3__Impl rule__Components__Group__4 )
            // InternalArduino.g:726:2: rule__Components__Group__3__Impl rule__Components__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Components__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Components__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Components__Group__3"


    // $ANTLR start "rule__Components__Group__3__Impl"
    // InternalArduino.g:733:1: rule__Components__Group__3__Impl : ( 'type' ) ;
    public final void rule__Components__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:737:1: ( ( 'type' ) )
            // InternalArduino.g:738:1: ( 'type' )
            {
            // InternalArduino.g:738:1: ( 'type' )
            // InternalArduino.g:739:2: 'type'
            {
             before(grammarAccess.getComponentsAccess().getTypeKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getComponentsAccess().getTypeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Components__Group__3__Impl"


    // $ANTLR start "rule__Components__Group__4"
    // InternalArduino.g:748:1: rule__Components__Group__4 : rule__Components__Group__4__Impl rule__Components__Group__5 ;
    public final void rule__Components__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:752:1: ( rule__Components__Group__4__Impl rule__Components__Group__5 )
            // InternalArduino.g:753:2: rule__Components__Group__4__Impl rule__Components__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Components__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Components__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Components__Group__4"


    // $ANTLR start "rule__Components__Group__4__Impl"
    // InternalArduino.g:760:1: rule__Components__Group__4__Impl : ( '=' ) ;
    public final void rule__Components__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:764:1: ( ( '=' ) )
            // InternalArduino.g:765:1: ( '=' )
            {
            // InternalArduino.g:765:1: ( '=' )
            // InternalArduino.g:766:2: '='
            {
             before(grammarAccess.getComponentsAccess().getEqualsSignKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getComponentsAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Components__Group__4__Impl"


    // $ANTLR start "rule__Components__Group__5"
    // InternalArduino.g:775:1: rule__Components__Group__5 : rule__Components__Group__5__Impl rule__Components__Group__6 ;
    public final void rule__Components__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:779:1: ( rule__Components__Group__5__Impl rule__Components__Group__6 )
            // InternalArduino.g:780:2: rule__Components__Group__5__Impl rule__Components__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Components__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Components__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Components__Group__5"


    // $ANTLR start "rule__Components__Group__5__Impl"
    // InternalArduino.g:787:1: rule__Components__Group__5__Impl : ( '{' ) ;
    public final void rule__Components__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:791:1: ( ( '{' ) )
            // InternalArduino.g:792:1: ( '{' )
            {
            // InternalArduino.g:792:1: ( '{' )
            // InternalArduino.g:793:2: '{'
            {
             before(grammarAccess.getComponentsAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getComponentsAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Components__Group__5__Impl"


    // $ANTLR start "rule__Components__Group__6"
    // InternalArduino.g:802:1: rule__Components__Group__6 : rule__Components__Group__6__Impl rule__Components__Group__7 ;
    public final void rule__Components__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:806:1: ( rule__Components__Group__6__Impl rule__Components__Group__7 )
            // InternalArduino.g:807:2: rule__Components__Group__6__Impl rule__Components__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__Components__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Components__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Components__Group__6"


    // $ANTLR start "rule__Components__Group__6__Impl"
    // InternalArduino.g:814:1: rule__Components__Group__6__Impl : ( ruletype ) ;
    public final void rule__Components__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:818:1: ( ( ruletype ) )
            // InternalArduino.g:819:1: ( ruletype )
            {
            // InternalArduino.g:819:1: ( ruletype )
            // InternalArduino.g:820:2: ruletype
            {
             before(grammarAccess.getComponentsAccess().getTypeParserRuleCall_6()); 
            pushFollow(FOLLOW_2);
            ruletype();

            state._fsp--;

             after(grammarAccess.getComponentsAccess().getTypeParserRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Components__Group__6__Impl"


    // $ANTLR start "rule__Components__Group__7"
    // InternalArduino.g:829:1: rule__Components__Group__7 : rule__Components__Group__7__Impl rule__Components__Group__8 ;
    public final void rule__Components__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:833:1: ( rule__Components__Group__7__Impl rule__Components__Group__8 )
            // InternalArduino.g:834:2: rule__Components__Group__7__Impl rule__Components__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__Components__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Components__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Components__Group__7"


    // $ANTLR start "rule__Components__Group__7__Impl"
    // InternalArduino.g:841:1: rule__Components__Group__7__Impl : ( '}' ) ;
    public final void rule__Components__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:845:1: ( ( '}' ) )
            // InternalArduino.g:846:1: ( '}' )
            {
            // InternalArduino.g:846:1: ( '}' )
            // InternalArduino.g:847:2: '}'
            {
             before(grammarAccess.getComponentsAccess().getRightCurlyBracketKeyword_7()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getComponentsAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Components__Group__7__Impl"


    // $ANTLR start "rule__Components__Group__8"
    // InternalArduino.g:856:1: rule__Components__Group__8 : rule__Components__Group__8__Impl rule__Components__Group__9 ;
    public final void rule__Components__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:860:1: ( rule__Components__Group__8__Impl rule__Components__Group__9 )
            // InternalArduino.g:861:2: rule__Components__Group__8__Impl rule__Components__Group__9
            {
            pushFollow(FOLLOW_13);
            rule__Components__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Components__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Components__Group__8"


    // $ANTLR start "rule__Components__Group__8__Impl"
    // InternalArduino.g:868:1: rule__Components__Group__8__Impl : ( ',' ) ;
    public final void rule__Components__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:872:1: ( ( ',' ) )
            // InternalArduino.g:873:1: ( ',' )
            {
            // InternalArduino.g:873:1: ( ',' )
            // InternalArduino.g:874:2: ','
            {
             before(grammarAccess.getComponentsAccess().getCommaKeyword_8()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getComponentsAccess().getCommaKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Components__Group__8__Impl"


    // $ANTLR start "rule__Components__Group__9"
    // InternalArduino.g:883:1: rule__Components__Group__9 : rule__Components__Group__9__Impl rule__Components__Group__10 ;
    public final void rule__Components__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:887:1: ( rule__Components__Group__9__Impl rule__Components__Group__10 )
            // InternalArduino.g:888:2: rule__Components__Group__9__Impl rule__Components__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__Components__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Components__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Components__Group__9"


    // $ANTLR start "rule__Components__Group__9__Impl"
    // InternalArduino.g:895:1: rule__Components__Group__9__Impl : ( 'connectors' ) ;
    public final void rule__Components__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:899:1: ( ( 'connectors' ) )
            // InternalArduino.g:900:1: ( 'connectors' )
            {
            // InternalArduino.g:900:1: ( 'connectors' )
            // InternalArduino.g:901:2: 'connectors'
            {
             before(grammarAccess.getComponentsAccess().getConnectorsKeyword_9()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getComponentsAccess().getConnectorsKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Components__Group__9__Impl"


    // $ANTLR start "rule__Components__Group__10"
    // InternalArduino.g:910:1: rule__Components__Group__10 : rule__Components__Group__10__Impl rule__Components__Group__11 ;
    public final void rule__Components__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:914:1: ( rule__Components__Group__10__Impl rule__Components__Group__11 )
            // InternalArduino.g:915:2: rule__Components__Group__10__Impl rule__Components__Group__11
            {
            pushFollow(FOLLOW_14);
            rule__Components__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Components__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Components__Group__10"


    // $ANTLR start "rule__Components__Group__10__Impl"
    // InternalArduino.g:922:1: rule__Components__Group__10__Impl : ( '=' ) ;
    public final void rule__Components__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:926:1: ( ( '=' ) )
            // InternalArduino.g:927:1: ( '=' )
            {
            // InternalArduino.g:927:1: ( '=' )
            // InternalArduino.g:928:2: '='
            {
             before(grammarAccess.getComponentsAccess().getEqualsSignKeyword_10()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getComponentsAccess().getEqualsSignKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Components__Group__10__Impl"


    // $ANTLR start "rule__Components__Group__11"
    // InternalArduino.g:937:1: rule__Components__Group__11 : rule__Components__Group__11__Impl rule__Components__Group__12 ;
    public final void rule__Components__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:941:1: ( rule__Components__Group__11__Impl rule__Components__Group__12 )
            // InternalArduino.g:942:2: rule__Components__Group__11__Impl rule__Components__Group__12
            {
            pushFollow(FOLLOW_15);
            rule__Components__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Components__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Components__Group__11"


    // $ANTLR start "rule__Components__Group__11__Impl"
    // InternalArduino.g:949:1: rule__Components__Group__11__Impl : ( '[' ) ;
    public final void rule__Components__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:953:1: ( ( '[' ) )
            // InternalArduino.g:954:1: ( '[' )
            {
            // InternalArduino.g:954:1: ( '[' )
            // InternalArduino.g:955:2: '['
            {
             before(grammarAccess.getComponentsAccess().getLeftSquareBracketKeyword_11()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getComponentsAccess().getLeftSquareBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Components__Group__11__Impl"


    // $ANTLR start "rule__Components__Group__12"
    // InternalArduino.g:964:1: rule__Components__Group__12 : rule__Components__Group__12__Impl rule__Components__Group__13 ;
    public final void rule__Components__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:968:1: ( rule__Components__Group__12__Impl rule__Components__Group__13 )
            // InternalArduino.g:969:2: rule__Components__Group__12__Impl rule__Components__Group__13
            {
            pushFollow(FOLLOW_15);
            rule__Components__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Components__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Components__Group__12"


    // $ANTLR start "rule__Components__Group__12__Impl"
    // InternalArduino.g:976:1: rule__Components__Group__12__Impl : ( ( rule__Components__ConnectorsAssignment_12 )* ) ;
    public final void rule__Components__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:980:1: ( ( ( rule__Components__ConnectorsAssignment_12 )* ) )
            // InternalArduino.g:981:1: ( ( rule__Components__ConnectorsAssignment_12 )* )
            {
            // InternalArduino.g:981:1: ( ( rule__Components__ConnectorsAssignment_12 )* )
            // InternalArduino.g:982:2: ( rule__Components__ConnectorsAssignment_12 )*
            {
             before(grammarAccess.getComponentsAccess().getConnectorsAssignment_12()); 
            // InternalArduino.g:983:2: ( rule__Components__ConnectorsAssignment_12 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=14 && LA6_0<=22)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalArduino.g:983:3: rule__Components__ConnectorsAssignment_12
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Components__ConnectorsAssignment_12();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getComponentsAccess().getConnectorsAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Components__Group__12__Impl"


    // $ANTLR start "rule__Components__Group__13"
    // InternalArduino.g:991:1: rule__Components__Group__13 : rule__Components__Group__13__Impl rule__Components__Group__14 ;
    public final void rule__Components__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:995:1: ( rule__Components__Group__13__Impl rule__Components__Group__14 )
            // InternalArduino.g:996:2: rule__Components__Group__13__Impl rule__Components__Group__14
            {
            pushFollow(FOLLOW_12);
            rule__Components__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Components__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Components__Group__13"


    // $ANTLR start "rule__Components__Group__13__Impl"
    // InternalArduino.g:1003:1: rule__Components__Group__13__Impl : ( ']' ) ;
    public final void rule__Components__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1007:1: ( ( ']' ) )
            // InternalArduino.g:1008:1: ( ']' )
            {
            // InternalArduino.g:1008:1: ( ']' )
            // InternalArduino.g:1009:2: ']'
            {
             before(grammarAccess.getComponentsAccess().getRightSquareBracketKeyword_13()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getComponentsAccess().getRightSquareBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Components__Group__13__Impl"


    // $ANTLR start "rule__Components__Group__14"
    // InternalArduino.g:1018:1: rule__Components__Group__14 : rule__Components__Group__14__Impl rule__Components__Group__15 ;
    public final void rule__Components__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1022:1: ( rule__Components__Group__14__Impl rule__Components__Group__15 )
            // InternalArduino.g:1023:2: rule__Components__Group__14__Impl rule__Components__Group__15
            {
            pushFollow(FOLLOW_17);
            rule__Components__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Components__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Components__Group__14"


    // $ANTLR start "rule__Components__Group__14__Impl"
    // InternalArduino.g:1030:1: rule__Components__Group__14__Impl : ( ',' ) ;
    public final void rule__Components__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1034:1: ( ( ',' ) )
            // InternalArduino.g:1035:1: ( ',' )
            {
            // InternalArduino.g:1035:1: ( ',' )
            // InternalArduino.g:1036:2: ','
            {
             before(grammarAccess.getComponentsAccess().getCommaKeyword_14()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getComponentsAccess().getCommaKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Components__Group__14__Impl"


    // $ANTLR start "rule__Components__Group__15"
    // InternalArduino.g:1045:1: rule__Components__Group__15 : rule__Components__Group__15__Impl rule__Components__Group__16 ;
    public final void rule__Components__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1049:1: ( rule__Components__Group__15__Impl rule__Components__Group__16 )
            // InternalArduino.g:1050:2: rule__Components__Group__15__Impl rule__Components__Group__16
            {
            pushFollow(FOLLOW_17);
            rule__Components__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Components__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Components__Group__15"


    // $ANTLR start "rule__Components__Group__15__Impl"
    // InternalArduino.g:1057:1: rule__Components__Group__15__Impl : ( ( rule__Components__Group_15__0 )* ) ;
    public final void rule__Components__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1061:1: ( ( ( rule__Components__Group_15__0 )* ) )
            // InternalArduino.g:1062:1: ( ( rule__Components__Group_15__0 )* )
            {
            // InternalArduino.g:1062:1: ( ( rule__Components__Group_15__0 )* )
            // InternalArduino.g:1063:2: ( rule__Components__Group_15__0 )*
            {
             before(grammarAccess.getComponentsAccess().getGroup_15()); 
            // InternalArduino.g:1064:2: ( rule__Components__Group_15__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==35) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalArduino.g:1064:3: rule__Components__Group_15__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Components__Group_15__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getComponentsAccess().getGroup_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Components__Group__15__Impl"


    // $ANTLR start "rule__Components__Group__16"
    // InternalArduino.g:1072:1: rule__Components__Group__16 : rule__Components__Group__16__Impl ;
    public final void rule__Components__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1076:1: ( rule__Components__Group__16__Impl )
            // InternalArduino.g:1077:2: rule__Components__Group__16__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Components__Group__16__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Components__Group__16"


    // $ANTLR start "rule__Components__Group__16__Impl"
    // InternalArduino.g:1083:1: rule__Components__Group__16__Impl : ( '}' ) ;
    public final void rule__Components__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1087:1: ( ( '}' ) )
            // InternalArduino.g:1088:1: ( '}' )
            {
            // InternalArduino.g:1088:1: ( '}' )
            // InternalArduino.g:1089:2: '}'
            {
             before(grammarAccess.getComponentsAccess().getRightCurlyBracketKeyword_16()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getComponentsAccess().getRightCurlyBracketKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Components__Group__16__Impl"


    // $ANTLR start "rule__Components__Group_15__0"
    // InternalArduino.g:1099:1: rule__Components__Group_15__0 : rule__Components__Group_15__0__Impl rule__Components__Group_15__1 ;
    public final void rule__Components__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1103:1: ( rule__Components__Group_15__0__Impl rule__Components__Group_15__1 )
            // InternalArduino.g:1104:2: rule__Components__Group_15__0__Impl rule__Components__Group_15__1
            {
            pushFollow(FOLLOW_9);
            rule__Components__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Components__Group_15__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Components__Group_15__0"


    // $ANTLR start "rule__Components__Group_15__0__Impl"
    // InternalArduino.g:1111:1: rule__Components__Group_15__0__Impl : ( 'states' ) ;
    public final void rule__Components__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1115:1: ( ( 'states' ) )
            // InternalArduino.g:1116:1: ( 'states' )
            {
            // InternalArduino.g:1116:1: ( 'states' )
            // InternalArduino.g:1117:2: 'states'
            {
             before(grammarAccess.getComponentsAccess().getStatesKeyword_15_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getComponentsAccess().getStatesKeyword_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Components__Group_15__0__Impl"


    // $ANTLR start "rule__Components__Group_15__1"
    // InternalArduino.g:1126:1: rule__Components__Group_15__1 : rule__Components__Group_15__1__Impl rule__Components__Group_15__2 ;
    public final void rule__Components__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1130:1: ( rule__Components__Group_15__1__Impl rule__Components__Group_15__2 )
            // InternalArduino.g:1131:2: rule__Components__Group_15__1__Impl rule__Components__Group_15__2
            {
            pushFollow(FOLLOW_14);
            rule__Components__Group_15__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Components__Group_15__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Components__Group_15__1"


    // $ANTLR start "rule__Components__Group_15__1__Impl"
    // InternalArduino.g:1138:1: rule__Components__Group_15__1__Impl : ( '=' ) ;
    public final void rule__Components__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1142:1: ( ( '=' ) )
            // InternalArduino.g:1143:1: ( '=' )
            {
            // InternalArduino.g:1143:1: ( '=' )
            // InternalArduino.g:1144:2: '='
            {
             before(grammarAccess.getComponentsAccess().getEqualsSignKeyword_15_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getComponentsAccess().getEqualsSignKeyword_15_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Components__Group_15__1__Impl"


    // $ANTLR start "rule__Components__Group_15__2"
    // InternalArduino.g:1153:1: rule__Components__Group_15__2 : rule__Components__Group_15__2__Impl rule__Components__Group_15__3 ;
    public final void rule__Components__Group_15__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1157:1: ( rule__Components__Group_15__2__Impl rule__Components__Group_15__3 )
            // InternalArduino.g:1158:2: rule__Components__Group_15__2__Impl rule__Components__Group_15__3
            {
            pushFollow(FOLLOW_19);
            rule__Components__Group_15__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Components__Group_15__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Components__Group_15__2"


    // $ANTLR start "rule__Components__Group_15__2__Impl"
    // InternalArduino.g:1165:1: rule__Components__Group_15__2__Impl : ( '[' ) ;
    public final void rule__Components__Group_15__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1169:1: ( ( '[' ) )
            // InternalArduino.g:1170:1: ( '[' )
            {
            // InternalArduino.g:1170:1: ( '[' )
            // InternalArduino.g:1171:2: '['
            {
             before(grammarAccess.getComponentsAccess().getLeftSquareBracketKeyword_15_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getComponentsAccess().getLeftSquareBracketKeyword_15_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Components__Group_15__2__Impl"


    // $ANTLR start "rule__Components__Group_15__3"
    // InternalArduino.g:1180:1: rule__Components__Group_15__3 : rule__Components__Group_15__3__Impl rule__Components__Group_15__4 ;
    public final void rule__Components__Group_15__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1184:1: ( rule__Components__Group_15__3__Impl rule__Components__Group_15__4 )
            // InternalArduino.g:1185:2: rule__Components__Group_15__3__Impl rule__Components__Group_15__4
            {
            pushFollow(FOLLOW_19);
            rule__Components__Group_15__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Components__Group_15__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Components__Group_15__3"


    // $ANTLR start "rule__Components__Group_15__3__Impl"
    // InternalArduino.g:1192:1: rule__Components__Group_15__3__Impl : ( ( rule__Components__Component_stateAssignment_15_3 )* ) ;
    public final void rule__Components__Group_15__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1196:1: ( ( ( rule__Components__Component_stateAssignment_15_3 )* ) )
            // InternalArduino.g:1197:1: ( ( rule__Components__Component_stateAssignment_15_3 )* )
            {
            // InternalArduino.g:1197:1: ( ( rule__Components__Component_stateAssignment_15_3 )* )
            // InternalArduino.g:1198:2: ( rule__Components__Component_stateAssignment_15_3 )*
            {
             before(grammarAccess.getComponentsAccess().getComponent_stateAssignment_15_3()); 
            // InternalArduino.g:1199:2: ( rule__Components__Component_stateAssignment_15_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalArduino.g:1199:3: rule__Components__Component_stateAssignment_15_3
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Components__Component_stateAssignment_15_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getComponentsAccess().getComponent_stateAssignment_15_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Components__Group_15__3__Impl"


    // $ANTLR start "rule__Components__Group_15__4"
    // InternalArduino.g:1207:1: rule__Components__Group_15__4 : rule__Components__Group_15__4__Impl ;
    public final void rule__Components__Group_15__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1211:1: ( rule__Components__Group_15__4__Impl )
            // InternalArduino.g:1212:2: rule__Components__Group_15__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Components__Group_15__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Components__Group_15__4"


    // $ANTLR start "rule__Components__Group_15__4__Impl"
    // InternalArduino.g:1218:1: rule__Components__Group_15__4__Impl : ( ']' ) ;
    public final void rule__Components__Group_15__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1222:1: ( ( ']' ) )
            // InternalArduino.g:1223:1: ( ']' )
            {
            // InternalArduino.g:1223:1: ( ']' )
            // InternalArduino.g:1224:2: ']'
            {
             before(grammarAccess.getComponentsAccess().getRightSquareBracketKeyword_15_4()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getComponentsAccess().getRightSquareBracketKeyword_15_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Components__Group_15__4__Impl"


    // $ANTLR start "rule__Component_state__Group__0"
    // InternalArduino.g:1234:1: rule__Component_state__Group__0 : rule__Component_state__Group__0__Impl rule__Component_state__Group__1 ;
    public final void rule__Component_state__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1238:1: ( rule__Component_state__Group__0__Impl rule__Component_state__Group__1 )
            // InternalArduino.g:1239:2: rule__Component_state__Group__0__Impl rule__Component_state__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Component_state__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_state__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_state__Group__0"


    // $ANTLR start "rule__Component_state__Group__0__Impl"
    // InternalArduino.g:1246:1: rule__Component_state__Group__0__Impl : ( ( rule__Component_state__NameAssignment_0 ) ) ;
    public final void rule__Component_state__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1250:1: ( ( ( rule__Component_state__NameAssignment_0 ) ) )
            // InternalArduino.g:1251:1: ( ( rule__Component_state__NameAssignment_0 ) )
            {
            // InternalArduino.g:1251:1: ( ( rule__Component_state__NameAssignment_0 ) )
            // InternalArduino.g:1252:2: ( rule__Component_state__NameAssignment_0 )
            {
             before(grammarAccess.getComponent_stateAccess().getNameAssignment_0()); 
            // InternalArduino.g:1253:2: ( rule__Component_state__NameAssignment_0 )
            // InternalArduino.g:1253:3: rule__Component_state__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Component_state__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getComponent_stateAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_state__Group__0__Impl"


    // $ANTLR start "rule__Component_state__Group__1"
    // InternalArduino.g:1261:1: rule__Component_state__Group__1 : rule__Component_state__Group__1__Impl rule__Component_state__Group__2 ;
    public final void rule__Component_state__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1265:1: ( rule__Component_state__Group__1__Impl rule__Component_state__Group__2 )
            // InternalArduino.g:1266:2: rule__Component_state__Group__1__Impl rule__Component_state__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Component_state__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_state__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_state__Group__1"


    // $ANTLR start "rule__Component_state__Group__1__Impl"
    // InternalArduino.g:1273:1: rule__Component_state__Group__1__Impl : ( '{' ) ;
    public final void rule__Component_state__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1277:1: ( ( '{' ) )
            // InternalArduino.g:1278:1: ( '{' )
            {
            // InternalArduino.g:1278:1: ( '{' )
            // InternalArduino.g:1279:2: '{'
            {
             before(grammarAccess.getComponent_stateAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getComponent_stateAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_state__Group__1__Impl"


    // $ANTLR start "rule__Component_state__Group__2"
    // InternalArduino.g:1288:1: rule__Component_state__Group__2 : rule__Component_state__Group__2__Impl rule__Component_state__Group__3 ;
    public final void rule__Component_state__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1292:1: ( rule__Component_state__Group__2__Impl rule__Component_state__Group__3 )
            // InternalArduino.g:1293:2: rule__Component_state__Group__2__Impl rule__Component_state__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Component_state__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_state__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_state__Group__2"


    // $ANTLR start "rule__Component_state__Group__2__Impl"
    // InternalArduino.g:1300:1: rule__Component_state__Group__2__Impl : ( ruleconnector_definition ) ;
    public final void rule__Component_state__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1304:1: ( ( ruleconnector_definition ) )
            // InternalArduino.g:1305:1: ( ruleconnector_definition )
            {
            // InternalArduino.g:1305:1: ( ruleconnector_definition )
            // InternalArduino.g:1306:2: ruleconnector_definition
            {
             before(grammarAccess.getComponent_stateAccess().getConnector_definitionParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleconnector_definition();

            state._fsp--;

             after(grammarAccess.getComponent_stateAccess().getConnector_definitionParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_state__Group__2__Impl"


    // $ANTLR start "rule__Component_state__Group__3"
    // InternalArduino.g:1315:1: rule__Component_state__Group__3 : rule__Component_state__Group__3__Impl ;
    public final void rule__Component_state__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1319:1: ( rule__Component_state__Group__3__Impl )
            // InternalArduino.g:1320:2: rule__Component_state__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component_state__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_state__Group__3"


    // $ANTLR start "rule__Component_state__Group__3__Impl"
    // InternalArduino.g:1326:1: rule__Component_state__Group__3__Impl : ( '}' ) ;
    public final void rule__Component_state__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1330:1: ( ( '}' ) )
            // InternalArduino.g:1331:1: ( '}' )
            {
            // InternalArduino.g:1331:1: ( '}' )
            // InternalArduino.g:1332:2: '}'
            {
             before(grammarAccess.getComponent_stateAccess().getRightCurlyBracketKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getComponent_stateAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_state__Group__3__Impl"


    // $ANTLR start "rule__Connector_definition__Group__0"
    // InternalArduino.g:1342:1: rule__Connector_definition__Group__0 : rule__Connector_definition__Group__0__Impl rule__Connector_definition__Group__1 ;
    public final void rule__Connector_definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1346:1: ( rule__Connector_definition__Group__0__Impl rule__Connector_definition__Group__1 )
            // InternalArduino.g:1347:2: rule__Connector_definition__Group__0__Impl rule__Connector_definition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Connector_definition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connector_definition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector_definition__Group__0"


    // $ANTLR start "rule__Connector_definition__Group__0__Impl"
    // InternalArduino.g:1354:1: rule__Connector_definition__Group__0__Impl : ( ruleconnectors ) ;
    public final void rule__Connector_definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1358:1: ( ( ruleconnectors ) )
            // InternalArduino.g:1359:1: ( ruleconnectors )
            {
            // InternalArduino.g:1359:1: ( ruleconnectors )
            // InternalArduino.g:1360:2: ruleconnectors
            {
             before(grammarAccess.getConnector_definitionAccess().getConnectorsParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleconnectors();

            state._fsp--;

             after(grammarAccess.getConnector_definitionAccess().getConnectorsParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector_definition__Group__0__Impl"


    // $ANTLR start "rule__Connector_definition__Group__1"
    // InternalArduino.g:1369:1: rule__Connector_definition__Group__1 : rule__Connector_definition__Group__1__Impl rule__Connector_definition__Group__2 ;
    public final void rule__Connector_definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1373:1: ( rule__Connector_definition__Group__1__Impl rule__Connector_definition__Group__2 )
            // InternalArduino.g:1374:2: rule__Connector_definition__Group__1__Impl rule__Connector_definition__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__Connector_definition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connector_definition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector_definition__Group__1"


    // $ANTLR start "rule__Connector_definition__Group__1__Impl"
    // InternalArduino.g:1381:1: rule__Connector_definition__Group__1__Impl : ( '=' ) ;
    public final void rule__Connector_definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1385:1: ( ( '=' ) )
            // InternalArduino.g:1386:1: ( '=' )
            {
            // InternalArduino.g:1386:1: ( '=' )
            // InternalArduino.g:1387:2: '='
            {
             before(grammarAccess.getConnector_definitionAccess().getEqualsSignKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getConnector_definitionAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector_definition__Group__1__Impl"


    // $ANTLR start "rule__Connector_definition__Group__2"
    // InternalArduino.g:1396:1: rule__Connector_definition__Group__2 : rule__Connector_definition__Group__2__Impl ;
    public final void rule__Connector_definition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1400:1: ( rule__Connector_definition__Group__2__Impl )
            // InternalArduino.g:1401:2: rule__Connector_definition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Connector_definition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector_definition__Group__2"


    // $ANTLR start "rule__Connector_definition__Group__2__Impl"
    // InternalArduino.g:1407:1: rule__Connector_definition__Group__2__Impl : ( ruleLEVEL ) ;
    public final void rule__Connector_definition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1411:1: ( ( ruleLEVEL ) )
            // InternalArduino.g:1412:1: ( ruleLEVEL )
            {
            // InternalArduino.g:1412:1: ( ruleLEVEL )
            // InternalArduino.g:1413:2: ruleLEVEL
            {
             before(grammarAccess.getConnector_definitionAccess().getLEVELParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleLEVEL();

            state._fsp--;

             after(grammarAccess.getConnector_definitionAccess().getLEVELParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector_definition__Group__2__Impl"


    // $ANTLR start "rule__Connection__Group__0"
    // InternalArduino.g:1423:1: rule__Connection__Group__0 : rule__Connection__Group__0__Impl rule__Connection__Group__1 ;
    public final void rule__Connection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1427:1: ( rule__Connection__Group__0__Impl rule__Connection__Group__1 )
            // InternalArduino.g:1428:2: rule__Connection__Group__0__Impl rule__Connection__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Connection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__0"


    // $ANTLR start "rule__Connection__Group__0__Impl"
    // InternalArduino.g:1435:1: rule__Connection__Group__0__Impl : ( () ) ;
    public final void rule__Connection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1439:1: ( ( () ) )
            // InternalArduino.g:1440:1: ( () )
            {
            // InternalArduino.g:1440:1: ( () )
            // InternalArduino.g:1441:2: ()
            {
             before(grammarAccess.getConnectionAccess().getConnectionAction_0()); 
            // InternalArduino.g:1442:2: ()
            // InternalArduino.g:1442:3: 
            {
            }

             after(grammarAccess.getConnectionAccess().getConnectionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__0__Impl"


    // $ANTLR start "rule__Connection__Group__1"
    // InternalArduino.g:1450:1: rule__Connection__Group__1 : rule__Connection__Group__1__Impl rule__Connection__Group__2 ;
    public final void rule__Connection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1454:1: ( rule__Connection__Group__1__Impl rule__Connection__Group__2 )
            // InternalArduino.g:1455:2: rule__Connection__Group__1__Impl rule__Connection__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Connection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connection__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__1"


    // $ANTLR start "rule__Connection__Group__1__Impl"
    // InternalArduino.g:1462:1: rule__Connection__Group__1__Impl : ( 'connection' ) ;
    public final void rule__Connection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1466:1: ( ( 'connection' ) )
            // InternalArduino.g:1467:1: ( 'connection' )
            {
            // InternalArduino.g:1467:1: ( 'connection' )
            // InternalArduino.g:1468:2: 'connection'
            {
             before(grammarAccess.getConnectionAccess().getConnectionKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getConnectionAccess().getConnectionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__1__Impl"


    // $ANTLR start "rule__Connection__Group__2"
    // InternalArduino.g:1477:1: rule__Connection__Group__2 : rule__Connection__Group__2__Impl rule__Connection__Group__3 ;
    public final void rule__Connection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1481:1: ( rule__Connection__Group__2__Impl rule__Connection__Group__3 )
            // InternalArduino.g:1482:2: rule__Connection__Group__2__Impl rule__Connection__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__Connection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connection__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__2"


    // $ANTLR start "rule__Connection__Group__2__Impl"
    // InternalArduino.g:1489:1: rule__Connection__Group__2__Impl : ( '{' ) ;
    public final void rule__Connection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1493:1: ( ( '{' ) )
            // InternalArduino.g:1494:1: ( '{' )
            {
            // InternalArduino.g:1494:1: ( '{' )
            // InternalArduino.g:1495:2: '{'
            {
             before(grammarAccess.getConnectionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getConnectionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__2__Impl"


    // $ANTLR start "rule__Connection__Group__3"
    // InternalArduino.g:1504:1: rule__Connection__Group__3 : rule__Connection__Group__3__Impl rule__Connection__Group__4 ;
    public final void rule__Connection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1508:1: ( rule__Connection__Group__3__Impl rule__Connection__Group__4 )
            // InternalArduino.g:1509:2: rule__Connection__Group__3__Impl rule__Connection__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__Connection__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connection__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__3"


    // $ANTLR start "rule__Connection__Group__3__Impl"
    // InternalArduino.g:1516:1: rule__Connection__Group__3__Impl : ( ( rule__Connection__ComponentAssignment_3 )* ) ;
    public final void rule__Connection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1520:1: ( ( ( rule__Connection__ComponentAssignment_3 )* ) )
            // InternalArduino.g:1521:1: ( ( rule__Connection__ComponentAssignment_3 )* )
            {
            // InternalArduino.g:1521:1: ( ( rule__Connection__ComponentAssignment_3 )* )
            // InternalArduino.g:1522:2: ( rule__Connection__ComponentAssignment_3 )*
            {
             before(grammarAccess.getConnectionAccess().getComponentAssignment_3()); 
            // InternalArduino.g:1523:2: ( rule__Connection__ComponentAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==37) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalArduino.g:1523:3: rule__Connection__ComponentAssignment_3
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Connection__ComponentAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getConnectionAccess().getComponentAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__3__Impl"


    // $ANTLR start "rule__Connection__Group__4"
    // InternalArduino.g:1531:1: rule__Connection__Group__4 : rule__Connection__Group__4__Impl rule__Connection__Group__5 ;
    public final void rule__Connection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1535:1: ( rule__Connection__Group__4__Impl rule__Connection__Group__5 )
            // InternalArduino.g:1536:2: rule__Connection__Group__4__Impl rule__Connection__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__Connection__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connection__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__4"


    // $ANTLR start "rule__Connection__Group__4__Impl"
    // InternalArduino.g:1543:1: rule__Connection__Group__4__Impl : ( ( rule__Connection__WiringAssignment_4 )* ) ;
    public final void rule__Connection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1547:1: ( ( ( rule__Connection__WiringAssignment_4 )* ) )
            // InternalArduino.g:1548:1: ( ( rule__Connection__WiringAssignment_4 )* )
            {
            // InternalArduino.g:1548:1: ( ( rule__Connection__WiringAssignment_4 )* )
            // InternalArduino.g:1549:2: ( rule__Connection__WiringAssignment_4 )*
            {
             before(grammarAccess.getConnectionAccess().getWiringAssignment_4()); 
            // InternalArduino.g:1550:2: ( rule__Connection__WiringAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalArduino.g:1550:3: rule__Connection__WiringAssignment_4
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Connection__WiringAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getConnectionAccess().getWiringAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__4__Impl"


    // $ANTLR start "rule__Connection__Group__5"
    // InternalArduino.g:1558:1: rule__Connection__Group__5 : rule__Connection__Group__5__Impl ;
    public final void rule__Connection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1562:1: ( rule__Connection__Group__5__Impl )
            // InternalArduino.g:1563:2: rule__Connection__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Connection__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__5"


    // $ANTLR start "rule__Connection__Group__5__Impl"
    // InternalArduino.g:1569:1: rule__Connection__Group__5__Impl : ( '}' ) ;
    public final void rule__Connection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1573:1: ( ( '}' ) )
            // InternalArduino.g:1574:1: ( '}' )
            {
            // InternalArduino.g:1574:1: ( '}' )
            // InternalArduino.g:1575:2: '}'
            {
             before(grammarAccess.getConnectionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getConnectionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__5__Impl"


    // $ANTLR start "rule__Component__Group__0"
    // InternalArduino.g:1585:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1589:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalArduino.g:1590:2: rule__Component__Group__0__Impl rule__Component__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Component__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__0"


    // $ANTLR start "rule__Component__Group__0__Impl"
    // InternalArduino.g:1597:1: rule__Component__Group__0__Impl : ( 'new' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1601:1: ( ( 'new' ) )
            // InternalArduino.g:1602:1: ( 'new' )
            {
            // InternalArduino.g:1602:1: ( 'new' )
            // InternalArduino.g:1603:2: 'new'
            {
             before(grammarAccess.getComponentAccess().getNewKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getNewKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__0__Impl"


    // $ANTLR start "rule__Component__Group__1"
    // InternalArduino.g:1612:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1616:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalArduino.g:1617:2: rule__Component__Group__1__Impl rule__Component__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Component__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__1"


    // $ANTLR start "rule__Component__Group__1__Impl"
    // InternalArduino.g:1624:1: rule__Component__Group__1__Impl : ( ( rule__Component__ComponentsAssignment_1 ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1628:1: ( ( ( rule__Component__ComponentsAssignment_1 ) ) )
            // InternalArduino.g:1629:1: ( ( rule__Component__ComponentsAssignment_1 ) )
            {
            // InternalArduino.g:1629:1: ( ( rule__Component__ComponentsAssignment_1 ) )
            // InternalArduino.g:1630:2: ( rule__Component__ComponentsAssignment_1 )
            {
             before(grammarAccess.getComponentAccess().getComponentsAssignment_1()); 
            // InternalArduino.g:1631:2: ( rule__Component__ComponentsAssignment_1 )
            // InternalArduino.g:1631:3: rule__Component__ComponentsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__ComponentsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getComponentsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__1__Impl"


    // $ANTLR start "rule__Component__Group__2"
    // InternalArduino.g:1639:1: rule__Component__Group__2 : rule__Component__Group__2__Impl ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1643:1: ( rule__Component__Group__2__Impl )
            // InternalArduino.g:1644:2: rule__Component__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__2"


    // $ANTLR start "rule__Component__Group__2__Impl"
    // InternalArduino.g:1650:1: rule__Component__Group__2__Impl : ( ( rule__Component__NameAssignment_2 ) ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1654:1: ( ( ( rule__Component__NameAssignment_2 ) ) )
            // InternalArduino.g:1655:1: ( ( rule__Component__NameAssignment_2 ) )
            {
            // InternalArduino.g:1655:1: ( ( rule__Component__NameAssignment_2 ) )
            // InternalArduino.g:1656:2: ( rule__Component__NameAssignment_2 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_2()); 
            // InternalArduino.g:1657:2: ( rule__Component__NameAssignment_2 )
            // InternalArduino.g:1657:3: rule__Component__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Component__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__2__Impl"


    // $ANTLR start "rule__Wiring__Group__0"
    // InternalArduino.g:1666:1: rule__Wiring__Group__0 : rule__Wiring__Group__0__Impl rule__Wiring__Group__1 ;
    public final void rule__Wiring__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1670:1: ( rule__Wiring__Group__0__Impl rule__Wiring__Group__1 )
            // InternalArduino.g:1671:2: rule__Wiring__Group__0__Impl rule__Wiring__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Wiring__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wiring__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wiring__Group__0"


    // $ANTLR start "rule__Wiring__Group__0__Impl"
    // InternalArduino.g:1678:1: rule__Wiring__Group__0__Impl : ( ( rule__Wiring__SrcAssignment_0 ) ) ;
    public final void rule__Wiring__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1682:1: ( ( ( rule__Wiring__SrcAssignment_0 ) ) )
            // InternalArduino.g:1683:1: ( ( rule__Wiring__SrcAssignment_0 ) )
            {
            // InternalArduino.g:1683:1: ( ( rule__Wiring__SrcAssignment_0 ) )
            // InternalArduino.g:1684:2: ( rule__Wiring__SrcAssignment_0 )
            {
             before(grammarAccess.getWiringAccess().getSrcAssignment_0()); 
            // InternalArduino.g:1685:2: ( rule__Wiring__SrcAssignment_0 )
            // InternalArduino.g:1685:3: rule__Wiring__SrcAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Wiring__SrcAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getWiringAccess().getSrcAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wiring__Group__0__Impl"


    // $ANTLR start "rule__Wiring__Group__1"
    // InternalArduino.g:1693:1: rule__Wiring__Group__1 : rule__Wiring__Group__1__Impl rule__Wiring__Group__2 ;
    public final void rule__Wiring__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1697:1: ( rule__Wiring__Group__1__Impl rule__Wiring__Group__2 )
            // InternalArduino.g:1698:2: rule__Wiring__Group__1__Impl rule__Wiring__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Wiring__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wiring__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wiring__Group__1"


    // $ANTLR start "rule__Wiring__Group__1__Impl"
    // InternalArduino.g:1705:1: rule__Wiring__Group__1__Impl : ( '.' ) ;
    public final void rule__Wiring__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1709:1: ( ( '.' ) )
            // InternalArduino.g:1710:1: ( '.' )
            {
            // InternalArduino.g:1710:1: ( '.' )
            // InternalArduino.g:1711:2: '.'
            {
             before(grammarAccess.getWiringAccess().getFullStopKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getWiringAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wiring__Group__1__Impl"


    // $ANTLR start "rule__Wiring__Group__2"
    // InternalArduino.g:1720:1: rule__Wiring__Group__2 : rule__Wiring__Group__2__Impl rule__Wiring__Group__3 ;
    public final void rule__Wiring__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1724:1: ( rule__Wiring__Group__2__Impl rule__Wiring__Group__3 )
            // InternalArduino.g:1725:2: rule__Wiring__Group__2__Impl rule__Wiring__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Wiring__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wiring__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wiring__Group__2"


    // $ANTLR start "rule__Wiring__Group__2__Impl"
    // InternalArduino.g:1732:1: rule__Wiring__Group__2__Impl : ( ( rule__Wiring__Src_portAssignment_2 ) ) ;
    public final void rule__Wiring__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1736:1: ( ( ( rule__Wiring__Src_portAssignment_2 ) ) )
            // InternalArduino.g:1737:1: ( ( rule__Wiring__Src_portAssignment_2 ) )
            {
            // InternalArduino.g:1737:1: ( ( rule__Wiring__Src_portAssignment_2 ) )
            // InternalArduino.g:1738:2: ( rule__Wiring__Src_portAssignment_2 )
            {
             before(grammarAccess.getWiringAccess().getSrc_portAssignment_2()); 
            // InternalArduino.g:1739:2: ( rule__Wiring__Src_portAssignment_2 )
            // InternalArduino.g:1739:3: rule__Wiring__Src_portAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Wiring__Src_portAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWiringAccess().getSrc_portAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wiring__Group__2__Impl"


    // $ANTLR start "rule__Wiring__Group__3"
    // InternalArduino.g:1747:1: rule__Wiring__Group__3 : rule__Wiring__Group__3__Impl rule__Wiring__Group__4 ;
    public final void rule__Wiring__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1751:1: ( rule__Wiring__Group__3__Impl rule__Wiring__Group__4 )
            // InternalArduino.g:1752:2: rule__Wiring__Group__3__Impl rule__Wiring__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Wiring__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wiring__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wiring__Group__3"


    // $ANTLR start "rule__Wiring__Group__3__Impl"
    // InternalArduino.g:1759:1: rule__Wiring__Group__3__Impl : ( '=' ) ;
    public final void rule__Wiring__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1763:1: ( ( '=' ) )
            // InternalArduino.g:1764:1: ( '=' )
            {
            // InternalArduino.g:1764:1: ( '=' )
            // InternalArduino.g:1765:2: '='
            {
             before(grammarAccess.getWiringAccess().getEqualsSignKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getWiringAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wiring__Group__3__Impl"


    // $ANTLR start "rule__Wiring__Group__4"
    // InternalArduino.g:1774:1: rule__Wiring__Group__4 : rule__Wiring__Group__4__Impl rule__Wiring__Group__5 ;
    public final void rule__Wiring__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1778:1: ( rule__Wiring__Group__4__Impl rule__Wiring__Group__5 )
            // InternalArduino.g:1779:2: rule__Wiring__Group__4__Impl rule__Wiring__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__Wiring__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wiring__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wiring__Group__4"


    // $ANTLR start "rule__Wiring__Group__4__Impl"
    // InternalArduino.g:1786:1: rule__Wiring__Group__4__Impl : ( ( rule__Wiring__TarAssignment_4 ) ) ;
    public final void rule__Wiring__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1790:1: ( ( ( rule__Wiring__TarAssignment_4 ) ) )
            // InternalArduino.g:1791:1: ( ( rule__Wiring__TarAssignment_4 ) )
            {
            // InternalArduino.g:1791:1: ( ( rule__Wiring__TarAssignment_4 ) )
            // InternalArduino.g:1792:2: ( rule__Wiring__TarAssignment_4 )
            {
             before(grammarAccess.getWiringAccess().getTarAssignment_4()); 
            // InternalArduino.g:1793:2: ( rule__Wiring__TarAssignment_4 )
            // InternalArduino.g:1793:3: rule__Wiring__TarAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Wiring__TarAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getWiringAccess().getTarAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wiring__Group__4__Impl"


    // $ANTLR start "rule__Wiring__Group__5"
    // InternalArduino.g:1801:1: rule__Wiring__Group__5 : rule__Wiring__Group__5__Impl rule__Wiring__Group__6 ;
    public final void rule__Wiring__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1805:1: ( rule__Wiring__Group__5__Impl rule__Wiring__Group__6 )
            // InternalArduino.g:1806:2: rule__Wiring__Group__5__Impl rule__Wiring__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__Wiring__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wiring__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wiring__Group__5"


    // $ANTLR start "rule__Wiring__Group__5__Impl"
    // InternalArduino.g:1813:1: rule__Wiring__Group__5__Impl : ( '.' ) ;
    public final void rule__Wiring__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1817:1: ( ( '.' ) )
            // InternalArduino.g:1818:1: ( '.' )
            {
            // InternalArduino.g:1818:1: ( '.' )
            // InternalArduino.g:1819:2: '.'
            {
             before(grammarAccess.getWiringAccess().getFullStopKeyword_5()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getWiringAccess().getFullStopKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wiring__Group__5__Impl"


    // $ANTLR start "rule__Wiring__Group__6"
    // InternalArduino.g:1828:1: rule__Wiring__Group__6 : rule__Wiring__Group__6__Impl ;
    public final void rule__Wiring__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1832:1: ( rule__Wiring__Group__6__Impl )
            // InternalArduino.g:1833:2: rule__Wiring__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Wiring__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wiring__Group__6"


    // $ANTLR start "rule__Wiring__Group__6__Impl"
    // InternalArduino.g:1839:1: rule__Wiring__Group__6__Impl : ( ( rule__Wiring__Tar_portAssignment_6 ) ) ;
    public final void rule__Wiring__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1843:1: ( ( ( rule__Wiring__Tar_portAssignment_6 ) ) )
            // InternalArduino.g:1844:1: ( ( rule__Wiring__Tar_portAssignment_6 ) )
            {
            // InternalArduino.g:1844:1: ( ( rule__Wiring__Tar_portAssignment_6 ) )
            // InternalArduino.g:1845:2: ( rule__Wiring__Tar_portAssignment_6 )
            {
             before(grammarAccess.getWiringAccess().getTar_portAssignment_6()); 
            // InternalArduino.g:1846:2: ( rule__Wiring__Tar_portAssignment_6 )
            // InternalArduino.g:1846:3: rule__Wiring__Tar_portAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Wiring__Tar_portAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getWiringAccess().getTar_portAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wiring__Group__6__Impl"


    // $ANTLR start "rule__Behavior__Group__0"
    // InternalArduino.g:1855:1: rule__Behavior__Group__0 : rule__Behavior__Group__0__Impl rule__Behavior__Group__1 ;
    public final void rule__Behavior__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1859:1: ( rule__Behavior__Group__0__Impl rule__Behavior__Group__1 )
            // InternalArduino.g:1860:2: rule__Behavior__Group__0__Impl rule__Behavior__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Behavior__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Behavior__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group__0"


    // $ANTLR start "rule__Behavior__Group__0__Impl"
    // InternalArduino.g:1867:1: rule__Behavior__Group__0__Impl : ( () ) ;
    public final void rule__Behavior__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1871:1: ( ( () ) )
            // InternalArduino.g:1872:1: ( () )
            {
            // InternalArduino.g:1872:1: ( () )
            // InternalArduino.g:1873:2: ()
            {
             before(grammarAccess.getBehaviorAccess().getBehaviorAction_0()); 
            // InternalArduino.g:1874:2: ()
            // InternalArduino.g:1874:3: 
            {
            }

             after(grammarAccess.getBehaviorAccess().getBehaviorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group__0__Impl"


    // $ANTLR start "rule__Behavior__Group__1"
    // InternalArduino.g:1882:1: rule__Behavior__Group__1 : rule__Behavior__Group__1__Impl rule__Behavior__Group__2 ;
    public final void rule__Behavior__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1886:1: ( rule__Behavior__Group__1__Impl rule__Behavior__Group__2 )
            // InternalArduino.g:1887:2: rule__Behavior__Group__1__Impl rule__Behavior__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Behavior__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Behavior__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group__1"


    // $ANTLR start "rule__Behavior__Group__1__Impl"
    // InternalArduino.g:1894:1: rule__Behavior__Group__1__Impl : ( 'behavior' ) ;
    public final void rule__Behavior__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1898:1: ( ( 'behavior' ) )
            // InternalArduino.g:1899:1: ( 'behavior' )
            {
            // InternalArduino.g:1899:1: ( 'behavior' )
            // InternalArduino.g:1900:2: 'behavior'
            {
             before(grammarAccess.getBehaviorAccess().getBehaviorKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getBehaviorAccess().getBehaviorKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group__1__Impl"


    // $ANTLR start "rule__Behavior__Group__2"
    // InternalArduino.g:1909:1: rule__Behavior__Group__2 : rule__Behavior__Group__2__Impl rule__Behavior__Group__3 ;
    public final void rule__Behavior__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1913:1: ( rule__Behavior__Group__2__Impl rule__Behavior__Group__3 )
            // InternalArduino.g:1914:2: rule__Behavior__Group__2__Impl rule__Behavior__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__Behavior__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Behavior__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group__2"


    // $ANTLR start "rule__Behavior__Group__2__Impl"
    // InternalArduino.g:1921:1: rule__Behavior__Group__2__Impl : ( '{' ) ;
    public final void rule__Behavior__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1925:1: ( ( '{' ) )
            // InternalArduino.g:1926:1: ( '{' )
            {
            // InternalArduino.g:1926:1: ( '{' )
            // InternalArduino.g:1927:2: '{'
            {
             before(grammarAccess.getBehaviorAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getBehaviorAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group__2__Impl"


    // $ANTLR start "rule__Behavior__Group__3"
    // InternalArduino.g:1936:1: rule__Behavior__Group__3 : rule__Behavior__Group__3__Impl rule__Behavior__Group__4 ;
    public final void rule__Behavior__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1940:1: ( rule__Behavior__Group__3__Impl rule__Behavior__Group__4 )
            // InternalArduino.g:1941:2: rule__Behavior__Group__3__Impl rule__Behavior__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__Behavior__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Behavior__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group__3"


    // $ANTLR start "rule__Behavior__Group__3__Impl"
    // InternalArduino.g:1948:1: rule__Behavior__Group__3__Impl : ( '@startuml' ) ;
    public final void rule__Behavior__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1952:1: ( ( '@startuml' ) )
            // InternalArduino.g:1953:1: ( '@startuml' )
            {
            // InternalArduino.g:1953:1: ( '@startuml' )
            // InternalArduino.g:1954:2: '@startuml'
            {
             before(grammarAccess.getBehaviorAccess().getStartumlKeyword_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getBehaviorAccess().getStartumlKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group__3__Impl"


    // $ANTLR start "rule__Behavior__Group__4"
    // InternalArduino.g:1963:1: rule__Behavior__Group__4 : rule__Behavior__Group__4__Impl rule__Behavior__Group__5 ;
    public final void rule__Behavior__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1967:1: ( rule__Behavior__Group__4__Impl rule__Behavior__Group__5 )
            // InternalArduino.g:1968:2: rule__Behavior__Group__4__Impl rule__Behavior__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__Behavior__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Behavior__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group__4"


    // $ANTLR start "rule__Behavior__Group__4__Impl"
    // InternalArduino.g:1975:1: rule__Behavior__Group__4__Impl : ( ( rule__Behavior__StatesAssignment_4 )* ) ;
    public final void rule__Behavior__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1979:1: ( ( ( rule__Behavior__StatesAssignment_4 )* ) )
            // InternalArduino.g:1980:1: ( ( rule__Behavior__StatesAssignment_4 )* )
            {
            // InternalArduino.g:1980:1: ( ( rule__Behavior__StatesAssignment_4 )* )
            // InternalArduino.g:1981:2: ( rule__Behavior__StatesAssignment_4 )*
            {
             before(grammarAccess.getBehaviorAccess().getStatesAssignment_4()); 
            // InternalArduino.g:1982:2: ( rule__Behavior__StatesAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    int LA11_2 = input.LA(2);

                    if ( (LA11_2==43) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // InternalArduino.g:1982:3: rule__Behavior__StatesAssignment_4
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Behavior__StatesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getBehaviorAccess().getStatesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group__4__Impl"


    // $ANTLR start "rule__Behavior__Group__5"
    // InternalArduino.g:1990:1: rule__Behavior__Group__5 : rule__Behavior__Group__5__Impl rule__Behavior__Group__6 ;
    public final void rule__Behavior__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1994:1: ( rule__Behavior__Group__5__Impl rule__Behavior__Group__6 )
            // InternalArduino.g:1995:2: rule__Behavior__Group__5__Impl rule__Behavior__Group__6
            {
            pushFollow(FOLLOW_27);
            rule__Behavior__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Behavior__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group__5"


    // $ANTLR start "rule__Behavior__Group__5__Impl"
    // InternalArduino.g:2002:1: rule__Behavior__Group__5__Impl : ( ( rule__Behavior__TransitionsAssignment_5 )* ) ;
    public final void rule__Behavior__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2006:1: ( ( ( rule__Behavior__TransitionsAssignment_5 )* ) )
            // InternalArduino.g:2007:1: ( ( rule__Behavior__TransitionsAssignment_5 )* )
            {
            // InternalArduino.g:2007:1: ( ( rule__Behavior__TransitionsAssignment_5 )* )
            // InternalArduino.g:2008:2: ( rule__Behavior__TransitionsAssignment_5 )*
            {
             before(grammarAccess.getBehaviorAccess().getTransitionsAssignment_5()); 
            // InternalArduino.g:2009:2: ( rule__Behavior__TransitionsAssignment_5 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||LA12_0==25) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalArduino.g:2009:3: rule__Behavior__TransitionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__Behavior__TransitionsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getBehaviorAccess().getTransitionsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group__5__Impl"


    // $ANTLR start "rule__Behavior__Group__6"
    // InternalArduino.g:2017:1: rule__Behavior__Group__6 : rule__Behavior__Group__6__Impl rule__Behavior__Group__7 ;
    public final void rule__Behavior__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2021:1: ( rule__Behavior__Group__6__Impl rule__Behavior__Group__7 )
            // InternalArduino.g:2022:2: rule__Behavior__Group__6__Impl rule__Behavior__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__Behavior__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Behavior__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group__6"


    // $ANTLR start "rule__Behavior__Group__6__Impl"
    // InternalArduino.g:2029:1: rule__Behavior__Group__6__Impl : ( '@enduml' ) ;
    public final void rule__Behavior__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2033:1: ( ( '@enduml' ) )
            // InternalArduino.g:2034:1: ( '@enduml' )
            {
            // InternalArduino.g:2034:1: ( '@enduml' )
            // InternalArduino.g:2035:2: '@enduml'
            {
             before(grammarAccess.getBehaviorAccess().getEndumlKeyword_6()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getBehaviorAccess().getEndumlKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group__6__Impl"


    // $ANTLR start "rule__Behavior__Group__7"
    // InternalArduino.g:2044:1: rule__Behavior__Group__7 : rule__Behavior__Group__7__Impl ;
    public final void rule__Behavior__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2048:1: ( rule__Behavior__Group__7__Impl )
            // InternalArduino.g:2049:2: rule__Behavior__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Behavior__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group__7"


    // $ANTLR start "rule__Behavior__Group__7__Impl"
    // InternalArduino.g:2055:1: rule__Behavior__Group__7__Impl : ( '}' ) ;
    public final void rule__Behavior__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2059:1: ( ( '}' ) )
            // InternalArduino.g:2060:1: ( '}' )
            {
            // InternalArduino.g:2060:1: ( '}' )
            // InternalArduino.g:2061:2: '}'
            {
             before(grammarAccess.getBehaviorAccess().getRightCurlyBracketKeyword_7()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getBehaviorAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group__7__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // InternalArduino.g:2071:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2075:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalArduino.g:2076:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0"


    // $ANTLR start "rule__Transition__Group__0__Impl"
    // InternalArduino.g:2083:1: rule__Transition__Group__0__Impl : ( ( rule__Transition__Alternatives_0 ) ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2087:1: ( ( ( rule__Transition__Alternatives_0 ) ) )
            // InternalArduino.g:2088:1: ( ( rule__Transition__Alternatives_0 ) )
            {
            // InternalArduino.g:2088:1: ( ( rule__Transition__Alternatives_0 ) )
            // InternalArduino.g:2089:2: ( rule__Transition__Alternatives_0 )
            {
             before(grammarAccess.getTransitionAccess().getAlternatives_0()); 
            // InternalArduino.g:2090:2: ( rule__Transition__Alternatives_0 )
            // InternalArduino.g:2090:3: rule__Transition__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // InternalArduino.g:2098:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2102:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalArduino.g:2103:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1"


    // $ANTLR start "rule__Transition__Group__1__Impl"
    // InternalArduino.g:2110:1: rule__Transition__Group__1__Impl : ( '-->' ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2114:1: ( ( '-->' ) )
            // InternalArduino.g:2115:1: ( '-->' )
            {
            // InternalArduino.g:2115:1: ( '-->' )
            // InternalArduino.g:2116:2: '-->'
            {
             before(grammarAccess.getTransitionAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__2"
    // InternalArduino.g:2125:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2129:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // InternalArduino.g:2130:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__Transition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2"


    // $ANTLR start "rule__Transition__Group__2__Impl"
    // InternalArduino.g:2137:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__Tar_stateAssignment_2 ) ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2141:1: ( ( ( rule__Transition__Tar_stateAssignment_2 ) ) )
            // InternalArduino.g:2142:1: ( ( rule__Transition__Tar_stateAssignment_2 ) )
            {
            // InternalArduino.g:2142:1: ( ( rule__Transition__Tar_stateAssignment_2 ) )
            // InternalArduino.g:2143:2: ( rule__Transition__Tar_stateAssignment_2 )
            {
             before(grammarAccess.getTransitionAccess().getTar_stateAssignment_2()); 
            // InternalArduino.g:2144:2: ( rule__Transition__Tar_stateAssignment_2 )
            // InternalArduino.g:2144:3: rule__Transition__Tar_stateAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Tar_stateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getTar_stateAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2__Impl"


    // $ANTLR start "rule__Transition__Group__3"
    // InternalArduino.g:2152:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2156:1: ( rule__Transition__Group__3__Impl )
            // InternalArduino.g:2157:2: rule__Transition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3"


    // $ANTLR start "rule__Transition__Group__3__Impl"
    // InternalArduino.g:2163:1: rule__Transition__Group__3__Impl : ( ( rule__Transition__Transition_effectAssignment_3 )? ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2167:1: ( ( ( rule__Transition__Transition_effectAssignment_3 )? ) )
            // InternalArduino.g:2168:1: ( ( rule__Transition__Transition_effectAssignment_3 )? )
            {
            // InternalArduino.g:2168:1: ( ( rule__Transition__Transition_effectAssignment_3 )? )
            // InternalArduino.g:2169:2: ( rule__Transition__Transition_effectAssignment_3 )?
            {
             before(grammarAccess.getTransitionAccess().getTransition_effectAssignment_3()); 
            // InternalArduino.g:2170:2: ( rule__Transition__Transition_effectAssignment_3 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==43) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalArduino.g:2170:3: rule__Transition__Transition_effectAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__Transition_effectAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getTransition_effectAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3__Impl"


    // $ANTLR start "rule__Transition_effect__Group__0"
    // InternalArduino.g:2179:1: rule__Transition_effect__Group__0 : rule__Transition_effect__Group__0__Impl rule__Transition_effect__Group__1 ;
    public final void rule__Transition_effect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2183:1: ( rule__Transition_effect__Group__0__Impl rule__Transition_effect__Group__1 )
            // InternalArduino.g:2184:2: rule__Transition_effect__Group__0__Impl rule__Transition_effect__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__Transition_effect__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition_effect__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition_effect__Group__0"


    // $ANTLR start "rule__Transition_effect__Group__0__Impl"
    // InternalArduino.g:2191:1: rule__Transition_effect__Group__0__Impl : ( ':' ) ;
    public final void rule__Transition_effect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2195:1: ( ( ':' ) )
            // InternalArduino.g:2196:1: ( ':' )
            {
            // InternalArduino.g:2196:1: ( ':' )
            // InternalArduino.g:2197:2: ':'
            {
             before(grammarAccess.getTransition_effectAccess().getColonKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getTransition_effectAccess().getColonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition_effect__Group__0__Impl"


    // $ANTLR start "rule__Transition_effect__Group__1"
    // InternalArduino.g:2206:1: rule__Transition_effect__Group__1 : rule__Transition_effect__Group__1__Impl rule__Transition_effect__Group__2 ;
    public final void rule__Transition_effect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2210:1: ( rule__Transition_effect__Group__1__Impl rule__Transition_effect__Group__2 )
            // InternalArduino.g:2211:2: rule__Transition_effect__Group__1__Impl rule__Transition_effect__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Transition_effect__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition_effect__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition_effect__Group__1"


    // $ANTLR start "rule__Transition_effect__Group__1__Impl"
    // InternalArduino.g:2218:1: rule__Transition_effect__Group__1__Impl : ( 'delay' ) ;
    public final void rule__Transition_effect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2222:1: ( ( 'delay' ) )
            // InternalArduino.g:2223:1: ( 'delay' )
            {
            // InternalArduino.g:2223:1: ( 'delay' )
            // InternalArduino.g:2224:2: 'delay'
            {
             before(grammarAccess.getTransition_effectAccess().getDelayKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getTransition_effectAccess().getDelayKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition_effect__Group__1__Impl"


    // $ANTLR start "rule__Transition_effect__Group__2"
    // InternalArduino.g:2233:1: rule__Transition_effect__Group__2 : rule__Transition_effect__Group__2__Impl rule__Transition_effect__Group__3 ;
    public final void rule__Transition_effect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2237:1: ( rule__Transition_effect__Group__2__Impl rule__Transition_effect__Group__3 )
            // InternalArduino.g:2238:2: rule__Transition_effect__Group__2__Impl rule__Transition_effect__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__Transition_effect__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition_effect__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition_effect__Group__2"


    // $ANTLR start "rule__Transition_effect__Group__2__Impl"
    // InternalArduino.g:2245:1: rule__Transition_effect__Group__2__Impl : ( '[' ) ;
    public final void rule__Transition_effect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2249:1: ( ( '[' ) )
            // InternalArduino.g:2250:1: ( '[' )
            {
            // InternalArduino.g:2250:1: ( '[' )
            // InternalArduino.g:2251:2: '['
            {
             before(grammarAccess.getTransition_effectAccess().getLeftSquareBracketKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getTransition_effectAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition_effect__Group__2__Impl"


    // $ANTLR start "rule__Transition_effect__Group__3"
    // InternalArduino.g:2260:1: rule__Transition_effect__Group__3 : rule__Transition_effect__Group__3__Impl rule__Transition_effect__Group__4 ;
    public final void rule__Transition_effect__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2264:1: ( rule__Transition_effect__Group__3__Impl rule__Transition_effect__Group__4 )
            // InternalArduino.g:2265:2: rule__Transition_effect__Group__3__Impl rule__Transition_effect__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__Transition_effect__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition_effect__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition_effect__Group__3"


    // $ANTLR start "rule__Transition_effect__Group__3__Impl"
    // InternalArduino.g:2272:1: rule__Transition_effect__Group__3__Impl : ( ( rule__Transition_effect__MicrosecondsAssignment_3 ) ) ;
    public final void rule__Transition_effect__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2276:1: ( ( ( rule__Transition_effect__MicrosecondsAssignment_3 ) ) )
            // InternalArduino.g:2277:1: ( ( rule__Transition_effect__MicrosecondsAssignment_3 ) )
            {
            // InternalArduino.g:2277:1: ( ( rule__Transition_effect__MicrosecondsAssignment_3 ) )
            // InternalArduino.g:2278:2: ( rule__Transition_effect__MicrosecondsAssignment_3 )
            {
             before(grammarAccess.getTransition_effectAccess().getMicrosecondsAssignment_3()); 
            // InternalArduino.g:2279:2: ( rule__Transition_effect__MicrosecondsAssignment_3 )
            // InternalArduino.g:2279:3: rule__Transition_effect__MicrosecondsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Transition_effect__MicrosecondsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTransition_effectAccess().getMicrosecondsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition_effect__Group__3__Impl"


    // $ANTLR start "rule__Transition_effect__Group__4"
    // InternalArduino.g:2287:1: rule__Transition_effect__Group__4 : rule__Transition_effect__Group__4__Impl ;
    public final void rule__Transition_effect__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2291:1: ( rule__Transition_effect__Group__4__Impl )
            // InternalArduino.g:2292:2: rule__Transition_effect__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition_effect__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition_effect__Group__4"


    // $ANTLR start "rule__Transition_effect__Group__4__Impl"
    // InternalArduino.g:2298:1: rule__Transition_effect__Group__4__Impl : ( ']' ) ;
    public final void rule__Transition_effect__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2302:1: ( ( ']' ) )
            // InternalArduino.g:2303:1: ( ']' )
            {
            // InternalArduino.g:2303:1: ( ']' )
            // InternalArduino.g:2304:2: ']'
            {
             before(grammarAccess.getTransition_effectAccess().getRightSquareBracketKeyword_4()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getTransition_effectAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition_effect__Group__4__Impl"


    // $ANTLR start "rule__State__Group__0"
    // InternalArduino.g:2314:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2318:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalArduino.g:2319:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__State__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0"


    // $ANTLR start "rule__State__Group__0__Impl"
    // InternalArduino.g:2326:1: rule__State__Group__0__Impl : ( ( rule__State__NameAssignment_0 ) ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2330:1: ( ( ( rule__State__NameAssignment_0 ) ) )
            // InternalArduino.g:2331:1: ( ( rule__State__NameAssignment_0 ) )
            {
            // InternalArduino.g:2331:1: ( ( rule__State__NameAssignment_0 ) )
            // InternalArduino.g:2332:2: ( rule__State__NameAssignment_0 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_0()); 
            // InternalArduino.g:2333:2: ( rule__State__NameAssignment_0 )
            // InternalArduino.g:2333:3: rule__State__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__State__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0__Impl"


    // $ANTLR start "rule__State__Group__1"
    // InternalArduino.g:2341:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2345:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // InternalArduino.g:2346:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__State__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1"


    // $ANTLR start "rule__State__Group__1__Impl"
    // InternalArduino.g:2353:1: rule__State__Group__1__Impl : ( ':' ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2357:1: ( ( ':' ) )
            // InternalArduino.g:2358:1: ( ':' )
            {
            // InternalArduino.g:2358:1: ( ':' )
            // InternalArduino.g:2359:2: ':'
            {
             before(grammarAccess.getStateAccess().getColonKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1__Impl"


    // $ANTLR start "rule__State__Group__2"
    // InternalArduino.g:2368:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2372:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // InternalArduino.g:2373:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__State__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2"


    // $ANTLR start "rule__State__Group__2__Impl"
    // InternalArduino.g:2380:1: rule__State__Group__2__Impl : ( ( rule__State__ComponentAssignment_2 ) ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2384:1: ( ( ( rule__State__ComponentAssignment_2 ) ) )
            // InternalArduino.g:2385:1: ( ( rule__State__ComponentAssignment_2 ) )
            {
            // InternalArduino.g:2385:1: ( ( rule__State__ComponentAssignment_2 ) )
            // InternalArduino.g:2386:2: ( rule__State__ComponentAssignment_2 )
            {
             before(grammarAccess.getStateAccess().getComponentAssignment_2()); 
            // InternalArduino.g:2387:2: ( rule__State__ComponentAssignment_2 )
            // InternalArduino.g:2387:3: rule__State__ComponentAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__State__ComponentAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getComponentAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2__Impl"


    // $ANTLR start "rule__State__Group__3"
    // InternalArduino.g:2395:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2399:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // InternalArduino.g:2400:2: rule__State__Group__3__Impl rule__State__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__State__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__3"


    // $ANTLR start "rule__State__Group__3__Impl"
    // InternalArduino.g:2407:1: rule__State__Group__3__Impl : ( '.state' ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2411:1: ( ( '.state' ) )
            // InternalArduino.g:2412:1: ( '.state' )
            {
            // InternalArduino.g:2412:1: ( '.state' )
            // InternalArduino.g:2413:2: '.state'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_3()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getStateKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__3__Impl"


    // $ANTLR start "rule__State__Group__4"
    // InternalArduino.g:2422:1: rule__State__Group__4 : rule__State__Group__4__Impl rule__State__Group__5 ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2426:1: ( rule__State__Group__4__Impl rule__State__Group__5 )
            // InternalArduino.g:2427:2: rule__State__Group__4__Impl rule__State__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__State__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__4"


    // $ANTLR start "rule__State__Group__4__Impl"
    // InternalArduino.g:2434:1: rule__State__Group__4__Impl : ( '=' ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2438:1: ( ( '=' ) )
            // InternalArduino.g:2439:1: ( '=' )
            {
            // InternalArduino.g:2439:1: ( '=' )
            // InternalArduino.g:2440:2: '='
            {
             before(grammarAccess.getStateAccess().getEqualsSignKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__4__Impl"


    // $ANTLR start "rule__State__Group__5"
    // InternalArduino.g:2449:1: rule__State__Group__5 : rule__State__Group__5__Impl ;
    public final void rule__State__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2453:1: ( rule__State__Group__5__Impl )
            // InternalArduino.g:2454:2: rule__State__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__5"


    // $ANTLR start "rule__State__Group__5__Impl"
    // InternalArduino.g:2460:1: rule__State__Group__5__Impl : ( ( rule__State__Component_stateAssignment_5 ) ) ;
    public final void rule__State__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2464:1: ( ( ( rule__State__Component_stateAssignment_5 ) ) )
            // InternalArduino.g:2465:1: ( ( rule__State__Component_stateAssignment_5 ) )
            {
            // InternalArduino.g:2465:1: ( ( rule__State__Component_stateAssignment_5 ) )
            // InternalArduino.g:2466:2: ( rule__State__Component_stateAssignment_5 )
            {
             before(grammarAccess.getStateAccess().getComponent_stateAssignment_5()); 
            // InternalArduino.g:2467:2: ( rule__State__Component_stateAssignment_5 )
            // InternalArduino.g:2467:3: rule__State__Component_stateAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__State__Component_stateAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getComponent_stateAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__5__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // InternalArduino.g:2476:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2480:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalArduino.g:2481:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__FQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FQN__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0"


    // $ANTLR start "rule__FQN__Group__0__Impl"
    // InternalArduino.g:2488:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2492:1: ( ( RULE_ID ) )
            // InternalArduino.g:2493:1: ( RULE_ID )
            {
            // InternalArduino.g:2493:1: ( RULE_ID )
            // InternalArduino.g:2494:2: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0__Impl"


    // $ANTLR start "rule__FQN__Group__1"
    // InternalArduino.g:2503:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2507:1: ( rule__FQN__Group__1__Impl )
            // InternalArduino.g:2508:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1"


    // $ANTLR start "rule__FQN__Group__1__Impl"
    // InternalArduino.g:2514:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2518:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalArduino.g:2519:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalArduino.g:2519:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalArduino.g:2520:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalArduino.g:2521:2: ( rule__FQN__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==38) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalArduino.g:2521:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getFQNAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group_1__0"
    // InternalArduino.g:2530:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2534:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalArduino.g:2535:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FQN__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0"


    // $ANTLR start "rule__FQN__Group_1__0__Impl"
    // InternalArduino.g:2542:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2546:1: ( ( '.' ) )
            // InternalArduino.g:2547:1: ( '.' )
            {
            // InternalArduino.g:2547:1: ( '.' )
            // InternalArduino.g:2548:2: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0__Impl"


    // $ANTLR start "rule__FQN__Group_1__1"
    // InternalArduino.g:2557:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2561:1: ( rule__FQN__Group_1__1__Impl )
            // InternalArduino.g:2562:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1"


    // $ANTLR start "rule__FQN__Group_1__1__Impl"
    // InternalArduino.g:2568:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2572:1: ( ( RULE_ID ) )
            // InternalArduino.g:2573:1: ( RULE_ID )
            {
            // InternalArduino.g:2573:1: ( RULE_ID )
            // InternalArduino.g:2574:2: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1__Impl"


    // $ANTLR start "rule__Model__ComponentsAssignment_0"
    // InternalArduino.g:2584:1: rule__Model__ComponentsAssignment_0 : ( rulecomponents ) ;
    public final void rule__Model__ComponentsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2588:1: ( ( rulecomponents ) )
            // InternalArduino.g:2589:2: ( rulecomponents )
            {
            // InternalArduino.g:2589:2: ( rulecomponents )
            // InternalArduino.g:2590:3: rulecomponents
            {
             before(grammarAccess.getModelAccess().getComponentsComponentsParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulecomponents();

            state._fsp--;

             after(grammarAccess.getModelAccess().getComponentsComponentsParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ComponentsAssignment_0"


    // $ANTLR start "rule__Model__ConnectionAssignment_1"
    // InternalArduino.g:2599:1: rule__Model__ConnectionAssignment_1 : ( ruleconnection ) ;
    public final void rule__Model__ConnectionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2603:1: ( ( ruleconnection ) )
            // InternalArduino.g:2604:2: ( ruleconnection )
            {
            // InternalArduino.g:2604:2: ( ruleconnection )
            // InternalArduino.g:2605:3: ruleconnection
            {
             before(grammarAccess.getModelAccess().getConnectionConnectionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleconnection();

            state._fsp--;

             after(grammarAccess.getModelAccess().getConnectionConnectionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ConnectionAssignment_1"


    // $ANTLR start "rule__Model__BehaviorAssignment_2"
    // InternalArduino.g:2614:1: rule__Model__BehaviorAssignment_2 : ( rulebehavior ) ;
    public final void rule__Model__BehaviorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2618:1: ( ( rulebehavior ) )
            // InternalArduino.g:2619:2: ( rulebehavior )
            {
            // InternalArduino.g:2619:2: ( rulebehavior )
            // InternalArduino.g:2620:3: rulebehavior
            {
             before(grammarAccess.getModelAccess().getBehaviorBehaviorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulebehavior();

            state._fsp--;

             after(grammarAccess.getModelAccess().getBehaviorBehaviorParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__BehaviorAssignment_2"


    // $ANTLR start "rule__Components__NameAssignment_1"
    // InternalArduino.g:2629:1: rule__Components__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Components__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2633:1: ( ( RULE_ID ) )
            // InternalArduino.g:2634:2: ( RULE_ID )
            {
            // InternalArduino.g:2634:2: ( RULE_ID )
            // InternalArduino.g:2635:3: RULE_ID
            {
             before(grammarAccess.getComponentsAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComponentsAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Components__NameAssignment_1"


    // $ANTLR start "rule__Components__ConnectorsAssignment_12"
    // InternalArduino.g:2644:1: rule__Components__ConnectorsAssignment_12 : ( ruleconnectors ) ;
    public final void rule__Components__ConnectorsAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2648:1: ( ( ruleconnectors ) )
            // InternalArduino.g:2649:2: ( ruleconnectors )
            {
            // InternalArduino.g:2649:2: ( ruleconnectors )
            // InternalArduino.g:2650:3: ruleconnectors
            {
             before(grammarAccess.getComponentsAccess().getConnectorsConnectorsParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleconnectors();

            state._fsp--;

             after(grammarAccess.getComponentsAccess().getConnectorsConnectorsParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Components__ConnectorsAssignment_12"


    // $ANTLR start "rule__Components__Component_stateAssignment_15_3"
    // InternalArduino.g:2659:1: rule__Components__Component_stateAssignment_15_3 : ( rulecomponent_state ) ;
    public final void rule__Components__Component_stateAssignment_15_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2663:1: ( ( rulecomponent_state ) )
            // InternalArduino.g:2664:2: ( rulecomponent_state )
            {
            // InternalArduino.g:2664:2: ( rulecomponent_state )
            // InternalArduino.g:2665:3: rulecomponent_state
            {
             before(grammarAccess.getComponentsAccess().getComponent_stateComponent_stateParserRuleCall_15_3_0()); 
            pushFollow(FOLLOW_2);
            rulecomponent_state();

            state._fsp--;

             after(grammarAccess.getComponentsAccess().getComponent_stateComponent_stateParserRuleCall_15_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Components__Component_stateAssignment_15_3"


    // $ANTLR start "rule__Component_state__NameAssignment_0"
    // InternalArduino.g:2674:1: rule__Component_state__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Component_state__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2678:1: ( ( RULE_ID ) )
            // InternalArduino.g:2679:2: ( RULE_ID )
            {
            // InternalArduino.g:2679:2: ( RULE_ID )
            // InternalArduino.g:2680:3: RULE_ID
            {
             before(grammarAccess.getComponent_stateAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComponent_stateAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_state__NameAssignment_0"


    // $ANTLR start "rule__Connection__ComponentAssignment_3"
    // InternalArduino.g:2689:1: rule__Connection__ComponentAssignment_3 : ( rulecomponent ) ;
    public final void rule__Connection__ComponentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2693:1: ( ( rulecomponent ) )
            // InternalArduino.g:2694:2: ( rulecomponent )
            {
            // InternalArduino.g:2694:2: ( rulecomponent )
            // InternalArduino.g:2695:3: rulecomponent
            {
             before(grammarAccess.getConnectionAccess().getComponentComponentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulecomponent();

            state._fsp--;

             after(grammarAccess.getConnectionAccess().getComponentComponentParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__ComponentAssignment_3"


    // $ANTLR start "rule__Connection__WiringAssignment_4"
    // InternalArduino.g:2704:1: rule__Connection__WiringAssignment_4 : ( rulewiring ) ;
    public final void rule__Connection__WiringAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2708:1: ( ( rulewiring ) )
            // InternalArduino.g:2709:2: ( rulewiring )
            {
            // InternalArduino.g:2709:2: ( rulewiring )
            // InternalArduino.g:2710:3: rulewiring
            {
             before(grammarAccess.getConnectionAccess().getWiringWiringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulewiring();

            state._fsp--;

             after(grammarAccess.getConnectionAccess().getWiringWiringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__WiringAssignment_4"


    // $ANTLR start "rule__Component__ComponentsAssignment_1"
    // InternalArduino.g:2719:1: rule__Component__ComponentsAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Component__ComponentsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2723:1: ( ( ( RULE_ID ) ) )
            // InternalArduino.g:2724:2: ( ( RULE_ID ) )
            {
            // InternalArduino.g:2724:2: ( ( RULE_ID ) )
            // InternalArduino.g:2725:3: ( RULE_ID )
            {
             before(grammarAccess.getComponentAccess().getComponentsComponentsCrossReference_1_0()); 
            // InternalArduino.g:2726:3: ( RULE_ID )
            // InternalArduino.g:2727:4: RULE_ID
            {
             before(grammarAccess.getComponentAccess().getComponentsComponentsIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getComponentsComponentsIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getComponentAccess().getComponentsComponentsCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__ComponentsAssignment_1"


    // $ANTLR start "rule__Component__NameAssignment_2"
    // InternalArduino.g:2738:1: rule__Component__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Component__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2742:1: ( ( RULE_ID ) )
            // InternalArduino.g:2743:2: ( RULE_ID )
            {
            // InternalArduino.g:2743:2: ( RULE_ID )
            // InternalArduino.g:2744:3: RULE_ID
            {
             before(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__NameAssignment_2"


    // $ANTLR start "rule__Wiring__SrcAssignment_0"
    // InternalArduino.g:2753:1: rule__Wiring__SrcAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Wiring__SrcAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2757:1: ( ( ( RULE_ID ) ) )
            // InternalArduino.g:2758:2: ( ( RULE_ID ) )
            {
            // InternalArduino.g:2758:2: ( ( RULE_ID ) )
            // InternalArduino.g:2759:3: ( RULE_ID )
            {
             before(grammarAccess.getWiringAccess().getSrcComponentCrossReference_0_0()); 
            // InternalArduino.g:2760:3: ( RULE_ID )
            // InternalArduino.g:2761:4: RULE_ID
            {
             before(grammarAccess.getWiringAccess().getSrcComponentIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWiringAccess().getSrcComponentIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getWiringAccess().getSrcComponentCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wiring__SrcAssignment_0"


    // $ANTLR start "rule__Wiring__Src_portAssignment_2"
    // InternalArduino.g:2772:1: rule__Wiring__Src_portAssignment_2 : ( ruleconnectors ) ;
    public final void rule__Wiring__Src_portAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2776:1: ( ( ruleconnectors ) )
            // InternalArduino.g:2777:2: ( ruleconnectors )
            {
            // InternalArduino.g:2777:2: ( ruleconnectors )
            // InternalArduino.g:2778:3: ruleconnectors
            {
             before(grammarAccess.getWiringAccess().getSrc_portConnectorsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleconnectors();

            state._fsp--;

             after(grammarAccess.getWiringAccess().getSrc_portConnectorsParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wiring__Src_portAssignment_2"


    // $ANTLR start "rule__Wiring__TarAssignment_4"
    // InternalArduino.g:2787:1: rule__Wiring__TarAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Wiring__TarAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2791:1: ( ( ( RULE_ID ) ) )
            // InternalArduino.g:2792:2: ( ( RULE_ID ) )
            {
            // InternalArduino.g:2792:2: ( ( RULE_ID ) )
            // InternalArduino.g:2793:3: ( RULE_ID )
            {
             before(grammarAccess.getWiringAccess().getTarComponentCrossReference_4_0()); 
            // InternalArduino.g:2794:3: ( RULE_ID )
            // InternalArduino.g:2795:4: RULE_ID
            {
             before(grammarAccess.getWiringAccess().getTarComponentIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWiringAccess().getTarComponentIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getWiringAccess().getTarComponentCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wiring__TarAssignment_4"


    // $ANTLR start "rule__Wiring__Tar_portAssignment_6"
    // InternalArduino.g:2806:1: rule__Wiring__Tar_portAssignment_6 : ( ruleconnectors ) ;
    public final void rule__Wiring__Tar_portAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2810:1: ( ( ruleconnectors ) )
            // InternalArduino.g:2811:2: ( ruleconnectors )
            {
            // InternalArduino.g:2811:2: ( ruleconnectors )
            // InternalArduino.g:2812:3: ruleconnectors
            {
             before(grammarAccess.getWiringAccess().getTar_portConnectorsParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleconnectors();

            state._fsp--;

             after(grammarAccess.getWiringAccess().getTar_portConnectorsParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wiring__Tar_portAssignment_6"


    // $ANTLR start "rule__Behavior__StatesAssignment_4"
    // InternalArduino.g:2821:1: rule__Behavior__StatesAssignment_4 : ( rulestate ) ;
    public final void rule__Behavior__StatesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2825:1: ( ( rulestate ) )
            // InternalArduino.g:2826:2: ( rulestate )
            {
            // InternalArduino.g:2826:2: ( rulestate )
            // InternalArduino.g:2827:3: rulestate
            {
             before(grammarAccess.getBehaviorAccess().getStatesStateParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulestate();

            state._fsp--;

             after(grammarAccess.getBehaviorAccess().getStatesStateParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__StatesAssignment_4"


    // $ANTLR start "rule__Behavior__TransitionsAssignment_5"
    // InternalArduino.g:2836:1: rule__Behavior__TransitionsAssignment_5 : ( ruletransition ) ;
    public final void rule__Behavior__TransitionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2840:1: ( ( ruletransition ) )
            // InternalArduino.g:2841:2: ( ruletransition )
            {
            // InternalArduino.g:2841:2: ( ruletransition )
            // InternalArduino.g:2842:3: ruletransition
            {
             before(grammarAccess.getBehaviorAccess().getTransitionsTransitionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruletransition();

            state._fsp--;

             after(grammarAccess.getBehaviorAccess().getTransitionsTransitionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__TransitionsAssignment_5"


    // $ANTLR start "rule__Transition__Src_stateAssignment_0_1"
    // InternalArduino.g:2851:1: rule__Transition__Src_stateAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__Src_stateAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2855:1: ( ( ( RULE_ID ) ) )
            // InternalArduino.g:2856:2: ( ( RULE_ID ) )
            {
            // InternalArduino.g:2856:2: ( ( RULE_ID ) )
            // InternalArduino.g:2857:3: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getSrc_stateStateCrossReference_0_1_0()); 
            // InternalArduino.g:2858:3: ( RULE_ID )
            // InternalArduino.g:2859:4: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getSrc_stateStateIDTerminalRuleCall_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getSrc_stateStateIDTerminalRuleCall_0_1_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getSrc_stateStateCrossReference_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Src_stateAssignment_0_1"


    // $ANTLR start "rule__Transition__Tar_stateAssignment_2"
    // InternalArduino.g:2870:1: rule__Transition__Tar_stateAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__Tar_stateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2874:1: ( ( ( RULE_ID ) ) )
            // InternalArduino.g:2875:2: ( ( RULE_ID ) )
            {
            // InternalArduino.g:2875:2: ( ( RULE_ID ) )
            // InternalArduino.g:2876:3: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getTar_stateStateCrossReference_2_0()); 
            // InternalArduino.g:2877:3: ( RULE_ID )
            // InternalArduino.g:2878:4: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getTar_stateStateIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getTar_stateStateIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getTar_stateStateCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Tar_stateAssignment_2"


    // $ANTLR start "rule__Transition__Transition_effectAssignment_3"
    // InternalArduino.g:2889:1: rule__Transition__Transition_effectAssignment_3 : ( ruletransition_effect ) ;
    public final void rule__Transition__Transition_effectAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2893:1: ( ( ruletransition_effect ) )
            // InternalArduino.g:2894:2: ( ruletransition_effect )
            {
            // InternalArduino.g:2894:2: ( ruletransition_effect )
            // InternalArduino.g:2895:3: ruletransition_effect
            {
             before(grammarAccess.getTransitionAccess().getTransition_effectTransition_effectParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruletransition_effect();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getTransition_effectTransition_effectParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Transition_effectAssignment_3"


    // $ANTLR start "rule__Transition_effect__MicrosecondsAssignment_3"
    // InternalArduino.g:2904:1: rule__Transition_effect__MicrosecondsAssignment_3 : ( RULE_INT ) ;
    public final void rule__Transition_effect__MicrosecondsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2908:1: ( ( RULE_INT ) )
            // InternalArduino.g:2909:2: ( RULE_INT )
            {
            // InternalArduino.g:2909:2: ( RULE_INT )
            // InternalArduino.g:2910:3: RULE_INT
            {
             before(grammarAccess.getTransition_effectAccess().getMicrosecondsINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTransition_effectAccess().getMicrosecondsINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition_effect__MicrosecondsAssignment_3"


    // $ANTLR start "rule__State__NameAssignment_0"
    // InternalArduino.g:2919:1: rule__State__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2923:1: ( ( RULE_ID ) )
            // InternalArduino.g:2924:2: ( RULE_ID )
            {
            // InternalArduino.g:2924:2: ( RULE_ID )
            // InternalArduino.g:2925:3: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__NameAssignment_0"


    // $ANTLR start "rule__State__ComponentAssignment_2"
    // InternalArduino.g:2934:1: rule__State__ComponentAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__State__ComponentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2938:1: ( ( ( RULE_ID ) ) )
            // InternalArduino.g:2939:2: ( ( RULE_ID ) )
            {
            // InternalArduino.g:2939:2: ( ( RULE_ID ) )
            // InternalArduino.g:2940:3: ( RULE_ID )
            {
             before(grammarAccess.getStateAccess().getComponentComponentCrossReference_2_0()); 
            // InternalArduino.g:2941:3: ( RULE_ID )
            // InternalArduino.g:2942:4: RULE_ID
            {
             before(grammarAccess.getStateAccess().getComponentComponentIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getComponentComponentIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getStateAccess().getComponentComponentCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__ComponentAssignment_2"


    // $ANTLR start "rule__State__Component_stateAssignment_5"
    // InternalArduino.g:2953:1: rule__State__Component_stateAssignment_5 : ( ( ruleFQN ) ) ;
    public final void rule__State__Component_stateAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2957:1: ( ( ( ruleFQN ) ) )
            // InternalArduino.g:2958:2: ( ( ruleFQN ) )
            {
            // InternalArduino.g:2958:2: ( ( ruleFQN ) )
            // InternalArduino.g:2959:3: ( ruleFQN )
            {
             before(grammarAccess.getStateAccess().getComponent_stateComponent_stateCrossReference_5_0()); 
            // InternalArduino.g:2960:3: ( ruleFQN )
            // InternalArduino.g:2961:4: ruleFQN
            {
             before(grammarAccess.getStateAccess().getComponent_stateComponent_stateFQNParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getStateAccess().getComponent_stateComponent_stateFQNParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getStateAccess().getComponent_stateComponent_stateCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Component_stateAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000004007FC000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000007FC002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000840000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000007FC000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002040000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000020002000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000002000012L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000004000000002L});

}