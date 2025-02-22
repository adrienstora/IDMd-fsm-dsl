/*
 * generated by Xtext 2.14.0
 */
grammar InternalMyFSM;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package fr.ut2j.m1ice.fsm.texteditor.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package fr.ut2j.m1ice.fsm.texteditor.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.ut2j.m1ice.fsm.texteditor.services.MyFSMGrammarAccess;

}

@parser::members {

 	private MyFSMGrammarAccess grammarAccess;

    public InternalMyFSMParser(TokenStream input, MyFSMGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "FSM";
   	}

   	@Override
   	protected MyFSMGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleFSM
entryRuleFSM returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFSMRule()); }
	iv_ruleFSM=ruleFSM
	{ $current=$iv_ruleFSM.current; }
	EOF;

// Rule FSM
ruleFSM returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getFSMAccess().getFSMAction_0(),
					$current);
			}
		)
		otherlv_1='FSM'
		{
			newLeafNode(otherlv_1, grammarAccess.getFSMAccess().getFSMKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFSMAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFSMRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"fr.ut2j.m1ice.fsm.texteditor.MyFSM.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='init'
		{
			newLeafNode(otherlv_3, grammarAccess.getFSMAccess().getInitKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFSMAccess().getStateInitialStateParserRuleCall_4_0());
				}
				lv_state_4_0=ruleInitialState
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFSMRule());
					}
					add(
						$current,
						"state",
						lv_state_4_0,
						"fr.ut2j.m1ice.fsm.texteditor.MyFSM.InitialState");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='final'
		{
			newLeafNode(otherlv_5, grammarAccess.getFSMAccess().getFinalKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFSMAccess().getStateFinalStateParserRuleCall_6_0());
				}
				lv_state_6_0=ruleFinalState
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFSMRule());
					}
					add(
						$current,
						"state",
						lv_state_6_0,
						"fr.ut2j.m1ice.fsm.texteditor.MyFSM.FinalState");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				otherlv_7='state'
				{
					newLeafNode(otherlv_7, grammarAccess.getFSMAccess().getStateKeyword_7_0_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getFSMAccess().getStateStateParserRuleCall_7_0_1_0());
						}
						lv_state_8_0=ruleState
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getFSMRule());
							}
							add(
								$current,
								"state",
								lv_state_8_0,
								"fr.ut2j.m1ice.fsm.texteditor.MyFSM.State");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					otherlv_9=','
					{
						newLeafNode(otherlv_9, grammarAccess.getFSMAccess().getCommaKeyword_7_0_2_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getFSMAccess().getStateStateParserRuleCall_7_0_2_1_0());
							}
							lv_state_10_0=ruleState
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getFSMRule());
								}
								add(
									$current,
									"state",
									lv_state_10_0,
									"fr.ut2j.m1ice.fsm.texteditor.MyFSM.State");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)*
			)
			    |
			(
				otherlv_11='tr'
				{
					newLeafNode(otherlv_11, grammarAccess.getFSMAccess().getTrKeyword_7_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getFSMAccess().getTransitionTransitionParserRuleCall_7_1_1_0());
						}
						lv_transition_12_0=ruleTransition
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getFSMRule());
							}
							add(
								$current,
								"transition",
								lv_transition_12_0,
								"fr.ut2j.m1ice.fsm.texteditor.MyFSM.Transition");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					otherlv_13=','
					{
						newLeafNode(otherlv_13, grammarAccess.getFSMAccess().getCommaKeyword_7_1_2_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getFSMAccess().getTransitionTransitionParserRuleCall_7_1_2_1_0());
							}
							lv_transition_14_0=ruleTransition
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getFSMRule());
								}
								add(
									$current,
									"transition",
									lv_transition_14_0,
									"fr.ut2j.m1ice.fsm.texteditor.MyFSM.Transition");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)*
			)
		)*
	)
;

// Entry rule entryRuleState
entryRuleState returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStateRule()); }
	iv_ruleState=ruleState
	{ $current=$iv_ruleState.current; }
	EOF;

// Rule State
ruleState returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getStateAccess().getStateAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStateRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"fr.ut2j.m1ice.fsm.texteditor.MyFSM.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleTransition
entryRuleTransition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTransitionRule()); }
	iv_ruleTransition=ruleTransition
	{ $current=$iv_ruleTransition.current; }
	EOF;

// Rule Transition
ruleTransition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getTransitionAccess().getNameEStringParserRuleCall_0_0());
				}
				lv_name_0_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTransitionRule());
					}
					set(
						$current,
						"name",
						lv_name_0_0,
						"fr.ut2j.m1ice.fsm.texteditor.MyFSM.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransitionRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getTransitionAccess().getSourceStateCrossReference_1_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='->'
		{
			newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransitionRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getTransitionAccess().getTargetStateCrossReference_3_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleInitialState
entryRuleInitialState returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInitialStateRule()); }
	iv_ruleInitialState=ruleInitialState
	{ $current=$iv_ruleInitialState.current; }
	EOF;

// Rule InitialState
ruleInitialState returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getInitialStateAccess().getInitialStateAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getInitialStateAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInitialStateRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"fr.ut2j.m1ice.fsm.texteditor.MyFSM.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleFinalState
entryRuleFinalState returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFinalStateRule()); }
	iv_ruleFinalState=ruleFinalState
	{ $current=$iv_ruleFinalState.current; }
	EOF;

// Rule FinalState
ruleFinalState returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getFinalStateAccess().getFinalStateAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getFinalStateAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFinalStateRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"fr.ut2j.m1ice.fsm.texteditor.MyFSM.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
