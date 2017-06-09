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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NAME", "RULE_STRING", "RULE_ID", "RULE_COMMENTTEXT", "RULE_PROPERINT", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Script'", "'runs'", "'as'", "'\\n'", "'end'", "'and'", "'or'", "'trace'", "'buildWall'", "'at'", "'row:'", "'col:'", "'dropMark'", "'while'", "'do'", "'repeat'", "'times'", "'if'", "'else'", "'full'", "'mark'", "'wall'", "'ahead'", "'heading'", "'not'", "'step'", "'turnLeft'", "'drop'", "'pick'", "'south'", "'north'", "'east'", "'west'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=9;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_COMMENTTEXT=7;
    public static final int RULE_NAME=4;
    public static final int RULE_STRING=5;
    public static final int RULE_PROPERINT=8;
    public static final int RULE_SL_COMMENT=11;
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
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
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
    // InternalRobot.g:72:1: ruleRobot returns [EObject current=null] : ( () otherlv_1= 'Script' ( (lv_name_2_0= RULE_NAME ) ) otherlv_3= 'runs' otherlv_4= 'as' (otherlv_5= '\\n' )? ( ( (lv_statements_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? ( ( (lv_statements_8_0= ruleStatement ) ) (otherlv_9= '\\n' )? )* )? otherlv_10= 'end' ) ;
    public final EObject ruleRobot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_statements_6_0 = null;

        EObject lv_statements_8_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:78:2: ( ( () otherlv_1= 'Script' ( (lv_name_2_0= RULE_NAME ) ) otherlv_3= 'runs' otherlv_4= 'as' (otherlv_5= '\\n' )? ( ( (lv_statements_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? ( ( (lv_statements_8_0= ruleStatement ) ) (otherlv_9= '\\n' )? )* )? otherlv_10= 'end' ) )
            // InternalRobot.g:79:2: ( () otherlv_1= 'Script' ( (lv_name_2_0= RULE_NAME ) ) otherlv_3= 'runs' otherlv_4= 'as' (otherlv_5= '\\n' )? ( ( (lv_statements_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? ( ( (lv_statements_8_0= ruleStatement ) ) (otherlv_9= '\\n' )? )* )? otherlv_10= 'end' )
            {
            // InternalRobot.g:79:2: ( () otherlv_1= 'Script' ( (lv_name_2_0= RULE_NAME ) ) otherlv_3= 'runs' otherlv_4= 'as' (otherlv_5= '\\n' )? ( ( (lv_statements_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? ( ( (lv_statements_8_0= ruleStatement ) ) (otherlv_9= '\\n' )? )* )? otherlv_10= 'end' )
            // InternalRobot.g:80:3: () otherlv_1= 'Script' ( (lv_name_2_0= RULE_NAME ) ) otherlv_3= 'runs' otherlv_4= 'as' (otherlv_5= '\\n' )? ( ( (lv_statements_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? ( ( (lv_statements_8_0= ruleStatement ) ) (otherlv_9= '\\n' )? )* )? otherlv_10= 'end'
            {
            // InternalRobot.g:80:3: ()
            // InternalRobot.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRobotAccess().getRobotAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRobotAccess().getScriptKeyword_1());
            		
            // InternalRobot.g:91:3: ( (lv_name_2_0= RULE_NAME ) )
            // InternalRobot.g:92:4: (lv_name_2_0= RULE_NAME )
            {
            // InternalRobot.g:92:4: (lv_name_2_0= RULE_NAME )
            // InternalRobot.g:93:5: lv_name_2_0= RULE_NAME
            {
            lv_name_2_0=(Token)match(input,RULE_NAME,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getRobotAccess().getNameNAMETerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRobotRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.Robot.NAME");
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getRobotAccess().getRunsKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getRobotAccess().getAsKeyword_4());
            		
            // InternalRobot.g:117:3: (otherlv_5= '\\n' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==17) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalRobot.g:118:4: otherlv_5= '\\n'
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getRobotAccess().getLineFeedKeyword_5());
                    			

                    }
                    break;

            }

            // InternalRobot.g:123:3: ( ( (lv_statements_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? ( ( (lv_statements_8_0= ruleStatement ) ) (otherlv_9= '\\n' )? )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_COMMENTTEXT||(LA5_0>=21 && LA5_0<=22)||(LA5_0>=26 && LA5_0<=27)||LA5_0==29||LA5_0==31||(LA5_0>=39 && LA5_0<=42)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRobot.g:124:4: ( (lv_statements_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? ( ( (lv_statements_8_0= ruleStatement ) ) (otherlv_9= '\\n' )? )*
                    {
                    // InternalRobot.g:124:4: ( (lv_statements_6_0= ruleStatement ) )
                    // InternalRobot.g:125:5: (lv_statements_6_0= ruleStatement )
                    {
                    // InternalRobot.g:125:5: (lv_statements_6_0= ruleStatement )
                    // InternalRobot.g:126:6: lv_statements_6_0= ruleStatement
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

                    // InternalRobot.g:143:4: (otherlv_7= '\\n' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==17) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalRobot.g:144:5: otherlv_7= '\\n'
                            {
                            otherlv_7=(Token)match(input,17,FOLLOW_7); 

                            					newLeafNode(otherlv_7, grammarAccess.getRobotAccess().getLineFeedKeyword_6_1());
                            				

                            }
                            break;

                    }

                    // InternalRobot.g:149:4: ( ( (lv_statements_8_0= ruleStatement ) ) (otherlv_9= '\\n' )? )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_COMMENTTEXT||(LA4_0>=21 && LA4_0<=22)||(LA4_0>=26 && LA4_0<=27)||LA4_0==29||LA4_0==31||(LA4_0>=39 && LA4_0<=42)) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalRobot.g:150:5: ( (lv_statements_8_0= ruleStatement ) ) (otherlv_9= '\\n' )?
                    	    {
                    	    // InternalRobot.g:150:5: ( (lv_statements_8_0= ruleStatement ) )
                    	    // InternalRobot.g:151:6: (lv_statements_8_0= ruleStatement )
                    	    {
                    	    // InternalRobot.g:151:6: (lv_statements_8_0= ruleStatement )
                    	    // InternalRobot.g:152:7: lv_statements_8_0= ruleStatement
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

                    	    // InternalRobot.g:169:5: (otherlv_9= '\\n' )?
                    	    int alt3=2;
                    	    int LA3_0 = input.LA(1);

                    	    if ( (LA3_0==17) ) {
                    	        alt3=1;
                    	    }
                    	    switch (alt3) {
                    	        case 1 :
                    	            // InternalRobot.g:170:6: otherlv_9= '\\n'
                    	            {
                    	            otherlv_9=(Token)match(input,17,FOLLOW_7); 

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

            otherlv_10=(Token)match(input,18,FOLLOW_2); 

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
    // InternalRobot.g:185:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalRobot.g:185:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalRobot.g:186:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalRobot.g:192:1: ruleStatement returns [EObject current=null] : (this_Comment_0= ruleComment | this_Singleton_1= ruleSingleton | this_Trace_2= ruleTrace | this_BuildWall_3= ruleBuildWall | this_DropMark_4= ruleDropMark | this_WhileStatement_5= ruleWhileStatement | this_RepeatStatement_6= ruleRepeatStatement | this_IfElseStatement_7= ruleIfElseStatement ) ;
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
            // InternalRobot.g:198:2: ( (this_Comment_0= ruleComment | this_Singleton_1= ruleSingleton | this_Trace_2= ruleTrace | this_BuildWall_3= ruleBuildWall | this_DropMark_4= ruleDropMark | this_WhileStatement_5= ruleWhileStatement | this_RepeatStatement_6= ruleRepeatStatement | this_IfElseStatement_7= ruleIfElseStatement ) )
            // InternalRobot.g:199:2: (this_Comment_0= ruleComment | this_Singleton_1= ruleSingleton | this_Trace_2= ruleTrace | this_BuildWall_3= ruleBuildWall | this_DropMark_4= ruleDropMark | this_WhileStatement_5= ruleWhileStatement | this_RepeatStatement_6= ruleRepeatStatement | this_IfElseStatement_7= ruleIfElseStatement )
            {
            // InternalRobot.g:199:2: (this_Comment_0= ruleComment | this_Singleton_1= ruleSingleton | this_Trace_2= ruleTrace | this_BuildWall_3= ruleBuildWall | this_DropMark_4= ruleDropMark | this_WhileStatement_5= ruleWhileStatement | this_RepeatStatement_6= ruleRepeatStatement | this_IfElseStatement_7= ruleIfElseStatement )
            int alt6=8;
            switch ( input.LA(1) ) {
            case RULE_COMMENTTEXT:
                {
                alt6=1;
                }
                break;
            case 39:
            case 40:
            case 41:
            case 42:
                {
                alt6=2;
                }
                break;
            case 21:
                {
                alt6=3;
                }
                break;
            case 22:
                {
                alt6=4;
                }
                break;
            case 26:
                {
                alt6=5;
                }
                break;
            case 27:
                {
                alt6=6;
                }
                break;
            case 29:
                {
                alt6=7;
                }
                break;
            case 31:
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
                    // InternalRobot.g:200:3: this_Comment_0= ruleComment
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
                    // InternalRobot.g:209:3: this_Singleton_1= ruleSingleton
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
                    // InternalRobot.g:218:3: this_Trace_2= ruleTrace
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
                    // InternalRobot.g:227:3: this_BuildWall_3= ruleBuildWall
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
                    // InternalRobot.g:236:3: this_DropMark_4= ruleDropMark
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
                    // InternalRobot.g:245:3: this_WhileStatement_5= ruleWhileStatement
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
                    // InternalRobot.g:254:3: this_RepeatStatement_6= ruleRepeatStatement
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
                    // InternalRobot.g:263:3: this_IfElseStatement_7= ruleIfElseStatement
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
    // InternalRobot.g:275:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalRobot.g:275:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalRobot.g:276:2: iv_ruleAtomic= ruleAtomic EOF
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
    // InternalRobot.g:282:1: ruleAtomic returns [EObject current=null] : (this_Full_0= ruleFull | this_Mark_1= ruleMark | this_Ahead_2= ruleAhead | this_Heading_3= ruleHeading | this_Not_4= ruleNot ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        EObject this_Full_0 = null;

        EObject this_Mark_1 = null;

        EObject this_Ahead_2 = null;

        EObject this_Heading_3 = null;

        EObject this_Not_4 = null;



        	enterRule();

        try {
            // InternalRobot.g:288:2: ( (this_Full_0= ruleFull | this_Mark_1= ruleMark | this_Ahead_2= ruleAhead | this_Heading_3= ruleHeading | this_Not_4= ruleNot ) )
            // InternalRobot.g:289:2: (this_Full_0= ruleFull | this_Mark_1= ruleMark | this_Ahead_2= ruleAhead | this_Heading_3= ruleHeading | this_Not_4= ruleNot )
            {
            // InternalRobot.g:289:2: (this_Full_0= ruleFull | this_Mark_1= ruleMark | this_Ahead_2= ruleAhead | this_Heading_3= ruleHeading | this_Not_4= ruleNot )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt7=1;
                }
                break;
            case 34:
                {
                alt7=2;
                }
                break;
            case 35:
                {
                alt7=3;
                }
                break;
            case 37:
                {
                alt7=4;
                }
                break;
            case 38:
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
                    // InternalRobot.g:290:3: this_Full_0= ruleFull
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
                    // InternalRobot.g:299:3: this_Mark_1= ruleMark
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
                    // InternalRobot.g:308:3: this_Ahead_2= ruleAhead
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
                    // InternalRobot.g:317:3: this_Heading_3= ruleHeading
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
                    // InternalRobot.g:326:3: this_Not_4= ruleNot
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
    // InternalRobot.g:338:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalRobot.g:338:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalRobot.g:339:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalRobot.g:345:1: ruleExpression returns [EObject current=null] : ( () ( (lv_a_1_0= ruleAtomic ) ) ( (otherlv_2= 'and' | otherlv_3= 'or' ) ( (lv_b_4_0= ruleExpression ) ) )? ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_a_1_0 = null;

        EObject lv_b_4_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:351:2: ( ( () ( (lv_a_1_0= ruleAtomic ) ) ( (otherlv_2= 'and' | otherlv_3= 'or' ) ( (lv_b_4_0= ruleExpression ) ) )? ) )
            // InternalRobot.g:352:2: ( () ( (lv_a_1_0= ruleAtomic ) ) ( (otherlv_2= 'and' | otherlv_3= 'or' ) ( (lv_b_4_0= ruleExpression ) ) )? )
            {
            // InternalRobot.g:352:2: ( () ( (lv_a_1_0= ruleAtomic ) ) ( (otherlv_2= 'and' | otherlv_3= 'or' ) ( (lv_b_4_0= ruleExpression ) ) )? )
            // InternalRobot.g:353:3: () ( (lv_a_1_0= ruleAtomic ) ) ( (otherlv_2= 'and' | otherlv_3= 'or' ) ( (lv_b_4_0= ruleExpression ) ) )?
            {
            // InternalRobot.g:353:3: ()
            // InternalRobot.g:354:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExpressionAccess().getExpressionAction_0(),
            					current);
            			

            }

            // InternalRobot.g:360:3: ( (lv_a_1_0= ruleAtomic ) )
            // InternalRobot.g:361:4: (lv_a_1_0= ruleAtomic )
            {
            // InternalRobot.g:361:4: (lv_a_1_0= ruleAtomic )
            // InternalRobot.g:362:5: lv_a_1_0= ruleAtomic
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

            // InternalRobot.g:379:3: ( (otherlv_2= 'and' | otherlv_3= 'or' ) ( (lv_b_4_0= ruleExpression ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=19 && LA9_0<=20)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRobot.g:380:4: (otherlv_2= 'and' | otherlv_3= 'or' ) ( (lv_b_4_0= ruleExpression ) )
                    {
                    // InternalRobot.g:380:4: (otherlv_2= 'and' | otherlv_3= 'or' )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==19) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==20) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalRobot.g:381:5: otherlv_2= 'and'
                            {
                            otherlv_2=(Token)match(input,19,FOLLOW_9); 

                            					newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getAndKeyword_2_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalRobot.g:386:5: otherlv_3= 'or'
                            {
                            otherlv_3=(Token)match(input,20,FOLLOW_9); 

                            					newLeafNode(otherlv_3, grammarAccess.getExpressionAccess().getOrKeyword_2_0_1());
                            				

                            }
                            break;

                    }

                    // InternalRobot.g:391:4: ( (lv_b_4_0= ruleExpression ) )
                    // InternalRobot.g:392:5: (lv_b_4_0= ruleExpression )
                    {
                    // InternalRobot.g:392:5: (lv_b_4_0= ruleExpression )
                    // InternalRobot.g:393:6: lv_b_4_0= ruleExpression
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
    // InternalRobot.g:415:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRobot.g:415:47: (iv_ruleEString= ruleEString EOF )
            // InternalRobot.g:416:2: iv_ruleEString= ruleEString EOF
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
    // InternalRobot.g:422:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRobot.g:428:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRobot.g:429:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRobot.g:429:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalRobot.g:430:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRobot.g:438:3: this_ID_1= RULE_ID
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
    // InternalRobot.g:449:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // InternalRobot.g:449:48: (iv_ruleComment= ruleComment EOF )
            // InternalRobot.g:450:2: iv_ruleComment= ruleComment EOF
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
    // InternalRobot.g:456:1: ruleComment returns [EObject current=null] : ( () this_COMMENTTEXT_1= RULE_COMMENTTEXT ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token this_COMMENTTEXT_1=null;


        	enterRule();

        try {
            // InternalRobot.g:462:2: ( ( () this_COMMENTTEXT_1= RULE_COMMENTTEXT ) )
            // InternalRobot.g:463:2: ( () this_COMMENTTEXT_1= RULE_COMMENTTEXT )
            {
            // InternalRobot.g:463:2: ( () this_COMMENTTEXT_1= RULE_COMMENTTEXT )
            // InternalRobot.g:464:3: () this_COMMENTTEXT_1= RULE_COMMENTTEXT
            {
            // InternalRobot.g:464:3: ()
            // InternalRobot.g:465:4: 
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
    // InternalRobot.g:479:1: entryRuleSingleton returns [EObject current=null] : iv_ruleSingleton= ruleSingleton EOF ;
    public final EObject entryRuleSingleton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleton = null;


        try {
            // InternalRobot.g:479:50: (iv_ruleSingleton= ruleSingleton EOF )
            // InternalRobot.g:480:2: iv_ruleSingleton= ruleSingleton EOF
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
    // InternalRobot.g:486:1: ruleSingleton returns [EObject current=null] : ( (lv_type_0_0= ruleSingletonTypes ) ) ;
    public final EObject ruleSingleton() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:492:2: ( ( (lv_type_0_0= ruleSingletonTypes ) ) )
            // InternalRobot.g:493:2: ( (lv_type_0_0= ruleSingletonTypes ) )
            {
            // InternalRobot.g:493:2: ( (lv_type_0_0= ruleSingletonTypes ) )
            // InternalRobot.g:494:3: (lv_type_0_0= ruleSingletonTypes )
            {
            // InternalRobot.g:494:3: (lv_type_0_0= ruleSingletonTypes )
            // InternalRobot.g:495:4: lv_type_0_0= ruleSingletonTypes
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
    // InternalRobot.g:515:1: entryRuleTrace returns [EObject current=null] : iv_ruleTrace= ruleTrace EOF ;
    public final EObject entryRuleTrace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrace = null;


        try {
            // InternalRobot.g:515:46: (iv_ruleTrace= ruleTrace EOF )
            // InternalRobot.g:516:2: iv_ruleTrace= ruleTrace EOF
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
    // InternalRobot.g:522:1: ruleTrace returns [EObject current=null] : ( () otherlv_1= 'trace' ( (lv_text_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleTrace() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_text_2_0=null;


        	enterRule();

        try {
            // InternalRobot.g:528:2: ( ( () otherlv_1= 'trace' ( (lv_text_2_0= RULE_STRING ) ) ) )
            // InternalRobot.g:529:2: ( () otherlv_1= 'trace' ( (lv_text_2_0= RULE_STRING ) ) )
            {
            // InternalRobot.g:529:2: ( () otherlv_1= 'trace' ( (lv_text_2_0= RULE_STRING ) ) )
            // InternalRobot.g:530:3: () otherlv_1= 'trace' ( (lv_text_2_0= RULE_STRING ) )
            {
            // InternalRobot.g:530:3: ()
            // InternalRobot.g:531:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTraceAccess().getTraceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getTraceAccess().getTraceKeyword_1());
            		
            // InternalRobot.g:541:3: ( (lv_text_2_0= RULE_STRING ) )
            // InternalRobot.g:542:4: (lv_text_2_0= RULE_STRING )
            {
            // InternalRobot.g:542:4: (lv_text_2_0= RULE_STRING )
            // InternalRobot.g:543:5: lv_text_2_0= RULE_STRING
            {
            lv_text_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_text_2_0, grammarAccess.getTraceAccess().getTextSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTraceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // InternalRobot.g:563:1: entryRuleBuildWall returns [EObject current=null] : iv_ruleBuildWall= ruleBuildWall EOF ;
    public final EObject entryRuleBuildWall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuildWall = null;


        try {
            // InternalRobot.g:563:50: (iv_ruleBuildWall= ruleBuildWall EOF )
            // InternalRobot.g:564:2: iv_ruleBuildWall= ruleBuildWall EOF
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
    // InternalRobot.g:570:1: ruleBuildWall returns [EObject current=null] : (otherlv_0= 'buildWall' otherlv_1= 'at' otherlv_2= 'row:' ( (lv_row_3_0= RULE_PROPERINT ) ) otherlv_4= 'col:' ( (lv_col_5_0= RULE_PROPERINT ) ) ) ;
    public final EObject ruleBuildWall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_row_3_0=null;
        Token otherlv_4=null;
        Token lv_col_5_0=null;


        	enterRule();

        try {
            // InternalRobot.g:576:2: ( (otherlv_0= 'buildWall' otherlv_1= 'at' otherlv_2= 'row:' ( (lv_row_3_0= RULE_PROPERINT ) ) otherlv_4= 'col:' ( (lv_col_5_0= RULE_PROPERINT ) ) ) )
            // InternalRobot.g:577:2: (otherlv_0= 'buildWall' otherlv_1= 'at' otherlv_2= 'row:' ( (lv_row_3_0= RULE_PROPERINT ) ) otherlv_4= 'col:' ( (lv_col_5_0= RULE_PROPERINT ) ) )
            {
            // InternalRobot.g:577:2: (otherlv_0= 'buildWall' otherlv_1= 'at' otherlv_2= 'row:' ( (lv_row_3_0= RULE_PROPERINT ) ) otherlv_4= 'col:' ( (lv_col_5_0= RULE_PROPERINT ) ) )
            // InternalRobot.g:578:3: otherlv_0= 'buildWall' otherlv_1= 'at' otherlv_2= 'row:' ( (lv_row_3_0= RULE_PROPERINT ) ) otherlv_4= 'col:' ( (lv_col_5_0= RULE_PROPERINT ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getBuildWallAccess().getBuildWallKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getBuildWallAccess().getAtKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getBuildWallAccess().getRowKeyword_2());
            		
            // InternalRobot.g:590:3: ( (lv_row_3_0= RULE_PROPERINT ) )
            // InternalRobot.g:591:4: (lv_row_3_0= RULE_PROPERINT )
            {
            // InternalRobot.g:591:4: (lv_row_3_0= RULE_PROPERINT )
            // InternalRobot.g:592:5: lv_row_3_0= RULE_PROPERINT
            {
            lv_row_3_0=(Token)match(input,RULE_PROPERINT,FOLLOW_14); 

            					newLeafNode(lv_row_3_0, grammarAccess.getBuildWallAccess().getRowPROPERINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBuildWallRule());
            					}
            					setWithLastConsumed(
            						current,
            						"row",
            						lv_row_3_0,
            						"org.xtext.Robot.PROPERINT");
            				

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getBuildWallAccess().getColKeyword_4());
            		
            // InternalRobot.g:612:3: ( (lv_col_5_0= RULE_PROPERINT ) )
            // InternalRobot.g:613:4: (lv_col_5_0= RULE_PROPERINT )
            {
            // InternalRobot.g:613:4: (lv_col_5_0= RULE_PROPERINT )
            // InternalRobot.g:614:5: lv_col_5_0= RULE_PROPERINT
            {
            lv_col_5_0=(Token)match(input,RULE_PROPERINT,FOLLOW_2); 

            					newLeafNode(lv_col_5_0, grammarAccess.getBuildWallAccess().getColPROPERINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBuildWallRule());
            					}
            					setWithLastConsumed(
            						current,
            						"col",
            						lv_col_5_0,
            						"org.xtext.Robot.PROPERINT");
            				

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
    // InternalRobot.g:634:1: entryRuleDropMark returns [EObject current=null] : iv_ruleDropMark= ruleDropMark EOF ;
    public final EObject entryRuleDropMark() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropMark = null;


        try {
            // InternalRobot.g:634:49: (iv_ruleDropMark= ruleDropMark EOF )
            // InternalRobot.g:635:2: iv_ruleDropMark= ruleDropMark EOF
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
    // InternalRobot.g:641:1: ruleDropMark returns [EObject current=null] : (otherlv_0= 'dropMark' otherlv_1= 'at' otherlv_2= 'row:' ( (lv_row_3_0= RULE_PROPERINT ) ) otherlv_4= 'col:' ( (lv_col_5_0= RULE_PROPERINT ) ) ) ;
    public final EObject ruleDropMark() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_row_3_0=null;
        Token otherlv_4=null;
        Token lv_col_5_0=null;


        	enterRule();

        try {
            // InternalRobot.g:647:2: ( (otherlv_0= 'dropMark' otherlv_1= 'at' otherlv_2= 'row:' ( (lv_row_3_0= RULE_PROPERINT ) ) otherlv_4= 'col:' ( (lv_col_5_0= RULE_PROPERINT ) ) ) )
            // InternalRobot.g:648:2: (otherlv_0= 'dropMark' otherlv_1= 'at' otherlv_2= 'row:' ( (lv_row_3_0= RULE_PROPERINT ) ) otherlv_4= 'col:' ( (lv_col_5_0= RULE_PROPERINT ) ) )
            {
            // InternalRobot.g:648:2: (otherlv_0= 'dropMark' otherlv_1= 'at' otherlv_2= 'row:' ( (lv_row_3_0= RULE_PROPERINT ) ) otherlv_4= 'col:' ( (lv_col_5_0= RULE_PROPERINT ) ) )
            // InternalRobot.g:649:3: otherlv_0= 'dropMark' otherlv_1= 'at' otherlv_2= 'row:' ( (lv_row_3_0= RULE_PROPERINT ) ) otherlv_4= 'col:' ( (lv_col_5_0= RULE_PROPERINT ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getDropMarkAccess().getDropMarkKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getDropMarkAccess().getAtKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getDropMarkAccess().getRowKeyword_2());
            		
            // InternalRobot.g:661:3: ( (lv_row_3_0= RULE_PROPERINT ) )
            // InternalRobot.g:662:4: (lv_row_3_0= RULE_PROPERINT )
            {
            // InternalRobot.g:662:4: (lv_row_3_0= RULE_PROPERINT )
            // InternalRobot.g:663:5: lv_row_3_0= RULE_PROPERINT
            {
            lv_row_3_0=(Token)match(input,RULE_PROPERINT,FOLLOW_14); 

            					newLeafNode(lv_row_3_0, grammarAccess.getDropMarkAccess().getRowPROPERINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDropMarkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"row",
            						lv_row_3_0,
            						"org.xtext.Robot.PROPERINT");
            				

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getDropMarkAccess().getColKeyword_4());
            		
            // InternalRobot.g:683:3: ( (lv_col_5_0= RULE_PROPERINT ) )
            // InternalRobot.g:684:4: (lv_col_5_0= RULE_PROPERINT )
            {
            // InternalRobot.g:684:4: (lv_col_5_0= RULE_PROPERINT )
            // InternalRobot.g:685:5: lv_col_5_0= RULE_PROPERINT
            {
            lv_col_5_0=(Token)match(input,RULE_PROPERINT,FOLLOW_2); 

            					newLeafNode(lv_col_5_0, grammarAccess.getDropMarkAccess().getColPROPERINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDropMarkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"col",
            						lv_col_5_0,
            						"org.xtext.Robot.PROPERINT");
            				

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
    // InternalRobot.g:705:1: entryRuleWhileStatement returns [EObject current=null] : iv_ruleWhileStatement= ruleWhileStatement EOF ;
    public final EObject entryRuleWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileStatement = null;


        try {
            // InternalRobot.g:705:55: (iv_ruleWhileStatement= ruleWhileStatement EOF )
            // InternalRobot.g:706:2: iv_ruleWhileStatement= ruleWhileStatement EOF
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
    // InternalRobot.g:712:1: ruleWhileStatement returns [EObject current=null] : (otherlv_0= 'while' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'do' (otherlv_3= '\\n' )? ( ( (lv_body_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )* )? otherlv_8= 'end' ) ;
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
            // InternalRobot.g:718:2: ( (otherlv_0= 'while' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'do' (otherlv_3= '\\n' )? ( ( (lv_body_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )* )? otherlv_8= 'end' ) )
            // InternalRobot.g:719:2: (otherlv_0= 'while' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'do' (otherlv_3= '\\n' )? ( ( (lv_body_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )* )? otherlv_8= 'end' )
            {
            // InternalRobot.g:719:2: (otherlv_0= 'while' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'do' (otherlv_3= '\\n' )? ( ( (lv_body_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )* )? otherlv_8= 'end' )
            // InternalRobot.g:720:3: otherlv_0= 'while' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'do' (otherlv_3= '\\n' )? ( ( (lv_body_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )* )? otherlv_8= 'end'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getWhileStatementAccess().getWhileKeyword_0());
            		
            // InternalRobot.g:724:3: ( (lv_cond_1_0= ruleExpression ) )
            // InternalRobot.g:725:4: (lv_cond_1_0= ruleExpression )
            {
            // InternalRobot.g:725:4: (lv_cond_1_0= ruleExpression )
            // InternalRobot.g:726:5: lv_cond_1_0= ruleExpression
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

            otherlv_2=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getWhileStatementAccess().getDoKeyword_2());
            		
            // InternalRobot.g:747:3: (otherlv_3= '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRobot.g:748:4: otherlv_3= '\\n'
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getWhileStatementAccess().getLineFeedKeyword_3());
                    			

                    }
                    break;

            }

            // InternalRobot.g:753:3: ( ( (lv_body_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_COMMENTTEXT||(LA15_0>=21 && LA15_0<=22)||(LA15_0>=26 && LA15_0<=27)||LA15_0==29||LA15_0==31||(LA15_0>=39 && LA15_0<=42)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRobot.g:754:4: ( (lv_body_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )*
                    {
                    // InternalRobot.g:754:4: ( (lv_body_4_0= ruleStatement ) )
                    // InternalRobot.g:755:5: (lv_body_4_0= ruleStatement )
                    {
                    // InternalRobot.g:755:5: (lv_body_4_0= ruleStatement )
                    // InternalRobot.g:756:6: lv_body_4_0= ruleStatement
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

                    // InternalRobot.g:773:4: (otherlv_5= '\\n' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==17) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalRobot.g:774:5: otherlv_5= '\\n'
                            {
                            otherlv_5=(Token)match(input,17,FOLLOW_7); 

                            					newLeafNode(otherlv_5, grammarAccess.getWhileStatementAccess().getLineFeedKeyword_4_1());
                            				

                            }
                            break;

                    }

                    // InternalRobot.g:779:4: ( ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==RULE_COMMENTTEXT||(LA14_0>=21 && LA14_0<=22)||(LA14_0>=26 && LA14_0<=27)||LA14_0==29||LA14_0==31||(LA14_0>=39 && LA14_0<=42)) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalRobot.g:780:5: ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= '\\n' )?
                    	    {
                    	    // InternalRobot.g:780:5: ( (lv_body_6_0= ruleStatement ) )
                    	    // InternalRobot.g:781:6: (lv_body_6_0= ruleStatement )
                    	    {
                    	    // InternalRobot.g:781:6: (lv_body_6_0= ruleStatement )
                    	    // InternalRobot.g:782:7: lv_body_6_0= ruleStatement
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

                    	    // InternalRobot.g:799:5: (otherlv_7= '\\n' )?
                    	    int alt13=2;
                    	    int LA13_0 = input.LA(1);

                    	    if ( (LA13_0==17) ) {
                    	        alt13=1;
                    	    }
                    	    switch (alt13) {
                    	        case 1 :
                    	            // InternalRobot.g:800:6: otherlv_7= '\\n'
                    	            {
                    	            otherlv_7=(Token)match(input,17,FOLLOW_7); 

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

            otherlv_8=(Token)match(input,18,FOLLOW_2); 

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
    // InternalRobot.g:815:1: entryRuleRepeatStatement returns [EObject current=null] : iv_ruleRepeatStatement= ruleRepeatStatement EOF ;
    public final EObject entryRuleRepeatStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepeatStatement = null;


        try {
            // InternalRobot.g:815:56: (iv_ruleRepeatStatement= ruleRepeatStatement EOF )
            // InternalRobot.g:816:2: iv_ruleRepeatStatement= ruleRepeatStatement EOF
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
    // InternalRobot.g:822:1: ruleRepeatStatement returns [EObject current=null] : (otherlv_0= 'repeat' ( (lv_times_1_0= RULE_PROPERINT ) ) otherlv_2= 'times' (otherlv_3= '\\n' )? ( ( (lv_body_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )* )? otherlv_8= 'end' ) ;
    public final EObject ruleRepeatStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_times_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_body_4_0 = null;

        EObject lv_body_6_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:828:2: ( (otherlv_0= 'repeat' ( (lv_times_1_0= RULE_PROPERINT ) ) otherlv_2= 'times' (otherlv_3= '\\n' )? ( ( (lv_body_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )* )? otherlv_8= 'end' ) )
            // InternalRobot.g:829:2: (otherlv_0= 'repeat' ( (lv_times_1_0= RULE_PROPERINT ) ) otherlv_2= 'times' (otherlv_3= '\\n' )? ( ( (lv_body_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )* )? otherlv_8= 'end' )
            {
            // InternalRobot.g:829:2: (otherlv_0= 'repeat' ( (lv_times_1_0= RULE_PROPERINT ) ) otherlv_2= 'times' (otherlv_3= '\\n' )? ( ( (lv_body_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )* )? otherlv_8= 'end' )
            // InternalRobot.g:830:3: otherlv_0= 'repeat' ( (lv_times_1_0= RULE_PROPERINT ) ) otherlv_2= 'times' (otherlv_3= '\\n' )? ( ( (lv_body_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )* )? otherlv_8= 'end'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getRepeatStatementAccess().getRepeatKeyword_0());
            		
            // InternalRobot.g:834:3: ( (lv_times_1_0= RULE_PROPERINT ) )
            // InternalRobot.g:835:4: (lv_times_1_0= RULE_PROPERINT )
            {
            // InternalRobot.g:835:4: (lv_times_1_0= RULE_PROPERINT )
            // InternalRobot.g:836:5: lv_times_1_0= RULE_PROPERINT
            {
            lv_times_1_0=(Token)match(input,RULE_PROPERINT,FOLLOW_16); 

            					newLeafNode(lv_times_1_0, grammarAccess.getRepeatStatementAccess().getTimesPROPERINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRepeatStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"times",
            						lv_times_1_0,
            						"org.xtext.Robot.PROPERINT");
            				

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getRepeatStatementAccess().getTimesKeyword_2());
            		
            // InternalRobot.g:856:3: (otherlv_3= '\\n' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==17) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRobot.g:857:4: otherlv_3= '\\n'
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getRepeatStatementAccess().getLineFeedKeyword_3());
                    			

                    }
                    break;

            }

            // InternalRobot.g:862:3: ( ( (lv_body_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_COMMENTTEXT||(LA20_0>=21 && LA20_0<=22)||(LA20_0>=26 && LA20_0<=27)||LA20_0==29||LA20_0==31||(LA20_0>=39 && LA20_0<=42)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRobot.g:863:4: ( (lv_body_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )*
                    {
                    // InternalRobot.g:863:4: ( (lv_body_4_0= ruleStatement ) )
                    // InternalRobot.g:864:5: (lv_body_4_0= ruleStatement )
                    {
                    // InternalRobot.g:864:5: (lv_body_4_0= ruleStatement )
                    // InternalRobot.g:865:6: lv_body_4_0= ruleStatement
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

                    // InternalRobot.g:882:4: (otherlv_5= '\\n' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==17) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalRobot.g:883:5: otherlv_5= '\\n'
                            {
                            otherlv_5=(Token)match(input,17,FOLLOW_7); 

                            					newLeafNode(otherlv_5, grammarAccess.getRepeatStatementAccess().getLineFeedKeyword_4_1());
                            				

                            }
                            break;

                    }

                    // InternalRobot.g:888:4: ( ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==RULE_COMMENTTEXT||(LA19_0>=21 && LA19_0<=22)||(LA19_0>=26 && LA19_0<=27)||LA19_0==29||LA19_0==31||(LA19_0>=39 && LA19_0<=42)) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalRobot.g:889:5: ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= '\\n' )?
                    	    {
                    	    // InternalRobot.g:889:5: ( (lv_body_6_0= ruleStatement ) )
                    	    // InternalRobot.g:890:6: (lv_body_6_0= ruleStatement )
                    	    {
                    	    // InternalRobot.g:890:6: (lv_body_6_0= ruleStatement )
                    	    // InternalRobot.g:891:7: lv_body_6_0= ruleStatement
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

                    	    // InternalRobot.g:908:5: (otherlv_7= '\\n' )?
                    	    int alt18=2;
                    	    int LA18_0 = input.LA(1);

                    	    if ( (LA18_0==17) ) {
                    	        alt18=1;
                    	    }
                    	    switch (alt18) {
                    	        case 1 :
                    	            // InternalRobot.g:909:6: otherlv_7= '\\n'
                    	            {
                    	            otherlv_7=(Token)match(input,17,FOLLOW_7); 

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

            otherlv_8=(Token)match(input,18,FOLLOW_2); 

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
    // InternalRobot.g:924:1: entryRuleIfElseStatement returns [EObject current=null] : iv_ruleIfElseStatement= ruleIfElseStatement EOF ;
    public final EObject entryRuleIfElseStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfElseStatement = null;


        try {
            // InternalRobot.g:924:56: (iv_ruleIfElseStatement= ruleIfElseStatement EOF )
            // InternalRobot.g:925:2: iv_ruleIfElseStatement= ruleIfElseStatement EOF
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
    // InternalRobot.g:931:1: ruleIfElseStatement returns [EObject current=null] : (otherlv_0= 'if' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'do' (otherlv_3= '\\n' )? ( ( (lv_ifbody_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_ifbody_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )* )? (otherlv_8= 'else' otherlv_9= 'do' (otherlv_10= '\\n' )? ( ( (lv_elsebody_11_0= ruleStatement ) ) (otherlv_12= '\\n' )? ( ( (lv_elsebody_13_0= ruleStatement ) ) (otherlv_14= '\\n' )? )* )? )? otherlv_15= 'end' ) ;
    public final EObject ruleIfElseStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_cond_1_0 = null;

        EObject lv_ifbody_4_0 = null;

        EObject lv_ifbody_6_0 = null;

        EObject lv_elsebody_11_0 = null;

        EObject lv_elsebody_13_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:937:2: ( (otherlv_0= 'if' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'do' (otherlv_3= '\\n' )? ( ( (lv_ifbody_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_ifbody_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )* )? (otherlv_8= 'else' otherlv_9= 'do' (otherlv_10= '\\n' )? ( ( (lv_elsebody_11_0= ruleStatement ) ) (otherlv_12= '\\n' )? ( ( (lv_elsebody_13_0= ruleStatement ) ) (otherlv_14= '\\n' )? )* )? )? otherlv_15= 'end' ) )
            // InternalRobot.g:938:2: (otherlv_0= 'if' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'do' (otherlv_3= '\\n' )? ( ( (lv_ifbody_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_ifbody_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )* )? (otherlv_8= 'else' otherlv_9= 'do' (otherlv_10= '\\n' )? ( ( (lv_elsebody_11_0= ruleStatement ) ) (otherlv_12= '\\n' )? ( ( (lv_elsebody_13_0= ruleStatement ) ) (otherlv_14= '\\n' )? )* )? )? otherlv_15= 'end' )
            {
            // InternalRobot.g:938:2: (otherlv_0= 'if' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'do' (otherlv_3= '\\n' )? ( ( (lv_ifbody_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_ifbody_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )* )? (otherlv_8= 'else' otherlv_9= 'do' (otherlv_10= '\\n' )? ( ( (lv_elsebody_11_0= ruleStatement ) ) (otherlv_12= '\\n' )? ( ( (lv_elsebody_13_0= ruleStatement ) ) (otherlv_14= '\\n' )? )* )? )? otherlv_15= 'end' )
            // InternalRobot.g:939:3: otherlv_0= 'if' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'do' (otherlv_3= '\\n' )? ( ( (lv_ifbody_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_ifbody_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )* )? (otherlv_8= 'else' otherlv_9= 'do' (otherlv_10= '\\n' )? ( ( (lv_elsebody_11_0= ruleStatement ) ) (otherlv_12= '\\n' )? ( ( (lv_elsebody_13_0= ruleStatement ) ) (otherlv_14= '\\n' )? )* )? )? otherlv_15= 'end'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getIfElseStatementAccess().getIfKeyword_0());
            		
            // InternalRobot.g:943:3: ( (lv_cond_1_0= ruleExpression ) )
            // InternalRobot.g:944:4: (lv_cond_1_0= ruleExpression )
            {
            // InternalRobot.g:944:4: (lv_cond_1_0= ruleExpression )
            // InternalRobot.g:945:5: lv_cond_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getIfElseStatementAccess().getCondExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
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

            otherlv_2=(Token)match(input,28,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getIfElseStatementAccess().getDoKeyword_2());
            		
            // InternalRobot.g:966:3: (otherlv_3= '\\n' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==17) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRobot.g:967:4: otherlv_3= '\\n'
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_18); 

                    				newLeafNode(otherlv_3, grammarAccess.getIfElseStatementAccess().getLineFeedKeyword_3());
                    			

                    }
                    break;

            }

            // InternalRobot.g:972:3: ( ( (lv_ifbody_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_ifbody_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_COMMENTTEXT||(LA25_0>=21 && LA25_0<=22)||(LA25_0>=26 && LA25_0<=27)||LA25_0==29||LA25_0==31||(LA25_0>=39 && LA25_0<=42)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalRobot.g:973:4: ( (lv_ifbody_4_0= ruleStatement ) ) (otherlv_5= '\\n' )? ( ( (lv_ifbody_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )*
                    {
                    // InternalRobot.g:973:4: ( (lv_ifbody_4_0= ruleStatement ) )
                    // InternalRobot.g:974:5: (lv_ifbody_4_0= ruleStatement )
                    {
                    // InternalRobot.g:974:5: (lv_ifbody_4_0= ruleStatement )
                    // InternalRobot.g:975:6: lv_ifbody_4_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getIfElseStatementAccess().getIfbodyStatementParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_17);
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

                    // InternalRobot.g:992:4: (otherlv_5= '\\n' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==17) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalRobot.g:993:5: otherlv_5= '\\n'
                            {
                            otherlv_5=(Token)match(input,17,FOLLOW_18); 

                            					newLeafNode(otherlv_5, grammarAccess.getIfElseStatementAccess().getLineFeedKeyword_4_1());
                            				

                            }
                            break;

                    }

                    // InternalRobot.g:998:4: ( ( (lv_ifbody_6_0= ruleStatement ) ) (otherlv_7= '\\n' )? )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==RULE_COMMENTTEXT||(LA24_0>=21 && LA24_0<=22)||(LA24_0>=26 && LA24_0<=27)||LA24_0==29||LA24_0==31||(LA24_0>=39 && LA24_0<=42)) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalRobot.g:999:5: ( (lv_ifbody_6_0= ruleStatement ) ) (otherlv_7= '\\n' )?
                    	    {
                    	    // InternalRobot.g:999:5: ( (lv_ifbody_6_0= ruleStatement ) )
                    	    // InternalRobot.g:1000:6: (lv_ifbody_6_0= ruleStatement )
                    	    {
                    	    // InternalRobot.g:1000:6: (lv_ifbody_6_0= ruleStatement )
                    	    // InternalRobot.g:1001:7: lv_ifbody_6_0= ruleStatement
                    	    {

                    	    							newCompositeNode(grammarAccess.getIfElseStatementAccess().getIfbodyStatementParserRuleCall_4_2_0_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
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

                    	    // InternalRobot.g:1018:5: (otherlv_7= '\\n' )?
                    	    int alt23=2;
                    	    int LA23_0 = input.LA(1);

                    	    if ( (LA23_0==17) ) {
                    	        alt23=1;
                    	    }
                    	    switch (alt23) {
                    	        case 1 :
                    	            // InternalRobot.g:1019:6: otherlv_7= '\\n'
                    	            {
                    	            otherlv_7=(Token)match(input,17,FOLLOW_18); 

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

            // InternalRobot.g:1026:3: (otherlv_8= 'else' otherlv_9= 'do' (otherlv_10= '\\n' )? ( ( (lv_elsebody_11_0= ruleStatement ) ) (otherlv_12= '\\n' )? ( ( (lv_elsebody_13_0= ruleStatement ) ) (otherlv_14= '\\n' )? )* )? )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==32) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalRobot.g:1027:4: otherlv_8= 'else' otherlv_9= 'do' (otherlv_10= '\\n' )? ( ( (lv_elsebody_11_0= ruleStatement ) ) (otherlv_12= '\\n' )? ( ( (lv_elsebody_13_0= ruleStatement ) ) (otherlv_14= '\\n' )? )* )?
                    {
                    otherlv_8=(Token)match(input,32,FOLLOW_15); 

                    				newLeafNode(otherlv_8, grammarAccess.getIfElseStatementAccess().getElseKeyword_5_0());
                    			
                    otherlv_9=(Token)match(input,28,FOLLOW_6); 

                    				newLeafNode(otherlv_9, grammarAccess.getIfElseStatementAccess().getDoKeyword_5_1());
                    			
                    // InternalRobot.g:1035:4: (otherlv_10= '\\n' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==17) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalRobot.g:1036:5: otherlv_10= '\\n'
                            {
                            otherlv_10=(Token)match(input,17,FOLLOW_7); 

                            					newLeafNode(otherlv_10, grammarAccess.getIfElseStatementAccess().getLineFeedKeyword_5_2());
                            				

                            }
                            break;

                    }

                    // InternalRobot.g:1041:4: ( ( (lv_elsebody_11_0= ruleStatement ) ) (otherlv_12= '\\n' )? ( ( (lv_elsebody_13_0= ruleStatement ) ) (otherlv_14= '\\n' )? )* )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==RULE_COMMENTTEXT||(LA30_0>=21 && LA30_0<=22)||(LA30_0>=26 && LA30_0<=27)||LA30_0==29||LA30_0==31||(LA30_0>=39 && LA30_0<=42)) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalRobot.g:1042:5: ( (lv_elsebody_11_0= ruleStatement ) ) (otherlv_12= '\\n' )? ( ( (lv_elsebody_13_0= ruleStatement ) ) (otherlv_14= '\\n' )? )*
                            {
                            // InternalRobot.g:1042:5: ( (lv_elsebody_11_0= ruleStatement ) )
                            // InternalRobot.g:1043:6: (lv_elsebody_11_0= ruleStatement )
                            {
                            // InternalRobot.g:1043:6: (lv_elsebody_11_0= ruleStatement )
                            // InternalRobot.g:1044:7: lv_elsebody_11_0= ruleStatement
                            {

                            							newCompositeNode(grammarAccess.getIfElseStatementAccess().getElsebodyStatementParserRuleCall_5_3_0_0());
                            						
                            pushFollow(FOLLOW_6);
                            lv_elsebody_11_0=ruleStatement();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getIfElseStatementRule());
                            							}
                            							add(
                            								current,
                            								"elsebody",
                            								lv_elsebody_11_0,
                            								"org.xtext.Robot.Statement");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalRobot.g:1061:5: (otherlv_12= '\\n' )?
                            int alt27=2;
                            int LA27_0 = input.LA(1);

                            if ( (LA27_0==17) ) {
                                alt27=1;
                            }
                            switch (alt27) {
                                case 1 :
                                    // InternalRobot.g:1062:6: otherlv_12= '\\n'
                                    {
                                    otherlv_12=(Token)match(input,17,FOLLOW_7); 

                                    						newLeafNode(otherlv_12, grammarAccess.getIfElseStatementAccess().getLineFeedKeyword_5_3_1());
                                    					

                                    }
                                    break;

                            }

                            // InternalRobot.g:1067:5: ( ( (lv_elsebody_13_0= ruleStatement ) ) (otherlv_14= '\\n' )? )*
                            loop29:
                            do {
                                int alt29=2;
                                int LA29_0 = input.LA(1);

                                if ( (LA29_0==RULE_COMMENTTEXT||(LA29_0>=21 && LA29_0<=22)||(LA29_0>=26 && LA29_0<=27)||LA29_0==29||LA29_0==31||(LA29_0>=39 && LA29_0<=42)) ) {
                                    alt29=1;
                                }


                                switch (alt29) {
                            	case 1 :
                            	    // InternalRobot.g:1068:6: ( (lv_elsebody_13_0= ruleStatement ) ) (otherlv_14= '\\n' )?
                            	    {
                            	    // InternalRobot.g:1068:6: ( (lv_elsebody_13_0= ruleStatement ) )
                            	    // InternalRobot.g:1069:7: (lv_elsebody_13_0= ruleStatement )
                            	    {
                            	    // InternalRobot.g:1069:7: (lv_elsebody_13_0= ruleStatement )
                            	    // InternalRobot.g:1070:8: lv_elsebody_13_0= ruleStatement
                            	    {

                            	    								newCompositeNode(grammarAccess.getIfElseStatementAccess().getElsebodyStatementParserRuleCall_5_3_2_0_0());
                            	    							
                            	    pushFollow(FOLLOW_6);
                            	    lv_elsebody_13_0=ruleStatement();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getIfElseStatementRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"elsebody",
                            	    									lv_elsebody_13_0,
                            	    									"org.xtext.Robot.Statement");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }

                            	    // InternalRobot.g:1087:6: (otherlv_14= '\\n' )?
                            	    int alt28=2;
                            	    int LA28_0 = input.LA(1);

                            	    if ( (LA28_0==17) ) {
                            	        alt28=1;
                            	    }
                            	    switch (alt28) {
                            	        case 1 :
                            	            // InternalRobot.g:1088:7: otherlv_14= '\\n'
                            	            {
                            	            otherlv_14=(Token)match(input,17,FOLLOW_7); 

                            	            							newLeafNode(otherlv_14, grammarAccess.getIfElseStatementAccess().getLineFeedKeyword_5_3_2_1());
                            	            						

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

            otherlv_15=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getIfElseStatementAccess().getEndKeyword_6());
            		

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


    // $ANTLR start "entryRuleFull"
    // InternalRobot.g:1104:1: entryRuleFull returns [EObject current=null] : iv_ruleFull= ruleFull EOF ;
    public final EObject entryRuleFull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFull = null;


        try {
            // InternalRobot.g:1104:45: (iv_ruleFull= ruleFull EOF )
            // InternalRobot.g:1105:2: iv_ruleFull= ruleFull EOF
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
    // InternalRobot.g:1111:1: ruleFull returns [EObject current=null] : ( () otherlv_1= 'full' ) ;
    public final EObject ruleFull() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRobot.g:1117:2: ( ( () otherlv_1= 'full' ) )
            // InternalRobot.g:1118:2: ( () otherlv_1= 'full' )
            {
            // InternalRobot.g:1118:2: ( () otherlv_1= 'full' )
            // InternalRobot.g:1119:3: () otherlv_1= 'full'
            {
            // InternalRobot.g:1119:3: ()
            // InternalRobot.g:1120:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFullAccess().getFullAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_2); 

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
    // InternalRobot.g:1134:1: entryRuleMark returns [EObject current=null] : iv_ruleMark= ruleMark EOF ;
    public final EObject entryRuleMark() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMark = null;


        try {
            // InternalRobot.g:1134:45: (iv_ruleMark= ruleMark EOF )
            // InternalRobot.g:1135:2: iv_ruleMark= ruleMark EOF
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
    // InternalRobot.g:1141:1: ruleMark returns [EObject current=null] : ( () otherlv_1= 'mark' ) ;
    public final EObject ruleMark() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRobot.g:1147:2: ( ( () otherlv_1= 'mark' ) )
            // InternalRobot.g:1148:2: ( () otherlv_1= 'mark' )
            {
            // InternalRobot.g:1148:2: ( () otherlv_1= 'mark' )
            // InternalRobot.g:1149:3: () otherlv_1= 'mark'
            {
            // InternalRobot.g:1149:3: ()
            // InternalRobot.g:1150:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMarkAccess().getMarkAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_2); 

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
    // InternalRobot.g:1164:1: entryRuleAhead returns [EObject current=null] : iv_ruleAhead= ruleAhead EOF ;
    public final EObject entryRuleAhead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAhead = null;


        try {
            // InternalRobot.g:1164:46: (iv_ruleAhead= ruleAhead EOF )
            // InternalRobot.g:1165:2: iv_ruleAhead= ruleAhead EOF
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
    // InternalRobot.g:1171:1: ruleAhead returns [EObject current=null] : ( () otherlv_1= 'wall' otherlv_2= 'ahead' ) ;
    public final EObject ruleAhead() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRobot.g:1177:2: ( ( () otherlv_1= 'wall' otherlv_2= 'ahead' ) )
            // InternalRobot.g:1178:2: ( () otherlv_1= 'wall' otherlv_2= 'ahead' )
            {
            // InternalRobot.g:1178:2: ( () otherlv_1= 'wall' otherlv_2= 'ahead' )
            // InternalRobot.g:1179:3: () otherlv_1= 'wall' otherlv_2= 'ahead'
            {
            // InternalRobot.g:1179:3: ()
            // InternalRobot.g:1180:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAheadAccess().getAheadAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getAheadAccess().getWallKeyword_1());
            		
            otherlv_2=(Token)match(input,36,FOLLOW_2); 

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
    // InternalRobot.g:1198:1: entryRuleHeading returns [EObject current=null] : iv_ruleHeading= ruleHeading EOF ;
    public final EObject entryRuleHeading() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeading = null;


        try {
            // InternalRobot.g:1198:48: (iv_ruleHeading= ruleHeading EOF )
            // InternalRobot.g:1199:2: iv_ruleHeading= ruleHeading EOF
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
    // InternalRobot.g:1205:1: ruleHeading returns [EObject current=null] : (otherlv_0= 'heading' ( (lv_wind_1_0= ruleOrientation ) ) ) ;
    public final EObject ruleHeading() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_wind_1_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:1211:2: ( (otherlv_0= 'heading' ( (lv_wind_1_0= ruleOrientation ) ) ) )
            // InternalRobot.g:1212:2: (otherlv_0= 'heading' ( (lv_wind_1_0= ruleOrientation ) ) )
            {
            // InternalRobot.g:1212:2: (otherlv_0= 'heading' ( (lv_wind_1_0= ruleOrientation ) ) )
            // InternalRobot.g:1213:3: otherlv_0= 'heading' ( (lv_wind_1_0= ruleOrientation ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getHeadingAccess().getHeadingKeyword_0());
            		
            // InternalRobot.g:1217:3: ( (lv_wind_1_0= ruleOrientation ) )
            // InternalRobot.g:1218:4: (lv_wind_1_0= ruleOrientation )
            {
            // InternalRobot.g:1218:4: (lv_wind_1_0= ruleOrientation )
            // InternalRobot.g:1219:5: lv_wind_1_0= ruleOrientation
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
    // InternalRobot.g:1240:1: entryRuleNot returns [EObject current=null] : iv_ruleNot= ruleNot EOF ;
    public final EObject entryRuleNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot = null;


        try {
            // InternalRobot.g:1240:44: (iv_ruleNot= ruleNot EOF )
            // InternalRobot.g:1241:2: iv_ruleNot= ruleNot EOF
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
    // InternalRobot.g:1247:1: ruleNot returns [EObject current=null] : (otherlv_0= 'not' ( (lv_e_1_0= ruleAtomic ) ) ) ;
    public final EObject ruleNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_e_1_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:1253:2: ( (otherlv_0= 'not' ( (lv_e_1_0= ruleAtomic ) ) ) )
            // InternalRobot.g:1254:2: (otherlv_0= 'not' ( (lv_e_1_0= ruleAtomic ) ) )
            {
            // InternalRobot.g:1254:2: (otherlv_0= 'not' ( (lv_e_1_0= ruleAtomic ) ) )
            // InternalRobot.g:1255:3: otherlv_0= 'not' ( (lv_e_1_0= ruleAtomic ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getNotAccess().getNotKeyword_0());
            		
            // InternalRobot.g:1259:3: ( (lv_e_1_0= ruleAtomic ) )
            // InternalRobot.g:1260:4: (lv_e_1_0= ruleAtomic )
            {
            // InternalRobot.g:1260:4: (lv_e_1_0= ruleAtomic )
            // InternalRobot.g:1261:5: lv_e_1_0= ruleAtomic
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
    // InternalRobot.g:1282:1: ruleSingletonTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'step' ) | (enumLiteral_1= 'turnLeft' ) | (enumLiteral_2= 'drop' ) | (enumLiteral_3= 'pick' ) ) ;
    public final Enumerator ruleSingletonTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalRobot.g:1288:2: ( ( (enumLiteral_0= 'step' ) | (enumLiteral_1= 'turnLeft' ) | (enumLiteral_2= 'drop' ) | (enumLiteral_3= 'pick' ) ) )
            // InternalRobot.g:1289:2: ( (enumLiteral_0= 'step' ) | (enumLiteral_1= 'turnLeft' ) | (enumLiteral_2= 'drop' ) | (enumLiteral_3= 'pick' ) )
            {
            // InternalRobot.g:1289:2: ( (enumLiteral_0= 'step' ) | (enumLiteral_1= 'turnLeft' ) | (enumLiteral_2= 'drop' ) | (enumLiteral_3= 'pick' ) )
            int alt32=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt32=1;
                }
                break;
            case 40:
                {
                alt32=2;
                }
                break;
            case 41:
                {
                alt32=3;
                }
                break;
            case 42:
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
                    // InternalRobot.g:1290:3: (enumLiteral_0= 'step' )
                    {
                    // InternalRobot.g:1290:3: (enumLiteral_0= 'step' )
                    // InternalRobot.g:1291:4: enumLiteral_0= 'step'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getSingletonTypesAccess().getStepEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSingletonTypesAccess().getStepEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRobot.g:1298:3: (enumLiteral_1= 'turnLeft' )
                    {
                    // InternalRobot.g:1298:3: (enumLiteral_1= 'turnLeft' )
                    // InternalRobot.g:1299:4: enumLiteral_1= 'turnLeft'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getSingletonTypesAccess().getTurnLeftEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSingletonTypesAccess().getTurnLeftEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRobot.g:1306:3: (enumLiteral_2= 'drop' )
                    {
                    // InternalRobot.g:1306:3: (enumLiteral_2= 'drop' )
                    // InternalRobot.g:1307:4: enumLiteral_2= 'drop'
                    {
                    enumLiteral_2=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getSingletonTypesAccess().getDropEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSingletonTypesAccess().getDropEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRobot.g:1314:3: (enumLiteral_3= 'pick' )
                    {
                    // InternalRobot.g:1314:3: (enumLiteral_3= 'pick' )
                    // InternalRobot.g:1315:4: enumLiteral_3= 'pick'
                    {
                    enumLiteral_3=(Token)match(input,42,FOLLOW_2); 

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
    // InternalRobot.g:1325:1: ruleOrientation returns [Enumerator current=null] : ( (enumLiteral_0= 'south' ) | (enumLiteral_1= 'north' ) | (enumLiteral_2= 'east' ) | (enumLiteral_3= 'west' ) ) ;
    public final Enumerator ruleOrientation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalRobot.g:1331:2: ( ( (enumLiteral_0= 'south' ) | (enumLiteral_1= 'north' ) | (enumLiteral_2= 'east' ) | (enumLiteral_3= 'west' ) ) )
            // InternalRobot.g:1332:2: ( (enumLiteral_0= 'south' ) | (enumLiteral_1= 'north' ) | (enumLiteral_2= 'east' ) | (enumLiteral_3= 'west' ) )
            {
            // InternalRobot.g:1332:2: ( (enumLiteral_0= 'south' ) | (enumLiteral_1= 'north' ) | (enumLiteral_2= 'east' ) | (enumLiteral_3= 'west' ) )
            int alt33=4;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt33=1;
                }
                break;
            case 44:
                {
                alt33=2;
                }
                break;
            case 45:
                {
                alt33=3;
                }
                break;
            case 46:
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
                    // InternalRobot.g:1333:3: (enumLiteral_0= 'south' )
                    {
                    // InternalRobot.g:1333:3: (enumLiteral_0= 'south' )
                    // InternalRobot.g:1334:4: enumLiteral_0= 'south'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getOrientationAccess().getSouthEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOrientationAccess().getSouthEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRobot.g:1341:3: (enumLiteral_1= 'north' )
                    {
                    // InternalRobot.g:1341:3: (enumLiteral_1= 'north' )
                    // InternalRobot.g:1342:4: enumLiteral_1= 'north'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getOrientationAccess().getNorthEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOrientationAccess().getNorthEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRobot.g:1349:3: (enumLiteral_2= 'east' )
                    {
                    // InternalRobot.g:1349:3: (enumLiteral_2= 'east' )
                    // InternalRobot.g:1350:4: enumLiteral_2= 'east'
                    {
                    enumLiteral_2=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getOrientationAccess().getEastEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOrientationAccess().getEastEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRobot.g:1357:3: (enumLiteral_3= 'west' )
                    {
                    // InternalRobot.g:1357:3: (enumLiteral_3= 'west' )
                    // InternalRobot.g:1358:4: enumLiteral_3= 'west'
                    {
                    enumLiteral_3=(Token)match(input,46,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000780AC660080L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000780AC640080L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000006E00000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000781AC660080L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000781AC640080L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000780000000000L});

}