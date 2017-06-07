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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_COMMENTTEXT", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Script'", "'runs'", "'as'", "'\\n'", "'end'", "'and'", "'or'", "'trace'", "'buildWall'", "'at'", "'row:'", "'col:'", "'dropMark'", "'while'", "'do'", "'repeat'", "'times'", "'if'", "'else'", "'full'", "'mark'", "'wall'", "'ahead'", "'heading'", "'not'", "'step'", "'turnLeft'", "'drop'", "'pick'", "'south'", "'north'", "'east'", "'west'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_COMMENTTEXT=6;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
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
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__44=44;
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

            otherlv_1=(Token)match(input,12,FOLLOW_3); 

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

            otherlv_3=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getRobotAccess().getRunsKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getRobotAccess().getAsKeyword_4());
            		
            // InternalRobot.g:118:3: (otherlv_5= '\\n' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalRobot.g:119:4: otherlv_5= '\\n'
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getRobotAccess().getLineFeedKeyword_5());
                    			

                    }
                    break;

            }

            // InternalRobot.g:124:3: ( ( (lv_statements_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? ( ( (lv_statements_8_0= ruleStatement ) ) (otherlv_9= '\\n' )? )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_COMMENTTEXT||(LA5_0>=19 && LA5_0<=20)||(LA5_0>=24 && LA5_0<=25)||LA5_0==27||LA5_0==29||(LA5_0>=37 && LA5_0<=40)) ) {
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

                    if ( (LA2_0==15) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalRobot.g:145:5: otherlv_7= '\\n'
                            {
                            otherlv_7=(Token)match(input,15,FOLLOW_7); 

                            					newLeafNode(otherlv_7, grammarAccess.getRobotAccess().getLineFeedKeyword_6_1());
                            				

                            }
                            break;

                    }

                    // InternalRobot.g:150:4: ( ( (lv_statements_8_0= ruleStatement ) ) (otherlv_9= '\\n' )? )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_COMMENTTEXT||(LA4_0>=19 && LA4_0<=20)||(LA4_0>=24 && LA4_0<=25)||LA4_0==27||LA4_0==29||(LA4_0>=37 && LA4_0<=40)) ) {
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

                    	    if ( (LA3_0==15) ) {
                    	        alt3=1;
                    	    }
                    	    switch (alt3) {
                    	        case 1 :
                    	            // InternalRobot.g:171:6: otherlv_9= '\\n'
                    	            {
                    	            otherlv_9=(Token)match(input,15,FOLLOW_7); 

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

            otherlv_10=(Token)match(input,16,FOLLOW_2); 

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
            case RULE_COMMENTTEXT:
                {
                alt6=1;
                }
                break;
            case 37:
            case 38:
            case 39:
            case 40:
                {
                alt6=2;
                }
                break;
            case 19:
                {
                alt6=3;
                }
                break;
            case 20:
                {
                alt6=4;
                }
                break;
            case 24:
                {
                alt6=5;
                }
                break;
            case 25:
                {
                alt6=6;
                }
                break;
            case 27:
                {
                alt6=7;
                }
                break;
            case 29:
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
            case 36:
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
    // InternalRobot.g:346:1: ruleExpression returns [EObject current=null] : ( () ( (lv_a_1_0= ruleAtomic ) ) ( (otherlv_2= 'and' | otherlv_3= 'or' ) ( (lv_b_4_0= ruleExpression ) ) )? ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_a_1_0 = null;

        EObject lv_b_4_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:352:2: ( ( () ( (lv_a_1_0= ruleAtomic ) ) ( (otherlv_2= 'and' | otherlv_3= 'or' ) ( (lv_b_4_0= ruleExpression ) ) )? ) )
            // InternalRobot.g:353:2: ( () ( (lv_a_1_0= ruleAtomic ) ) ( (otherlv_2= 'and' | otherlv_3= 'or' ) ( (lv_b_4_0= ruleExpression ) ) )? )
            {
            // InternalRobot.g:353:2: ( () ( (lv_a_1_0= ruleAtomic ) ) ( (otherlv_2= 'and' | otherlv_3= 'or' ) ( (lv_b_4_0= ruleExpression ) ) )? )
            // InternalRobot.g:354:3: () ( (lv_a_1_0= ruleAtomic ) ) ( (otherlv_2= 'and' | otherlv_3= 'or' ) ( (lv_b_4_0= ruleExpression ) ) )?
            {
            // InternalRobot.g:354:3: ()
            // InternalRobot.g:355:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExpressionAccess().getExpressionAction_0(),
            					current);
            			

            }

            // InternalRobot.g:361:3: ( (lv_a_1_0= ruleAtomic ) )
            // InternalRobot.g:362:4: (lv_a_1_0= ruleAtomic )
            {
            // InternalRobot.g:362:4: (lv_a_1_0= ruleAtomic )
            // InternalRobot.g:363:5: lv_a_1_0= ruleAtomic
            {

            					newCompositeNode(grammarAccess.getExpressionAccess().getAAtomicParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_a_1_0=ruleAtomic();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressionRule());
            					}
            					set(
            						current,
            						"a",
            						lv_a_1_0,
            						"org.xtext.Robot.Atomic");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRobot.g:380:3: ( (otherlv_2= 'and' | otherlv_3= 'or' ) ( (lv_b_4_0= ruleExpression ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=17 && LA9_0<=18)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRobot.g:381:4: (otherlv_2= 'and' | otherlv_3= 'or' ) ( (lv_b_4_0= ruleExpression ) )
                    {
                    // InternalRobot.g:381:4: (otherlv_2= 'and' | otherlv_3= 'or' )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==17) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==18) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalRobot.g:382:5: otherlv_2= 'and'
                            {
                            otherlv_2=(Token)match(input,17,FOLLOW_9); 

                            					newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getAndKeyword_2_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalRobot.g:387:5: otherlv_3= 'or'
                            {
                            otherlv_3=(Token)match(input,18,FOLLOW_9); 

                            					newLeafNode(otherlv_3, grammarAccess.getExpressionAccess().getOrKeyword_2_0_1());
                            				

                            }
                            break;

                    }

                    // InternalRobot.g:392:4: ( (lv_b_4_0= ruleExpression ) )
                    // InternalRobot.g:393:5: (lv_b_4_0= ruleExpression )
                    {
                    // InternalRobot.g:393:5: (lv_b_4_0= ruleExpression )
                    // InternalRobot.g:394:6: lv_b_4_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getBExpressionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_b_4_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpressionRule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_4_0,
                    							"org.xtext.Robot.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleEString"
    // InternalRobot.g:416:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRobot.g:416:47: (iv_ruleEString= ruleEString EOF )
            // InternalRobot.g:417:2: iv_ruleEString= ruleEString EOF
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
    // InternalRobot.g:423:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRobot.g:429:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRobot.g:430:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRobot.g:430:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalRobot.g:431:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRobot.g:439:3: this_ID_1= RULE_ID
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
    // InternalRobot.g:450:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // InternalRobot.g:450:48: (iv_ruleComment= ruleComment EOF )
            // InternalRobot.g:451:2: iv_ruleComment= ruleComment EOF
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
    // InternalRobot.g:457:1: ruleComment returns [EObject current=null] : ( () this_COMMENTTEXT_1= RULE_COMMENTTEXT ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token this_COMMENTTEXT_1=null;


        	enterRule();

        try {
            // InternalRobot.g:463:2: ( ( () this_COMMENTTEXT_1= RULE_COMMENTTEXT ) )
            // InternalRobot.g:464:2: ( () this_COMMENTTEXT_1= RULE_COMMENTTEXT )
            {
            // InternalRobot.g:464:2: ( () this_COMMENTTEXT_1= RULE_COMMENTTEXT )
            // InternalRobot.g:465:3: () this_COMMENTTEXT_1= RULE_COMMENTTEXT
            {
            // InternalRobot.g:465:3: ()
            // InternalRobot.g:466:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCommentAccess().getCommentAction_0(),
            					current);
            			

            }

            this_COMMENTTEXT_1=(Token)match(input,RULE_COMMENTTEXT,FOLLOW_2); 

            			newLeafNode(this_COMMENTTEXT_1, grammarAccess.getCommentAccess().getCOMMENTTEXTTerminalRuleCall_1());
            		

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
    // InternalRobot.g:480:1: entryRuleSingleton returns [EObject current=null] : iv_ruleSingleton= ruleSingleton EOF ;
    public final EObject entryRuleSingleton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleton = null;


        try {
            // InternalRobot.g:480:50: (iv_ruleSingleton= ruleSingleton EOF )
            // InternalRobot.g:481:2: iv_ruleSingleton= ruleSingleton EOF
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
    // InternalRobot.g:487:1: ruleSingleton returns [EObject current=null] : ( (lv_type_0_0= ruleSingletonTypes ) ) ;
    public final EObject ruleSingleton() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:493:2: ( ( (lv_type_0_0= ruleSingletonTypes ) ) )
            // InternalRobot.g:494:2: ( (lv_type_0_0= ruleSingletonTypes ) )
            {
            // InternalRobot.g:494:2: ( (lv_type_0_0= ruleSingletonTypes ) )
            // InternalRobot.g:495:3: (lv_type_0_0= ruleSingletonTypes )
            {
            // InternalRobot.g:495:3: (lv_type_0_0= ruleSingletonTypes )
            // InternalRobot.g:496:4: lv_type_0_0= ruleSingletonTypes
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
    // InternalRobot.g:516:1: entryRuleTrace returns [EObject current=null] : iv_ruleTrace= ruleTrace EOF ;
    public final EObject entryRuleTrace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrace = null;


        try {
            // InternalRobot.g:516:46: (iv_ruleTrace= ruleTrace EOF )
            // InternalRobot.g:517:2: iv_ruleTrace= ruleTrace EOF
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
    // InternalRobot.g:523:1: ruleTrace returns [EObject current=null] : ( () otherlv_1= 'trace' ( (lv_text_2_0= ruleEString ) ) ) ;
    public final EObject ruleTrace() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_text_2_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:529:2: ( ( () otherlv_1= 'trace' ( (lv_text_2_0= ruleEString ) ) ) )
            // InternalRobot.g:530:2: ( () otherlv_1= 'trace' ( (lv_text_2_0= ruleEString ) ) )
            {
            // InternalRobot.g:530:2: ( () otherlv_1= 'trace' ( (lv_text_2_0= ruleEString ) ) )
            // InternalRobot.g:531:3: () otherlv_1= 'trace' ( (lv_text_2_0= ruleEString ) )
            {
            // InternalRobot.g:531:3: ()
            // InternalRobot.g:532:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTraceAccess().getTraceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTraceAccess().getTraceKeyword_1());
            		
            // InternalRobot.g:542:3: ( (lv_text_2_0= ruleEString ) )
            // InternalRobot.g:543:4: (lv_text_2_0= ruleEString )
            {
            // InternalRobot.g:543:4: (lv_text_2_0= ruleEString )
            // InternalRobot.g:544:5: lv_text_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTraceAccess().getTextEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_text_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTraceRule());
            					}
            					set(
            						current,
            						"text",
            						lv_text_2_0,
            						"org.xtext.Robot.EString");
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
    // InternalRobot.g:565:1: entryRuleBuildWall returns [EObject current=null] : iv_ruleBuildWall= ruleBuildWall EOF ;
    public final EObject entryRuleBuildWall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuildWall = null;


        try {
            // InternalRobot.g:565:50: (iv_ruleBuildWall= ruleBuildWall EOF )
            // InternalRobot.g:566:2: iv_ruleBuildWall= ruleBuildWall EOF
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
    // InternalRobot.g:572:1: ruleBuildWall returns [EObject current=null] : (otherlv_0= 'buildWall' otherlv_1= 'at' otherlv_2= 'row:' ( (lv_row_3_0= ruleEInt ) ) otherlv_4= 'col:' ( (lv_col_5_0= ruleEInt ) ) ) ;
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
            // InternalRobot.g:578:2: ( (otherlv_0= 'buildWall' otherlv_1= 'at' otherlv_2= 'row:' ( (lv_row_3_0= ruleEInt ) ) otherlv_4= 'col:' ( (lv_col_5_0= ruleEInt ) ) ) )
            // InternalRobot.g:579:2: (otherlv_0= 'buildWall' otherlv_1= 'at' otherlv_2= 'row:' ( (lv_row_3_0= ruleEInt ) ) otherlv_4= 'col:' ( (lv_col_5_0= ruleEInt ) ) )
            {
            // InternalRobot.g:579:2: (otherlv_0= 'buildWall' otherlv_1= 'at' otherlv_2= 'row:' ( (lv_row_3_0= ruleEInt ) ) otherlv_4= 'col:' ( (lv_col_5_0= ruleEInt ) ) )
            // InternalRobot.g:580:3: otherlv_0= 'buildWall' otherlv_1= 'at' otherlv_2= 'row:' ( (lv_row_3_0= ruleEInt ) ) otherlv_4= 'col:' ( (lv_col_5_0= ruleEInt ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getBuildWallAccess().getBuildWallKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getBuildWallAccess().getAtKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getBuildWallAccess().getRowKeyword_2());
            		
            // InternalRobot.g:592:3: ( (lv_row_3_0= ruleEInt ) )
            // InternalRobot.g:593:4: (lv_row_3_0= ruleEInt )
            {
            // InternalRobot.g:593:4: (lv_row_3_0= ruleEInt )
            // InternalRobot.g:594:5: lv_row_3_0= ruleEInt
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

            otherlv_4=(Token)match(input,23,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getBuildWallAccess().getColKeyword_4());
            		
            // InternalRobot.g:615:3: ( (lv_col_5_0= ruleEInt ) )
            // InternalRobot.g:616:4: (lv_col_5_0= ruleEInt )
            {
            // InternalRobot.g:616:4: (lv_col_5_0= ruleEInt )
            // InternalRobot.g:617:5: lv_col_5_0= ruleEInt
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
    // InternalRobot.g:638:1: entryRuleDropMark returns [EObject current=null] : iv_ruleDropMark= ruleDropMark EOF ;
    public final EObject entryRuleDropMark() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropMark = null;


        try {
            // InternalRobot.g:638:49: (iv_ruleDropMark= ruleDropMark EOF )
            // InternalRobot.g:639:2: iv_ruleDropMark= ruleDropMark EOF
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
    // InternalRobot.g:645:1: ruleDropMark returns [EObject current=null] : (otherlv_0= 'dropMark' otherlv_1= 'at' otherlv_2= 'row:' ( (lv_row_3_0= ruleEInt ) ) otherlv_4= 'col:' ( (lv_col_5_0= ruleEInt ) ) ) ;
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
            // InternalRobot.g:651:2: ( (otherlv_0= 'dropMark' otherlv_1= 'at' otherlv_2= 'row:' ( (lv_row_3_0= ruleEInt ) ) otherlv_4= 'col:' ( (lv_col_5_0= ruleEInt ) ) ) )
            // InternalRobot.g:652:2: (otherlv_0= 'dropMark' otherlv_1= 'at' otherlv_2= 'row:' ( (lv_row_3_0= ruleEInt ) ) otherlv_4= 'col:' ( (lv_col_5_0= ruleEInt ) ) )
            {
            // InternalRobot.g:652:2: (otherlv_0= 'dropMark' otherlv_1= 'at' otherlv_2= 'row:' ( (lv_row_3_0= ruleEInt ) ) otherlv_4= 'col:' ( (lv_col_5_0= ruleEInt ) ) )
            // InternalRobot.g:653:3: otherlv_0= 'dropMark' otherlv_1= 'at' otherlv_2= 'row:' ( (lv_row_3_0= ruleEInt ) ) otherlv_4= 'col:' ( (lv_col_5_0= ruleEInt ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDropMarkAccess().getDropMarkKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getDropMarkAccess().getAtKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getDropMarkAccess().getRowKeyword_2());
            		
            // InternalRobot.g:665:3: ( (lv_row_3_0= ruleEInt ) )
            // InternalRobot.g:666:4: (lv_row_3_0= ruleEInt )
            {
            // InternalRobot.g:666:4: (lv_row_3_0= ruleEInt )
            // InternalRobot.g:667:5: lv_row_3_0= ruleEInt
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

            otherlv_4=(Token)match(input,23,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getDropMarkAccess().getColKeyword_4());
            		
            // InternalRobot.g:688:3: ( (lv_col_5_0= ruleEInt ) )
            // InternalRobot.g:689:4: (lv_col_5_0= ruleEInt )
            {
            // InternalRobot.g:689:4: (lv_col_5_0= ruleEInt )
            // InternalRobot.g:690:5: lv_col_5_0= ruleEInt
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
    // InternalRobot.g:711:1: entryRuleWhileStatement returns [EObject current=null] : iv_ruleWhileStatement= ruleWhileStatement EOF ;
    public final EObject entryRuleWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileStatement = null;


        try {
            // InternalRobot.g:711:55: (iv_ruleWhileStatement= ruleWhileStatement EOF )
            // InternalRobot.g:712:2: iv_ruleWhileStatement= ruleWhileStatement EOF
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
    // InternalRobot.g:718:1: ruleWhileStatement returns [EObject current=null] : (otherlv_0= 'while' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'do' (otherlv_3= '\\n' )? ( ( (lv_body_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )* )? otherlv_8= 'end' ) ;
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
            // InternalRobot.g:724:2: ( (otherlv_0= 'while' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'do' (otherlv_3= '\\n' )? ( ( (lv_body_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )* )? otherlv_8= 'end' ) )
            // InternalRobot.g:725:2: (otherlv_0= 'while' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'do' (otherlv_3= '\\n' )? ( ( (lv_body_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )* )? otherlv_8= 'end' )
            {
            // InternalRobot.g:725:2: (otherlv_0= 'while' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'do' (otherlv_3= '\\n' )? ( ( (lv_body_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )* )? otherlv_8= 'end' )
            // InternalRobot.g:726:3: otherlv_0= 'while' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'do' (otherlv_3= '\\n' )? ( ( (lv_body_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )* )? otherlv_8= 'end'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getWhileStatementAccess().getWhileKeyword_0());
            		
            // InternalRobot.g:730:3: ( (lv_cond_1_0= ruleExpression ) )
            // InternalRobot.g:731:4: (lv_cond_1_0= ruleExpression )
            {
            // InternalRobot.g:731:4: (lv_cond_1_0= ruleExpression )
            // InternalRobot.g:732:5: lv_cond_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getWhileStatementAccess().getCondExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
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

            otherlv_2=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getWhileStatementAccess().getDoKeyword_2());
            		
            // InternalRobot.g:753:3: (otherlv_3= '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRobot.g:754:4: otherlv_3= '\\n'
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getWhileStatementAccess().getLineFeedKeyword_3());
                    			

                    }
                    break;

            }

            // InternalRobot.g:759:3: ( ( (lv_body_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_COMMENTTEXT||(LA15_0>=19 && LA15_0<=20)||(LA15_0>=24 && LA15_0<=25)||LA15_0==27||LA15_0==29||(LA15_0>=37 && LA15_0<=40)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRobot.g:760:4: ( (lv_body_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )*
                    {
                    // InternalRobot.g:760:4: ( (lv_body_4_0= ruleStatement ) )
                    // InternalRobot.g:761:5: (lv_body_4_0= ruleStatement )
                    {
                    // InternalRobot.g:761:5: (lv_body_4_0= ruleStatement )
                    // InternalRobot.g:762:6: lv_body_4_0= ruleStatement
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

                    // InternalRobot.g:779:4: (otherlv_5= '\\n' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==15) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalRobot.g:780:5: otherlv_5= '\\n'
                            {
                            otherlv_5=(Token)match(input,15,FOLLOW_7); 

                            					newLeafNode(otherlv_5, grammarAccess.getWhileStatementAccess().getLineFeedKeyword_4_1());
                            				

                            }
                            break;

                    }

                    // InternalRobot.g:785:4: ( ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==RULE_COMMENTTEXT||(LA14_0>=19 && LA14_0<=20)||(LA14_0>=24 && LA14_0<=25)||LA14_0==27||LA14_0==29||(LA14_0>=37 && LA14_0<=40)) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalRobot.g:786:5: ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= '\\n' )?
                    	    {
                    	    // InternalRobot.g:786:5: ( (lv_body_6_0= ruleStatement ) )
                    	    // InternalRobot.g:787:6: (lv_body_6_0= ruleStatement )
                    	    {
                    	    // InternalRobot.g:787:6: (lv_body_6_0= ruleStatement )
                    	    // InternalRobot.g:788:7: lv_body_6_0= ruleStatement
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

                    	    // InternalRobot.g:805:5: (otherlv_7= '\\n' )?
                    	    int alt13=2;
                    	    int LA13_0 = input.LA(1);

                    	    if ( (LA13_0==15) ) {
                    	        alt13=1;
                    	    }
                    	    switch (alt13) {
                    	        case 1 :
                    	            // InternalRobot.g:806:6: otherlv_7= '\\n'
                    	            {
                    	            otherlv_7=(Token)match(input,15,FOLLOW_7); 

                    	            						newLeafNode(otherlv_7, grammarAccess.getWhileStatementAccess().getLineFeedKeyword_4_2_1());
                    	            					

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

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
    // InternalRobot.g:821:1: entryRuleRepeatStatement returns [EObject current=null] : iv_ruleRepeatStatement= ruleRepeatStatement EOF ;
    public final EObject entryRuleRepeatStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepeatStatement = null;


        try {
            // InternalRobot.g:821:56: (iv_ruleRepeatStatement= ruleRepeatStatement EOF )
            // InternalRobot.g:822:2: iv_ruleRepeatStatement= ruleRepeatStatement EOF
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
    // InternalRobot.g:828:1: ruleRepeatStatement returns [EObject current=null] : (otherlv_0= 'repeat' ( (lv_times_1_0= ruleEInt ) ) otherlv_2= 'times' (otherlv_3= '\\n' )? ( ( (lv_body_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )* )? otherlv_8= 'end' ) ;
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
            // InternalRobot.g:834:2: ( (otherlv_0= 'repeat' ( (lv_times_1_0= ruleEInt ) ) otherlv_2= 'times' (otherlv_3= '\\n' )? ( ( (lv_body_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )* )? otherlv_8= 'end' ) )
            // InternalRobot.g:835:2: (otherlv_0= 'repeat' ( (lv_times_1_0= ruleEInt ) ) otherlv_2= 'times' (otherlv_3= '\\n' )? ( ( (lv_body_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )* )? otherlv_8= 'end' )
            {
            // InternalRobot.g:835:2: (otherlv_0= 'repeat' ( (lv_times_1_0= ruleEInt ) ) otherlv_2= 'times' (otherlv_3= '\\n' )? ( ( (lv_body_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )* )? otherlv_8= 'end' )
            // InternalRobot.g:836:3: otherlv_0= 'repeat' ( (lv_times_1_0= ruleEInt ) ) otherlv_2= 'times' (otherlv_3= '\\n' )? ( ( (lv_body_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )* )? otherlv_8= 'end'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getRepeatStatementAccess().getRepeatKeyword_0());
            		
            // InternalRobot.g:840:3: ( (lv_times_1_0= ruleEInt ) )
            // InternalRobot.g:841:4: (lv_times_1_0= ruleEInt )
            {
            // InternalRobot.g:841:4: (lv_times_1_0= ruleEInt )
            // InternalRobot.g:842:5: lv_times_1_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getRepeatStatementAccess().getTimesEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
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

            otherlv_2=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getRepeatStatementAccess().getTimesKeyword_2());
            		
            // InternalRobot.g:863:3: (otherlv_3= '\\n' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==15) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRobot.g:864:4: otherlv_3= '\\n'
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getRepeatStatementAccess().getLineFeedKeyword_3());
                    			

                    }
                    break;

            }

            // InternalRobot.g:869:3: ( ( (lv_body_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_COMMENTTEXT||(LA20_0>=19 && LA20_0<=20)||(LA20_0>=24 && LA20_0<=25)||LA20_0==27||LA20_0==29||(LA20_0>=37 && LA20_0<=40)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRobot.g:870:4: ( (lv_body_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )*
                    {
                    // InternalRobot.g:870:4: ( (lv_body_4_0= ruleStatement ) )
                    // InternalRobot.g:871:5: (lv_body_4_0= ruleStatement )
                    {
                    // InternalRobot.g:871:5: (lv_body_4_0= ruleStatement )
                    // InternalRobot.g:872:6: lv_body_4_0= ruleStatement
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

                    // InternalRobot.g:889:4: (otherlv_5= '\\n' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==15) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalRobot.g:890:5: otherlv_5= '\\n'
                            {
                            otherlv_5=(Token)match(input,15,FOLLOW_7); 

                            					newLeafNode(otherlv_5, grammarAccess.getRepeatStatementAccess().getLineFeedKeyword_4_1());
                            				

                            }
                            break;

                    }

                    // InternalRobot.g:895:4: ( ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==RULE_COMMENTTEXT||(LA19_0>=19 && LA19_0<=20)||(LA19_0>=24 && LA19_0<=25)||LA19_0==27||LA19_0==29||(LA19_0>=37 && LA19_0<=40)) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalRobot.g:896:5: ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= '\\n' )?
                    	    {
                    	    // InternalRobot.g:896:5: ( (lv_body_6_0= ruleStatement ) )
                    	    // InternalRobot.g:897:6: (lv_body_6_0= ruleStatement )
                    	    {
                    	    // InternalRobot.g:897:6: (lv_body_6_0= ruleStatement )
                    	    // InternalRobot.g:898:7: lv_body_6_0= ruleStatement
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

                    	    // InternalRobot.g:915:5: (otherlv_7= '\\n' )?
                    	    int alt18=2;
                    	    int LA18_0 = input.LA(1);

                    	    if ( (LA18_0==15) ) {
                    	        alt18=1;
                    	    }
                    	    switch (alt18) {
                    	        case 1 :
                    	            // InternalRobot.g:916:6: otherlv_7= '\\n'
                    	            {
                    	            otherlv_7=(Token)match(input,15,FOLLOW_7); 

                    	            						newLeafNode(otherlv_7, grammarAccess.getRepeatStatementAccess().getLineFeedKeyword_4_2_1());
                    	            					

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

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
    // InternalRobot.g:931:1: entryRuleIfElseStatement returns [EObject current=null] : iv_ruleIfElseStatement= ruleIfElseStatement EOF ;
    public final EObject entryRuleIfElseStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfElseStatement = null;


        try {
            // InternalRobot.g:931:56: (iv_ruleIfElseStatement= ruleIfElseStatement EOF )
            // InternalRobot.g:932:2: iv_ruleIfElseStatement= ruleIfElseStatement EOF
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
    // InternalRobot.g:938:1: ruleIfElseStatement returns [EObject current=null] : (otherlv_0= 'if' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'do' (otherlv_3= '\\n' )? ( ( (lv_ifbody_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_ifbody_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )* )? (otherlv_8= 'else' (otherlv_9= '\\n' )? ( ( (lv_elsebody_10_0= ruleStatement ) ) (otherlv_11= '\\n' )? ( ( (lv_elsebody_12_0= ruleStatement ) ) (otherlv_13= '\\n' )? )* )? )? otherlv_14= 'end' ) ;
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
            // InternalRobot.g:944:2: ( (otherlv_0= 'if' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'do' (otherlv_3= '\\n' )? ( ( (lv_ifbody_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_ifbody_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )* )? (otherlv_8= 'else' (otherlv_9= '\\n' )? ( ( (lv_elsebody_10_0= ruleStatement ) ) (otherlv_11= '\\n' )? ( ( (lv_elsebody_12_0= ruleStatement ) ) (otherlv_13= '\\n' )? )* )? )? otherlv_14= 'end' ) )
            // InternalRobot.g:945:2: (otherlv_0= 'if' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'do' (otherlv_3= '\\n' )? ( ( (lv_ifbody_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_ifbody_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )* )? (otherlv_8= 'else' (otherlv_9= '\\n' )? ( ( (lv_elsebody_10_0= ruleStatement ) ) (otherlv_11= '\\n' )? ( ( (lv_elsebody_12_0= ruleStatement ) ) (otherlv_13= '\\n' )? )* )? )? otherlv_14= 'end' )
            {
            // InternalRobot.g:945:2: (otherlv_0= 'if' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'do' (otherlv_3= '\\n' )? ( ( (lv_ifbody_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_ifbody_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )* )? (otherlv_8= 'else' (otherlv_9= '\\n' )? ( ( (lv_elsebody_10_0= ruleStatement ) ) (otherlv_11= '\\n' )? ( ( (lv_elsebody_12_0= ruleStatement ) ) (otherlv_13= '\\n' )? )* )? )? otherlv_14= 'end' )
            // InternalRobot.g:946:3: otherlv_0= 'if' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'do' (otherlv_3= '\\n' )? ( ( (lv_ifbody_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_ifbody_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )* )? (otherlv_8= 'else' (otherlv_9= '\\n' )? ( ( (lv_elsebody_10_0= ruleStatement ) ) (otherlv_11= '\\n' )? ( ( (lv_elsebody_12_0= ruleStatement ) ) (otherlv_13= '\\n' )? )* )? )? otherlv_14= 'end'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getIfElseStatementAccess().getIfKeyword_0());
            		
            // InternalRobot.g:950:3: ( (lv_cond_1_0= ruleExpression ) )
            // InternalRobot.g:951:4: (lv_cond_1_0= ruleExpression )
            {
            // InternalRobot.g:951:4: (lv_cond_1_0= ruleExpression )
            // InternalRobot.g:952:5: lv_cond_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getIfElseStatementAccess().getCondExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
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

            otherlv_2=(Token)match(input,26,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getIfElseStatementAccess().getDoKeyword_2());
            		
            // InternalRobot.g:973:3: (otherlv_3= '\\n' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==15) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRobot.g:974:4: otherlv_3= '\\n'
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getIfElseStatementAccess().getLineFeedKeyword_3());
                    			

                    }
                    break;

            }

            // InternalRobot.g:979:3: ( ( (lv_ifbody_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_ifbody_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_COMMENTTEXT||(LA25_0>=19 && LA25_0<=20)||(LA25_0>=24 && LA25_0<=25)||LA25_0==27||LA25_0==29||(LA25_0>=37 && LA25_0<=40)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalRobot.g:980:4: ( (lv_ifbody_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_ifbody_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )*
                    {
                    // InternalRobot.g:980:4: ( (lv_ifbody_4_0= ruleStatement ) )
                    // InternalRobot.g:981:5: (lv_ifbody_4_0= ruleStatement )
                    {
                    // InternalRobot.g:981:5: (lv_ifbody_4_0= ruleStatement )
                    // InternalRobot.g:982:6: lv_ifbody_4_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getIfElseStatementAccess().getIfbodyStatementParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_16);
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

                    // InternalRobot.g:999:4: (otherlv_5= '\\n' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==15) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalRobot.g:1000:5: otherlv_5= '\\n'
                            {
                            otherlv_5=(Token)match(input,15,FOLLOW_17); 

                            					newLeafNode(otherlv_5, grammarAccess.getIfElseStatementAccess().getLineFeedKeyword_4_1());
                            				

                            }
                            break;

                    }

                    // InternalRobot.g:1005:4: ( ( (lv_ifbody_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==RULE_COMMENTTEXT||(LA24_0>=19 && LA24_0<=20)||(LA24_0>=24 && LA24_0<=25)||LA24_0==27||LA24_0==29||(LA24_0>=37 && LA24_0<=40)) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalRobot.g:1006:5: ( (lv_ifbody_6_0= ruleStatement ) ) (otherlv_7= '\\n' )?
                    	    {
                    	    // InternalRobot.g:1006:5: ( (lv_ifbody_6_0= ruleStatement ) )
                    	    // InternalRobot.g:1007:6: (lv_ifbody_6_0= ruleStatement )
                    	    {
                    	    // InternalRobot.g:1007:6: (lv_ifbody_6_0= ruleStatement )
                    	    // InternalRobot.g:1008:7: lv_ifbody_6_0= ruleStatement
                    	    {

                    	    							newCompositeNode(grammarAccess.getIfElseStatementAccess().getIfbodyStatementParserRuleCall_4_2_0_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
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

                    	    // InternalRobot.g:1025:5: (otherlv_7= '\\n' )?
                    	    int alt23=2;
                    	    int LA23_0 = input.LA(1);

                    	    if ( (LA23_0==15) ) {
                    	        alt23=1;
                    	    }
                    	    switch (alt23) {
                    	        case 1 :
                    	            // InternalRobot.g:1026:6: otherlv_7= '\\n'
                    	            {
                    	            otherlv_7=(Token)match(input,15,FOLLOW_17); 

                    	            						newLeafNode(otherlv_7, grammarAccess.getIfElseStatementAccess().getLineFeedKeyword_4_2_1());
                    	            					

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRobot.g:1033:3: (otherlv_8= 'else' (otherlv_9= '\\n' )? ( ( (lv_elsebody_10_0= ruleStatement ) ) (otherlv_11= '\\n' )? ( ( (lv_elsebody_12_0= ruleStatement ) ) (otherlv_13= '\\n' )? )* )? )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==30) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalRobot.g:1034:4: otherlv_8= 'else' (otherlv_9= '\\n' )? ( ( (lv_elsebody_10_0= ruleStatement ) ) (otherlv_11= '\\n' )? ( ( (lv_elsebody_12_0= ruleStatement ) ) (otherlv_13= '\\n' )? )* )?
                    {
                    otherlv_8=(Token)match(input,30,FOLLOW_6); 

                    				newLeafNode(otherlv_8, grammarAccess.getIfElseStatementAccess().getElseKeyword_5_0());
                    			
                    // InternalRobot.g:1038:4: (otherlv_9= '\\n' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==15) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalRobot.g:1039:5: otherlv_9= '\\n'
                            {
                            otherlv_9=(Token)match(input,15,FOLLOW_7); 

                            					newLeafNode(otherlv_9, grammarAccess.getIfElseStatementAccess().getLineFeedKeyword_5_1());
                            				

                            }
                            break;

                    }

                    // InternalRobot.g:1044:4: ( ( (lv_elsebody_10_0= ruleStatement ) ) (otherlv_11= '\\n' )? ( ( (lv_elsebody_12_0= ruleStatement ) ) (otherlv_13= '\\n' )? )* )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==RULE_COMMENTTEXT||(LA30_0>=19 && LA30_0<=20)||(LA30_0>=24 && LA30_0<=25)||LA30_0==27||LA30_0==29||(LA30_0>=37 && LA30_0<=40)) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalRobot.g:1045:5: ( (lv_elsebody_10_0= ruleStatement ) ) (otherlv_11= '\\n' )? ( ( (lv_elsebody_12_0= ruleStatement ) ) (otherlv_13= '\\n' )? )*
                            {
                            // InternalRobot.g:1045:5: ( (lv_elsebody_10_0= ruleStatement ) )
                            // InternalRobot.g:1046:6: (lv_elsebody_10_0= ruleStatement )
                            {
                            // InternalRobot.g:1046:6: (lv_elsebody_10_0= ruleStatement )
                            // InternalRobot.g:1047:7: lv_elsebody_10_0= ruleStatement
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

                            // InternalRobot.g:1064:5: (otherlv_11= '\\n' )?
                            int alt27=2;
                            int LA27_0 = input.LA(1);

                            if ( (LA27_0==15) ) {
                                alt27=1;
                            }
                            switch (alt27) {
                                case 1 :
                                    // InternalRobot.g:1065:6: otherlv_11= '\\n'
                                    {
                                    otherlv_11=(Token)match(input,15,FOLLOW_7); 

                                    						newLeafNode(otherlv_11, grammarAccess.getIfElseStatementAccess().getLineFeedKeyword_5_2_1());
                                    					

                                    }
                                    break;

                            }

                            // InternalRobot.g:1070:5: ( ( (lv_elsebody_12_0= ruleStatement ) ) (otherlv_13= '\\n' )? )*
                            loop29:
                            do {
                                int alt29=2;
                                int LA29_0 = input.LA(1);

                                if ( (LA29_0==RULE_COMMENTTEXT||(LA29_0>=19 && LA29_0<=20)||(LA29_0>=24 && LA29_0<=25)||LA29_0==27||LA29_0==29||(LA29_0>=37 && LA29_0<=40)) ) {
                                    alt29=1;
                                }


                                switch (alt29) {
                            	case 1 :
                            	    // InternalRobot.g:1071:6: ( (lv_elsebody_12_0= ruleStatement ) ) (otherlv_13= '\\n' )?
                            	    {
                            	    // InternalRobot.g:1071:6: ( (lv_elsebody_12_0= ruleStatement ) )
                            	    // InternalRobot.g:1072:7: (lv_elsebody_12_0= ruleStatement )
                            	    {
                            	    // InternalRobot.g:1072:7: (lv_elsebody_12_0= ruleStatement )
                            	    // InternalRobot.g:1073:8: lv_elsebody_12_0= ruleStatement
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

                            	    // InternalRobot.g:1090:6: (otherlv_13= '\\n' )?
                            	    int alt28=2;
                            	    int LA28_0 = input.LA(1);

                            	    if ( (LA28_0==15) ) {
                            	        alt28=1;
                            	    }
                            	    switch (alt28) {
                            	        case 1 :
                            	            // InternalRobot.g:1091:7: otherlv_13= '\\n'
                            	            {
                            	            otherlv_13=(Token)match(input,15,FOLLOW_7); 

                            	            							newLeafNode(otherlv_13, grammarAccess.getIfElseStatementAccess().getLineFeedKeyword_5_2_2_1());
                            	            						

                            	            }
                            	            break;

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop29;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,16,FOLLOW_2); 

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


    // $ANTLR start "entryRuleEInt"
    // InternalRobot.g:1107:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalRobot.g:1107:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalRobot.g:1108:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalRobot.g:1114:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalRobot.g:1120:2: (this_INT_0= RULE_INT )
            // InternalRobot.g:1121:2: this_INT_0= RULE_INT
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
    // InternalRobot.g:1131:1: entryRuleFull returns [EObject current=null] : iv_ruleFull= ruleFull EOF ;
    public final EObject entryRuleFull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFull = null;


        try {
            // InternalRobot.g:1131:45: (iv_ruleFull= ruleFull EOF )
            // InternalRobot.g:1132:2: iv_ruleFull= ruleFull EOF
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
    // InternalRobot.g:1138:1: ruleFull returns [EObject current=null] : ( () otherlv_1= 'full' ) ;
    public final EObject ruleFull() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRobot.g:1144:2: ( ( () otherlv_1= 'full' ) )
            // InternalRobot.g:1145:2: ( () otherlv_1= 'full' )
            {
            // InternalRobot.g:1145:2: ( () otherlv_1= 'full' )
            // InternalRobot.g:1146:3: () otherlv_1= 'full'
            {
            // InternalRobot.g:1146:3: ()
            // InternalRobot.g:1147:4: 
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
    // InternalRobot.g:1161:1: entryRuleMark returns [EObject current=null] : iv_ruleMark= ruleMark EOF ;
    public final EObject entryRuleMark() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMark = null;


        try {
            // InternalRobot.g:1161:45: (iv_ruleMark= ruleMark EOF )
            // InternalRobot.g:1162:2: iv_ruleMark= ruleMark EOF
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
    // InternalRobot.g:1168:1: ruleMark returns [EObject current=null] : ( () otherlv_1= 'mark' ) ;
    public final EObject ruleMark() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRobot.g:1174:2: ( ( () otherlv_1= 'mark' ) )
            // InternalRobot.g:1175:2: ( () otherlv_1= 'mark' )
            {
            // InternalRobot.g:1175:2: ( () otherlv_1= 'mark' )
            // InternalRobot.g:1176:3: () otherlv_1= 'mark'
            {
            // InternalRobot.g:1176:3: ()
            // InternalRobot.g:1177:4: 
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
    // InternalRobot.g:1191:1: entryRuleAhead returns [EObject current=null] : iv_ruleAhead= ruleAhead EOF ;
    public final EObject entryRuleAhead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAhead = null;


        try {
            // InternalRobot.g:1191:46: (iv_ruleAhead= ruleAhead EOF )
            // InternalRobot.g:1192:2: iv_ruleAhead= ruleAhead EOF
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
    // InternalRobot.g:1198:1: ruleAhead returns [EObject current=null] : ( () otherlv_1= 'wall' otherlv_2= 'ahead' ) ;
    public final EObject ruleAhead() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRobot.g:1204:2: ( ( () otherlv_1= 'wall' otherlv_2= 'ahead' ) )
            // InternalRobot.g:1205:2: ( () otherlv_1= 'wall' otherlv_2= 'ahead' )
            {
            // InternalRobot.g:1205:2: ( () otherlv_1= 'wall' otherlv_2= 'ahead' )
            // InternalRobot.g:1206:3: () otherlv_1= 'wall' otherlv_2= 'ahead'
            {
            // InternalRobot.g:1206:3: ()
            // InternalRobot.g:1207:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAheadAccess().getAheadAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_18); 

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
    // InternalRobot.g:1225:1: entryRuleHeading returns [EObject current=null] : iv_ruleHeading= ruleHeading EOF ;
    public final EObject entryRuleHeading() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeading = null;


        try {
            // InternalRobot.g:1225:48: (iv_ruleHeading= ruleHeading EOF )
            // InternalRobot.g:1226:2: iv_ruleHeading= ruleHeading EOF
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
    // InternalRobot.g:1232:1: ruleHeading returns [EObject current=null] : (otherlv_0= 'heading' ( (lv_wind_1_0= ruleOrientation ) ) ) ;
    public final EObject ruleHeading() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_wind_1_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:1238:2: ( (otherlv_0= 'heading' ( (lv_wind_1_0= ruleOrientation ) ) ) )
            // InternalRobot.g:1239:2: (otherlv_0= 'heading' ( (lv_wind_1_0= ruleOrientation ) ) )
            {
            // InternalRobot.g:1239:2: (otherlv_0= 'heading' ( (lv_wind_1_0= ruleOrientation ) ) )
            // InternalRobot.g:1240:3: otherlv_0= 'heading' ( (lv_wind_1_0= ruleOrientation ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getHeadingAccess().getHeadingKeyword_0());
            		
            // InternalRobot.g:1244:3: ( (lv_wind_1_0= ruleOrientation ) )
            // InternalRobot.g:1245:4: (lv_wind_1_0= ruleOrientation )
            {
            // InternalRobot.g:1245:4: (lv_wind_1_0= ruleOrientation )
            // InternalRobot.g:1246:5: lv_wind_1_0= ruleOrientation
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


    // $ANTLR start "entryRuleNot"
    // InternalRobot.g:1267:1: entryRuleNot returns [EObject current=null] : iv_ruleNot= ruleNot EOF ;
    public final EObject entryRuleNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot = null;


        try {
            // InternalRobot.g:1267:44: (iv_ruleNot= ruleNot EOF )
            // InternalRobot.g:1268:2: iv_ruleNot= ruleNot EOF
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
    // InternalRobot.g:1274:1: ruleNot returns [EObject current=null] : (otherlv_0= 'not' ( (lv_e_1_0= ruleAtomic ) ) ) ;
    public final EObject ruleNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_e_1_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:1280:2: ( (otherlv_0= 'not' ( (lv_e_1_0= ruleAtomic ) ) ) )
            // InternalRobot.g:1281:2: (otherlv_0= 'not' ( (lv_e_1_0= ruleAtomic ) ) )
            {
            // InternalRobot.g:1281:2: (otherlv_0= 'not' ( (lv_e_1_0= ruleAtomic ) ) )
            // InternalRobot.g:1282:3: otherlv_0= 'not' ( (lv_e_1_0= ruleAtomic ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getNotAccess().getNotKeyword_0());
            		
            // InternalRobot.g:1286:3: ( (lv_e_1_0= ruleAtomic ) )
            // InternalRobot.g:1287:4: (lv_e_1_0= ruleAtomic )
            {
            // InternalRobot.g:1287:4: (lv_e_1_0= ruleAtomic )
            // InternalRobot.g:1288:5: lv_e_1_0= ruleAtomic
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
    // InternalRobot.g:1309:1: ruleSingletonTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'step' ) | (enumLiteral_1= 'turnLeft' ) | (enumLiteral_2= 'drop' ) | (enumLiteral_3= 'pick' ) ) ;
    public final Enumerator ruleSingletonTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalRobot.g:1315:2: ( ( (enumLiteral_0= 'step' ) | (enumLiteral_1= 'turnLeft' ) | (enumLiteral_2= 'drop' ) | (enumLiteral_3= 'pick' ) ) )
            // InternalRobot.g:1316:2: ( (enumLiteral_0= 'step' ) | (enumLiteral_1= 'turnLeft' ) | (enumLiteral_2= 'drop' ) | (enumLiteral_3= 'pick' ) )
            {
            // InternalRobot.g:1316:2: ( (enumLiteral_0= 'step' ) | (enumLiteral_1= 'turnLeft' ) | (enumLiteral_2= 'drop' ) | (enumLiteral_3= 'pick' ) )
            int alt32=4;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt32=1;
                }
                break;
            case 38:
                {
                alt32=2;
                }
                break;
            case 39:
                {
                alt32=3;
                }
                break;
            case 40:
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
                    // InternalRobot.g:1317:3: (enumLiteral_0= 'step' )
                    {
                    // InternalRobot.g:1317:3: (enumLiteral_0= 'step' )
                    // InternalRobot.g:1318:4: enumLiteral_0= 'step'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getSingletonTypesAccess().getStepEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSingletonTypesAccess().getStepEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRobot.g:1325:3: (enumLiteral_1= 'turnLeft' )
                    {
                    // InternalRobot.g:1325:3: (enumLiteral_1= 'turnLeft' )
                    // InternalRobot.g:1326:4: enumLiteral_1= 'turnLeft'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getSingletonTypesAccess().getTurnLeftEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSingletonTypesAccess().getTurnLeftEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRobot.g:1333:3: (enumLiteral_2= 'drop' )
                    {
                    // InternalRobot.g:1333:3: (enumLiteral_2= 'drop' )
                    // InternalRobot.g:1334:4: enumLiteral_2= 'drop'
                    {
                    enumLiteral_2=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getSingletonTypesAccess().getDropEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSingletonTypesAccess().getDropEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRobot.g:1341:3: (enumLiteral_3= 'pick' )
                    {
                    // InternalRobot.g:1341:3: (enumLiteral_3= 'pick' )
                    // InternalRobot.g:1342:4: enumLiteral_3= 'pick'
                    {
                    enumLiteral_3=(Token)match(input,40,FOLLOW_2); 

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
    // InternalRobot.g:1352:1: ruleOrientation returns [Enumerator current=null] : ( (enumLiteral_0= 'south' ) | (enumLiteral_1= 'north' ) | (enumLiteral_2= 'east' ) | (enumLiteral_3= 'west' ) ) ;
    public final Enumerator ruleOrientation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalRobot.g:1358:2: ( ( (enumLiteral_0= 'south' ) | (enumLiteral_1= 'north' ) | (enumLiteral_2= 'east' ) | (enumLiteral_3= 'west' ) ) )
            // InternalRobot.g:1359:2: ( (enumLiteral_0= 'south' ) | (enumLiteral_1= 'north' ) | (enumLiteral_2= 'east' ) | (enumLiteral_3= 'west' ) )
            {
            // InternalRobot.g:1359:2: ( (enumLiteral_0= 'south' ) | (enumLiteral_1= 'north' ) | (enumLiteral_2= 'east' ) | (enumLiteral_3= 'west' ) )
            int alt33=4;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt33=1;
                }
                break;
            case 42:
                {
                alt33=2;
                }
                break;
            case 43:
                {
                alt33=3;
                }
                break;
            case 44:
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
                    // InternalRobot.g:1360:3: (enumLiteral_0= 'south' )
                    {
                    // InternalRobot.g:1360:3: (enumLiteral_0= 'south' )
                    // InternalRobot.g:1361:4: enumLiteral_0= 'south'
                    {
                    enumLiteral_0=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getOrientationAccess().getSouthEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOrientationAccess().getSouthEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRobot.g:1368:3: (enumLiteral_1= 'north' )
                    {
                    // InternalRobot.g:1368:3: (enumLiteral_1= 'north' )
                    // InternalRobot.g:1369:4: enumLiteral_1= 'north'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getOrientationAccess().getNorthEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOrientationAccess().getNorthEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRobot.g:1376:3: (enumLiteral_2= 'east' )
                    {
                    // InternalRobot.g:1376:3: (enumLiteral_2= 'east' )
                    // InternalRobot.g:1377:4: enumLiteral_2= 'east'
                    {
                    enumLiteral_2=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getOrientationAccess().getEastEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOrientationAccess().getEastEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRobot.g:1384:3: (enumLiteral_3= 'west' )
                    {
                    // InternalRobot.g:1384:3: (enumLiteral_3= 'west' )
                    // InternalRobot.g:1385:4: enumLiteral_3= 'west'
                    {
                    enumLiteral_3=(Token)match(input,44,FOLLOW_2); 

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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000001E02B198040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000001E02B190040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000001B80000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000001E06B198040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000001E06B190040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00001E0000000000L});

}