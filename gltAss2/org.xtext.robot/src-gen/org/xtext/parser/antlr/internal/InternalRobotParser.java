package org.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.services.RobotGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRobotParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Script'", "'runs'", "'as'", "'\\n'", "'end'", "'#'", "'Trace'", "'buildWall'", "'at'", "'row:'", "'col:'", "'dropMark'", "'while'", "'do'", "'repeat'", "'times'", "'if'", "'then'", "'else'", "'\"'", "'full'", "'mark'", "'wall'", "'ahead'", "'heading'", "'and'", "'not'", "'step'", "'turnLeft'", "'drop'", "'pick'", "'south'", "'north'", "'east'", "'west'"
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
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
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


        public InternalRobotParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRobotParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRobotParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRobot.g"; }



     	private RobotGrammarAccess grammarAccess;

        public InternalRobotParser(TokenStream input, RobotGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Robot";
       	}

       	@Override
       	protected RobotGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRobot"
    // InternalRobot.g:65:1: entryRuleRobot returns [EObject current=null] : iv_ruleRobot= ruleRobot EOF ;
    public final EObject entryRuleRobot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobot = null;


        try {
            // InternalRobot.g:65:46: (iv_ruleRobot= ruleRobot EOF )
            // InternalRobot.g:66:2: iv_ruleRobot= ruleRobot EOF
            {
             newCompositeNode(grammarAccess.getRobotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRobot=ruleRobot();

            state._fsp--;

             current =iv_ruleRobot; 
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
    // $ANTLR end "entryRuleRobot"


    // $ANTLR start "ruleRobot"
    // InternalRobot.g:72:1: ruleRobot returns [EObject current=null] : ( () otherlv_1= 'Script' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'runs' otherlv_4= 'as' (otherlv_5= '\\n' )? ( ( (lv_statements_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? ( ( (lv_statements_8_0= ruleStatement ) ) (otherlv_9= '\\n' )? )* )? otherlv_10= 'end' ) ;
    public final EObject ruleRobot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_statements_6_0 = null;

        EObject lv_statements_8_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:78:2: ( ( () otherlv_1= 'Script' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'runs' otherlv_4= 'as' (otherlv_5= '\\n' )? ( ( (lv_statements_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? ( ( (lv_statements_8_0= ruleStatement ) ) (otherlv_9= '\\n' )? )* )? otherlv_10= 'end' ) )
            // InternalRobot.g:79:2: ( () otherlv_1= 'Script' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'runs' otherlv_4= 'as' (otherlv_5= '\\n' )? ( ( (lv_statements_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? ( ( (lv_statements_8_0= ruleStatement ) ) (otherlv_9= '\\n' )? )* )? otherlv_10= 'end' )
            {
            // InternalRobot.g:79:2: ( () otherlv_1= 'Script' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'runs' otherlv_4= 'as' (otherlv_5= '\\n' )? ( ( (lv_statements_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? ( ( (lv_statements_8_0= ruleStatement ) ) (otherlv_9= '\\n' )? )* )? otherlv_10= 'end' )
            // InternalRobot.g:80:3: () otherlv_1= 'Script' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'runs' otherlv_4= 'as' (otherlv_5= '\\n' )? ( ( (lv_statements_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? ( ( (lv_statements_8_0= ruleStatement ) ) (otherlv_9= '\\n' )? )* )? otherlv_10= 'end'
            {
            // InternalRobot.g:80:3: ()
            // InternalRobot.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRobotAccess().getRobotAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRobotAccess().getScriptKeyword_1());
            		
            // InternalRobot.g:91:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRobot.g:92:4: (lv_name_2_0= ruleEString )
            {
            // InternalRobot.g:92:4: (lv_name_2_0= ruleEString )
            // InternalRobot.g:93:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRobotAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRobotRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.Robot.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getRobotAccess().getRunsKeyword_3());
            		
            otherlv_4=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getRobotAccess().getAsKeyword_4());
            		
            // InternalRobot.g:118:3: (otherlv_5= '\\n' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalRobot.g:119:4: otherlv_5= '\\n'
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getRobotAccess().getLineFeedKeyword_5());
                    			

                    }
                    break;

            }

            // InternalRobot.g:124:3: ( ( (lv_statements_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? ( ( (lv_statements_8_0= ruleStatement ) ) (otherlv_9= '\\n' )? )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=16 && LA5_0<=18)||(LA5_0>=22 && LA5_0<=23)||LA5_0==25||LA5_0==27||(LA5_0>=38 && LA5_0<=41)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRobot.g:125:4: ( (lv_statements_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? ( ( (lv_statements_8_0= ruleStatement ) ) (otherlv_9= '\\n' )? )*
                    {
                    // InternalRobot.g:125:4: ( (lv_statements_6_0= ruleStatement ) )
                    // InternalRobot.g:126:5: (lv_statements_6_0= ruleStatement )
                    {
                    // InternalRobot.g:126:5: (lv_statements_6_0= ruleStatement )
                    // InternalRobot.g:127:6: lv_statements_6_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getRobotAccess().getStatementsStatementParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_statements_6_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRobotRule());
                    						}
                    						add(
                    							current,
                    							"statements",
                    							lv_statements_6_0,
                    							"org.xtext.Robot.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRobot.g:144:4: (otherlv_7= '\\n' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==14) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalRobot.g:145:5: otherlv_7= '\\n'
                            {
                            otherlv_7=(Token)match(input,14,FOLLOW_7); 

                            					newLeafNode(otherlv_7, grammarAccess.getRobotAccess().getLineFeedKeyword_6_1());
                            				

                            }
                            break;

                    }

                    // InternalRobot.g:150:4: ( ( (lv_statements_8_0= ruleStatement ) ) (otherlv_9= '\\n' )? )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>=16 && LA4_0<=18)||(LA4_0>=22 && LA4_0<=23)||LA4_0==25||LA4_0==27||(LA4_0>=38 && LA4_0<=41)) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalRobot.g:151:5: ( (lv_statements_8_0= ruleStatement ) ) (otherlv_9= '\\n' )?
                    	    {
                    	    // InternalRobot.g:151:5: ( (lv_statements_8_0= ruleStatement ) )
                    	    // InternalRobot.g:152:6: (lv_statements_8_0= ruleStatement )
                    	    {
                    	    // InternalRobot.g:152:6: (lv_statements_8_0= ruleStatement )
                    	    // InternalRobot.g:153:7: lv_statements_8_0= ruleStatement
                    	    {

                    	    							newCompositeNode(grammarAccess.getRobotAccess().getStatementsStatementParserRuleCall_6_2_0_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_statements_8_0=ruleStatement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRobotRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"statements",
                    	    								lv_statements_8_0,
                    	    								"org.xtext.Robot.Statement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    // InternalRobot.g:170:5: (otherlv_9= '\\n' )?
                    	    int alt3=2;
                    	    int LA3_0 = input.LA(1);

                    	    if ( (LA3_0==14) ) {
                    	        alt3=1;
                    	    }
                    	    switch (alt3) {
                    	        case 1 :
                    	            // InternalRobot.g:171:6: otherlv_9= '\\n'
                    	            {
                    	            otherlv_9=(Token)match(input,14,FOLLOW_7); 

                    	            						newLeafNode(otherlv_9, grammarAccess.getRobotAccess().getLineFeedKeyword_6_2_1());
                    	            					

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getRobotAccess().getEndKeyword_7());
            		

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
    // $ANTLR end "ruleRobot"


    // $ANTLR start "entryRuleStatement"
    // InternalRobot.g:186:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalRobot.g:186:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalRobot.g:187:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalRobot.g:193:1: ruleStatement returns [EObject current=null] : (this_Comment_0= ruleComment | this_Singleton_1= ruleSingleton | this_Trace_2= ruleTrace | this_BuildWall_3= ruleBuildWall | this_DropMark_4= ruleDropMark | this_WhileStatement_5= ruleWhileStatement | this_RepeatStatement_6= ruleRepeatStatement | this_IfElseStatement_7= ruleIfElseStatement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Comment_0 = null;

        EObject this_Singleton_1 = null;

        EObject this_Trace_2 = null;

        EObject this_BuildWall_3 = null;

        EObject this_DropMark_4 = null;

        EObject this_WhileStatement_5 = null;

        EObject this_RepeatStatement_6 = null;

        EObject this_IfElseStatement_7 = null;



        	enterRule();

        try {
            // InternalRobot.g:199:2: ( (this_Comment_0= ruleComment | this_Singleton_1= ruleSingleton | this_Trace_2= ruleTrace | this_BuildWall_3= ruleBuildWall | this_DropMark_4= ruleDropMark | this_WhileStatement_5= ruleWhileStatement | this_RepeatStatement_6= ruleRepeatStatement | this_IfElseStatement_7= ruleIfElseStatement ) )
            // InternalRobot.g:200:2: (this_Comment_0= ruleComment | this_Singleton_1= ruleSingleton | this_Trace_2= ruleTrace | this_BuildWall_3= ruleBuildWall | this_DropMark_4= ruleDropMark | this_WhileStatement_5= ruleWhileStatement | this_RepeatStatement_6= ruleRepeatStatement | this_IfElseStatement_7= ruleIfElseStatement )
            {
            // InternalRobot.g:200:2: (this_Comment_0= ruleComment | this_Singleton_1= ruleSingleton | this_Trace_2= ruleTrace | this_BuildWall_3= ruleBuildWall | this_DropMark_4= ruleDropMark | this_WhileStatement_5= ruleWhileStatement | this_RepeatStatement_6= ruleRepeatStatement | this_IfElseStatement_7= ruleIfElseStatement )
            int alt6=8;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt6=1;
                }
                break;
            case 38:
            case 39:
            case 40:
            case 41:
                {
                alt6=2;
                }
                break;
            case 17:
                {
                alt6=3;
                }
                break;
            case 18:
                {
                alt6=4;
                }
                break;
            case 22:
                {
                alt6=5;
                }
                break;
            case 23:
                {
                alt6=6;
                }
                break;
            case 25:
                {
                alt6=7;
                }
                break;
            case 27:
                {
                alt6=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalRobot.g:201:3: this_Comment_0= ruleComment
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getCommentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Comment_0=ruleComment();

                    state._fsp--;


                    			current = this_Comment_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRobot.g:210:3: this_Singleton_1= ruleSingleton
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getSingletonParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Singleton_1=ruleSingleton();

                    state._fsp--;


                    			current = this_Singleton_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRobot.g:219:3: this_Trace_2= ruleTrace
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getTraceParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Trace_2=ruleTrace();

                    state._fsp--;


                    			current = this_Trace_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRobot.g:228:3: this_BuildWall_3= ruleBuildWall
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getBuildWallParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_BuildWall_3=ruleBuildWall();

                    state._fsp--;


                    			current = this_BuildWall_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRobot.g:237:3: this_DropMark_4= ruleDropMark
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getDropMarkParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_DropMark_4=ruleDropMark();

                    state._fsp--;


                    			current = this_DropMark_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalRobot.g:246:3: this_WhileStatement_5= ruleWhileStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getWhileStatementParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_WhileStatement_5=ruleWhileStatement();

                    state._fsp--;


                    			current = this_WhileStatement_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalRobot.g:255:3: this_RepeatStatement_6= ruleRepeatStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getRepeatStatementParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_RepeatStatement_6=ruleRepeatStatement();

                    state._fsp--;


                    			current = this_RepeatStatement_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalRobot.g:264:3: this_IfElseStatement_7= ruleIfElseStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getIfElseStatementParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_IfElseStatement_7=ruleIfElseStatement();

                    state._fsp--;


                    			current = this_IfElseStatement_7;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleAtomic"
    // InternalRobot.g:276:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalRobot.g:276:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalRobot.g:277:2: iv_ruleAtomic= ruleAtomic EOF
            {
             newCompositeNode(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;

             current =iv_ruleAtomic; 
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
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // InternalRobot.g:283:1: ruleAtomic returns [EObject current=null] : (this_Full_0= ruleFull | this_Mark_1= ruleMark | this_Ahead_2= ruleAhead | this_Heading_3= ruleHeading | this_Not_4= ruleNot ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        EObject this_Full_0 = null;

        EObject this_Mark_1 = null;

        EObject this_Ahead_2 = null;

        EObject this_Heading_3 = null;

        EObject this_Not_4 = null;



        	enterRule();

        try {
            // InternalRobot.g:289:2: ( (this_Full_0= ruleFull | this_Mark_1= ruleMark | this_Ahead_2= ruleAhead | this_Heading_3= ruleHeading | this_Not_4= ruleNot ) )
            // InternalRobot.g:290:2: (this_Full_0= ruleFull | this_Mark_1= ruleMark | this_Ahead_2= ruleAhead | this_Heading_3= ruleHeading | this_Not_4= ruleNot )
            {
            // InternalRobot.g:290:2: (this_Full_0= ruleFull | this_Mark_1= ruleMark | this_Ahead_2= ruleAhead | this_Heading_3= ruleHeading | this_Not_4= ruleNot )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt7=1;
                }
                break;
            case 32:
                {
                alt7=2;
                }
                break;
            case 33:
                {
                alt7=3;
                }
                break;
            case 35:
                {
                alt7=4;
                }
                break;
            case 37:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalRobot.g:291:3: this_Full_0= ruleFull
                    {

                    			newCompositeNode(grammarAccess.getAtomicAccess().getFullParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Full_0=ruleFull();

                    state._fsp--;


                    			current = this_Full_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRobot.g:300:3: this_Mark_1= ruleMark
                    {

                    			newCompositeNode(grammarAccess.getAtomicAccess().getMarkParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Mark_1=ruleMark();

                    state._fsp--;


                    			current = this_Mark_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRobot.g:309:3: this_Ahead_2= ruleAhead
                    {

                    			newCompositeNode(grammarAccess.getAtomicAccess().getAheadParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Ahead_2=ruleAhead();

                    state._fsp--;


                    			current = this_Ahead_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRobot.g:318:3: this_Heading_3= ruleHeading
                    {

                    			newCompositeNode(grammarAccess.getAtomicAccess().getHeadingParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Heading_3=ruleHeading();

                    state._fsp--;


                    			current = this_Heading_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRobot.g:327:3: this_Not_4= ruleNot
                    {

                    			newCompositeNode(grammarAccess.getAtomicAccess().getNotParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Not_4=ruleNot();

                    state._fsp--;


                    			current = this_Not_4;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "entryRuleExpression"
    // InternalRobot.g:339:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalRobot.g:339:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalRobot.g:340:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalRobot.g:346:1: ruleExpression returns [EObject current=null] : this_And_0= ruleAnd ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_And_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:352:2: (this_And_0= ruleAnd )
            // InternalRobot.g:353:2: this_And_0= ruleAnd
            {

            		newCompositeNode(grammarAccess.getExpressionAccess().getAndParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_And_0=ruleAnd();

            state._fsp--;


            		current = this_And_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleEString"
    // InternalRobot.g:364:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRobot.g:364:47: (iv_ruleEString= ruleEString EOF )
            // InternalRobot.g:365:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalRobot.g:371:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRobot.g:377:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRobot.g:378:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRobot.g:378:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalRobot.g:379:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRobot.g:387:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleComment"
    // InternalRobot.g:398:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // InternalRobot.g:398:48: (iv_ruleComment= ruleComment EOF )
            // InternalRobot.g:399:2: iv_ruleComment= ruleComment EOF
            {
             newCompositeNode(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComment=ruleComment();

            state._fsp--;

             current =iv_ruleComment; 
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
    // $ANTLR end "entryRuleComment"


    // $ANTLR start "ruleComment"
    // InternalRobot.g:405:1: ruleComment returns [EObject current=null] : (otherlv_0= '#' ( (lv_comment_1_0= ruleEString ) ) otherlv_2= '\\n' ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_comment_1_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:411:2: ( (otherlv_0= '#' ( (lv_comment_1_0= ruleEString ) ) otherlv_2= '\\n' ) )
            // InternalRobot.g:412:2: (otherlv_0= '#' ( (lv_comment_1_0= ruleEString ) ) otherlv_2= '\\n' )
            {
            // InternalRobot.g:412:2: (otherlv_0= '#' ( (lv_comment_1_0= ruleEString ) ) otherlv_2= '\\n' )
            // InternalRobot.g:413:3: otherlv_0= '#' ( (lv_comment_1_0= ruleEString ) ) otherlv_2= '\\n'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCommentAccess().getNumberSignKeyword_0());
            		
            // InternalRobot.g:417:3: ( (lv_comment_1_0= ruleEString ) )
            // InternalRobot.g:418:4: (lv_comment_1_0= ruleEString )
            {
            // InternalRobot.g:418:4: (lv_comment_1_0= ruleEString )
            // InternalRobot.g:419:5: lv_comment_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCommentAccess().getCommentEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_comment_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCommentRule());
            					}
            					set(
            						current,
            						"comment",
            						lv_comment_1_0,
            						"org.xtext.Robot.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getCommentAccess().getLineFeedKeyword_2());
            		

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
    // $ANTLR end "ruleComment"


    // $ANTLR start "entryRuleSingleton"
    // InternalRobot.g:444:1: entryRuleSingleton returns [EObject current=null] : iv_ruleSingleton= ruleSingleton EOF ;
    public final EObject entryRuleSingleton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleton = null;


        try {
            // InternalRobot.g:444:50: (iv_ruleSingleton= ruleSingleton EOF )
            // InternalRobot.g:445:2: iv_ruleSingleton= ruleSingleton EOF
            {
             newCompositeNode(grammarAccess.getSingletonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSingleton=ruleSingleton();

            state._fsp--;

             current =iv_ruleSingleton; 
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
    // $ANTLR end "entryRuleSingleton"


    // $ANTLR start "ruleSingleton"
    // InternalRobot.g:451:1: ruleSingleton returns [EObject current=null] : ( (lv_type_0_0= ruleSingletonTypes ) ) ;
    public final EObject ruleSingleton() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:457:2: ( ( (lv_type_0_0= ruleSingletonTypes ) ) )
            // InternalRobot.g:458:2: ( (lv_type_0_0= ruleSingletonTypes ) )
            {
            // InternalRobot.g:458:2: ( (lv_type_0_0= ruleSingletonTypes ) )
            // InternalRobot.g:459:3: (lv_type_0_0= ruleSingletonTypes )
            {
            // InternalRobot.g:459:3: (lv_type_0_0= ruleSingletonTypes )
            // InternalRobot.g:460:4: lv_type_0_0= ruleSingletonTypes
            {

            				newCompositeNode(grammarAccess.getSingletonAccess().getTypeSingletonTypesEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_type_0_0=ruleSingletonTypes();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getSingletonRule());
            				}
            				set(
            					current,
            					"type",
            					lv_type_0_0,
            					"org.xtext.Robot.SingletonTypes");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleSingleton"


    // $ANTLR start "entryRuleTrace"
    // InternalRobot.g:480:1: entryRuleTrace returns [EObject current=null] : iv_ruleTrace= ruleTrace EOF ;
    public final EObject entryRuleTrace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrace = null;


        try {
            // InternalRobot.g:480:46: (iv_ruleTrace= ruleTrace EOF )
            // InternalRobot.g:481:2: iv_ruleTrace= ruleTrace EOF
            {
             newCompositeNode(grammarAccess.getTraceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrace=ruleTrace();

            state._fsp--;

             current =iv_ruleTrace; 
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
    // $ANTLR end "entryRuleTrace"


    // $ANTLR start "ruleTrace"
    // InternalRobot.g:487:1: ruleTrace returns [EObject current=null] : ( () otherlv_1= 'Trace' ( (lv_text_2_0= ruleString0 ) ) ) ;
    public final EObject ruleTrace() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_text_2_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:493:2: ( ( () otherlv_1= 'Trace' ( (lv_text_2_0= ruleString0 ) ) ) )
            // InternalRobot.g:494:2: ( () otherlv_1= 'Trace' ( (lv_text_2_0= ruleString0 ) ) )
            {
            // InternalRobot.g:494:2: ( () otherlv_1= 'Trace' ( (lv_text_2_0= ruleString0 ) ) )
            // InternalRobot.g:495:3: () otherlv_1= 'Trace' ( (lv_text_2_0= ruleString0 ) )
            {
            // InternalRobot.g:495:3: ()
            // InternalRobot.g:496:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTraceAccess().getTraceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getTraceAccess().getTraceKeyword_1());
            		
            // InternalRobot.g:506:3: ( (lv_text_2_0= ruleString0 ) )
            // InternalRobot.g:507:4: (lv_text_2_0= ruleString0 )
            {
            // InternalRobot.g:507:4: (lv_text_2_0= ruleString0 )
            // InternalRobot.g:508:5: lv_text_2_0= ruleString0
            {

            					newCompositeNode(grammarAccess.getTraceAccess().getTextString0ParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_text_2_0=ruleString0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTraceRule());
            					}
            					set(
            						current,
            						"text",
            						lv_text_2_0,
            						"org.xtext.Robot.String0");
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
    // $ANTLR end "ruleTrace"


    // $ANTLR start "entryRuleBuildWall"
    // InternalRobot.g:529:1: entryRuleBuildWall returns [EObject current=null] : iv_ruleBuildWall= ruleBuildWall EOF ;
    public final EObject entryRuleBuildWall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuildWall = null;


        try {
            // InternalRobot.g:529:50: (iv_ruleBuildWall= ruleBuildWall EOF )
            // InternalRobot.g:530:2: iv_ruleBuildWall= ruleBuildWall EOF
            {
             newCompositeNode(grammarAccess.getBuildWallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBuildWall=ruleBuildWall();

            state._fsp--;

             current =iv_ruleBuildWall; 
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
    // $ANTLR end "entryRuleBuildWall"


    // $ANTLR start "ruleBuildWall"
    // InternalRobot.g:536:1: ruleBuildWall returns [EObject current=null] : (otherlv_0= 'buildWall' otherlv_1= 'at' otherlv_2= 'row:' ( (lv_row_3_0= ruleEInt ) ) otherlv_4= 'col:' ( (lv_col_5_0= ruleEInt ) ) ) ;
    public final EObject ruleBuildWall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_row_3_0 = null;

        AntlrDatatypeRuleToken lv_col_5_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:542:2: ( (otherlv_0= 'buildWall' otherlv_1= 'at' otherlv_2= 'row:' ( (lv_row_3_0= ruleEInt ) ) otherlv_4= 'col:' ( (lv_col_5_0= ruleEInt ) ) ) )
            // InternalRobot.g:543:2: (otherlv_0= 'buildWall' otherlv_1= 'at' otherlv_2= 'row:' ( (lv_row_3_0= ruleEInt ) ) otherlv_4= 'col:' ( (lv_col_5_0= ruleEInt ) ) )
            {
            // InternalRobot.g:543:2: (otherlv_0= 'buildWall' otherlv_1= 'at' otherlv_2= 'row:' ( (lv_row_3_0= ruleEInt ) ) otherlv_4= 'col:' ( (lv_col_5_0= ruleEInt ) ) )
            // InternalRobot.g:544:3: otherlv_0= 'buildWall' otherlv_1= 'at' otherlv_2= 'row:' ( (lv_row_3_0= ruleEInt ) ) otherlv_4= 'col:' ( (lv_col_5_0= ruleEInt ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getBuildWallAccess().getBuildWallKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getBuildWallAccess().getAtKeyword_1());
            		
            otherlv_2=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getBuildWallAccess().getRowKeyword_2());
            		
            // InternalRobot.g:556:3: ( (lv_row_3_0= ruleEInt ) )
            // InternalRobot.g:557:4: (lv_row_3_0= ruleEInt )
            {
            // InternalRobot.g:557:4: (lv_row_3_0= ruleEInt )
            // InternalRobot.g:558:5: lv_row_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getBuildWallAccess().getRowEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_row_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBuildWallRule());
            					}
            					set(
            						current,
            						"row",
            						lv_row_3_0,
            						"org.xtext.Robot.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getBuildWallAccess().getColKeyword_4());
            		
            // InternalRobot.g:579:3: ( (lv_col_5_0= ruleEInt ) )
            // InternalRobot.g:580:4: (lv_col_5_0= ruleEInt )
            {
            // InternalRobot.g:580:4: (lv_col_5_0= ruleEInt )
            // InternalRobot.g:581:5: lv_col_5_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getBuildWallAccess().getColEIntParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_col_5_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBuildWallRule());
            					}
            					set(
            						current,
            						"col",
            						lv_col_5_0,
            						"org.xtext.Robot.EInt");
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
    // $ANTLR end "ruleBuildWall"


    // $ANTLR start "entryRuleDropMark"
    // InternalRobot.g:602:1: entryRuleDropMark returns [EObject current=null] : iv_ruleDropMark= ruleDropMark EOF ;
    public final EObject entryRuleDropMark() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropMark = null;


        try {
            // InternalRobot.g:602:49: (iv_ruleDropMark= ruleDropMark EOF )
            // InternalRobot.g:603:2: iv_ruleDropMark= ruleDropMark EOF
            {
             newCompositeNode(grammarAccess.getDropMarkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDropMark=ruleDropMark();

            state._fsp--;

             current =iv_ruleDropMark; 
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
    // $ANTLR end "entryRuleDropMark"


    // $ANTLR start "ruleDropMark"
    // InternalRobot.g:609:1: ruleDropMark returns [EObject current=null] : (otherlv_0= 'dropMark' otherlv_1= 'at' otherlv_2= 'row:' ( (lv_row_3_0= ruleEInt ) ) otherlv_4= 'col:' ( (lv_col_5_0= ruleEInt ) ) ) ;
    public final EObject ruleDropMark() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_row_3_0 = null;

        AntlrDatatypeRuleToken lv_col_5_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:615:2: ( (otherlv_0= 'dropMark' otherlv_1= 'at' otherlv_2= 'row:' ( (lv_row_3_0= ruleEInt ) ) otherlv_4= 'col:' ( (lv_col_5_0= ruleEInt ) ) ) )
            // InternalRobot.g:616:2: (otherlv_0= 'dropMark' otherlv_1= 'at' otherlv_2= 'row:' ( (lv_row_3_0= ruleEInt ) ) otherlv_4= 'col:' ( (lv_col_5_0= ruleEInt ) ) )
            {
            // InternalRobot.g:616:2: (otherlv_0= 'dropMark' otherlv_1= 'at' otherlv_2= 'row:' ( (lv_row_3_0= ruleEInt ) ) otherlv_4= 'col:' ( (lv_col_5_0= ruleEInt ) ) )
            // InternalRobot.g:617:3: otherlv_0= 'dropMark' otherlv_1= 'at' otherlv_2= 'row:' ( (lv_row_3_0= ruleEInt ) ) otherlv_4= 'col:' ( (lv_col_5_0= ruleEInt ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDropMarkAccess().getDropMarkKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getDropMarkAccess().getAtKeyword_1());
            		
            otherlv_2=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getDropMarkAccess().getRowKeyword_2());
            		
            // InternalRobot.g:629:3: ( (lv_row_3_0= ruleEInt ) )
            // InternalRobot.g:630:4: (lv_row_3_0= ruleEInt )
            {
            // InternalRobot.g:630:4: (lv_row_3_0= ruleEInt )
            // InternalRobot.g:631:5: lv_row_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getDropMarkAccess().getRowEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_row_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDropMarkRule());
            					}
            					set(
            						current,
            						"row",
            						lv_row_3_0,
            						"org.xtext.Robot.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getDropMarkAccess().getColKeyword_4());
            		
            // InternalRobot.g:652:3: ( (lv_col_5_0= ruleEInt ) )
            // InternalRobot.g:653:4: (lv_col_5_0= ruleEInt )
            {
            // InternalRobot.g:653:4: (lv_col_5_0= ruleEInt )
            // InternalRobot.g:654:5: lv_col_5_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getDropMarkAccess().getColEIntParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_col_5_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDropMarkRule());
            					}
            					set(
            						current,
            						"col",
            						lv_col_5_0,
            						"org.xtext.Robot.EInt");
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
    // $ANTLR end "ruleDropMark"


    // $ANTLR start "entryRuleWhileStatement"
    // InternalRobot.g:675:1: entryRuleWhileStatement returns [EObject current=null] : iv_ruleWhileStatement= ruleWhileStatement EOF ;
    public final EObject entryRuleWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileStatement = null;


        try {
            // InternalRobot.g:675:55: (iv_ruleWhileStatement= ruleWhileStatement EOF )
            // InternalRobot.g:676:2: iv_ruleWhileStatement= ruleWhileStatement EOF
            {
             newCompositeNode(grammarAccess.getWhileStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhileStatement=ruleWhileStatement();

            state._fsp--;

             current =iv_ruleWhileStatement; 
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
    // $ANTLR end "entryRuleWhileStatement"


    // $ANTLR start "ruleWhileStatement"
    // InternalRobot.g:682:1: ruleWhileStatement returns [EObject current=null] : (otherlv_0= 'while' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'do' (otherlv_3= '\\n' )? ( ( (lv_body_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )* )? otherlv_8= 'end' ) ;
    public final EObject ruleWhileStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_cond_1_0 = null;

        EObject lv_body_4_0 = null;

        EObject lv_body_6_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:688:2: ( (otherlv_0= 'while' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'do' (otherlv_3= '\\n' )? ( ( (lv_body_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )* )? otherlv_8= 'end' ) )
            // InternalRobot.g:689:2: (otherlv_0= 'while' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'do' (otherlv_3= '\\n' )? ( ( (lv_body_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )* )? otherlv_8= 'end' )
            {
            // InternalRobot.g:689:2: (otherlv_0= 'while' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'do' (otherlv_3= '\\n' )? ( ( (lv_body_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )* )? otherlv_8= 'end' )
            // InternalRobot.g:690:3: otherlv_0= 'while' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'do' (otherlv_3= '\\n' )? ( ( (lv_body_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )* )? otherlv_8= 'end'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getWhileStatementAccess().getWhileKeyword_0());
            		
            // InternalRobot.g:694:3: ( (lv_cond_1_0= ruleExpression ) )
            // InternalRobot.g:695:4: (lv_cond_1_0= ruleExpression )
            {
            // InternalRobot.g:695:4: (lv_cond_1_0= ruleExpression )
            // InternalRobot.g:696:5: lv_cond_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getWhileStatementAccess().getCondExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_cond_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileStatementRule());
            					}
            					set(
            						current,
            						"cond",
            						lv_cond_1_0,
            						"org.xtext.Robot.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getWhileStatementAccess().getDoKeyword_2());
            		
            // InternalRobot.g:717:3: (otherlv_3= '\\n' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==14) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRobot.g:718:4: otherlv_3= '\\n'
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getWhileStatementAccess().getLineFeedKeyword_3());
                    			

                    }
                    break;

            }

            // InternalRobot.g:723:3: ( ( (lv_body_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=16 && LA13_0<=18)||(LA13_0>=22 && LA13_0<=23)||LA13_0==25||LA13_0==27||(LA13_0>=38 && LA13_0<=41)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRobot.g:724:4: ( (lv_body_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )*
                    {
                    // InternalRobot.g:724:4: ( (lv_body_4_0= ruleStatement ) )
                    // InternalRobot.g:725:5: (lv_body_4_0= ruleStatement )
                    {
                    // InternalRobot.g:725:5: (lv_body_4_0= ruleStatement )
                    // InternalRobot.g:726:6: lv_body_4_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getWhileStatementAccess().getBodyStatementParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_body_4_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWhileStatementRule());
                    						}
                    						add(
                    							current,
                    							"body",
                    							lv_body_4_0,
                    							"org.xtext.Robot.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRobot.g:743:4: (otherlv_5= '\\n' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==14) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalRobot.g:744:5: otherlv_5= '\\n'
                            {
                            otherlv_5=(Token)match(input,14,FOLLOW_7); 

                            					newLeafNode(otherlv_5, grammarAccess.getWhileStatementAccess().getLineFeedKeyword_4_1());
                            				

                            }
                            break;

                    }

                    // InternalRobot.g:749:4: ( ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>=16 && LA12_0<=18)||(LA12_0>=22 && LA12_0<=23)||LA12_0==25||LA12_0==27||(LA12_0>=38 && LA12_0<=41)) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalRobot.g:750:5: ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= '\\n' )?
                    	    {
                    	    // InternalRobot.g:750:5: ( (lv_body_6_0= ruleStatement ) )
                    	    // InternalRobot.g:751:6: (lv_body_6_0= ruleStatement )
                    	    {
                    	    // InternalRobot.g:751:6: (lv_body_6_0= ruleStatement )
                    	    // InternalRobot.g:752:7: lv_body_6_0= ruleStatement
                    	    {

                    	    							newCompositeNode(grammarAccess.getWhileStatementAccess().getBodyStatementParserRuleCall_4_2_0_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_body_6_0=ruleStatement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getWhileStatementRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"body",
                    	    								lv_body_6_0,
                    	    								"org.xtext.Robot.Statement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    // InternalRobot.g:769:5: (otherlv_7= '\\n' )?
                    	    int alt11=2;
                    	    int LA11_0 = input.LA(1);

                    	    if ( (LA11_0==14) ) {
                    	        alt11=1;
                    	    }
                    	    switch (alt11) {
                    	        case 1 :
                    	            // InternalRobot.g:770:6: otherlv_7= '\\n'
                    	            {
                    	            otherlv_7=(Token)match(input,14,FOLLOW_7); 

                    	            						newLeafNode(otherlv_7, grammarAccess.getWhileStatementAccess().getLineFeedKeyword_4_2_1());
                    	            					

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getWhileStatementAccess().getEndKeyword_5());
            		

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
    // $ANTLR end "ruleWhileStatement"


    // $ANTLR start "entryRuleRepeatStatement"
    // InternalRobot.g:785:1: entryRuleRepeatStatement returns [EObject current=null] : iv_ruleRepeatStatement= ruleRepeatStatement EOF ;
    public final EObject entryRuleRepeatStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepeatStatement = null;


        try {
            // InternalRobot.g:785:56: (iv_ruleRepeatStatement= ruleRepeatStatement EOF )
            // InternalRobot.g:786:2: iv_ruleRepeatStatement= ruleRepeatStatement EOF
            {
             newCompositeNode(grammarAccess.getRepeatStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRepeatStatement=ruleRepeatStatement();

            state._fsp--;

             current =iv_ruleRepeatStatement; 
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
    // $ANTLR end "entryRuleRepeatStatement"


    // $ANTLR start "ruleRepeatStatement"
    // InternalRobot.g:792:1: ruleRepeatStatement returns [EObject current=null] : (otherlv_0= 'repeat' ( (lv_times_1_0= ruleEInt ) ) otherlv_2= 'times' (otherlv_3= '\\n' )? ( ( (lv_body_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )* )? otherlv_8= 'end' ) ;
    public final EObject ruleRepeatStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_times_1_0 = null;

        EObject lv_body_4_0 = null;

        EObject lv_body_6_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:798:2: ( (otherlv_0= 'repeat' ( (lv_times_1_0= ruleEInt ) ) otherlv_2= 'times' (otherlv_3= '\\n' )? ( ( (lv_body_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )* )? otherlv_8= 'end' ) )
            // InternalRobot.g:799:2: (otherlv_0= 'repeat' ( (lv_times_1_0= ruleEInt ) ) otherlv_2= 'times' (otherlv_3= '\\n' )? ( ( (lv_body_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )* )? otherlv_8= 'end' )
            {
            // InternalRobot.g:799:2: (otherlv_0= 'repeat' ( (lv_times_1_0= ruleEInt ) ) otherlv_2= 'times' (otherlv_3= '\\n' )? ( ( (lv_body_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )* )? otherlv_8= 'end' )
            // InternalRobot.g:800:3: otherlv_0= 'repeat' ( (lv_times_1_0= ruleEInt ) ) otherlv_2= 'times' (otherlv_3= '\\n' )? ( ( (lv_body_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )* )? otherlv_8= 'end'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getRepeatStatementAccess().getRepeatKeyword_0());
            		
            // InternalRobot.g:804:3: ( (lv_times_1_0= ruleEInt ) )
            // InternalRobot.g:805:4: (lv_times_1_0= ruleEInt )
            {
            // InternalRobot.g:805:4: (lv_times_1_0= ruleEInt )
            // InternalRobot.g:806:5: lv_times_1_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getRepeatStatementAccess().getTimesEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_times_1_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRepeatStatementRule());
            					}
            					set(
            						current,
            						"times",
            						lv_times_1_0,
            						"org.xtext.Robot.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getRepeatStatementAccess().getTimesKeyword_2());
            		
            // InternalRobot.g:827:3: (otherlv_3= '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==14) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRobot.g:828:4: otherlv_3= '\\n'
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getRepeatStatementAccess().getLineFeedKeyword_3());
                    			

                    }
                    break;

            }

            // InternalRobot.g:833:3: ( ( (lv_body_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=16 && LA18_0<=18)||(LA18_0>=22 && LA18_0<=23)||LA18_0==25||LA18_0==27||(LA18_0>=38 && LA18_0<=41)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRobot.g:834:4: ( (lv_body_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )*
                    {
                    // InternalRobot.g:834:4: ( (lv_body_4_0= ruleStatement ) )
                    // InternalRobot.g:835:5: (lv_body_4_0= ruleStatement )
                    {
                    // InternalRobot.g:835:5: (lv_body_4_0= ruleStatement )
                    // InternalRobot.g:836:6: lv_body_4_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getRepeatStatementAccess().getBodyStatementParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_body_4_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRepeatStatementRule());
                    						}
                    						add(
                    							current,
                    							"body",
                    							lv_body_4_0,
                    							"org.xtext.Robot.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRobot.g:853:4: (otherlv_5= '\\n' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==14) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalRobot.g:854:5: otherlv_5= '\\n'
                            {
                            otherlv_5=(Token)match(input,14,FOLLOW_7); 

                            					newLeafNode(otherlv_5, grammarAccess.getRepeatStatementAccess().getLineFeedKeyword_4_1());
                            				

                            }
                            break;

                    }

                    // InternalRobot.g:859:4: ( ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( ((LA17_0>=16 && LA17_0<=18)||(LA17_0>=22 && LA17_0<=23)||LA17_0==25||LA17_0==27||(LA17_0>=38 && LA17_0<=41)) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalRobot.g:860:5: ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= '\\n' )?
                    	    {
                    	    // InternalRobot.g:860:5: ( (lv_body_6_0= ruleStatement ) )
                    	    // InternalRobot.g:861:6: (lv_body_6_0= ruleStatement )
                    	    {
                    	    // InternalRobot.g:861:6: (lv_body_6_0= ruleStatement )
                    	    // InternalRobot.g:862:7: lv_body_6_0= ruleStatement
                    	    {

                    	    							newCompositeNode(grammarAccess.getRepeatStatementAccess().getBodyStatementParserRuleCall_4_2_0_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_body_6_0=ruleStatement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRepeatStatementRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"body",
                    	    								lv_body_6_0,
                    	    								"org.xtext.Robot.Statement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    // InternalRobot.g:879:5: (otherlv_7= '\\n' )?
                    	    int alt16=2;
                    	    int LA16_0 = input.LA(1);

                    	    if ( (LA16_0==14) ) {
                    	        alt16=1;
                    	    }
                    	    switch (alt16) {
                    	        case 1 :
                    	            // InternalRobot.g:880:6: otherlv_7= '\\n'
                    	            {
                    	            otherlv_7=(Token)match(input,14,FOLLOW_7); 

                    	            						newLeafNode(otherlv_7, grammarAccess.getRepeatStatementAccess().getLineFeedKeyword_4_2_1());
                    	            					

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getRepeatStatementAccess().getEndKeyword_5());
            		

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
    // $ANTLR end "ruleRepeatStatement"


    // $ANTLR start "entryRuleIfElseStatement"
    // InternalRobot.g:895:1: entryRuleIfElseStatement returns [EObject current=null] : iv_ruleIfElseStatement= ruleIfElseStatement EOF ;
    public final EObject entryRuleIfElseStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfElseStatement = null;


        try {
            // InternalRobot.g:895:56: (iv_ruleIfElseStatement= ruleIfElseStatement EOF )
            // InternalRobot.g:896:2: iv_ruleIfElseStatement= ruleIfElseStatement EOF
            {
             newCompositeNode(grammarAccess.getIfElseStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfElseStatement=ruleIfElseStatement();

            state._fsp--;

             current =iv_ruleIfElseStatement; 
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
    // $ANTLR end "entryRuleIfElseStatement"


    // $ANTLR start "ruleIfElseStatement"
    // InternalRobot.g:902:1: ruleIfElseStatement returns [EObject current=null] : (otherlv_0= 'if' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'then' (otherlv_3= '\\n' )? ( ( (lv_ifbody_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_ifbody_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )* )? (otherlv_8= 'else' (otherlv_9= '\\n' )? ( ( (lv_elsebody_10_0= ruleStatement ) ) (otherlv_11= '\\n' )? ( ( (lv_elsebody_12_0= ruleStatement ) ) (otherlv_13= '\\n' )? )* )? )? otherlv_14= 'end' ) ;
    public final EObject ruleIfElseStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        EObject lv_cond_1_0 = null;

        EObject lv_ifbody_4_0 = null;

        EObject lv_ifbody_6_0 = null;

        EObject lv_elsebody_10_0 = null;

        EObject lv_elsebody_12_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:908:2: ( (otherlv_0= 'if' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'then' (otherlv_3= '\\n' )? ( ( (lv_ifbody_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_ifbody_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )* )? (otherlv_8= 'else' (otherlv_9= '\\n' )? ( ( (lv_elsebody_10_0= ruleStatement ) ) (otherlv_11= '\\n' )? ( ( (lv_elsebody_12_0= ruleStatement ) ) (otherlv_13= '\\n' )? )* )? )? otherlv_14= 'end' ) )
            // InternalRobot.g:909:2: (otherlv_0= 'if' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'then' (otherlv_3= '\\n' )? ( ( (lv_ifbody_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_ifbody_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )* )? (otherlv_8= 'else' (otherlv_9= '\\n' )? ( ( (lv_elsebody_10_0= ruleStatement ) ) (otherlv_11= '\\n' )? ( ( (lv_elsebody_12_0= ruleStatement ) ) (otherlv_13= '\\n' )? )* )? )? otherlv_14= 'end' )
            {
            // InternalRobot.g:909:2: (otherlv_0= 'if' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'then' (otherlv_3= '\\n' )? ( ( (lv_ifbody_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_ifbody_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )* )? (otherlv_8= 'else' (otherlv_9= '\\n' )? ( ( (lv_elsebody_10_0= ruleStatement ) ) (otherlv_11= '\\n' )? ( ( (lv_elsebody_12_0= ruleStatement ) ) (otherlv_13= '\\n' )? )* )? )? otherlv_14= 'end' )
            // InternalRobot.g:910:3: otherlv_0= 'if' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'then' (otherlv_3= '\\n' )? ( ( (lv_ifbody_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_ifbody_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )* )? (otherlv_8= 'else' (otherlv_9= '\\n' )? ( ( (lv_elsebody_10_0= ruleStatement ) ) (otherlv_11= '\\n' )? ( ( (lv_elsebody_12_0= ruleStatement ) ) (otherlv_13= '\\n' )? )* )? )? otherlv_14= 'end'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getIfElseStatementAccess().getIfKeyword_0());
            		
            // InternalRobot.g:914:3: ( (lv_cond_1_0= ruleExpression ) )
            // InternalRobot.g:915:4: (lv_cond_1_0= ruleExpression )
            {
            // InternalRobot.g:915:4: (lv_cond_1_0= ruleExpression )
            // InternalRobot.g:916:5: lv_cond_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getIfElseStatementAccess().getCondExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
            lv_cond_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfElseStatementRule());
            					}
            					set(
            						current,
            						"cond",
            						lv_cond_1_0,
            						"org.xtext.Robot.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getIfElseStatementAccess().getThenKeyword_2());
            		
            // InternalRobot.g:937:3: (otherlv_3= '\\n' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==14) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRobot.g:938:4: otherlv_3= '\\n'
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_19); 

                    				newLeafNode(otherlv_3, grammarAccess.getIfElseStatementAccess().getLineFeedKeyword_3());
                    			

                    }
                    break;

            }

            // InternalRobot.g:943:3: ( ( (lv_ifbody_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_ifbody_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=16 && LA23_0<=18)||(LA23_0>=22 && LA23_0<=23)||LA23_0==25||LA23_0==27||(LA23_0>=38 && LA23_0<=41)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalRobot.g:944:4: ( (lv_ifbody_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_ifbody_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )*
                    {
                    // InternalRobot.g:944:4: ( (lv_ifbody_4_0= ruleStatement ) )
                    // InternalRobot.g:945:5: (lv_ifbody_4_0= ruleStatement )
                    {
                    // InternalRobot.g:945:5: (lv_ifbody_4_0= ruleStatement )
                    // InternalRobot.g:946:6: lv_ifbody_4_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getIfElseStatementAccess().getIfbodyStatementParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_ifbody_4_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIfElseStatementRule());
                    						}
                    						add(
                    							current,
                    							"ifbody",
                    							lv_ifbody_4_0,
                    							"org.xtext.Robot.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRobot.g:963:4: (otherlv_5= '\\n' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==14) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalRobot.g:964:5: otherlv_5= '\\n'
                            {
                            otherlv_5=(Token)match(input,14,FOLLOW_19); 

                            					newLeafNode(otherlv_5, grammarAccess.getIfElseStatementAccess().getLineFeedKeyword_4_1());
                            				

                            }
                            break;

                    }

                    // InternalRobot.g:969:4: ( ( (lv_ifbody_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( ((LA22_0>=16 && LA22_0<=18)||(LA22_0>=22 && LA22_0<=23)||LA22_0==25||LA22_0==27||(LA22_0>=38 && LA22_0<=41)) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalRobot.g:970:5: ( (lv_ifbody_6_0= ruleStatement ) ) (otherlv_7= '\\n' )?
                    	    {
                    	    // InternalRobot.g:970:5: ( (lv_ifbody_6_0= ruleStatement ) )
                    	    // InternalRobot.g:971:6: (lv_ifbody_6_0= ruleStatement )
                    	    {
                    	    // InternalRobot.g:971:6: (lv_ifbody_6_0= ruleStatement )
                    	    // InternalRobot.g:972:7: lv_ifbody_6_0= ruleStatement
                    	    {

                    	    							newCompositeNode(grammarAccess.getIfElseStatementAccess().getIfbodyStatementParserRuleCall_4_2_0_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_ifbody_6_0=ruleStatement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getIfElseStatementRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ifbody",
                    	    								lv_ifbody_6_0,
                    	    								"org.xtext.Robot.Statement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    // InternalRobot.g:989:5: (otherlv_7= '\\n' )?
                    	    int alt21=2;
                    	    int LA21_0 = input.LA(1);

                    	    if ( (LA21_0==14) ) {
                    	        alt21=1;
                    	    }
                    	    switch (alt21) {
                    	        case 1 :
                    	            // InternalRobot.g:990:6: otherlv_7= '\\n'
                    	            {
                    	            otherlv_7=(Token)match(input,14,FOLLOW_19); 

                    	            						newLeafNode(otherlv_7, grammarAccess.getIfElseStatementAccess().getLineFeedKeyword_4_2_1());
                    	            					

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRobot.g:997:3: (otherlv_8= 'else' (otherlv_9= '\\n' )? ( ( (lv_elsebody_10_0= ruleStatement ) ) (otherlv_11= '\\n' )? ( ( (lv_elsebody_12_0= ruleStatement ) ) (otherlv_13= '\\n' )? )* )? )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==29) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalRobot.g:998:4: otherlv_8= 'else' (otherlv_9= '\\n' )? ( ( (lv_elsebody_10_0= ruleStatement ) ) (otherlv_11= '\\n' )? ( ( (lv_elsebody_12_0= ruleStatement ) ) (otherlv_13= '\\n' )? )* )?
                    {
                    otherlv_8=(Token)match(input,29,FOLLOW_6); 

                    				newLeafNode(otherlv_8, grammarAccess.getIfElseStatementAccess().getElseKeyword_5_0());
                    			
                    // InternalRobot.g:1002:4: (otherlv_9= '\\n' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==14) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalRobot.g:1003:5: otherlv_9= '\\n'
                            {
                            otherlv_9=(Token)match(input,14,FOLLOW_7); 

                            					newLeafNode(otherlv_9, grammarAccess.getIfElseStatementAccess().getLineFeedKeyword_5_1());
                            				

                            }
                            break;

                    }

                    // InternalRobot.g:1008:4: ( ( (lv_elsebody_10_0= ruleStatement ) ) (otherlv_11= '\\n' )? ( ( (lv_elsebody_12_0= ruleStatement ) ) (otherlv_13= '\\n' )? )* )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( ((LA28_0>=16 && LA28_0<=18)||(LA28_0>=22 && LA28_0<=23)||LA28_0==25||LA28_0==27||(LA28_0>=38 && LA28_0<=41)) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalRobot.g:1009:5: ( (lv_elsebody_10_0= ruleStatement ) ) (otherlv_11= '\\n' )? ( ( (lv_elsebody_12_0= ruleStatement ) ) (otherlv_13= '\\n' )? )*
                            {
                            // InternalRobot.g:1009:5: ( (lv_elsebody_10_0= ruleStatement ) )
                            // InternalRobot.g:1010:6: (lv_elsebody_10_0= ruleStatement )
                            {
                            // InternalRobot.g:1010:6: (lv_elsebody_10_0= ruleStatement )
                            // InternalRobot.g:1011:7: lv_elsebody_10_0= ruleStatement
                            {

                            							newCompositeNode(grammarAccess.getIfElseStatementAccess().getElsebodyStatementParserRuleCall_5_2_0_0());
                            						
                            pushFollow(FOLLOW_6);
                            lv_elsebody_10_0=ruleStatement();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getIfElseStatementRule());
                            							}
                            							add(
                            								current,
                            								"elsebody",
                            								lv_elsebody_10_0,
                            								"org.xtext.Robot.Statement");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalRobot.g:1028:5: (otherlv_11= '\\n' )?
                            int alt25=2;
                            int LA25_0 = input.LA(1);

                            if ( (LA25_0==14) ) {
                                alt25=1;
                            }
                            switch (alt25) {
                                case 1 :
                                    // InternalRobot.g:1029:6: otherlv_11= '\\n'
                                    {
                                    otherlv_11=(Token)match(input,14,FOLLOW_7); 

                                    						newLeafNode(otherlv_11, grammarAccess.getIfElseStatementAccess().getLineFeedKeyword_5_2_1());
                                    					

                                    }
                                    break;

                            }

                            // InternalRobot.g:1034:5: ( ( (lv_elsebody_12_0= ruleStatement ) ) (otherlv_13= '\\n' )? )*
                            loop27:
                            do {
                                int alt27=2;
                                int LA27_0 = input.LA(1);

                                if ( ((LA27_0>=16 && LA27_0<=18)||(LA27_0>=22 && LA27_0<=23)||LA27_0==25||LA27_0==27||(LA27_0>=38 && LA27_0<=41)) ) {
                                    alt27=1;
                                }


                                switch (alt27) {
                            	case 1 :
                            	    // InternalRobot.g:1035:6: ( (lv_elsebody_12_0= ruleStatement ) ) (otherlv_13= '\\n' )?
                            	    {
                            	    // InternalRobot.g:1035:6: ( (lv_elsebody_12_0= ruleStatement ) )
                            	    // InternalRobot.g:1036:7: (lv_elsebody_12_0= ruleStatement )
                            	    {
                            	    // InternalRobot.g:1036:7: (lv_elsebody_12_0= ruleStatement )
                            	    // InternalRobot.g:1037:8: lv_elsebody_12_0= ruleStatement
                            	    {

                            	    								newCompositeNode(grammarAccess.getIfElseStatementAccess().getElsebodyStatementParserRuleCall_5_2_2_0_0());
                            	    							
                            	    pushFollow(FOLLOW_6);
                            	    lv_elsebody_12_0=ruleStatement();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getIfElseStatementRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"elsebody",
                            	    									lv_elsebody_12_0,
                            	    									"org.xtext.Robot.Statement");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }

                            	    // InternalRobot.g:1054:6: (otherlv_13= '\\n' )?
                            	    int alt26=2;
                            	    int LA26_0 = input.LA(1);

                            	    if ( (LA26_0==14) ) {
                            	        alt26=1;
                            	    }
                            	    switch (alt26) {
                            	        case 1 :
                            	            // InternalRobot.g:1055:7: otherlv_13= '\\n'
                            	            {
                            	            otherlv_13=(Token)match(input,14,FOLLOW_7); 

                            	            							newLeafNode(otherlv_13, grammarAccess.getIfElseStatementAccess().getLineFeedKeyword_5_2_2_1());
                            	            						

                            	            }
                            	            break;

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop27;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getIfElseStatementAccess().getEndKeyword_6());
            		

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
    // $ANTLR end "ruleIfElseStatement"


    // $ANTLR start "entryRuleString0"
    // InternalRobot.g:1071:1: entryRuleString0 returns [EObject current=null] : iv_ruleString0= ruleString0 EOF ;
    public final EObject entryRuleString0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleString0 = null;


        try {
            // InternalRobot.g:1071:48: (iv_ruleString0= ruleString0 EOF )
            // InternalRobot.g:1072:2: iv_ruleString0= ruleString0 EOF
            {
             newCompositeNode(grammarAccess.getString0Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleString0=ruleString0();

            state._fsp--;

             current =iv_ruleString0; 
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
    // $ANTLR end "entryRuleString0"


    // $ANTLR start "ruleString0"
    // InternalRobot.g:1078:1: ruleString0 returns [EObject current=null] : (otherlv_0= '\"' ( (lv_text_1_0= ruleEString ) ) otherlv_2= '\"' ) ;
    public final EObject ruleString0() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_text_1_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:1084:2: ( (otherlv_0= '\"' ( (lv_text_1_0= ruleEString ) ) otherlv_2= '\"' ) )
            // InternalRobot.g:1085:2: (otherlv_0= '\"' ( (lv_text_1_0= ruleEString ) ) otherlv_2= '\"' )
            {
            // InternalRobot.g:1085:2: (otherlv_0= '\"' ( (lv_text_1_0= ruleEString ) ) otherlv_2= '\"' )
            // InternalRobot.g:1086:3: otherlv_0= '\"' ( (lv_text_1_0= ruleEString ) ) otherlv_2= '\"'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getString0Access().getQuotationMarkKeyword_0());
            		
            // InternalRobot.g:1090:3: ( (lv_text_1_0= ruleEString ) )
            // InternalRobot.g:1091:4: (lv_text_1_0= ruleEString )
            {
            // InternalRobot.g:1091:4: (lv_text_1_0= ruleEString )
            // InternalRobot.g:1092:5: lv_text_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getString0Access().getTextEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_text_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getString0Rule());
            					}
            					set(
            						current,
            						"text",
            						lv_text_1_0,
            						"org.xtext.Robot.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getString0Access().getQuotationMarkKeyword_2());
            		

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
    // $ANTLR end "ruleString0"


    // $ANTLR start "entryRuleEInt"
    // InternalRobot.g:1117:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalRobot.g:1117:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalRobot.g:1118:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalRobot.g:1124:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalRobot.g:1130:2: (this_INT_0= RULE_INT )
            // InternalRobot.g:1131:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getEIntAccess().getINTTerminalRuleCall());
            	

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleFull"
    // InternalRobot.g:1141:1: entryRuleFull returns [EObject current=null] : iv_ruleFull= ruleFull EOF ;
    public final EObject entryRuleFull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFull = null;


        try {
            // InternalRobot.g:1141:45: (iv_ruleFull= ruleFull EOF )
            // InternalRobot.g:1142:2: iv_ruleFull= ruleFull EOF
            {
             newCompositeNode(grammarAccess.getFullRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFull=ruleFull();

            state._fsp--;

             current =iv_ruleFull; 
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
    // $ANTLR end "entryRuleFull"


    // $ANTLR start "ruleFull"
    // InternalRobot.g:1148:1: ruleFull returns [EObject current=null] : ( () otherlv_1= 'full' ) ;
    public final EObject ruleFull() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRobot.g:1154:2: ( ( () otherlv_1= 'full' ) )
            // InternalRobot.g:1155:2: ( () otherlv_1= 'full' )
            {
            // InternalRobot.g:1155:2: ( () otherlv_1= 'full' )
            // InternalRobot.g:1156:3: () otherlv_1= 'full'
            {
            // InternalRobot.g:1156:3: ()
            // InternalRobot.g:1157:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFullAccess().getFullAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getFullAccess().getFullKeyword_1());
            		

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
    // $ANTLR end "ruleFull"


    // $ANTLR start "entryRuleMark"
    // InternalRobot.g:1171:1: entryRuleMark returns [EObject current=null] : iv_ruleMark= ruleMark EOF ;
    public final EObject entryRuleMark() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMark = null;


        try {
            // InternalRobot.g:1171:45: (iv_ruleMark= ruleMark EOF )
            // InternalRobot.g:1172:2: iv_ruleMark= ruleMark EOF
            {
             newCompositeNode(grammarAccess.getMarkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMark=ruleMark();

            state._fsp--;

             current =iv_ruleMark; 
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
    // $ANTLR end "entryRuleMark"


    // $ANTLR start "ruleMark"
    // InternalRobot.g:1178:1: ruleMark returns [EObject current=null] : ( () otherlv_1= 'mark' ) ;
    public final EObject ruleMark() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRobot.g:1184:2: ( ( () otherlv_1= 'mark' ) )
            // InternalRobot.g:1185:2: ( () otherlv_1= 'mark' )
            {
            // InternalRobot.g:1185:2: ( () otherlv_1= 'mark' )
            // InternalRobot.g:1186:3: () otherlv_1= 'mark'
            {
            // InternalRobot.g:1186:3: ()
            // InternalRobot.g:1187:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMarkAccess().getMarkAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getMarkAccess().getMarkKeyword_1());
            		

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
    // $ANTLR end "ruleMark"


    // $ANTLR start "entryRuleAhead"
    // InternalRobot.g:1201:1: entryRuleAhead returns [EObject current=null] : iv_ruleAhead= ruleAhead EOF ;
    public final EObject entryRuleAhead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAhead = null;


        try {
            // InternalRobot.g:1201:46: (iv_ruleAhead= ruleAhead EOF )
            // InternalRobot.g:1202:2: iv_ruleAhead= ruleAhead EOF
            {
             newCompositeNode(grammarAccess.getAheadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAhead=ruleAhead();

            state._fsp--;

             current =iv_ruleAhead; 
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
    // $ANTLR end "entryRuleAhead"


    // $ANTLR start "ruleAhead"
    // InternalRobot.g:1208:1: ruleAhead returns [EObject current=null] : ( () otherlv_1= 'wall' otherlv_2= 'ahead' ) ;
    public final EObject ruleAhead() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRobot.g:1214:2: ( ( () otherlv_1= 'wall' otherlv_2= 'ahead' ) )
            // InternalRobot.g:1215:2: ( () otherlv_1= 'wall' otherlv_2= 'ahead' )
            {
            // InternalRobot.g:1215:2: ( () otherlv_1= 'wall' otherlv_2= 'ahead' )
            // InternalRobot.g:1216:3: () otherlv_1= 'wall' otherlv_2= 'ahead'
            {
            // InternalRobot.g:1216:3: ()
            // InternalRobot.g:1217:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAheadAccess().getAheadAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getAheadAccess().getWallKeyword_1());
            		
            otherlv_2=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getAheadAccess().getAheadKeyword_2());
            		

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
    // $ANTLR end "ruleAhead"


    // $ANTLR start "entryRuleHeading"
    // InternalRobot.g:1235:1: entryRuleHeading returns [EObject current=null] : iv_ruleHeading= ruleHeading EOF ;
    public final EObject entryRuleHeading() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeading = null;


        try {
            // InternalRobot.g:1235:48: (iv_ruleHeading= ruleHeading EOF )
            // InternalRobot.g:1236:2: iv_ruleHeading= ruleHeading EOF
            {
             newCompositeNode(grammarAccess.getHeadingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHeading=ruleHeading();

            state._fsp--;

             current =iv_ruleHeading; 
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
    // $ANTLR end "entryRuleHeading"


    // $ANTLR start "ruleHeading"
    // InternalRobot.g:1242:1: ruleHeading returns [EObject current=null] : (otherlv_0= 'heading' ( (lv_wind_1_0= ruleOrientation ) ) ) ;
    public final EObject ruleHeading() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_wind_1_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:1248:2: ( (otherlv_0= 'heading' ( (lv_wind_1_0= ruleOrientation ) ) ) )
            // InternalRobot.g:1249:2: (otherlv_0= 'heading' ( (lv_wind_1_0= ruleOrientation ) ) )
            {
            // InternalRobot.g:1249:2: (otherlv_0= 'heading' ( (lv_wind_1_0= ruleOrientation ) ) )
            // InternalRobot.g:1250:3: otherlv_0= 'heading' ( (lv_wind_1_0= ruleOrientation ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getHeadingAccess().getHeadingKeyword_0());
            		
            // InternalRobot.g:1254:3: ( (lv_wind_1_0= ruleOrientation ) )
            // InternalRobot.g:1255:4: (lv_wind_1_0= ruleOrientation )
            {
            // InternalRobot.g:1255:4: (lv_wind_1_0= ruleOrientation )
            // InternalRobot.g:1256:5: lv_wind_1_0= ruleOrientation
            {

            					newCompositeNode(grammarAccess.getHeadingAccess().getWindOrientationEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_wind_1_0=ruleOrientation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHeadingRule());
            					}
            					set(
            						current,
            						"wind",
            						lv_wind_1_0,
            						"org.xtext.Robot.Orientation");
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
    // $ANTLR end "ruleHeading"


    // $ANTLR start "entryRuleAnd"
    // InternalRobot.g:1277:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalRobot.g:1277:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalRobot.g:1278:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalRobot.g:1284:1: ruleAnd returns [EObject current=null] : ( ( (lv_a_0_0= ruleAtomic ) ) (otherlv_1= 'and' ( (lv_b_2_0= ruleExpression ) )? )? ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_a_0_0 = null;

        EObject lv_b_2_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:1290:2: ( ( ( (lv_a_0_0= ruleAtomic ) ) (otherlv_1= 'and' ( (lv_b_2_0= ruleExpression ) )? )? ) )
            // InternalRobot.g:1291:2: ( ( (lv_a_0_0= ruleAtomic ) ) (otherlv_1= 'and' ( (lv_b_2_0= ruleExpression ) )? )? )
            {
            // InternalRobot.g:1291:2: ( ( (lv_a_0_0= ruleAtomic ) ) (otherlv_1= 'and' ( (lv_b_2_0= ruleExpression ) )? )? )
            // InternalRobot.g:1292:3: ( (lv_a_0_0= ruleAtomic ) ) (otherlv_1= 'and' ( (lv_b_2_0= ruleExpression ) )? )?
            {
            // InternalRobot.g:1292:3: ( (lv_a_0_0= ruleAtomic ) )
            // InternalRobot.g:1293:4: (lv_a_0_0= ruleAtomic )
            {
            // InternalRobot.g:1293:4: (lv_a_0_0= ruleAtomic )
            // InternalRobot.g:1294:5: lv_a_0_0= ruleAtomic
            {

            					newCompositeNode(grammarAccess.getAndAccess().getAAtomicParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_22);
            lv_a_0_0=ruleAtomic();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAndRule());
            					}
            					set(
            						current,
            						"a",
            						lv_a_0_0,
            						"org.xtext.Robot.Atomic");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRobot.g:1311:3: (otherlv_1= 'and' ( (lv_b_2_0= ruleExpression ) )? )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==36) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalRobot.g:1312:4: otherlv_1= 'and' ( (lv_b_2_0= ruleExpression ) )?
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_23); 

                    				newLeafNode(otherlv_1, grammarAccess.getAndAccess().getAndKeyword_1_0());
                    			
                    // InternalRobot.g:1316:4: ( (lv_b_2_0= ruleExpression ) )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( ((LA30_0>=31 && LA30_0<=33)||LA30_0==35||LA30_0==37) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalRobot.g:1317:5: (lv_b_2_0= ruleExpression )
                            {
                            // InternalRobot.g:1317:5: (lv_b_2_0= ruleExpression )
                            // InternalRobot.g:1318:6: lv_b_2_0= ruleExpression
                            {

                            						newCompositeNode(grammarAccess.getAndAccess().getBExpressionParserRuleCall_1_1_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_b_2_0=ruleExpression();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getAndRule());
                            						}
                            						set(
                            							current,
                            							"b",
                            							lv_b_2_0,
                            							"org.xtext.Robot.Expression");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleNot"
    // InternalRobot.g:1340:1: entryRuleNot returns [EObject current=null] : iv_ruleNot= ruleNot EOF ;
    public final EObject entryRuleNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot = null;


        try {
            // InternalRobot.g:1340:44: (iv_ruleNot= ruleNot EOF )
            // InternalRobot.g:1341:2: iv_ruleNot= ruleNot EOF
            {
             newCompositeNode(grammarAccess.getNotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNot=ruleNot();

            state._fsp--;

             current =iv_ruleNot; 
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
    // $ANTLR end "entryRuleNot"


    // $ANTLR start "ruleNot"
    // InternalRobot.g:1347:1: ruleNot returns [EObject current=null] : (otherlv_0= 'not' ( (lv_e_1_0= ruleAtomic ) ) ) ;
    public final EObject ruleNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_e_1_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:1353:2: ( (otherlv_0= 'not' ( (lv_e_1_0= ruleAtomic ) ) ) )
            // InternalRobot.g:1354:2: (otherlv_0= 'not' ( (lv_e_1_0= ruleAtomic ) ) )
            {
            // InternalRobot.g:1354:2: (otherlv_0= 'not' ( (lv_e_1_0= ruleAtomic ) ) )
            // InternalRobot.g:1355:3: otherlv_0= 'not' ( (lv_e_1_0= ruleAtomic ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getNotAccess().getNotKeyword_0());
            		
            // InternalRobot.g:1359:3: ( (lv_e_1_0= ruleAtomic ) )
            // InternalRobot.g:1360:4: (lv_e_1_0= ruleAtomic )
            {
            // InternalRobot.g:1360:4: (lv_e_1_0= ruleAtomic )
            // InternalRobot.g:1361:5: lv_e_1_0= ruleAtomic
            {

            					newCompositeNode(grammarAccess.getNotAccess().getEAtomicParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_e_1_0=ruleAtomic();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNotRule());
            					}
            					set(
            						current,
            						"e",
            						lv_e_1_0,
            						"org.xtext.Robot.Atomic");
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
    // $ANTLR end "ruleNot"


    // $ANTLR start "ruleSingletonTypes"
    // InternalRobot.g:1382:1: ruleSingletonTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'step' ) | (enumLiteral_1= 'turnLeft' ) | (enumLiteral_2= 'drop' ) | (enumLiteral_3= 'pick' ) ) ;
    public final Enumerator ruleSingletonTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalRobot.g:1388:2: ( ( (enumLiteral_0= 'step' ) | (enumLiteral_1= 'turnLeft' ) | (enumLiteral_2= 'drop' ) | (enumLiteral_3= 'pick' ) ) )
            // InternalRobot.g:1389:2: ( (enumLiteral_0= 'step' ) | (enumLiteral_1= 'turnLeft' ) | (enumLiteral_2= 'drop' ) | (enumLiteral_3= 'pick' ) )
            {
            // InternalRobot.g:1389:2: ( (enumLiteral_0= 'step' ) | (enumLiteral_1= 'turnLeft' ) | (enumLiteral_2= 'drop' ) | (enumLiteral_3= 'pick' ) )
            int alt32=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt32=1;
                }
                break;
            case 39:
                {
                alt32=2;
                }
                break;
            case 40:
                {
                alt32=3;
                }
                break;
            case 41:
                {
                alt32=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalRobot.g:1390:3: (enumLiteral_0= 'step' )
                    {
                    // InternalRobot.g:1390:3: (enumLiteral_0= 'step' )
                    // InternalRobot.g:1391:4: enumLiteral_0= 'step'
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getSingletonTypesAccess().getStepEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSingletonTypesAccess().getStepEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRobot.g:1398:3: (enumLiteral_1= 'turnLeft' )
                    {
                    // InternalRobot.g:1398:3: (enumLiteral_1= 'turnLeft' )
                    // InternalRobot.g:1399:4: enumLiteral_1= 'turnLeft'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getSingletonTypesAccess().getTurnLeftEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSingletonTypesAccess().getTurnLeftEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRobot.g:1406:3: (enumLiteral_2= 'drop' )
                    {
                    // InternalRobot.g:1406:3: (enumLiteral_2= 'drop' )
                    // InternalRobot.g:1407:4: enumLiteral_2= 'drop'
                    {
                    enumLiteral_2=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getSingletonTypesAccess().getDropEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSingletonTypesAccess().getDropEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRobot.g:1414:3: (enumLiteral_3= 'pick' )
                    {
                    // InternalRobot.g:1414:3: (enumLiteral_3= 'pick' )
                    // InternalRobot.g:1415:4: enumLiteral_3= 'pick'
                    {
                    enumLiteral_3=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getSingletonTypesAccess().getPickEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getSingletonTypesAccess().getPickEnumLiteralDeclaration_3());
                    			

                    }


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
    // $ANTLR end "ruleSingletonTypes"


    // $ANTLR start "ruleOrientation"
    // InternalRobot.g:1425:1: ruleOrientation returns [Enumerator current=null] : ( (enumLiteral_0= 'south' ) | (enumLiteral_1= 'north' ) | (enumLiteral_2= 'east' ) | (enumLiteral_3= 'west' ) ) ;
    public final Enumerator ruleOrientation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalRobot.g:1431:2: ( ( (enumLiteral_0= 'south' ) | (enumLiteral_1= 'north' ) | (enumLiteral_2= 'east' ) | (enumLiteral_3= 'west' ) ) )
            // InternalRobot.g:1432:2: ( (enumLiteral_0= 'south' ) | (enumLiteral_1= 'north' ) | (enumLiteral_2= 'east' ) | (enumLiteral_3= 'west' ) )
            {
            // InternalRobot.g:1432:2: ( (enumLiteral_0= 'south' ) | (enumLiteral_1= 'north' ) | (enumLiteral_2= 'east' ) | (enumLiteral_3= 'west' ) )
            int alt33=4;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt33=1;
                }
                break;
            case 43:
                {
                alt33=2;
                }
                break;
            case 44:
                {
                alt33=3;
                }
                break;
            case 45:
                {
                alt33=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalRobot.g:1433:3: (enumLiteral_0= 'south' )
                    {
                    // InternalRobot.g:1433:3: (enumLiteral_0= 'south' )
                    // InternalRobot.g:1434:4: enumLiteral_0= 'south'
                    {
                    enumLiteral_0=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getOrientationAccess().getSouthEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOrientationAccess().getSouthEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRobot.g:1441:3: (enumLiteral_1= 'north' )
                    {
                    // InternalRobot.g:1441:3: (enumLiteral_1= 'north' )
                    // InternalRobot.g:1442:4: enumLiteral_1= 'north'
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getOrientationAccess().getNorthEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOrientationAccess().getNorthEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRobot.g:1449:3: (enumLiteral_2= 'east' )
                    {
                    // InternalRobot.g:1449:3: (enumLiteral_2= 'east' )
                    // InternalRobot.g:1450:4: enumLiteral_2= 'east'
                    {
                    enumLiteral_2=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getOrientationAccess().getEastEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOrientationAccess().getEastEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRobot.g:1457:3: (enumLiteral_3= 'west' )
                    {
                    // InternalRobot.g:1457:3: (enumLiteral_3= 'west' )
                    // InternalRobot.g:1458:4: enumLiteral_3= 'west'
                    {
                    enumLiteral_3=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getOrientationAccess().getWestEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getOrientationAccess().getWestEnumLiteralDeclaration_3());
                    			

                    }


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
    // $ANTLR end "ruleOrientation"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000003C00AC7C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000003C00AC78000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000002B80000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000003C02AC7C000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000003C02AC78000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00003C0000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002B80000002L});

}