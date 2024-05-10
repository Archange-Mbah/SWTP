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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'actor'", "'sensor'", "'microcontroller'", "'GND'", "'GND1'", "'GND2'", "'DIGITAL_IN'", "'A0'", "'HIGH'", "'LOW'", "'[*]'", "'component'", "'{'", "'type'", "'='", "'}'", "','", "'connectors'", "'['", "']'", "'states'", "'connection'", "'new'", "'.'", "'behavior'", "'@startuml'", "'@enduml'", "'-->'", "':'", "'delay'", "'.state'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

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
    // InternalArduino.g:454:1: rule__Connectors__Alternatives : ( ( 'GND' ) | ( 'GND1' ) | ( 'GND2' ) | ( 'DIGITAL_IN' ) | ( 'A0' ) );
    public final void rule__Connectors__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:458:1: ( ( 'GND' ) | ( 'GND1' ) | ( 'GND2' ) | ( 'DIGITAL_IN' ) | ( 'A0' ) )
            int alt2=5;
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
    // InternalArduino.g:493:1: rule__LEVEL__Alternatives : ( ( 'HIGH' ) | ( 'LOW' ) );
    public final void rule__LEVEL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:497:1: ( ( 'HIGH' ) | ( 'LOW' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            else if ( (LA3_0==20) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalArduino.g:498:2: ( 'HIGH' )
                    {
                    // InternalArduino.g:498:2: ( 'HIGH' )
                    // InternalArduino.g:499:3: 'HIGH'
                    {
                     before(grammarAccess.getLEVELAccess().getHIGHKeyword_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getLEVELAccess().getHIGHKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArduino.g:504:2: ( 'LOW' )
                    {
                    // InternalArduino.g:504:2: ( 'LOW' )
                    // InternalArduino.g:505:3: 'LOW'
                    {
                     before(grammarAccess.getLEVELAccess().getLOWKeyword_1()); 
                    match(input,20,FOLLOW_2); 
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
    // InternalArduino.g:514:1: rule__Transition__Alternatives_0 : ( ( '[*]' ) | ( ( rule__Transition__Src_stateAssignment_0_1 ) ) );
    public final void rule__Transition__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:518:1: ( ( '[*]' ) | ( ( rule__Transition__Src_stateAssignment_0_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
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
                    // InternalArduino.g:519:2: ( '[*]' )
                    {
                    // InternalArduino.g:519:2: ( '[*]' )
                    // InternalArduino.g:520:3: '[*]'
                    {
                     before(grammarAccess.getTransitionAccess().getLeftSquareBracketAsteriskRightSquareBracketKeyword_0_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getTransitionAccess().getLeftSquareBracketAsteriskRightSquareBracketKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArduino.g:525:2: ( ( rule__Transition__Src_stateAssignment_0_1 ) )
                    {
                    // InternalArduino.g:525:2: ( ( rule__Transition__Src_stateAssignment_0_1 ) )
                    // InternalArduino.g:526:3: ( rule__Transition__Src_stateAssignment_0_1 )
                    {
                     before(grammarAccess.getTransitionAccess().getSrc_stateAssignment_0_1()); 
                    // InternalArduino.g:527:3: ( rule__Transition__Src_stateAssignment_0_1 )
                    // InternalArduino.g:527:4: rule__Transition__Src_stateAssignment_0_1
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
    // InternalArduino.g:535:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:539:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalArduino.g:540:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalArduino.g:547:1: rule__Model__Group__0__Impl : ( ( rule__Model__ComponentsAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:551:1: ( ( ( rule__Model__ComponentsAssignment_0 )* ) )
            // InternalArduino.g:552:1: ( ( rule__Model__ComponentsAssignment_0 )* )
            {
            // InternalArduino.g:552:1: ( ( rule__Model__ComponentsAssignment_0 )* )
            // InternalArduino.g:553:2: ( rule__Model__ComponentsAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getComponentsAssignment_0()); 
            // InternalArduino.g:554:2: ( rule__Model__ComponentsAssignment_0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==22) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalArduino.g:554:3: rule__Model__ComponentsAssignment_0
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
    // InternalArduino.g:562:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:566:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalArduino.g:567:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalArduino.g:574:1: rule__Model__Group__1__Impl : ( ( rule__Model__ConnectionAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:578:1: ( ( ( rule__Model__ConnectionAssignment_1 ) ) )
            // InternalArduino.g:579:1: ( ( rule__Model__ConnectionAssignment_1 ) )
            {
            // InternalArduino.g:579:1: ( ( rule__Model__ConnectionAssignment_1 ) )
            // InternalArduino.g:580:2: ( rule__Model__ConnectionAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getConnectionAssignment_1()); 
            // InternalArduino.g:581:2: ( rule__Model__ConnectionAssignment_1 )
            // InternalArduino.g:581:3: rule__Model__ConnectionAssignment_1
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
    // InternalArduino.g:589:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:593:1: ( rule__Model__Group__2__Impl )
            // InternalArduino.g:594:2: rule__Model__Group__2__Impl
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
    // InternalArduino.g:600:1: rule__Model__Group__2__Impl : ( ( rule__Model__BehaviorAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:604:1: ( ( ( rule__Model__BehaviorAssignment_2 ) ) )
            // InternalArduino.g:605:1: ( ( rule__Model__BehaviorAssignment_2 ) )
            {
            // InternalArduino.g:605:1: ( ( rule__Model__BehaviorAssignment_2 ) )
            // InternalArduino.g:606:2: ( rule__Model__BehaviorAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getBehaviorAssignment_2()); 
            // InternalArduino.g:607:2: ( rule__Model__BehaviorAssignment_2 )
            // InternalArduino.g:607:3: rule__Model__BehaviorAssignment_2
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
    // InternalArduino.g:616:1: rule__Components__Group__0 : rule__Components__Group__0__Impl rule__Components__Group__1 ;
    public final void rule__Components__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:620:1: ( rule__Components__Group__0__Impl rule__Components__Group__1 )
            // InternalArduino.g:621:2: rule__Components__Group__0__Impl rule__Components__Group__1
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
    // InternalArduino.g:628:1: rule__Components__Group__0__Impl : ( 'component' ) ;
    public final void rule__Components__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:632:1: ( ( 'component' ) )
            // InternalArduino.g:633:1: ( 'component' )
            {
            // InternalArduino.g:633:1: ( 'component' )
            // InternalArduino.g:634:2: 'component'
            {
             before(grammarAccess.getComponentsAccess().getComponentKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalArduino.g:643:1: rule__Components__Group__1 : rule__Components__Group__1__Impl rule__Components__Group__2 ;
    public final void rule__Components__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:647:1: ( rule__Components__Group__1__Impl rule__Components__Group__2 )
            // InternalArduino.g:648:2: rule__Components__Group__1__Impl rule__Components__Group__2
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
    // InternalArduino.g:655:1: rule__Components__Group__1__Impl : ( ( rule__Components__NameAssignment_1 ) ) ;
    public final void rule__Components__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:659:1: ( ( ( rule__Components__NameAssignment_1 ) ) )
            // InternalArduino.g:660:1: ( ( rule__Components__NameAssignment_1 ) )
            {
            // InternalArduino.g:660:1: ( ( rule__Components__NameAssignment_1 ) )
            // InternalArduino.g:661:2: ( rule__Components__NameAssignment_1 )
            {
             before(grammarAccess.getComponentsAccess().getNameAssignment_1()); 
            // InternalArduino.g:662:2: ( rule__Components__NameAssignment_1 )
            // InternalArduino.g:662:3: rule__Components__NameAssignment_1
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
    // InternalArduino.g:670:1: rule__Components__Group__2 : rule__Components__Group__2__Impl rule__Components__Group__3 ;
    public final void rule__Components__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:674:1: ( rule__Components__Group__2__Impl rule__Components__Group__3 )
            // InternalArduino.g:675:2: rule__Components__Group__2__Impl rule__Components__Group__3
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
    // InternalArduino.g:682:1: rule__Components__Group__2__Impl : ( '{' ) ;
    public final void rule__Components__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:686:1: ( ( '{' ) )
            // InternalArduino.g:687:1: ( '{' )
            {
            // InternalArduino.g:687:1: ( '{' )
            // InternalArduino.g:688:2: '{'
            {
             before(grammarAccess.getComponentsAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
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
    // InternalArduino.g:697:1: rule__Components__Group__3 : rule__Components__Group__3__Impl rule__Components__Group__4 ;
    public final void rule__Components__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:701:1: ( rule__Components__Group__3__Impl rule__Components__Group__4 )
            // InternalArduino.g:702:2: rule__Components__Group__3__Impl rule__Components__Group__4
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
    // InternalArduino.g:709:1: rule__Components__Group__3__Impl : ( 'type' ) ;
    public final void rule__Components__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:713:1: ( ( 'type' ) )
            // InternalArduino.g:714:1: ( 'type' )
            {
            // InternalArduino.g:714:1: ( 'type' )
            // InternalArduino.g:715:2: 'type'
            {
             before(grammarAccess.getComponentsAccess().getTypeKeyword_3()); 
            match(input,24,FOLLOW_2); 
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
    // InternalArduino.g:724:1: rule__Components__Group__4 : rule__Components__Group__4__Impl rule__Components__Group__5 ;
    public final void rule__Components__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:728:1: ( rule__Components__Group__4__Impl rule__Components__Group__5 )
            // InternalArduino.g:729:2: rule__Components__Group__4__Impl rule__Components__Group__5
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
    // InternalArduino.g:736:1: rule__Components__Group__4__Impl : ( '=' ) ;
    public final void rule__Components__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:740:1: ( ( '=' ) )
            // InternalArduino.g:741:1: ( '=' )
            {
            // InternalArduino.g:741:1: ( '=' )
            // InternalArduino.g:742:2: '='
            {
             before(grammarAccess.getComponentsAccess().getEqualsSignKeyword_4()); 
            match(input,25,FOLLOW_2); 
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
    // InternalArduino.g:751:1: rule__Components__Group__5 : rule__Components__Group__5__Impl rule__Components__Group__6 ;
    public final void rule__Components__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:755:1: ( rule__Components__Group__5__Impl rule__Components__Group__6 )
            // InternalArduino.g:756:2: rule__Components__Group__5__Impl rule__Components__Group__6
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
    // InternalArduino.g:763:1: rule__Components__Group__5__Impl : ( '{' ) ;
    public final void rule__Components__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:767:1: ( ( '{' ) )
            // InternalArduino.g:768:1: ( '{' )
            {
            // InternalArduino.g:768:1: ( '{' )
            // InternalArduino.g:769:2: '{'
            {
             before(grammarAccess.getComponentsAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,23,FOLLOW_2); 
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
    // InternalArduino.g:778:1: rule__Components__Group__6 : rule__Components__Group__6__Impl rule__Components__Group__7 ;
    public final void rule__Components__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:782:1: ( rule__Components__Group__6__Impl rule__Components__Group__7 )
            // InternalArduino.g:783:2: rule__Components__Group__6__Impl rule__Components__Group__7
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
    // InternalArduino.g:790:1: rule__Components__Group__6__Impl : ( ruletype ) ;
    public final void rule__Components__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:794:1: ( ( ruletype ) )
            // InternalArduino.g:795:1: ( ruletype )
            {
            // InternalArduino.g:795:1: ( ruletype )
            // InternalArduino.g:796:2: ruletype
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
    // InternalArduino.g:805:1: rule__Components__Group__7 : rule__Components__Group__7__Impl rule__Components__Group__8 ;
    public final void rule__Components__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:809:1: ( rule__Components__Group__7__Impl rule__Components__Group__8 )
            // InternalArduino.g:810:2: rule__Components__Group__7__Impl rule__Components__Group__8
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
    // InternalArduino.g:817:1: rule__Components__Group__7__Impl : ( '}' ) ;
    public final void rule__Components__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:821:1: ( ( '}' ) )
            // InternalArduino.g:822:1: ( '}' )
            {
            // InternalArduino.g:822:1: ( '}' )
            // InternalArduino.g:823:2: '}'
            {
             before(grammarAccess.getComponentsAccess().getRightCurlyBracketKeyword_7()); 
            match(input,26,FOLLOW_2); 
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
    // InternalArduino.g:832:1: rule__Components__Group__8 : rule__Components__Group__8__Impl rule__Components__Group__9 ;
    public final void rule__Components__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:836:1: ( rule__Components__Group__8__Impl rule__Components__Group__9 )
            // InternalArduino.g:837:2: rule__Components__Group__8__Impl rule__Components__Group__9
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
    // InternalArduino.g:844:1: rule__Components__Group__8__Impl : ( ',' ) ;
    public final void rule__Components__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:848:1: ( ( ',' ) )
            // InternalArduino.g:849:1: ( ',' )
            {
            // InternalArduino.g:849:1: ( ',' )
            // InternalArduino.g:850:2: ','
            {
             before(grammarAccess.getComponentsAccess().getCommaKeyword_8()); 
            match(input,27,FOLLOW_2); 
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
    // InternalArduino.g:859:1: rule__Components__Group__9 : rule__Components__Group__9__Impl rule__Components__Group__10 ;
    public final void rule__Components__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:863:1: ( rule__Components__Group__9__Impl rule__Components__Group__10 )
            // InternalArduino.g:864:2: rule__Components__Group__9__Impl rule__Components__Group__10
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
    // InternalArduino.g:871:1: rule__Components__Group__9__Impl : ( 'connectors' ) ;
    public final void rule__Components__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:875:1: ( ( 'connectors' ) )
            // InternalArduino.g:876:1: ( 'connectors' )
            {
            // InternalArduino.g:876:1: ( 'connectors' )
            // InternalArduino.g:877:2: 'connectors'
            {
             before(grammarAccess.getComponentsAccess().getConnectorsKeyword_9()); 
            match(input,28,FOLLOW_2); 
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
    // InternalArduino.g:886:1: rule__Components__Group__10 : rule__Components__Group__10__Impl rule__Components__Group__11 ;
    public final void rule__Components__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:890:1: ( rule__Components__Group__10__Impl rule__Components__Group__11 )
            // InternalArduino.g:891:2: rule__Components__Group__10__Impl rule__Components__Group__11
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
    // InternalArduino.g:898:1: rule__Components__Group__10__Impl : ( '=' ) ;
    public final void rule__Components__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:902:1: ( ( '=' ) )
            // InternalArduino.g:903:1: ( '=' )
            {
            // InternalArduino.g:903:1: ( '=' )
            // InternalArduino.g:904:2: '='
            {
             before(grammarAccess.getComponentsAccess().getEqualsSignKeyword_10()); 
            match(input,25,FOLLOW_2); 
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
    // InternalArduino.g:913:1: rule__Components__Group__11 : rule__Components__Group__11__Impl rule__Components__Group__12 ;
    public final void rule__Components__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:917:1: ( rule__Components__Group__11__Impl rule__Components__Group__12 )
            // InternalArduino.g:918:2: rule__Components__Group__11__Impl rule__Components__Group__12
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
    // InternalArduino.g:925:1: rule__Components__Group__11__Impl : ( '[' ) ;
    public final void rule__Components__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:929:1: ( ( '[' ) )
            // InternalArduino.g:930:1: ( '[' )
            {
            // InternalArduino.g:930:1: ( '[' )
            // InternalArduino.g:931:2: '['
            {
             before(grammarAccess.getComponentsAccess().getLeftSquareBracketKeyword_11()); 
            match(input,29,FOLLOW_2); 
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
    // InternalArduino.g:940:1: rule__Components__Group__12 : rule__Components__Group__12__Impl rule__Components__Group__13 ;
    public final void rule__Components__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:944:1: ( rule__Components__Group__12__Impl rule__Components__Group__13 )
            // InternalArduino.g:945:2: rule__Components__Group__12__Impl rule__Components__Group__13
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
    // InternalArduino.g:952:1: rule__Components__Group__12__Impl : ( ( rule__Components__ConnectorsAssignment_12 )* ) ;
    public final void rule__Components__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:956:1: ( ( ( rule__Components__ConnectorsAssignment_12 )* ) )
            // InternalArduino.g:957:1: ( ( rule__Components__ConnectorsAssignment_12 )* )
            {
            // InternalArduino.g:957:1: ( ( rule__Components__ConnectorsAssignment_12 )* )
            // InternalArduino.g:958:2: ( rule__Components__ConnectorsAssignment_12 )*
            {
             before(grammarAccess.getComponentsAccess().getConnectorsAssignment_12()); 
            // InternalArduino.g:959:2: ( rule__Components__ConnectorsAssignment_12 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=14 && LA6_0<=18)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalArduino.g:959:3: rule__Components__ConnectorsAssignment_12
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
    // InternalArduino.g:967:1: rule__Components__Group__13 : rule__Components__Group__13__Impl rule__Components__Group__14 ;
    public final void rule__Components__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:971:1: ( rule__Components__Group__13__Impl rule__Components__Group__14 )
            // InternalArduino.g:972:2: rule__Components__Group__13__Impl rule__Components__Group__14
            {
            pushFollow(FOLLOW_17);
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
    // InternalArduino.g:979:1: rule__Components__Group__13__Impl : ( ']' ) ;
    public final void rule__Components__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:983:1: ( ( ']' ) )
            // InternalArduino.g:984:1: ( ']' )
            {
            // InternalArduino.g:984:1: ( ']' )
            // InternalArduino.g:985:2: ']'
            {
             before(grammarAccess.getComponentsAccess().getRightSquareBracketKeyword_13()); 
            match(input,30,FOLLOW_2); 
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
    // InternalArduino.g:994:1: rule__Components__Group__14 : rule__Components__Group__14__Impl rule__Components__Group__15 ;
    public final void rule__Components__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:998:1: ( rule__Components__Group__14__Impl rule__Components__Group__15 )
            // InternalArduino.g:999:2: rule__Components__Group__14__Impl rule__Components__Group__15
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
    // InternalArduino.g:1006:1: rule__Components__Group__14__Impl : ( ( rule__Components__Group_14__0 )* ) ;
    public final void rule__Components__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1010:1: ( ( ( rule__Components__Group_14__0 )* ) )
            // InternalArduino.g:1011:1: ( ( rule__Components__Group_14__0 )* )
            {
            // InternalArduino.g:1011:1: ( ( rule__Components__Group_14__0 )* )
            // InternalArduino.g:1012:2: ( rule__Components__Group_14__0 )*
            {
             before(grammarAccess.getComponentsAccess().getGroup_14()); 
            // InternalArduino.g:1013:2: ( rule__Components__Group_14__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==31) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalArduino.g:1013:3: rule__Components__Group_14__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Components__Group_14__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getComponentsAccess().getGroup_14()); 

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
    // InternalArduino.g:1021:1: rule__Components__Group__15 : rule__Components__Group__15__Impl ;
    public final void rule__Components__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1025:1: ( rule__Components__Group__15__Impl )
            // InternalArduino.g:1026:2: rule__Components__Group__15__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Components__Group__15__Impl();

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
    // InternalArduino.g:1032:1: rule__Components__Group__15__Impl : ( '}' ) ;
    public final void rule__Components__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1036:1: ( ( '}' ) )
            // InternalArduino.g:1037:1: ( '}' )
            {
            // InternalArduino.g:1037:1: ( '}' )
            // InternalArduino.g:1038:2: '}'
            {
             before(grammarAccess.getComponentsAccess().getRightCurlyBracketKeyword_15()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getComponentsAccess().getRightCurlyBracketKeyword_15()); 

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


    // $ANTLR start "rule__Components__Group_14__0"
    // InternalArduino.g:1048:1: rule__Components__Group_14__0 : rule__Components__Group_14__0__Impl rule__Components__Group_14__1 ;
    public final void rule__Components__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1052:1: ( rule__Components__Group_14__0__Impl rule__Components__Group_14__1 )
            // InternalArduino.g:1053:2: rule__Components__Group_14__0__Impl rule__Components__Group_14__1
            {
            pushFollow(FOLLOW_9);
            rule__Components__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Components__Group_14__1();

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
    // $ANTLR end "rule__Components__Group_14__0"


    // $ANTLR start "rule__Components__Group_14__0__Impl"
    // InternalArduino.g:1060:1: rule__Components__Group_14__0__Impl : ( 'states' ) ;
    public final void rule__Components__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1064:1: ( ( 'states' ) )
            // InternalArduino.g:1065:1: ( 'states' )
            {
            // InternalArduino.g:1065:1: ( 'states' )
            // InternalArduino.g:1066:2: 'states'
            {
             before(grammarAccess.getComponentsAccess().getStatesKeyword_14_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getComponentsAccess().getStatesKeyword_14_0()); 

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
    // $ANTLR end "rule__Components__Group_14__0__Impl"


    // $ANTLR start "rule__Components__Group_14__1"
    // InternalArduino.g:1075:1: rule__Components__Group_14__1 : rule__Components__Group_14__1__Impl rule__Components__Group_14__2 ;
    public final void rule__Components__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1079:1: ( rule__Components__Group_14__1__Impl rule__Components__Group_14__2 )
            // InternalArduino.g:1080:2: rule__Components__Group_14__1__Impl rule__Components__Group_14__2
            {
            pushFollow(FOLLOW_14);
            rule__Components__Group_14__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Components__Group_14__2();

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
    // $ANTLR end "rule__Components__Group_14__1"


    // $ANTLR start "rule__Components__Group_14__1__Impl"
    // InternalArduino.g:1087:1: rule__Components__Group_14__1__Impl : ( '=' ) ;
    public final void rule__Components__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1091:1: ( ( '=' ) )
            // InternalArduino.g:1092:1: ( '=' )
            {
            // InternalArduino.g:1092:1: ( '=' )
            // InternalArduino.g:1093:2: '='
            {
             before(grammarAccess.getComponentsAccess().getEqualsSignKeyword_14_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getComponentsAccess().getEqualsSignKeyword_14_1()); 

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
    // $ANTLR end "rule__Components__Group_14__1__Impl"


    // $ANTLR start "rule__Components__Group_14__2"
    // InternalArduino.g:1102:1: rule__Components__Group_14__2 : rule__Components__Group_14__2__Impl rule__Components__Group_14__3 ;
    public final void rule__Components__Group_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1106:1: ( rule__Components__Group_14__2__Impl rule__Components__Group_14__3 )
            // InternalArduino.g:1107:2: rule__Components__Group_14__2__Impl rule__Components__Group_14__3
            {
            pushFollow(FOLLOW_19);
            rule__Components__Group_14__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Components__Group_14__3();

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
    // $ANTLR end "rule__Components__Group_14__2"


    // $ANTLR start "rule__Components__Group_14__2__Impl"
    // InternalArduino.g:1114:1: rule__Components__Group_14__2__Impl : ( '[' ) ;
    public final void rule__Components__Group_14__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1118:1: ( ( '[' ) )
            // InternalArduino.g:1119:1: ( '[' )
            {
            // InternalArduino.g:1119:1: ( '[' )
            // InternalArduino.g:1120:2: '['
            {
             before(grammarAccess.getComponentsAccess().getLeftSquareBracketKeyword_14_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getComponentsAccess().getLeftSquareBracketKeyword_14_2()); 

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
    // $ANTLR end "rule__Components__Group_14__2__Impl"


    // $ANTLR start "rule__Components__Group_14__3"
    // InternalArduino.g:1129:1: rule__Components__Group_14__3 : rule__Components__Group_14__3__Impl rule__Components__Group_14__4 ;
    public final void rule__Components__Group_14__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1133:1: ( rule__Components__Group_14__3__Impl rule__Components__Group_14__4 )
            // InternalArduino.g:1134:2: rule__Components__Group_14__3__Impl rule__Components__Group_14__4
            {
            pushFollow(FOLLOW_19);
            rule__Components__Group_14__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Components__Group_14__4();

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
    // $ANTLR end "rule__Components__Group_14__3"


    // $ANTLR start "rule__Components__Group_14__3__Impl"
    // InternalArduino.g:1141:1: rule__Components__Group_14__3__Impl : ( ( rule__Components__Component_stateAssignment_14_3 )* ) ;
    public final void rule__Components__Group_14__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1145:1: ( ( ( rule__Components__Component_stateAssignment_14_3 )* ) )
            // InternalArduino.g:1146:1: ( ( rule__Components__Component_stateAssignment_14_3 )* )
            {
            // InternalArduino.g:1146:1: ( ( rule__Components__Component_stateAssignment_14_3 )* )
            // InternalArduino.g:1147:2: ( rule__Components__Component_stateAssignment_14_3 )*
            {
             before(grammarAccess.getComponentsAccess().getComponent_stateAssignment_14_3()); 
            // InternalArduino.g:1148:2: ( rule__Components__Component_stateAssignment_14_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalArduino.g:1148:3: rule__Components__Component_stateAssignment_14_3
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Components__Component_stateAssignment_14_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getComponentsAccess().getComponent_stateAssignment_14_3()); 

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
    // $ANTLR end "rule__Components__Group_14__3__Impl"


    // $ANTLR start "rule__Components__Group_14__4"
    // InternalArduino.g:1156:1: rule__Components__Group_14__4 : rule__Components__Group_14__4__Impl ;
    public final void rule__Components__Group_14__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1160:1: ( rule__Components__Group_14__4__Impl )
            // InternalArduino.g:1161:2: rule__Components__Group_14__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Components__Group_14__4__Impl();

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
    // $ANTLR end "rule__Components__Group_14__4"


    // $ANTLR start "rule__Components__Group_14__4__Impl"
    // InternalArduino.g:1167:1: rule__Components__Group_14__4__Impl : ( ']' ) ;
    public final void rule__Components__Group_14__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1171:1: ( ( ']' ) )
            // InternalArduino.g:1172:1: ( ']' )
            {
            // InternalArduino.g:1172:1: ( ']' )
            // InternalArduino.g:1173:2: ']'
            {
             before(grammarAccess.getComponentsAccess().getRightSquareBracketKeyword_14_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getComponentsAccess().getRightSquareBracketKeyword_14_4()); 

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
    // $ANTLR end "rule__Components__Group_14__4__Impl"


    // $ANTLR start "rule__Component_state__Group__0"
    // InternalArduino.g:1183:1: rule__Component_state__Group__0 : rule__Component_state__Group__0__Impl rule__Component_state__Group__1 ;
    public final void rule__Component_state__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1187:1: ( rule__Component_state__Group__0__Impl rule__Component_state__Group__1 )
            // InternalArduino.g:1188:2: rule__Component_state__Group__0__Impl rule__Component_state__Group__1
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
    // InternalArduino.g:1195:1: rule__Component_state__Group__0__Impl : ( ( rule__Component_state__NameAssignment_0 ) ) ;
    public final void rule__Component_state__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1199:1: ( ( ( rule__Component_state__NameAssignment_0 ) ) )
            // InternalArduino.g:1200:1: ( ( rule__Component_state__NameAssignment_0 ) )
            {
            // InternalArduino.g:1200:1: ( ( rule__Component_state__NameAssignment_0 ) )
            // InternalArduino.g:1201:2: ( rule__Component_state__NameAssignment_0 )
            {
             before(grammarAccess.getComponent_stateAccess().getNameAssignment_0()); 
            // InternalArduino.g:1202:2: ( rule__Component_state__NameAssignment_0 )
            // InternalArduino.g:1202:3: rule__Component_state__NameAssignment_0
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
    // InternalArduino.g:1210:1: rule__Component_state__Group__1 : rule__Component_state__Group__1__Impl rule__Component_state__Group__2 ;
    public final void rule__Component_state__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1214:1: ( rule__Component_state__Group__1__Impl rule__Component_state__Group__2 )
            // InternalArduino.g:1215:2: rule__Component_state__Group__1__Impl rule__Component_state__Group__2
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
    // InternalArduino.g:1222:1: rule__Component_state__Group__1__Impl : ( '{' ) ;
    public final void rule__Component_state__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1226:1: ( ( '{' ) )
            // InternalArduino.g:1227:1: ( '{' )
            {
            // InternalArduino.g:1227:1: ( '{' )
            // InternalArduino.g:1228:2: '{'
            {
             before(grammarAccess.getComponent_stateAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalArduino.g:1237:1: rule__Component_state__Group__2 : rule__Component_state__Group__2__Impl rule__Component_state__Group__3 ;
    public final void rule__Component_state__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1241:1: ( rule__Component_state__Group__2__Impl rule__Component_state__Group__3 )
            // InternalArduino.g:1242:2: rule__Component_state__Group__2__Impl rule__Component_state__Group__3
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
    // InternalArduino.g:1249:1: rule__Component_state__Group__2__Impl : ( ruleconnector_definition ) ;
    public final void rule__Component_state__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1253:1: ( ( ruleconnector_definition ) )
            // InternalArduino.g:1254:1: ( ruleconnector_definition )
            {
            // InternalArduino.g:1254:1: ( ruleconnector_definition )
            // InternalArduino.g:1255:2: ruleconnector_definition
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
    // InternalArduino.g:1264:1: rule__Component_state__Group__3 : rule__Component_state__Group__3__Impl ;
    public final void rule__Component_state__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1268:1: ( rule__Component_state__Group__3__Impl )
            // InternalArduino.g:1269:2: rule__Component_state__Group__3__Impl
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
    // InternalArduino.g:1275:1: rule__Component_state__Group__3__Impl : ( '}' ) ;
    public final void rule__Component_state__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1279:1: ( ( '}' ) )
            // InternalArduino.g:1280:1: ( '}' )
            {
            // InternalArduino.g:1280:1: ( '}' )
            // InternalArduino.g:1281:2: '}'
            {
             before(grammarAccess.getComponent_stateAccess().getRightCurlyBracketKeyword_3()); 
            match(input,26,FOLLOW_2); 
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
    // InternalArduino.g:1291:1: rule__Connector_definition__Group__0 : rule__Connector_definition__Group__0__Impl rule__Connector_definition__Group__1 ;
    public final void rule__Connector_definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1295:1: ( rule__Connector_definition__Group__0__Impl rule__Connector_definition__Group__1 )
            // InternalArduino.g:1296:2: rule__Connector_definition__Group__0__Impl rule__Connector_definition__Group__1
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
    // InternalArduino.g:1303:1: rule__Connector_definition__Group__0__Impl : ( ruleconnectors ) ;
    public final void rule__Connector_definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1307:1: ( ( ruleconnectors ) )
            // InternalArduino.g:1308:1: ( ruleconnectors )
            {
            // InternalArduino.g:1308:1: ( ruleconnectors )
            // InternalArduino.g:1309:2: ruleconnectors
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
    // InternalArduino.g:1318:1: rule__Connector_definition__Group__1 : rule__Connector_definition__Group__1__Impl rule__Connector_definition__Group__2 ;
    public final void rule__Connector_definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1322:1: ( rule__Connector_definition__Group__1__Impl rule__Connector_definition__Group__2 )
            // InternalArduino.g:1323:2: rule__Connector_definition__Group__1__Impl rule__Connector_definition__Group__2
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
    // InternalArduino.g:1330:1: rule__Connector_definition__Group__1__Impl : ( '=' ) ;
    public final void rule__Connector_definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1334:1: ( ( '=' ) )
            // InternalArduino.g:1335:1: ( '=' )
            {
            // InternalArduino.g:1335:1: ( '=' )
            // InternalArduino.g:1336:2: '='
            {
             before(grammarAccess.getConnector_definitionAccess().getEqualsSignKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalArduino.g:1345:1: rule__Connector_definition__Group__2 : rule__Connector_definition__Group__2__Impl ;
    public final void rule__Connector_definition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1349:1: ( rule__Connector_definition__Group__2__Impl )
            // InternalArduino.g:1350:2: rule__Connector_definition__Group__2__Impl
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
    // InternalArduino.g:1356:1: rule__Connector_definition__Group__2__Impl : ( ruleLEVEL ) ;
    public final void rule__Connector_definition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1360:1: ( ( ruleLEVEL ) )
            // InternalArduino.g:1361:1: ( ruleLEVEL )
            {
            // InternalArduino.g:1361:1: ( ruleLEVEL )
            // InternalArduino.g:1362:2: ruleLEVEL
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
    // InternalArduino.g:1372:1: rule__Connection__Group__0 : rule__Connection__Group__0__Impl rule__Connection__Group__1 ;
    public final void rule__Connection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1376:1: ( rule__Connection__Group__0__Impl rule__Connection__Group__1 )
            // InternalArduino.g:1377:2: rule__Connection__Group__0__Impl rule__Connection__Group__1
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
    // InternalArduino.g:1384:1: rule__Connection__Group__0__Impl : ( () ) ;
    public final void rule__Connection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1388:1: ( ( () ) )
            // InternalArduino.g:1389:1: ( () )
            {
            // InternalArduino.g:1389:1: ( () )
            // InternalArduino.g:1390:2: ()
            {
             before(grammarAccess.getConnectionAccess().getConnectionAction_0()); 
            // InternalArduino.g:1391:2: ()
            // InternalArduino.g:1391:3: 
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
    // InternalArduino.g:1399:1: rule__Connection__Group__1 : rule__Connection__Group__1__Impl rule__Connection__Group__2 ;
    public final void rule__Connection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1403:1: ( rule__Connection__Group__1__Impl rule__Connection__Group__2 )
            // InternalArduino.g:1404:2: rule__Connection__Group__1__Impl rule__Connection__Group__2
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
    // InternalArduino.g:1411:1: rule__Connection__Group__1__Impl : ( 'connection' ) ;
    public final void rule__Connection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1415:1: ( ( 'connection' ) )
            // InternalArduino.g:1416:1: ( 'connection' )
            {
            // InternalArduino.g:1416:1: ( 'connection' )
            // InternalArduino.g:1417:2: 'connection'
            {
             before(grammarAccess.getConnectionAccess().getConnectionKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalArduino.g:1426:1: rule__Connection__Group__2 : rule__Connection__Group__2__Impl rule__Connection__Group__3 ;
    public final void rule__Connection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1430:1: ( rule__Connection__Group__2__Impl rule__Connection__Group__3 )
            // InternalArduino.g:1431:2: rule__Connection__Group__2__Impl rule__Connection__Group__3
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
    // InternalArduino.g:1438:1: rule__Connection__Group__2__Impl : ( '{' ) ;
    public final void rule__Connection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1442:1: ( ( '{' ) )
            // InternalArduino.g:1443:1: ( '{' )
            {
            // InternalArduino.g:1443:1: ( '{' )
            // InternalArduino.g:1444:2: '{'
            {
             before(grammarAccess.getConnectionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
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
    // InternalArduino.g:1453:1: rule__Connection__Group__3 : rule__Connection__Group__3__Impl rule__Connection__Group__4 ;
    public final void rule__Connection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1457:1: ( rule__Connection__Group__3__Impl rule__Connection__Group__4 )
            // InternalArduino.g:1458:2: rule__Connection__Group__3__Impl rule__Connection__Group__4
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
    // InternalArduino.g:1465:1: rule__Connection__Group__3__Impl : ( ( rule__Connection__ComponentAssignment_3 )* ) ;
    public final void rule__Connection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1469:1: ( ( ( rule__Connection__ComponentAssignment_3 )* ) )
            // InternalArduino.g:1470:1: ( ( rule__Connection__ComponentAssignment_3 )* )
            {
            // InternalArduino.g:1470:1: ( ( rule__Connection__ComponentAssignment_3 )* )
            // InternalArduino.g:1471:2: ( rule__Connection__ComponentAssignment_3 )*
            {
             before(grammarAccess.getConnectionAccess().getComponentAssignment_3()); 
            // InternalArduino.g:1472:2: ( rule__Connection__ComponentAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==33) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalArduino.g:1472:3: rule__Connection__ComponentAssignment_3
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
    // InternalArduino.g:1480:1: rule__Connection__Group__4 : rule__Connection__Group__4__Impl rule__Connection__Group__5 ;
    public final void rule__Connection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1484:1: ( rule__Connection__Group__4__Impl rule__Connection__Group__5 )
            // InternalArduino.g:1485:2: rule__Connection__Group__4__Impl rule__Connection__Group__5
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
    // InternalArduino.g:1492:1: rule__Connection__Group__4__Impl : ( ( rule__Connection__WiringAssignment_4 )* ) ;
    public final void rule__Connection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1496:1: ( ( ( rule__Connection__WiringAssignment_4 )* ) )
            // InternalArduino.g:1497:1: ( ( rule__Connection__WiringAssignment_4 )* )
            {
            // InternalArduino.g:1497:1: ( ( rule__Connection__WiringAssignment_4 )* )
            // InternalArduino.g:1498:2: ( rule__Connection__WiringAssignment_4 )*
            {
             before(grammarAccess.getConnectionAccess().getWiringAssignment_4()); 
            // InternalArduino.g:1499:2: ( rule__Connection__WiringAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalArduino.g:1499:3: rule__Connection__WiringAssignment_4
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
    // InternalArduino.g:1507:1: rule__Connection__Group__5 : rule__Connection__Group__5__Impl ;
    public final void rule__Connection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1511:1: ( rule__Connection__Group__5__Impl )
            // InternalArduino.g:1512:2: rule__Connection__Group__5__Impl
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
    // InternalArduino.g:1518:1: rule__Connection__Group__5__Impl : ( '}' ) ;
    public final void rule__Connection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1522:1: ( ( '}' ) )
            // InternalArduino.g:1523:1: ( '}' )
            {
            // InternalArduino.g:1523:1: ( '}' )
            // InternalArduino.g:1524:2: '}'
            {
             before(grammarAccess.getConnectionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,26,FOLLOW_2); 
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
    // InternalArduino.g:1534:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1538:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalArduino.g:1539:2: rule__Component__Group__0__Impl rule__Component__Group__1
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
    // InternalArduino.g:1546:1: rule__Component__Group__0__Impl : ( 'new' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1550:1: ( ( 'new' ) )
            // InternalArduino.g:1551:1: ( 'new' )
            {
            // InternalArduino.g:1551:1: ( 'new' )
            // InternalArduino.g:1552:2: 'new'
            {
             before(grammarAccess.getComponentAccess().getNewKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalArduino.g:1561:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1565:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalArduino.g:1566:2: rule__Component__Group__1__Impl rule__Component__Group__2
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
    // InternalArduino.g:1573:1: rule__Component__Group__1__Impl : ( ( rule__Component__ComponentsAssignment_1 ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1577:1: ( ( ( rule__Component__ComponentsAssignment_1 ) ) )
            // InternalArduino.g:1578:1: ( ( rule__Component__ComponentsAssignment_1 ) )
            {
            // InternalArduino.g:1578:1: ( ( rule__Component__ComponentsAssignment_1 ) )
            // InternalArduino.g:1579:2: ( rule__Component__ComponentsAssignment_1 )
            {
             before(grammarAccess.getComponentAccess().getComponentsAssignment_1()); 
            // InternalArduino.g:1580:2: ( rule__Component__ComponentsAssignment_1 )
            // InternalArduino.g:1580:3: rule__Component__ComponentsAssignment_1
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
    // InternalArduino.g:1588:1: rule__Component__Group__2 : rule__Component__Group__2__Impl ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1592:1: ( rule__Component__Group__2__Impl )
            // InternalArduino.g:1593:2: rule__Component__Group__2__Impl
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
    // InternalArduino.g:1599:1: rule__Component__Group__2__Impl : ( ( rule__Component__NameAssignment_2 ) ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1603:1: ( ( ( rule__Component__NameAssignment_2 ) ) )
            // InternalArduino.g:1604:1: ( ( rule__Component__NameAssignment_2 ) )
            {
            // InternalArduino.g:1604:1: ( ( rule__Component__NameAssignment_2 ) )
            // InternalArduino.g:1605:2: ( rule__Component__NameAssignment_2 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_2()); 
            // InternalArduino.g:1606:2: ( rule__Component__NameAssignment_2 )
            // InternalArduino.g:1606:3: rule__Component__NameAssignment_2
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
    // InternalArduino.g:1615:1: rule__Wiring__Group__0 : rule__Wiring__Group__0__Impl rule__Wiring__Group__1 ;
    public final void rule__Wiring__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1619:1: ( rule__Wiring__Group__0__Impl rule__Wiring__Group__1 )
            // InternalArduino.g:1620:2: rule__Wiring__Group__0__Impl rule__Wiring__Group__1
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
    // InternalArduino.g:1627:1: rule__Wiring__Group__0__Impl : ( ( rule__Wiring__SrcAssignment_0 ) ) ;
    public final void rule__Wiring__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1631:1: ( ( ( rule__Wiring__SrcAssignment_0 ) ) )
            // InternalArduino.g:1632:1: ( ( rule__Wiring__SrcAssignment_0 ) )
            {
            // InternalArduino.g:1632:1: ( ( rule__Wiring__SrcAssignment_0 ) )
            // InternalArduino.g:1633:2: ( rule__Wiring__SrcAssignment_0 )
            {
             before(grammarAccess.getWiringAccess().getSrcAssignment_0()); 
            // InternalArduino.g:1634:2: ( rule__Wiring__SrcAssignment_0 )
            // InternalArduino.g:1634:3: rule__Wiring__SrcAssignment_0
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
    // InternalArduino.g:1642:1: rule__Wiring__Group__1 : rule__Wiring__Group__1__Impl rule__Wiring__Group__2 ;
    public final void rule__Wiring__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1646:1: ( rule__Wiring__Group__1__Impl rule__Wiring__Group__2 )
            // InternalArduino.g:1647:2: rule__Wiring__Group__1__Impl rule__Wiring__Group__2
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
    // InternalArduino.g:1654:1: rule__Wiring__Group__1__Impl : ( '.' ) ;
    public final void rule__Wiring__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1658:1: ( ( '.' ) )
            // InternalArduino.g:1659:1: ( '.' )
            {
            // InternalArduino.g:1659:1: ( '.' )
            // InternalArduino.g:1660:2: '.'
            {
             before(grammarAccess.getWiringAccess().getFullStopKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalArduino.g:1669:1: rule__Wiring__Group__2 : rule__Wiring__Group__2__Impl rule__Wiring__Group__3 ;
    public final void rule__Wiring__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1673:1: ( rule__Wiring__Group__2__Impl rule__Wiring__Group__3 )
            // InternalArduino.g:1674:2: rule__Wiring__Group__2__Impl rule__Wiring__Group__3
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
    // InternalArduino.g:1681:1: rule__Wiring__Group__2__Impl : ( ( rule__Wiring__Src_portAssignment_2 ) ) ;
    public final void rule__Wiring__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1685:1: ( ( ( rule__Wiring__Src_portAssignment_2 ) ) )
            // InternalArduino.g:1686:1: ( ( rule__Wiring__Src_portAssignment_2 ) )
            {
            // InternalArduino.g:1686:1: ( ( rule__Wiring__Src_portAssignment_2 ) )
            // InternalArduino.g:1687:2: ( rule__Wiring__Src_portAssignment_2 )
            {
             before(grammarAccess.getWiringAccess().getSrc_portAssignment_2()); 
            // InternalArduino.g:1688:2: ( rule__Wiring__Src_portAssignment_2 )
            // InternalArduino.g:1688:3: rule__Wiring__Src_portAssignment_2
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
    // InternalArduino.g:1696:1: rule__Wiring__Group__3 : rule__Wiring__Group__3__Impl rule__Wiring__Group__4 ;
    public final void rule__Wiring__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1700:1: ( rule__Wiring__Group__3__Impl rule__Wiring__Group__4 )
            // InternalArduino.g:1701:2: rule__Wiring__Group__3__Impl rule__Wiring__Group__4
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
    // InternalArduino.g:1708:1: rule__Wiring__Group__3__Impl : ( '=' ) ;
    public final void rule__Wiring__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1712:1: ( ( '=' ) )
            // InternalArduino.g:1713:1: ( '=' )
            {
            // InternalArduino.g:1713:1: ( '=' )
            // InternalArduino.g:1714:2: '='
            {
             before(grammarAccess.getWiringAccess().getEqualsSignKeyword_3()); 
            match(input,25,FOLLOW_2); 
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
    // InternalArduino.g:1723:1: rule__Wiring__Group__4 : rule__Wiring__Group__4__Impl rule__Wiring__Group__5 ;
    public final void rule__Wiring__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1727:1: ( rule__Wiring__Group__4__Impl rule__Wiring__Group__5 )
            // InternalArduino.g:1728:2: rule__Wiring__Group__4__Impl rule__Wiring__Group__5
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
    // InternalArduino.g:1735:1: rule__Wiring__Group__4__Impl : ( ( rule__Wiring__TarAssignment_4 ) ) ;
    public final void rule__Wiring__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1739:1: ( ( ( rule__Wiring__TarAssignment_4 ) ) )
            // InternalArduino.g:1740:1: ( ( rule__Wiring__TarAssignment_4 ) )
            {
            // InternalArduino.g:1740:1: ( ( rule__Wiring__TarAssignment_4 ) )
            // InternalArduino.g:1741:2: ( rule__Wiring__TarAssignment_4 )
            {
             before(grammarAccess.getWiringAccess().getTarAssignment_4()); 
            // InternalArduino.g:1742:2: ( rule__Wiring__TarAssignment_4 )
            // InternalArduino.g:1742:3: rule__Wiring__TarAssignment_4
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
    // InternalArduino.g:1750:1: rule__Wiring__Group__5 : rule__Wiring__Group__5__Impl rule__Wiring__Group__6 ;
    public final void rule__Wiring__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1754:1: ( rule__Wiring__Group__5__Impl rule__Wiring__Group__6 )
            // InternalArduino.g:1755:2: rule__Wiring__Group__5__Impl rule__Wiring__Group__6
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
    // InternalArduino.g:1762:1: rule__Wiring__Group__5__Impl : ( '.' ) ;
    public final void rule__Wiring__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1766:1: ( ( '.' ) )
            // InternalArduino.g:1767:1: ( '.' )
            {
            // InternalArduino.g:1767:1: ( '.' )
            // InternalArduino.g:1768:2: '.'
            {
             before(grammarAccess.getWiringAccess().getFullStopKeyword_5()); 
            match(input,34,FOLLOW_2); 
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
    // InternalArduino.g:1777:1: rule__Wiring__Group__6 : rule__Wiring__Group__6__Impl ;
    public final void rule__Wiring__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1781:1: ( rule__Wiring__Group__6__Impl )
            // InternalArduino.g:1782:2: rule__Wiring__Group__6__Impl
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
    // InternalArduino.g:1788:1: rule__Wiring__Group__6__Impl : ( ( rule__Wiring__Tar_portAssignment_6 ) ) ;
    public final void rule__Wiring__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1792:1: ( ( ( rule__Wiring__Tar_portAssignment_6 ) ) )
            // InternalArduino.g:1793:1: ( ( rule__Wiring__Tar_portAssignment_6 ) )
            {
            // InternalArduino.g:1793:1: ( ( rule__Wiring__Tar_portAssignment_6 ) )
            // InternalArduino.g:1794:2: ( rule__Wiring__Tar_portAssignment_6 )
            {
             before(grammarAccess.getWiringAccess().getTar_portAssignment_6()); 
            // InternalArduino.g:1795:2: ( rule__Wiring__Tar_portAssignment_6 )
            // InternalArduino.g:1795:3: rule__Wiring__Tar_portAssignment_6
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
    // InternalArduino.g:1804:1: rule__Behavior__Group__0 : rule__Behavior__Group__0__Impl rule__Behavior__Group__1 ;
    public final void rule__Behavior__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1808:1: ( rule__Behavior__Group__0__Impl rule__Behavior__Group__1 )
            // InternalArduino.g:1809:2: rule__Behavior__Group__0__Impl rule__Behavior__Group__1
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
    // InternalArduino.g:1816:1: rule__Behavior__Group__0__Impl : ( () ) ;
    public final void rule__Behavior__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1820:1: ( ( () ) )
            // InternalArduino.g:1821:1: ( () )
            {
            // InternalArduino.g:1821:1: ( () )
            // InternalArduino.g:1822:2: ()
            {
             before(grammarAccess.getBehaviorAccess().getBehaviorAction_0()); 
            // InternalArduino.g:1823:2: ()
            // InternalArduino.g:1823:3: 
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
    // InternalArduino.g:1831:1: rule__Behavior__Group__1 : rule__Behavior__Group__1__Impl rule__Behavior__Group__2 ;
    public final void rule__Behavior__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1835:1: ( rule__Behavior__Group__1__Impl rule__Behavior__Group__2 )
            // InternalArduino.g:1836:2: rule__Behavior__Group__1__Impl rule__Behavior__Group__2
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
    // InternalArduino.g:1843:1: rule__Behavior__Group__1__Impl : ( 'behavior' ) ;
    public final void rule__Behavior__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1847:1: ( ( 'behavior' ) )
            // InternalArduino.g:1848:1: ( 'behavior' )
            {
            // InternalArduino.g:1848:1: ( 'behavior' )
            // InternalArduino.g:1849:2: 'behavior'
            {
             before(grammarAccess.getBehaviorAccess().getBehaviorKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalArduino.g:1858:1: rule__Behavior__Group__2 : rule__Behavior__Group__2__Impl rule__Behavior__Group__3 ;
    public final void rule__Behavior__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1862:1: ( rule__Behavior__Group__2__Impl rule__Behavior__Group__3 )
            // InternalArduino.g:1863:2: rule__Behavior__Group__2__Impl rule__Behavior__Group__3
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
    // InternalArduino.g:1870:1: rule__Behavior__Group__2__Impl : ( '{' ) ;
    public final void rule__Behavior__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1874:1: ( ( '{' ) )
            // InternalArduino.g:1875:1: ( '{' )
            {
            // InternalArduino.g:1875:1: ( '{' )
            // InternalArduino.g:1876:2: '{'
            {
             before(grammarAccess.getBehaviorAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
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
    // InternalArduino.g:1885:1: rule__Behavior__Group__3 : rule__Behavior__Group__3__Impl rule__Behavior__Group__4 ;
    public final void rule__Behavior__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1889:1: ( rule__Behavior__Group__3__Impl rule__Behavior__Group__4 )
            // InternalArduino.g:1890:2: rule__Behavior__Group__3__Impl rule__Behavior__Group__4
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
    // InternalArduino.g:1897:1: rule__Behavior__Group__3__Impl : ( '@startuml' ) ;
    public final void rule__Behavior__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1901:1: ( ( '@startuml' ) )
            // InternalArduino.g:1902:1: ( '@startuml' )
            {
            // InternalArduino.g:1902:1: ( '@startuml' )
            // InternalArduino.g:1903:2: '@startuml'
            {
             before(grammarAccess.getBehaviorAccess().getStartumlKeyword_3()); 
            match(input,36,FOLLOW_2); 
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
    // InternalArduino.g:1912:1: rule__Behavior__Group__4 : rule__Behavior__Group__4__Impl rule__Behavior__Group__5 ;
    public final void rule__Behavior__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1916:1: ( rule__Behavior__Group__4__Impl rule__Behavior__Group__5 )
            // InternalArduino.g:1917:2: rule__Behavior__Group__4__Impl rule__Behavior__Group__5
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
    // InternalArduino.g:1924:1: rule__Behavior__Group__4__Impl : ( ( rule__Behavior__StatesAssignment_4 )* ) ;
    public final void rule__Behavior__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1928:1: ( ( ( rule__Behavior__StatesAssignment_4 )* ) )
            // InternalArduino.g:1929:1: ( ( rule__Behavior__StatesAssignment_4 )* )
            {
            // InternalArduino.g:1929:1: ( ( rule__Behavior__StatesAssignment_4 )* )
            // InternalArduino.g:1930:2: ( rule__Behavior__StatesAssignment_4 )*
            {
             before(grammarAccess.getBehaviorAccess().getStatesAssignment_4()); 
            // InternalArduino.g:1931:2: ( rule__Behavior__StatesAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    int LA11_2 = input.LA(2);

                    if ( (LA11_2==39) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // InternalArduino.g:1931:3: rule__Behavior__StatesAssignment_4
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
    // InternalArduino.g:1939:1: rule__Behavior__Group__5 : rule__Behavior__Group__5__Impl rule__Behavior__Group__6 ;
    public final void rule__Behavior__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1943:1: ( rule__Behavior__Group__5__Impl rule__Behavior__Group__6 )
            // InternalArduino.g:1944:2: rule__Behavior__Group__5__Impl rule__Behavior__Group__6
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
    // InternalArduino.g:1951:1: rule__Behavior__Group__5__Impl : ( ( rule__Behavior__TransitionsAssignment_5 )* ) ;
    public final void rule__Behavior__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1955:1: ( ( ( rule__Behavior__TransitionsAssignment_5 )* ) )
            // InternalArduino.g:1956:1: ( ( rule__Behavior__TransitionsAssignment_5 )* )
            {
            // InternalArduino.g:1956:1: ( ( rule__Behavior__TransitionsAssignment_5 )* )
            // InternalArduino.g:1957:2: ( rule__Behavior__TransitionsAssignment_5 )*
            {
             before(grammarAccess.getBehaviorAccess().getTransitionsAssignment_5()); 
            // InternalArduino.g:1958:2: ( rule__Behavior__TransitionsAssignment_5 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||LA12_0==21) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalArduino.g:1958:3: rule__Behavior__TransitionsAssignment_5
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
    // InternalArduino.g:1966:1: rule__Behavior__Group__6 : rule__Behavior__Group__6__Impl rule__Behavior__Group__7 ;
    public final void rule__Behavior__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1970:1: ( rule__Behavior__Group__6__Impl rule__Behavior__Group__7 )
            // InternalArduino.g:1971:2: rule__Behavior__Group__6__Impl rule__Behavior__Group__7
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
    // InternalArduino.g:1978:1: rule__Behavior__Group__6__Impl : ( '@enduml' ) ;
    public final void rule__Behavior__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1982:1: ( ( '@enduml' ) )
            // InternalArduino.g:1983:1: ( '@enduml' )
            {
            // InternalArduino.g:1983:1: ( '@enduml' )
            // InternalArduino.g:1984:2: '@enduml'
            {
             before(grammarAccess.getBehaviorAccess().getEndumlKeyword_6()); 
            match(input,37,FOLLOW_2); 
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
    // InternalArduino.g:1993:1: rule__Behavior__Group__7 : rule__Behavior__Group__7__Impl ;
    public final void rule__Behavior__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:1997:1: ( rule__Behavior__Group__7__Impl )
            // InternalArduino.g:1998:2: rule__Behavior__Group__7__Impl
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
    // InternalArduino.g:2004:1: rule__Behavior__Group__7__Impl : ( '}' ) ;
    public final void rule__Behavior__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2008:1: ( ( '}' ) )
            // InternalArduino.g:2009:1: ( '}' )
            {
            // InternalArduino.g:2009:1: ( '}' )
            // InternalArduino.g:2010:2: '}'
            {
             before(grammarAccess.getBehaviorAccess().getRightCurlyBracketKeyword_7()); 
            match(input,26,FOLLOW_2); 
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
    // InternalArduino.g:2020:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2024:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalArduino.g:2025:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
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
    // InternalArduino.g:2032:1: rule__Transition__Group__0__Impl : ( ( rule__Transition__Alternatives_0 ) ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2036:1: ( ( ( rule__Transition__Alternatives_0 ) ) )
            // InternalArduino.g:2037:1: ( ( rule__Transition__Alternatives_0 ) )
            {
            // InternalArduino.g:2037:1: ( ( rule__Transition__Alternatives_0 ) )
            // InternalArduino.g:2038:2: ( rule__Transition__Alternatives_0 )
            {
             before(grammarAccess.getTransitionAccess().getAlternatives_0()); 
            // InternalArduino.g:2039:2: ( rule__Transition__Alternatives_0 )
            // InternalArduino.g:2039:3: rule__Transition__Alternatives_0
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
    // InternalArduino.g:2047:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2051:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalArduino.g:2052:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
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
    // InternalArduino.g:2059:1: rule__Transition__Group__1__Impl : ( '-->' ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2063:1: ( ( '-->' ) )
            // InternalArduino.g:2064:1: ( '-->' )
            {
            // InternalArduino.g:2064:1: ( '-->' )
            // InternalArduino.g:2065:2: '-->'
            {
             before(grammarAccess.getTransitionAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalArduino.g:2074:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2078:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // InternalArduino.g:2079:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
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
    // InternalArduino.g:2086:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__Tar_stateAssignment_2 ) ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2090:1: ( ( ( rule__Transition__Tar_stateAssignment_2 ) ) )
            // InternalArduino.g:2091:1: ( ( rule__Transition__Tar_stateAssignment_2 ) )
            {
            // InternalArduino.g:2091:1: ( ( rule__Transition__Tar_stateAssignment_2 ) )
            // InternalArduino.g:2092:2: ( rule__Transition__Tar_stateAssignment_2 )
            {
             before(grammarAccess.getTransitionAccess().getTar_stateAssignment_2()); 
            // InternalArduino.g:2093:2: ( rule__Transition__Tar_stateAssignment_2 )
            // InternalArduino.g:2093:3: rule__Transition__Tar_stateAssignment_2
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
    // InternalArduino.g:2101:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2105:1: ( rule__Transition__Group__3__Impl )
            // InternalArduino.g:2106:2: rule__Transition__Group__3__Impl
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
    // InternalArduino.g:2112:1: rule__Transition__Group__3__Impl : ( ( rule__Transition__Transition_effectAssignment_3 )? ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2116:1: ( ( ( rule__Transition__Transition_effectAssignment_3 )? ) )
            // InternalArduino.g:2117:1: ( ( rule__Transition__Transition_effectAssignment_3 )? )
            {
            // InternalArduino.g:2117:1: ( ( rule__Transition__Transition_effectAssignment_3 )? )
            // InternalArduino.g:2118:2: ( rule__Transition__Transition_effectAssignment_3 )?
            {
             before(grammarAccess.getTransitionAccess().getTransition_effectAssignment_3()); 
            // InternalArduino.g:2119:2: ( rule__Transition__Transition_effectAssignment_3 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==39) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalArduino.g:2119:3: rule__Transition__Transition_effectAssignment_3
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
    // InternalArduino.g:2128:1: rule__Transition_effect__Group__0 : rule__Transition_effect__Group__0__Impl rule__Transition_effect__Group__1 ;
    public final void rule__Transition_effect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2132:1: ( rule__Transition_effect__Group__0__Impl rule__Transition_effect__Group__1 )
            // InternalArduino.g:2133:2: rule__Transition_effect__Group__0__Impl rule__Transition_effect__Group__1
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
    // InternalArduino.g:2140:1: rule__Transition_effect__Group__0__Impl : ( ':' ) ;
    public final void rule__Transition_effect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2144:1: ( ( ':' ) )
            // InternalArduino.g:2145:1: ( ':' )
            {
            // InternalArduino.g:2145:1: ( ':' )
            // InternalArduino.g:2146:2: ':'
            {
             before(grammarAccess.getTransition_effectAccess().getColonKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalArduino.g:2155:1: rule__Transition_effect__Group__1 : rule__Transition_effect__Group__1__Impl rule__Transition_effect__Group__2 ;
    public final void rule__Transition_effect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2159:1: ( rule__Transition_effect__Group__1__Impl rule__Transition_effect__Group__2 )
            // InternalArduino.g:2160:2: rule__Transition_effect__Group__1__Impl rule__Transition_effect__Group__2
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
    // InternalArduino.g:2167:1: rule__Transition_effect__Group__1__Impl : ( 'delay' ) ;
    public final void rule__Transition_effect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2171:1: ( ( 'delay' ) )
            // InternalArduino.g:2172:1: ( 'delay' )
            {
            // InternalArduino.g:2172:1: ( 'delay' )
            // InternalArduino.g:2173:2: 'delay'
            {
             before(grammarAccess.getTransition_effectAccess().getDelayKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalArduino.g:2182:1: rule__Transition_effect__Group__2 : rule__Transition_effect__Group__2__Impl rule__Transition_effect__Group__3 ;
    public final void rule__Transition_effect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2186:1: ( rule__Transition_effect__Group__2__Impl rule__Transition_effect__Group__3 )
            // InternalArduino.g:2187:2: rule__Transition_effect__Group__2__Impl rule__Transition_effect__Group__3
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
    // InternalArduino.g:2194:1: rule__Transition_effect__Group__2__Impl : ( '[' ) ;
    public final void rule__Transition_effect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2198:1: ( ( '[' ) )
            // InternalArduino.g:2199:1: ( '[' )
            {
            // InternalArduino.g:2199:1: ( '[' )
            // InternalArduino.g:2200:2: '['
            {
             before(grammarAccess.getTransition_effectAccess().getLeftSquareBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalArduino.g:2209:1: rule__Transition_effect__Group__3 : rule__Transition_effect__Group__3__Impl rule__Transition_effect__Group__4 ;
    public final void rule__Transition_effect__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2213:1: ( rule__Transition_effect__Group__3__Impl rule__Transition_effect__Group__4 )
            // InternalArduino.g:2214:2: rule__Transition_effect__Group__3__Impl rule__Transition_effect__Group__4
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
    // InternalArduino.g:2221:1: rule__Transition_effect__Group__3__Impl : ( ( rule__Transition_effect__MicrosecondsAssignment_3 ) ) ;
    public final void rule__Transition_effect__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2225:1: ( ( ( rule__Transition_effect__MicrosecondsAssignment_3 ) ) )
            // InternalArduino.g:2226:1: ( ( rule__Transition_effect__MicrosecondsAssignment_3 ) )
            {
            // InternalArduino.g:2226:1: ( ( rule__Transition_effect__MicrosecondsAssignment_3 ) )
            // InternalArduino.g:2227:2: ( rule__Transition_effect__MicrosecondsAssignment_3 )
            {
             before(grammarAccess.getTransition_effectAccess().getMicrosecondsAssignment_3()); 
            // InternalArduino.g:2228:2: ( rule__Transition_effect__MicrosecondsAssignment_3 )
            // InternalArduino.g:2228:3: rule__Transition_effect__MicrosecondsAssignment_3
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
    // InternalArduino.g:2236:1: rule__Transition_effect__Group__4 : rule__Transition_effect__Group__4__Impl ;
    public final void rule__Transition_effect__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2240:1: ( rule__Transition_effect__Group__4__Impl )
            // InternalArduino.g:2241:2: rule__Transition_effect__Group__4__Impl
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
    // InternalArduino.g:2247:1: rule__Transition_effect__Group__4__Impl : ( ']' ) ;
    public final void rule__Transition_effect__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2251:1: ( ( ']' ) )
            // InternalArduino.g:2252:1: ( ']' )
            {
            // InternalArduino.g:2252:1: ( ']' )
            // InternalArduino.g:2253:2: ']'
            {
             before(grammarAccess.getTransition_effectAccess().getRightSquareBracketKeyword_4()); 
            match(input,30,FOLLOW_2); 
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
    // InternalArduino.g:2263:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2267:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalArduino.g:2268:2: rule__State__Group__0__Impl rule__State__Group__1
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
    // InternalArduino.g:2275:1: rule__State__Group__0__Impl : ( ( rule__State__NameAssignment_0 ) ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2279:1: ( ( ( rule__State__NameAssignment_0 ) ) )
            // InternalArduino.g:2280:1: ( ( rule__State__NameAssignment_0 ) )
            {
            // InternalArduino.g:2280:1: ( ( rule__State__NameAssignment_0 ) )
            // InternalArduino.g:2281:2: ( rule__State__NameAssignment_0 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_0()); 
            // InternalArduino.g:2282:2: ( rule__State__NameAssignment_0 )
            // InternalArduino.g:2282:3: rule__State__NameAssignment_0
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
    // InternalArduino.g:2290:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2294:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // InternalArduino.g:2295:2: rule__State__Group__1__Impl rule__State__Group__2
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
    // InternalArduino.g:2302:1: rule__State__Group__1__Impl : ( ':' ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2306:1: ( ( ':' ) )
            // InternalArduino.g:2307:1: ( ':' )
            {
            // InternalArduino.g:2307:1: ( ':' )
            // InternalArduino.g:2308:2: ':'
            {
             before(grammarAccess.getStateAccess().getColonKeyword_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalArduino.g:2317:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2321:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // InternalArduino.g:2322:2: rule__State__Group__2__Impl rule__State__Group__3
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
    // InternalArduino.g:2329:1: rule__State__Group__2__Impl : ( ( rule__State__ComponentAssignment_2 ) ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2333:1: ( ( ( rule__State__ComponentAssignment_2 ) ) )
            // InternalArduino.g:2334:1: ( ( rule__State__ComponentAssignment_2 ) )
            {
            // InternalArduino.g:2334:1: ( ( rule__State__ComponentAssignment_2 ) )
            // InternalArduino.g:2335:2: ( rule__State__ComponentAssignment_2 )
            {
             before(grammarAccess.getStateAccess().getComponentAssignment_2()); 
            // InternalArduino.g:2336:2: ( rule__State__ComponentAssignment_2 )
            // InternalArduino.g:2336:3: rule__State__ComponentAssignment_2
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
    // InternalArduino.g:2344:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2348:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // InternalArduino.g:2349:2: rule__State__Group__3__Impl rule__State__Group__4
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
    // InternalArduino.g:2356:1: rule__State__Group__3__Impl : ( '.state' ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2360:1: ( ( '.state' ) )
            // InternalArduino.g:2361:1: ( '.state' )
            {
            // InternalArduino.g:2361:1: ( '.state' )
            // InternalArduino.g:2362:2: '.state'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_3()); 
            match(input,41,FOLLOW_2); 
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
    // InternalArduino.g:2371:1: rule__State__Group__4 : rule__State__Group__4__Impl rule__State__Group__5 ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2375:1: ( rule__State__Group__4__Impl rule__State__Group__5 )
            // InternalArduino.g:2376:2: rule__State__Group__4__Impl rule__State__Group__5
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
    // InternalArduino.g:2383:1: rule__State__Group__4__Impl : ( '=' ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2387:1: ( ( '=' ) )
            // InternalArduino.g:2388:1: ( '=' )
            {
            // InternalArduino.g:2388:1: ( '=' )
            // InternalArduino.g:2389:2: '='
            {
             before(grammarAccess.getStateAccess().getEqualsSignKeyword_4()); 
            match(input,25,FOLLOW_2); 
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
    // InternalArduino.g:2398:1: rule__State__Group__5 : rule__State__Group__5__Impl ;
    public final void rule__State__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2402:1: ( rule__State__Group__5__Impl )
            // InternalArduino.g:2403:2: rule__State__Group__5__Impl
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
    // InternalArduino.g:2409:1: rule__State__Group__5__Impl : ( ( rule__State__Component_stateAssignment_5 ) ) ;
    public final void rule__State__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2413:1: ( ( ( rule__State__Component_stateAssignment_5 ) ) )
            // InternalArduino.g:2414:1: ( ( rule__State__Component_stateAssignment_5 ) )
            {
            // InternalArduino.g:2414:1: ( ( rule__State__Component_stateAssignment_5 ) )
            // InternalArduino.g:2415:2: ( rule__State__Component_stateAssignment_5 )
            {
             before(grammarAccess.getStateAccess().getComponent_stateAssignment_5()); 
            // InternalArduino.g:2416:2: ( rule__State__Component_stateAssignment_5 )
            // InternalArduino.g:2416:3: rule__State__Component_stateAssignment_5
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
    // InternalArduino.g:2425:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2429:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalArduino.g:2430:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
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
    // InternalArduino.g:2437:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2441:1: ( ( RULE_ID ) )
            // InternalArduino.g:2442:1: ( RULE_ID )
            {
            // InternalArduino.g:2442:1: ( RULE_ID )
            // InternalArduino.g:2443:2: RULE_ID
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
    // InternalArduino.g:2452:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2456:1: ( rule__FQN__Group__1__Impl )
            // InternalArduino.g:2457:2: rule__FQN__Group__1__Impl
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
    // InternalArduino.g:2463:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2467:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalArduino.g:2468:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalArduino.g:2468:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalArduino.g:2469:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalArduino.g:2470:2: ( rule__FQN__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==34) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalArduino.g:2470:3: rule__FQN__Group_1__0
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
    // InternalArduino.g:2479:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2483:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalArduino.g:2484:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
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
    // InternalArduino.g:2491:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2495:1: ( ( '.' ) )
            // InternalArduino.g:2496:1: ( '.' )
            {
            // InternalArduino.g:2496:1: ( '.' )
            // InternalArduino.g:2497:2: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalArduino.g:2506:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2510:1: ( rule__FQN__Group_1__1__Impl )
            // InternalArduino.g:2511:2: rule__FQN__Group_1__1__Impl
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
    // InternalArduino.g:2517:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2521:1: ( ( RULE_ID ) )
            // InternalArduino.g:2522:1: ( RULE_ID )
            {
            // InternalArduino.g:2522:1: ( RULE_ID )
            // InternalArduino.g:2523:2: RULE_ID
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
    // InternalArduino.g:2533:1: rule__Model__ComponentsAssignment_0 : ( rulecomponents ) ;
    public final void rule__Model__ComponentsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2537:1: ( ( rulecomponents ) )
            // InternalArduino.g:2538:2: ( rulecomponents )
            {
            // InternalArduino.g:2538:2: ( rulecomponents )
            // InternalArduino.g:2539:3: rulecomponents
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
    // InternalArduino.g:2548:1: rule__Model__ConnectionAssignment_1 : ( ruleconnection ) ;
    public final void rule__Model__ConnectionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2552:1: ( ( ruleconnection ) )
            // InternalArduino.g:2553:2: ( ruleconnection )
            {
            // InternalArduino.g:2553:2: ( ruleconnection )
            // InternalArduino.g:2554:3: ruleconnection
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
    // InternalArduino.g:2563:1: rule__Model__BehaviorAssignment_2 : ( rulebehavior ) ;
    public final void rule__Model__BehaviorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2567:1: ( ( rulebehavior ) )
            // InternalArduino.g:2568:2: ( rulebehavior )
            {
            // InternalArduino.g:2568:2: ( rulebehavior )
            // InternalArduino.g:2569:3: rulebehavior
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
    // InternalArduino.g:2578:1: rule__Components__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Components__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2582:1: ( ( RULE_ID ) )
            // InternalArduino.g:2583:2: ( RULE_ID )
            {
            // InternalArduino.g:2583:2: ( RULE_ID )
            // InternalArduino.g:2584:3: RULE_ID
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
    // InternalArduino.g:2593:1: rule__Components__ConnectorsAssignment_12 : ( ruleconnectors ) ;
    public final void rule__Components__ConnectorsAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2597:1: ( ( ruleconnectors ) )
            // InternalArduino.g:2598:2: ( ruleconnectors )
            {
            // InternalArduino.g:2598:2: ( ruleconnectors )
            // InternalArduino.g:2599:3: ruleconnectors
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


    // $ANTLR start "rule__Components__Component_stateAssignment_14_3"
    // InternalArduino.g:2608:1: rule__Components__Component_stateAssignment_14_3 : ( rulecomponent_state ) ;
    public final void rule__Components__Component_stateAssignment_14_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2612:1: ( ( rulecomponent_state ) )
            // InternalArduino.g:2613:2: ( rulecomponent_state )
            {
            // InternalArduino.g:2613:2: ( rulecomponent_state )
            // InternalArduino.g:2614:3: rulecomponent_state
            {
             before(grammarAccess.getComponentsAccess().getComponent_stateComponent_stateParserRuleCall_14_3_0()); 
            pushFollow(FOLLOW_2);
            rulecomponent_state();

            state._fsp--;

             after(grammarAccess.getComponentsAccess().getComponent_stateComponent_stateParserRuleCall_14_3_0()); 

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
    // $ANTLR end "rule__Components__Component_stateAssignment_14_3"


    // $ANTLR start "rule__Component_state__NameAssignment_0"
    // InternalArduino.g:2623:1: rule__Component_state__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Component_state__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2627:1: ( ( RULE_ID ) )
            // InternalArduino.g:2628:2: ( RULE_ID )
            {
            // InternalArduino.g:2628:2: ( RULE_ID )
            // InternalArduino.g:2629:3: RULE_ID
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
    // InternalArduino.g:2638:1: rule__Connection__ComponentAssignment_3 : ( rulecomponent ) ;
    public final void rule__Connection__ComponentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2642:1: ( ( rulecomponent ) )
            // InternalArduino.g:2643:2: ( rulecomponent )
            {
            // InternalArduino.g:2643:2: ( rulecomponent )
            // InternalArduino.g:2644:3: rulecomponent
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
    // InternalArduino.g:2653:1: rule__Connection__WiringAssignment_4 : ( rulewiring ) ;
    public final void rule__Connection__WiringAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2657:1: ( ( rulewiring ) )
            // InternalArduino.g:2658:2: ( rulewiring )
            {
            // InternalArduino.g:2658:2: ( rulewiring )
            // InternalArduino.g:2659:3: rulewiring
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
    // InternalArduino.g:2668:1: rule__Component__ComponentsAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Component__ComponentsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2672:1: ( ( ( RULE_ID ) ) )
            // InternalArduino.g:2673:2: ( ( RULE_ID ) )
            {
            // InternalArduino.g:2673:2: ( ( RULE_ID ) )
            // InternalArduino.g:2674:3: ( RULE_ID )
            {
             before(grammarAccess.getComponentAccess().getComponentsComponentsCrossReference_1_0()); 
            // InternalArduino.g:2675:3: ( RULE_ID )
            // InternalArduino.g:2676:4: RULE_ID
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
    // InternalArduino.g:2687:1: rule__Component__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Component__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2691:1: ( ( RULE_ID ) )
            // InternalArduino.g:2692:2: ( RULE_ID )
            {
            // InternalArduino.g:2692:2: ( RULE_ID )
            // InternalArduino.g:2693:3: RULE_ID
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
    // InternalArduino.g:2702:1: rule__Wiring__SrcAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Wiring__SrcAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2706:1: ( ( ( RULE_ID ) ) )
            // InternalArduino.g:2707:2: ( ( RULE_ID ) )
            {
            // InternalArduino.g:2707:2: ( ( RULE_ID ) )
            // InternalArduino.g:2708:3: ( RULE_ID )
            {
             before(grammarAccess.getWiringAccess().getSrcComponentCrossReference_0_0()); 
            // InternalArduino.g:2709:3: ( RULE_ID )
            // InternalArduino.g:2710:4: RULE_ID
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
    // InternalArduino.g:2721:1: rule__Wiring__Src_portAssignment_2 : ( ruleconnectors ) ;
    public final void rule__Wiring__Src_portAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2725:1: ( ( ruleconnectors ) )
            // InternalArduino.g:2726:2: ( ruleconnectors )
            {
            // InternalArduino.g:2726:2: ( ruleconnectors )
            // InternalArduino.g:2727:3: ruleconnectors
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
    // InternalArduino.g:2736:1: rule__Wiring__TarAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Wiring__TarAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2740:1: ( ( ( RULE_ID ) ) )
            // InternalArduino.g:2741:2: ( ( RULE_ID ) )
            {
            // InternalArduino.g:2741:2: ( ( RULE_ID ) )
            // InternalArduino.g:2742:3: ( RULE_ID )
            {
             before(grammarAccess.getWiringAccess().getTarComponentCrossReference_4_0()); 
            // InternalArduino.g:2743:3: ( RULE_ID )
            // InternalArduino.g:2744:4: RULE_ID
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
    // InternalArduino.g:2755:1: rule__Wiring__Tar_portAssignment_6 : ( ruleconnectors ) ;
    public final void rule__Wiring__Tar_portAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2759:1: ( ( ruleconnectors ) )
            // InternalArduino.g:2760:2: ( ruleconnectors )
            {
            // InternalArduino.g:2760:2: ( ruleconnectors )
            // InternalArduino.g:2761:3: ruleconnectors
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
    // InternalArduino.g:2770:1: rule__Behavior__StatesAssignment_4 : ( rulestate ) ;
    public final void rule__Behavior__StatesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2774:1: ( ( rulestate ) )
            // InternalArduino.g:2775:2: ( rulestate )
            {
            // InternalArduino.g:2775:2: ( rulestate )
            // InternalArduino.g:2776:3: rulestate
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
    // InternalArduino.g:2785:1: rule__Behavior__TransitionsAssignment_5 : ( ruletransition ) ;
    public final void rule__Behavior__TransitionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2789:1: ( ( ruletransition ) )
            // InternalArduino.g:2790:2: ( ruletransition )
            {
            // InternalArduino.g:2790:2: ( ruletransition )
            // InternalArduino.g:2791:3: ruletransition
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
    // InternalArduino.g:2800:1: rule__Transition__Src_stateAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__Src_stateAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2804:1: ( ( ( RULE_ID ) ) )
            // InternalArduino.g:2805:2: ( ( RULE_ID ) )
            {
            // InternalArduino.g:2805:2: ( ( RULE_ID ) )
            // InternalArduino.g:2806:3: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getSrc_stateStateCrossReference_0_1_0()); 
            // InternalArduino.g:2807:3: ( RULE_ID )
            // InternalArduino.g:2808:4: RULE_ID
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
    // InternalArduino.g:2819:1: rule__Transition__Tar_stateAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__Tar_stateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2823:1: ( ( ( RULE_ID ) ) )
            // InternalArduino.g:2824:2: ( ( RULE_ID ) )
            {
            // InternalArduino.g:2824:2: ( ( RULE_ID ) )
            // InternalArduino.g:2825:3: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getTar_stateStateCrossReference_2_0()); 
            // InternalArduino.g:2826:3: ( RULE_ID )
            // InternalArduino.g:2827:4: RULE_ID
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
    // InternalArduino.g:2838:1: rule__Transition__Transition_effectAssignment_3 : ( ruletransition_effect ) ;
    public final void rule__Transition__Transition_effectAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2842:1: ( ( ruletransition_effect ) )
            // InternalArduino.g:2843:2: ( ruletransition_effect )
            {
            // InternalArduino.g:2843:2: ( ruletransition_effect )
            // InternalArduino.g:2844:3: ruletransition_effect
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
    // InternalArduino.g:2853:1: rule__Transition_effect__MicrosecondsAssignment_3 : ( RULE_INT ) ;
    public final void rule__Transition_effect__MicrosecondsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2857:1: ( ( RULE_INT ) )
            // InternalArduino.g:2858:2: ( RULE_INT )
            {
            // InternalArduino.g:2858:2: ( RULE_INT )
            // InternalArduino.g:2859:3: RULE_INT
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
    // InternalArduino.g:2868:1: rule__State__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2872:1: ( ( RULE_ID ) )
            // InternalArduino.g:2873:2: ( RULE_ID )
            {
            // InternalArduino.g:2873:2: ( RULE_ID )
            // InternalArduino.g:2874:3: RULE_ID
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
    // InternalArduino.g:2883:1: rule__State__ComponentAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__State__ComponentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2887:1: ( ( ( RULE_ID ) ) )
            // InternalArduino.g:2888:2: ( ( RULE_ID ) )
            {
            // InternalArduino.g:2888:2: ( ( RULE_ID ) )
            // InternalArduino.g:2889:3: ( RULE_ID )
            {
             before(grammarAccess.getStateAccess().getComponentComponentCrossReference_2_0()); 
            // InternalArduino.g:2890:3: ( RULE_ID )
            // InternalArduino.g:2891:4: RULE_ID
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
    // InternalArduino.g:2902:1: rule__State__Component_stateAssignment_5 : ( ( ruleFQN ) ) ;
    public final void rule__State__Component_stateAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduino.g:2906:1: ( ( ( ruleFQN ) ) )
            // InternalArduino.g:2907:2: ( ( ruleFQN ) )
            {
            // InternalArduino.g:2907:2: ( ( ruleFQN ) )
            // InternalArduino.g:2908:3: ( ruleFQN )
            {
             before(grammarAccess.getStateAccess().getComponent_stateComponent_stateCrossReference_5_0()); 
            // InternalArduino.g:2909:3: ( ruleFQN )
            // InternalArduino.g:2910:4: ruleFQN
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000004007C000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000007C002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000084000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000007C000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000204000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002000200010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000200012L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000400000002L});

}