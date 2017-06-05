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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Robot'", "'{'", "'statements'", "','", "'}'", "'Comment'", "'comment'", "'Singleton'", "'type'", "'Trace'", "'text'", "'BuildWall'", "'row'", "'col'", "'DropMark'", "'WhileStatement'", "'cond'", "'body'", "'RepeatStatement'", "'times'", "'IfElseStatement'", "'ifbody'", "'elsebody'", "'IfStatement'", "'String'", "'-'", "'Full'", "'Mark'", "'Ahead'", "'Heading'", "'wind'", "'And'", "'a'", "'b'", "'Not'", "'e'", "'step'", "'turnLeft'", "'drop'", "'pick'", "'south'", "'north'", "'east'", "'west'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
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
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
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
    // InternalRobot.g:72:1: ruleRobot returns [EObject current=null] : ( () otherlv_1= 'Robot' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'statements' otherlv_5= '{' ( (lv_statements_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_statements_8_0= ruleStatement ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
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
            // InternalRobot.g:78:2: ( ( () otherlv_1= 'Robot' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'statements' otherlv_5= '{' ( (lv_statements_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_statements_8_0= ruleStatement ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalRobot.g:79:2: ( () otherlv_1= 'Robot' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'statements' otherlv_5= '{' ( (lv_statements_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_statements_8_0= ruleStatement ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalRobot.g:79:2: ( () otherlv_1= 'Robot' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'statements' otherlv_5= '{' ( (lv_statements_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_statements_8_0= ruleStatement ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalRobot.g:80:3: () otherlv_1= 'Robot' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'statements' otherlv_5= '{' ( (lv_statements_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_statements_8_0= ruleStatement ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalRobot.g:80:3: ()
            // InternalRobot.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRobotAccess().getRobotAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRobotAccess().getRobotKeyword_1());
            		
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

            			newLeafNode(otherlv_3, grammarAccess.getRobotAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRobot.g:114:3: (otherlv_4= 'statements' otherlv_5= '{' ( (lv_statements_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_statements_8_0= ruleStatement ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRobot.g:115:4: otherlv_4= 'statements' otherlv_5= '{' ( (lv_statements_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_statements_8_0= ruleStatement ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getRobotAccess().getStatementsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getRobotAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalRobot.g:123:4: ( (lv_statements_6_0= ruleStatement ) )
                    // InternalRobot.g:124:5: (lv_statements_6_0= ruleStatement )
                    {
                    // InternalRobot.g:124:5: (lv_statements_6_0= ruleStatement )
                    // InternalRobot.g:125:6: lv_statements_6_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getRobotAccess().getStatementsStatementParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
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

                    // InternalRobot.g:142:4: (otherlv_7= ',' ( (lv_statements_8_0= ruleStatement ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalRobot.g:143:5: otherlv_7= ',' ( (lv_statements_8_0= ruleStatement ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getRobotAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRobot.g:147:5: ( (lv_statements_8_0= ruleStatement ) )
                    	    // InternalRobot.g:148:6: (lv_statements_8_0= ruleStatement )
                    	    {
                    	    // InternalRobot.g:148:6: (lv_statements_8_0= ruleStatement )
                    	    // InternalRobot.g:149:7: lv_statements_8_0= ruleStatement
                    	    {

                    	    							newCompositeNode(grammarAccess.getRobotAccess().getStatementsStatementParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalRobot.g:180:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalRobot.g:180:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalRobot.g:181:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalRobot.g:187:1: ruleStatement returns [EObject current=null] : (this_Comment_0= ruleComment | this_Singleton_1= ruleSingleton | this_Trace_2= ruleTrace | this_BuildWall_3= ruleBuildWall | this_DropMark_4= ruleDropMark | this_WhileStatement_5= ruleWhileStatement | this_RepeatStatement_6= ruleRepeatStatement | this_IfElseStatement_7= ruleIfElseStatement | this_IfStatement_8= ruleIfStatement ) ;
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

        EObject this_IfStatement_8 = null;



        	enterRule();

        try {
            // InternalRobot.g:193:2: ( (this_Comment_0= ruleComment | this_Singleton_1= ruleSingleton | this_Trace_2= ruleTrace | this_BuildWall_3= ruleBuildWall | this_DropMark_4= ruleDropMark | this_WhileStatement_5= ruleWhileStatement | this_RepeatStatement_6= ruleRepeatStatement | this_IfElseStatement_7= ruleIfElseStatement | this_IfStatement_8= ruleIfStatement ) )
            // InternalRobot.g:194:2: (this_Comment_0= ruleComment | this_Singleton_1= ruleSingleton | this_Trace_2= ruleTrace | this_BuildWall_3= ruleBuildWall | this_DropMark_4= ruleDropMark | this_WhileStatement_5= ruleWhileStatement | this_RepeatStatement_6= ruleRepeatStatement | this_IfElseStatement_7= ruleIfElseStatement | this_IfStatement_8= ruleIfStatement )
            {
            // InternalRobot.g:194:2: (this_Comment_0= ruleComment | this_Singleton_1= ruleSingleton | this_Trace_2= ruleTrace | this_BuildWall_3= ruleBuildWall | this_DropMark_4= ruleDropMark | this_WhileStatement_5= ruleWhileStatement | this_RepeatStatement_6= ruleRepeatStatement | this_IfElseStatement_7= ruleIfElseStatement | this_IfStatement_8= ruleIfStatement )
            int alt3=9;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 18:
                {
                alt3=2;
                }
                break;
            case 20:
                {
                alt3=3;
                }
                break;
            case 22:
                {
                alt3=4;
                }
                break;
            case 25:
                {
                alt3=5;
                }
                break;
            case 26:
                {
                alt3=6;
                }
                break;
            case 29:
                {
                alt3=7;
                }
                break;
            case 31:
                {
                alt3=8;
                }
                break;
            case 34:
                {
                alt3=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalRobot.g:195:3: this_Comment_0= ruleComment
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
                    // InternalRobot.g:204:3: this_Singleton_1= ruleSingleton
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
                    // InternalRobot.g:213:3: this_Trace_2= ruleTrace
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
                    // InternalRobot.g:222:3: this_BuildWall_3= ruleBuildWall
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
                    // InternalRobot.g:231:3: this_DropMark_4= ruleDropMark
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
                    // InternalRobot.g:240:3: this_WhileStatement_5= ruleWhileStatement
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
                    // InternalRobot.g:249:3: this_RepeatStatement_6= ruleRepeatStatement
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
                    // InternalRobot.g:258:3: this_IfElseStatement_7= ruleIfElseStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getIfElseStatementParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_IfElseStatement_7=ruleIfElseStatement();

                    state._fsp--;


                    			current = this_IfElseStatement_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalRobot.g:267:3: this_IfStatement_8= ruleIfStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_IfStatement_8=ruleIfStatement();

                    state._fsp--;


                    			current = this_IfStatement_8;
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


    // $ANTLR start "entryRuleExpression"
    // InternalRobot.g:279:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalRobot.g:279:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalRobot.g:280:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalRobot.g:286:1: ruleExpression returns [EObject current=null] : (this_Full_0= ruleFull | this_Mark_1= ruleMark | this_Ahead_2= ruleAhead | this_Heading_3= ruleHeading | this_And_4= ruleAnd | this_Not_5= ruleNot ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Full_0 = null;

        EObject this_Mark_1 = null;

        EObject this_Ahead_2 = null;

        EObject this_Heading_3 = null;

        EObject this_And_4 = null;

        EObject this_Not_5 = null;



        	enterRule();

        try {
            // InternalRobot.g:292:2: ( (this_Full_0= ruleFull | this_Mark_1= ruleMark | this_Ahead_2= ruleAhead | this_Heading_3= ruleHeading | this_And_4= ruleAnd | this_Not_5= ruleNot ) )
            // InternalRobot.g:293:2: (this_Full_0= ruleFull | this_Mark_1= ruleMark | this_Ahead_2= ruleAhead | this_Heading_3= ruleHeading | this_And_4= ruleAnd | this_Not_5= ruleNot )
            {
            // InternalRobot.g:293:2: (this_Full_0= ruleFull | this_Mark_1= ruleMark | this_Ahead_2= ruleAhead | this_Heading_3= ruleHeading | this_And_4= ruleAnd | this_Not_5= ruleNot )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt4=1;
                }
                break;
            case 38:
                {
                alt4=2;
                }
                break;
            case 39:
                {
                alt4=3;
                }
                break;
            case 40:
                {
                alt4=4;
                }
                break;
            case 42:
                {
                alt4=5;
                }
                break;
            case 45:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalRobot.g:294:3: this_Full_0= ruleFull
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getFullParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Full_0=ruleFull();

                    state._fsp--;


                    			current = this_Full_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRobot.g:303:3: this_Mark_1= ruleMark
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getMarkParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Mark_1=ruleMark();

                    state._fsp--;


                    			current = this_Mark_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRobot.g:312:3: this_Ahead_2= ruleAhead
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getAheadParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Ahead_2=ruleAhead();

                    state._fsp--;


                    			current = this_Ahead_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRobot.g:321:3: this_Heading_3= ruleHeading
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getHeadingParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Heading_3=ruleHeading();

                    state._fsp--;


                    			current = this_Heading_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRobot.g:330:3: this_And_4= ruleAnd
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getAndParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_And_4=ruleAnd();

                    state._fsp--;


                    			current = this_And_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalRobot.g:339:3: this_Not_5= ruleNot
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getNotParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Not_5=ruleNot();

                    state._fsp--;


                    			current = this_Not_5;
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleEString"
    // InternalRobot.g:351:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRobot.g:351:47: (iv_ruleEString= ruleEString EOF )
            // InternalRobot.g:352:2: iv_ruleEString= ruleEString EOF
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
    // InternalRobot.g:358:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRobot.g:364:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRobot.g:365:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRobot.g:365:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalRobot.g:366:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRobot.g:374:3: this_ID_1= RULE_ID
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
    // InternalRobot.g:385:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // InternalRobot.g:385:48: (iv_ruleComment= ruleComment EOF )
            // InternalRobot.g:386:2: iv_ruleComment= ruleComment EOF
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
    // InternalRobot.g:392:1: ruleComment returns [EObject current=null] : (otherlv_0= 'Comment' otherlv_1= '{' otherlv_2= 'comment' ( (lv_comment_3_0= ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_comment_3_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:398:2: ( (otherlv_0= 'Comment' otherlv_1= '{' otherlv_2= 'comment' ( (lv_comment_3_0= ruleEString ) ) otherlv_4= '}' ) )
            // InternalRobot.g:399:2: (otherlv_0= 'Comment' otherlv_1= '{' otherlv_2= 'comment' ( (lv_comment_3_0= ruleEString ) ) otherlv_4= '}' )
            {
            // InternalRobot.g:399:2: (otherlv_0= 'Comment' otherlv_1= '{' otherlv_2= 'comment' ( (lv_comment_3_0= ruleEString ) ) otherlv_4= '}' )
            // InternalRobot.g:400:3: otherlv_0= 'Comment' otherlv_1= '{' otherlv_2= 'comment' ( (lv_comment_3_0= ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCommentAccess().getCommentKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getCommentAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getCommentAccess().getCommentKeyword_2());
            		
            // InternalRobot.g:412:3: ( (lv_comment_3_0= ruleEString ) )
            // InternalRobot.g:413:4: (lv_comment_3_0= ruleEString )
            {
            // InternalRobot.g:413:4: (lv_comment_3_0= ruleEString )
            // InternalRobot.g:414:5: lv_comment_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCommentAccess().getCommentEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_comment_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCommentRule());
            					}
            					set(
            						current,
            						"comment",
            						lv_comment_3_0,
            						"org.xtext.Robot.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getCommentAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalRobot.g:439:1: entryRuleSingleton returns [EObject current=null] : iv_ruleSingleton= ruleSingleton EOF ;
    public final EObject entryRuleSingleton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleton = null;


        try {
            // InternalRobot.g:439:50: (iv_ruleSingleton= ruleSingleton EOF )
            // InternalRobot.g:440:2: iv_ruleSingleton= ruleSingleton EOF
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
    // InternalRobot.g:446:1: ruleSingleton returns [EObject current=null] : (otherlv_0= 'Singleton' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleSingletonTypes ) ) otherlv_4= '}' ) ;
    public final EObject ruleSingleton() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:452:2: ( (otherlv_0= 'Singleton' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleSingletonTypes ) ) otherlv_4= '}' ) )
            // InternalRobot.g:453:2: (otherlv_0= 'Singleton' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleSingletonTypes ) ) otherlv_4= '}' )
            {
            // InternalRobot.g:453:2: (otherlv_0= 'Singleton' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleSingletonTypes ) ) otherlv_4= '}' )
            // InternalRobot.g:454:3: otherlv_0= 'Singleton' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleSingletonTypes ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSingletonAccess().getSingletonKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getSingletonAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getSingletonAccess().getTypeKeyword_2());
            		
            // InternalRobot.g:466:3: ( (lv_type_3_0= ruleSingletonTypes ) )
            // InternalRobot.g:467:4: (lv_type_3_0= ruleSingletonTypes )
            {
            // InternalRobot.g:467:4: (lv_type_3_0= ruleSingletonTypes )
            // InternalRobot.g:468:5: lv_type_3_0= ruleSingletonTypes
            {

            					newCompositeNode(grammarAccess.getSingletonAccess().getTypeSingletonTypesEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_type_3_0=ruleSingletonTypes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSingletonRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.xtext.Robot.SingletonTypes");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSingletonAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalRobot.g:493:1: entryRuleTrace returns [EObject current=null] : iv_ruleTrace= ruleTrace EOF ;
    public final EObject entryRuleTrace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrace = null;


        try {
            // InternalRobot.g:493:46: (iv_ruleTrace= ruleTrace EOF )
            // InternalRobot.g:494:2: iv_ruleTrace= ruleTrace EOF
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
    // InternalRobot.g:500:1: ruleTrace returns [EObject current=null] : ( () otherlv_1= 'Trace' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleString0 ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleTrace() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_text_4_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:506:2: ( ( () otherlv_1= 'Trace' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleString0 ) ) )? otherlv_5= '}' ) )
            // InternalRobot.g:507:2: ( () otherlv_1= 'Trace' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleString0 ) ) )? otherlv_5= '}' )
            {
            // InternalRobot.g:507:2: ( () otherlv_1= 'Trace' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleString0 ) ) )? otherlv_5= '}' )
            // InternalRobot.g:508:3: () otherlv_1= 'Trace' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleString0 ) ) )? otherlv_5= '}'
            {
            // InternalRobot.g:508:3: ()
            // InternalRobot.g:509:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTraceAccess().getTraceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTraceAccess().getTraceKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getTraceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRobot.g:523:3: (otherlv_3= 'text' ( (lv_text_4_0= ruleString0 ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRobot.g:524:4: otherlv_3= 'text' ( (lv_text_4_0= ruleString0 ) )
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getTraceAccess().getTextKeyword_3_0());
                    			
                    // InternalRobot.g:528:4: ( (lv_text_4_0= ruleString0 ) )
                    // InternalRobot.g:529:5: (lv_text_4_0= ruleString0 )
                    {
                    // InternalRobot.g:529:5: (lv_text_4_0= ruleString0 )
                    // InternalRobot.g:530:6: lv_text_4_0= ruleString0
                    {

                    						newCompositeNode(grammarAccess.getTraceAccess().getTextString0ParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_text_4_0=ruleString0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTraceRule());
                    						}
                    						set(
                    							current,
                    							"text",
                    							lv_text_4_0,
                    							"org.xtext.Robot.String0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getTraceAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalRobot.g:556:1: entryRuleBuildWall returns [EObject current=null] : iv_ruleBuildWall= ruleBuildWall EOF ;
    public final EObject entryRuleBuildWall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuildWall = null;


        try {
            // InternalRobot.g:556:50: (iv_ruleBuildWall= ruleBuildWall EOF )
            // InternalRobot.g:557:2: iv_ruleBuildWall= ruleBuildWall EOF
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
    // InternalRobot.g:563:1: ruleBuildWall returns [EObject current=null] : (otherlv_0= 'BuildWall' otherlv_1= '{' otherlv_2= 'row' ( (lv_row_3_0= ruleEInt ) ) otherlv_4= 'col' ( (lv_col_5_0= ruleEInt ) ) otherlv_6= '}' ) ;
    public final EObject ruleBuildWall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_row_3_0 = null;

        AntlrDatatypeRuleToken lv_col_5_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:569:2: ( (otherlv_0= 'BuildWall' otherlv_1= '{' otherlv_2= 'row' ( (lv_row_3_0= ruleEInt ) ) otherlv_4= 'col' ( (lv_col_5_0= ruleEInt ) ) otherlv_6= '}' ) )
            // InternalRobot.g:570:2: (otherlv_0= 'BuildWall' otherlv_1= '{' otherlv_2= 'row' ( (lv_row_3_0= ruleEInt ) ) otherlv_4= 'col' ( (lv_col_5_0= ruleEInt ) ) otherlv_6= '}' )
            {
            // InternalRobot.g:570:2: (otherlv_0= 'BuildWall' otherlv_1= '{' otherlv_2= 'row' ( (lv_row_3_0= ruleEInt ) ) otherlv_4= 'col' ( (lv_col_5_0= ruleEInt ) ) otherlv_6= '}' )
            // InternalRobot.g:571:3: otherlv_0= 'BuildWall' otherlv_1= '{' otherlv_2= 'row' ( (lv_row_3_0= ruleEInt ) ) otherlv_4= 'col' ( (lv_col_5_0= ruleEInt ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBuildWallAccess().getBuildWallKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getBuildWallAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getBuildWallAccess().getRowKeyword_2());
            		
            // InternalRobot.g:583:3: ( (lv_row_3_0= ruleEInt ) )
            // InternalRobot.g:584:4: (lv_row_3_0= ruleEInt )
            {
            // InternalRobot.g:584:4: (lv_row_3_0= ruleEInt )
            // InternalRobot.g:585:5: lv_row_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getBuildWallAccess().getRowEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
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

            otherlv_4=(Token)match(input,24,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getBuildWallAccess().getColKeyword_4());
            		
            // InternalRobot.g:606:3: ( (lv_col_5_0= ruleEInt ) )
            // InternalRobot.g:607:4: (lv_col_5_0= ruleEInt )
            {
            // InternalRobot.g:607:4: (lv_col_5_0= ruleEInt )
            // InternalRobot.g:608:5: lv_col_5_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getBuildWallAccess().getColEIntParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
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

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getBuildWallAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalRobot.g:633:1: entryRuleDropMark returns [EObject current=null] : iv_ruleDropMark= ruleDropMark EOF ;
    public final EObject entryRuleDropMark() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropMark = null;


        try {
            // InternalRobot.g:633:49: (iv_ruleDropMark= ruleDropMark EOF )
            // InternalRobot.g:634:2: iv_ruleDropMark= ruleDropMark EOF
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
    // InternalRobot.g:640:1: ruleDropMark returns [EObject current=null] : (otherlv_0= 'DropMark' otherlv_1= '{' otherlv_2= 'row' ( (lv_row_3_0= ruleEInt ) ) otherlv_4= 'col' ( (lv_col_5_0= ruleEInt ) ) otherlv_6= '}' ) ;
    public final EObject ruleDropMark() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_row_3_0 = null;

        AntlrDatatypeRuleToken lv_col_5_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:646:2: ( (otherlv_0= 'DropMark' otherlv_1= '{' otherlv_2= 'row' ( (lv_row_3_0= ruleEInt ) ) otherlv_4= 'col' ( (lv_col_5_0= ruleEInt ) ) otherlv_6= '}' ) )
            // InternalRobot.g:647:2: (otherlv_0= 'DropMark' otherlv_1= '{' otherlv_2= 'row' ( (lv_row_3_0= ruleEInt ) ) otherlv_4= 'col' ( (lv_col_5_0= ruleEInt ) ) otherlv_6= '}' )
            {
            // InternalRobot.g:647:2: (otherlv_0= 'DropMark' otherlv_1= '{' otherlv_2= 'row' ( (lv_row_3_0= ruleEInt ) ) otherlv_4= 'col' ( (lv_col_5_0= ruleEInt ) ) otherlv_6= '}' )
            // InternalRobot.g:648:3: otherlv_0= 'DropMark' otherlv_1= '{' otherlv_2= 'row' ( (lv_row_3_0= ruleEInt ) ) otherlv_4= 'col' ( (lv_col_5_0= ruleEInt ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDropMarkAccess().getDropMarkKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getDropMarkAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getDropMarkAccess().getRowKeyword_2());
            		
            // InternalRobot.g:660:3: ( (lv_row_3_0= ruleEInt ) )
            // InternalRobot.g:661:4: (lv_row_3_0= ruleEInt )
            {
            // InternalRobot.g:661:4: (lv_row_3_0= ruleEInt )
            // InternalRobot.g:662:5: lv_row_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getDropMarkAccess().getRowEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
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

            otherlv_4=(Token)match(input,24,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getDropMarkAccess().getColKeyword_4());
            		
            // InternalRobot.g:683:3: ( (lv_col_5_0= ruleEInt ) )
            // InternalRobot.g:684:4: (lv_col_5_0= ruleEInt )
            {
            // InternalRobot.g:684:4: (lv_col_5_0= ruleEInt )
            // InternalRobot.g:685:5: lv_col_5_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getDropMarkAccess().getColEIntParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
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

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDropMarkAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalRobot.g:710:1: entryRuleWhileStatement returns [EObject current=null] : iv_ruleWhileStatement= ruleWhileStatement EOF ;
    public final EObject entryRuleWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileStatement = null;


        try {
            // InternalRobot.g:710:55: (iv_ruleWhileStatement= ruleWhileStatement EOF )
            // InternalRobot.g:711:2: iv_ruleWhileStatement= ruleWhileStatement EOF
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
    // InternalRobot.g:717:1: ruleWhileStatement returns [EObject current=null] : (otherlv_0= 'WhileStatement' otherlv_1= '{' otherlv_2= 'cond' ( (lv_cond_3_0= ruleExpression ) ) (otherlv_4= 'body' otherlv_5= '{' ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_body_8_0= ruleStatement ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleWhileStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_cond_3_0 = null;

        EObject lv_body_6_0 = null;

        EObject lv_body_8_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:723:2: ( (otherlv_0= 'WhileStatement' otherlv_1= '{' otherlv_2= 'cond' ( (lv_cond_3_0= ruleExpression ) ) (otherlv_4= 'body' otherlv_5= '{' ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_body_8_0= ruleStatement ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalRobot.g:724:2: (otherlv_0= 'WhileStatement' otherlv_1= '{' otherlv_2= 'cond' ( (lv_cond_3_0= ruleExpression ) ) (otherlv_4= 'body' otherlv_5= '{' ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_body_8_0= ruleStatement ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalRobot.g:724:2: (otherlv_0= 'WhileStatement' otherlv_1= '{' otherlv_2= 'cond' ( (lv_cond_3_0= ruleExpression ) ) (otherlv_4= 'body' otherlv_5= '{' ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_body_8_0= ruleStatement ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalRobot.g:725:3: otherlv_0= 'WhileStatement' otherlv_1= '{' otherlv_2= 'cond' ( (lv_cond_3_0= ruleExpression ) ) (otherlv_4= 'body' otherlv_5= '{' ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_body_8_0= ruleStatement ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getWhileStatementAccess().getWhileStatementKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getWhileStatementAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getWhileStatementAccess().getCondKeyword_2());
            		
            // InternalRobot.g:737:3: ( (lv_cond_3_0= ruleExpression ) )
            // InternalRobot.g:738:4: (lv_cond_3_0= ruleExpression )
            {
            // InternalRobot.g:738:4: (lv_cond_3_0= ruleExpression )
            // InternalRobot.g:739:5: lv_cond_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getWhileStatementAccess().getCondExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
            lv_cond_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileStatementRule());
            					}
            					set(
            						current,
            						"cond",
            						lv_cond_3_0,
            						"org.xtext.Robot.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRobot.g:756:3: (otherlv_4= 'body' otherlv_5= '{' ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_body_8_0= ruleStatement ) ) )* otherlv_9= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRobot.g:757:4: otherlv_4= 'body' otherlv_5= '{' ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_body_8_0= ruleStatement ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getWhileStatementAccess().getBodyKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getWhileStatementAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalRobot.g:765:4: ( (lv_body_6_0= ruleStatement ) )
                    // InternalRobot.g:766:5: (lv_body_6_0= ruleStatement )
                    {
                    // InternalRobot.g:766:5: (lv_body_6_0= ruleStatement )
                    // InternalRobot.g:767:6: lv_body_6_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getWhileStatementAccess().getBodyStatementParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
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

                    // InternalRobot.g:784:4: (otherlv_7= ',' ( (lv_body_8_0= ruleStatement ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalRobot.g:785:5: otherlv_7= ',' ( (lv_body_8_0= ruleStatement ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getWhileStatementAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRobot.g:789:5: ( (lv_body_8_0= ruleStatement ) )
                    	    // InternalRobot.g:790:6: (lv_body_8_0= ruleStatement )
                    	    {
                    	    // InternalRobot.g:790:6: (lv_body_8_0= ruleStatement )
                    	    // InternalRobot.g:791:7: lv_body_8_0= ruleStatement
                    	    {

                    	    							newCompositeNode(grammarAccess.getWhileStatementAccess().getBodyStatementParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_body_8_0=ruleStatement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getWhileStatementRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"body",
                    	    								lv_body_8_0,
                    	    								"org.xtext.Robot.Statement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getWhileStatementAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getWhileStatementAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalRobot.g:822:1: entryRuleRepeatStatement returns [EObject current=null] : iv_ruleRepeatStatement= ruleRepeatStatement EOF ;
    public final EObject entryRuleRepeatStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepeatStatement = null;


        try {
            // InternalRobot.g:822:56: (iv_ruleRepeatStatement= ruleRepeatStatement EOF )
            // InternalRobot.g:823:2: iv_ruleRepeatStatement= ruleRepeatStatement EOF
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
    // InternalRobot.g:829:1: ruleRepeatStatement returns [EObject current=null] : (otherlv_0= 'RepeatStatement' otherlv_1= '{' otherlv_2= 'times' ( (lv_times_3_0= ruleEInt ) ) (otherlv_4= 'body' otherlv_5= '{' ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_body_8_0= ruleStatement ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleRepeatStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_times_3_0 = null;

        EObject lv_body_6_0 = null;

        EObject lv_body_8_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:835:2: ( (otherlv_0= 'RepeatStatement' otherlv_1= '{' otherlv_2= 'times' ( (lv_times_3_0= ruleEInt ) ) (otherlv_4= 'body' otherlv_5= '{' ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_body_8_0= ruleStatement ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalRobot.g:836:2: (otherlv_0= 'RepeatStatement' otherlv_1= '{' otherlv_2= 'times' ( (lv_times_3_0= ruleEInt ) ) (otherlv_4= 'body' otherlv_5= '{' ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_body_8_0= ruleStatement ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalRobot.g:836:2: (otherlv_0= 'RepeatStatement' otherlv_1= '{' otherlv_2= 'times' ( (lv_times_3_0= ruleEInt ) ) (otherlv_4= 'body' otherlv_5= '{' ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_body_8_0= ruleStatement ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalRobot.g:837:3: otherlv_0= 'RepeatStatement' otherlv_1= '{' otherlv_2= 'times' ( (lv_times_3_0= ruleEInt ) ) (otherlv_4= 'body' otherlv_5= '{' ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_body_8_0= ruleStatement ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRepeatStatementAccess().getRepeatStatementKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getRepeatStatementAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getRepeatStatementAccess().getTimesKeyword_2());
            		
            // InternalRobot.g:849:3: ( (lv_times_3_0= ruleEInt ) )
            // InternalRobot.g:850:4: (lv_times_3_0= ruleEInt )
            {
            // InternalRobot.g:850:4: (lv_times_3_0= ruleEInt )
            // InternalRobot.g:851:5: lv_times_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getRepeatStatementAccess().getTimesEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
            lv_times_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRepeatStatementRule());
            					}
            					set(
            						current,
            						"times",
            						lv_times_3_0,
            						"org.xtext.Robot.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRobot.g:868:3: (otherlv_4= 'body' otherlv_5= '{' ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_body_8_0= ruleStatement ) ) )* otherlv_9= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRobot.g:869:4: otherlv_4= 'body' otherlv_5= '{' ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_body_8_0= ruleStatement ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getRepeatStatementAccess().getBodyKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getRepeatStatementAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalRobot.g:877:4: ( (lv_body_6_0= ruleStatement ) )
                    // InternalRobot.g:878:5: (lv_body_6_0= ruleStatement )
                    {
                    // InternalRobot.g:878:5: (lv_body_6_0= ruleStatement )
                    // InternalRobot.g:879:6: lv_body_6_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getRepeatStatementAccess().getBodyStatementParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
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

                    // InternalRobot.g:896:4: (otherlv_7= ',' ( (lv_body_8_0= ruleStatement ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==14) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalRobot.g:897:5: otherlv_7= ',' ( (lv_body_8_0= ruleStatement ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getRepeatStatementAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRobot.g:901:5: ( (lv_body_8_0= ruleStatement ) )
                    	    // InternalRobot.g:902:6: (lv_body_8_0= ruleStatement )
                    	    {
                    	    // InternalRobot.g:902:6: (lv_body_8_0= ruleStatement )
                    	    // InternalRobot.g:903:7: lv_body_8_0= ruleStatement
                    	    {

                    	    							newCompositeNode(grammarAccess.getRepeatStatementAccess().getBodyStatementParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_body_8_0=ruleStatement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRepeatStatementRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"body",
                    	    								lv_body_8_0,
                    	    								"org.xtext.Robot.Statement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getRepeatStatementAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getRepeatStatementAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalRobot.g:934:1: entryRuleIfElseStatement returns [EObject current=null] : iv_ruleIfElseStatement= ruleIfElseStatement EOF ;
    public final EObject entryRuleIfElseStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfElseStatement = null;


        try {
            // InternalRobot.g:934:56: (iv_ruleIfElseStatement= ruleIfElseStatement EOF )
            // InternalRobot.g:935:2: iv_ruleIfElseStatement= ruleIfElseStatement EOF
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
    // InternalRobot.g:941:1: ruleIfElseStatement returns [EObject current=null] : (otherlv_0= 'IfElseStatement' otherlv_1= '{' otherlv_2= 'cond' ( (lv_cond_3_0= ruleExpression ) ) (otherlv_4= 'ifbody' otherlv_5= '{' ( (lv_ifbody_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_ifbody_8_0= ruleStatement ) ) )* otherlv_9= '}' )? (otherlv_10= 'elsebody' otherlv_11= '{' ( (lv_elsebody_12_0= ruleStatement ) ) (otherlv_13= ',' ( (lv_elsebody_14_0= ruleStatement ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleIfElseStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        EObject lv_cond_3_0 = null;

        EObject lv_ifbody_6_0 = null;

        EObject lv_ifbody_8_0 = null;

        EObject lv_elsebody_12_0 = null;

        EObject lv_elsebody_14_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:947:2: ( (otherlv_0= 'IfElseStatement' otherlv_1= '{' otherlv_2= 'cond' ( (lv_cond_3_0= ruleExpression ) ) (otherlv_4= 'ifbody' otherlv_5= '{' ( (lv_ifbody_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_ifbody_8_0= ruleStatement ) ) )* otherlv_9= '}' )? (otherlv_10= 'elsebody' otherlv_11= '{' ( (lv_elsebody_12_0= ruleStatement ) ) (otherlv_13= ',' ( (lv_elsebody_14_0= ruleStatement ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalRobot.g:948:2: (otherlv_0= 'IfElseStatement' otherlv_1= '{' otherlv_2= 'cond' ( (lv_cond_3_0= ruleExpression ) ) (otherlv_4= 'ifbody' otherlv_5= '{' ( (lv_ifbody_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_ifbody_8_0= ruleStatement ) ) )* otherlv_9= '}' )? (otherlv_10= 'elsebody' otherlv_11= '{' ( (lv_elsebody_12_0= ruleStatement ) ) (otherlv_13= ',' ( (lv_elsebody_14_0= ruleStatement ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalRobot.g:948:2: (otherlv_0= 'IfElseStatement' otherlv_1= '{' otherlv_2= 'cond' ( (lv_cond_3_0= ruleExpression ) ) (otherlv_4= 'ifbody' otherlv_5= '{' ( (lv_ifbody_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_ifbody_8_0= ruleStatement ) ) )* otherlv_9= '}' )? (otherlv_10= 'elsebody' otherlv_11= '{' ( (lv_elsebody_12_0= ruleStatement ) ) (otherlv_13= ',' ( (lv_elsebody_14_0= ruleStatement ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalRobot.g:949:3: otherlv_0= 'IfElseStatement' otherlv_1= '{' otherlv_2= 'cond' ( (lv_cond_3_0= ruleExpression ) ) (otherlv_4= 'ifbody' otherlv_5= '{' ( (lv_ifbody_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_ifbody_8_0= ruleStatement ) ) )* otherlv_9= '}' )? (otherlv_10= 'elsebody' otherlv_11= '{' ( (lv_elsebody_12_0= ruleStatement ) ) (otherlv_13= ',' ( (lv_elsebody_14_0= ruleStatement ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getIfElseStatementAccess().getIfElseStatementKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getIfElseStatementAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getIfElseStatementAccess().getCondKeyword_2());
            		
            // InternalRobot.g:961:3: ( (lv_cond_3_0= ruleExpression ) )
            // InternalRobot.g:962:4: (lv_cond_3_0= ruleExpression )
            {
            // InternalRobot.g:962:4: (lv_cond_3_0= ruleExpression )
            // InternalRobot.g:963:5: lv_cond_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getIfElseStatementAccess().getCondExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_21);
            lv_cond_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfElseStatementRule());
            					}
            					set(
            						current,
            						"cond",
            						lv_cond_3_0,
            						"org.xtext.Robot.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRobot.g:980:3: (otherlv_4= 'ifbody' otherlv_5= '{' ( (lv_ifbody_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_ifbody_8_0= ruleStatement ) ) )* otherlv_9= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==32) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRobot.g:981:4: otherlv_4= 'ifbody' otherlv_5= '{' ( (lv_ifbody_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_ifbody_8_0= ruleStatement ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getIfElseStatementAccess().getIfbodyKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getIfElseStatementAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalRobot.g:989:4: ( (lv_ifbody_6_0= ruleStatement ) )
                    // InternalRobot.g:990:5: (lv_ifbody_6_0= ruleStatement )
                    {
                    // InternalRobot.g:990:5: (lv_ifbody_6_0= ruleStatement )
                    // InternalRobot.g:991:6: lv_ifbody_6_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getIfElseStatementAccess().getIfbodyStatementParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
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

                    // InternalRobot.g:1008:4: (otherlv_7= ',' ( (lv_ifbody_8_0= ruleStatement ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==14) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalRobot.g:1009:5: otherlv_7= ',' ( (lv_ifbody_8_0= ruleStatement ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getIfElseStatementAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRobot.g:1013:5: ( (lv_ifbody_8_0= ruleStatement ) )
                    	    // InternalRobot.g:1014:6: (lv_ifbody_8_0= ruleStatement )
                    	    {
                    	    // InternalRobot.g:1014:6: (lv_ifbody_8_0= ruleStatement )
                    	    // InternalRobot.g:1015:7: lv_ifbody_8_0= ruleStatement
                    	    {

                    	    							newCompositeNode(grammarAccess.getIfElseStatementAccess().getIfbodyStatementParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_ifbody_8_0=ruleStatement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getIfElseStatementRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ifbody",
                    	    								lv_ifbody_8_0,
                    	    								"org.xtext.Robot.Statement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_22); 

                    				newLeafNode(otherlv_9, grammarAccess.getIfElseStatementAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalRobot.g:1038:3: (otherlv_10= 'elsebody' otherlv_11= '{' ( (lv_elsebody_12_0= ruleStatement ) ) (otherlv_13= ',' ( (lv_elsebody_14_0= ruleStatement ) ) )* otherlv_15= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRobot.g:1039:4: otherlv_10= 'elsebody' otherlv_11= '{' ( (lv_elsebody_12_0= ruleStatement ) ) (otherlv_13= ',' ( (lv_elsebody_14_0= ruleStatement ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,33,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getIfElseStatementAccess().getElsebodyKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_11, grammarAccess.getIfElseStatementAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalRobot.g:1047:4: ( (lv_elsebody_12_0= ruleStatement ) )
                    // InternalRobot.g:1048:5: (lv_elsebody_12_0= ruleStatement )
                    {
                    // InternalRobot.g:1048:5: (lv_elsebody_12_0= ruleStatement )
                    // InternalRobot.g:1049:6: lv_elsebody_12_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getIfElseStatementAccess().getElsebodyStatementParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
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

                    // InternalRobot.g:1066:4: (otherlv_13= ',' ( (lv_elsebody_14_0= ruleStatement ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==14) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalRobot.g:1067:5: otherlv_13= ',' ( (lv_elsebody_14_0= ruleStatement ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getIfElseStatementAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRobot.g:1071:5: ( (lv_elsebody_14_0= ruleStatement ) )
                    	    // InternalRobot.g:1072:6: (lv_elsebody_14_0= ruleStatement )
                    	    {
                    	    // InternalRobot.g:1072:6: (lv_elsebody_14_0= ruleStatement )
                    	    // InternalRobot.g:1073:7: lv_elsebody_14_0= ruleStatement
                    	    {

                    	    							newCompositeNode(grammarAccess.getIfElseStatementAccess().getElsebodyStatementParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_elsebody_14_0=ruleStatement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getIfElseStatementRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elsebody",
                    	    								lv_elsebody_14_0,
                    	    								"org.xtext.Robot.Statement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_15, grammarAccess.getIfElseStatementAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getIfElseStatementAccess().getRightCurlyBracketKeyword_6());
            		

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


    // $ANTLR start "entryRuleIfStatement"
    // InternalRobot.g:1104:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // InternalRobot.g:1104:52: (iv_ruleIfStatement= ruleIfStatement EOF )
            // InternalRobot.g:1105:2: iv_ruleIfStatement= ruleIfStatement EOF
            {
             newCompositeNode(grammarAccess.getIfStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfStatement=ruleIfStatement();

            state._fsp--;

             current =iv_ruleIfStatement; 
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
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // InternalRobot.g:1111:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= 'IfStatement' otherlv_1= '{' otherlv_2= 'cond' ( (lv_cond_3_0= ruleExpression ) ) (otherlv_4= 'body' otherlv_5= '{' ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_body_8_0= ruleStatement ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleIfStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_cond_3_0 = null;

        EObject lv_body_6_0 = null;

        EObject lv_body_8_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:1117:2: ( (otherlv_0= 'IfStatement' otherlv_1= '{' otherlv_2= 'cond' ( (lv_cond_3_0= ruleExpression ) ) (otherlv_4= 'body' otherlv_5= '{' ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_body_8_0= ruleStatement ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalRobot.g:1118:2: (otherlv_0= 'IfStatement' otherlv_1= '{' otherlv_2= 'cond' ( (lv_cond_3_0= ruleExpression ) ) (otherlv_4= 'body' otherlv_5= '{' ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_body_8_0= ruleStatement ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalRobot.g:1118:2: (otherlv_0= 'IfStatement' otherlv_1= '{' otherlv_2= 'cond' ( (lv_cond_3_0= ruleExpression ) ) (otherlv_4= 'body' otherlv_5= '{' ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_body_8_0= ruleStatement ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalRobot.g:1119:3: otherlv_0= 'IfStatement' otherlv_1= '{' otherlv_2= 'cond' ( (lv_cond_3_0= ruleExpression ) ) (otherlv_4= 'body' otherlv_5= '{' ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_body_8_0= ruleStatement ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getIfStatementKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getIfStatementAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getIfStatementAccess().getCondKeyword_2());
            		
            // InternalRobot.g:1131:3: ( (lv_cond_3_0= ruleExpression ) )
            // InternalRobot.g:1132:4: (lv_cond_3_0= ruleExpression )
            {
            // InternalRobot.g:1132:4: (lv_cond_3_0= ruleExpression )
            // InternalRobot.g:1133:5: lv_cond_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getIfStatementAccess().getCondExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
            lv_cond_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfStatementRule());
            					}
            					set(
            						current,
            						"cond",
            						lv_cond_3_0,
            						"org.xtext.Robot.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRobot.g:1150:3: (otherlv_4= 'body' otherlv_5= '{' ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_body_8_0= ruleStatement ) ) )* otherlv_9= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRobot.g:1151:4: otherlv_4= 'body' otherlv_5= '{' ( (lv_body_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_body_8_0= ruleStatement ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getIfStatementAccess().getBodyKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getIfStatementAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalRobot.g:1159:4: ( (lv_body_6_0= ruleStatement ) )
                    // InternalRobot.g:1160:5: (lv_body_6_0= ruleStatement )
                    {
                    // InternalRobot.g:1160:5: (lv_body_6_0= ruleStatement )
                    // InternalRobot.g:1161:6: lv_body_6_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getIfStatementAccess().getBodyStatementParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_body_6_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIfStatementRule());
                    						}
                    						add(
                    							current,
                    							"body",
                    							lv_body_6_0,
                    							"org.xtext.Robot.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRobot.g:1178:4: (otherlv_7= ',' ( (lv_body_8_0= ruleStatement ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==14) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalRobot.g:1179:5: otherlv_7= ',' ( (lv_body_8_0= ruleStatement ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getIfStatementAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRobot.g:1183:5: ( (lv_body_8_0= ruleStatement ) )
                    	    // InternalRobot.g:1184:6: (lv_body_8_0= ruleStatement )
                    	    {
                    	    // InternalRobot.g:1184:6: (lv_body_8_0= ruleStatement )
                    	    // InternalRobot.g:1185:7: lv_body_8_0= ruleStatement
                    	    {

                    	    							newCompositeNode(grammarAccess.getIfStatementAccess().getBodyStatementParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_body_8_0=ruleStatement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getIfStatementRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"body",
                    	    								lv_body_8_0,
                    	    								"org.xtext.Robot.Statement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getIfStatementAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getIfStatementAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleString0"
    // InternalRobot.g:1216:1: entryRuleString0 returns [EObject current=null] : iv_ruleString0= ruleString0 EOF ;
    public final EObject entryRuleString0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleString0 = null;


        try {
            // InternalRobot.g:1216:48: (iv_ruleString0= ruleString0 EOF )
            // InternalRobot.g:1217:2: iv_ruleString0= ruleString0 EOF
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
    // InternalRobot.g:1223:1: ruleString0 returns [EObject current=null] : (otherlv_0= 'String' otherlv_1= '{' otherlv_2= 'text' ( (lv_text_3_0= ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleString0() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_text_3_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:1229:2: ( (otherlv_0= 'String' otherlv_1= '{' otherlv_2= 'text' ( (lv_text_3_0= ruleEString ) ) otherlv_4= '}' ) )
            // InternalRobot.g:1230:2: (otherlv_0= 'String' otherlv_1= '{' otherlv_2= 'text' ( (lv_text_3_0= ruleEString ) ) otherlv_4= '}' )
            {
            // InternalRobot.g:1230:2: (otherlv_0= 'String' otherlv_1= '{' otherlv_2= 'text' ( (lv_text_3_0= ruleEString ) ) otherlv_4= '}' )
            // InternalRobot.g:1231:3: otherlv_0= 'String' otherlv_1= '{' otherlv_2= 'text' ( (lv_text_3_0= ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getString0Access().getStringKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getString0Access().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getString0Access().getTextKeyword_2());
            		
            // InternalRobot.g:1243:3: ( (lv_text_3_0= ruleEString ) )
            // InternalRobot.g:1244:4: (lv_text_3_0= ruleEString )
            {
            // InternalRobot.g:1244:4: (lv_text_3_0= ruleEString )
            // InternalRobot.g:1245:5: lv_text_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getString0Access().getTextEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_text_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getString0Rule());
            					}
            					set(
            						current,
            						"text",
            						lv_text_3_0,
            						"org.xtext.Robot.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getString0Access().getRightCurlyBracketKeyword_4());
            		

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
    // InternalRobot.g:1270:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalRobot.g:1270:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalRobot.g:1271:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalRobot.g:1277:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalRobot.g:1283:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalRobot.g:1284:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalRobot.g:1284:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalRobot.g:1285:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalRobot.g:1285:3: (kw= '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==36) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRobot.g:1286:4: kw= '-'
                    {
                    kw=(Token)match(input,36,FOLLOW_24); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleFull"
    // InternalRobot.g:1303:1: entryRuleFull returns [EObject current=null] : iv_ruleFull= ruleFull EOF ;
    public final EObject entryRuleFull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFull = null;


        try {
            // InternalRobot.g:1303:45: (iv_ruleFull= ruleFull EOF )
            // InternalRobot.g:1304:2: iv_ruleFull= ruleFull EOF
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
    // InternalRobot.g:1310:1: ruleFull returns [EObject current=null] : ( () otherlv_1= 'Full' ) ;
    public final EObject ruleFull() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRobot.g:1316:2: ( ( () otherlv_1= 'Full' ) )
            // InternalRobot.g:1317:2: ( () otherlv_1= 'Full' )
            {
            // InternalRobot.g:1317:2: ( () otherlv_1= 'Full' )
            // InternalRobot.g:1318:3: () otherlv_1= 'Full'
            {
            // InternalRobot.g:1318:3: ()
            // InternalRobot.g:1319:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFullAccess().getFullAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_2); 

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
    // InternalRobot.g:1333:1: entryRuleMark returns [EObject current=null] : iv_ruleMark= ruleMark EOF ;
    public final EObject entryRuleMark() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMark = null;


        try {
            // InternalRobot.g:1333:45: (iv_ruleMark= ruleMark EOF )
            // InternalRobot.g:1334:2: iv_ruleMark= ruleMark EOF
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
    // InternalRobot.g:1340:1: ruleMark returns [EObject current=null] : ( () otherlv_1= 'Mark' ) ;
    public final EObject ruleMark() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRobot.g:1346:2: ( ( () otherlv_1= 'Mark' ) )
            // InternalRobot.g:1347:2: ( () otherlv_1= 'Mark' )
            {
            // InternalRobot.g:1347:2: ( () otherlv_1= 'Mark' )
            // InternalRobot.g:1348:3: () otherlv_1= 'Mark'
            {
            // InternalRobot.g:1348:3: ()
            // InternalRobot.g:1349:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMarkAccess().getMarkAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_2); 

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
    // InternalRobot.g:1363:1: entryRuleAhead returns [EObject current=null] : iv_ruleAhead= ruleAhead EOF ;
    public final EObject entryRuleAhead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAhead = null;


        try {
            // InternalRobot.g:1363:46: (iv_ruleAhead= ruleAhead EOF )
            // InternalRobot.g:1364:2: iv_ruleAhead= ruleAhead EOF
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
    // InternalRobot.g:1370:1: ruleAhead returns [EObject current=null] : ( () otherlv_1= 'Ahead' ) ;
    public final EObject ruleAhead() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRobot.g:1376:2: ( ( () otherlv_1= 'Ahead' ) )
            // InternalRobot.g:1377:2: ( () otherlv_1= 'Ahead' )
            {
            // InternalRobot.g:1377:2: ( () otherlv_1= 'Ahead' )
            // InternalRobot.g:1378:3: () otherlv_1= 'Ahead'
            {
            // InternalRobot.g:1378:3: ()
            // InternalRobot.g:1379:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAheadAccess().getAheadAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getAheadAccess().getAheadKeyword_1());
            		

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
    // InternalRobot.g:1393:1: entryRuleHeading returns [EObject current=null] : iv_ruleHeading= ruleHeading EOF ;
    public final EObject entryRuleHeading() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeading = null;


        try {
            // InternalRobot.g:1393:48: (iv_ruleHeading= ruleHeading EOF )
            // InternalRobot.g:1394:2: iv_ruleHeading= ruleHeading EOF
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
    // InternalRobot.g:1400:1: ruleHeading returns [EObject current=null] : (otherlv_0= 'Heading' otherlv_1= '{' otherlv_2= 'wind' ( (lv_wind_3_0= ruleOrientation ) ) otherlv_4= '}' ) ;
    public final EObject ruleHeading() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_wind_3_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:1406:2: ( (otherlv_0= 'Heading' otherlv_1= '{' otherlv_2= 'wind' ( (lv_wind_3_0= ruleOrientation ) ) otherlv_4= '}' ) )
            // InternalRobot.g:1407:2: (otherlv_0= 'Heading' otherlv_1= '{' otherlv_2= 'wind' ( (lv_wind_3_0= ruleOrientation ) ) otherlv_4= '}' )
            {
            // InternalRobot.g:1407:2: (otherlv_0= 'Heading' otherlv_1= '{' otherlv_2= 'wind' ( (lv_wind_3_0= ruleOrientation ) ) otherlv_4= '}' )
            // InternalRobot.g:1408:3: otherlv_0= 'Heading' otherlv_1= '{' otherlv_2= 'wind' ( (lv_wind_3_0= ruleOrientation ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getHeadingAccess().getHeadingKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getHeadingAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,41,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getHeadingAccess().getWindKeyword_2());
            		
            // InternalRobot.g:1420:3: ( (lv_wind_3_0= ruleOrientation ) )
            // InternalRobot.g:1421:4: (lv_wind_3_0= ruleOrientation )
            {
            // InternalRobot.g:1421:4: (lv_wind_3_0= ruleOrientation )
            // InternalRobot.g:1422:5: lv_wind_3_0= ruleOrientation
            {

            					newCompositeNode(grammarAccess.getHeadingAccess().getWindOrientationEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_wind_3_0=ruleOrientation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHeadingRule());
            					}
            					set(
            						current,
            						"wind",
            						lv_wind_3_0,
            						"org.xtext.Robot.Orientation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getHeadingAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalRobot.g:1447:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalRobot.g:1447:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalRobot.g:1448:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalRobot.g:1454:1: ruleAnd returns [EObject current=null] : (otherlv_0= 'And' otherlv_1= '{' otherlv_2= 'a' ( (lv_a_3_0= ruleExpression ) ) otherlv_4= 'b' ( (lv_b_5_0= ruleExpression ) ) otherlv_6= '}' ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_a_3_0 = null;

        EObject lv_b_5_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:1460:2: ( (otherlv_0= 'And' otherlv_1= '{' otherlv_2= 'a' ( (lv_a_3_0= ruleExpression ) ) otherlv_4= 'b' ( (lv_b_5_0= ruleExpression ) ) otherlv_6= '}' ) )
            // InternalRobot.g:1461:2: (otherlv_0= 'And' otherlv_1= '{' otherlv_2= 'a' ( (lv_a_3_0= ruleExpression ) ) otherlv_4= 'b' ( (lv_b_5_0= ruleExpression ) ) otherlv_6= '}' )
            {
            // InternalRobot.g:1461:2: (otherlv_0= 'And' otherlv_1= '{' otherlv_2= 'a' ( (lv_a_3_0= ruleExpression ) ) otherlv_4= 'b' ( (lv_b_5_0= ruleExpression ) ) otherlv_6= '}' )
            // InternalRobot.g:1462:3: otherlv_0= 'And' otherlv_1= '{' otherlv_2= 'a' ( (lv_a_3_0= ruleExpression ) ) otherlv_4= 'b' ( (lv_b_5_0= ruleExpression ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAndAccess().getAndKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getAndAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,43,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAKeyword_2());
            		
            // InternalRobot.g:1474:3: ( (lv_a_3_0= ruleExpression ) )
            // InternalRobot.g:1475:4: (lv_a_3_0= ruleExpression )
            {
            // InternalRobot.g:1475:4: (lv_a_3_0= ruleExpression )
            // InternalRobot.g:1476:5: lv_a_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAndAccess().getAExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_28);
            lv_a_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAndRule());
            					}
            					set(
            						current,
            						"a",
            						lv_a_3_0,
            						"org.xtext.Robot.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,44,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getAndAccess().getBKeyword_4());
            		
            // InternalRobot.g:1497:3: ( (lv_b_5_0= ruleExpression ) )
            // InternalRobot.g:1498:4: (lv_b_5_0= ruleExpression )
            {
            // InternalRobot.g:1498:4: (lv_b_5_0= ruleExpression )
            // InternalRobot.g:1499:5: lv_b_5_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAndAccess().getBExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_b_5_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAndRule());
            					}
            					set(
            						current,
            						"b",
            						lv_b_5_0,
            						"org.xtext.Robot.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAndAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalRobot.g:1524:1: entryRuleNot returns [EObject current=null] : iv_ruleNot= ruleNot EOF ;
    public final EObject entryRuleNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot = null;


        try {
            // InternalRobot.g:1524:44: (iv_ruleNot= ruleNot EOF )
            // InternalRobot.g:1525:2: iv_ruleNot= ruleNot EOF
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
    // InternalRobot.g:1531:1: ruleNot returns [EObject current=null] : (otherlv_0= 'Not' otherlv_1= '{' otherlv_2= 'e' ( (lv_e_3_0= ruleExpression ) ) otherlv_4= '}' ) ;
    public final EObject ruleNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_e_3_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:1537:2: ( (otherlv_0= 'Not' otherlv_1= '{' otherlv_2= 'e' ( (lv_e_3_0= ruleExpression ) ) otherlv_4= '}' ) )
            // InternalRobot.g:1538:2: (otherlv_0= 'Not' otherlv_1= '{' otherlv_2= 'e' ( (lv_e_3_0= ruleExpression ) ) otherlv_4= '}' )
            {
            // InternalRobot.g:1538:2: (otherlv_0= 'Not' otherlv_1= '{' otherlv_2= 'e' ( (lv_e_3_0= ruleExpression ) ) otherlv_4= '}' )
            // InternalRobot.g:1539:3: otherlv_0= 'Not' otherlv_1= '{' otherlv_2= 'e' ( (lv_e_3_0= ruleExpression ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getNotAccess().getNotKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getNotAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,46,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getNotAccess().getEKeyword_2());
            		
            // InternalRobot.g:1551:3: ( (lv_e_3_0= ruleExpression ) )
            // InternalRobot.g:1552:4: (lv_e_3_0= ruleExpression )
            {
            // InternalRobot.g:1552:4: (lv_e_3_0= ruleExpression )
            // InternalRobot.g:1553:5: lv_e_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getNotAccess().getEExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_e_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNotRule());
            					}
            					set(
            						current,
            						"e",
            						lv_e_3_0,
            						"org.xtext.Robot.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getNotAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalRobot.g:1578:1: ruleSingletonTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'step' ) | (enumLiteral_1= 'turnLeft' ) | (enumLiteral_2= 'drop' ) | (enumLiteral_3= 'pick' ) ) ;
    public final Enumerator ruleSingletonTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalRobot.g:1584:2: ( ( (enumLiteral_0= 'step' ) | (enumLiteral_1= 'turnLeft' ) | (enumLiteral_2= 'drop' ) | (enumLiteral_3= 'pick' ) ) )
            // InternalRobot.g:1585:2: ( (enumLiteral_0= 'step' ) | (enumLiteral_1= 'turnLeft' ) | (enumLiteral_2= 'drop' ) | (enumLiteral_3= 'pick' ) )
            {
            // InternalRobot.g:1585:2: ( (enumLiteral_0= 'step' ) | (enumLiteral_1= 'turnLeft' ) | (enumLiteral_2= 'drop' ) | (enumLiteral_3= 'pick' ) )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt18=1;
                }
                break;
            case 48:
                {
                alt18=2;
                }
                break;
            case 49:
                {
                alt18=3;
                }
                break;
            case 50:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalRobot.g:1586:3: (enumLiteral_0= 'step' )
                    {
                    // InternalRobot.g:1586:3: (enumLiteral_0= 'step' )
                    // InternalRobot.g:1587:4: enumLiteral_0= 'step'
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getSingletonTypesAccess().getStepEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSingletonTypesAccess().getStepEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRobot.g:1594:3: (enumLiteral_1= 'turnLeft' )
                    {
                    // InternalRobot.g:1594:3: (enumLiteral_1= 'turnLeft' )
                    // InternalRobot.g:1595:4: enumLiteral_1= 'turnLeft'
                    {
                    enumLiteral_1=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getSingletonTypesAccess().getTurnLeftEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSingletonTypesAccess().getTurnLeftEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRobot.g:1602:3: (enumLiteral_2= 'drop' )
                    {
                    // InternalRobot.g:1602:3: (enumLiteral_2= 'drop' )
                    // InternalRobot.g:1603:4: enumLiteral_2= 'drop'
                    {
                    enumLiteral_2=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getSingletonTypesAccess().getDropEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSingletonTypesAccess().getDropEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRobot.g:1610:3: (enumLiteral_3= 'pick' )
                    {
                    // InternalRobot.g:1610:3: (enumLiteral_3= 'pick' )
                    // InternalRobot.g:1611:4: enumLiteral_3= 'pick'
                    {
                    enumLiteral_3=(Token)match(input,50,FOLLOW_2); 

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
    // InternalRobot.g:1621:1: ruleOrientation returns [Enumerator current=null] : ( (enumLiteral_0= 'south' ) | (enumLiteral_1= 'north' ) | (enumLiteral_2= 'east' ) | (enumLiteral_3= 'west' ) ) ;
    public final Enumerator ruleOrientation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalRobot.g:1627:2: ( ( (enumLiteral_0= 'south' ) | (enumLiteral_1= 'north' ) | (enumLiteral_2= 'east' ) | (enumLiteral_3= 'west' ) ) )
            // InternalRobot.g:1628:2: ( (enumLiteral_0= 'south' ) | (enumLiteral_1= 'north' ) | (enumLiteral_2= 'east' ) | (enumLiteral_3= 'west' ) )
            {
            // InternalRobot.g:1628:2: ( (enumLiteral_0= 'south' ) | (enumLiteral_1= 'north' ) | (enumLiteral_2= 'east' ) | (enumLiteral_3= 'west' ) )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt19=1;
                }
                break;
            case 52:
                {
                alt19=2;
                }
                break;
            case 53:
                {
                alt19=3;
                }
                break;
            case 54:
                {
                alt19=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalRobot.g:1629:3: (enumLiteral_0= 'south' )
                    {
                    // InternalRobot.g:1629:3: (enumLiteral_0= 'south' )
                    // InternalRobot.g:1630:4: enumLiteral_0= 'south'
                    {
                    enumLiteral_0=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getOrientationAccess().getSouthEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOrientationAccess().getSouthEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRobot.g:1637:3: (enumLiteral_1= 'north' )
                    {
                    // InternalRobot.g:1637:3: (enumLiteral_1= 'north' )
                    // InternalRobot.g:1638:4: enumLiteral_1= 'north'
                    {
                    enumLiteral_1=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getOrientationAccess().getNorthEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOrientationAccess().getNorthEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRobot.g:1645:3: (enumLiteral_2= 'east' )
                    {
                    // InternalRobot.g:1645:3: (enumLiteral_2= 'east' )
                    // InternalRobot.g:1646:4: enumLiteral_2= 'east'
                    {
                    enumLiteral_2=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getOrientationAccess().getEastEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOrientationAccess().getEastEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRobot.g:1653:3: (enumLiteral_3= 'west' )
                    {
                    // InternalRobot.g:1653:3: (enumLiteral_3= 'west' )
                    // InternalRobot.g:1654:4: enumLiteral_3= 'west'
                    {
                    enumLiteral_3=(Token)match(input,54,FOLLOW_2); 

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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000004A6550000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0007800000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000001000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000025E000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010008000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000300008000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200008000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0078000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000400000000000L});

}