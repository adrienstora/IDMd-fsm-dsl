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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyFSMParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'FSM'", "'init'", "'final'", "'state'", "','", "'tr'", "'->'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMyFSMParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyFSMParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyFSMParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyFSM.g"; }



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




    // $ANTLR start "entryRuleFSM"
    // InternalMyFSM.g:64:1: entryRuleFSM returns [EObject current=null] : iv_ruleFSM= ruleFSM EOF ;
    public final EObject entryRuleFSM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFSM = null;


        try {
            // InternalMyFSM.g:64:44: (iv_ruleFSM= ruleFSM EOF )
            // InternalMyFSM.g:65:2: iv_ruleFSM= ruleFSM EOF
            {
             newCompositeNode(grammarAccess.getFSMRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFSM=ruleFSM();

            state._fsp--;

             current =iv_ruleFSM; 
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
    // $ANTLR end "entryRuleFSM"


    // $ANTLR start "ruleFSM"
    // InternalMyFSM.g:71:1: ruleFSM returns [EObject current=null] : ( () otherlv_1= 'FSM' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'init' ( (lv_state_4_0= ruleInitialState ) ) otherlv_5= 'final' ( (lv_state_6_0= ruleFinalState ) ) ( (otherlv_7= 'state' ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )* ) | (otherlv_11= 'tr' ( (lv_transition_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transition_14_0= ruleTransition ) ) )* ) )* ) ;
    public final EObject ruleFSM() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_state_4_0 = null;

        EObject lv_state_6_0 = null;

        EObject lv_state_8_0 = null;

        EObject lv_state_10_0 = null;

        EObject lv_transition_12_0 = null;

        EObject lv_transition_14_0 = null;



        	enterRule();

        try {
            // InternalMyFSM.g:77:2: ( ( () otherlv_1= 'FSM' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'init' ( (lv_state_4_0= ruleInitialState ) ) otherlv_5= 'final' ( (lv_state_6_0= ruleFinalState ) ) ( (otherlv_7= 'state' ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )* ) | (otherlv_11= 'tr' ( (lv_transition_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transition_14_0= ruleTransition ) ) )* ) )* ) )
            // InternalMyFSM.g:78:2: ( () otherlv_1= 'FSM' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'init' ( (lv_state_4_0= ruleInitialState ) ) otherlv_5= 'final' ( (lv_state_6_0= ruleFinalState ) ) ( (otherlv_7= 'state' ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )* ) | (otherlv_11= 'tr' ( (lv_transition_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transition_14_0= ruleTransition ) ) )* ) )* )
            {
            // InternalMyFSM.g:78:2: ( () otherlv_1= 'FSM' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'init' ( (lv_state_4_0= ruleInitialState ) ) otherlv_5= 'final' ( (lv_state_6_0= ruleFinalState ) ) ( (otherlv_7= 'state' ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )* ) | (otherlv_11= 'tr' ( (lv_transition_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transition_14_0= ruleTransition ) ) )* ) )* )
            // InternalMyFSM.g:79:3: () otherlv_1= 'FSM' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'init' ( (lv_state_4_0= ruleInitialState ) ) otherlv_5= 'final' ( (lv_state_6_0= ruleFinalState ) ) ( (otherlv_7= 'state' ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )* ) | (otherlv_11= 'tr' ( (lv_transition_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transition_14_0= ruleTransition ) ) )* ) )*
            {
            // InternalMyFSM.g:79:3: ()
            // InternalMyFSM.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFSMAccess().getFSMAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFSMAccess().getFSMKeyword_1());
            		
            // InternalMyFSM.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyFSM.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyFSM.g:91:4: (lv_name_2_0= ruleEString )
            // InternalMyFSM.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFSMAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFSMRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.ut2j.m1ice.fsm.texteditor.MyFSM.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getFSMAccess().getInitKeyword_3());
            		
            // InternalMyFSM.g:113:3: ( (lv_state_4_0= ruleInitialState ) )
            // InternalMyFSM.g:114:4: (lv_state_4_0= ruleInitialState )
            {
            // InternalMyFSM.g:114:4: (lv_state_4_0= ruleInitialState )
            // InternalMyFSM.g:115:5: lv_state_4_0= ruleInitialState
            {

            					newCompositeNode(grammarAccess.getFSMAccess().getStateInitialStateParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_5);
            lv_state_4_0=ruleInitialState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFSMRule());
            					}
            					add(
            						current,
            						"state",
            						lv_state_4_0,
            						"fr.ut2j.m1ice.fsm.texteditor.MyFSM.InitialState");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getFSMAccess().getFinalKeyword_5());
            		
            // InternalMyFSM.g:136:3: ( (lv_state_6_0= ruleFinalState ) )
            // InternalMyFSM.g:137:4: (lv_state_6_0= ruleFinalState )
            {
            // InternalMyFSM.g:137:4: (lv_state_6_0= ruleFinalState )
            // InternalMyFSM.g:138:5: lv_state_6_0= ruleFinalState
            {

            					newCompositeNode(grammarAccess.getFSMAccess().getStateFinalStateParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_6);
            lv_state_6_0=ruleFinalState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFSMRule());
            					}
            					add(
            						current,
            						"state",
            						lv_state_6_0,
            						"fr.ut2j.m1ice.fsm.texteditor.MyFSM.FinalState");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyFSM.g:155:3: ( (otherlv_7= 'state' ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )* ) | (otherlv_11= 'tr' ( (lv_transition_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transition_14_0= ruleTransition ) ) )* ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }
                else if ( (LA3_0==16) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyFSM.g:156:4: (otherlv_7= 'state' ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )* )
            	    {
            	    // InternalMyFSM.g:156:4: (otherlv_7= 'state' ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )* )
            	    // InternalMyFSM.g:157:5: otherlv_7= 'state' ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )*
            	    {
            	    otherlv_7=(Token)match(input,14,FOLLOW_3); 

            	    					newLeafNode(otherlv_7, grammarAccess.getFSMAccess().getStateKeyword_7_0_0());
            	    				
            	    // InternalMyFSM.g:161:5: ( (lv_state_8_0= ruleState ) )
            	    // InternalMyFSM.g:162:6: (lv_state_8_0= ruleState )
            	    {
            	    // InternalMyFSM.g:162:6: (lv_state_8_0= ruleState )
            	    // InternalMyFSM.g:163:7: lv_state_8_0= ruleState
            	    {

            	    							newCompositeNode(grammarAccess.getFSMAccess().getStateStateParserRuleCall_7_0_1_0());
            	    						
            	    pushFollow(FOLLOW_7);
            	    lv_state_8_0=ruleState();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getFSMRule());
            	    							}
            	    							add(
            	    								current,
            	    								"state",
            	    								lv_state_8_0,
            	    								"fr.ut2j.m1ice.fsm.texteditor.MyFSM.State");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    // InternalMyFSM.g:180:5: (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )*
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==15) ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // InternalMyFSM.g:181:6: otherlv_9= ',' ( (lv_state_10_0= ruleState ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,15,FOLLOW_3); 

            	    	    						newLeafNode(otherlv_9, grammarAccess.getFSMAccess().getCommaKeyword_7_0_2_0());
            	    	    					
            	    	    // InternalMyFSM.g:185:6: ( (lv_state_10_0= ruleState ) )
            	    	    // InternalMyFSM.g:186:7: (lv_state_10_0= ruleState )
            	    	    {
            	    	    // InternalMyFSM.g:186:7: (lv_state_10_0= ruleState )
            	    	    // InternalMyFSM.g:187:8: lv_state_10_0= ruleState
            	    	    {

            	    	    								newCompositeNode(grammarAccess.getFSMAccess().getStateStateParserRuleCall_7_0_2_1_0());
            	    	    							
            	    	    pushFollow(FOLLOW_7);
            	    	    lv_state_10_0=ruleState();

            	    	    state._fsp--;


            	    	    								if (current==null) {
            	    	    									current = createModelElementForParent(grammarAccess.getFSMRule());
            	    	    								}
            	    	    								add(
            	    	    									current,
            	    	    									"state",
            	    	    									lv_state_10_0,
            	    	    									"fr.ut2j.m1ice.fsm.texteditor.MyFSM.State");
            	    	    								afterParserOrEnumRuleCall();
            	    	    							

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop1;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyFSM.g:207:4: (otherlv_11= 'tr' ( (lv_transition_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transition_14_0= ruleTransition ) ) )* )
            	    {
            	    // InternalMyFSM.g:207:4: (otherlv_11= 'tr' ( (lv_transition_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transition_14_0= ruleTransition ) ) )* )
            	    // InternalMyFSM.g:208:5: otherlv_11= 'tr' ( (lv_transition_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transition_14_0= ruleTransition ) ) )*
            	    {
            	    otherlv_11=(Token)match(input,16,FOLLOW_3); 

            	    					newLeafNode(otherlv_11, grammarAccess.getFSMAccess().getTrKeyword_7_1_0());
            	    				
            	    // InternalMyFSM.g:212:5: ( (lv_transition_12_0= ruleTransition ) )
            	    // InternalMyFSM.g:213:6: (lv_transition_12_0= ruleTransition )
            	    {
            	    // InternalMyFSM.g:213:6: (lv_transition_12_0= ruleTransition )
            	    // InternalMyFSM.g:214:7: lv_transition_12_0= ruleTransition
            	    {

            	    							newCompositeNode(grammarAccess.getFSMAccess().getTransitionTransitionParserRuleCall_7_1_1_0());
            	    						
            	    pushFollow(FOLLOW_7);
            	    lv_transition_12_0=ruleTransition();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getFSMRule());
            	    							}
            	    							add(
            	    								current,
            	    								"transition",
            	    								lv_transition_12_0,
            	    								"fr.ut2j.m1ice.fsm.texteditor.MyFSM.Transition");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    // InternalMyFSM.g:231:5: (otherlv_13= ',' ( (lv_transition_14_0= ruleTransition ) ) )*
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==15) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalMyFSM.g:232:6: otherlv_13= ',' ( (lv_transition_14_0= ruleTransition ) )
            	    	    {
            	    	    otherlv_13=(Token)match(input,15,FOLLOW_3); 

            	    	    						newLeafNode(otherlv_13, grammarAccess.getFSMAccess().getCommaKeyword_7_1_2_0());
            	    	    					
            	    	    // InternalMyFSM.g:236:6: ( (lv_transition_14_0= ruleTransition ) )
            	    	    // InternalMyFSM.g:237:7: (lv_transition_14_0= ruleTransition )
            	    	    {
            	    	    // InternalMyFSM.g:237:7: (lv_transition_14_0= ruleTransition )
            	    	    // InternalMyFSM.g:238:8: lv_transition_14_0= ruleTransition
            	    	    {

            	    	    								newCompositeNode(grammarAccess.getFSMAccess().getTransitionTransitionParserRuleCall_7_1_2_1_0());
            	    	    							
            	    	    pushFollow(FOLLOW_7);
            	    	    lv_transition_14_0=ruleTransition();

            	    	    state._fsp--;


            	    	    								if (current==null) {
            	    	    									current = createModelElementForParent(grammarAccess.getFSMRule());
            	    	    								}
            	    	    								add(
            	    	    									current,
            	    	    									"transition",
            	    	    									lv_transition_14_0,
            	    	    									"fr.ut2j.m1ice.fsm.texteditor.MyFSM.Transition");
            	    	    								afterParserOrEnumRuleCall();
            	    	    							

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop2;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


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
    // $ANTLR end "ruleFSM"


    // $ANTLR start "entryRuleState"
    // InternalMyFSM.g:262:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalMyFSM.g:262:46: (iv_ruleState= ruleState EOF )
            // InternalMyFSM.g:263:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalMyFSM.g:269:1: ruleState returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMyFSM.g:275:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalMyFSM.g:276:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalMyFSM.g:276:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalMyFSM.g:277:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalMyFSM.g:277:3: ()
            // InternalMyFSM.g:278:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStateAccess().getStateAction_0(),
            					current);
            			

            }

            // InternalMyFSM.g:284:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyFSM.g:285:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyFSM.g:285:4: (lv_name_1_0= ruleEString )
            // InternalMyFSM.g:286:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.ut2j.m1ice.fsm.texteditor.MyFSM.EString");
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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // InternalMyFSM.g:307:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalMyFSM.g:307:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalMyFSM.g:308:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalMyFSM.g:314:1: ruleTransition returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_2= '->' ( ( ruleEString ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalMyFSM.g:320:2: ( ( ( (lv_name_0_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_2= '->' ( ( ruleEString ) ) ) )
            // InternalMyFSM.g:321:2: ( ( (lv_name_0_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_2= '->' ( ( ruleEString ) ) )
            {
            // InternalMyFSM.g:321:2: ( ( (lv_name_0_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_2= '->' ( ( ruleEString ) ) )
            // InternalMyFSM.g:322:3: ( (lv_name_0_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_2= '->' ( ( ruleEString ) )
            {
            // InternalMyFSM.g:322:3: ( (lv_name_0_0= ruleEString ) )
            // InternalMyFSM.g:323:4: (lv_name_0_0= ruleEString )
            {
            // InternalMyFSM.g:323:4: (lv_name_0_0= ruleEString )
            // InternalMyFSM.g:324:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"fr.ut2j.m1ice.fsm.texteditor.MyFSM.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyFSM.g:341:3: ( ( ruleEString ) )
            // InternalMyFSM.g:342:4: ( ruleEString )
            {
            // InternalMyFSM.g:342:4: ( ruleEString )
            // InternalMyFSM.g:343:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getSourceStateCrossReference_1_0());
            				
            pushFollow(FOLLOW_8);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalMyFSM.g:361:3: ( ( ruleEString ) )
            // InternalMyFSM.g:362:4: ( ruleEString )
            {
            // InternalMyFSM.g:362:4: ( ruleEString )
            // InternalMyFSM.g:363:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getTargetStateCrossReference_3_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleEString"
    // InternalMyFSM.g:381:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyFSM.g:381:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyFSM.g:382:2: iv_ruleEString= ruleEString EOF
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
    // InternalMyFSM.g:388:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyFSM.g:394:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyFSM.g:395:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyFSM.g:395:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyFSM.g:396:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyFSM.g:404:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleInitialState"
    // InternalMyFSM.g:415:1: entryRuleInitialState returns [EObject current=null] : iv_ruleInitialState= ruleInitialState EOF ;
    public final EObject entryRuleInitialState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialState = null;


        try {
            // InternalMyFSM.g:415:53: (iv_ruleInitialState= ruleInitialState EOF )
            // InternalMyFSM.g:416:2: iv_ruleInitialState= ruleInitialState EOF
            {
             newCompositeNode(grammarAccess.getInitialStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitialState=ruleInitialState();

            state._fsp--;

             current =iv_ruleInitialState; 
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
    // $ANTLR end "entryRuleInitialState"


    // $ANTLR start "ruleInitialState"
    // InternalMyFSM.g:422:1: ruleInitialState returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleInitialState() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMyFSM.g:428:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalMyFSM.g:429:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalMyFSM.g:429:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalMyFSM.g:430:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalMyFSM.g:430:3: ()
            // InternalMyFSM.g:431:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInitialStateAccess().getInitialStateAction_0(),
            					current);
            			

            }

            // InternalMyFSM.g:437:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyFSM.g:438:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyFSM.g:438:4: (lv_name_1_0= ruleEString )
            // InternalMyFSM.g:439:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInitialStateAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitialStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.ut2j.m1ice.fsm.texteditor.MyFSM.EString");
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
    // $ANTLR end "ruleInitialState"


    // $ANTLR start "entryRuleFinalState"
    // InternalMyFSM.g:460:1: entryRuleFinalState returns [EObject current=null] : iv_ruleFinalState= ruleFinalState EOF ;
    public final EObject entryRuleFinalState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFinalState = null;


        try {
            // InternalMyFSM.g:460:51: (iv_ruleFinalState= ruleFinalState EOF )
            // InternalMyFSM.g:461:2: iv_ruleFinalState= ruleFinalState EOF
            {
             newCompositeNode(grammarAccess.getFinalStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFinalState=ruleFinalState();

            state._fsp--;

             current =iv_ruleFinalState; 
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
    // $ANTLR end "entryRuleFinalState"


    // $ANTLR start "ruleFinalState"
    // InternalMyFSM.g:467:1: ruleFinalState returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleFinalState() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMyFSM.g:473:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalMyFSM.g:474:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalMyFSM.g:474:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalMyFSM.g:475:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalMyFSM.g:475:3: ()
            // InternalMyFSM.g:476:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFinalStateAccess().getFinalStateAction_0(),
            					current);
            			

            }

            // InternalMyFSM.g:482:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyFSM.g:483:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyFSM.g:483:4: (lv_name_1_0= ruleEString )
            // InternalMyFSM.g:484:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFinalStateAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFinalStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.ut2j.m1ice.fsm.texteditor.MyFSM.EString");
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
    // $ANTLR end "ruleFinalState"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000014002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000001C002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});

}