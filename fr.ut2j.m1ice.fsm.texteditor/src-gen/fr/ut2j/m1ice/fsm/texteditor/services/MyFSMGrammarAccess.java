/*
 * generated by Xtext 2.14.0
 */
package fr.ut2j.m1ice.fsm.texteditor.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MyFSMGrammarAccess extends AbstractGrammarElementFinder {
	
	public class FSMElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.ut2j.m1ice.fsm.texteditor.MyFSM.FSM");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cFSMAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cFSMKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cInitKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cStateAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cStateInitialStateParserRuleCall_4_0 = (RuleCall)cStateAssignment_4.eContents().get(0);
		private final Keyword cFinalKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cStateAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cStateFinalStateParserRuleCall_6_0 = (RuleCall)cStateAssignment_6.eContents().get(0);
		private final Alternatives cAlternatives_7 = (Alternatives)cGroup.eContents().get(7);
		private final Group cGroup_7_0 = (Group)cAlternatives_7.eContents().get(0);
		private final Keyword cStateKeyword_7_0_0 = (Keyword)cGroup_7_0.eContents().get(0);
		private final Assignment cStateAssignment_7_0_1 = (Assignment)cGroup_7_0.eContents().get(1);
		private final RuleCall cStateStateParserRuleCall_7_0_1_0 = (RuleCall)cStateAssignment_7_0_1.eContents().get(0);
		private final Group cGroup_7_0_2 = (Group)cGroup_7_0.eContents().get(2);
		private final Keyword cCommaKeyword_7_0_2_0 = (Keyword)cGroup_7_0_2.eContents().get(0);
		private final Assignment cStateAssignment_7_0_2_1 = (Assignment)cGroup_7_0_2.eContents().get(1);
		private final RuleCall cStateStateParserRuleCall_7_0_2_1_0 = (RuleCall)cStateAssignment_7_0_2_1.eContents().get(0);
		private final Group cGroup_7_1 = (Group)cAlternatives_7.eContents().get(1);
		private final Keyword cTrKeyword_7_1_0 = (Keyword)cGroup_7_1.eContents().get(0);
		private final Assignment cTransitionAssignment_7_1_1 = (Assignment)cGroup_7_1.eContents().get(1);
		private final RuleCall cTransitionTransitionParserRuleCall_7_1_1_0 = (RuleCall)cTransitionAssignment_7_1_1.eContents().get(0);
		private final Group cGroup_7_1_2 = (Group)cGroup_7_1.eContents().get(2);
		private final Keyword cCommaKeyword_7_1_2_0 = (Keyword)cGroup_7_1_2.eContents().get(0);
		private final Assignment cTransitionAssignment_7_1_2_1 = (Assignment)cGroup_7_1_2.eContents().get(1);
		private final RuleCall cTransitionTransitionParserRuleCall_7_1_2_1_0 = (RuleCall)cTransitionAssignment_7_1_2_1.eContents().get(0);
		
		//FSM:
		//	{FSM}
		//	'FSM'
		//	name=EString
		//	'init' state+=InitialState
		//	'final' state+=FinalState ('state' state+=State ("," state+=State)*
		//	|
		//	'tr' transition+=Transition ("," transition+=Transition)*)*;
		@Override public ParserRule getRule() { return rule; }
		
		//{FSM} 'FSM' name=EString 'init' state+=InitialState 'final' state+=FinalState ('state' state+=State ("," state+=State)*
		//| 'tr' transition+=Transition ("," transition+=Transition)*)*
		public Group getGroup() { return cGroup; }
		
		//{FSM}
		public Action getFSMAction_0() { return cFSMAction_0; }
		
		//'FSM'
		public Keyword getFSMKeyword_1() { return cFSMKeyword_1; }
		
		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }
		
		//'init'
		public Keyword getInitKeyword_3() { return cInitKeyword_3; }
		
		//state+=InitialState
		public Assignment getStateAssignment_4() { return cStateAssignment_4; }
		
		//InitialState
		public RuleCall getStateInitialStateParserRuleCall_4_0() { return cStateInitialStateParserRuleCall_4_0; }
		
		//'final'
		public Keyword getFinalKeyword_5() { return cFinalKeyword_5; }
		
		//state+=FinalState
		public Assignment getStateAssignment_6() { return cStateAssignment_6; }
		
		//FinalState
		public RuleCall getStateFinalStateParserRuleCall_6_0() { return cStateFinalStateParserRuleCall_6_0; }
		
		//('state' state+=State ("," state+=State)* | 'tr' transition+=Transition ("," transition+=Transition)*)*
		public Alternatives getAlternatives_7() { return cAlternatives_7; }
		
		//'state' state+=State ("," state+=State)*
		public Group getGroup_7_0() { return cGroup_7_0; }
		
		//'state'
		public Keyword getStateKeyword_7_0_0() { return cStateKeyword_7_0_0; }
		
		//state+=State
		public Assignment getStateAssignment_7_0_1() { return cStateAssignment_7_0_1; }
		
		//State
		public RuleCall getStateStateParserRuleCall_7_0_1_0() { return cStateStateParserRuleCall_7_0_1_0; }
		
		//("," state+=State)*
		public Group getGroup_7_0_2() { return cGroup_7_0_2; }
		
		//","
		public Keyword getCommaKeyword_7_0_2_0() { return cCommaKeyword_7_0_2_0; }
		
		//state+=State
		public Assignment getStateAssignment_7_0_2_1() { return cStateAssignment_7_0_2_1; }
		
		//State
		public RuleCall getStateStateParserRuleCall_7_0_2_1_0() { return cStateStateParserRuleCall_7_0_2_1_0; }
		
		//'tr' transition+=Transition ("," transition+=Transition)*
		public Group getGroup_7_1() { return cGroup_7_1; }
		
		//'tr'
		public Keyword getTrKeyword_7_1_0() { return cTrKeyword_7_1_0; }
		
		//transition+=Transition
		public Assignment getTransitionAssignment_7_1_1() { return cTransitionAssignment_7_1_1; }
		
		//Transition
		public RuleCall getTransitionTransitionParserRuleCall_7_1_1_0() { return cTransitionTransitionParserRuleCall_7_1_1_0; }
		
		//("," transition+=Transition)*
		public Group getGroup_7_1_2() { return cGroup_7_1_2; }
		
		//","
		public Keyword getCommaKeyword_7_1_2_0() { return cCommaKeyword_7_1_2_0; }
		
		//transition+=Transition
		public Assignment getTransitionAssignment_7_1_2_1() { return cTransitionAssignment_7_1_2_1; }
		
		//Transition
		public RuleCall getTransitionTransitionParserRuleCall_7_1_2_1_0() { return cTransitionTransitionParserRuleCall_7_1_2_1_0; }
	}
	public class StateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.ut2j.m1ice.fsm.texteditor.MyFSM.State");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cStateAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//State:
		//	{State} name=EString;
		@Override public ParserRule getRule() { return rule; }
		
		//{State} name=EString
		public Group getGroup() { return cGroup; }
		
		//{State}
		public Action getStateAction_0() { return cStateAction_0; }
		
		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }
	}
	public class TransitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.ut2j.m1ice.fsm.texteditor.MyFSM.Transition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameEStringParserRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Assignment cSourceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cSourceStateCrossReference_1_0 = (CrossReference)cSourceAssignment_1.eContents().get(0);
		private final RuleCall cSourceStateEStringParserRuleCall_1_0_1 = (RuleCall)cSourceStateCrossReference_1_0.eContents().get(1);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTargetAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cTargetStateCrossReference_3_0 = (CrossReference)cTargetAssignment_3.eContents().get(0);
		private final RuleCall cTargetStateEStringParserRuleCall_3_0_1 = (RuleCall)cTargetStateCrossReference_3_0.eContents().get(1);
		
		//Transition:
		//	name=EString
		//	source=[State|EString] '->' target=[State|EString];
		@Override public ParserRule getRule() { return rule; }
		
		//name=EString source=[State|EString] '->' target=[State|EString]
		public Group getGroup() { return cGroup; }
		
		//name=EString
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_0_0() { return cNameEStringParserRuleCall_0_0; }
		
		//source=[State|EString]
		public Assignment getSourceAssignment_1() { return cSourceAssignment_1; }
		
		//[State|EString]
		public CrossReference getSourceStateCrossReference_1_0() { return cSourceStateCrossReference_1_0; }
		
		//EString
		public RuleCall getSourceStateEStringParserRuleCall_1_0_1() { return cSourceStateEStringParserRuleCall_1_0_1; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_2() { return cHyphenMinusGreaterThanSignKeyword_2; }
		
		//target=[State|EString]
		public Assignment getTargetAssignment_3() { return cTargetAssignment_3; }
		
		//[State|EString]
		public CrossReference getTargetStateCrossReference_3_0() { return cTargetStateCrossReference_3_0; }
		
		//EString
		public RuleCall getTargetStateEStringParserRuleCall_3_0_1() { return cTargetStateEStringParserRuleCall_3_0_1; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.ut2j.m1ice.fsm.texteditor.MyFSM.EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString:
		//	STRING | ID;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	public class InitialStateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.ut2j.m1ice.fsm.texteditor.MyFSM.InitialState");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cInitialStateAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//InitialState:
		//	{InitialState} name=EString;
		@Override public ParserRule getRule() { return rule; }
		
		//{InitialState} name=EString
		public Group getGroup() { return cGroup; }
		
		//{InitialState}
		public Action getInitialStateAction_0() { return cInitialStateAction_0; }
		
		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }
	}
	public class FinalStateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.ut2j.m1ice.fsm.texteditor.MyFSM.FinalState");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cFinalStateAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//FinalState:
		//	{FinalState} name=EString;
		@Override public ParserRule getRule() { return rule; }
		
		//{FinalState} name=EString
		public Group getGroup() { return cGroup; }
		
		//{FinalState}
		public Action getFinalStateAction_0() { return cFinalStateAction_0; }
		
		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }
	}
	
	
	private final FSMElements pFSM;
	private final StateElements pState;
	private final TransitionElements pTransition;
	private final EStringElements pEString;
	private final InitialStateElements pInitialState;
	private final FinalStateElements pFinalState;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyFSMGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pFSM = new FSMElements();
		this.pState = new StateElements();
		this.pTransition = new TransitionElements();
		this.pEString = new EStringElements();
		this.pInitialState = new InitialStateElements();
		this.pFinalState = new FinalStateElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("fr.ut2j.m1ice.fsm.texteditor.MyFSM".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//FSM:
	//	{FSM}
	//	'FSM'
	//	name=EString
	//	'init' state+=InitialState
	//	'final' state+=FinalState ('state' state+=State ("," state+=State)*
	//	|
	//	'tr' transition+=Transition ("," transition+=Transition)*)*;
	public FSMElements getFSMAccess() {
		return pFSM;
	}
	
	public ParserRule getFSMRule() {
		return getFSMAccess().getRule();
	}
	
	//State:
	//	{State} name=EString;
	public StateElements getStateAccess() {
		return pState;
	}
	
	public ParserRule getStateRule() {
		return getStateAccess().getRule();
	}
	
	//Transition:
	//	name=EString
	//	source=[State|EString] '->' target=[State|EString];
	public TransitionElements getTransitionAccess() {
		return pTransition;
	}
	
	public ParserRule getTransitionRule() {
		return getTransitionAccess().getRule();
	}
	
	//EString:
	//	STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//InitialState:
	//	{InitialState} name=EString;
	public InitialStateElements getInitialStateAccess() {
		return pInitialState;
	}
	
	public ParserRule getInitialStateRule() {
		return getInitialStateAccess().getRule();
	}
	
	//FinalState:
	//	{FinalState} name=EString;
	public FinalStateElements getFinalStateAccess() {
		return pFinalState;
	}
	
	public ParserRule getFinalStateRule() {
		return getFinalStateAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
