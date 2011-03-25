package org.mcj.karel.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.mcj.karel.services.KarelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKarelParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'NORTH'", "'SOUTH'", "'WEST'", "'EAST'", "'move'", "'turn'", "'turnOn'", "'turnOff'", "'put'", "'get'", "'WALL_AHEAD'", "'MARKED_PLACE'", "'BEGIN-PROGRAM'", "'END-PROGRAM'", "'BEGIN-INIT'", "'END-INIT'", "'position'", "','", "';'", "'heading'", "'boardSize'", "'DEFINE COMMAND'", "'AS'", "'BEGIN'", "'END'", "'BEGIN-MAIN'", "'END-MAIN'", "'IF'", "'('", "')'", "'{'", "'}'", "'ELSE'", "'ITERATE'", "'TIMES'", "'WHILE'", "'@('", "'!'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=4;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalKarelParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g"; }


     
     	private KarelGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(KarelGrammarAccess grammarAccess) {
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




    // $ANTLR start entryRuleProgram
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:61:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:62:1: ( ruleProgram EOF )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:63:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram61);
            ruleProgram();
            _fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram68); 

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
    // $ANTLR end entryRuleProgram


    // $ANTLR start ruleProgram
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:70:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:74:2: ( ( ( rule__Program__Group__0 ) ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:75:1: ( ( rule__Program__Group__0 ) )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:75:1: ( ( rule__Program__Group__0 ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:76:1: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:77:1: ( rule__Program__Group__0 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:77:2: rule__Program__Group__0
            {
            pushFollow(FOLLOW_rule__Program__Group__0_in_ruleProgram94);
            rule__Program__Group__0();
            _fsp--;


            }

             after(grammarAccess.getProgramAccess().getGroup()); 

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
    // $ANTLR end ruleProgram


    // $ANTLR start entryRuleInitSection
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:89:1: entryRuleInitSection : ruleInitSection EOF ;
    public final void entryRuleInitSection() throws RecognitionException {
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:90:1: ( ruleInitSection EOF )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:91:1: ruleInitSection EOF
            {
             before(grammarAccess.getInitSectionRule()); 
            pushFollow(FOLLOW_ruleInitSection_in_entryRuleInitSection121);
            ruleInitSection();
            _fsp--;

             after(grammarAccess.getInitSectionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitSection128); 

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
    // $ANTLR end entryRuleInitSection


    // $ANTLR start ruleInitSection
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:98:1: ruleInitSection : ( ( rule__InitSection__Group__0 ) ) ;
    public final void ruleInitSection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:102:2: ( ( ( rule__InitSection__Group__0 ) ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:103:1: ( ( rule__InitSection__Group__0 ) )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:103:1: ( ( rule__InitSection__Group__0 ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:104:1: ( rule__InitSection__Group__0 )
            {
             before(grammarAccess.getInitSectionAccess().getGroup()); 
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:105:1: ( rule__InitSection__Group__0 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:105:2: rule__InitSection__Group__0
            {
            pushFollow(FOLLOW_rule__InitSection__Group__0_in_ruleInitSection154);
            rule__InitSection__Group__0();
            _fsp--;


            }

             after(grammarAccess.getInitSectionAccess().getGroup()); 

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
    // $ANTLR end ruleInitSection


    // $ANTLR start entryRuleInitCommand
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:117:1: entryRuleInitCommand : ruleInitCommand EOF ;
    public final void entryRuleInitCommand() throws RecognitionException {
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:118:1: ( ruleInitCommand EOF )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:119:1: ruleInitCommand EOF
            {
             before(grammarAccess.getInitCommandRule()); 
            pushFollow(FOLLOW_ruleInitCommand_in_entryRuleInitCommand181);
            ruleInitCommand();
            _fsp--;

             after(grammarAccess.getInitCommandRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitCommand188); 

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
    // $ANTLR end entryRuleInitCommand


    // $ANTLR start ruleInitCommand
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:126:1: ruleInitCommand : ( ( rule__InitCommand__Alternatives ) ) ;
    public final void ruleInitCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:130:2: ( ( ( rule__InitCommand__Alternatives ) ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:131:1: ( ( rule__InitCommand__Alternatives ) )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:131:1: ( ( rule__InitCommand__Alternatives ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:132:1: ( rule__InitCommand__Alternatives )
            {
             before(grammarAccess.getInitCommandAccess().getAlternatives()); 
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:133:1: ( rule__InitCommand__Alternatives )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:133:2: rule__InitCommand__Alternatives
            {
            pushFollow(FOLLOW_rule__InitCommand__Alternatives_in_ruleInitCommand214);
            rule__InitCommand__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getInitCommandAccess().getAlternatives()); 

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
    // $ANTLR end ruleInitCommand


    // $ANTLR start entryRuleInitPositionCommand
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:145:1: entryRuleInitPositionCommand : ruleInitPositionCommand EOF ;
    public final void entryRuleInitPositionCommand() throws RecognitionException {
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:146:1: ( ruleInitPositionCommand EOF )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:147:1: ruleInitPositionCommand EOF
            {
             before(grammarAccess.getInitPositionCommandRule()); 
            pushFollow(FOLLOW_ruleInitPositionCommand_in_entryRuleInitPositionCommand241);
            ruleInitPositionCommand();
            _fsp--;

             after(grammarAccess.getInitPositionCommandRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitPositionCommand248); 

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
    // $ANTLR end entryRuleInitPositionCommand


    // $ANTLR start ruleInitPositionCommand
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:154:1: ruleInitPositionCommand : ( ( rule__InitPositionCommand__Group__0 ) ) ;
    public final void ruleInitPositionCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:158:2: ( ( ( rule__InitPositionCommand__Group__0 ) ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:159:1: ( ( rule__InitPositionCommand__Group__0 ) )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:159:1: ( ( rule__InitPositionCommand__Group__0 ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:160:1: ( rule__InitPositionCommand__Group__0 )
            {
             before(grammarAccess.getInitPositionCommandAccess().getGroup()); 
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:161:1: ( rule__InitPositionCommand__Group__0 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:161:2: rule__InitPositionCommand__Group__0
            {
            pushFollow(FOLLOW_rule__InitPositionCommand__Group__0_in_ruleInitPositionCommand274);
            rule__InitPositionCommand__Group__0();
            _fsp--;


            }

             after(grammarAccess.getInitPositionCommandAccess().getGroup()); 

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
    // $ANTLR end ruleInitPositionCommand


    // $ANTLR start entryRuleInitHeadingCommand
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:173:1: entryRuleInitHeadingCommand : ruleInitHeadingCommand EOF ;
    public final void entryRuleInitHeadingCommand() throws RecognitionException {
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:174:1: ( ruleInitHeadingCommand EOF )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:175:1: ruleInitHeadingCommand EOF
            {
             before(grammarAccess.getInitHeadingCommandRule()); 
            pushFollow(FOLLOW_ruleInitHeadingCommand_in_entryRuleInitHeadingCommand301);
            ruleInitHeadingCommand();
            _fsp--;

             after(grammarAccess.getInitHeadingCommandRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitHeadingCommand308); 

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
    // $ANTLR end entryRuleInitHeadingCommand


    // $ANTLR start ruleInitHeadingCommand
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:182:1: ruleInitHeadingCommand : ( ( rule__InitHeadingCommand__Group__0 ) ) ;
    public final void ruleInitHeadingCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:186:2: ( ( ( rule__InitHeadingCommand__Group__0 ) ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:187:1: ( ( rule__InitHeadingCommand__Group__0 ) )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:187:1: ( ( rule__InitHeadingCommand__Group__0 ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:188:1: ( rule__InitHeadingCommand__Group__0 )
            {
             before(grammarAccess.getInitHeadingCommandAccess().getGroup()); 
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:189:1: ( rule__InitHeadingCommand__Group__0 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:189:2: rule__InitHeadingCommand__Group__0
            {
            pushFollow(FOLLOW_rule__InitHeadingCommand__Group__0_in_ruleInitHeadingCommand334);
            rule__InitHeadingCommand__Group__0();
            _fsp--;


            }

             after(grammarAccess.getInitHeadingCommandAccess().getGroup()); 

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
    // $ANTLR end ruleInitHeadingCommand


    // $ANTLR start entryRuleInitBoardSizeCommand
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:201:1: entryRuleInitBoardSizeCommand : ruleInitBoardSizeCommand EOF ;
    public final void entryRuleInitBoardSizeCommand() throws RecognitionException {
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:202:1: ( ruleInitBoardSizeCommand EOF )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:203:1: ruleInitBoardSizeCommand EOF
            {
             before(grammarAccess.getInitBoardSizeCommandRule()); 
            pushFollow(FOLLOW_ruleInitBoardSizeCommand_in_entryRuleInitBoardSizeCommand361);
            ruleInitBoardSizeCommand();
            _fsp--;

             after(grammarAccess.getInitBoardSizeCommandRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitBoardSizeCommand368); 

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
    // $ANTLR end entryRuleInitBoardSizeCommand


    // $ANTLR start ruleInitBoardSizeCommand
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:210:1: ruleInitBoardSizeCommand : ( ( rule__InitBoardSizeCommand__Group__0 ) ) ;
    public final void ruleInitBoardSizeCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:214:2: ( ( ( rule__InitBoardSizeCommand__Group__0 ) ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:215:1: ( ( rule__InitBoardSizeCommand__Group__0 ) )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:215:1: ( ( rule__InitBoardSizeCommand__Group__0 ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:216:1: ( rule__InitBoardSizeCommand__Group__0 )
            {
             before(grammarAccess.getInitBoardSizeCommandAccess().getGroup()); 
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:217:1: ( rule__InitBoardSizeCommand__Group__0 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:217:2: rule__InitBoardSizeCommand__Group__0
            {
            pushFollow(FOLLOW_rule__InitBoardSizeCommand__Group__0_in_ruleInitBoardSizeCommand394);
            rule__InitBoardSizeCommand__Group__0();
            _fsp--;


            }

             after(grammarAccess.getInitBoardSizeCommandAccess().getGroup()); 

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
    // $ANTLR end ruleInitBoardSizeCommand


    // $ANTLR start entryRuleUserDefinedCommand
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:229:1: entryRuleUserDefinedCommand : ruleUserDefinedCommand EOF ;
    public final void entryRuleUserDefinedCommand() throws RecognitionException {
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:230:1: ( ruleUserDefinedCommand EOF )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:231:1: ruleUserDefinedCommand EOF
            {
             before(grammarAccess.getUserDefinedCommandRule()); 
            pushFollow(FOLLOW_ruleUserDefinedCommand_in_entryRuleUserDefinedCommand421);
            ruleUserDefinedCommand();
            _fsp--;

             after(grammarAccess.getUserDefinedCommandRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserDefinedCommand428); 

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
    // $ANTLR end entryRuleUserDefinedCommand


    // $ANTLR start ruleUserDefinedCommand
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:238:1: ruleUserDefinedCommand : ( ( rule__UserDefinedCommand__Group__0 ) ) ;
    public final void ruleUserDefinedCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:242:2: ( ( ( rule__UserDefinedCommand__Group__0 ) ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:243:1: ( ( rule__UserDefinedCommand__Group__0 ) )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:243:1: ( ( rule__UserDefinedCommand__Group__0 ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:244:1: ( rule__UserDefinedCommand__Group__0 )
            {
             before(grammarAccess.getUserDefinedCommandAccess().getGroup()); 
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:245:1: ( rule__UserDefinedCommand__Group__0 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:245:2: rule__UserDefinedCommand__Group__0
            {
            pushFollow(FOLLOW_rule__UserDefinedCommand__Group__0_in_ruleUserDefinedCommand454);
            rule__UserDefinedCommand__Group__0();
            _fsp--;


            }

             after(grammarAccess.getUserDefinedCommandAccess().getGroup()); 

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
    // $ANTLR end ruleUserDefinedCommand


    // $ANTLR start entryRuleMain
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:257:1: entryRuleMain : ruleMain EOF ;
    public final void entryRuleMain() throws RecognitionException {
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:258:1: ( ruleMain EOF )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:259:1: ruleMain EOF
            {
             before(grammarAccess.getMainRule()); 
            pushFollow(FOLLOW_ruleMain_in_entryRuleMain481);
            ruleMain();
            _fsp--;

             after(grammarAccess.getMainRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMain488); 

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
    // $ANTLR end entryRuleMain


    // $ANTLR start ruleMain
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:266:1: ruleMain : ( ( rule__Main__Group__0 ) ) ;
    public final void ruleMain() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:270:2: ( ( ( rule__Main__Group__0 ) ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:271:1: ( ( rule__Main__Group__0 ) )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:271:1: ( ( rule__Main__Group__0 ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:272:1: ( rule__Main__Group__0 )
            {
             before(grammarAccess.getMainAccess().getGroup()); 
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:273:1: ( rule__Main__Group__0 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:273:2: rule__Main__Group__0
            {
            pushFollow(FOLLOW_rule__Main__Group__0_in_ruleMain514);
            rule__Main__Group__0();
            _fsp--;


            }

             after(grammarAccess.getMainAccess().getGroup()); 

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
    // $ANTLR end ruleMain


    // $ANTLR start entryRuleStatement
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:285:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:286:1: ( ruleStatement EOF )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:287:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement541);
            ruleStatement();
            _fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement548); 

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
    // $ANTLR end entryRuleStatement


    // $ANTLR start ruleStatement
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:294:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:298:2: ( ( ( rule__Statement__Alternatives ) ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:299:1: ( ( rule__Statement__Alternatives ) )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:299:1: ( ( rule__Statement__Alternatives ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:300:1: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:301:1: ( rule__Statement__Alternatives )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:301:2: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_rule__Statement__Alternatives_in_ruleStatement574);
            rule__Statement__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

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
    // $ANTLR end ruleStatement


    // $ANTLR start entryRuleUserDefinedCommandStatement
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:313:1: entryRuleUserDefinedCommandStatement : ruleUserDefinedCommandStatement EOF ;
    public final void entryRuleUserDefinedCommandStatement() throws RecognitionException {
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:314:1: ( ruleUserDefinedCommandStatement EOF )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:315:1: ruleUserDefinedCommandStatement EOF
            {
             before(grammarAccess.getUserDefinedCommandStatementRule()); 
            pushFollow(FOLLOW_ruleUserDefinedCommandStatement_in_entryRuleUserDefinedCommandStatement601);
            ruleUserDefinedCommandStatement();
            _fsp--;

             after(grammarAccess.getUserDefinedCommandStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserDefinedCommandStatement608); 

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
    // $ANTLR end entryRuleUserDefinedCommandStatement


    // $ANTLR start ruleUserDefinedCommandStatement
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:322:1: ruleUserDefinedCommandStatement : ( ( rule__UserDefinedCommandStatement__Group__0 ) ) ;
    public final void ruleUserDefinedCommandStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:326:2: ( ( ( rule__UserDefinedCommandStatement__Group__0 ) ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:327:1: ( ( rule__UserDefinedCommandStatement__Group__0 ) )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:327:1: ( ( rule__UserDefinedCommandStatement__Group__0 ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:328:1: ( rule__UserDefinedCommandStatement__Group__0 )
            {
             before(grammarAccess.getUserDefinedCommandStatementAccess().getGroup()); 
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:329:1: ( rule__UserDefinedCommandStatement__Group__0 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:329:2: rule__UserDefinedCommandStatement__Group__0
            {
            pushFollow(FOLLOW_rule__UserDefinedCommandStatement__Group__0_in_ruleUserDefinedCommandStatement634);
            rule__UserDefinedCommandStatement__Group__0();
            _fsp--;


            }

             after(grammarAccess.getUserDefinedCommandStatementAccess().getGroup()); 

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
    // $ANTLR end ruleUserDefinedCommandStatement


    // $ANTLR start entryRuleIfStatement
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:341:1: entryRuleIfStatement : ruleIfStatement EOF ;
    public final void entryRuleIfStatement() throws RecognitionException {
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:342:1: ( ruleIfStatement EOF )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:343:1: ruleIfStatement EOF
            {
             before(grammarAccess.getIfStatementRule()); 
            pushFollow(FOLLOW_ruleIfStatement_in_entryRuleIfStatement661);
            ruleIfStatement();
            _fsp--;

             after(grammarAccess.getIfStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfStatement668); 

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
    // $ANTLR end entryRuleIfStatement


    // $ANTLR start ruleIfStatement
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:350:1: ruleIfStatement : ( ( rule__IfStatement__Group__0 ) ) ;
    public final void ruleIfStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:354:2: ( ( ( rule__IfStatement__Group__0 ) ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:355:1: ( ( rule__IfStatement__Group__0 ) )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:355:1: ( ( rule__IfStatement__Group__0 ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:356:1: ( rule__IfStatement__Group__0 )
            {
             before(grammarAccess.getIfStatementAccess().getGroup()); 
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:357:1: ( rule__IfStatement__Group__0 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:357:2: rule__IfStatement__Group__0
            {
            pushFollow(FOLLOW_rule__IfStatement__Group__0_in_ruleIfStatement694);
            rule__IfStatement__Group__0();
            _fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getGroup()); 

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
    // $ANTLR end ruleIfStatement


    // $ANTLR start entryRuleIterateStatement
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:369:1: entryRuleIterateStatement : ruleIterateStatement EOF ;
    public final void entryRuleIterateStatement() throws RecognitionException {
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:370:1: ( ruleIterateStatement EOF )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:371:1: ruleIterateStatement EOF
            {
             before(grammarAccess.getIterateStatementRule()); 
            pushFollow(FOLLOW_ruleIterateStatement_in_entryRuleIterateStatement721);
            ruleIterateStatement();
            _fsp--;

             after(grammarAccess.getIterateStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIterateStatement728); 

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
    // $ANTLR end entryRuleIterateStatement


    // $ANTLR start ruleIterateStatement
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:378:1: ruleIterateStatement : ( ( rule__IterateStatement__Group__0 ) ) ;
    public final void ruleIterateStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:382:2: ( ( ( rule__IterateStatement__Group__0 ) ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:383:1: ( ( rule__IterateStatement__Group__0 ) )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:383:1: ( ( rule__IterateStatement__Group__0 ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:384:1: ( rule__IterateStatement__Group__0 )
            {
             before(grammarAccess.getIterateStatementAccess().getGroup()); 
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:385:1: ( rule__IterateStatement__Group__0 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:385:2: rule__IterateStatement__Group__0
            {
            pushFollow(FOLLOW_rule__IterateStatement__Group__0_in_ruleIterateStatement754);
            rule__IterateStatement__Group__0();
            _fsp--;


            }

             after(grammarAccess.getIterateStatementAccess().getGroup()); 

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
    // $ANTLR end ruleIterateStatement


    // $ANTLR start entryRuleWhileStatement
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:397:1: entryRuleWhileStatement : ruleWhileStatement EOF ;
    public final void entryRuleWhileStatement() throws RecognitionException {
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:398:1: ( ruleWhileStatement EOF )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:399:1: ruleWhileStatement EOF
            {
             before(grammarAccess.getWhileStatementRule()); 
            pushFollow(FOLLOW_ruleWhileStatement_in_entryRuleWhileStatement781);
            ruleWhileStatement();
            _fsp--;

             after(grammarAccess.getWhileStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhileStatement788); 

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
    // $ANTLR end entryRuleWhileStatement


    // $ANTLR start ruleWhileStatement
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:406:1: ruleWhileStatement : ( ( rule__WhileStatement__Group__0 ) ) ;
    public final void ruleWhileStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:410:2: ( ( ( rule__WhileStatement__Group__0 ) ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:411:1: ( ( rule__WhileStatement__Group__0 ) )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:411:1: ( ( rule__WhileStatement__Group__0 ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:412:1: ( rule__WhileStatement__Group__0 )
            {
             before(grammarAccess.getWhileStatementAccess().getGroup()); 
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:413:1: ( rule__WhileStatement__Group__0 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:413:2: rule__WhileStatement__Group__0
            {
            pushFollow(FOLLOW_rule__WhileStatement__Group__0_in_ruleWhileStatement814);
            rule__WhileStatement__Group__0();
            _fsp--;


            }

             after(grammarAccess.getWhileStatementAccess().getGroup()); 

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
    // $ANTLR end ruleWhileStatement


    // $ANTLR start entryRuleDocumentationComment
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:425:1: entryRuleDocumentationComment : ruleDocumentationComment EOF ;
    public final void entryRuleDocumentationComment() throws RecognitionException {
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:426:1: ( ruleDocumentationComment EOF )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:427:1: ruleDocumentationComment EOF
            {
             before(grammarAccess.getDocumentationCommentRule()); 
            pushFollow(FOLLOW_ruleDocumentationComment_in_entryRuleDocumentationComment841);
            ruleDocumentationComment();
            _fsp--;

             after(grammarAccess.getDocumentationCommentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDocumentationComment848); 

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
    // $ANTLR end entryRuleDocumentationComment


    // $ANTLR start ruleDocumentationComment
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:434:1: ruleDocumentationComment : ( ( rule__DocumentationComment__Group__0 ) ) ;
    public final void ruleDocumentationComment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:438:2: ( ( ( rule__DocumentationComment__Group__0 ) ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:439:1: ( ( rule__DocumentationComment__Group__0 ) )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:439:1: ( ( rule__DocumentationComment__Group__0 ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:440:1: ( rule__DocumentationComment__Group__0 )
            {
             before(grammarAccess.getDocumentationCommentAccess().getGroup()); 
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:441:1: ( rule__DocumentationComment__Group__0 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:441:2: rule__DocumentationComment__Group__0
            {
            pushFollow(FOLLOW_rule__DocumentationComment__Group__0_in_ruleDocumentationComment874);
            rule__DocumentationComment__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDocumentationCommentAccess().getGroup()); 

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
    // $ANTLR end ruleDocumentationComment


    // $ANTLR start entryRuleCommandStatement
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:453:1: entryRuleCommandStatement : ruleCommandStatement EOF ;
    public final void entryRuleCommandStatement() throws RecognitionException {
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:454:1: ( ruleCommandStatement EOF )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:455:1: ruleCommandStatement EOF
            {
             before(grammarAccess.getCommandStatementRule()); 
            pushFollow(FOLLOW_ruleCommandStatement_in_entryRuleCommandStatement901);
            ruleCommandStatement();
            _fsp--;

             after(grammarAccess.getCommandStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommandStatement908); 

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
    // $ANTLR end entryRuleCommandStatement


    // $ANTLR start ruleCommandStatement
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:462:1: ruleCommandStatement : ( ( rule__CommandStatement__Group__0 ) ) ;
    public final void ruleCommandStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:466:2: ( ( ( rule__CommandStatement__Group__0 ) ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:467:1: ( ( rule__CommandStatement__Group__0 ) )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:467:1: ( ( rule__CommandStatement__Group__0 ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:468:1: ( rule__CommandStatement__Group__0 )
            {
             before(grammarAccess.getCommandStatementAccess().getGroup()); 
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:469:1: ( rule__CommandStatement__Group__0 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:469:2: rule__CommandStatement__Group__0
            {
            pushFollow(FOLLOW_rule__CommandStatement__Group__0_in_ruleCommandStatement934);
            rule__CommandStatement__Group__0();
            _fsp--;


            }

             after(grammarAccess.getCommandStatementAccess().getGroup()); 

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
    // $ANTLR end ruleCommandStatement


    // $ANTLR start entryRuleConditionExpr
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:481:1: entryRuleConditionExpr : ruleConditionExpr EOF ;
    public final void entryRuleConditionExpr() throws RecognitionException {
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:482:1: ( ruleConditionExpr EOF )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:483:1: ruleConditionExpr EOF
            {
             before(grammarAccess.getConditionExprRule()); 
            pushFollow(FOLLOW_ruleConditionExpr_in_entryRuleConditionExpr961);
            ruleConditionExpr();
            _fsp--;

             after(grammarAccess.getConditionExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionExpr968); 

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
    // $ANTLR end entryRuleConditionExpr


    // $ANTLR start ruleConditionExpr
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:490:1: ruleConditionExpr : ( ( rule__ConditionExpr__Group__0 ) ) ;
    public final void ruleConditionExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:494:2: ( ( ( rule__ConditionExpr__Group__0 ) ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:495:1: ( ( rule__ConditionExpr__Group__0 ) )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:495:1: ( ( rule__ConditionExpr__Group__0 ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:496:1: ( rule__ConditionExpr__Group__0 )
            {
             before(grammarAccess.getConditionExprAccess().getGroup()); 
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:497:1: ( rule__ConditionExpr__Group__0 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:497:2: rule__ConditionExpr__Group__0
            {
            pushFollow(FOLLOW_rule__ConditionExpr__Group__0_in_ruleConditionExpr994);
            rule__ConditionExpr__Group__0();
            _fsp--;


            }

             after(grammarAccess.getConditionExprAccess().getGroup()); 

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
    // $ANTLR end ruleConditionExpr


    // $ANTLR start ruleHeadingKind
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:510:1: ruleHeadingKind : ( ( rule__HeadingKind__Alternatives ) ) ;
    public final void ruleHeadingKind() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:514:1: ( ( ( rule__HeadingKind__Alternatives ) ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:515:1: ( ( rule__HeadingKind__Alternatives ) )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:515:1: ( ( rule__HeadingKind__Alternatives ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:516:1: ( rule__HeadingKind__Alternatives )
            {
             before(grammarAccess.getHeadingKindAccess().getAlternatives()); 
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:517:1: ( rule__HeadingKind__Alternatives )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:517:2: rule__HeadingKind__Alternatives
            {
            pushFollow(FOLLOW_rule__HeadingKind__Alternatives_in_ruleHeadingKind1031);
            rule__HeadingKind__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getHeadingKindAccess().getAlternatives()); 

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
    // $ANTLR end ruleHeadingKind


    // $ANTLR start ruleCommandKind
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:529:1: ruleCommandKind : ( ( rule__CommandKind__Alternatives ) ) ;
    public final void ruleCommandKind() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:533:1: ( ( ( rule__CommandKind__Alternatives ) ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:534:1: ( ( rule__CommandKind__Alternatives ) )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:534:1: ( ( rule__CommandKind__Alternatives ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:535:1: ( rule__CommandKind__Alternatives )
            {
             before(grammarAccess.getCommandKindAccess().getAlternatives()); 
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:536:1: ( rule__CommandKind__Alternatives )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:536:2: rule__CommandKind__Alternatives
            {
            pushFollow(FOLLOW_rule__CommandKind__Alternatives_in_ruleCommandKind1067);
            rule__CommandKind__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getCommandKindAccess().getAlternatives()); 

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
    // $ANTLR end ruleCommandKind


    // $ANTLR start ruleConditionKind
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:548:1: ruleConditionKind : ( ( rule__ConditionKind__Alternatives ) ) ;
    public final void ruleConditionKind() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:552:1: ( ( ( rule__ConditionKind__Alternatives ) ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:553:1: ( ( rule__ConditionKind__Alternatives ) )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:553:1: ( ( rule__ConditionKind__Alternatives ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:554:1: ( rule__ConditionKind__Alternatives )
            {
             before(grammarAccess.getConditionKindAccess().getAlternatives()); 
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:555:1: ( rule__ConditionKind__Alternatives )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:555:2: rule__ConditionKind__Alternatives
            {
            pushFollow(FOLLOW_rule__ConditionKind__Alternatives_in_ruleConditionKind1103);
            rule__ConditionKind__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getConditionKindAccess().getAlternatives()); 

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
    // $ANTLR end ruleConditionKind


    // $ANTLR start rule__InitCommand__Alternatives
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:566:1: rule__InitCommand__Alternatives : ( ( ruleInitPositionCommand ) | ( ruleInitHeadingCommand ) | ( ruleInitBoardSizeCommand ) );
    public final void rule__InitCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:570:1: ( ( ruleInitPositionCommand ) | ( ruleInitHeadingCommand ) | ( ruleInitBoardSizeCommand ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt1=1;
                }
                break;
            case 30:
                {
                alt1=2;
                }
                break;
            case 31:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("566:1: rule__InitCommand__Alternatives : ( ( ruleInitPositionCommand ) | ( ruleInitHeadingCommand ) | ( ruleInitBoardSizeCommand ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:571:1: ( ruleInitPositionCommand )
                    {
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:571:1: ( ruleInitPositionCommand )
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:572:1: ruleInitPositionCommand
                    {
                     before(grammarAccess.getInitCommandAccess().getInitPositionCommandParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleInitPositionCommand_in_rule__InitCommand__Alternatives1138);
                    ruleInitPositionCommand();
                    _fsp--;

                     after(grammarAccess.getInitCommandAccess().getInitPositionCommandParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:577:6: ( ruleInitHeadingCommand )
                    {
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:577:6: ( ruleInitHeadingCommand )
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:578:1: ruleInitHeadingCommand
                    {
                     before(grammarAccess.getInitCommandAccess().getInitHeadingCommandParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleInitHeadingCommand_in_rule__InitCommand__Alternatives1155);
                    ruleInitHeadingCommand();
                    _fsp--;

                     after(grammarAccess.getInitCommandAccess().getInitHeadingCommandParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:583:6: ( ruleInitBoardSizeCommand )
                    {
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:583:6: ( ruleInitBoardSizeCommand )
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:584:1: ruleInitBoardSizeCommand
                    {
                     before(grammarAccess.getInitCommandAccess().getInitBoardSizeCommandParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleInitBoardSizeCommand_in_rule__InitCommand__Alternatives1172);
                    ruleInitBoardSizeCommand();
                    _fsp--;

                     after(grammarAccess.getInitCommandAccess().getInitBoardSizeCommandParserRuleCall_2()); 

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
    // $ANTLR end rule__InitCommand__Alternatives


    // $ANTLR start rule__Statement__Alternatives
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:594:1: rule__Statement__Alternatives : ( ( ruleIfStatement ) | ( ruleIterateStatement ) | ( ruleWhileStatement ) | ( ruleCommandStatement ) | ( ruleUserDefinedCommandStatement ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:598:1: ( ( ruleIfStatement ) | ( ruleIterateStatement ) | ( ruleWhileStatement ) | ( ruleCommandStatement ) | ( ruleUserDefinedCommandStatement ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt2=1;
                }
                break;
            case 44:
                {
                alt2=2;
                }
                break;
            case 46:
                {
                alt2=3;
                }
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                {
                alt2=4;
                }
                break;
            case RULE_ID:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("594:1: rule__Statement__Alternatives : ( ( ruleIfStatement ) | ( ruleIterateStatement ) | ( ruleWhileStatement ) | ( ruleCommandStatement ) | ( ruleUserDefinedCommandStatement ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:599:1: ( ruleIfStatement )
                    {
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:599:1: ( ruleIfStatement )
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:600:1: ruleIfStatement
                    {
                     before(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleIfStatement_in_rule__Statement__Alternatives1204);
                    ruleIfStatement();
                    _fsp--;

                     after(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:605:6: ( ruleIterateStatement )
                    {
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:605:6: ( ruleIterateStatement )
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:606:1: ruleIterateStatement
                    {
                     before(grammarAccess.getStatementAccess().getIterateStatementParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIterateStatement_in_rule__Statement__Alternatives1221);
                    ruleIterateStatement();
                    _fsp--;

                     after(grammarAccess.getStatementAccess().getIterateStatementParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:611:6: ( ruleWhileStatement )
                    {
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:611:6: ( ruleWhileStatement )
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:612:1: ruleWhileStatement
                    {
                     before(grammarAccess.getStatementAccess().getWhileStatementParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleWhileStatement_in_rule__Statement__Alternatives1238);
                    ruleWhileStatement();
                    _fsp--;

                     after(grammarAccess.getStatementAccess().getWhileStatementParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:617:6: ( ruleCommandStatement )
                    {
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:617:6: ( ruleCommandStatement )
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:618:1: ruleCommandStatement
                    {
                     before(grammarAccess.getStatementAccess().getCommandStatementParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleCommandStatement_in_rule__Statement__Alternatives1255);
                    ruleCommandStatement();
                    _fsp--;

                     after(grammarAccess.getStatementAccess().getCommandStatementParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:623:6: ( ruleUserDefinedCommandStatement )
                    {
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:623:6: ( ruleUserDefinedCommandStatement )
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:624:1: ruleUserDefinedCommandStatement
                    {
                     before(grammarAccess.getStatementAccess().getUserDefinedCommandStatementParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleUserDefinedCommandStatement_in_rule__Statement__Alternatives1272);
                    ruleUserDefinedCommandStatement();
                    _fsp--;

                     after(grammarAccess.getStatementAccess().getUserDefinedCommandStatementParserRuleCall_4()); 

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
    // $ANTLR end rule__Statement__Alternatives


    // $ANTLR start rule__HeadingKind__Alternatives
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:634:1: rule__HeadingKind__Alternatives : ( ( ( 'NORTH' ) ) | ( ( 'SOUTH' ) ) | ( ( 'WEST' ) ) | ( ( 'EAST' ) ) );
    public final void rule__HeadingKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:638:1: ( ( ( 'NORTH' ) ) | ( ( 'SOUTH' ) ) | ( ( 'WEST' ) ) | ( ( 'EAST' ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("634:1: rule__HeadingKind__Alternatives : ( ( ( 'NORTH' ) ) | ( ( 'SOUTH' ) ) | ( ( 'WEST' ) ) | ( ( 'EAST' ) ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:639:1: ( ( 'NORTH' ) )
                    {
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:639:1: ( ( 'NORTH' ) )
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:640:1: ( 'NORTH' )
                    {
                     before(grammarAccess.getHeadingKindAccess().getNORTHEnumLiteralDeclaration_0()); 
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:641:1: ( 'NORTH' )
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:641:3: 'NORTH'
                    {
                    match(input,11,FOLLOW_11_in_rule__HeadingKind__Alternatives1305); 

                    }

                     after(grammarAccess.getHeadingKindAccess().getNORTHEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:646:6: ( ( 'SOUTH' ) )
                    {
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:646:6: ( ( 'SOUTH' ) )
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:647:1: ( 'SOUTH' )
                    {
                     before(grammarAccess.getHeadingKindAccess().getSOUTHEnumLiteralDeclaration_1()); 
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:648:1: ( 'SOUTH' )
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:648:3: 'SOUTH'
                    {
                    match(input,12,FOLLOW_12_in_rule__HeadingKind__Alternatives1326); 

                    }

                     after(grammarAccess.getHeadingKindAccess().getSOUTHEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:653:6: ( ( 'WEST' ) )
                    {
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:653:6: ( ( 'WEST' ) )
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:654:1: ( 'WEST' )
                    {
                     before(grammarAccess.getHeadingKindAccess().getWESTEnumLiteralDeclaration_2()); 
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:655:1: ( 'WEST' )
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:655:3: 'WEST'
                    {
                    match(input,13,FOLLOW_13_in_rule__HeadingKind__Alternatives1347); 

                    }

                     after(grammarAccess.getHeadingKindAccess().getWESTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:660:6: ( ( 'EAST' ) )
                    {
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:660:6: ( ( 'EAST' ) )
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:661:1: ( 'EAST' )
                    {
                     before(grammarAccess.getHeadingKindAccess().getEASTEnumLiteralDeclaration_3()); 
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:662:1: ( 'EAST' )
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:662:3: 'EAST'
                    {
                    match(input,14,FOLLOW_14_in_rule__HeadingKind__Alternatives1368); 

                    }

                     after(grammarAccess.getHeadingKindAccess().getEASTEnumLiteralDeclaration_3()); 

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
    // $ANTLR end rule__HeadingKind__Alternatives


    // $ANTLR start rule__CommandKind__Alternatives
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:672:1: rule__CommandKind__Alternatives : ( ( ( 'move' ) ) | ( ( 'turn' ) ) | ( ( 'turnOn' ) ) | ( ( 'turnOff' ) ) | ( ( 'put' ) ) | ( ( 'get' ) ) );
    public final void rule__CommandKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:676:1: ( ( ( 'move' ) ) | ( ( 'turn' ) ) | ( ( 'turnOn' ) ) | ( ( 'turnOff' ) ) | ( ( 'put' ) ) | ( ( 'get' ) ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt4=1;
                }
                break;
            case 16:
                {
                alt4=2;
                }
                break;
            case 17:
                {
                alt4=3;
                }
                break;
            case 18:
                {
                alt4=4;
                }
                break;
            case 19:
                {
                alt4=5;
                }
                break;
            case 20:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("672:1: rule__CommandKind__Alternatives : ( ( ( 'move' ) ) | ( ( 'turn' ) ) | ( ( 'turnOn' ) ) | ( ( 'turnOff' ) ) | ( ( 'put' ) ) | ( ( 'get' ) ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:677:1: ( ( 'move' ) )
                    {
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:677:1: ( ( 'move' ) )
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:678:1: ( 'move' )
                    {
                     before(grammarAccess.getCommandKindAccess().getMOVEEnumLiteralDeclaration_0()); 
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:679:1: ( 'move' )
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:679:3: 'move'
                    {
                    match(input,15,FOLLOW_15_in_rule__CommandKind__Alternatives1404); 

                    }

                     after(grammarAccess.getCommandKindAccess().getMOVEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:684:6: ( ( 'turn' ) )
                    {
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:684:6: ( ( 'turn' ) )
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:685:1: ( 'turn' )
                    {
                     before(grammarAccess.getCommandKindAccess().getTURNLEFTEnumLiteralDeclaration_1()); 
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:686:1: ( 'turn' )
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:686:3: 'turn'
                    {
                    match(input,16,FOLLOW_16_in_rule__CommandKind__Alternatives1425); 

                    }

                     after(grammarAccess.getCommandKindAccess().getTURNLEFTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:691:6: ( ( 'turnOn' ) )
                    {
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:691:6: ( ( 'turnOn' ) )
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:692:1: ( 'turnOn' )
                    {
                     before(grammarAccess.getCommandKindAccess().getTURNONEnumLiteralDeclaration_2()); 
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:693:1: ( 'turnOn' )
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:693:3: 'turnOn'
                    {
                    match(input,17,FOLLOW_17_in_rule__CommandKind__Alternatives1446); 

                    }

                     after(grammarAccess.getCommandKindAccess().getTURNONEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:698:6: ( ( 'turnOff' ) )
                    {
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:698:6: ( ( 'turnOff' ) )
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:699:1: ( 'turnOff' )
                    {
                     before(grammarAccess.getCommandKindAccess().getTURNOFFEnumLiteralDeclaration_3()); 
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:700:1: ( 'turnOff' )
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:700:3: 'turnOff'
                    {
                    match(input,18,FOLLOW_18_in_rule__CommandKind__Alternatives1467); 

                    }

                     after(grammarAccess.getCommandKindAccess().getTURNOFFEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:705:6: ( ( 'put' ) )
                    {
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:705:6: ( ( 'put' ) )
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:706:1: ( 'put' )
                    {
                     before(grammarAccess.getCommandKindAccess().getPUTEnumLiteralDeclaration_4()); 
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:707:1: ( 'put' )
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:707:3: 'put'
                    {
                    match(input,19,FOLLOW_19_in_rule__CommandKind__Alternatives1488); 

                    }

                     after(grammarAccess.getCommandKindAccess().getPUTEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:712:6: ( ( 'get' ) )
                    {
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:712:6: ( ( 'get' ) )
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:713:1: ( 'get' )
                    {
                     before(grammarAccess.getCommandKindAccess().getGETEnumLiteralDeclaration_5()); 
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:714:1: ( 'get' )
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:714:3: 'get'
                    {
                    match(input,20,FOLLOW_20_in_rule__CommandKind__Alternatives1509); 

                    }

                     after(grammarAccess.getCommandKindAccess().getGETEnumLiteralDeclaration_5()); 

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
    // $ANTLR end rule__CommandKind__Alternatives


    // $ANTLR start rule__ConditionKind__Alternatives
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:724:1: rule__ConditionKind__Alternatives : ( ( ( 'WALL_AHEAD' ) ) | ( ( 'MARKED_PLACE' ) ) );
    public final void rule__ConditionKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:728:1: ( ( ( 'WALL_AHEAD' ) ) | ( ( 'MARKED_PLACE' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            else if ( (LA5_0==22) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("724:1: rule__ConditionKind__Alternatives : ( ( ( 'WALL_AHEAD' ) ) | ( ( 'MARKED_PLACE' ) ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:729:1: ( ( 'WALL_AHEAD' ) )
                    {
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:729:1: ( ( 'WALL_AHEAD' ) )
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:730:1: ( 'WALL_AHEAD' )
                    {
                     before(grammarAccess.getConditionKindAccess().getWALL_AHEADEnumLiteralDeclaration_0()); 
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:731:1: ( 'WALL_AHEAD' )
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:731:3: 'WALL_AHEAD'
                    {
                    match(input,21,FOLLOW_21_in_rule__ConditionKind__Alternatives1545); 

                    }

                     after(grammarAccess.getConditionKindAccess().getWALL_AHEADEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:736:6: ( ( 'MARKED_PLACE' ) )
                    {
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:736:6: ( ( 'MARKED_PLACE' ) )
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:737:1: ( 'MARKED_PLACE' )
                    {
                     before(grammarAccess.getConditionKindAccess().getMARKED_PLACEEnumLiteralDeclaration_1()); 
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:738:1: ( 'MARKED_PLACE' )
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:738:3: 'MARKED_PLACE'
                    {
                    match(input,22,FOLLOW_22_in_rule__ConditionKind__Alternatives1566); 

                    }

                     after(grammarAccess.getConditionKindAccess().getMARKED_PLACEEnumLiteralDeclaration_1()); 

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
    // $ANTLR end rule__ConditionKind__Alternatives


    // $ANTLR start rule__Program__Group__0
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:750:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:754:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:755:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__01599);
            rule__Program__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group__1_in_rule__Program__Group__01602);
            rule__Program__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Program__Group__0


    // $ANTLR start rule__Program__Group__0__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:762:1: rule__Program__Group__0__Impl : ( 'BEGIN-PROGRAM' ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:766:1: ( ( 'BEGIN-PROGRAM' ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:767:1: ( 'BEGIN-PROGRAM' )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:767:1: ( 'BEGIN-PROGRAM' )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:768:1: 'BEGIN-PROGRAM'
            {
             before(grammarAccess.getProgramAccess().getBEGINPROGRAMKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Program__Group__0__Impl1630); 
             after(grammarAccess.getProgramAccess().getBEGINPROGRAMKeyword_0()); 

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
    // $ANTLR end rule__Program__Group__0__Impl


    // $ANTLR start rule__Program__Group__1
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:781:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:785:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:786:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__11661);
            rule__Program__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group__2_in_rule__Program__Group__11664);
            rule__Program__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Program__Group__1


    // $ANTLR start rule__Program__Group__1__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:793:1: rule__Program__Group__1__Impl : ( ( rule__Program__InitSectionAssignment_1 )? ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:797:1: ( ( ( rule__Program__InitSectionAssignment_1 )? ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:798:1: ( ( rule__Program__InitSectionAssignment_1 )? )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:798:1: ( ( rule__Program__InitSectionAssignment_1 )? )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:799:1: ( rule__Program__InitSectionAssignment_1 )?
            {
             before(grammarAccess.getProgramAccess().getInitSectionAssignment_1()); 
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:800:1: ( rule__Program__InitSectionAssignment_1 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:800:2: rule__Program__InitSectionAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Program__InitSectionAssignment_1_in_rule__Program__Group__1__Impl1691);
                    rule__Program__InitSectionAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProgramAccess().getInitSectionAssignment_1()); 

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
    // $ANTLR end rule__Program__Group__1__Impl


    // $ANTLR start rule__Program__Group__2
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:810:1: rule__Program__Group__2 : rule__Program__Group__2__Impl rule__Program__Group__3 ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:814:1: ( rule__Program__Group__2__Impl rule__Program__Group__3 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:815:2: rule__Program__Group__2__Impl rule__Program__Group__3
            {
            pushFollow(FOLLOW_rule__Program__Group__2__Impl_in_rule__Program__Group__21722);
            rule__Program__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group__3_in_rule__Program__Group__21725);
            rule__Program__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Program__Group__2


    // $ANTLR start rule__Program__Group__2__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:822:1: rule__Program__Group__2__Impl : ( ( rule__Program__UserDefinedCommandsAssignment_2 )* ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:826:1: ( ( ( rule__Program__UserDefinedCommandsAssignment_2 )* ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:827:1: ( ( rule__Program__UserDefinedCommandsAssignment_2 )* )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:827:1: ( ( rule__Program__UserDefinedCommandsAssignment_2 )* )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:828:1: ( rule__Program__UserDefinedCommandsAssignment_2 )*
            {
             before(grammarAccess.getProgramAccess().getUserDefinedCommandsAssignment_2()); 
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:829:1: ( rule__Program__UserDefinedCommandsAssignment_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==32||LA7_0==47) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:829:2: rule__Program__UserDefinedCommandsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Program__UserDefinedCommandsAssignment_2_in_rule__Program__Group__2__Impl1752);
            	    rule__Program__UserDefinedCommandsAssignment_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getUserDefinedCommandsAssignment_2()); 

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
    // $ANTLR end rule__Program__Group__2__Impl


    // $ANTLR start rule__Program__Group__3
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:839:1: rule__Program__Group__3 : rule__Program__Group__3__Impl rule__Program__Group__4 ;
    public final void rule__Program__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:843:1: ( rule__Program__Group__3__Impl rule__Program__Group__4 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:844:2: rule__Program__Group__3__Impl rule__Program__Group__4
            {
            pushFollow(FOLLOW_rule__Program__Group__3__Impl_in_rule__Program__Group__31783);
            rule__Program__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group__4_in_rule__Program__Group__31786);
            rule__Program__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Program__Group__3


    // $ANTLR start rule__Program__Group__3__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:851:1: rule__Program__Group__3__Impl : ( ( rule__Program__MainAssignment_3 ) ) ;
    public final void rule__Program__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:855:1: ( ( ( rule__Program__MainAssignment_3 ) ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:856:1: ( ( rule__Program__MainAssignment_3 ) )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:856:1: ( ( rule__Program__MainAssignment_3 ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:857:1: ( rule__Program__MainAssignment_3 )
            {
             before(grammarAccess.getProgramAccess().getMainAssignment_3()); 
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:858:1: ( rule__Program__MainAssignment_3 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:858:2: rule__Program__MainAssignment_3
            {
            pushFollow(FOLLOW_rule__Program__MainAssignment_3_in_rule__Program__Group__3__Impl1813);
            rule__Program__MainAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getProgramAccess().getMainAssignment_3()); 

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
    // $ANTLR end rule__Program__Group__3__Impl


    // $ANTLR start rule__Program__Group__4
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:868:1: rule__Program__Group__4 : rule__Program__Group__4__Impl ;
    public final void rule__Program__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:872:1: ( rule__Program__Group__4__Impl )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:873:2: rule__Program__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group__4__Impl_in_rule__Program__Group__41843);
            rule__Program__Group__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Program__Group__4


    // $ANTLR start rule__Program__Group__4__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:879:1: rule__Program__Group__4__Impl : ( 'END-PROGRAM' ) ;
    public final void rule__Program__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:883:1: ( ( 'END-PROGRAM' ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:884:1: ( 'END-PROGRAM' )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:884:1: ( 'END-PROGRAM' )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:885:1: 'END-PROGRAM'
            {
             before(grammarAccess.getProgramAccess().getENDPROGRAMKeyword_4()); 
            match(input,24,FOLLOW_24_in_rule__Program__Group__4__Impl1871); 
             after(grammarAccess.getProgramAccess().getENDPROGRAMKeyword_4()); 

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
    // $ANTLR end rule__Program__Group__4__Impl


    // $ANTLR start rule__InitSection__Group__0
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:908:1: rule__InitSection__Group__0 : rule__InitSection__Group__0__Impl rule__InitSection__Group__1 ;
    public final void rule__InitSection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:912:1: ( rule__InitSection__Group__0__Impl rule__InitSection__Group__1 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:913:2: rule__InitSection__Group__0__Impl rule__InitSection__Group__1
            {
            pushFollow(FOLLOW_rule__InitSection__Group__0__Impl_in_rule__InitSection__Group__01912);
            rule__InitSection__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__InitSection__Group__1_in_rule__InitSection__Group__01915);
            rule__InitSection__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InitSection__Group__0


    // $ANTLR start rule__InitSection__Group__0__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:920:1: rule__InitSection__Group__0__Impl : ( 'BEGIN-INIT' ) ;
    public final void rule__InitSection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:924:1: ( ( 'BEGIN-INIT' ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:925:1: ( 'BEGIN-INIT' )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:925:1: ( 'BEGIN-INIT' )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:926:1: 'BEGIN-INIT'
            {
             before(grammarAccess.getInitSectionAccess().getBEGININITKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__InitSection__Group__0__Impl1943); 
             after(grammarAccess.getInitSectionAccess().getBEGININITKeyword_0()); 

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
    // $ANTLR end rule__InitSection__Group__0__Impl


    // $ANTLR start rule__InitSection__Group__1
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:939:1: rule__InitSection__Group__1 : rule__InitSection__Group__1__Impl rule__InitSection__Group__2 ;
    public final void rule__InitSection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:943:1: ( rule__InitSection__Group__1__Impl rule__InitSection__Group__2 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:944:2: rule__InitSection__Group__1__Impl rule__InitSection__Group__2
            {
            pushFollow(FOLLOW_rule__InitSection__Group__1__Impl_in_rule__InitSection__Group__11974);
            rule__InitSection__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__InitSection__Group__2_in_rule__InitSection__Group__11977);
            rule__InitSection__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InitSection__Group__1


    // $ANTLR start rule__InitSection__Group__1__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:951:1: rule__InitSection__Group__1__Impl : ( ( ( rule__InitSection__InitCommandsAssignment_1 ) ) ( ( rule__InitSection__InitCommandsAssignment_1 )* ) ) ;
    public final void rule__InitSection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:955:1: ( ( ( ( rule__InitSection__InitCommandsAssignment_1 ) ) ( ( rule__InitSection__InitCommandsAssignment_1 )* ) ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:956:1: ( ( ( rule__InitSection__InitCommandsAssignment_1 ) ) ( ( rule__InitSection__InitCommandsAssignment_1 )* ) )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:956:1: ( ( ( rule__InitSection__InitCommandsAssignment_1 ) ) ( ( rule__InitSection__InitCommandsAssignment_1 )* ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:957:1: ( ( rule__InitSection__InitCommandsAssignment_1 ) ) ( ( rule__InitSection__InitCommandsAssignment_1 )* )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:957:1: ( ( rule__InitSection__InitCommandsAssignment_1 ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:958:1: ( rule__InitSection__InitCommandsAssignment_1 )
            {
             before(grammarAccess.getInitSectionAccess().getInitCommandsAssignment_1()); 
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:959:1: ( rule__InitSection__InitCommandsAssignment_1 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:959:2: rule__InitSection__InitCommandsAssignment_1
            {
            pushFollow(FOLLOW_rule__InitSection__InitCommandsAssignment_1_in_rule__InitSection__Group__1__Impl2006);
            rule__InitSection__InitCommandsAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getInitSectionAccess().getInitCommandsAssignment_1()); 

            }

            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:962:1: ( ( rule__InitSection__InitCommandsAssignment_1 )* )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:963:1: ( rule__InitSection__InitCommandsAssignment_1 )*
            {
             before(grammarAccess.getInitSectionAccess().getInitCommandsAssignment_1()); 
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:964:1: ( rule__InitSection__InitCommandsAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==27||(LA8_0>=30 && LA8_0<=31)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:964:2: rule__InitSection__InitCommandsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__InitSection__InitCommandsAssignment_1_in_rule__InitSection__Group__1__Impl2018);
            	    rule__InitSection__InitCommandsAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getInitSectionAccess().getInitCommandsAssignment_1()); 

            }


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
    // $ANTLR end rule__InitSection__Group__1__Impl


    // $ANTLR start rule__InitSection__Group__2
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:975:1: rule__InitSection__Group__2 : rule__InitSection__Group__2__Impl ;
    public final void rule__InitSection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:979:1: ( rule__InitSection__Group__2__Impl )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:980:2: rule__InitSection__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__InitSection__Group__2__Impl_in_rule__InitSection__Group__22051);
            rule__InitSection__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InitSection__Group__2


    // $ANTLR start rule__InitSection__Group__2__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:986:1: rule__InitSection__Group__2__Impl : ( 'END-INIT' ) ;
    public final void rule__InitSection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:990:1: ( ( 'END-INIT' ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:991:1: ( 'END-INIT' )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:991:1: ( 'END-INIT' )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:992:1: 'END-INIT'
            {
             before(grammarAccess.getInitSectionAccess().getENDINITKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__InitSection__Group__2__Impl2079); 
             after(grammarAccess.getInitSectionAccess().getENDINITKeyword_2()); 

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
    // $ANTLR end rule__InitSection__Group__2__Impl


    // $ANTLR start rule__InitPositionCommand__Group__0
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1011:1: rule__InitPositionCommand__Group__0 : rule__InitPositionCommand__Group__0__Impl rule__InitPositionCommand__Group__1 ;
    public final void rule__InitPositionCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1015:1: ( rule__InitPositionCommand__Group__0__Impl rule__InitPositionCommand__Group__1 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1016:2: rule__InitPositionCommand__Group__0__Impl rule__InitPositionCommand__Group__1
            {
            pushFollow(FOLLOW_rule__InitPositionCommand__Group__0__Impl_in_rule__InitPositionCommand__Group__02116);
            rule__InitPositionCommand__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__InitPositionCommand__Group__1_in_rule__InitPositionCommand__Group__02119);
            rule__InitPositionCommand__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InitPositionCommand__Group__0


    // $ANTLR start rule__InitPositionCommand__Group__0__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1023:1: rule__InitPositionCommand__Group__0__Impl : ( 'position' ) ;
    public final void rule__InitPositionCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1027:1: ( ( 'position' ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1028:1: ( 'position' )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1028:1: ( 'position' )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1029:1: 'position'
            {
             before(grammarAccess.getInitPositionCommandAccess().getPositionKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__InitPositionCommand__Group__0__Impl2147); 
             after(grammarAccess.getInitPositionCommandAccess().getPositionKeyword_0()); 

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
    // $ANTLR end rule__InitPositionCommand__Group__0__Impl


    // $ANTLR start rule__InitPositionCommand__Group__1
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1042:1: rule__InitPositionCommand__Group__1 : rule__InitPositionCommand__Group__1__Impl rule__InitPositionCommand__Group__2 ;
    public final void rule__InitPositionCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1046:1: ( rule__InitPositionCommand__Group__1__Impl rule__InitPositionCommand__Group__2 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1047:2: rule__InitPositionCommand__Group__1__Impl rule__InitPositionCommand__Group__2
            {
            pushFollow(FOLLOW_rule__InitPositionCommand__Group__1__Impl_in_rule__InitPositionCommand__Group__12178);
            rule__InitPositionCommand__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__InitPositionCommand__Group__2_in_rule__InitPositionCommand__Group__12181);
            rule__InitPositionCommand__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InitPositionCommand__Group__1


    // $ANTLR start rule__InitPositionCommand__Group__1__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1054:1: rule__InitPositionCommand__Group__1__Impl : ( ( rule__InitPositionCommand__XAssignment_1 ) ) ;
    public final void rule__InitPositionCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1058:1: ( ( ( rule__InitPositionCommand__XAssignment_1 ) ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1059:1: ( ( rule__InitPositionCommand__XAssignment_1 ) )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1059:1: ( ( rule__InitPositionCommand__XAssignment_1 ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1060:1: ( rule__InitPositionCommand__XAssignment_1 )
            {
             before(grammarAccess.getInitPositionCommandAccess().getXAssignment_1()); 
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1061:1: ( rule__InitPositionCommand__XAssignment_1 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1061:2: rule__InitPositionCommand__XAssignment_1
            {
            pushFollow(FOLLOW_rule__InitPositionCommand__XAssignment_1_in_rule__InitPositionCommand__Group__1__Impl2208);
            rule__InitPositionCommand__XAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getInitPositionCommandAccess().getXAssignment_1()); 

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
    // $ANTLR end rule__InitPositionCommand__Group__1__Impl


    // $ANTLR start rule__InitPositionCommand__Group__2
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1071:1: rule__InitPositionCommand__Group__2 : rule__InitPositionCommand__Group__2__Impl rule__InitPositionCommand__Group__3 ;
    public final void rule__InitPositionCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1075:1: ( rule__InitPositionCommand__Group__2__Impl rule__InitPositionCommand__Group__3 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1076:2: rule__InitPositionCommand__Group__2__Impl rule__InitPositionCommand__Group__3
            {
            pushFollow(FOLLOW_rule__InitPositionCommand__Group__2__Impl_in_rule__InitPositionCommand__Group__22238);
            rule__InitPositionCommand__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__InitPositionCommand__Group__3_in_rule__InitPositionCommand__Group__22241);
            rule__InitPositionCommand__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InitPositionCommand__Group__2


    // $ANTLR start rule__InitPositionCommand__Group__2__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1083:1: rule__InitPositionCommand__Group__2__Impl : ( ',' ) ;
    public final void rule__InitPositionCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1087:1: ( ( ',' ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1088:1: ( ',' )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1088:1: ( ',' )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1089:1: ','
            {
             before(grammarAccess.getInitPositionCommandAccess().getCommaKeyword_2()); 
            match(input,28,FOLLOW_28_in_rule__InitPositionCommand__Group__2__Impl2269); 
             after(grammarAccess.getInitPositionCommandAccess().getCommaKeyword_2()); 

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
    // $ANTLR end rule__InitPositionCommand__Group__2__Impl


    // $ANTLR start rule__InitPositionCommand__Group__3
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1102:1: rule__InitPositionCommand__Group__3 : rule__InitPositionCommand__Group__3__Impl rule__InitPositionCommand__Group__4 ;
    public final void rule__InitPositionCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1106:1: ( rule__InitPositionCommand__Group__3__Impl rule__InitPositionCommand__Group__4 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1107:2: rule__InitPositionCommand__Group__3__Impl rule__InitPositionCommand__Group__4
            {
            pushFollow(FOLLOW_rule__InitPositionCommand__Group__3__Impl_in_rule__InitPositionCommand__Group__32300);
            rule__InitPositionCommand__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__InitPositionCommand__Group__4_in_rule__InitPositionCommand__Group__32303);
            rule__InitPositionCommand__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InitPositionCommand__Group__3


    // $ANTLR start rule__InitPositionCommand__Group__3__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1114:1: rule__InitPositionCommand__Group__3__Impl : ( ( rule__InitPositionCommand__YAssignment_3 ) ) ;
    public final void rule__InitPositionCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1118:1: ( ( ( rule__InitPositionCommand__YAssignment_3 ) ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1119:1: ( ( rule__InitPositionCommand__YAssignment_3 ) )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1119:1: ( ( rule__InitPositionCommand__YAssignment_3 ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1120:1: ( rule__InitPositionCommand__YAssignment_3 )
            {
             before(grammarAccess.getInitPositionCommandAccess().getYAssignment_3()); 
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1121:1: ( rule__InitPositionCommand__YAssignment_3 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1121:2: rule__InitPositionCommand__YAssignment_3
            {
            pushFollow(FOLLOW_rule__InitPositionCommand__YAssignment_3_in_rule__InitPositionCommand__Group__3__Impl2330);
            rule__InitPositionCommand__YAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getInitPositionCommandAccess().getYAssignment_3()); 

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
    // $ANTLR end rule__InitPositionCommand__Group__3__Impl


    // $ANTLR start rule__InitPositionCommand__Group__4
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1131:1: rule__InitPositionCommand__Group__4 : rule__InitPositionCommand__Group__4__Impl ;
    public final void rule__InitPositionCommand__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1135:1: ( rule__InitPositionCommand__Group__4__Impl )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1136:2: rule__InitPositionCommand__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__InitPositionCommand__Group__4__Impl_in_rule__InitPositionCommand__Group__42360);
            rule__InitPositionCommand__Group__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InitPositionCommand__Group__4


    // $ANTLR start rule__InitPositionCommand__Group__4__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1142:1: rule__InitPositionCommand__Group__4__Impl : ( ';' ) ;
    public final void rule__InitPositionCommand__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1146:1: ( ( ';' ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1147:1: ( ';' )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1147:1: ( ';' )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1148:1: ';'
            {
             before(grammarAccess.getInitPositionCommandAccess().getSemicolonKeyword_4()); 
            match(input,29,FOLLOW_29_in_rule__InitPositionCommand__Group__4__Impl2388); 
             after(grammarAccess.getInitPositionCommandAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end rule__InitPositionCommand__Group__4__Impl


    // $ANTLR start rule__InitHeadingCommand__Group__0
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1171:1: rule__InitHeadingCommand__Group__0 : rule__InitHeadingCommand__Group__0__Impl rule__InitHeadingCommand__Group__1 ;
    public final void rule__InitHeadingCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1175:1: ( rule__InitHeadingCommand__Group__0__Impl rule__InitHeadingCommand__Group__1 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1176:2: rule__InitHeadingCommand__Group__0__Impl rule__InitHeadingCommand__Group__1
            {
            pushFollow(FOLLOW_rule__InitHeadingCommand__Group__0__Impl_in_rule__InitHeadingCommand__Group__02429);
            rule__InitHeadingCommand__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__InitHeadingCommand__Group__1_in_rule__InitHeadingCommand__Group__02432);
            rule__InitHeadingCommand__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InitHeadingCommand__Group__0


    // $ANTLR start rule__InitHeadingCommand__Group__0__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1183:1: rule__InitHeadingCommand__Group__0__Impl : ( 'heading' ) ;
    public final void rule__InitHeadingCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1187:1: ( ( 'heading' ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1188:1: ( 'heading' )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1188:1: ( 'heading' )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1189:1: 'heading'
            {
             before(grammarAccess.getInitHeadingCommandAccess().getHeadingKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__InitHeadingCommand__Group__0__Impl2460); 
             after(grammarAccess.getInitHeadingCommandAccess().getHeadingKeyword_0()); 

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
    // $ANTLR end rule__InitHeadingCommand__Group__0__Impl


    // $ANTLR start rule__InitHeadingCommand__Group__1
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1202:1: rule__InitHeadingCommand__Group__1 : rule__InitHeadingCommand__Group__1__Impl rule__InitHeadingCommand__Group__2 ;
    public final void rule__InitHeadingCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1206:1: ( rule__InitHeadingCommand__Group__1__Impl rule__InitHeadingCommand__Group__2 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1207:2: rule__InitHeadingCommand__Group__1__Impl rule__InitHeadingCommand__Group__2
            {
            pushFollow(FOLLOW_rule__InitHeadingCommand__Group__1__Impl_in_rule__InitHeadingCommand__Group__12491);
            rule__InitHeadingCommand__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__InitHeadingCommand__Group__2_in_rule__InitHeadingCommand__Group__12494);
            rule__InitHeadingCommand__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InitHeadingCommand__Group__1


    // $ANTLR start rule__InitHeadingCommand__Group__1__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1214:1: rule__InitHeadingCommand__Group__1__Impl : ( ( rule__InitHeadingCommand__HeadingAssignment_1 ) ) ;
    public final void rule__InitHeadingCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1218:1: ( ( ( rule__InitHeadingCommand__HeadingAssignment_1 ) ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1219:1: ( ( rule__InitHeadingCommand__HeadingAssignment_1 ) )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1219:1: ( ( rule__InitHeadingCommand__HeadingAssignment_1 ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1220:1: ( rule__InitHeadingCommand__HeadingAssignment_1 )
            {
             before(grammarAccess.getInitHeadingCommandAccess().getHeadingAssignment_1()); 
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1221:1: ( rule__InitHeadingCommand__HeadingAssignment_1 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1221:2: rule__InitHeadingCommand__HeadingAssignment_1
            {
            pushFollow(FOLLOW_rule__InitHeadingCommand__HeadingAssignment_1_in_rule__InitHeadingCommand__Group__1__Impl2521);
            rule__InitHeadingCommand__HeadingAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getInitHeadingCommandAccess().getHeadingAssignment_1()); 

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
    // $ANTLR end rule__InitHeadingCommand__Group__1__Impl


    // $ANTLR start rule__InitHeadingCommand__Group__2
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1231:1: rule__InitHeadingCommand__Group__2 : rule__InitHeadingCommand__Group__2__Impl ;
    public final void rule__InitHeadingCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1235:1: ( rule__InitHeadingCommand__Group__2__Impl )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1236:2: rule__InitHeadingCommand__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__InitHeadingCommand__Group__2__Impl_in_rule__InitHeadingCommand__Group__22551);
            rule__InitHeadingCommand__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InitHeadingCommand__Group__2


    // $ANTLR start rule__InitHeadingCommand__Group__2__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1242:1: rule__InitHeadingCommand__Group__2__Impl : ( ';' ) ;
    public final void rule__InitHeadingCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1246:1: ( ( ';' ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1247:1: ( ';' )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1247:1: ( ';' )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1248:1: ';'
            {
             before(grammarAccess.getInitHeadingCommandAccess().getSemicolonKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__InitHeadingCommand__Group__2__Impl2579); 
             after(grammarAccess.getInitHeadingCommandAccess().getSemicolonKeyword_2()); 

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
    // $ANTLR end rule__InitHeadingCommand__Group__2__Impl


    // $ANTLR start rule__InitBoardSizeCommand__Group__0
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1267:1: rule__InitBoardSizeCommand__Group__0 : rule__InitBoardSizeCommand__Group__0__Impl rule__InitBoardSizeCommand__Group__1 ;
    public final void rule__InitBoardSizeCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1271:1: ( rule__InitBoardSizeCommand__Group__0__Impl rule__InitBoardSizeCommand__Group__1 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1272:2: rule__InitBoardSizeCommand__Group__0__Impl rule__InitBoardSizeCommand__Group__1
            {
            pushFollow(FOLLOW_rule__InitBoardSizeCommand__Group__0__Impl_in_rule__InitBoardSizeCommand__Group__02616);
            rule__InitBoardSizeCommand__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__InitBoardSizeCommand__Group__1_in_rule__InitBoardSizeCommand__Group__02619);
            rule__InitBoardSizeCommand__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InitBoardSizeCommand__Group__0


    // $ANTLR start rule__InitBoardSizeCommand__Group__0__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1279:1: rule__InitBoardSizeCommand__Group__0__Impl : ( 'boardSize' ) ;
    public final void rule__InitBoardSizeCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1283:1: ( ( 'boardSize' ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1284:1: ( 'boardSize' )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1284:1: ( 'boardSize' )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1285:1: 'boardSize'
            {
             before(grammarAccess.getInitBoardSizeCommandAccess().getBoardSizeKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__InitBoardSizeCommand__Group__0__Impl2647); 
             after(grammarAccess.getInitBoardSizeCommandAccess().getBoardSizeKeyword_0()); 

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
    // $ANTLR end rule__InitBoardSizeCommand__Group__0__Impl


    // $ANTLR start rule__InitBoardSizeCommand__Group__1
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1298:1: rule__InitBoardSizeCommand__Group__1 : rule__InitBoardSizeCommand__Group__1__Impl rule__InitBoardSizeCommand__Group__2 ;
    public final void rule__InitBoardSizeCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1302:1: ( rule__InitBoardSizeCommand__Group__1__Impl rule__InitBoardSizeCommand__Group__2 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1303:2: rule__InitBoardSizeCommand__Group__1__Impl rule__InitBoardSizeCommand__Group__2
            {
            pushFollow(FOLLOW_rule__InitBoardSizeCommand__Group__1__Impl_in_rule__InitBoardSizeCommand__Group__12678);
            rule__InitBoardSizeCommand__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__InitBoardSizeCommand__Group__2_in_rule__InitBoardSizeCommand__Group__12681);
            rule__InitBoardSizeCommand__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InitBoardSizeCommand__Group__1


    // $ANTLR start rule__InitBoardSizeCommand__Group__1__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1310:1: rule__InitBoardSizeCommand__Group__1__Impl : ( ( rule__InitBoardSizeCommand__WidthAssignment_1 ) ) ;
    public final void rule__InitBoardSizeCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1314:1: ( ( ( rule__InitBoardSizeCommand__WidthAssignment_1 ) ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1315:1: ( ( rule__InitBoardSizeCommand__WidthAssignment_1 ) )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1315:1: ( ( rule__InitBoardSizeCommand__WidthAssignment_1 ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1316:1: ( rule__InitBoardSizeCommand__WidthAssignment_1 )
            {
             before(grammarAccess.getInitBoardSizeCommandAccess().getWidthAssignment_1()); 
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1317:1: ( rule__InitBoardSizeCommand__WidthAssignment_1 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1317:2: rule__InitBoardSizeCommand__WidthAssignment_1
            {
            pushFollow(FOLLOW_rule__InitBoardSizeCommand__WidthAssignment_1_in_rule__InitBoardSizeCommand__Group__1__Impl2708);
            rule__InitBoardSizeCommand__WidthAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getInitBoardSizeCommandAccess().getWidthAssignment_1()); 

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
    // $ANTLR end rule__InitBoardSizeCommand__Group__1__Impl


    // $ANTLR start rule__InitBoardSizeCommand__Group__2
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1327:1: rule__InitBoardSizeCommand__Group__2 : rule__InitBoardSizeCommand__Group__2__Impl rule__InitBoardSizeCommand__Group__3 ;
    public final void rule__InitBoardSizeCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1331:1: ( rule__InitBoardSizeCommand__Group__2__Impl rule__InitBoardSizeCommand__Group__3 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1332:2: rule__InitBoardSizeCommand__Group__2__Impl rule__InitBoardSizeCommand__Group__3
            {
            pushFollow(FOLLOW_rule__InitBoardSizeCommand__Group__2__Impl_in_rule__InitBoardSizeCommand__Group__22738);
            rule__InitBoardSizeCommand__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__InitBoardSizeCommand__Group__3_in_rule__InitBoardSizeCommand__Group__22741);
            rule__InitBoardSizeCommand__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InitBoardSizeCommand__Group__2


    // $ANTLR start rule__InitBoardSizeCommand__Group__2__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1339:1: rule__InitBoardSizeCommand__Group__2__Impl : ( ',' ) ;
    public final void rule__InitBoardSizeCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1343:1: ( ( ',' ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1344:1: ( ',' )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1344:1: ( ',' )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1345:1: ','
            {
             before(grammarAccess.getInitBoardSizeCommandAccess().getCommaKeyword_2()); 
            match(input,28,FOLLOW_28_in_rule__InitBoardSizeCommand__Group__2__Impl2769); 
             after(grammarAccess.getInitBoardSizeCommandAccess().getCommaKeyword_2()); 

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
    // $ANTLR end rule__InitBoardSizeCommand__Group__2__Impl


    // $ANTLR start rule__InitBoardSizeCommand__Group__3
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1358:1: rule__InitBoardSizeCommand__Group__3 : rule__InitBoardSizeCommand__Group__3__Impl rule__InitBoardSizeCommand__Group__4 ;
    public final void rule__InitBoardSizeCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1362:1: ( rule__InitBoardSizeCommand__Group__3__Impl rule__InitBoardSizeCommand__Group__4 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1363:2: rule__InitBoardSizeCommand__Group__3__Impl rule__InitBoardSizeCommand__Group__4
            {
            pushFollow(FOLLOW_rule__InitBoardSizeCommand__Group__3__Impl_in_rule__InitBoardSizeCommand__Group__32800);
            rule__InitBoardSizeCommand__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__InitBoardSizeCommand__Group__4_in_rule__InitBoardSizeCommand__Group__32803);
            rule__InitBoardSizeCommand__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InitBoardSizeCommand__Group__3


    // $ANTLR start rule__InitBoardSizeCommand__Group__3__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1370:1: rule__InitBoardSizeCommand__Group__3__Impl : ( ( rule__InitBoardSizeCommand__HeightAssignment_3 ) ) ;
    public final void rule__InitBoardSizeCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1374:1: ( ( ( rule__InitBoardSizeCommand__HeightAssignment_3 ) ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1375:1: ( ( rule__InitBoardSizeCommand__HeightAssignment_3 ) )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1375:1: ( ( rule__InitBoardSizeCommand__HeightAssignment_3 ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1376:1: ( rule__InitBoardSizeCommand__HeightAssignment_3 )
            {
             before(grammarAccess.getInitBoardSizeCommandAccess().getHeightAssignment_3()); 
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1377:1: ( rule__InitBoardSizeCommand__HeightAssignment_3 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1377:2: rule__InitBoardSizeCommand__HeightAssignment_3
            {
            pushFollow(FOLLOW_rule__InitBoardSizeCommand__HeightAssignment_3_in_rule__InitBoardSizeCommand__Group__3__Impl2830);
            rule__InitBoardSizeCommand__HeightAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getInitBoardSizeCommandAccess().getHeightAssignment_3()); 

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
    // $ANTLR end rule__InitBoardSizeCommand__Group__3__Impl


    // $ANTLR start rule__InitBoardSizeCommand__Group__4
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1387:1: rule__InitBoardSizeCommand__Group__4 : rule__InitBoardSizeCommand__Group__4__Impl ;
    public final void rule__InitBoardSizeCommand__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1391:1: ( rule__InitBoardSizeCommand__Group__4__Impl )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1392:2: rule__InitBoardSizeCommand__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__InitBoardSizeCommand__Group__4__Impl_in_rule__InitBoardSizeCommand__Group__42860);
            rule__InitBoardSizeCommand__Group__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InitBoardSizeCommand__Group__4


    // $ANTLR start rule__InitBoardSizeCommand__Group__4__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1398:1: rule__InitBoardSizeCommand__Group__4__Impl : ( ';' ) ;
    public final void rule__InitBoardSizeCommand__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1402:1: ( ( ';' ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1403:1: ( ';' )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1403:1: ( ';' )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1404:1: ';'
            {
             before(grammarAccess.getInitBoardSizeCommandAccess().getSemicolonKeyword_4()); 
            match(input,29,FOLLOW_29_in_rule__InitBoardSizeCommand__Group__4__Impl2888); 
             after(grammarAccess.getInitBoardSizeCommandAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end rule__InitBoardSizeCommand__Group__4__Impl


    // $ANTLR start rule__UserDefinedCommand__Group__0
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1427:1: rule__UserDefinedCommand__Group__0 : rule__UserDefinedCommand__Group__0__Impl rule__UserDefinedCommand__Group__1 ;
    public final void rule__UserDefinedCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1431:1: ( rule__UserDefinedCommand__Group__0__Impl rule__UserDefinedCommand__Group__1 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1432:2: rule__UserDefinedCommand__Group__0__Impl rule__UserDefinedCommand__Group__1
            {
            pushFollow(FOLLOW_rule__UserDefinedCommand__Group__0__Impl_in_rule__UserDefinedCommand__Group__02929);
            rule__UserDefinedCommand__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UserDefinedCommand__Group__1_in_rule__UserDefinedCommand__Group__02932);
            rule__UserDefinedCommand__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UserDefinedCommand__Group__0


    // $ANTLR start rule__UserDefinedCommand__Group__0__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1439:1: rule__UserDefinedCommand__Group__0__Impl : ( ( rule__UserDefinedCommand__DocAssignment_0 )? ) ;
    public final void rule__UserDefinedCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1443:1: ( ( ( rule__UserDefinedCommand__DocAssignment_0 )? ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1444:1: ( ( rule__UserDefinedCommand__DocAssignment_0 )? )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1444:1: ( ( rule__UserDefinedCommand__DocAssignment_0 )? )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1445:1: ( rule__UserDefinedCommand__DocAssignment_0 )?
            {
             before(grammarAccess.getUserDefinedCommandAccess().getDocAssignment_0()); 
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1446:1: ( rule__UserDefinedCommand__DocAssignment_0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==47) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1446:2: rule__UserDefinedCommand__DocAssignment_0
                    {
                    pushFollow(FOLLOW_rule__UserDefinedCommand__DocAssignment_0_in_rule__UserDefinedCommand__Group__0__Impl2959);
                    rule__UserDefinedCommand__DocAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUserDefinedCommandAccess().getDocAssignment_0()); 

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
    // $ANTLR end rule__UserDefinedCommand__Group__0__Impl


    // $ANTLR start rule__UserDefinedCommand__Group__1
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1456:1: rule__UserDefinedCommand__Group__1 : rule__UserDefinedCommand__Group__1__Impl rule__UserDefinedCommand__Group__2 ;
    public final void rule__UserDefinedCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1460:1: ( rule__UserDefinedCommand__Group__1__Impl rule__UserDefinedCommand__Group__2 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1461:2: rule__UserDefinedCommand__Group__1__Impl rule__UserDefinedCommand__Group__2
            {
            pushFollow(FOLLOW_rule__UserDefinedCommand__Group__1__Impl_in_rule__UserDefinedCommand__Group__12990);
            rule__UserDefinedCommand__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UserDefinedCommand__Group__2_in_rule__UserDefinedCommand__Group__12993);
            rule__UserDefinedCommand__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UserDefinedCommand__Group__1


    // $ANTLR start rule__UserDefinedCommand__Group__1__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1468:1: rule__UserDefinedCommand__Group__1__Impl : ( 'DEFINE COMMAND' ) ;
    public final void rule__UserDefinedCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1472:1: ( ( 'DEFINE COMMAND' ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1473:1: ( 'DEFINE COMMAND' )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1473:1: ( 'DEFINE COMMAND' )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1474:1: 'DEFINE COMMAND'
            {
             before(grammarAccess.getUserDefinedCommandAccess().getDEFINECOMMANDKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__UserDefinedCommand__Group__1__Impl3021); 
             after(grammarAccess.getUserDefinedCommandAccess().getDEFINECOMMANDKeyword_1()); 

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
    // $ANTLR end rule__UserDefinedCommand__Group__1__Impl


    // $ANTLR start rule__UserDefinedCommand__Group__2
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1487:1: rule__UserDefinedCommand__Group__2 : rule__UserDefinedCommand__Group__2__Impl rule__UserDefinedCommand__Group__3 ;
    public final void rule__UserDefinedCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1491:1: ( rule__UserDefinedCommand__Group__2__Impl rule__UserDefinedCommand__Group__3 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1492:2: rule__UserDefinedCommand__Group__2__Impl rule__UserDefinedCommand__Group__3
            {
            pushFollow(FOLLOW_rule__UserDefinedCommand__Group__2__Impl_in_rule__UserDefinedCommand__Group__23052);
            rule__UserDefinedCommand__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UserDefinedCommand__Group__3_in_rule__UserDefinedCommand__Group__23055);
            rule__UserDefinedCommand__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UserDefinedCommand__Group__2


    // $ANTLR start rule__UserDefinedCommand__Group__2__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1499:1: rule__UserDefinedCommand__Group__2__Impl : ( ( rule__UserDefinedCommand__NameAssignment_2 ) ) ;
    public final void rule__UserDefinedCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1503:1: ( ( ( rule__UserDefinedCommand__NameAssignment_2 ) ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1504:1: ( ( rule__UserDefinedCommand__NameAssignment_2 ) )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1504:1: ( ( rule__UserDefinedCommand__NameAssignment_2 ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1505:1: ( rule__UserDefinedCommand__NameAssignment_2 )
            {
             before(grammarAccess.getUserDefinedCommandAccess().getNameAssignment_2()); 
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1506:1: ( rule__UserDefinedCommand__NameAssignment_2 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1506:2: rule__UserDefinedCommand__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__UserDefinedCommand__NameAssignment_2_in_rule__UserDefinedCommand__Group__2__Impl3082);
            rule__UserDefinedCommand__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getUserDefinedCommandAccess().getNameAssignment_2()); 

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
    // $ANTLR end rule__UserDefinedCommand__Group__2__Impl


    // $ANTLR start rule__UserDefinedCommand__Group__3
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1516:1: rule__UserDefinedCommand__Group__3 : rule__UserDefinedCommand__Group__3__Impl rule__UserDefinedCommand__Group__4 ;
    public final void rule__UserDefinedCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1520:1: ( rule__UserDefinedCommand__Group__3__Impl rule__UserDefinedCommand__Group__4 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1521:2: rule__UserDefinedCommand__Group__3__Impl rule__UserDefinedCommand__Group__4
            {
            pushFollow(FOLLOW_rule__UserDefinedCommand__Group__3__Impl_in_rule__UserDefinedCommand__Group__33112);
            rule__UserDefinedCommand__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UserDefinedCommand__Group__4_in_rule__UserDefinedCommand__Group__33115);
            rule__UserDefinedCommand__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UserDefinedCommand__Group__3


    // $ANTLR start rule__UserDefinedCommand__Group__3__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1528:1: rule__UserDefinedCommand__Group__3__Impl : ( 'AS' ) ;
    public final void rule__UserDefinedCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1532:1: ( ( 'AS' ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1533:1: ( 'AS' )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1533:1: ( 'AS' )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1534:1: 'AS'
            {
             before(grammarAccess.getUserDefinedCommandAccess().getASKeyword_3()); 
            match(input,33,FOLLOW_33_in_rule__UserDefinedCommand__Group__3__Impl3143); 
             after(grammarAccess.getUserDefinedCommandAccess().getASKeyword_3()); 

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
    // $ANTLR end rule__UserDefinedCommand__Group__3__Impl


    // $ANTLR start rule__UserDefinedCommand__Group__4
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1547:1: rule__UserDefinedCommand__Group__4 : rule__UserDefinedCommand__Group__4__Impl rule__UserDefinedCommand__Group__5 ;
    public final void rule__UserDefinedCommand__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1551:1: ( rule__UserDefinedCommand__Group__4__Impl rule__UserDefinedCommand__Group__5 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1552:2: rule__UserDefinedCommand__Group__4__Impl rule__UserDefinedCommand__Group__5
            {
            pushFollow(FOLLOW_rule__UserDefinedCommand__Group__4__Impl_in_rule__UserDefinedCommand__Group__43174);
            rule__UserDefinedCommand__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UserDefinedCommand__Group__5_in_rule__UserDefinedCommand__Group__43177);
            rule__UserDefinedCommand__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UserDefinedCommand__Group__4


    // $ANTLR start rule__UserDefinedCommand__Group__4__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1559:1: rule__UserDefinedCommand__Group__4__Impl : ( 'BEGIN' ) ;
    public final void rule__UserDefinedCommand__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1563:1: ( ( 'BEGIN' ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1564:1: ( 'BEGIN' )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1564:1: ( 'BEGIN' )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1565:1: 'BEGIN'
            {
             before(grammarAccess.getUserDefinedCommandAccess().getBEGINKeyword_4()); 
            match(input,34,FOLLOW_34_in_rule__UserDefinedCommand__Group__4__Impl3205); 
             after(grammarAccess.getUserDefinedCommandAccess().getBEGINKeyword_4()); 

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
    // $ANTLR end rule__UserDefinedCommand__Group__4__Impl


    // $ANTLR start rule__UserDefinedCommand__Group__5
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1578:1: rule__UserDefinedCommand__Group__5 : rule__UserDefinedCommand__Group__5__Impl rule__UserDefinedCommand__Group__6 ;
    public final void rule__UserDefinedCommand__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1582:1: ( rule__UserDefinedCommand__Group__5__Impl rule__UserDefinedCommand__Group__6 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1583:2: rule__UserDefinedCommand__Group__5__Impl rule__UserDefinedCommand__Group__6
            {
            pushFollow(FOLLOW_rule__UserDefinedCommand__Group__5__Impl_in_rule__UserDefinedCommand__Group__53236);
            rule__UserDefinedCommand__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UserDefinedCommand__Group__6_in_rule__UserDefinedCommand__Group__53239);
            rule__UserDefinedCommand__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UserDefinedCommand__Group__5


    // $ANTLR start rule__UserDefinedCommand__Group__5__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1590:1: rule__UserDefinedCommand__Group__5__Impl : ( ( rule__UserDefinedCommand__StatementsAssignment_5 )* ) ;
    public final void rule__UserDefinedCommand__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1594:1: ( ( ( rule__UserDefinedCommand__StatementsAssignment_5 )* ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1595:1: ( ( rule__UserDefinedCommand__StatementsAssignment_5 )* )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1595:1: ( ( rule__UserDefinedCommand__StatementsAssignment_5 )* )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1596:1: ( rule__UserDefinedCommand__StatementsAssignment_5 )*
            {
             before(grammarAccess.getUserDefinedCommandAccess().getStatementsAssignment_5()); 
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1597:1: ( rule__UserDefinedCommand__StatementsAssignment_5 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||(LA10_0>=15 && LA10_0<=20)||LA10_0==38||LA10_0==44||LA10_0==46) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1597:2: rule__UserDefinedCommand__StatementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__UserDefinedCommand__StatementsAssignment_5_in_rule__UserDefinedCommand__Group__5__Impl3266);
            	    rule__UserDefinedCommand__StatementsAssignment_5();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getUserDefinedCommandAccess().getStatementsAssignment_5()); 

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
    // $ANTLR end rule__UserDefinedCommand__Group__5__Impl


    // $ANTLR start rule__UserDefinedCommand__Group__6
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1607:1: rule__UserDefinedCommand__Group__6 : rule__UserDefinedCommand__Group__6__Impl ;
    public final void rule__UserDefinedCommand__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1611:1: ( rule__UserDefinedCommand__Group__6__Impl )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1612:2: rule__UserDefinedCommand__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__UserDefinedCommand__Group__6__Impl_in_rule__UserDefinedCommand__Group__63297);
            rule__UserDefinedCommand__Group__6__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UserDefinedCommand__Group__6


    // $ANTLR start rule__UserDefinedCommand__Group__6__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1618:1: rule__UserDefinedCommand__Group__6__Impl : ( 'END' ) ;
    public final void rule__UserDefinedCommand__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1622:1: ( ( 'END' ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1623:1: ( 'END' )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1623:1: ( 'END' )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1624:1: 'END'
            {
             before(grammarAccess.getUserDefinedCommandAccess().getENDKeyword_6()); 
            match(input,35,FOLLOW_35_in_rule__UserDefinedCommand__Group__6__Impl3325); 
             after(grammarAccess.getUserDefinedCommandAccess().getENDKeyword_6()); 

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
    // $ANTLR end rule__UserDefinedCommand__Group__6__Impl


    // $ANTLR start rule__Main__Group__0
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1651:1: rule__Main__Group__0 : rule__Main__Group__0__Impl rule__Main__Group__1 ;
    public final void rule__Main__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1655:1: ( rule__Main__Group__0__Impl rule__Main__Group__1 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1656:2: rule__Main__Group__0__Impl rule__Main__Group__1
            {
            pushFollow(FOLLOW_rule__Main__Group__0__Impl_in_rule__Main__Group__03370);
            rule__Main__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Main__Group__1_in_rule__Main__Group__03373);
            rule__Main__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Main__Group__0


    // $ANTLR start rule__Main__Group__0__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1663:1: rule__Main__Group__0__Impl : ( () ) ;
    public final void rule__Main__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1667:1: ( ( () ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1668:1: ( () )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1668:1: ( () )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1669:1: ()
            {
             before(grammarAccess.getMainAccess().getMainAction_0()); 
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1670:1: ()
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1672:1: 
            {
            }

             after(grammarAccess.getMainAccess().getMainAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Main__Group__0__Impl


    // $ANTLR start rule__Main__Group__1
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1682:1: rule__Main__Group__1 : rule__Main__Group__1__Impl rule__Main__Group__2 ;
    public final void rule__Main__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1686:1: ( rule__Main__Group__1__Impl rule__Main__Group__2 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1687:2: rule__Main__Group__1__Impl rule__Main__Group__2
            {
            pushFollow(FOLLOW_rule__Main__Group__1__Impl_in_rule__Main__Group__13431);
            rule__Main__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Main__Group__2_in_rule__Main__Group__13434);
            rule__Main__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Main__Group__1


    // $ANTLR start rule__Main__Group__1__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1694:1: rule__Main__Group__1__Impl : ( 'BEGIN-MAIN' ) ;
    public final void rule__Main__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1698:1: ( ( 'BEGIN-MAIN' ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1699:1: ( 'BEGIN-MAIN' )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1699:1: ( 'BEGIN-MAIN' )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1700:1: 'BEGIN-MAIN'
            {
             before(grammarAccess.getMainAccess().getBEGINMAINKeyword_1()); 
            match(input,36,FOLLOW_36_in_rule__Main__Group__1__Impl3462); 
             after(grammarAccess.getMainAccess().getBEGINMAINKeyword_1()); 

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
    // $ANTLR end rule__Main__Group__1__Impl


    // $ANTLR start rule__Main__Group__2
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1713:1: rule__Main__Group__2 : rule__Main__Group__2__Impl rule__Main__Group__3 ;
    public final void rule__Main__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1717:1: ( rule__Main__Group__2__Impl rule__Main__Group__3 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1718:2: rule__Main__Group__2__Impl rule__Main__Group__3
            {
            pushFollow(FOLLOW_rule__Main__Group__2__Impl_in_rule__Main__Group__23493);
            rule__Main__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Main__Group__3_in_rule__Main__Group__23496);
            rule__Main__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Main__Group__2


    // $ANTLR start rule__Main__Group__2__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1725:1: rule__Main__Group__2__Impl : ( ( rule__Main__StatementsAssignment_2 )* ) ;
    public final void rule__Main__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1729:1: ( ( ( rule__Main__StatementsAssignment_2 )* ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1730:1: ( ( rule__Main__StatementsAssignment_2 )* )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1730:1: ( ( rule__Main__StatementsAssignment_2 )* )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1731:1: ( rule__Main__StatementsAssignment_2 )*
            {
             before(grammarAccess.getMainAccess().getStatementsAssignment_2()); 
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1732:1: ( rule__Main__StatementsAssignment_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||(LA11_0>=15 && LA11_0<=20)||LA11_0==38||LA11_0==44||LA11_0==46) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1732:2: rule__Main__StatementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Main__StatementsAssignment_2_in_rule__Main__Group__2__Impl3523);
            	    rule__Main__StatementsAssignment_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getMainAccess().getStatementsAssignment_2()); 

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
    // $ANTLR end rule__Main__Group__2__Impl


    // $ANTLR start rule__Main__Group__3
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1742:1: rule__Main__Group__3 : rule__Main__Group__3__Impl ;
    public final void rule__Main__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1746:1: ( rule__Main__Group__3__Impl )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1747:2: rule__Main__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Main__Group__3__Impl_in_rule__Main__Group__33554);
            rule__Main__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Main__Group__3


    // $ANTLR start rule__Main__Group__3__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1753:1: rule__Main__Group__3__Impl : ( 'END-MAIN' ) ;
    public final void rule__Main__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1757:1: ( ( 'END-MAIN' ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1758:1: ( 'END-MAIN' )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1758:1: ( 'END-MAIN' )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1759:1: 'END-MAIN'
            {
             before(grammarAccess.getMainAccess().getENDMAINKeyword_3()); 
            match(input,37,FOLLOW_37_in_rule__Main__Group__3__Impl3582); 
             after(grammarAccess.getMainAccess().getENDMAINKeyword_3()); 

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
    // $ANTLR end rule__Main__Group__3__Impl


    // $ANTLR start rule__UserDefinedCommandStatement__Group__0
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1780:1: rule__UserDefinedCommandStatement__Group__0 : rule__UserDefinedCommandStatement__Group__0__Impl rule__UserDefinedCommandStatement__Group__1 ;
    public final void rule__UserDefinedCommandStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1784:1: ( rule__UserDefinedCommandStatement__Group__0__Impl rule__UserDefinedCommandStatement__Group__1 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1785:2: rule__UserDefinedCommandStatement__Group__0__Impl rule__UserDefinedCommandStatement__Group__1
            {
            pushFollow(FOLLOW_rule__UserDefinedCommandStatement__Group__0__Impl_in_rule__UserDefinedCommandStatement__Group__03621);
            rule__UserDefinedCommandStatement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UserDefinedCommandStatement__Group__1_in_rule__UserDefinedCommandStatement__Group__03624);
            rule__UserDefinedCommandStatement__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UserDefinedCommandStatement__Group__0


    // $ANTLR start rule__UserDefinedCommandStatement__Group__0__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1792:1: rule__UserDefinedCommandStatement__Group__0__Impl : ( ( rule__UserDefinedCommandStatement__CommandAssignment_0 ) ) ;
    public final void rule__UserDefinedCommandStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1796:1: ( ( ( rule__UserDefinedCommandStatement__CommandAssignment_0 ) ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1797:1: ( ( rule__UserDefinedCommandStatement__CommandAssignment_0 ) )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1797:1: ( ( rule__UserDefinedCommandStatement__CommandAssignment_0 ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1798:1: ( rule__UserDefinedCommandStatement__CommandAssignment_0 )
            {
             before(grammarAccess.getUserDefinedCommandStatementAccess().getCommandAssignment_0()); 
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1799:1: ( rule__UserDefinedCommandStatement__CommandAssignment_0 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1799:2: rule__UserDefinedCommandStatement__CommandAssignment_0
            {
            pushFollow(FOLLOW_rule__UserDefinedCommandStatement__CommandAssignment_0_in_rule__UserDefinedCommandStatement__Group__0__Impl3651);
            rule__UserDefinedCommandStatement__CommandAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getUserDefinedCommandStatementAccess().getCommandAssignment_0()); 

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
    // $ANTLR end rule__UserDefinedCommandStatement__Group__0__Impl


    // $ANTLR start rule__UserDefinedCommandStatement__Group__1
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1809:1: rule__UserDefinedCommandStatement__Group__1 : rule__UserDefinedCommandStatement__Group__1__Impl ;
    public final void rule__UserDefinedCommandStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1813:1: ( rule__UserDefinedCommandStatement__Group__1__Impl )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1814:2: rule__UserDefinedCommandStatement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__UserDefinedCommandStatement__Group__1__Impl_in_rule__UserDefinedCommandStatement__Group__13681);
            rule__UserDefinedCommandStatement__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UserDefinedCommandStatement__Group__1


    // $ANTLR start rule__UserDefinedCommandStatement__Group__1__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1820:1: rule__UserDefinedCommandStatement__Group__1__Impl : ( ';' ) ;
    public final void rule__UserDefinedCommandStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1824:1: ( ( ';' ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1825:1: ( ';' )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1825:1: ( ';' )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1826:1: ';'
            {
             before(grammarAccess.getUserDefinedCommandStatementAccess().getSemicolonKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__UserDefinedCommandStatement__Group__1__Impl3709); 
             after(grammarAccess.getUserDefinedCommandStatementAccess().getSemicolonKeyword_1()); 

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
    // $ANTLR end rule__UserDefinedCommandStatement__Group__1__Impl


    // $ANTLR start rule__IfStatement__Group__0
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1843:1: rule__IfStatement__Group__0 : rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 ;
    public final void rule__IfStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1847:1: ( rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1848:2: rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1
            {
            pushFollow(FOLLOW_rule__IfStatement__Group__0__Impl_in_rule__IfStatement__Group__03744);
            rule__IfStatement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__IfStatement__Group__1_in_rule__IfStatement__Group__03747);
            rule__IfStatement__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IfStatement__Group__0


    // $ANTLR start rule__IfStatement__Group__0__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1855:1: rule__IfStatement__Group__0__Impl : ( 'IF' ) ;
    public final void rule__IfStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1859:1: ( ( 'IF' ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1860:1: ( 'IF' )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1860:1: ( 'IF' )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1861:1: 'IF'
            {
             before(grammarAccess.getIfStatementAccess().getIFKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__IfStatement__Group__0__Impl3775); 
             after(grammarAccess.getIfStatementAccess().getIFKeyword_0()); 

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
    // $ANTLR end rule__IfStatement__Group__0__Impl


    // $ANTLR start rule__IfStatement__Group__1
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1874:1: rule__IfStatement__Group__1 : rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 ;
    public final void rule__IfStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1878:1: ( rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1879:2: rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2
            {
            pushFollow(FOLLOW_rule__IfStatement__Group__1__Impl_in_rule__IfStatement__Group__13806);
            rule__IfStatement__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__IfStatement__Group__2_in_rule__IfStatement__Group__13809);
            rule__IfStatement__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IfStatement__Group__1


    // $ANTLR start rule__IfStatement__Group__1__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1886:1: rule__IfStatement__Group__1__Impl : ( '(' ) ;
    public final void rule__IfStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1890:1: ( ( '(' ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1891:1: ( '(' )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1891:1: ( '(' )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1892:1: '('
            {
             before(grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1()); 
            match(input,39,FOLLOW_39_in_rule__IfStatement__Group__1__Impl3837); 
             after(grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end rule__IfStatement__Group__1__Impl


    // $ANTLR start rule__IfStatement__Group__2
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1905:1: rule__IfStatement__Group__2 : rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 ;
    public final void rule__IfStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1909:1: ( rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1910:2: rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3
            {
            pushFollow(FOLLOW_rule__IfStatement__Group__2__Impl_in_rule__IfStatement__Group__23868);
            rule__IfStatement__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__IfStatement__Group__3_in_rule__IfStatement__Group__23871);
            rule__IfStatement__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IfStatement__Group__2


    // $ANTLR start rule__IfStatement__Group__2__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1917:1: rule__IfStatement__Group__2__Impl : ( ( rule__IfStatement__ConditionAssignment_2 ) ) ;
    public final void rule__IfStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1921:1: ( ( ( rule__IfStatement__ConditionAssignment_2 ) ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1922:1: ( ( rule__IfStatement__ConditionAssignment_2 ) )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1922:1: ( ( rule__IfStatement__ConditionAssignment_2 ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1923:1: ( rule__IfStatement__ConditionAssignment_2 )
            {
             before(grammarAccess.getIfStatementAccess().getConditionAssignment_2()); 
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1924:1: ( rule__IfStatement__ConditionAssignment_2 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1924:2: rule__IfStatement__ConditionAssignment_2
            {
            pushFollow(FOLLOW_rule__IfStatement__ConditionAssignment_2_in_rule__IfStatement__Group__2__Impl3898);
            rule__IfStatement__ConditionAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getConditionAssignment_2()); 

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
    // $ANTLR end rule__IfStatement__Group__2__Impl


    // $ANTLR start rule__IfStatement__Group__3
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1934:1: rule__IfStatement__Group__3 : rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 ;
    public final void rule__IfStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1938:1: ( rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1939:2: rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4
            {
            pushFollow(FOLLOW_rule__IfStatement__Group__3__Impl_in_rule__IfStatement__Group__33928);
            rule__IfStatement__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__IfStatement__Group__4_in_rule__IfStatement__Group__33931);
            rule__IfStatement__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IfStatement__Group__3


    // $ANTLR start rule__IfStatement__Group__3__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1946:1: rule__IfStatement__Group__3__Impl : ( ')' ) ;
    public final void rule__IfStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1950:1: ( ( ')' ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1951:1: ( ')' )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1951:1: ( ')' )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1952:1: ')'
            {
             before(grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3()); 
            match(input,40,FOLLOW_40_in_rule__IfStatement__Group__3__Impl3959); 
             after(grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end rule__IfStatement__Group__3__Impl


    // $ANTLR start rule__IfStatement__Group__4
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1965:1: rule__IfStatement__Group__4 : rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 ;
    public final void rule__IfStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1969:1: ( rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1970:2: rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5
            {
            pushFollow(FOLLOW_rule__IfStatement__Group__4__Impl_in_rule__IfStatement__Group__43990);
            rule__IfStatement__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__IfStatement__Group__5_in_rule__IfStatement__Group__43993);
            rule__IfStatement__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IfStatement__Group__4


    // $ANTLR start rule__IfStatement__Group__4__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1977:1: rule__IfStatement__Group__4__Impl : ( '{' ) ;
    public final void rule__IfStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1981:1: ( ( '{' ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1982:1: ( '{' )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1982:1: ( '{' )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1983:1: '{'
            {
             before(grammarAccess.getIfStatementAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,41,FOLLOW_41_in_rule__IfStatement__Group__4__Impl4021); 
             after(grammarAccess.getIfStatementAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end rule__IfStatement__Group__4__Impl


    // $ANTLR start rule__IfStatement__Group__5
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:1996:1: rule__IfStatement__Group__5 : rule__IfStatement__Group__5__Impl rule__IfStatement__Group__6 ;
    public final void rule__IfStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2000:1: ( rule__IfStatement__Group__5__Impl rule__IfStatement__Group__6 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2001:2: rule__IfStatement__Group__5__Impl rule__IfStatement__Group__6
            {
            pushFollow(FOLLOW_rule__IfStatement__Group__5__Impl_in_rule__IfStatement__Group__54052);
            rule__IfStatement__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__IfStatement__Group__6_in_rule__IfStatement__Group__54055);
            rule__IfStatement__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IfStatement__Group__5


    // $ANTLR start rule__IfStatement__Group__5__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2008:1: rule__IfStatement__Group__5__Impl : ( ( rule__IfStatement__StatementsAssignment_5 )* ) ;
    public final void rule__IfStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2012:1: ( ( ( rule__IfStatement__StatementsAssignment_5 )* ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2013:1: ( ( rule__IfStatement__StatementsAssignment_5 )* )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2013:1: ( ( rule__IfStatement__StatementsAssignment_5 )* )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2014:1: ( rule__IfStatement__StatementsAssignment_5 )*
            {
             before(grammarAccess.getIfStatementAccess().getStatementsAssignment_5()); 
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2015:1: ( rule__IfStatement__StatementsAssignment_5 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||(LA12_0>=15 && LA12_0<=20)||LA12_0==38||LA12_0==44||LA12_0==46) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2015:2: rule__IfStatement__StatementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__IfStatement__StatementsAssignment_5_in_rule__IfStatement__Group__5__Impl4082);
            	    rule__IfStatement__StatementsAssignment_5();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getIfStatementAccess().getStatementsAssignment_5()); 

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
    // $ANTLR end rule__IfStatement__Group__5__Impl


    // $ANTLR start rule__IfStatement__Group__6
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2025:1: rule__IfStatement__Group__6 : rule__IfStatement__Group__6__Impl rule__IfStatement__Group__7 ;
    public final void rule__IfStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2029:1: ( rule__IfStatement__Group__6__Impl rule__IfStatement__Group__7 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2030:2: rule__IfStatement__Group__6__Impl rule__IfStatement__Group__7
            {
            pushFollow(FOLLOW_rule__IfStatement__Group__6__Impl_in_rule__IfStatement__Group__64113);
            rule__IfStatement__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__IfStatement__Group__7_in_rule__IfStatement__Group__64116);
            rule__IfStatement__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IfStatement__Group__6


    // $ANTLR start rule__IfStatement__Group__6__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2037:1: rule__IfStatement__Group__6__Impl : ( '}' ) ;
    public final void rule__IfStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2041:1: ( ( '}' ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2042:1: ( '}' )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2042:1: ( '}' )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2043:1: '}'
            {
             before(grammarAccess.getIfStatementAccess().getRightCurlyBracketKeyword_6()); 
            match(input,42,FOLLOW_42_in_rule__IfStatement__Group__6__Impl4144); 
             after(grammarAccess.getIfStatementAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end rule__IfStatement__Group__6__Impl


    // $ANTLR start rule__IfStatement__Group__7
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2056:1: rule__IfStatement__Group__7 : rule__IfStatement__Group__7__Impl ;
    public final void rule__IfStatement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2060:1: ( rule__IfStatement__Group__7__Impl )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2061:2: rule__IfStatement__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__IfStatement__Group__7__Impl_in_rule__IfStatement__Group__74175);
            rule__IfStatement__Group__7__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IfStatement__Group__7


    // $ANTLR start rule__IfStatement__Group__7__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2067:1: rule__IfStatement__Group__7__Impl : ( ( rule__IfStatement__Group_7__0 )? ) ;
    public final void rule__IfStatement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2071:1: ( ( ( rule__IfStatement__Group_7__0 )? ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2072:1: ( ( rule__IfStatement__Group_7__0 )? )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2072:1: ( ( rule__IfStatement__Group_7__0 )? )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2073:1: ( rule__IfStatement__Group_7__0 )?
            {
             before(grammarAccess.getIfStatementAccess().getGroup_7()); 
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2074:1: ( rule__IfStatement__Group_7__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==43) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2074:2: rule__IfStatement__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__IfStatement__Group_7__0_in_rule__IfStatement__Group__7__Impl4202);
                    rule__IfStatement__Group_7__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIfStatementAccess().getGroup_7()); 

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
    // $ANTLR end rule__IfStatement__Group__7__Impl


    // $ANTLR start rule__IfStatement__Group_7__0
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2100:1: rule__IfStatement__Group_7__0 : rule__IfStatement__Group_7__0__Impl rule__IfStatement__Group_7__1 ;
    public final void rule__IfStatement__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2104:1: ( rule__IfStatement__Group_7__0__Impl rule__IfStatement__Group_7__1 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2105:2: rule__IfStatement__Group_7__0__Impl rule__IfStatement__Group_7__1
            {
            pushFollow(FOLLOW_rule__IfStatement__Group_7__0__Impl_in_rule__IfStatement__Group_7__04249);
            rule__IfStatement__Group_7__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__IfStatement__Group_7__1_in_rule__IfStatement__Group_7__04252);
            rule__IfStatement__Group_7__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IfStatement__Group_7__0


    // $ANTLR start rule__IfStatement__Group_7__0__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2112:1: rule__IfStatement__Group_7__0__Impl : ( 'ELSE' ) ;
    public final void rule__IfStatement__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2116:1: ( ( 'ELSE' ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2117:1: ( 'ELSE' )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2117:1: ( 'ELSE' )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2118:1: 'ELSE'
            {
             before(grammarAccess.getIfStatementAccess().getELSEKeyword_7_0()); 
            match(input,43,FOLLOW_43_in_rule__IfStatement__Group_7__0__Impl4280); 
             after(grammarAccess.getIfStatementAccess().getELSEKeyword_7_0()); 

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
    // $ANTLR end rule__IfStatement__Group_7__0__Impl


    // $ANTLR start rule__IfStatement__Group_7__1
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2131:1: rule__IfStatement__Group_7__1 : rule__IfStatement__Group_7__1__Impl rule__IfStatement__Group_7__2 ;
    public final void rule__IfStatement__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2135:1: ( rule__IfStatement__Group_7__1__Impl rule__IfStatement__Group_7__2 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2136:2: rule__IfStatement__Group_7__1__Impl rule__IfStatement__Group_7__2
            {
            pushFollow(FOLLOW_rule__IfStatement__Group_7__1__Impl_in_rule__IfStatement__Group_7__14311);
            rule__IfStatement__Group_7__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__IfStatement__Group_7__2_in_rule__IfStatement__Group_7__14314);
            rule__IfStatement__Group_7__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IfStatement__Group_7__1


    // $ANTLR start rule__IfStatement__Group_7__1__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2143:1: rule__IfStatement__Group_7__1__Impl : ( '{' ) ;
    public final void rule__IfStatement__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2147:1: ( ( '{' ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2148:1: ( '{' )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2148:1: ( '{' )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2149:1: '{'
            {
             before(grammarAccess.getIfStatementAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,41,FOLLOW_41_in_rule__IfStatement__Group_7__1__Impl4342); 
             after(grammarAccess.getIfStatementAccess().getLeftCurlyBracketKeyword_7_1()); 

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
    // $ANTLR end rule__IfStatement__Group_7__1__Impl


    // $ANTLR start rule__IfStatement__Group_7__2
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2162:1: rule__IfStatement__Group_7__2 : rule__IfStatement__Group_7__2__Impl rule__IfStatement__Group_7__3 ;
    public final void rule__IfStatement__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2166:1: ( rule__IfStatement__Group_7__2__Impl rule__IfStatement__Group_7__3 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2167:2: rule__IfStatement__Group_7__2__Impl rule__IfStatement__Group_7__3
            {
            pushFollow(FOLLOW_rule__IfStatement__Group_7__2__Impl_in_rule__IfStatement__Group_7__24373);
            rule__IfStatement__Group_7__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__IfStatement__Group_7__3_in_rule__IfStatement__Group_7__24376);
            rule__IfStatement__Group_7__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IfStatement__Group_7__2


    // $ANTLR start rule__IfStatement__Group_7__2__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2174:1: rule__IfStatement__Group_7__2__Impl : ( ( rule__IfStatement__ElseStatementsAssignment_7_2 )* ) ;
    public final void rule__IfStatement__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2178:1: ( ( ( rule__IfStatement__ElseStatementsAssignment_7_2 )* ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2179:1: ( ( rule__IfStatement__ElseStatementsAssignment_7_2 )* )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2179:1: ( ( rule__IfStatement__ElseStatementsAssignment_7_2 )* )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2180:1: ( rule__IfStatement__ElseStatementsAssignment_7_2 )*
            {
             before(grammarAccess.getIfStatementAccess().getElseStatementsAssignment_7_2()); 
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2181:1: ( rule__IfStatement__ElseStatementsAssignment_7_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||(LA14_0>=15 && LA14_0<=20)||LA14_0==38||LA14_0==44||LA14_0==46) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2181:2: rule__IfStatement__ElseStatementsAssignment_7_2
            	    {
            	    pushFollow(FOLLOW_rule__IfStatement__ElseStatementsAssignment_7_2_in_rule__IfStatement__Group_7__2__Impl4403);
            	    rule__IfStatement__ElseStatementsAssignment_7_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getIfStatementAccess().getElseStatementsAssignment_7_2()); 

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
    // $ANTLR end rule__IfStatement__Group_7__2__Impl


    // $ANTLR start rule__IfStatement__Group_7__3
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2191:1: rule__IfStatement__Group_7__3 : rule__IfStatement__Group_7__3__Impl ;
    public final void rule__IfStatement__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2195:1: ( rule__IfStatement__Group_7__3__Impl )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2196:2: rule__IfStatement__Group_7__3__Impl
            {
            pushFollow(FOLLOW_rule__IfStatement__Group_7__3__Impl_in_rule__IfStatement__Group_7__34434);
            rule__IfStatement__Group_7__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IfStatement__Group_7__3


    // $ANTLR start rule__IfStatement__Group_7__3__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2202:1: rule__IfStatement__Group_7__3__Impl : ( '}' ) ;
    public final void rule__IfStatement__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2206:1: ( ( '}' ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2207:1: ( '}' )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2207:1: ( '}' )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2208:1: '}'
            {
             before(grammarAccess.getIfStatementAccess().getRightCurlyBracketKeyword_7_3()); 
            match(input,42,FOLLOW_42_in_rule__IfStatement__Group_7__3__Impl4462); 
             after(grammarAccess.getIfStatementAccess().getRightCurlyBracketKeyword_7_3()); 

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
    // $ANTLR end rule__IfStatement__Group_7__3__Impl


    // $ANTLR start rule__IterateStatement__Group__0
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2229:1: rule__IterateStatement__Group__0 : rule__IterateStatement__Group__0__Impl rule__IterateStatement__Group__1 ;
    public final void rule__IterateStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2233:1: ( rule__IterateStatement__Group__0__Impl rule__IterateStatement__Group__1 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2234:2: rule__IterateStatement__Group__0__Impl rule__IterateStatement__Group__1
            {
            pushFollow(FOLLOW_rule__IterateStatement__Group__0__Impl_in_rule__IterateStatement__Group__04501);
            rule__IterateStatement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__IterateStatement__Group__1_in_rule__IterateStatement__Group__04504);
            rule__IterateStatement__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IterateStatement__Group__0


    // $ANTLR start rule__IterateStatement__Group__0__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2241:1: rule__IterateStatement__Group__0__Impl : ( 'ITERATE' ) ;
    public final void rule__IterateStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2245:1: ( ( 'ITERATE' ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2246:1: ( 'ITERATE' )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2246:1: ( 'ITERATE' )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2247:1: 'ITERATE'
            {
             before(grammarAccess.getIterateStatementAccess().getITERATEKeyword_0()); 
            match(input,44,FOLLOW_44_in_rule__IterateStatement__Group__0__Impl4532); 
             after(grammarAccess.getIterateStatementAccess().getITERATEKeyword_0()); 

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
    // $ANTLR end rule__IterateStatement__Group__0__Impl


    // $ANTLR start rule__IterateStatement__Group__1
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2260:1: rule__IterateStatement__Group__1 : rule__IterateStatement__Group__1__Impl rule__IterateStatement__Group__2 ;
    public final void rule__IterateStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2264:1: ( rule__IterateStatement__Group__1__Impl rule__IterateStatement__Group__2 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2265:2: rule__IterateStatement__Group__1__Impl rule__IterateStatement__Group__2
            {
            pushFollow(FOLLOW_rule__IterateStatement__Group__1__Impl_in_rule__IterateStatement__Group__14563);
            rule__IterateStatement__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__IterateStatement__Group__2_in_rule__IterateStatement__Group__14566);
            rule__IterateStatement__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IterateStatement__Group__1


    // $ANTLR start rule__IterateStatement__Group__1__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2272:1: rule__IterateStatement__Group__1__Impl : ( ( rule__IterateStatement__TimesAssignment_1 ) ) ;
    public final void rule__IterateStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2276:1: ( ( ( rule__IterateStatement__TimesAssignment_1 ) ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2277:1: ( ( rule__IterateStatement__TimesAssignment_1 ) )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2277:1: ( ( rule__IterateStatement__TimesAssignment_1 ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2278:1: ( rule__IterateStatement__TimesAssignment_1 )
            {
             before(grammarAccess.getIterateStatementAccess().getTimesAssignment_1()); 
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2279:1: ( rule__IterateStatement__TimesAssignment_1 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2279:2: rule__IterateStatement__TimesAssignment_1
            {
            pushFollow(FOLLOW_rule__IterateStatement__TimesAssignment_1_in_rule__IterateStatement__Group__1__Impl4593);
            rule__IterateStatement__TimesAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getIterateStatementAccess().getTimesAssignment_1()); 

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
    // $ANTLR end rule__IterateStatement__Group__1__Impl


    // $ANTLR start rule__IterateStatement__Group__2
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2289:1: rule__IterateStatement__Group__2 : rule__IterateStatement__Group__2__Impl rule__IterateStatement__Group__3 ;
    public final void rule__IterateStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2293:1: ( rule__IterateStatement__Group__2__Impl rule__IterateStatement__Group__3 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2294:2: rule__IterateStatement__Group__2__Impl rule__IterateStatement__Group__3
            {
            pushFollow(FOLLOW_rule__IterateStatement__Group__2__Impl_in_rule__IterateStatement__Group__24623);
            rule__IterateStatement__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__IterateStatement__Group__3_in_rule__IterateStatement__Group__24626);
            rule__IterateStatement__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IterateStatement__Group__2


    // $ANTLR start rule__IterateStatement__Group__2__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2301:1: rule__IterateStatement__Group__2__Impl : ( 'TIMES' ) ;
    public final void rule__IterateStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2305:1: ( ( 'TIMES' ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2306:1: ( 'TIMES' )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2306:1: ( 'TIMES' )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2307:1: 'TIMES'
            {
             before(grammarAccess.getIterateStatementAccess().getTIMESKeyword_2()); 
            match(input,45,FOLLOW_45_in_rule__IterateStatement__Group__2__Impl4654); 
             after(grammarAccess.getIterateStatementAccess().getTIMESKeyword_2()); 

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
    // $ANTLR end rule__IterateStatement__Group__2__Impl


    // $ANTLR start rule__IterateStatement__Group__3
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2320:1: rule__IterateStatement__Group__3 : rule__IterateStatement__Group__3__Impl rule__IterateStatement__Group__4 ;
    public final void rule__IterateStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2324:1: ( rule__IterateStatement__Group__3__Impl rule__IterateStatement__Group__4 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2325:2: rule__IterateStatement__Group__3__Impl rule__IterateStatement__Group__4
            {
            pushFollow(FOLLOW_rule__IterateStatement__Group__3__Impl_in_rule__IterateStatement__Group__34685);
            rule__IterateStatement__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__IterateStatement__Group__4_in_rule__IterateStatement__Group__34688);
            rule__IterateStatement__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IterateStatement__Group__3


    // $ANTLR start rule__IterateStatement__Group__3__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2332:1: rule__IterateStatement__Group__3__Impl : ( '{' ) ;
    public final void rule__IterateStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2336:1: ( ( '{' ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2337:1: ( '{' )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2337:1: ( '{' )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2338:1: '{'
            {
             before(grammarAccess.getIterateStatementAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,41,FOLLOW_41_in_rule__IterateStatement__Group__3__Impl4716); 
             after(grammarAccess.getIterateStatementAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end rule__IterateStatement__Group__3__Impl


    // $ANTLR start rule__IterateStatement__Group__4
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2351:1: rule__IterateStatement__Group__4 : rule__IterateStatement__Group__4__Impl rule__IterateStatement__Group__5 ;
    public final void rule__IterateStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2355:1: ( rule__IterateStatement__Group__4__Impl rule__IterateStatement__Group__5 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2356:2: rule__IterateStatement__Group__4__Impl rule__IterateStatement__Group__5
            {
            pushFollow(FOLLOW_rule__IterateStatement__Group__4__Impl_in_rule__IterateStatement__Group__44747);
            rule__IterateStatement__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__IterateStatement__Group__5_in_rule__IterateStatement__Group__44750);
            rule__IterateStatement__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IterateStatement__Group__4


    // $ANTLR start rule__IterateStatement__Group__4__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2363:1: rule__IterateStatement__Group__4__Impl : ( ( rule__IterateStatement__StatementsAssignment_4 ) ) ;
    public final void rule__IterateStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2367:1: ( ( ( rule__IterateStatement__StatementsAssignment_4 ) ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2368:1: ( ( rule__IterateStatement__StatementsAssignment_4 ) )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2368:1: ( ( rule__IterateStatement__StatementsAssignment_4 ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2369:1: ( rule__IterateStatement__StatementsAssignment_4 )
            {
             before(grammarAccess.getIterateStatementAccess().getStatementsAssignment_4()); 
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2370:1: ( rule__IterateStatement__StatementsAssignment_4 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2370:2: rule__IterateStatement__StatementsAssignment_4
            {
            pushFollow(FOLLOW_rule__IterateStatement__StatementsAssignment_4_in_rule__IterateStatement__Group__4__Impl4777);
            rule__IterateStatement__StatementsAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getIterateStatementAccess().getStatementsAssignment_4()); 

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
    // $ANTLR end rule__IterateStatement__Group__4__Impl


    // $ANTLR start rule__IterateStatement__Group__5
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2380:1: rule__IterateStatement__Group__5 : rule__IterateStatement__Group__5__Impl ;
    public final void rule__IterateStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2384:1: ( rule__IterateStatement__Group__5__Impl )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2385:2: rule__IterateStatement__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__IterateStatement__Group__5__Impl_in_rule__IterateStatement__Group__54807);
            rule__IterateStatement__Group__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IterateStatement__Group__5


    // $ANTLR start rule__IterateStatement__Group__5__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2391:1: rule__IterateStatement__Group__5__Impl : ( '}' ) ;
    public final void rule__IterateStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2395:1: ( ( '}' ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2396:1: ( '}' )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2396:1: ( '}' )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2397:1: '}'
            {
             before(grammarAccess.getIterateStatementAccess().getRightCurlyBracketKeyword_5()); 
            match(input,42,FOLLOW_42_in_rule__IterateStatement__Group__5__Impl4835); 
             after(grammarAccess.getIterateStatementAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end rule__IterateStatement__Group__5__Impl


    // $ANTLR start rule__WhileStatement__Group__0
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2422:1: rule__WhileStatement__Group__0 : rule__WhileStatement__Group__0__Impl rule__WhileStatement__Group__1 ;
    public final void rule__WhileStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2426:1: ( rule__WhileStatement__Group__0__Impl rule__WhileStatement__Group__1 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2427:2: rule__WhileStatement__Group__0__Impl rule__WhileStatement__Group__1
            {
            pushFollow(FOLLOW_rule__WhileStatement__Group__0__Impl_in_rule__WhileStatement__Group__04878);
            rule__WhileStatement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__WhileStatement__Group__1_in_rule__WhileStatement__Group__04881);
            rule__WhileStatement__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__WhileStatement__Group__0


    // $ANTLR start rule__WhileStatement__Group__0__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2434:1: rule__WhileStatement__Group__0__Impl : ( 'WHILE' ) ;
    public final void rule__WhileStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2438:1: ( ( 'WHILE' ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2439:1: ( 'WHILE' )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2439:1: ( 'WHILE' )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2440:1: 'WHILE'
            {
             before(grammarAccess.getWhileStatementAccess().getWHILEKeyword_0()); 
            match(input,46,FOLLOW_46_in_rule__WhileStatement__Group__0__Impl4909); 
             after(grammarAccess.getWhileStatementAccess().getWHILEKeyword_0()); 

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
    // $ANTLR end rule__WhileStatement__Group__0__Impl


    // $ANTLR start rule__WhileStatement__Group__1
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2453:1: rule__WhileStatement__Group__1 : rule__WhileStatement__Group__1__Impl rule__WhileStatement__Group__2 ;
    public final void rule__WhileStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2457:1: ( rule__WhileStatement__Group__1__Impl rule__WhileStatement__Group__2 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2458:2: rule__WhileStatement__Group__1__Impl rule__WhileStatement__Group__2
            {
            pushFollow(FOLLOW_rule__WhileStatement__Group__1__Impl_in_rule__WhileStatement__Group__14940);
            rule__WhileStatement__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__WhileStatement__Group__2_in_rule__WhileStatement__Group__14943);
            rule__WhileStatement__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__WhileStatement__Group__1


    // $ANTLR start rule__WhileStatement__Group__1__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2465:1: rule__WhileStatement__Group__1__Impl : ( '(' ) ;
    public final void rule__WhileStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2469:1: ( ( '(' ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2470:1: ( '(' )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2470:1: ( '(' )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2471:1: '('
            {
             before(grammarAccess.getWhileStatementAccess().getLeftParenthesisKeyword_1()); 
            match(input,39,FOLLOW_39_in_rule__WhileStatement__Group__1__Impl4971); 
             after(grammarAccess.getWhileStatementAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end rule__WhileStatement__Group__1__Impl


    // $ANTLR start rule__WhileStatement__Group__2
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2484:1: rule__WhileStatement__Group__2 : rule__WhileStatement__Group__2__Impl rule__WhileStatement__Group__3 ;
    public final void rule__WhileStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2488:1: ( rule__WhileStatement__Group__2__Impl rule__WhileStatement__Group__3 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2489:2: rule__WhileStatement__Group__2__Impl rule__WhileStatement__Group__3
            {
            pushFollow(FOLLOW_rule__WhileStatement__Group__2__Impl_in_rule__WhileStatement__Group__25002);
            rule__WhileStatement__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__WhileStatement__Group__3_in_rule__WhileStatement__Group__25005);
            rule__WhileStatement__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__WhileStatement__Group__2


    // $ANTLR start rule__WhileStatement__Group__2__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2496:1: rule__WhileStatement__Group__2__Impl : ( ( rule__WhileStatement__ConditionAssignment_2 ) ) ;
    public final void rule__WhileStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2500:1: ( ( ( rule__WhileStatement__ConditionAssignment_2 ) ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2501:1: ( ( rule__WhileStatement__ConditionAssignment_2 ) )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2501:1: ( ( rule__WhileStatement__ConditionAssignment_2 ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2502:1: ( rule__WhileStatement__ConditionAssignment_2 )
            {
             before(grammarAccess.getWhileStatementAccess().getConditionAssignment_2()); 
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2503:1: ( rule__WhileStatement__ConditionAssignment_2 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2503:2: rule__WhileStatement__ConditionAssignment_2
            {
            pushFollow(FOLLOW_rule__WhileStatement__ConditionAssignment_2_in_rule__WhileStatement__Group__2__Impl5032);
            rule__WhileStatement__ConditionAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getWhileStatementAccess().getConditionAssignment_2()); 

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
    // $ANTLR end rule__WhileStatement__Group__2__Impl


    // $ANTLR start rule__WhileStatement__Group__3
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2513:1: rule__WhileStatement__Group__3 : rule__WhileStatement__Group__3__Impl rule__WhileStatement__Group__4 ;
    public final void rule__WhileStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2517:1: ( rule__WhileStatement__Group__3__Impl rule__WhileStatement__Group__4 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2518:2: rule__WhileStatement__Group__3__Impl rule__WhileStatement__Group__4
            {
            pushFollow(FOLLOW_rule__WhileStatement__Group__3__Impl_in_rule__WhileStatement__Group__35062);
            rule__WhileStatement__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__WhileStatement__Group__4_in_rule__WhileStatement__Group__35065);
            rule__WhileStatement__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__WhileStatement__Group__3


    // $ANTLR start rule__WhileStatement__Group__3__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2525:1: rule__WhileStatement__Group__3__Impl : ( ')' ) ;
    public final void rule__WhileStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2529:1: ( ( ')' ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2530:1: ( ')' )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2530:1: ( ')' )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2531:1: ')'
            {
             before(grammarAccess.getWhileStatementAccess().getRightParenthesisKeyword_3()); 
            match(input,40,FOLLOW_40_in_rule__WhileStatement__Group__3__Impl5093); 
             after(grammarAccess.getWhileStatementAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end rule__WhileStatement__Group__3__Impl


    // $ANTLR start rule__WhileStatement__Group__4
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2544:1: rule__WhileStatement__Group__4 : rule__WhileStatement__Group__4__Impl rule__WhileStatement__Group__5 ;
    public final void rule__WhileStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2548:1: ( rule__WhileStatement__Group__4__Impl rule__WhileStatement__Group__5 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2549:2: rule__WhileStatement__Group__4__Impl rule__WhileStatement__Group__5
            {
            pushFollow(FOLLOW_rule__WhileStatement__Group__4__Impl_in_rule__WhileStatement__Group__45124);
            rule__WhileStatement__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__WhileStatement__Group__5_in_rule__WhileStatement__Group__45127);
            rule__WhileStatement__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__WhileStatement__Group__4


    // $ANTLR start rule__WhileStatement__Group__4__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2556:1: rule__WhileStatement__Group__4__Impl : ( '{' ) ;
    public final void rule__WhileStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2560:1: ( ( '{' ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2561:1: ( '{' )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2561:1: ( '{' )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2562:1: '{'
            {
             before(grammarAccess.getWhileStatementAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,41,FOLLOW_41_in_rule__WhileStatement__Group__4__Impl5155); 
             after(grammarAccess.getWhileStatementAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end rule__WhileStatement__Group__4__Impl


    // $ANTLR start rule__WhileStatement__Group__5
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2575:1: rule__WhileStatement__Group__5 : rule__WhileStatement__Group__5__Impl rule__WhileStatement__Group__6 ;
    public final void rule__WhileStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2579:1: ( rule__WhileStatement__Group__5__Impl rule__WhileStatement__Group__6 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2580:2: rule__WhileStatement__Group__5__Impl rule__WhileStatement__Group__6
            {
            pushFollow(FOLLOW_rule__WhileStatement__Group__5__Impl_in_rule__WhileStatement__Group__55186);
            rule__WhileStatement__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__WhileStatement__Group__6_in_rule__WhileStatement__Group__55189);
            rule__WhileStatement__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__WhileStatement__Group__5


    // $ANTLR start rule__WhileStatement__Group__5__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2587:1: rule__WhileStatement__Group__5__Impl : ( ( rule__WhileStatement__StatementsAssignment_5 ) ) ;
    public final void rule__WhileStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2591:1: ( ( ( rule__WhileStatement__StatementsAssignment_5 ) ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2592:1: ( ( rule__WhileStatement__StatementsAssignment_5 ) )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2592:1: ( ( rule__WhileStatement__StatementsAssignment_5 ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2593:1: ( rule__WhileStatement__StatementsAssignment_5 )
            {
             before(grammarAccess.getWhileStatementAccess().getStatementsAssignment_5()); 
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2594:1: ( rule__WhileStatement__StatementsAssignment_5 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2594:2: rule__WhileStatement__StatementsAssignment_5
            {
            pushFollow(FOLLOW_rule__WhileStatement__StatementsAssignment_5_in_rule__WhileStatement__Group__5__Impl5216);
            rule__WhileStatement__StatementsAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getWhileStatementAccess().getStatementsAssignment_5()); 

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
    // $ANTLR end rule__WhileStatement__Group__5__Impl


    // $ANTLR start rule__WhileStatement__Group__6
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2604:1: rule__WhileStatement__Group__6 : rule__WhileStatement__Group__6__Impl ;
    public final void rule__WhileStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2608:1: ( rule__WhileStatement__Group__6__Impl )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2609:2: rule__WhileStatement__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__WhileStatement__Group__6__Impl_in_rule__WhileStatement__Group__65246);
            rule__WhileStatement__Group__6__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__WhileStatement__Group__6


    // $ANTLR start rule__WhileStatement__Group__6__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2615:1: rule__WhileStatement__Group__6__Impl : ( '}' ) ;
    public final void rule__WhileStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2619:1: ( ( '}' ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2620:1: ( '}' )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2620:1: ( '}' )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2621:1: '}'
            {
             before(grammarAccess.getWhileStatementAccess().getRightCurlyBracketKeyword_6()); 
            match(input,42,FOLLOW_42_in_rule__WhileStatement__Group__6__Impl5274); 
             after(grammarAccess.getWhileStatementAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end rule__WhileStatement__Group__6__Impl


    // $ANTLR start rule__DocumentationComment__Group__0
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2648:1: rule__DocumentationComment__Group__0 : rule__DocumentationComment__Group__0__Impl rule__DocumentationComment__Group__1 ;
    public final void rule__DocumentationComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2652:1: ( rule__DocumentationComment__Group__0__Impl rule__DocumentationComment__Group__1 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2653:2: rule__DocumentationComment__Group__0__Impl rule__DocumentationComment__Group__1
            {
            pushFollow(FOLLOW_rule__DocumentationComment__Group__0__Impl_in_rule__DocumentationComment__Group__05319);
            rule__DocumentationComment__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DocumentationComment__Group__1_in_rule__DocumentationComment__Group__05322);
            rule__DocumentationComment__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DocumentationComment__Group__0


    // $ANTLR start rule__DocumentationComment__Group__0__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2660:1: rule__DocumentationComment__Group__0__Impl : ( '@(' ) ;
    public final void rule__DocumentationComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2664:1: ( ( '@(' ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2665:1: ( '@(' )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2665:1: ( '@(' )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2666:1: '@('
            {
             before(grammarAccess.getDocumentationCommentAccess().getCommercialAtLeftParenthesisKeyword_0()); 
            match(input,47,FOLLOW_47_in_rule__DocumentationComment__Group__0__Impl5350); 
             after(grammarAccess.getDocumentationCommentAccess().getCommercialAtLeftParenthesisKeyword_0()); 

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
    // $ANTLR end rule__DocumentationComment__Group__0__Impl


    // $ANTLR start rule__DocumentationComment__Group__1
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2679:1: rule__DocumentationComment__Group__1 : rule__DocumentationComment__Group__1__Impl rule__DocumentationComment__Group__2 ;
    public final void rule__DocumentationComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2683:1: ( rule__DocumentationComment__Group__1__Impl rule__DocumentationComment__Group__2 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2684:2: rule__DocumentationComment__Group__1__Impl rule__DocumentationComment__Group__2
            {
            pushFollow(FOLLOW_rule__DocumentationComment__Group__1__Impl_in_rule__DocumentationComment__Group__15381);
            rule__DocumentationComment__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DocumentationComment__Group__2_in_rule__DocumentationComment__Group__15384);
            rule__DocumentationComment__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DocumentationComment__Group__1


    // $ANTLR start rule__DocumentationComment__Group__1__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2691:1: rule__DocumentationComment__Group__1__Impl : ( ( rule__DocumentationComment__TextAssignment_1 ) ) ;
    public final void rule__DocumentationComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2695:1: ( ( ( rule__DocumentationComment__TextAssignment_1 ) ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2696:1: ( ( rule__DocumentationComment__TextAssignment_1 ) )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2696:1: ( ( rule__DocumentationComment__TextAssignment_1 ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2697:1: ( rule__DocumentationComment__TextAssignment_1 )
            {
             before(grammarAccess.getDocumentationCommentAccess().getTextAssignment_1()); 
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2698:1: ( rule__DocumentationComment__TextAssignment_1 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2698:2: rule__DocumentationComment__TextAssignment_1
            {
            pushFollow(FOLLOW_rule__DocumentationComment__TextAssignment_1_in_rule__DocumentationComment__Group__1__Impl5411);
            rule__DocumentationComment__TextAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDocumentationCommentAccess().getTextAssignment_1()); 

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
    // $ANTLR end rule__DocumentationComment__Group__1__Impl


    // $ANTLR start rule__DocumentationComment__Group__2
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2708:1: rule__DocumentationComment__Group__2 : rule__DocumentationComment__Group__2__Impl ;
    public final void rule__DocumentationComment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2712:1: ( rule__DocumentationComment__Group__2__Impl )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2713:2: rule__DocumentationComment__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DocumentationComment__Group__2__Impl_in_rule__DocumentationComment__Group__25441);
            rule__DocumentationComment__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DocumentationComment__Group__2


    // $ANTLR start rule__DocumentationComment__Group__2__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2719:1: rule__DocumentationComment__Group__2__Impl : ( ')' ) ;
    public final void rule__DocumentationComment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2723:1: ( ( ')' ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2724:1: ( ')' )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2724:1: ( ')' )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2725:1: ')'
            {
             before(grammarAccess.getDocumentationCommentAccess().getRightParenthesisKeyword_2()); 
            match(input,40,FOLLOW_40_in_rule__DocumentationComment__Group__2__Impl5469); 
             after(grammarAccess.getDocumentationCommentAccess().getRightParenthesisKeyword_2()); 

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
    // $ANTLR end rule__DocumentationComment__Group__2__Impl


    // $ANTLR start rule__CommandStatement__Group__0
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2744:1: rule__CommandStatement__Group__0 : rule__CommandStatement__Group__0__Impl rule__CommandStatement__Group__1 ;
    public final void rule__CommandStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2748:1: ( rule__CommandStatement__Group__0__Impl rule__CommandStatement__Group__1 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2749:2: rule__CommandStatement__Group__0__Impl rule__CommandStatement__Group__1
            {
            pushFollow(FOLLOW_rule__CommandStatement__Group__0__Impl_in_rule__CommandStatement__Group__05506);
            rule__CommandStatement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CommandStatement__Group__1_in_rule__CommandStatement__Group__05509);
            rule__CommandStatement__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CommandStatement__Group__0


    // $ANTLR start rule__CommandStatement__Group__0__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2756:1: rule__CommandStatement__Group__0__Impl : ( ( rule__CommandStatement__KindAssignment_0 ) ) ;
    public final void rule__CommandStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2760:1: ( ( ( rule__CommandStatement__KindAssignment_0 ) ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2761:1: ( ( rule__CommandStatement__KindAssignment_0 ) )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2761:1: ( ( rule__CommandStatement__KindAssignment_0 ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2762:1: ( rule__CommandStatement__KindAssignment_0 )
            {
             before(grammarAccess.getCommandStatementAccess().getKindAssignment_0()); 
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2763:1: ( rule__CommandStatement__KindAssignment_0 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2763:2: rule__CommandStatement__KindAssignment_0
            {
            pushFollow(FOLLOW_rule__CommandStatement__KindAssignment_0_in_rule__CommandStatement__Group__0__Impl5536);
            rule__CommandStatement__KindAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getCommandStatementAccess().getKindAssignment_0()); 

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
    // $ANTLR end rule__CommandStatement__Group__0__Impl


    // $ANTLR start rule__CommandStatement__Group__1
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2773:1: rule__CommandStatement__Group__1 : rule__CommandStatement__Group__1__Impl ;
    public final void rule__CommandStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2777:1: ( rule__CommandStatement__Group__1__Impl )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2778:2: rule__CommandStatement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CommandStatement__Group__1__Impl_in_rule__CommandStatement__Group__15566);
            rule__CommandStatement__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CommandStatement__Group__1


    // $ANTLR start rule__CommandStatement__Group__1__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2784:1: rule__CommandStatement__Group__1__Impl : ( ';' ) ;
    public final void rule__CommandStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2788:1: ( ( ';' ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2789:1: ( ';' )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2789:1: ( ';' )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2790:1: ';'
            {
             before(grammarAccess.getCommandStatementAccess().getSemicolonKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__CommandStatement__Group__1__Impl5594); 
             after(grammarAccess.getCommandStatementAccess().getSemicolonKeyword_1()); 

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
    // $ANTLR end rule__CommandStatement__Group__1__Impl


    // $ANTLR start rule__ConditionExpr__Group__0
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2807:1: rule__ConditionExpr__Group__0 : rule__ConditionExpr__Group__0__Impl rule__ConditionExpr__Group__1 ;
    public final void rule__ConditionExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2811:1: ( rule__ConditionExpr__Group__0__Impl rule__ConditionExpr__Group__1 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2812:2: rule__ConditionExpr__Group__0__Impl rule__ConditionExpr__Group__1
            {
            pushFollow(FOLLOW_rule__ConditionExpr__Group__0__Impl_in_rule__ConditionExpr__Group__05629);
            rule__ConditionExpr__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ConditionExpr__Group__1_in_rule__ConditionExpr__Group__05632);
            rule__ConditionExpr__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ConditionExpr__Group__0


    // $ANTLR start rule__ConditionExpr__Group__0__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2819:1: rule__ConditionExpr__Group__0__Impl : ( ( rule__ConditionExpr__NegationAssignment_0 ) ) ;
    public final void rule__ConditionExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2823:1: ( ( ( rule__ConditionExpr__NegationAssignment_0 ) ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2824:1: ( ( rule__ConditionExpr__NegationAssignment_0 ) )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2824:1: ( ( rule__ConditionExpr__NegationAssignment_0 ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2825:1: ( rule__ConditionExpr__NegationAssignment_0 )
            {
             before(grammarAccess.getConditionExprAccess().getNegationAssignment_0()); 
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2826:1: ( rule__ConditionExpr__NegationAssignment_0 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2826:2: rule__ConditionExpr__NegationAssignment_0
            {
            pushFollow(FOLLOW_rule__ConditionExpr__NegationAssignment_0_in_rule__ConditionExpr__Group__0__Impl5659);
            rule__ConditionExpr__NegationAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getConditionExprAccess().getNegationAssignment_0()); 

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
    // $ANTLR end rule__ConditionExpr__Group__0__Impl


    // $ANTLR start rule__ConditionExpr__Group__1
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2836:1: rule__ConditionExpr__Group__1 : rule__ConditionExpr__Group__1__Impl ;
    public final void rule__ConditionExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2840:1: ( rule__ConditionExpr__Group__1__Impl )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2841:2: rule__ConditionExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ConditionExpr__Group__1__Impl_in_rule__ConditionExpr__Group__15689);
            rule__ConditionExpr__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ConditionExpr__Group__1


    // $ANTLR start rule__ConditionExpr__Group__1__Impl
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2847:1: rule__ConditionExpr__Group__1__Impl : ( ( rule__ConditionExpr__ExprAssignment_1 ) ) ;
    public final void rule__ConditionExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2851:1: ( ( ( rule__ConditionExpr__ExprAssignment_1 ) ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2852:1: ( ( rule__ConditionExpr__ExprAssignment_1 ) )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2852:1: ( ( rule__ConditionExpr__ExprAssignment_1 ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2853:1: ( rule__ConditionExpr__ExprAssignment_1 )
            {
             before(grammarAccess.getConditionExprAccess().getExprAssignment_1()); 
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2854:1: ( rule__ConditionExpr__ExprAssignment_1 )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2854:2: rule__ConditionExpr__ExprAssignment_1
            {
            pushFollow(FOLLOW_rule__ConditionExpr__ExprAssignment_1_in_rule__ConditionExpr__Group__1__Impl5716);
            rule__ConditionExpr__ExprAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getConditionExprAccess().getExprAssignment_1()); 

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
    // $ANTLR end rule__ConditionExpr__Group__1__Impl


    // $ANTLR start rule__Program__InitSectionAssignment_1
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2869:1: rule__Program__InitSectionAssignment_1 : ( ruleInitSection ) ;
    public final void rule__Program__InitSectionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2873:1: ( ( ruleInitSection ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2874:1: ( ruleInitSection )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2874:1: ( ruleInitSection )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2875:1: ruleInitSection
            {
             before(grammarAccess.getProgramAccess().getInitSectionInitSectionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleInitSection_in_rule__Program__InitSectionAssignment_15755);
            ruleInitSection();
            _fsp--;

             after(grammarAccess.getProgramAccess().getInitSectionInitSectionParserRuleCall_1_0()); 

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
    // $ANTLR end rule__Program__InitSectionAssignment_1


    // $ANTLR start rule__Program__UserDefinedCommandsAssignment_2
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2884:1: rule__Program__UserDefinedCommandsAssignment_2 : ( ruleUserDefinedCommand ) ;
    public final void rule__Program__UserDefinedCommandsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2888:1: ( ( ruleUserDefinedCommand ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2889:1: ( ruleUserDefinedCommand )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2889:1: ( ruleUserDefinedCommand )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2890:1: ruleUserDefinedCommand
            {
             before(grammarAccess.getProgramAccess().getUserDefinedCommandsUserDefinedCommandParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleUserDefinedCommand_in_rule__Program__UserDefinedCommandsAssignment_25786);
            ruleUserDefinedCommand();
            _fsp--;

             after(grammarAccess.getProgramAccess().getUserDefinedCommandsUserDefinedCommandParserRuleCall_2_0()); 

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
    // $ANTLR end rule__Program__UserDefinedCommandsAssignment_2


    // $ANTLR start rule__Program__MainAssignment_3
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2899:1: rule__Program__MainAssignment_3 : ( ruleMain ) ;
    public final void rule__Program__MainAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2903:1: ( ( ruleMain ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2904:1: ( ruleMain )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2904:1: ( ruleMain )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2905:1: ruleMain
            {
             before(grammarAccess.getProgramAccess().getMainMainParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleMain_in_rule__Program__MainAssignment_35817);
            ruleMain();
            _fsp--;

             after(grammarAccess.getProgramAccess().getMainMainParserRuleCall_3_0()); 

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
    // $ANTLR end rule__Program__MainAssignment_3


    // $ANTLR start rule__InitSection__InitCommandsAssignment_1
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2914:1: rule__InitSection__InitCommandsAssignment_1 : ( ruleInitCommand ) ;
    public final void rule__InitSection__InitCommandsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2918:1: ( ( ruleInitCommand ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2919:1: ( ruleInitCommand )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2919:1: ( ruleInitCommand )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2920:1: ruleInitCommand
            {
             before(grammarAccess.getInitSectionAccess().getInitCommandsInitCommandParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleInitCommand_in_rule__InitSection__InitCommandsAssignment_15848);
            ruleInitCommand();
            _fsp--;

             after(grammarAccess.getInitSectionAccess().getInitCommandsInitCommandParserRuleCall_1_0()); 

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
    // $ANTLR end rule__InitSection__InitCommandsAssignment_1


    // $ANTLR start rule__InitPositionCommand__XAssignment_1
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2929:1: rule__InitPositionCommand__XAssignment_1 : ( RULE_INT ) ;
    public final void rule__InitPositionCommand__XAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2933:1: ( ( RULE_INT ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2934:1: ( RULE_INT )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2934:1: ( RULE_INT )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2935:1: RULE_INT
            {
             before(grammarAccess.getInitPositionCommandAccess().getXINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__InitPositionCommand__XAssignment_15879); 
             after(grammarAccess.getInitPositionCommandAccess().getXINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end rule__InitPositionCommand__XAssignment_1


    // $ANTLR start rule__InitPositionCommand__YAssignment_3
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2944:1: rule__InitPositionCommand__YAssignment_3 : ( RULE_INT ) ;
    public final void rule__InitPositionCommand__YAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2948:1: ( ( RULE_INT ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2949:1: ( RULE_INT )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2949:1: ( RULE_INT )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2950:1: RULE_INT
            {
             before(grammarAccess.getInitPositionCommandAccess().getYINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__InitPositionCommand__YAssignment_35910); 
             after(grammarAccess.getInitPositionCommandAccess().getYINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end rule__InitPositionCommand__YAssignment_3


    // $ANTLR start rule__InitHeadingCommand__HeadingAssignment_1
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2959:1: rule__InitHeadingCommand__HeadingAssignment_1 : ( ruleHeadingKind ) ;
    public final void rule__InitHeadingCommand__HeadingAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2963:1: ( ( ruleHeadingKind ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2964:1: ( ruleHeadingKind )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2964:1: ( ruleHeadingKind )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2965:1: ruleHeadingKind
            {
             before(grammarAccess.getInitHeadingCommandAccess().getHeadingHeadingKindEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleHeadingKind_in_rule__InitHeadingCommand__HeadingAssignment_15941);
            ruleHeadingKind();
            _fsp--;

             after(grammarAccess.getInitHeadingCommandAccess().getHeadingHeadingKindEnumRuleCall_1_0()); 

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
    // $ANTLR end rule__InitHeadingCommand__HeadingAssignment_1


    // $ANTLR start rule__InitBoardSizeCommand__WidthAssignment_1
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2974:1: rule__InitBoardSizeCommand__WidthAssignment_1 : ( RULE_INT ) ;
    public final void rule__InitBoardSizeCommand__WidthAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2978:1: ( ( RULE_INT ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2979:1: ( RULE_INT )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2979:1: ( RULE_INT )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2980:1: RULE_INT
            {
             before(grammarAccess.getInitBoardSizeCommandAccess().getWidthINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__InitBoardSizeCommand__WidthAssignment_15972); 
             after(grammarAccess.getInitBoardSizeCommandAccess().getWidthINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end rule__InitBoardSizeCommand__WidthAssignment_1


    // $ANTLR start rule__InitBoardSizeCommand__HeightAssignment_3
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2989:1: rule__InitBoardSizeCommand__HeightAssignment_3 : ( RULE_INT ) ;
    public final void rule__InitBoardSizeCommand__HeightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2993:1: ( ( RULE_INT ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2994:1: ( RULE_INT )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2994:1: ( RULE_INT )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:2995:1: RULE_INT
            {
             before(grammarAccess.getInitBoardSizeCommandAccess().getHeightINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__InitBoardSizeCommand__HeightAssignment_36003); 
             after(grammarAccess.getInitBoardSizeCommandAccess().getHeightINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end rule__InitBoardSizeCommand__HeightAssignment_3


    // $ANTLR start rule__UserDefinedCommand__DocAssignment_0
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3004:1: rule__UserDefinedCommand__DocAssignment_0 : ( ruleDocumentationComment ) ;
    public final void rule__UserDefinedCommand__DocAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3008:1: ( ( ruleDocumentationComment ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3009:1: ( ruleDocumentationComment )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3009:1: ( ruleDocumentationComment )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3010:1: ruleDocumentationComment
            {
             before(grammarAccess.getUserDefinedCommandAccess().getDocDocumentationCommentParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDocumentationComment_in_rule__UserDefinedCommand__DocAssignment_06034);
            ruleDocumentationComment();
            _fsp--;

             after(grammarAccess.getUserDefinedCommandAccess().getDocDocumentationCommentParserRuleCall_0_0()); 

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
    // $ANTLR end rule__UserDefinedCommand__DocAssignment_0


    // $ANTLR start rule__UserDefinedCommand__NameAssignment_2
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3019:1: rule__UserDefinedCommand__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__UserDefinedCommand__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3023:1: ( ( RULE_STRING ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3024:1: ( RULE_STRING )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3024:1: ( RULE_STRING )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3025:1: RULE_STRING
            {
             before(grammarAccess.getUserDefinedCommandAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__UserDefinedCommand__NameAssignment_26065); 
             after(grammarAccess.getUserDefinedCommandAccess().getNameSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end rule__UserDefinedCommand__NameAssignment_2


    // $ANTLR start rule__UserDefinedCommand__StatementsAssignment_5
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3034:1: rule__UserDefinedCommand__StatementsAssignment_5 : ( ruleStatement ) ;
    public final void rule__UserDefinedCommand__StatementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3038:1: ( ( ruleStatement ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3039:1: ( ruleStatement )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3039:1: ( ruleStatement )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3040:1: ruleStatement
            {
             before(grammarAccess.getUserDefinedCommandAccess().getStatementsStatementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__UserDefinedCommand__StatementsAssignment_56096);
            ruleStatement();
            _fsp--;

             after(grammarAccess.getUserDefinedCommandAccess().getStatementsStatementParserRuleCall_5_0()); 

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
    // $ANTLR end rule__UserDefinedCommand__StatementsAssignment_5


    // $ANTLR start rule__Main__StatementsAssignment_2
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3049:1: rule__Main__StatementsAssignment_2 : ( ruleStatement ) ;
    public final void rule__Main__StatementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3053:1: ( ( ruleStatement ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3054:1: ( ruleStatement )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3054:1: ( ruleStatement )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3055:1: ruleStatement
            {
             before(grammarAccess.getMainAccess().getStatementsStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__Main__StatementsAssignment_26127);
            ruleStatement();
            _fsp--;

             after(grammarAccess.getMainAccess().getStatementsStatementParserRuleCall_2_0()); 

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
    // $ANTLR end rule__Main__StatementsAssignment_2


    // $ANTLR start rule__UserDefinedCommandStatement__CommandAssignment_0
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3064:1: rule__UserDefinedCommandStatement__CommandAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__UserDefinedCommandStatement__CommandAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3068:1: ( ( ( RULE_ID ) ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3069:1: ( ( RULE_ID ) )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3069:1: ( ( RULE_ID ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3070:1: ( RULE_ID )
            {
             before(grammarAccess.getUserDefinedCommandStatementAccess().getCommandUserDefinedCommandCrossReference_0_0()); 
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3071:1: ( RULE_ID )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3072:1: RULE_ID
            {
             before(grammarAccess.getUserDefinedCommandStatementAccess().getCommandUserDefinedCommandIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UserDefinedCommandStatement__CommandAssignment_06162); 
             after(grammarAccess.getUserDefinedCommandStatementAccess().getCommandUserDefinedCommandIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getUserDefinedCommandStatementAccess().getCommandUserDefinedCommandCrossReference_0_0()); 

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
    // $ANTLR end rule__UserDefinedCommandStatement__CommandAssignment_0


    // $ANTLR start rule__IfStatement__ConditionAssignment_2
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3083:1: rule__IfStatement__ConditionAssignment_2 : ( ruleConditionExpr ) ;
    public final void rule__IfStatement__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3087:1: ( ( ruleConditionExpr ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3088:1: ( ruleConditionExpr )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3088:1: ( ruleConditionExpr )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3089:1: ruleConditionExpr
            {
             before(grammarAccess.getIfStatementAccess().getConditionConditionExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleConditionExpr_in_rule__IfStatement__ConditionAssignment_26197);
            ruleConditionExpr();
            _fsp--;

             after(grammarAccess.getIfStatementAccess().getConditionConditionExprParserRuleCall_2_0()); 

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
    // $ANTLR end rule__IfStatement__ConditionAssignment_2


    // $ANTLR start rule__IfStatement__StatementsAssignment_5
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3098:1: rule__IfStatement__StatementsAssignment_5 : ( ruleStatement ) ;
    public final void rule__IfStatement__StatementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3102:1: ( ( ruleStatement ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3103:1: ( ruleStatement )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3103:1: ( ruleStatement )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3104:1: ruleStatement
            {
             before(grammarAccess.getIfStatementAccess().getStatementsStatementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__IfStatement__StatementsAssignment_56228);
            ruleStatement();
            _fsp--;

             after(grammarAccess.getIfStatementAccess().getStatementsStatementParserRuleCall_5_0()); 

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
    // $ANTLR end rule__IfStatement__StatementsAssignment_5


    // $ANTLR start rule__IfStatement__ElseStatementsAssignment_7_2
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3113:1: rule__IfStatement__ElseStatementsAssignment_7_2 : ( ruleStatement ) ;
    public final void rule__IfStatement__ElseStatementsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3117:1: ( ( ruleStatement ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3118:1: ( ruleStatement )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3118:1: ( ruleStatement )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3119:1: ruleStatement
            {
             before(grammarAccess.getIfStatementAccess().getElseStatementsStatementParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__IfStatement__ElseStatementsAssignment_7_26259);
            ruleStatement();
            _fsp--;

             after(grammarAccess.getIfStatementAccess().getElseStatementsStatementParserRuleCall_7_2_0()); 

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
    // $ANTLR end rule__IfStatement__ElseStatementsAssignment_7_2


    // $ANTLR start rule__IterateStatement__TimesAssignment_1
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3128:1: rule__IterateStatement__TimesAssignment_1 : ( RULE_INT ) ;
    public final void rule__IterateStatement__TimesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3132:1: ( ( RULE_INT ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3133:1: ( RULE_INT )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3133:1: ( RULE_INT )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3134:1: RULE_INT
            {
             before(grammarAccess.getIterateStatementAccess().getTimesINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IterateStatement__TimesAssignment_16290); 
             after(grammarAccess.getIterateStatementAccess().getTimesINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end rule__IterateStatement__TimesAssignment_1


    // $ANTLR start rule__IterateStatement__StatementsAssignment_4
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3143:1: rule__IterateStatement__StatementsAssignment_4 : ( ruleStatement ) ;
    public final void rule__IterateStatement__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3147:1: ( ( ruleStatement ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3148:1: ( ruleStatement )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3148:1: ( ruleStatement )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3149:1: ruleStatement
            {
             before(grammarAccess.getIterateStatementAccess().getStatementsStatementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__IterateStatement__StatementsAssignment_46321);
            ruleStatement();
            _fsp--;

             after(grammarAccess.getIterateStatementAccess().getStatementsStatementParserRuleCall_4_0()); 

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
    // $ANTLR end rule__IterateStatement__StatementsAssignment_4


    // $ANTLR start rule__WhileStatement__ConditionAssignment_2
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3158:1: rule__WhileStatement__ConditionAssignment_2 : ( ruleConditionExpr ) ;
    public final void rule__WhileStatement__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3162:1: ( ( ruleConditionExpr ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3163:1: ( ruleConditionExpr )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3163:1: ( ruleConditionExpr )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3164:1: ruleConditionExpr
            {
             before(grammarAccess.getWhileStatementAccess().getConditionConditionExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleConditionExpr_in_rule__WhileStatement__ConditionAssignment_26352);
            ruleConditionExpr();
            _fsp--;

             after(grammarAccess.getWhileStatementAccess().getConditionConditionExprParserRuleCall_2_0()); 

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
    // $ANTLR end rule__WhileStatement__ConditionAssignment_2


    // $ANTLR start rule__WhileStatement__StatementsAssignment_5
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3173:1: rule__WhileStatement__StatementsAssignment_5 : ( ruleStatement ) ;
    public final void rule__WhileStatement__StatementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3177:1: ( ( ruleStatement ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3178:1: ( ruleStatement )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3178:1: ( ruleStatement )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3179:1: ruleStatement
            {
             before(grammarAccess.getWhileStatementAccess().getStatementsStatementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__WhileStatement__StatementsAssignment_56383);
            ruleStatement();
            _fsp--;

             after(grammarAccess.getWhileStatementAccess().getStatementsStatementParserRuleCall_5_0()); 

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
    // $ANTLR end rule__WhileStatement__StatementsAssignment_5


    // $ANTLR start rule__DocumentationComment__TextAssignment_1
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3188:1: rule__DocumentationComment__TextAssignment_1 : ( RULE_STRING ) ;
    public final void rule__DocumentationComment__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3192:1: ( ( RULE_STRING ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3193:1: ( RULE_STRING )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3193:1: ( RULE_STRING )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3194:1: RULE_STRING
            {
             before(grammarAccess.getDocumentationCommentAccess().getTextSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DocumentationComment__TextAssignment_16414); 
             after(grammarAccess.getDocumentationCommentAccess().getTextSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end rule__DocumentationComment__TextAssignment_1


    // $ANTLR start rule__CommandStatement__KindAssignment_0
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3203:1: rule__CommandStatement__KindAssignment_0 : ( ruleCommandKind ) ;
    public final void rule__CommandStatement__KindAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3207:1: ( ( ruleCommandKind ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3208:1: ( ruleCommandKind )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3208:1: ( ruleCommandKind )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3209:1: ruleCommandKind
            {
             before(grammarAccess.getCommandStatementAccess().getKindCommandKindEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleCommandKind_in_rule__CommandStatement__KindAssignment_06445);
            ruleCommandKind();
            _fsp--;

             after(grammarAccess.getCommandStatementAccess().getKindCommandKindEnumRuleCall_0_0()); 

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
    // $ANTLR end rule__CommandStatement__KindAssignment_0


    // $ANTLR start rule__ConditionExpr__NegationAssignment_0
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3218:1: rule__ConditionExpr__NegationAssignment_0 : ( ( '!' ) ) ;
    public final void rule__ConditionExpr__NegationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3222:1: ( ( ( '!' ) ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3223:1: ( ( '!' ) )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3223:1: ( ( '!' ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3224:1: ( '!' )
            {
             before(grammarAccess.getConditionExprAccess().getNegationExclamationMarkKeyword_0_0()); 
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3225:1: ( '!' )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3226:1: '!'
            {
             before(grammarAccess.getConditionExprAccess().getNegationExclamationMarkKeyword_0_0()); 
            match(input,48,FOLLOW_48_in_rule__ConditionExpr__NegationAssignment_06481); 
             after(grammarAccess.getConditionExprAccess().getNegationExclamationMarkKeyword_0_0()); 

            }

             after(grammarAccess.getConditionExprAccess().getNegationExclamationMarkKeyword_0_0()); 

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
    // $ANTLR end rule__ConditionExpr__NegationAssignment_0


    // $ANTLR start rule__ConditionExpr__ExprAssignment_1
    // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3241:1: rule__ConditionExpr__ExprAssignment_1 : ( ruleConditionKind ) ;
    public final void rule__ConditionExpr__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3245:1: ( ( ruleConditionKind ) )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3246:1: ( ruleConditionKind )
            {
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3246:1: ( ruleConditionKind )
            // ../org.mcj.karel.ui/src-gen/org/mcj/karel/ui/contentassist/antlr/internal/InternalKarel.g:3247:1: ruleConditionKind
            {
             before(grammarAccess.getConditionExprAccess().getExprConditionKindEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConditionKind_in_rule__ConditionExpr__ExprAssignment_16520);
            ruleConditionKind();
            _fsp--;

             after(grammarAccess.getConditionExprAccess().getExprConditionKindEnumRuleCall_1_0()); 

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
    // $ANTLR end rule__ConditionExpr__ExprAssignment_1


 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__0_in_ruleProgram94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitSection_in_entryRuleInitSection121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitSection128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitSection__Group__0_in_ruleInitSection154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitCommand_in_entryRuleInitCommand181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitCommand188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitCommand__Alternatives_in_ruleInitCommand214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitPositionCommand_in_entryRuleInitPositionCommand241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitPositionCommand248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitPositionCommand__Group__0_in_ruleInitPositionCommand274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitHeadingCommand_in_entryRuleInitHeadingCommand301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitHeadingCommand308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitHeadingCommand__Group__0_in_ruleInitHeadingCommand334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitBoardSizeCommand_in_entryRuleInitBoardSizeCommand361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitBoardSizeCommand368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitBoardSizeCommand__Group__0_in_ruleInitBoardSizeCommand394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserDefinedCommand_in_entryRuleUserDefinedCommand421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserDefinedCommand428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDefinedCommand__Group__0_in_ruleUserDefinedCommand454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMain_in_entryRuleMain481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMain488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Main__Group__0_in_ruleMain514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Alternatives_in_ruleStatement574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserDefinedCommandStatement_in_entryRuleUserDefinedCommandStatement601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserDefinedCommandStatement608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDefinedCommandStatement__Group__0_in_ruleUserDefinedCommandStatement634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfStatement_in_entryRuleIfStatement661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfStatement668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group__0_in_ruleIfStatement694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIterateStatement_in_entryRuleIterateStatement721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIterateStatement728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterateStatement__Group__0_in_ruleIterateStatement754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhileStatement_in_entryRuleWhileStatement781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhileStatement788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhileStatement__Group__0_in_ruleWhileStatement814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocumentationComment_in_entryRuleDocumentationComment841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocumentationComment848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DocumentationComment__Group__0_in_ruleDocumentationComment874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandStatement_in_entryRuleCommandStatement901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommandStatement908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandStatement__Group__0_in_ruleCommandStatement934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionExpr_in_entryRuleConditionExpr961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionExpr968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionExpr__Group__0_in_ruleConditionExpr994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HeadingKind__Alternatives_in_ruleHeadingKind1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandKind__Alternatives_in_ruleCommandKind1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionKind__Alternatives_in_ruleConditionKind1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitPositionCommand_in_rule__InitCommand__Alternatives1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitHeadingCommand_in_rule__InitCommand__Alternatives1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitBoardSizeCommand_in_rule__InitCommand__Alternatives1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfStatement_in_rule__Statement__Alternatives1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIterateStatement_in_rule__Statement__Alternatives1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhileStatement_in_rule__Statement__Alternatives1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandStatement_in_rule__Statement__Alternatives1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserDefinedCommandStatement_in_rule__Statement__Alternatives1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__HeadingKind__Alternatives1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__HeadingKind__Alternatives1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__HeadingKind__Alternatives1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__HeadingKind__Alternatives1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__CommandKind__Alternatives1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__CommandKind__Alternatives1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__CommandKind__Alternatives1446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__CommandKind__Alternatives1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__CommandKind__Alternatives1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__CommandKind__Alternatives1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ConditionKind__Alternatives1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ConditionKind__Alternatives1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__01599 = new BitSet(new long[]{0x0000801102000000L});
    public static final BitSet FOLLOW_rule__Program__Group__1_in_rule__Program__Group__01602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Program__Group__0__Impl1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__11661 = new BitSet(new long[]{0x0000801100000000L});
    public static final BitSet FOLLOW_rule__Program__Group__2_in_rule__Program__Group__11664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__InitSectionAssignment_1_in_rule__Program__Group__1__Impl1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__2__Impl_in_rule__Program__Group__21722 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Program__Group__3_in_rule__Program__Group__21725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__UserDefinedCommandsAssignment_2_in_rule__Program__Group__2__Impl1752 = new BitSet(new long[]{0x0000800100000002L});
    public static final BitSet FOLLOW_rule__Program__Group__3__Impl_in_rule__Program__Group__31783 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Program__Group__4_in_rule__Program__Group__31786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__MainAssignment_3_in_rule__Program__Group__3__Impl1813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__4__Impl_in_rule__Program__Group__41843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Program__Group__4__Impl1871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitSection__Group__0__Impl_in_rule__InitSection__Group__01912 = new BitSet(new long[]{0x00000000C8000000L});
    public static final BitSet FOLLOW_rule__InitSection__Group__1_in_rule__InitSection__Group__01915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__InitSection__Group__0__Impl1943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitSection__Group__1__Impl_in_rule__InitSection__Group__11974 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__InitSection__Group__2_in_rule__InitSection__Group__11977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitSection__InitCommandsAssignment_1_in_rule__InitSection__Group__1__Impl2006 = new BitSet(new long[]{0x00000000C8000002L});
    public static final BitSet FOLLOW_rule__InitSection__InitCommandsAssignment_1_in_rule__InitSection__Group__1__Impl2018 = new BitSet(new long[]{0x00000000C8000002L});
    public static final BitSet FOLLOW_rule__InitSection__Group__2__Impl_in_rule__InitSection__Group__22051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__InitSection__Group__2__Impl2079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitPositionCommand__Group__0__Impl_in_rule__InitPositionCommand__Group__02116 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InitPositionCommand__Group__1_in_rule__InitPositionCommand__Group__02119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__InitPositionCommand__Group__0__Impl2147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitPositionCommand__Group__1__Impl_in_rule__InitPositionCommand__Group__12178 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__InitPositionCommand__Group__2_in_rule__InitPositionCommand__Group__12181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitPositionCommand__XAssignment_1_in_rule__InitPositionCommand__Group__1__Impl2208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitPositionCommand__Group__2__Impl_in_rule__InitPositionCommand__Group__22238 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InitPositionCommand__Group__3_in_rule__InitPositionCommand__Group__22241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__InitPositionCommand__Group__2__Impl2269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitPositionCommand__Group__3__Impl_in_rule__InitPositionCommand__Group__32300 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__InitPositionCommand__Group__4_in_rule__InitPositionCommand__Group__32303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitPositionCommand__YAssignment_3_in_rule__InitPositionCommand__Group__3__Impl2330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitPositionCommand__Group__4__Impl_in_rule__InitPositionCommand__Group__42360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__InitPositionCommand__Group__4__Impl2388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitHeadingCommand__Group__0__Impl_in_rule__InitHeadingCommand__Group__02429 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__InitHeadingCommand__Group__1_in_rule__InitHeadingCommand__Group__02432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__InitHeadingCommand__Group__0__Impl2460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitHeadingCommand__Group__1__Impl_in_rule__InitHeadingCommand__Group__12491 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__InitHeadingCommand__Group__2_in_rule__InitHeadingCommand__Group__12494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitHeadingCommand__HeadingAssignment_1_in_rule__InitHeadingCommand__Group__1__Impl2521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitHeadingCommand__Group__2__Impl_in_rule__InitHeadingCommand__Group__22551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__InitHeadingCommand__Group__2__Impl2579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitBoardSizeCommand__Group__0__Impl_in_rule__InitBoardSizeCommand__Group__02616 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InitBoardSizeCommand__Group__1_in_rule__InitBoardSizeCommand__Group__02619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__InitBoardSizeCommand__Group__0__Impl2647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitBoardSizeCommand__Group__1__Impl_in_rule__InitBoardSizeCommand__Group__12678 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__InitBoardSizeCommand__Group__2_in_rule__InitBoardSizeCommand__Group__12681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitBoardSizeCommand__WidthAssignment_1_in_rule__InitBoardSizeCommand__Group__1__Impl2708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitBoardSizeCommand__Group__2__Impl_in_rule__InitBoardSizeCommand__Group__22738 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InitBoardSizeCommand__Group__3_in_rule__InitBoardSizeCommand__Group__22741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__InitBoardSizeCommand__Group__2__Impl2769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitBoardSizeCommand__Group__3__Impl_in_rule__InitBoardSizeCommand__Group__32800 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__InitBoardSizeCommand__Group__4_in_rule__InitBoardSizeCommand__Group__32803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitBoardSizeCommand__HeightAssignment_3_in_rule__InitBoardSizeCommand__Group__3__Impl2830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitBoardSizeCommand__Group__4__Impl_in_rule__InitBoardSizeCommand__Group__42860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__InitBoardSizeCommand__Group__4__Impl2888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDefinedCommand__Group__0__Impl_in_rule__UserDefinedCommand__Group__02929 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__UserDefinedCommand__Group__1_in_rule__UserDefinedCommand__Group__02932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDefinedCommand__DocAssignment_0_in_rule__UserDefinedCommand__Group__0__Impl2959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDefinedCommand__Group__1__Impl_in_rule__UserDefinedCommand__Group__12990 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__UserDefinedCommand__Group__2_in_rule__UserDefinedCommand__Group__12993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__UserDefinedCommand__Group__1__Impl3021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDefinedCommand__Group__2__Impl_in_rule__UserDefinedCommand__Group__23052 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__UserDefinedCommand__Group__3_in_rule__UserDefinedCommand__Group__23055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDefinedCommand__NameAssignment_2_in_rule__UserDefinedCommand__Group__2__Impl3082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDefinedCommand__Group__3__Impl_in_rule__UserDefinedCommand__Group__33112 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__UserDefinedCommand__Group__4_in_rule__UserDefinedCommand__Group__33115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__UserDefinedCommand__Group__3__Impl3143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDefinedCommand__Group__4__Impl_in_rule__UserDefinedCommand__Group__43174 = new BitSet(new long[]{0x00005048001F8040L});
    public static final BitSet FOLLOW_rule__UserDefinedCommand__Group__5_in_rule__UserDefinedCommand__Group__43177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__UserDefinedCommand__Group__4__Impl3205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDefinedCommand__Group__5__Impl_in_rule__UserDefinedCommand__Group__53236 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__UserDefinedCommand__Group__6_in_rule__UserDefinedCommand__Group__53239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDefinedCommand__StatementsAssignment_5_in_rule__UserDefinedCommand__Group__5__Impl3266 = new BitSet(new long[]{0x00005040001F8042L});
    public static final BitSet FOLLOW_rule__UserDefinedCommand__Group__6__Impl_in_rule__UserDefinedCommand__Group__63297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__UserDefinedCommand__Group__6__Impl3325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Main__Group__0__Impl_in_rule__Main__Group__03370 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Main__Group__1_in_rule__Main__Group__03373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Main__Group__1__Impl_in_rule__Main__Group__13431 = new BitSet(new long[]{0x00005060001F8040L});
    public static final BitSet FOLLOW_rule__Main__Group__2_in_rule__Main__Group__13434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Main__Group__1__Impl3462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Main__Group__2__Impl_in_rule__Main__Group__23493 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Main__Group__3_in_rule__Main__Group__23496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Main__StatementsAssignment_2_in_rule__Main__Group__2__Impl3523 = new BitSet(new long[]{0x00005040001F8042L});
    public static final BitSet FOLLOW_rule__Main__Group__3__Impl_in_rule__Main__Group__33554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Main__Group__3__Impl3582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDefinedCommandStatement__Group__0__Impl_in_rule__UserDefinedCommandStatement__Group__03621 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__UserDefinedCommandStatement__Group__1_in_rule__UserDefinedCommandStatement__Group__03624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDefinedCommandStatement__CommandAssignment_0_in_rule__UserDefinedCommandStatement__Group__0__Impl3651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDefinedCommandStatement__Group__1__Impl_in_rule__UserDefinedCommandStatement__Group__13681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__UserDefinedCommandStatement__Group__1__Impl3709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group__0__Impl_in_rule__IfStatement__Group__03744 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__IfStatement__Group__1_in_rule__IfStatement__Group__03747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__IfStatement__Group__0__Impl3775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group__1__Impl_in_rule__IfStatement__Group__13806 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__IfStatement__Group__2_in_rule__IfStatement__Group__13809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__IfStatement__Group__1__Impl3837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group__2__Impl_in_rule__IfStatement__Group__23868 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__IfStatement__Group__3_in_rule__IfStatement__Group__23871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__ConditionAssignment_2_in_rule__IfStatement__Group__2__Impl3898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group__3__Impl_in_rule__IfStatement__Group__33928 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__IfStatement__Group__4_in_rule__IfStatement__Group__33931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__IfStatement__Group__3__Impl3959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group__4__Impl_in_rule__IfStatement__Group__43990 = new BitSet(new long[]{0x00005440001F8040L});
    public static final BitSet FOLLOW_rule__IfStatement__Group__5_in_rule__IfStatement__Group__43993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__IfStatement__Group__4__Impl4021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group__5__Impl_in_rule__IfStatement__Group__54052 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__IfStatement__Group__6_in_rule__IfStatement__Group__54055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__StatementsAssignment_5_in_rule__IfStatement__Group__5__Impl4082 = new BitSet(new long[]{0x00005040001F8042L});
    public static final BitSet FOLLOW_rule__IfStatement__Group__6__Impl_in_rule__IfStatement__Group__64113 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group__7_in_rule__IfStatement__Group__64116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__IfStatement__Group__6__Impl4144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group__7__Impl_in_rule__IfStatement__Group__74175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_7__0_in_rule__IfStatement__Group__7__Impl4202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_7__0__Impl_in_rule__IfStatement__Group_7__04249 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_7__1_in_rule__IfStatement__Group_7__04252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__IfStatement__Group_7__0__Impl4280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_7__1__Impl_in_rule__IfStatement__Group_7__14311 = new BitSet(new long[]{0x00005440001F8040L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_7__2_in_rule__IfStatement__Group_7__14314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__IfStatement__Group_7__1__Impl4342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_7__2__Impl_in_rule__IfStatement__Group_7__24373 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_7__3_in_rule__IfStatement__Group_7__24376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__ElseStatementsAssignment_7_2_in_rule__IfStatement__Group_7__2__Impl4403 = new BitSet(new long[]{0x00005040001F8042L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_7__3__Impl_in_rule__IfStatement__Group_7__34434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__IfStatement__Group_7__3__Impl4462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterateStatement__Group__0__Impl_in_rule__IterateStatement__Group__04501 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__IterateStatement__Group__1_in_rule__IterateStatement__Group__04504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__IterateStatement__Group__0__Impl4532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterateStatement__Group__1__Impl_in_rule__IterateStatement__Group__14563 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__IterateStatement__Group__2_in_rule__IterateStatement__Group__14566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterateStatement__TimesAssignment_1_in_rule__IterateStatement__Group__1__Impl4593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterateStatement__Group__2__Impl_in_rule__IterateStatement__Group__24623 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__IterateStatement__Group__3_in_rule__IterateStatement__Group__24626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__IterateStatement__Group__2__Impl4654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterateStatement__Group__3__Impl_in_rule__IterateStatement__Group__34685 = new BitSet(new long[]{0x00005040001F8040L});
    public static final BitSet FOLLOW_rule__IterateStatement__Group__4_in_rule__IterateStatement__Group__34688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__IterateStatement__Group__3__Impl4716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterateStatement__Group__4__Impl_in_rule__IterateStatement__Group__44747 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__IterateStatement__Group__5_in_rule__IterateStatement__Group__44750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterateStatement__StatementsAssignment_4_in_rule__IterateStatement__Group__4__Impl4777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterateStatement__Group__5__Impl_in_rule__IterateStatement__Group__54807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__IterateStatement__Group__5__Impl4835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhileStatement__Group__0__Impl_in_rule__WhileStatement__Group__04878 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__WhileStatement__Group__1_in_rule__WhileStatement__Group__04881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__WhileStatement__Group__0__Impl4909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhileStatement__Group__1__Impl_in_rule__WhileStatement__Group__14940 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__WhileStatement__Group__2_in_rule__WhileStatement__Group__14943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__WhileStatement__Group__1__Impl4971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhileStatement__Group__2__Impl_in_rule__WhileStatement__Group__25002 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__WhileStatement__Group__3_in_rule__WhileStatement__Group__25005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhileStatement__ConditionAssignment_2_in_rule__WhileStatement__Group__2__Impl5032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhileStatement__Group__3__Impl_in_rule__WhileStatement__Group__35062 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__WhileStatement__Group__4_in_rule__WhileStatement__Group__35065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__WhileStatement__Group__3__Impl5093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhileStatement__Group__4__Impl_in_rule__WhileStatement__Group__45124 = new BitSet(new long[]{0x00005040001F8040L});
    public static final BitSet FOLLOW_rule__WhileStatement__Group__5_in_rule__WhileStatement__Group__45127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__WhileStatement__Group__4__Impl5155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhileStatement__Group__5__Impl_in_rule__WhileStatement__Group__55186 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__WhileStatement__Group__6_in_rule__WhileStatement__Group__55189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhileStatement__StatementsAssignment_5_in_rule__WhileStatement__Group__5__Impl5216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhileStatement__Group__6__Impl_in_rule__WhileStatement__Group__65246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__WhileStatement__Group__6__Impl5274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DocumentationComment__Group__0__Impl_in_rule__DocumentationComment__Group__05319 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DocumentationComment__Group__1_in_rule__DocumentationComment__Group__05322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__DocumentationComment__Group__0__Impl5350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DocumentationComment__Group__1__Impl_in_rule__DocumentationComment__Group__15381 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__DocumentationComment__Group__2_in_rule__DocumentationComment__Group__15384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DocumentationComment__TextAssignment_1_in_rule__DocumentationComment__Group__1__Impl5411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DocumentationComment__Group__2__Impl_in_rule__DocumentationComment__Group__25441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__DocumentationComment__Group__2__Impl5469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandStatement__Group__0__Impl_in_rule__CommandStatement__Group__05506 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__CommandStatement__Group__1_in_rule__CommandStatement__Group__05509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandStatement__KindAssignment_0_in_rule__CommandStatement__Group__0__Impl5536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandStatement__Group__1__Impl_in_rule__CommandStatement__Group__15566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__CommandStatement__Group__1__Impl5594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionExpr__Group__0__Impl_in_rule__ConditionExpr__Group__05629 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__ConditionExpr__Group__1_in_rule__ConditionExpr__Group__05632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionExpr__NegationAssignment_0_in_rule__ConditionExpr__Group__0__Impl5659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionExpr__Group__1__Impl_in_rule__ConditionExpr__Group__15689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionExpr__ExprAssignment_1_in_rule__ConditionExpr__Group__1__Impl5716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitSection_in_rule__Program__InitSectionAssignment_15755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserDefinedCommand_in_rule__Program__UserDefinedCommandsAssignment_25786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMain_in_rule__Program__MainAssignment_35817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitCommand_in_rule__InitSection__InitCommandsAssignment_15848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__InitPositionCommand__XAssignment_15879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__InitPositionCommand__YAssignment_35910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeadingKind_in_rule__InitHeadingCommand__HeadingAssignment_15941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__InitBoardSizeCommand__WidthAssignment_15972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__InitBoardSizeCommand__HeightAssignment_36003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocumentationComment_in_rule__UserDefinedCommand__DocAssignment_06034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__UserDefinedCommand__NameAssignment_26065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__UserDefinedCommand__StatementsAssignment_56096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Main__StatementsAssignment_26127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UserDefinedCommandStatement__CommandAssignment_06162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionExpr_in_rule__IfStatement__ConditionAssignment_26197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__IfStatement__StatementsAssignment_56228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__IfStatement__ElseStatementsAssignment_7_26259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IterateStatement__TimesAssignment_16290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__IterateStatement__StatementsAssignment_46321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionExpr_in_rule__WhileStatement__ConditionAssignment_26352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__WhileStatement__StatementsAssignment_56383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DocumentationComment__TextAssignment_16414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandKind_in_rule__CommandStatement__KindAssignment_06445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__ConditionExpr__NegationAssignment_06481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionKind_in_rule__ConditionExpr__ExprAssignment_16520 = new BitSet(new long[]{0x0000000000000002L});

}