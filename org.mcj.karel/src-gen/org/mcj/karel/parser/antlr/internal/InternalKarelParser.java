package org.mcj.karel.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.mcj.karel.services.KarelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKarelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'BEGIN-PROGRAM'", "'END-PROGRAM'", "'BEGIN-INIT'", "'END-INIT'", "'position'", "','", "';'", "'heading'", "'boardSize'", "'DEFINE COMMAND'", "'AS'", "'BEGIN'", "'END'", "'BEGIN-MAIN'", "'END-MAIN'", "'IF'", "'('", "')'", "'{'", "'}'", "'ELSE'", "'ITERATE'", "'TIMES'", "'WHILE'", "'@('", "'!'", "'NORTH'", "'SOUTH'", "'WEST'", "'EAST'", "'move'", "'turn'", "'turnOn'", "'turnOff'", "'put'", "'get'", "'WALL_AHEAD'", "'MARKED_PLACE'"
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
    public String getGrammarFileName() { return "../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g"; }



     	private KarelGrammarAccess grammarAccess;
     	
        public InternalKarelParser(TokenStream input, IAstFactory factory, KarelGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/mcj/karel/parser/antlr/internal/InternalKarel.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Program";	
       	}
       	
       	@Override
       	protected KarelGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleProgram
    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:78:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:79:2: (iv_ruleProgram= ruleProgram EOF )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:80:2: iv_ruleProgram= ruleProgram EOF
            {
             currentNode = createCompositeNode(grammarAccess.getProgramRule(), currentNode); 
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram75);
            iv_ruleProgram=ruleProgram();
            _fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram85); 

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
    // $ANTLR end entryRuleProgram


    // $ANTLR start ruleProgram
    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:87:1: ruleProgram returns [EObject current=null] : ( 'BEGIN-PROGRAM' ( (lv_initSection_1_0= ruleInitSection ) )? ( (lv_userDefinedCommands_2_0= ruleUserDefinedCommand ) )* ( (lv_main_3_0= ruleMain ) ) 'END-PROGRAM' ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_initSection_1_0 = null;

        EObject lv_userDefinedCommands_2_0 = null;

        EObject lv_main_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:92:6: ( ( 'BEGIN-PROGRAM' ( (lv_initSection_1_0= ruleInitSection ) )? ( (lv_userDefinedCommands_2_0= ruleUserDefinedCommand ) )* ( (lv_main_3_0= ruleMain ) ) 'END-PROGRAM' ) )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:93:1: ( 'BEGIN-PROGRAM' ( (lv_initSection_1_0= ruleInitSection ) )? ( (lv_userDefinedCommands_2_0= ruleUserDefinedCommand ) )* ( (lv_main_3_0= ruleMain ) ) 'END-PROGRAM' )
            {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:93:1: ( 'BEGIN-PROGRAM' ( (lv_initSection_1_0= ruleInitSection ) )? ( (lv_userDefinedCommands_2_0= ruleUserDefinedCommand ) )* ( (lv_main_3_0= ruleMain ) ) 'END-PROGRAM' )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:93:3: 'BEGIN-PROGRAM' ( (lv_initSection_1_0= ruleInitSection ) )? ( (lv_userDefinedCommands_2_0= ruleUserDefinedCommand ) )* ( (lv_main_3_0= ruleMain ) ) 'END-PROGRAM'
            {
            match(input,11,FOLLOW_11_in_ruleProgram120); 

                    createLeafNode(grammarAccess.getProgramAccess().getBEGINPROGRAMKeyword_0(), null); 
                
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:97:1: ( (lv_initSection_1_0= ruleInitSection ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:98:1: (lv_initSection_1_0= ruleInitSection )
                    {
                    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:98:1: (lv_initSection_1_0= ruleInitSection )
                    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:99:3: lv_initSection_1_0= ruleInitSection
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getProgramAccess().getInitSectionInitSectionParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleInitSection_in_ruleProgram141);
                    lv_initSection_1_0=ruleInitSection();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getProgramRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"initSection",
                    	        		lv_initSection_1_0, 
                    	        		"InitSection", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:121:3: ( (lv_userDefinedCommands_2_0= ruleUserDefinedCommand ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20||LA2_0==35) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:122:1: (lv_userDefinedCommands_2_0= ruleUserDefinedCommand )
            	    {
            	    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:122:1: (lv_userDefinedCommands_2_0= ruleUserDefinedCommand )
            	    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:123:3: lv_userDefinedCommands_2_0= ruleUserDefinedCommand
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getProgramAccess().getUserDefinedCommandsUserDefinedCommandParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleUserDefinedCommand_in_ruleProgram163);
            	    lv_userDefinedCommands_2_0=ruleUserDefinedCommand();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getProgramRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"userDefinedCommands",
            	    	        		lv_userDefinedCommands_2_0, 
            	    	        		"UserDefinedCommand", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:145:3: ( (lv_main_3_0= ruleMain ) )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:146:1: (lv_main_3_0= ruleMain )
            {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:146:1: (lv_main_3_0= ruleMain )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:147:3: lv_main_3_0= ruleMain
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getProgramAccess().getMainMainParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleMain_in_ruleProgram185);
            lv_main_3_0=ruleMain();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getProgramRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"main",
            	        		lv_main_3_0, 
            	        		"Main", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,12,FOLLOW_12_in_ruleProgram195); 

                    createLeafNode(grammarAccess.getProgramAccess().getENDPROGRAMKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleProgram


    // $ANTLR start entryRuleInitSection
    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:181:1: entryRuleInitSection returns [EObject current=null] : iv_ruleInitSection= ruleInitSection EOF ;
    public final EObject entryRuleInitSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitSection = null;


        try {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:182:2: (iv_ruleInitSection= ruleInitSection EOF )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:183:2: iv_ruleInitSection= ruleInitSection EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInitSectionRule(), currentNode); 
            pushFollow(FOLLOW_ruleInitSection_in_entryRuleInitSection231);
            iv_ruleInitSection=ruleInitSection();
            _fsp--;

             current =iv_ruleInitSection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitSection241); 

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
    // $ANTLR end entryRuleInitSection


    // $ANTLR start ruleInitSection
    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:190:1: ruleInitSection returns [EObject current=null] : ( 'BEGIN-INIT' ( (lv_initCommands_1_0= ruleInitCommand ) )+ 'END-INIT' ) ;
    public final EObject ruleInitSection() throws RecognitionException {
        EObject current = null;

        EObject lv_initCommands_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:195:6: ( ( 'BEGIN-INIT' ( (lv_initCommands_1_0= ruleInitCommand ) )+ 'END-INIT' ) )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:196:1: ( 'BEGIN-INIT' ( (lv_initCommands_1_0= ruleInitCommand ) )+ 'END-INIT' )
            {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:196:1: ( 'BEGIN-INIT' ( (lv_initCommands_1_0= ruleInitCommand ) )+ 'END-INIT' )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:196:3: 'BEGIN-INIT' ( (lv_initCommands_1_0= ruleInitCommand ) )+ 'END-INIT'
            {
            match(input,13,FOLLOW_13_in_ruleInitSection276); 

                    createLeafNode(grammarAccess.getInitSectionAccess().getBEGININITKeyword_0(), null); 
                
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:200:1: ( (lv_initCommands_1_0= ruleInitCommand ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15||(LA3_0>=18 && LA3_0<=19)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:201:1: (lv_initCommands_1_0= ruleInitCommand )
            	    {
            	    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:201:1: (lv_initCommands_1_0= ruleInitCommand )
            	    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:202:3: lv_initCommands_1_0= ruleInitCommand
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getInitSectionAccess().getInitCommandsInitCommandParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleInitCommand_in_ruleInitSection297);
            	    lv_initCommands_1_0=ruleInitCommand();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getInitSectionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"initCommands",
            	    	        		lv_initCommands_1_0, 
            	    	        		"InitCommand", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            match(input,14,FOLLOW_14_in_ruleInitSection308); 

                    createLeafNode(grammarAccess.getInitSectionAccess().getENDINITKeyword_2(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleInitSection


    // $ANTLR start entryRuleInitCommand
    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:236:1: entryRuleInitCommand returns [EObject current=null] : iv_ruleInitCommand= ruleInitCommand EOF ;
    public final EObject entryRuleInitCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitCommand = null;


        try {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:237:2: (iv_ruleInitCommand= ruleInitCommand EOF )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:238:2: iv_ruleInitCommand= ruleInitCommand EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInitCommandRule(), currentNode); 
            pushFollow(FOLLOW_ruleInitCommand_in_entryRuleInitCommand344);
            iv_ruleInitCommand=ruleInitCommand();
            _fsp--;

             current =iv_ruleInitCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitCommand354); 

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
    // $ANTLR end entryRuleInitCommand


    // $ANTLR start ruleInitCommand
    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:245:1: ruleInitCommand returns [EObject current=null] : (this_InitPositionCommand_0= ruleInitPositionCommand | this_InitHeadingCommand_1= ruleInitHeadingCommand | this_InitBoardSizeCommand_2= ruleInitBoardSizeCommand ) ;
    public final EObject ruleInitCommand() throws RecognitionException {
        EObject current = null;

        EObject this_InitPositionCommand_0 = null;

        EObject this_InitHeadingCommand_1 = null;

        EObject this_InitBoardSizeCommand_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:250:6: ( (this_InitPositionCommand_0= ruleInitPositionCommand | this_InitHeadingCommand_1= ruleInitHeadingCommand | this_InitBoardSizeCommand_2= ruleInitBoardSizeCommand ) )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:251:1: (this_InitPositionCommand_0= ruleInitPositionCommand | this_InitHeadingCommand_1= ruleInitHeadingCommand | this_InitBoardSizeCommand_2= ruleInitBoardSizeCommand )
            {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:251:1: (this_InitPositionCommand_0= ruleInitPositionCommand | this_InitHeadingCommand_1= ruleInitHeadingCommand | this_InitBoardSizeCommand_2= ruleInitBoardSizeCommand )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt4=1;
                }
                break;
            case 18:
                {
                alt4=2;
                }
                break;
            case 19:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("251:1: (this_InitPositionCommand_0= ruleInitPositionCommand | this_InitHeadingCommand_1= ruleInitHeadingCommand | this_InitBoardSizeCommand_2= ruleInitBoardSizeCommand )", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:252:5: this_InitPositionCommand_0= ruleInitPositionCommand
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getInitCommandAccess().getInitPositionCommandParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleInitPositionCommand_in_ruleInitCommand401);
                    this_InitPositionCommand_0=ruleInitPositionCommand();
                    _fsp--;

                     
                            current = this_InitPositionCommand_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:262:5: this_InitHeadingCommand_1= ruleInitHeadingCommand
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getInitCommandAccess().getInitHeadingCommandParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleInitHeadingCommand_in_ruleInitCommand428);
                    this_InitHeadingCommand_1=ruleInitHeadingCommand();
                    _fsp--;

                     
                            current = this_InitHeadingCommand_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:272:5: this_InitBoardSizeCommand_2= ruleInitBoardSizeCommand
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getInitCommandAccess().getInitBoardSizeCommandParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleInitBoardSizeCommand_in_ruleInitCommand455);
                    this_InitBoardSizeCommand_2=ruleInitBoardSizeCommand();
                    _fsp--;

                     
                            current = this_InitBoardSizeCommand_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleInitCommand


    // $ANTLR start entryRuleInitPositionCommand
    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:288:1: entryRuleInitPositionCommand returns [EObject current=null] : iv_ruleInitPositionCommand= ruleInitPositionCommand EOF ;
    public final EObject entryRuleInitPositionCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitPositionCommand = null;


        try {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:289:2: (iv_ruleInitPositionCommand= ruleInitPositionCommand EOF )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:290:2: iv_ruleInitPositionCommand= ruleInitPositionCommand EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInitPositionCommandRule(), currentNode); 
            pushFollow(FOLLOW_ruleInitPositionCommand_in_entryRuleInitPositionCommand490);
            iv_ruleInitPositionCommand=ruleInitPositionCommand();
            _fsp--;

             current =iv_ruleInitPositionCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitPositionCommand500); 

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
    // $ANTLR end entryRuleInitPositionCommand


    // $ANTLR start ruleInitPositionCommand
    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:297:1: ruleInitPositionCommand returns [EObject current=null] : ( 'position' ( (lv_x_1_0= RULE_INT ) ) ',' ( (lv_y_3_0= RULE_INT ) ) ';' ) ;
    public final EObject ruleInitPositionCommand() throws RecognitionException {
        EObject current = null;

        Token lv_x_1_0=null;
        Token lv_y_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:302:6: ( ( 'position' ( (lv_x_1_0= RULE_INT ) ) ',' ( (lv_y_3_0= RULE_INT ) ) ';' ) )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:303:1: ( 'position' ( (lv_x_1_0= RULE_INT ) ) ',' ( (lv_y_3_0= RULE_INT ) ) ';' )
            {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:303:1: ( 'position' ( (lv_x_1_0= RULE_INT ) ) ',' ( (lv_y_3_0= RULE_INT ) ) ';' )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:303:3: 'position' ( (lv_x_1_0= RULE_INT ) ) ',' ( (lv_y_3_0= RULE_INT ) ) ';'
            {
            match(input,15,FOLLOW_15_in_ruleInitPositionCommand535); 

                    createLeafNode(grammarAccess.getInitPositionCommandAccess().getPositionKeyword_0(), null); 
                
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:307:1: ( (lv_x_1_0= RULE_INT ) )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:308:1: (lv_x_1_0= RULE_INT )
            {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:308:1: (lv_x_1_0= RULE_INT )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:309:3: lv_x_1_0= RULE_INT
            {
            lv_x_1_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleInitPositionCommand552); 

            			createLeafNode(grammarAccess.getInitPositionCommandAccess().getXINTTerminalRuleCall_1_0(), "x"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getInitPositionCommandRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"x",
            	        		lv_x_1_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,16,FOLLOW_16_in_ruleInitPositionCommand567); 

                    createLeafNode(grammarAccess.getInitPositionCommandAccess().getCommaKeyword_2(), null); 
                
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:335:1: ( (lv_y_3_0= RULE_INT ) )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:336:1: (lv_y_3_0= RULE_INT )
            {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:336:1: (lv_y_3_0= RULE_INT )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:337:3: lv_y_3_0= RULE_INT
            {
            lv_y_3_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleInitPositionCommand584); 

            			createLeafNode(grammarAccess.getInitPositionCommandAccess().getYINTTerminalRuleCall_3_0(), "y"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getInitPositionCommandRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"y",
            	        		lv_y_3_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,17,FOLLOW_17_in_ruleInitPositionCommand599); 

                    createLeafNode(grammarAccess.getInitPositionCommandAccess().getSemicolonKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleInitPositionCommand


    // $ANTLR start entryRuleInitHeadingCommand
    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:371:1: entryRuleInitHeadingCommand returns [EObject current=null] : iv_ruleInitHeadingCommand= ruleInitHeadingCommand EOF ;
    public final EObject entryRuleInitHeadingCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitHeadingCommand = null;


        try {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:372:2: (iv_ruleInitHeadingCommand= ruleInitHeadingCommand EOF )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:373:2: iv_ruleInitHeadingCommand= ruleInitHeadingCommand EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInitHeadingCommandRule(), currentNode); 
            pushFollow(FOLLOW_ruleInitHeadingCommand_in_entryRuleInitHeadingCommand635);
            iv_ruleInitHeadingCommand=ruleInitHeadingCommand();
            _fsp--;

             current =iv_ruleInitHeadingCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitHeadingCommand645); 

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
    // $ANTLR end entryRuleInitHeadingCommand


    // $ANTLR start ruleInitHeadingCommand
    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:380:1: ruleInitHeadingCommand returns [EObject current=null] : ( 'heading' ( (lv_heading_1_0= ruleHeadingKind ) ) ';' ) ;
    public final EObject ruleInitHeadingCommand() throws RecognitionException {
        EObject current = null;

        Enumerator lv_heading_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:385:6: ( ( 'heading' ( (lv_heading_1_0= ruleHeadingKind ) ) ';' ) )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:386:1: ( 'heading' ( (lv_heading_1_0= ruleHeadingKind ) ) ';' )
            {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:386:1: ( 'heading' ( (lv_heading_1_0= ruleHeadingKind ) ) ';' )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:386:3: 'heading' ( (lv_heading_1_0= ruleHeadingKind ) ) ';'
            {
            match(input,18,FOLLOW_18_in_ruleInitHeadingCommand680); 

                    createLeafNode(grammarAccess.getInitHeadingCommandAccess().getHeadingKeyword_0(), null); 
                
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:390:1: ( (lv_heading_1_0= ruleHeadingKind ) )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:391:1: (lv_heading_1_0= ruleHeadingKind )
            {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:391:1: (lv_heading_1_0= ruleHeadingKind )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:392:3: lv_heading_1_0= ruleHeadingKind
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getInitHeadingCommandAccess().getHeadingHeadingKindEnumRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleHeadingKind_in_ruleInitHeadingCommand701);
            lv_heading_1_0=ruleHeadingKind();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getInitHeadingCommandRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"heading",
            	        		lv_heading_1_0, 
            	        		"HeadingKind", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,17,FOLLOW_17_in_ruleInitHeadingCommand711); 

                    createLeafNode(grammarAccess.getInitHeadingCommandAccess().getSemicolonKeyword_2(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleInitHeadingCommand


    // $ANTLR start entryRuleInitBoardSizeCommand
    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:426:1: entryRuleInitBoardSizeCommand returns [EObject current=null] : iv_ruleInitBoardSizeCommand= ruleInitBoardSizeCommand EOF ;
    public final EObject entryRuleInitBoardSizeCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitBoardSizeCommand = null;


        try {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:427:2: (iv_ruleInitBoardSizeCommand= ruleInitBoardSizeCommand EOF )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:428:2: iv_ruleInitBoardSizeCommand= ruleInitBoardSizeCommand EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInitBoardSizeCommandRule(), currentNode); 
            pushFollow(FOLLOW_ruleInitBoardSizeCommand_in_entryRuleInitBoardSizeCommand747);
            iv_ruleInitBoardSizeCommand=ruleInitBoardSizeCommand();
            _fsp--;

             current =iv_ruleInitBoardSizeCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitBoardSizeCommand757); 

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
    // $ANTLR end entryRuleInitBoardSizeCommand


    // $ANTLR start ruleInitBoardSizeCommand
    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:435:1: ruleInitBoardSizeCommand returns [EObject current=null] : ( 'boardSize' ( (lv_width_1_0= RULE_INT ) ) ',' ( (lv_height_3_0= RULE_INT ) ) ';' ) ;
    public final EObject ruleInitBoardSizeCommand() throws RecognitionException {
        EObject current = null;

        Token lv_width_1_0=null;
        Token lv_height_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:440:6: ( ( 'boardSize' ( (lv_width_1_0= RULE_INT ) ) ',' ( (lv_height_3_0= RULE_INT ) ) ';' ) )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:441:1: ( 'boardSize' ( (lv_width_1_0= RULE_INT ) ) ',' ( (lv_height_3_0= RULE_INT ) ) ';' )
            {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:441:1: ( 'boardSize' ( (lv_width_1_0= RULE_INT ) ) ',' ( (lv_height_3_0= RULE_INT ) ) ';' )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:441:3: 'boardSize' ( (lv_width_1_0= RULE_INT ) ) ',' ( (lv_height_3_0= RULE_INT ) ) ';'
            {
            match(input,19,FOLLOW_19_in_ruleInitBoardSizeCommand792); 

                    createLeafNode(grammarAccess.getInitBoardSizeCommandAccess().getBoardSizeKeyword_0(), null); 
                
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:445:1: ( (lv_width_1_0= RULE_INT ) )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:446:1: (lv_width_1_0= RULE_INT )
            {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:446:1: (lv_width_1_0= RULE_INT )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:447:3: lv_width_1_0= RULE_INT
            {
            lv_width_1_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleInitBoardSizeCommand809); 

            			createLeafNode(grammarAccess.getInitBoardSizeCommandAccess().getWidthINTTerminalRuleCall_1_0(), "width"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getInitBoardSizeCommandRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"width",
            	        		lv_width_1_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,16,FOLLOW_16_in_ruleInitBoardSizeCommand824); 

                    createLeafNode(grammarAccess.getInitBoardSizeCommandAccess().getCommaKeyword_2(), null); 
                
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:473:1: ( (lv_height_3_0= RULE_INT ) )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:474:1: (lv_height_3_0= RULE_INT )
            {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:474:1: (lv_height_3_0= RULE_INT )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:475:3: lv_height_3_0= RULE_INT
            {
            lv_height_3_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleInitBoardSizeCommand841); 

            			createLeafNode(grammarAccess.getInitBoardSizeCommandAccess().getHeightINTTerminalRuleCall_3_0(), "height"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getInitBoardSizeCommandRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"height",
            	        		lv_height_3_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,17,FOLLOW_17_in_ruleInitBoardSizeCommand856); 

                    createLeafNode(grammarAccess.getInitBoardSizeCommandAccess().getSemicolonKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleInitBoardSizeCommand


    // $ANTLR start entryRuleUserDefinedCommand
    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:509:1: entryRuleUserDefinedCommand returns [EObject current=null] : iv_ruleUserDefinedCommand= ruleUserDefinedCommand EOF ;
    public final EObject entryRuleUserDefinedCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserDefinedCommand = null;


        try {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:510:2: (iv_ruleUserDefinedCommand= ruleUserDefinedCommand EOF )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:511:2: iv_ruleUserDefinedCommand= ruleUserDefinedCommand EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUserDefinedCommandRule(), currentNode); 
            pushFollow(FOLLOW_ruleUserDefinedCommand_in_entryRuleUserDefinedCommand892);
            iv_ruleUserDefinedCommand=ruleUserDefinedCommand();
            _fsp--;

             current =iv_ruleUserDefinedCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserDefinedCommand902); 

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
    // $ANTLR end entryRuleUserDefinedCommand


    // $ANTLR start ruleUserDefinedCommand
    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:518:1: ruleUserDefinedCommand returns [EObject current=null] : ( ( (lv_doc_0_0= ruleDocumentationComment ) )? 'DEFINE COMMAND' ( (lv_name_2_0= RULE_STRING ) ) 'AS' 'BEGIN' ( (lv_statements_5_0= ruleStatement ) )* 'END' ) ;
    public final EObject ruleUserDefinedCommand() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_doc_0_0 = null;

        EObject lv_statements_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:523:6: ( ( ( (lv_doc_0_0= ruleDocumentationComment ) )? 'DEFINE COMMAND' ( (lv_name_2_0= RULE_STRING ) ) 'AS' 'BEGIN' ( (lv_statements_5_0= ruleStatement ) )* 'END' ) )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:524:1: ( ( (lv_doc_0_0= ruleDocumentationComment ) )? 'DEFINE COMMAND' ( (lv_name_2_0= RULE_STRING ) ) 'AS' 'BEGIN' ( (lv_statements_5_0= ruleStatement ) )* 'END' )
            {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:524:1: ( ( (lv_doc_0_0= ruleDocumentationComment ) )? 'DEFINE COMMAND' ( (lv_name_2_0= RULE_STRING ) ) 'AS' 'BEGIN' ( (lv_statements_5_0= ruleStatement ) )* 'END' )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:524:2: ( (lv_doc_0_0= ruleDocumentationComment ) )? 'DEFINE COMMAND' ( (lv_name_2_0= RULE_STRING ) ) 'AS' 'BEGIN' ( (lv_statements_5_0= ruleStatement ) )* 'END'
            {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:524:2: ( (lv_doc_0_0= ruleDocumentationComment ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==35) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:525:1: (lv_doc_0_0= ruleDocumentationComment )
                    {
                    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:525:1: (lv_doc_0_0= ruleDocumentationComment )
                    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:526:3: lv_doc_0_0= ruleDocumentationComment
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getUserDefinedCommandAccess().getDocDocumentationCommentParserRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleDocumentationComment_in_ruleUserDefinedCommand948);
                    lv_doc_0_0=ruleDocumentationComment();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUserDefinedCommandRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"doc",
                    	        		lv_doc_0_0, 
                    	        		"DocumentationComment", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            match(input,20,FOLLOW_20_in_ruleUserDefinedCommand959); 

                    createLeafNode(grammarAccess.getUserDefinedCommandAccess().getDEFINECOMMANDKeyword_1(), null); 
                
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:552:1: ( (lv_name_2_0= RULE_STRING ) )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:553:1: (lv_name_2_0= RULE_STRING )
            {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:553:1: (lv_name_2_0= RULE_STRING )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:554:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUserDefinedCommand976); 

            			createLeafNode(grammarAccess.getUserDefinedCommandAccess().getNameSTRINGTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getUserDefinedCommandRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_2_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,21,FOLLOW_21_in_ruleUserDefinedCommand991); 

                    createLeafNode(grammarAccess.getUserDefinedCommandAccess().getASKeyword_3(), null); 
                
            match(input,22,FOLLOW_22_in_ruleUserDefinedCommand1001); 

                    createLeafNode(grammarAccess.getUserDefinedCommandAccess().getBEGINKeyword_4(), null); 
                
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:584:1: ( (lv_statements_5_0= ruleStatement ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||LA6_0==26||LA6_0==32||LA6_0==34||(LA6_0>=41 && LA6_0<=46)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:585:1: (lv_statements_5_0= ruleStatement )
            	    {
            	    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:585:1: (lv_statements_5_0= ruleStatement )
            	    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:586:3: lv_statements_5_0= ruleStatement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getUserDefinedCommandAccess().getStatementsStatementParserRuleCall_5_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleUserDefinedCommand1022);
            	    lv_statements_5_0=ruleStatement();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getUserDefinedCommandRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"statements",
            	    	        		lv_statements_5_0, 
            	    	        		"Statement", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match(input,23,FOLLOW_23_in_ruleUserDefinedCommand1033); 

                    createLeafNode(grammarAccess.getUserDefinedCommandAccess().getENDKeyword_6(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUserDefinedCommand


    // $ANTLR start entryRuleMain
    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:620:1: entryRuleMain returns [EObject current=null] : iv_ruleMain= ruleMain EOF ;
    public final EObject entryRuleMain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMain = null;


        try {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:621:2: (iv_ruleMain= ruleMain EOF )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:622:2: iv_ruleMain= ruleMain EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMainRule(), currentNode); 
            pushFollow(FOLLOW_ruleMain_in_entryRuleMain1069);
            iv_ruleMain=ruleMain();
            _fsp--;

             current =iv_ruleMain; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMain1079); 

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
    // $ANTLR end entryRuleMain


    // $ANTLR start ruleMain
    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:629:1: ruleMain returns [EObject current=null] : ( () 'BEGIN-MAIN' ( (lv_statements_2_0= ruleStatement ) )* 'END-MAIN' ) ;
    public final EObject ruleMain() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:634:6: ( ( () 'BEGIN-MAIN' ( (lv_statements_2_0= ruleStatement ) )* 'END-MAIN' ) )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:635:1: ( () 'BEGIN-MAIN' ( (lv_statements_2_0= ruleStatement ) )* 'END-MAIN' )
            {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:635:1: ( () 'BEGIN-MAIN' ( (lv_statements_2_0= ruleStatement ) )* 'END-MAIN' )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:635:2: () 'BEGIN-MAIN' ( (lv_statements_2_0= ruleStatement ) )* 'END-MAIN'
            {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:635:2: ()
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:636:5: 
            {
             
                    temp=factory.create(grammarAccess.getMainAccess().getMainAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getMainAccess().getMainAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,24,FOLLOW_24_in_ruleMain1123); 

                    createLeafNode(grammarAccess.getMainAccess().getBEGINMAINKeyword_1(), null); 
                
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:650:1: ( (lv_statements_2_0= ruleStatement ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==26||LA7_0==32||LA7_0==34||(LA7_0>=41 && LA7_0<=46)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:651:1: (lv_statements_2_0= ruleStatement )
            	    {
            	    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:651:1: (lv_statements_2_0= ruleStatement )
            	    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:652:3: lv_statements_2_0= ruleStatement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getMainAccess().getStatementsStatementParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleMain1144);
            	    lv_statements_2_0=ruleStatement();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getMainRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"statements",
            	    	        		lv_statements_2_0, 
            	    	        		"Statement", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match(input,25,FOLLOW_25_in_ruleMain1155); 

                    createLeafNode(grammarAccess.getMainAccess().getENDMAINKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleMain


    // $ANTLR start entryRuleStatement
    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:686:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:687:2: (iv_ruleStatement= ruleStatement EOF )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:688:2: iv_ruleStatement= ruleStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement1191);
            iv_ruleStatement=ruleStatement();
            _fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement1201); 

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
    // $ANTLR end entryRuleStatement


    // $ANTLR start ruleStatement
    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:695:1: ruleStatement returns [EObject current=null] : (this_IfStatement_0= ruleIfStatement | this_IterateStatement_1= ruleIterateStatement | this_WhileStatement_2= ruleWhileStatement | this_CommandStatement_3= ruleCommandStatement | this_UserDefinedCommandStatement_4= ruleUserDefinedCommandStatement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_IfStatement_0 = null;

        EObject this_IterateStatement_1 = null;

        EObject this_WhileStatement_2 = null;

        EObject this_CommandStatement_3 = null;

        EObject this_UserDefinedCommandStatement_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:700:6: ( (this_IfStatement_0= ruleIfStatement | this_IterateStatement_1= ruleIterateStatement | this_WhileStatement_2= ruleWhileStatement | this_CommandStatement_3= ruleCommandStatement | this_UserDefinedCommandStatement_4= ruleUserDefinedCommandStatement ) )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:701:1: (this_IfStatement_0= ruleIfStatement | this_IterateStatement_1= ruleIterateStatement | this_WhileStatement_2= ruleWhileStatement | this_CommandStatement_3= ruleCommandStatement | this_UserDefinedCommandStatement_4= ruleUserDefinedCommandStatement )
            {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:701:1: (this_IfStatement_0= ruleIfStatement | this_IterateStatement_1= ruleIterateStatement | this_WhileStatement_2= ruleWhileStatement | this_CommandStatement_3= ruleCommandStatement | this_UserDefinedCommandStatement_4= ruleUserDefinedCommandStatement )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt8=1;
                }
                break;
            case 32:
                {
                alt8=2;
                }
                break;
            case 34:
                {
                alt8=3;
                }
                break;
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
                {
                alt8=4;
                }
                break;
            case RULE_ID:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("701:1: (this_IfStatement_0= ruleIfStatement | this_IterateStatement_1= ruleIterateStatement | this_WhileStatement_2= ruleWhileStatement | this_CommandStatement_3= ruleCommandStatement | this_UserDefinedCommandStatement_4= ruleUserDefinedCommandStatement )", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:702:5: this_IfStatement_0= ruleIfStatement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleIfStatement_in_ruleStatement1248);
                    this_IfStatement_0=ruleIfStatement();
                    _fsp--;

                     
                            current = this_IfStatement_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:712:5: this_IterateStatement_1= ruleIterateStatement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getStatementAccess().getIterateStatementParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleIterateStatement_in_ruleStatement1275);
                    this_IterateStatement_1=ruleIterateStatement();
                    _fsp--;

                     
                            current = this_IterateStatement_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:722:5: this_WhileStatement_2= ruleWhileStatement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getStatementAccess().getWhileStatementParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleWhileStatement_in_ruleStatement1302);
                    this_WhileStatement_2=ruleWhileStatement();
                    _fsp--;

                     
                            current = this_WhileStatement_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:732:5: this_CommandStatement_3= ruleCommandStatement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getStatementAccess().getCommandStatementParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCommandStatement_in_ruleStatement1329);
                    this_CommandStatement_3=ruleCommandStatement();
                    _fsp--;

                     
                            current = this_CommandStatement_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:742:5: this_UserDefinedCommandStatement_4= ruleUserDefinedCommandStatement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getStatementAccess().getUserDefinedCommandStatementParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUserDefinedCommandStatement_in_ruleStatement1356);
                    this_UserDefinedCommandStatement_4=ruleUserDefinedCommandStatement();
                    _fsp--;

                     
                            current = this_UserDefinedCommandStatement_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStatement


    // $ANTLR start entryRuleUserDefinedCommandStatement
    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:758:1: entryRuleUserDefinedCommandStatement returns [EObject current=null] : iv_ruleUserDefinedCommandStatement= ruleUserDefinedCommandStatement EOF ;
    public final EObject entryRuleUserDefinedCommandStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserDefinedCommandStatement = null;


        try {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:759:2: (iv_ruleUserDefinedCommandStatement= ruleUserDefinedCommandStatement EOF )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:760:2: iv_ruleUserDefinedCommandStatement= ruleUserDefinedCommandStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUserDefinedCommandStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleUserDefinedCommandStatement_in_entryRuleUserDefinedCommandStatement1391);
            iv_ruleUserDefinedCommandStatement=ruleUserDefinedCommandStatement();
            _fsp--;

             current =iv_ruleUserDefinedCommandStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserDefinedCommandStatement1401); 

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
    // $ANTLR end entryRuleUserDefinedCommandStatement


    // $ANTLR start ruleUserDefinedCommandStatement
    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:767:1: ruleUserDefinedCommandStatement returns [EObject current=null] : ( ( ( RULE_ID ) ) ';' ) ;
    public final EObject ruleUserDefinedCommandStatement() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:772:6: ( ( ( ( RULE_ID ) ) ';' ) )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:773:1: ( ( ( RULE_ID ) ) ';' )
            {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:773:1: ( ( ( RULE_ID ) ) ';' )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:773:2: ( ( RULE_ID ) ) ';'
            {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:773:2: ( ( RULE_ID ) )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:774:1: ( RULE_ID )
            {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:774:1: ( RULE_ID )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:775:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getUserDefinedCommandStatementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUserDefinedCommandStatement1444); 

            		createLeafNode(grammarAccess.getUserDefinedCommandStatementAccess().getCommandUserDefinedCommandCrossReference_0_0(), "command"); 
            	

            }


            }

            match(input,17,FOLLOW_17_in_ruleUserDefinedCommandStatement1454); 

                    createLeafNode(grammarAccess.getUserDefinedCommandStatementAccess().getSemicolonKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUserDefinedCommandStatement


    // $ANTLR start entryRuleIfStatement
    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:799:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:800:2: (iv_ruleIfStatement= ruleIfStatement EOF )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:801:2: iv_ruleIfStatement= ruleIfStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIfStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleIfStatement_in_entryRuleIfStatement1490);
            iv_ruleIfStatement=ruleIfStatement();
            _fsp--;

             current =iv_ruleIfStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfStatement1500); 

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
    // $ANTLR end entryRuleIfStatement


    // $ANTLR start ruleIfStatement
    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:808:1: ruleIfStatement returns [EObject current=null] : ( 'IF' '(' ( (lv_condition_2_0= ruleConditionExpr ) ) ')' '{' ( (lv_statements_5_0= ruleStatement ) )* '}' ( 'ELSE' '{' ( (lv_elseStatements_9_0= ruleStatement ) )* '}' )? ) ;
    public final EObject ruleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_condition_2_0 = null;

        EObject lv_statements_5_0 = null;

        EObject lv_elseStatements_9_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:813:6: ( ( 'IF' '(' ( (lv_condition_2_0= ruleConditionExpr ) ) ')' '{' ( (lv_statements_5_0= ruleStatement ) )* '}' ( 'ELSE' '{' ( (lv_elseStatements_9_0= ruleStatement ) )* '}' )? ) )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:814:1: ( 'IF' '(' ( (lv_condition_2_0= ruleConditionExpr ) ) ')' '{' ( (lv_statements_5_0= ruleStatement ) )* '}' ( 'ELSE' '{' ( (lv_elseStatements_9_0= ruleStatement ) )* '}' )? )
            {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:814:1: ( 'IF' '(' ( (lv_condition_2_0= ruleConditionExpr ) ) ')' '{' ( (lv_statements_5_0= ruleStatement ) )* '}' ( 'ELSE' '{' ( (lv_elseStatements_9_0= ruleStatement ) )* '}' )? )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:814:3: 'IF' '(' ( (lv_condition_2_0= ruleConditionExpr ) ) ')' '{' ( (lv_statements_5_0= ruleStatement ) )* '}' ( 'ELSE' '{' ( (lv_elseStatements_9_0= ruleStatement ) )* '}' )?
            {
            match(input,26,FOLLOW_26_in_ruleIfStatement1535); 

                    createLeafNode(grammarAccess.getIfStatementAccess().getIFKeyword_0(), null); 
                
            match(input,27,FOLLOW_27_in_ruleIfStatement1545); 

                    createLeafNode(grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:822:1: ( (lv_condition_2_0= ruleConditionExpr ) )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:823:1: (lv_condition_2_0= ruleConditionExpr )
            {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:823:1: (lv_condition_2_0= ruleConditionExpr )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:824:3: lv_condition_2_0= ruleConditionExpr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getIfStatementAccess().getConditionConditionExprParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleConditionExpr_in_ruleIfStatement1566);
            lv_condition_2_0=ruleConditionExpr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getIfStatementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"condition",
            	        		lv_condition_2_0, 
            	        		"ConditionExpr", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,28,FOLLOW_28_in_ruleIfStatement1576); 

                    createLeafNode(grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3(), null); 
                
            match(input,29,FOLLOW_29_in_ruleIfStatement1586); 

                    createLeafNode(grammarAccess.getIfStatementAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:854:1: ( (lv_statements_5_0= ruleStatement ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==26||LA9_0==32||LA9_0==34||(LA9_0>=41 && LA9_0<=46)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:855:1: (lv_statements_5_0= ruleStatement )
            	    {
            	    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:855:1: (lv_statements_5_0= ruleStatement )
            	    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:856:3: lv_statements_5_0= ruleStatement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getIfStatementAccess().getStatementsStatementParserRuleCall_5_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleIfStatement1607);
            	    lv_statements_5_0=ruleStatement();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getIfStatementRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"statements",
            	    	        		lv_statements_5_0, 
            	    	        		"Statement", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match(input,30,FOLLOW_30_in_ruleIfStatement1618); 

                    createLeafNode(grammarAccess.getIfStatementAccess().getRightCurlyBracketKeyword_6(), null); 
                
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:882:1: ( 'ELSE' '{' ( (lv_elseStatements_9_0= ruleStatement ) )* '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:882:3: 'ELSE' '{' ( (lv_elseStatements_9_0= ruleStatement ) )* '}'
                    {
                    match(input,31,FOLLOW_31_in_ruleIfStatement1629); 

                            createLeafNode(grammarAccess.getIfStatementAccess().getELSEKeyword_7_0(), null); 
                        
                    match(input,29,FOLLOW_29_in_ruleIfStatement1639); 

                            createLeafNode(grammarAccess.getIfStatementAccess().getLeftCurlyBracketKeyword_7_1(), null); 
                        
                    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:890:1: ( (lv_elseStatements_9_0= ruleStatement ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_ID||LA10_0==26||LA10_0==32||LA10_0==34||(LA10_0>=41 && LA10_0<=46)) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:891:1: (lv_elseStatements_9_0= ruleStatement )
                    	    {
                    	    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:891:1: (lv_elseStatements_9_0= ruleStatement )
                    	    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:892:3: lv_elseStatements_9_0= ruleStatement
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getIfStatementAccess().getElseStatementsStatementParserRuleCall_7_2_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleStatement_in_ruleIfStatement1660);
                    	    lv_elseStatements_9_0=ruleStatement();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getIfStatementRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"elseStatements",
                    	    	        		lv_elseStatements_9_0, 
                    	    	        		"Statement", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    match(input,30,FOLLOW_30_in_ruleIfStatement1671); 

                            createLeafNode(grammarAccess.getIfStatementAccess().getRightCurlyBracketKeyword_7_3(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleIfStatement


    // $ANTLR start entryRuleIterateStatement
    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:926:1: entryRuleIterateStatement returns [EObject current=null] : iv_ruleIterateStatement= ruleIterateStatement EOF ;
    public final EObject entryRuleIterateStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIterateStatement = null;


        try {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:927:2: (iv_ruleIterateStatement= ruleIterateStatement EOF )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:928:2: iv_ruleIterateStatement= ruleIterateStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIterateStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleIterateStatement_in_entryRuleIterateStatement1709);
            iv_ruleIterateStatement=ruleIterateStatement();
            _fsp--;

             current =iv_ruleIterateStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIterateStatement1719); 

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
    // $ANTLR end entryRuleIterateStatement


    // $ANTLR start ruleIterateStatement
    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:935:1: ruleIterateStatement returns [EObject current=null] : ( 'ITERATE' ( (lv_times_1_0= RULE_INT ) ) 'TIMES' '{' ( (lv_statements_4_0= ruleStatement ) ) '}' ) ;
    public final EObject ruleIterateStatement() throws RecognitionException {
        EObject current = null;

        Token lv_times_1_0=null;
        EObject lv_statements_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:940:6: ( ( 'ITERATE' ( (lv_times_1_0= RULE_INT ) ) 'TIMES' '{' ( (lv_statements_4_0= ruleStatement ) ) '}' ) )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:941:1: ( 'ITERATE' ( (lv_times_1_0= RULE_INT ) ) 'TIMES' '{' ( (lv_statements_4_0= ruleStatement ) ) '}' )
            {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:941:1: ( 'ITERATE' ( (lv_times_1_0= RULE_INT ) ) 'TIMES' '{' ( (lv_statements_4_0= ruleStatement ) ) '}' )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:941:3: 'ITERATE' ( (lv_times_1_0= RULE_INT ) ) 'TIMES' '{' ( (lv_statements_4_0= ruleStatement ) ) '}'
            {
            match(input,32,FOLLOW_32_in_ruleIterateStatement1754); 

                    createLeafNode(grammarAccess.getIterateStatementAccess().getITERATEKeyword_0(), null); 
                
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:945:1: ( (lv_times_1_0= RULE_INT ) )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:946:1: (lv_times_1_0= RULE_INT )
            {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:946:1: (lv_times_1_0= RULE_INT )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:947:3: lv_times_1_0= RULE_INT
            {
            lv_times_1_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIterateStatement1771); 

            			createLeafNode(grammarAccess.getIterateStatementAccess().getTimesINTTerminalRuleCall_1_0(), "times"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getIterateStatementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"times",
            	        		lv_times_1_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,33,FOLLOW_33_in_ruleIterateStatement1786); 

                    createLeafNode(grammarAccess.getIterateStatementAccess().getTIMESKeyword_2(), null); 
                
            match(input,29,FOLLOW_29_in_ruleIterateStatement1796); 

                    createLeafNode(grammarAccess.getIterateStatementAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:977:1: ( (lv_statements_4_0= ruleStatement ) )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:978:1: (lv_statements_4_0= ruleStatement )
            {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:978:1: (lv_statements_4_0= ruleStatement )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:979:3: lv_statements_4_0= ruleStatement
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getIterateStatementAccess().getStatementsStatementParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleStatement_in_ruleIterateStatement1817);
            lv_statements_4_0=ruleStatement();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getIterateStatementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"statements",
            	        		lv_statements_4_0, 
            	        		"Statement", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,30,FOLLOW_30_in_ruleIterateStatement1827); 

                    createLeafNode(grammarAccess.getIterateStatementAccess().getRightCurlyBracketKeyword_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleIterateStatement


    // $ANTLR start entryRuleWhileStatement
    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1013:1: entryRuleWhileStatement returns [EObject current=null] : iv_ruleWhileStatement= ruleWhileStatement EOF ;
    public final EObject entryRuleWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileStatement = null;


        try {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1014:2: (iv_ruleWhileStatement= ruleWhileStatement EOF )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1015:2: iv_ruleWhileStatement= ruleWhileStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getWhileStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleWhileStatement_in_entryRuleWhileStatement1863);
            iv_ruleWhileStatement=ruleWhileStatement();
            _fsp--;

             current =iv_ruleWhileStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhileStatement1873); 

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
    // $ANTLR end entryRuleWhileStatement


    // $ANTLR start ruleWhileStatement
    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1022:1: ruleWhileStatement returns [EObject current=null] : ( 'WHILE' '(' ( (lv_condition_2_0= ruleConditionExpr ) ) ')' '{' ( (lv_statements_5_0= ruleStatement ) ) '}' ) ;
    public final EObject ruleWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_condition_2_0 = null;

        EObject lv_statements_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1027:6: ( ( 'WHILE' '(' ( (lv_condition_2_0= ruleConditionExpr ) ) ')' '{' ( (lv_statements_5_0= ruleStatement ) ) '}' ) )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1028:1: ( 'WHILE' '(' ( (lv_condition_2_0= ruleConditionExpr ) ) ')' '{' ( (lv_statements_5_0= ruleStatement ) ) '}' )
            {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1028:1: ( 'WHILE' '(' ( (lv_condition_2_0= ruleConditionExpr ) ) ')' '{' ( (lv_statements_5_0= ruleStatement ) ) '}' )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1028:3: 'WHILE' '(' ( (lv_condition_2_0= ruleConditionExpr ) ) ')' '{' ( (lv_statements_5_0= ruleStatement ) ) '}'
            {
            match(input,34,FOLLOW_34_in_ruleWhileStatement1908); 

                    createLeafNode(grammarAccess.getWhileStatementAccess().getWHILEKeyword_0(), null); 
                
            match(input,27,FOLLOW_27_in_ruleWhileStatement1918); 

                    createLeafNode(grammarAccess.getWhileStatementAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1036:1: ( (lv_condition_2_0= ruleConditionExpr ) )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1037:1: (lv_condition_2_0= ruleConditionExpr )
            {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1037:1: (lv_condition_2_0= ruleConditionExpr )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1038:3: lv_condition_2_0= ruleConditionExpr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getWhileStatementAccess().getConditionConditionExprParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleConditionExpr_in_ruleWhileStatement1939);
            lv_condition_2_0=ruleConditionExpr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getWhileStatementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"condition",
            	        		lv_condition_2_0, 
            	        		"ConditionExpr", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,28,FOLLOW_28_in_ruleWhileStatement1949); 

                    createLeafNode(grammarAccess.getWhileStatementAccess().getRightParenthesisKeyword_3(), null); 
                
            match(input,29,FOLLOW_29_in_ruleWhileStatement1959); 

                    createLeafNode(grammarAccess.getWhileStatementAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1068:1: ( (lv_statements_5_0= ruleStatement ) )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1069:1: (lv_statements_5_0= ruleStatement )
            {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1069:1: (lv_statements_5_0= ruleStatement )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1070:3: lv_statements_5_0= ruleStatement
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getWhileStatementAccess().getStatementsStatementParserRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleStatement_in_ruleWhileStatement1980);
            lv_statements_5_0=ruleStatement();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getWhileStatementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"statements",
            	        		lv_statements_5_0, 
            	        		"Statement", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,30,FOLLOW_30_in_ruleWhileStatement1990); 

                    createLeafNode(grammarAccess.getWhileStatementAccess().getRightCurlyBracketKeyword_6(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleWhileStatement


    // $ANTLR start entryRuleDocumentationComment
    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1104:1: entryRuleDocumentationComment returns [EObject current=null] : iv_ruleDocumentationComment= ruleDocumentationComment EOF ;
    public final EObject entryRuleDocumentationComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocumentationComment = null;


        try {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1105:2: (iv_ruleDocumentationComment= ruleDocumentationComment EOF )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1106:2: iv_ruleDocumentationComment= ruleDocumentationComment EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDocumentationCommentRule(), currentNode); 
            pushFollow(FOLLOW_ruleDocumentationComment_in_entryRuleDocumentationComment2026);
            iv_ruleDocumentationComment=ruleDocumentationComment();
            _fsp--;

             current =iv_ruleDocumentationComment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDocumentationComment2036); 

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
    // $ANTLR end entryRuleDocumentationComment


    // $ANTLR start ruleDocumentationComment
    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1113:1: ruleDocumentationComment returns [EObject current=null] : ( '@(' ( (lv_text_1_0= RULE_STRING ) ) ')' ) ;
    public final EObject ruleDocumentationComment() throws RecognitionException {
        EObject current = null;

        Token lv_text_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1118:6: ( ( '@(' ( (lv_text_1_0= RULE_STRING ) ) ')' ) )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1119:1: ( '@(' ( (lv_text_1_0= RULE_STRING ) ) ')' )
            {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1119:1: ( '@(' ( (lv_text_1_0= RULE_STRING ) ) ')' )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1119:3: '@(' ( (lv_text_1_0= RULE_STRING ) ) ')'
            {
            match(input,35,FOLLOW_35_in_ruleDocumentationComment2071); 

                    createLeafNode(grammarAccess.getDocumentationCommentAccess().getCommercialAtLeftParenthesisKeyword_0(), null); 
                
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1123:1: ( (lv_text_1_0= RULE_STRING ) )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1124:1: (lv_text_1_0= RULE_STRING )
            {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1124:1: (lv_text_1_0= RULE_STRING )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1125:3: lv_text_1_0= RULE_STRING
            {
            lv_text_1_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDocumentationComment2088); 

            			createLeafNode(grammarAccess.getDocumentationCommentAccess().getTextSTRINGTerminalRuleCall_1_0(), "text"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDocumentationCommentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"text",
            	        		lv_text_1_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,28,FOLLOW_28_in_ruleDocumentationComment2103); 

                    createLeafNode(grammarAccess.getDocumentationCommentAccess().getRightParenthesisKeyword_2(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDocumentationComment


    // $ANTLR start entryRuleCommandStatement
    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1159:1: entryRuleCommandStatement returns [EObject current=null] : iv_ruleCommandStatement= ruleCommandStatement EOF ;
    public final EObject entryRuleCommandStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandStatement = null;


        try {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1160:2: (iv_ruleCommandStatement= ruleCommandStatement EOF )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1161:2: iv_ruleCommandStatement= ruleCommandStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCommandStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleCommandStatement_in_entryRuleCommandStatement2139);
            iv_ruleCommandStatement=ruleCommandStatement();
            _fsp--;

             current =iv_ruleCommandStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommandStatement2149); 

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
    // $ANTLR end entryRuleCommandStatement


    // $ANTLR start ruleCommandStatement
    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1168:1: ruleCommandStatement returns [EObject current=null] : ( ( (lv_kind_0_0= ruleCommandKind ) ) ';' ) ;
    public final EObject ruleCommandStatement() throws RecognitionException {
        EObject current = null;

        Enumerator lv_kind_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1173:6: ( ( ( (lv_kind_0_0= ruleCommandKind ) ) ';' ) )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1174:1: ( ( (lv_kind_0_0= ruleCommandKind ) ) ';' )
            {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1174:1: ( ( (lv_kind_0_0= ruleCommandKind ) ) ';' )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1174:2: ( (lv_kind_0_0= ruleCommandKind ) ) ';'
            {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1174:2: ( (lv_kind_0_0= ruleCommandKind ) )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1175:1: (lv_kind_0_0= ruleCommandKind )
            {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1175:1: (lv_kind_0_0= ruleCommandKind )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1176:3: lv_kind_0_0= ruleCommandKind
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCommandStatementAccess().getKindCommandKindEnumRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleCommandKind_in_ruleCommandStatement2195);
            lv_kind_0_0=ruleCommandKind();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCommandStatementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"kind",
            	        		lv_kind_0_0, 
            	        		"CommandKind", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,17,FOLLOW_17_in_ruleCommandStatement2205); 

                    createLeafNode(grammarAccess.getCommandStatementAccess().getSemicolonKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCommandStatement


    // $ANTLR start entryRuleConditionExpr
    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1210:1: entryRuleConditionExpr returns [EObject current=null] : iv_ruleConditionExpr= ruleConditionExpr EOF ;
    public final EObject entryRuleConditionExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionExpr = null;


        try {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1211:2: (iv_ruleConditionExpr= ruleConditionExpr EOF )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1212:2: iv_ruleConditionExpr= ruleConditionExpr EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConditionExprRule(), currentNode); 
            pushFollow(FOLLOW_ruleConditionExpr_in_entryRuleConditionExpr2241);
            iv_ruleConditionExpr=ruleConditionExpr();
            _fsp--;

             current =iv_ruleConditionExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionExpr2251); 

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
    // $ANTLR end entryRuleConditionExpr


    // $ANTLR start ruleConditionExpr
    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1219:1: ruleConditionExpr returns [EObject current=null] : ( ( (lv_negation_0_0= '!' ) ) ( (lv_expr_1_0= ruleConditionKind ) ) ) ;
    public final EObject ruleConditionExpr() throws RecognitionException {
        EObject current = null;

        Token lv_negation_0_0=null;
        Enumerator lv_expr_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1224:6: ( ( ( (lv_negation_0_0= '!' ) ) ( (lv_expr_1_0= ruleConditionKind ) ) ) )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1225:1: ( ( (lv_negation_0_0= '!' ) ) ( (lv_expr_1_0= ruleConditionKind ) ) )
            {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1225:1: ( ( (lv_negation_0_0= '!' ) ) ( (lv_expr_1_0= ruleConditionKind ) ) )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1225:2: ( (lv_negation_0_0= '!' ) ) ( (lv_expr_1_0= ruleConditionKind ) )
            {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1225:2: ( (lv_negation_0_0= '!' ) )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1226:1: (lv_negation_0_0= '!' )
            {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1226:1: (lv_negation_0_0= '!' )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1227:3: lv_negation_0_0= '!'
            {
            lv_negation_0_0=(Token)input.LT(1);
            match(input,36,FOLLOW_36_in_ruleConditionExpr2294); 

                    createLeafNode(grammarAccess.getConditionExprAccess().getNegationExclamationMarkKeyword_0_0(), "negation"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getConditionExprRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "negation", true, "!", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1246:2: ( (lv_expr_1_0= ruleConditionKind ) )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1247:1: (lv_expr_1_0= ruleConditionKind )
            {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1247:1: (lv_expr_1_0= ruleConditionKind )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1248:3: lv_expr_1_0= ruleConditionKind
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getConditionExprAccess().getExprConditionKindEnumRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleConditionKind_in_ruleConditionExpr2328);
            lv_expr_1_0=ruleConditionKind();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getConditionExprRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"expr",
            	        		lv_expr_1_0, 
            	        		"ConditionKind", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleConditionExpr


    // $ANTLR start ruleHeadingKind
    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1278:1: ruleHeadingKind returns [Enumerator current=null] : ( ( 'NORTH' ) | ( 'SOUTH' ) | ( 'WEST' ) | ( 'EAST' ) ) ;
    public final Enumerator ruleHeadingKind() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1282:6: ( ( ( 'NORTH' ) | ( 'SOUTH' ) | ( 'WEST' ) | ( 'EAST' ) ) )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1283:1: ( ( 'NORTH' ) | ( 'SOUTH' ) | ( 'WEST' ) | ( 'EAST' ) )
            {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1283:1: ( ( 'NORTH' ) | ( 'SOUTH' ) | ( 'WEST' ) | ( 'EAST' ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt12=1;
                }
                break;
            case 38:
                {
                alt12=2;
                }
                break;
            case 39:
                {
                alt12=3;
                }
                break;
            case 40:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1283:1: ( ( 'NORTH' ) | ( 'SOUTH' ) | ( 'WEST' ) | ( 'EAST' ) )", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1283:2: ( 'NORTH' )
                    {
                    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1283:2: ( 'NORTH' )
                    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1283:4: 'NORTH'
                    {
                    match(input,37,FOLLOW_37_in_ruleHeadingKind2376); 

                            current = grammarAccess.getHeadingKindAccess().getNORTHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getHeadingKindAccess().getNORTHEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1289:6: ( 'SOUTH' )
                    {
                    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1289:6: ( 'SOUTH' )
                    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1289:8: 'SOUTH'
                    {
                    match(input,38,FOLLOW_38_in_ruleHeadingKind2391); 

                            current = grammarAccess.getHeadingKindAccess().getSOUTHEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getHeadingKindAccess().getSOUTHEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1295:6: ( 'WEST' )
                    {
                    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1295:6: ( 'WEST' )
                    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1295:8: 'WEST'
                    {
                    match(input,39,FOLLOW_39_in_ruleHeadingKind2406); 

                            current = grammarAccess.getHeadingKindAccess().getWESTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getHeadingKindAccess().getWESTEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1301:6: ( 'EAST' )
                    {
                    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1301:6: ( 'EAST' )
                    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1301:8: 'EAST'
                    {
                    match(input,40,FOLLOW_40_in_ruleHeadingKind2421); 

                            current = grammarAccess.getHeadingKindAccess().getEASTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getHeadingKindAccess().getEASTEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleHeadingKind


    // $ANTLR start ruleCommandKind
    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1311:1: ruleCommandKind returns [Enumerator current=null] : ( ( 'move' ) | ( 'turn' ) | ( 'turnOn' ) | ( 'turnOff' ) | ( 'put' ) | ( 'get' ) ) ;
    public final Enumerator ruleCommandKind() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1315:6: ( ( ( 'move' ) | ( 'turn' ) | ( 'turnOn' ) | ( 'turnOff' ) | ( 'put' ) | ( 'get' ) ) )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1316:1: ( ( 'move' ) | ( 'turn' ) | ( 'turnOn' ) | ( 'turnOff' ) | ( 'put' ) | ( 'get' ) )
            {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1316:1: ( ( 'move' ) | ( 'turn' ) | ( 'turnOn' ) | ( 'turnOff' ) | ( 'put' ) | ( 'get' ) )
            int alt13=6;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt13=1;
                }
                break;
            case 42:
                {
                alt13=2;
                }
                break;
            case 43:
                {
                alt13=3;
                }
                break;
            case 44:
                {
                alt13=4;
                }
                break;
            case 45:
                {
                alt13=5;
                }
                break;
            case 46:
                {
                alt13=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1316:1: ( ( 'move' ) | ( 'turn' ) | ( 'turnOn' ) | ( 'turnOff' ) | ( 'put' ) | ( 'get' ) )", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1316:2: ( 'move' )
                    {
                    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1316:2: ( 'move' )
                    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1316:4: 'move'
                    {
                    match(input,41,FOLLOW_41_in_ruleCommandKind2464); 

                            current = grammarAccess.getCommandKindAccess().getMOVEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCommandKindAccess().getMOVEEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1322:6: ( 'turn' )
                    {
                    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1322:6: ( 'turn' )
                    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1322:8: 'turn'
                    {
                    match(input,42,FOLLOW_42_in_ruleCommandKind2479); 

                            current = grammarAccess.getCommandKindAccess().getTURNLEFTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCommandKindAccess().getTURNLEFTEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1328:6: ( 'turnOn' )
                    {
                    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1328:6: ( 'turnOn' )
                    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1328:8: 'turnOn'
                    {
                    match(input,43,FOLLOW_43_in_ruleCommandKind2494); 

                            current = grammarAccess.getCommandKindAccess().getTURNONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCommandKindAccess().getTURNONEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1334:6: ( 'turnOff' )
                    {
                    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1334:6: ( 'turnOff' )
                    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1334:8: 'turnOff'
                    {
                    match(input,44,FOLLOW_44_in_ruleCommandKind2509); 

                            current = grammarAccess.getCommandKindAccess().getTURNOFFEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCommandKindAccess().getTURNOFFEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1340:6: ( 'put' )
                    {
                    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1340:6: ( 'put' )
                    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1340:8: 'put'
                    {
                    match(input,45,FOLLOW_45_in_ruleCommandKind2524); 

                            current = grammarAccess.getCommandKindAccess().getPUTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCommandKindAccess().getPUTEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1346:6: ( 'get' )
                    {
                    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1346:6: ( 'get' )
                    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1346:8: 'get'
                    {
                    match(input,46,FOLLOW_46_in_ruleCommandKind2539); 

                            current = grammarAccess.getCommandKindAccess().getGETEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCommandKindAccess().getGETEnumLiteralDeclaration_5(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCommandKind


    // $ANTLR start ruleConditionKind
    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1356:1: ruleConditionKind returns [Enumerator current=null] : ( ( 'WALL_AHEAD' ) | ( 'MARKED_PLACE' ) ) ;
    public final Enumerator ruleConditionKind() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1360:6: ( ( ( 'WALL_AHEAD' ) | ( 'MARKED_PLACE' ) ) )
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1361:1: ( ( 'WALL_AHEAD' ) | ( 'MARKED_PLACE' ) )
            {
            // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1361:1: ( ( 'WALL_AHEAD' ) | ( 'MARKED_PLACE' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==47) ) {
                alt14=1;
            }
            else if ( (LA14_0==48) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1361:1: ( ( 'WALL_AHEAD' ) | ( 'MARKED_PLACE' ) )", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1361:2: ( 'WALL_AHEAD' )
                    {
                    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1361:2: ( 'WALL_AHEAD' )
                    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1361:4: 'WALL_AHEAD'
                    {
                    match(input,47,FOLLOW_47_in_ruleConditionKind2582); 

                            current = grammarAccess.getConditionKindAccess().getWALL_AHEADEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getConditionKindAccess().getWALL_AHEADEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1367:6: ( 'MARKED_PLACE' )
                    {
                    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1367:6: ( 'MARKED_PLACE' )
                    // ../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g:1367:8: 'MARKED_PLACE'
                    {
                    match(input,48,FOLLOW_48_in_ruleConditionKind2597); 

                            current = grammarAccess.getConditionKindAccess().getMARKED_PLACEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getConditionKindAccess().getMARKED_PLACEEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleConditionKind


 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleProgram120 = new BitSet(new long[]{0x0000000801102000L});
    public static final BitSet FOLLOW_ruleInitSection_in_ruleProgram141 = new BitSet(new long[]{0x0000000801100000L});
    public static final BitSet FOLLOW_ruleUserDefinedCommand_in_ruleProgram163 = new BitSet(new long[]{0x0000000801100000L});
    public static final BitSet FOLLOW_ruleMain_in_ruleProgram185 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProgram195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitSection_in_entryRuleInitSection231 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitSection241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleInitSection276 = new BitSet(new long[]{0x00000000000C8000L});
    public static final BitSet FOLLOW_ruleInitCommand_in_ruleInitSection297 = new BitSet(new long[]{0x00000000000CC000L});
    public static final BitSet FOLLOW_14_in_ruleInitSection308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitCommand_in_entryRuleInitCommand344 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitCommand354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitPositionCommand_in_ruleInitCommand401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitHeadingCommand_in_ruleInitCommand428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitBoardSizeCommand_in_ruleInitCommand455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitPositionCommand_in_entryRuleInitPositionCommand490 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitPositionCommand500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleInitPositionCommand535 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleInitPositionCommand552 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleInitPositionCommand567 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleInitPositionCommand584 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleInitPositionCommand599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitHeadingCommand_in_entryRuleInitHeadingCommand635 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitHeadingCommand645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleInitHeadingCommand680 = new BitSet(new long[]{0x000001E000000000L});
    public static final BitSet FOLLOW_ruleHeadingKind_in_ruleInitHeadingCommand701 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleInitHeadingCommand711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitBoardSizeCommand_in_entryRuleInitBoardSizeCommand747 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitBoardSizeCommand757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleInitBoardSizeCommand792 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleInitBoardSizeCommand809 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleInitBoardSizeCommand824 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleInitBoardSizeCommand841 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleInitBoardSizeCommand856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserDefinedCommand_in_entryRuleUserDefinedCommand892 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserDefinedCommand902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocumentationComment_in_ruleUserDefinedCommand948 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleUserDefinedCommand959 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUserDefinedCommand976 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleUserDefinedCommand991 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleUserDefinedCommand1001 = new BitSet(new long[]{0x00007E0504800040L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleUserDefinedCommand1022 = new BitSet(new long[]{0x00007E0504800040L});
    public static final BitSet FOLLOW_23_in_ruleUserDefinedCommand1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMain_in_entryRuleMain1069 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMain1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleMain1123 = new BitSet(new long[]{0x00007E0506000040L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleMain1144 = new BitSet(new long[]{0x00007E0506000040L});
    public static final BitSet FOLLOW_25_in_ruleMain1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement1191 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfStatement_in_ruleStatement1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIterateStatement_in_ruleStatement1275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhileStatement_in_ruleStatement1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandStatement_in_ruleStatement1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserDefinedCommandStatement_in_ruleStatement1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserDefinedCommandStatement_in_entryRuleUserDefinedCommandStatement1391 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserDefinedCommandStatement1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUserDefinedCommandStatement1444 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleUserDefinedCommandStatement1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfStatement_in_entryRuleIfStatement1490 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfStatement1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleIfStatement1535 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleIfStatement1545 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_ruleConditionExpr_in_ruleIfStatement1566 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleIfStatement1576 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleIfStatement1586 = new BitSet(new long[]{0x00007E0544000040L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleIfStatement1607 = new BitSet(new long[]{0x00007E0544000040L});
    public static final BitSet FOLLOW_30_in_ruleIfStatement1618 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleIfStatement1629 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleIfStatement1639 = new BitSet(new long[]{0x00007E0544000040L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleIfStatement1660 = new BitSet(new long[]{0x00007E0544000040L});
    public static final BitSet FOLLOW_30_in_ruleIfStatement1671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIterateStatement_in_entryRuleIterateStatement1709 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIterateStatement1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleIterateStatement1754 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIterateStatement1771 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleIterateStatement1786 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleIterateStatement1796 = new BitSet(new long[]{0x00007E0504000040L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleIterateStatement1817 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleIterateStatement1827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhileStatement_in_entryRuleWhileStatement1863 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhileStatement1873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleWhileStatement1908 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleWhileStatement1918 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_ruleConditionExpr_in_ruleWhileStatement1939 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleWhileStatement1949 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleWhileStatement1959 = new BitSet(new long[]{0x00007E0504000040L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleWhileStatement1980 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleWhileStatement1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocumentationComment_in_entryRuleDocumentationComment2026 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocumentationComment2036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleDocumentationComment2071 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDocumentationComment2088 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleDocumentationComment2103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandStatement_in_entryRuleCommandStatement2139 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommandStatement2149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandKind_in_ruleCommandStatement2195 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleCommandStatement2205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionExpr_in_entryRuleConditionExpr2241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionExpr2251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleConditionExpr2294 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_ruleConditionKind_in_ruleConditionExpr2328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleHeadingKind2376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleHeadingKind2391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleHeadingKind2406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleHeadingKind2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleCommandKind2464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleCommandKind2479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleCommandKind2494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleCommandKind2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleCommandKind2524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleCommandKind2539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleConditionKind2582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleConditionKind2597 = new BitSet(new long[]{0x0000000000000002L});

}