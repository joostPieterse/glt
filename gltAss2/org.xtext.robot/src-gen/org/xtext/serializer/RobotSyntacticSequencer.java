/*
 * generated by Xtext 2.11.0
 */
package org.xtext.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.services.RobotGrammarAccess;

@SuppressWarnings("all")
public class RobotSyntacticSequencer extends AbstractSyntacticSequencer {

	protected RobotGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Expression_AndKeyword_2_0_0_or_OrKeyword_2_0_1;
	protected AbstractElementAlias match_IfElseStatement_LineFeedKeyword_3_q;
	protected AbstractElementAlias match_IfElseStatement_LineFeedKeyword_4_1_q;
	protected AbstractElementAlias match_IfElseStatement_LineFeedKeyword_4_2_1_q;
	protected AbstractElementAlias match_IfElseStatement_LineFeedKeyword_5_2_q;
	protected AbstractElementAlias match_IfElseStatement_LineFeedKeyword_5_3_1_q;
	protected AbstractElementAlias match_IfElseStatement_LineFeedKeyword_5_3_2_1_q;
	protected AbstractElementAlias match_IfElseStatement___ElseKeyword_5_0_DoKeyword_5_1_LineFeedKeyword_5_2_q__q;
	protected AbstractElementAlias match_IfStatement_LineFeedKeyword_3_q;
	protected AbstractElementAlias match_IfStatement_LineFeedKeyword_4_1_q;
	protected AbstractElementAlias match_IfStatement_LineFeedKeyword_4_2_1_q;
	protected AbstractElementAlias match_RepeatStatement_LineFeedKeyword_3_q;
	protected AbstractElementAlias match_RepeatStatement_LineFeedKeyword_4_1_q;
	protected AbstractElementAlias match_RepeatStatement_LineFeedKeyword_4_2_1_q;
	protected AbstractElementAlias match_Robot_LineFeedKeyword_5_q;
	protected AbstractElementAlias match_Robot_LineFeedKeyword_6_1_q;
	protected AbstractElementAlias match_Robot_LineFeedKeyword_6_2_1_q;
	protected AbstractElementAlias match_WhileStatement_LineFeedKeyword_3_q;
	protected AbstractElementAlias match_WhileStatement_LineFeedKeyword_4_1_q;
	protected AbstractElementAlias match_WhileStatement_LineFeedKeyword_4_2_1_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (RobotGrammarAccess) access;
		match_Expression_AndKeyword_2_0_0_or_OrKeyword_2_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getExpressionAccess().getAndKeyword_2_0_0()), new TokenAlias(false, false, grammarAccess.getExpressionAccess().getOrKeyword_2_0_1()));
		match_IfElseStatement_LineFeedKeyword_3_q = new TokenAlias(false, true, grammarAccess.getIfElseStatementAccess().getLineFeedKeyword_3());
		match_IfElseStatement_LineFeedKeyword_4_1_q = new TokenAlias(false, true, grammarAccess.getIfElseStatementAccess().getLineFeedKeyword_4_1());
		match_IfElseStatement_LineFeedKeyword_4_2_1_q = new TokenAlias(false, true, grammarAccess.getIfElseStatementAccess().getLineFeedKeyword_4_2_1());
		match_IfElseStatement_LineFeedKeyword_5_2_q = new TokenAlias(false, true, grammarAccess.getIfElseStatementAccess().getLineFeedKeyword_5_2());
		match_IfElseStatement_LineFeedKeyword_5_3_1_q = new TokenAlias(false, true, grammarAccess.getIfElseStatementAccess().getLineFeedKeyword_5_3_1());
		match_IfElseStatement_LineFeedKeyword_5_3_2_1_q = new TokenAlias(false, true, grammarAccess.getIfElseStatementAccess().getLineFeedKeyword_5_3_2_1());
		match_IfElseStatement___ElseKeyword_5_0_DoKeyword_5_1_LineFeedKeyword_5_2_q__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getIfElseStatementAccess().getElseKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getIfElseStatementAccess().getDoKeyword_5_1()), new TokenAlias(false, true, grammarAccess.getIfElseStatementAccess().getLineFeedKeyword_5_2()));
		match_IfStatement_LineFeedKeyword_3_q = new TokenAlias(false, true, grammarAccess.getIfStatementAccess().getLineFeedKeyword_3());
		match_IfStatement_LineFeedKeyword_4_1_q = new TokenAlias(false, true, grammarAccess.getIfStatementAccess().getLineFeedKeyword_4_1());
		match_IfStatement_LineFeedKeyword_4_2_1_q = new TokenAlias(false, true, grammarAccess.getIfStatementAccess().getLineFeedKeyword_4_2_1());
		match_RepeatStatement_LineFeedKeyword_3_q = new TokenAlias(false, true, grammarAccess.getRepeatStatementAccess().getLineFeedKeyword_3());
		match_RepeatStatement_LineFeedKeyword_4_1_q = new TokenAlias(false, true, grammarAccess.getRepeatStatementAccess().getLineFeedKeyword_4_1());
		match_RepeatStatement_LineFeedKeyword_4_2_1_q = new TokenAlias(false, true, grammarAccess.getRepeatStatementAccess().getLineFeedKeyword_4_2_1());
		match_Robot_LineFeedKeyword_5_q = new TokenAlias(false, true, grammarAccess.getRobotAccess().getLineFeedKeyword_5());
		match_Robot_LineFeedKeyword_6_1_q = new TokenAlias(false, true, grammarAccess.getRobotAccess().getLineFeedKeyword_6_1());
		match_Robot_LineFeedKeyword_6_2_1_q = new TokenAlias(false, true, grammarAccess.getRobotAccess().getLineFeedKeyword_6_2_1());
		match_WhileStatement_LineFeedKeyword_3_q = new TokenAlias(false, true, grammarAccess.getWhileStatementAccess().getLineFeedKeyword_3());
		match_WhileStatement_LineFeedKeyword_4_1_q = new TokenAlias(false, true, grammarAccess.getWhileStatementAccess().getLineFeedKeyword_4_1());
		match_WhileStatement_LineFeedKeyword_4_2_1_q = new TokenAlias(false, true, grammarAccess.getWhileStatementAccess().getLineFeedKeyword_4_2_1());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getCOMMENTTEXTRule())
			return getCOMMENTTEXTToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal COMMENTTEXT 	: '#' !('\n'|'\r')* ('\r'? '\n')?;
	 */
	protected String getCOMMENTTEXTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "#";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Expression_AndKeyword_2_0_0_or_OrKeyword_2_0_1.equals(syntax))
				emit_Expression_AndKeyword_2_0_0_or_OrKeyword_2_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_IfElseStatement_LineFeedKeyword_3_q.equals(syntax))
				emit_IfElseStatement_LineFeedKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_IfElseStatement_LineFeedKeyword_4_1_q.equals(syntax))
				emit_IfElseStatement_LineFeedKeyword_4_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_IfElseStatement_LineFeedKeyword_4_2_1_q.equals(syntax))
				emit_IfElseStatement_LineFeedKeyword_4_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_IfElseStatement_LineFeedKeyword_5_2_q.equals(syntax))
				emit_IfElseStatement_LineFeedKeyword_5_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_IfElseStatement_LineFeedKeyword_5_3_1_q.equals(syntax))
				emit_IfElseStatement_LineFeedKeyword_5_3_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_IfElseStatement_LineFeedKeyword_5_3_2_1_q.equals(syntax))
				emit_IfElseStatement_LineFeedKeyword_5_3_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_IfElseStatement___ElseKeyword_5_0_DoKeyword_5_1_LineFeedKeyword_5_2_q__q.equals(syntax))
				emit_IfElseStatement___ElseKeyword_5_0_DoKeyword_5_1_LineFeedKeyword_5_2_q__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_IfStatement_LineFeedKeyword_3_q.equals(syntax))
				emit_IfStatement_LineFeedKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_IfStatement_LineFeedKeyword_4_1_q.equals(syntax))
				emit_IfStatement_LineFeedKeyword_4_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_IfStatement_LineFeedKeyword_4_2_1_q.equals(syntax))
				emit_IfStatement_LineFeedKeyword_4_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RepeatStatement_LineFeedKeyword_3_q.equals(syntax))
				emit_RepeatStatement_LineFeedKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RepeatStatement_LineFeedKeyword_4_1_q.equals(syntax))
				emit_RepeatStatement_LineFeedKeyword_4_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RepeatStatement_LineFeedKeyword_4_2_1_q.equals(syntax))
				emit_RepeatStatement_LineFeedKeyword_4_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Robot_LineFeedKeyword_5_q.equals(syntax))
				emit_Robot_LineFeedKeyword_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Robot_LineFeedKeyword_6_1_q.equals(syntax))
				emit_Robot_LineFeedKeyword_6_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Robot_LineFeedKeyword_6_2_1_q.equals(syntax))
				emit_Robot_LineFeedKeyword_6_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_WhileStatement_LineFeedKeyword_3_q.equals(syntax))
				emit_WhileStatement_LineFeedKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_WhileStatement_LineFeedKeyword_4_1_q.equals(syntax))
				emit_WhileStatement_LineFeedKeyword_4_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_WhileStatement_LineFeedKeyword_4_2_1_q.equals(syntax))
				emit_WhileStatement_LineFeedKeyword_4_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'and' | 'or'
	 *
	 * This ambiguous syntax occurs at:
	 *     a=Atomic (ambiguity) b=Expression
	 */
	protected void emit_Expression_AndKeyword_2_0_0_or_OrKeyword_2_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '
	  *     '?
	 *
	 * This ambiguous syntax occurs at:
	 *     (
	 *         cond=Expression 
	 *         'do' 
	 *         (ambiguity) 
	 *         'else' 
	 *         'do' 
	 *         '
	 *         '? 
	 *         elsebody+=Statement
	 *     )
	 *     (
	 *         cond=Expression 
	 *         'do' 
	 *         (ambiguity) 
	 *         (
	 *             'else' 
	 *             'do' 
	 *             '
	 *             '?
	 *         )? 
	 *         'end' 
	 *         (rule end)
	 *     )
	 *     cond=Expression 'do' (ambiguity) ifbody+=Statement
	 */
	protected void emit_IfElseStatement_LineFeedKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '
	  *     '?
	 *
	 * This ambiguous syntax occurs at:
	 *     (
	 *         ifbody+=Statement 
	 *         (ambiguity) 
	 *         'else' 
	 *         'do' 
	 *         '
	 *         '? 
	 *         elsebody+=Statement
	 *     )
	 *     (
	 *         ifbody+=Statement 
	 *         (ambiguity) 
	 *         (
	 *             'else' 
	 *             'do' 
	 *             '
	 *             '?
	 *         )? 
	 *         'end' 
	 *         (rule end)
	 *     )
	 *     ifbody+=Statement (ambiguity) ifbody+=Statement
	 */
	protected void emit_IfElseStatement_LineFeedKeyword_4_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '
	  *     '?
	 *
	 * This ambiguous syntax occurs at:
	 *     (
	 *         ifbody+=Statement 
	 *         (ambiguity) 
	 *         'else' 
	 *         'do' 
	 *         '
	 *         '? 
	 *         elsebody+=Statement
	 *     )
	 *     (
	 *         ifbody+=Statement 
	 *         (ambiguity) 
	 *         (
	 *             'else' 
	 *             'do' 
	 *             '
	 *             '?
	 *         )? 
	 *         'end' 
	 *         (rule end)
	 *     )
	 *     ifbody+=Statement (ambiguity) ifbody+=Statement
	 */
	protected void emit_IfElseStatement_LineFeedKeyword_4_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '
	  *     '?
	 *
	 * This ambiguous syntax occurs at:
	 *     (
	 *         cond=Expression 
	 *         'do' 
	 *         '
	 *         '? 
	 *         'else' 
	 *         'do' 
	 *         (ambiguity) 
	 *         elsebody+=Statement
	 *     )
	 *     (
	 *         ifbody+=Statement 
	 *         '
	 *         '? 
	 *         'else' 
	 *         'do' 
	 *         (ambiguity) 
	 *         elsebody+=Statement
	 *     )
	 */
	protected void emit_IfElseStatement_LineFeedKeyword_5_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '
	  *     '?
	 *
	 * This ambiguous syntax occurs at:
	 *     elsebody+=Statement (ambiguity) 'end' (rule end)
	 *     elsebody+=Statement (ambiguity) elsebody+=Statement
	 */
	protected void emit_IfElseStatement_LineFeedKeyword_5_3_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '
	  *     '?
	 *
	 * This ambiguous syntax occurs at:
	 *     elsebody+=Statement (ambiguity) 'end' (rule end)
	 *     elsebody+=Statement (ambiguity) elsebody+=Statement
	 */
	protected void emit_IfElseStatement_LineFeedKeyword_5_3_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (
	  *         'else' 
	  *         'do' 
	  *         '
	  *         '?
	  *     )?
	 *
	 * This ambiguous syntax occurs at:
	 *     (
	 *         cond=Expression 
	 *         'do' 
	 *         '
	 *         '? 
	 *         (ambiguity) 
	 *         'end' 
	 *         (rule end)
	 *     )
	 *     (
	 *         ifbody+=Statement 
	 *         '
	 *         '? 
	 *         (ambiguity) 
	 *         'end' 
	 *         (rule end)
	 *     )
	 */
	protected void emit_IfElseStatement___ElseKeyword_5_0_DoKeyword_5_1_LineFeedKeyword_5_2_q__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '
	  *     '?
	 *
	 * This ambiguous syntax occurs at:
	 *     cond=Expression 'do' (ambiguity) 'end' (rule end)
	 *     cond=Expression 'do' (ambiguity) body+=Statement
	 */
	protected void emit_IfStatement_LineFeedKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '
	  *     '?
	 *
	 * This ambiguous syntax occurs at:
	 *     body+=Statement (ambiguity) 'end' (rule end)
	 *     body+=Statement (ambiguity) body+=Statement
	 */
	protected void emit_IfStatement_LineFeedKeyword_4_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '
	  *     '?
	 *
	 * This ambiguous syntax occurs at:
	 *     body+=Statement (ambiguity) 'end' (rule end)
	 *     body+=Statement (ambiguity) body+=Statement
	 */
	protected void emit_IfStatement_LineFeedKeyword_4_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '
	  *     '?
	 *
	 * This ambiguous syntax occurs at:
	 *     times=PROPERINT 'times' (ambiguity) 'end' (rule end)
	 *     times=PROPERINT 'times' (ambiguity) body+=Statement
	 */
	protected void emit_RepeatStatement_LineFeedKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '
	  *     '?
	 *
	 * This ambiguous syntax occurs at:
	 *     body+=Statement (ambiguity) 'end' (rule end)
	 *     body+=Statement (ambiguity) body+=Statement
	 */
	protected void emit_RepeatStatement_LineFeedKeyword_4_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '
	  *     '?
	 *
	 * This ambiguous syntax occurs at:
	 *     body+=Statement (ambiguity) 'end' (rule end)
	 *     body+=Statement (ambiguity) body+=Statement
	 */
	protected void emit_RepeatStatement_LineFeedKeyword_4_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '
	  *     '?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=NAME 'runs' 'as' (ambiguity) 'end' (rule end)
	 *     name=NAME 'runs' 'as' (ambiguity) statements+=Statement
	 */
	protected void emit_Robot_LineFeedKeyword_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '
	  *     '?
	 *
	 * This ambiguous syntax occurs at:
	 *     statements+=Statement (ambiguity) 'end' (rule end)
	 *     statements+=Statement (ambiguity) statements+=Statement
	 */
	protected void emit_Robot_LineFeedKeyword_6_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '
	  *     '?
	 *
	 * This ambiguous syntax occurs at:
	 *     statements+=Statement (ambiguity) 'end' (rule end)
	 *     statements+=Statement (ambiguity) statements+=Statement
	 */
	protected void emit_Robot_LineFeedKeyword_6_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '
	  *     '?
	 *
	 * This ambiguous syntax occurs at:
	 *     cond=Expression 'do' (ambiguity) 'end' (rule end)
	 *     cond=Expression 'do' (ambiguity) body+=Statement
	 */
	protected void emit_WhileStatement_LineFeedKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '
	  *     '?
	 *
	 * This ambiguous syntax occurs at:
	 *     body+=Statement (ambiguity) 'end' (rule end)
	 *     body+=Statement (ambiguity) body+=Statement
	 */
	protected void emit_WhileStatement_LineFeedKeyword_4_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '
	  *     '?
	 *
	 * This ambiguous syntax occurs at:
	 *     body+=Statement (ambiguity) 'end' (rule end)
	 *     body+=Statement (ambiguity) body+=Statement
	 */
	protected void emit_WhileStatement_LineFeedKeyword_4_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
