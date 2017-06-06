/*
 * generated by Xtext 2.11.0
 */
package org.xtext.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.services.RobotGrammarAccess;
import simplerobot.Ahead;
import simplerobot.And;
import simplerobot.BuildWall;
import simplerobot.Comment;
import simplerobot.DropMark;
import simplerobot.Full;
import simplerobot.Heading;
import simplerobot.IfElseStatement;
import simplerobot.IfStatement;
import simplerobot.Mark;
import simplerobot.Not;
import simplerobot.RepeatStatement;
import simplerobot.Robot;
import simplerobot.SimplerobotPackage;
import simplerobot.Singleton;
import simplerobot.Trace;
import simplerobot.WhileStatement;

@SuppressWarnings("all")
public class RobotSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RobotGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == SimplerobotPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SimplerobotPackage.AHEAD:
				sequence_Ahead(context, (Ahead) semanticObject); 
				return; 
			case SimplerobotPackage.AND:
				sequence_And(context, (And) semanticObject); 
				return; 
			case SimplerobotPackage.BUILD_WALL:
				sequence_BuildWall(context, (BuildWall) semanticObject); 
				return; 
			case SimplerobotPackage.COMMENT:
				sequence_Comment(context, (Comment) semanticObject); 
				return; 
			case SimplerobotPackage.DROP_MARK:
				sequence_DropMark(context, (DropMark) semanticObject); 
				return; 
			case SimplerobotPackage.FULL:
				sequence_Full(context, (Full) semanticObject); 
				return; 
			case SimplerobotPackage.HEADING:
				sequence_Heading(context, (Heading) semanticObject); 
				return; 
			case SimplerobotPackage.IF_ELSE_STATEMENT:
				sequence_IfElseStatement(context, (IfElseStatement) semanticObject); 
				return; 
			case SimplerobotPackage.IF_STATEMENT:
				sequence_IfStatement(context, (IfStatement) semanticObject); 
				return; 
			case SimplerobotPackage.MARK:
				sequence_Mark(context, (Mark) semanticObject); 
				return; 
			case SimplerobotPackage.NOT:
				sequence_Not(context, (Not) semanticObject); 
				return; 
			case SimplerobotPackage.REPEAT_STATEMENT:
				sequence_RepeatStatement(context, (RepeatStatement) semanticObject); 
				return; 
			case SimplerobotPackage.ROBOT:
				sequence_Robot(context, (Robot) semanticObject); 
				return; 
			case SimplerobotPackage.SINGLETON:
				sequence_Singleton(context, (Singleton) semanticObject); 
				return; 
			case SimplerobotPackage.STRING:
				sequence_String0(context, (simplerobot.String) semanticObject); 
				return; 
			case SimplerobotPackage.TRACE:
				sequence_Trace(context, (Trace) semanticObject); 
				return; 
			case SimplerobotPackage.WHILE_STATEMENT:
				sequence_WhileStatement(context, (WhileStatement) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Atomic returns Ahead
	 *     Ahead returns Ahead
	 *
	 * Constraint:
	 *     {Ahead}
	 */
	protected void sequence_Ahead(ISerializationContext context, Ahead semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns And
	 *     And returns And
	 *
	 * Constraint:
	 *     (a=Atomic b=Expression?)
	 */
	protected void sequence_And(ISerializationContext context, And semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns BuildWall
	 *     BuildWall returns BuildWall
	 *
	 * Constraint:
	 *     (row=EInt col=EInt)
	 */
	protected void sequence_BuildWall(ISerializationContext context, BuildWall semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimplerobotPackage.Literals.BUILD_WALL__ROW) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimplerobotPackage.Literals.BUILD_WALL__ROW));
			if (transientValues.isValueTransient(semanticObject, SimplerobotPackage.Literals.BUILD_WALL__COL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimplerobotPackage.Literals.BUILD_WALL__COL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBuildWallAccess().getRowEIntParserRuleCall_3_0(), semanticObject.getRow());
		feeder.accept(grammarAccess.getBuildWallAccess().getColEIntParserRuleCall_5_0(), semanticObject.getCol());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Comment
	 *     Comment returns Comment
	 *
	 * Constraint:
	 *     comment=EString
	 */
	protected void sequence_Comment(ISerializationContext context, Comment semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimplerobotPackage.Literals.COMMENT__COMMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimplerobotPackage.Literals.COMMENT__COMMENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCommentAccess().getCommentEStringParserRuleCall_1_0(), semanticObject.getComment());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns DropMark
	 *     DropMark returns DropMark
	 *
	 * Constraint:
	 *     (row=EInt col=EInt)
	 */
	protected void sequence_DropMark(ISerializationContext context, DropMark semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimplerobotPackage.Literals.DROP_MARK__ROW) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimplerobotPackage.Literals.DROP_MARK__ROW));
			if (transientValues.isValueTransient(semanticObject, SimplerobotPackage.Literals.DROP_MARK__COL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimplerobotPackage.Literals.DROP_MARK__COL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDropMarkAccess().getRowEIntParserRuleCall_3_0(), semanticObject.getRow());
		feeder.accept(grammarAccess.getDropMarkAccess().getColEIntParserRuleCall_5_0(), semanticObject.getCol());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Atomic returns Full
	 *     Full returns Full
	 *
	 * Constraint:
	 *     {Full}
	 */
	protected void sequence_Full(ISerializationContext context, Full semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Atomic returns Heading
	 *     Heading returns Heading
	 *
	 * Constraint:
	 *     wind=Orientation
	 */
	protected void sequence_Heading(ISerializationContext context, Heading semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimplerobotPackage.Literals.HEADING__WIND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimplerobotPackage.Literals.HEADING__WIND));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getHeadingAccess().getWindOrientationEnumRuleCall_1_0(), semanticObject.getWind());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns IfElseStatement
	 *     IfElseStatement returns IfElseStatement
	 *
	 * Constraint:
	 *     (cond=Expression (ifbody+=Statement ifbody+=Statement*)? (elsebody+=Statement elsebody+=Statement*)?)
	 */
	protected void sequence_IfElseStatement(ISerializationContext context, IfElseStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     IfStatement returns IfStatement
	 *
	 * Constraint:
	 *     (cond=Expression (body+=Statement body+=Statement*)?)
	 */
	protected void sequence_IfStatement(ISerializationContext context, IfStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Atomic returns Mark
	 *     Mark returns Mark
	 *
	 * Constraint:
	 *     {Mark}
	 */
	protected void sequence_Mark(ISerializationContext context, Mark semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Atomic returns Not
	 *     Not returns Not
	 *
	 * Constraint:
	 *     e=Atomic
	 */
	protected void sequence_Not(ISerializationContext context, Not semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimplerobotPackage.Literals.NOT__E) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimplerobotPackage.Literals.NOT__E));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNotAccess().getEAtomicParserRuleCall_1_0(), semanticObject.getE());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns RepeatStatement
	 *     RepeatStatement returns RepeatStatement
	 *
	 * Constraint:
	 *     (times=EInt (body+=Statement body+=Statement*)?)
	 */
	protected void sequence_RepeatStatement(ISerializationContext context, RepeatStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Robot returns Robot
	 *
	 * Constraint:
	 *     (name=EString (statements+=Statement statements+=Statement*)?)
	 */
	protected void sequence_Robot(ISerializationContext context, Robot semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Singleton
	 *     Singleton returns Singleton
	 *
	 * Constraint:
	 *     type=SingletonTypes
	 */
	protected void sequence_Singleton(ISerializationContext context, Singleton semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimplerobotPackage.Literals.SINGLETON__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimplerobotPackage.Literals.SINGLETON__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSingletonAccess().getTypeSingletonTypesEnumRuleCall_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     String0 returns String
	 *
	 * Constraint:
	 *     text=EString
	 */
	protected void sequence_String0(ISerializationContext context, simplerobot.String semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimplerobotPackage.Literals.STRING__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimplerobotPackage.Literals.STRING__TEXT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getString0Access().getTextEStringParserRuleCall_1_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Trace
	 *     Trace returns Trace
	 *
	 * Constraint:
	 *     text=String0
	 */
	protected void sequence_Trace(ISerializationContext context, Trace semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimplerobotPackage.Literals.TRACE__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimplerobotPackage.Literals.TRACE__TEXT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTraceAccess().getTextString0ParserRuleCall_2_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns WhileStatement
	 *     WhileStatement returns WhileStatement
	 *
	 * Constraint:
	 *     (cond=Expression (body+=Statement body+=Statement*)?)
	 */
	protected void sequence_WhileStatement(ISerializationContext context, WhileStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
