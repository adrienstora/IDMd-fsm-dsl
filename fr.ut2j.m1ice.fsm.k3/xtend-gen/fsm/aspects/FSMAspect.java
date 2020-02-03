package fsm.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.ut2j.m1ice.fsm.FSM;
import fr.ut2j.m1ice.fsm.FinalState;
import fr.ut2j.m1ice.fsm.InitialState;
import fr.ut2j.m1ice.fsm.State;
import fr.ut2j.m1ice.fsm.Transition;
import fsm.aspects.FSMAspectFSMAspectProperties;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = FSM.class)
@SuppressWarnings("all")
public class FSMAspect {
  public static void execute(final FSM _self) {
    final fsm.aspects.FSMAspectFSMAspectProperties _self_ = fsm.aspects.FSMAspectFSMAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void execute()
    if (_self instanceof fr.ut2j.m1ice.fsm.FSM){
    	fsm.aspects.FSMAspect._privk3_execute(_self_, (fr.ut2j.m1ice.fsm.FSM)_self);
    };
  }
  
  private static State curState(final FSM _self) {
    final fsm.aspects.FSMAspectFSMAspectProperties _self_ = fsm.aspects.FSMAspectFSMAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# State curState()
    if (_self instanceof fr.ut2j.m1ice.fsm.FSM){
    	result = fsm.aspects.FSMAspect._privk3_curState(_self_, (fr.ut2j.m1ice.fsm.FSM)_self);
    };
    return (fr.ut2j.m1ice.fsm.State)result;
  }
  
  private static void curState(final FSM _self, final State curState) {
    final fsm.aspects.FSMAspectFSMAspectProperties _self_ = fsm.aspects.FSMAspectFSMAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void curState(State)
    if (_self instanceof fr.ut2j.m1ice.fsm.FSM){
    	fsm.aspects.FSMAspect._privk3_curState(_self_, (fr.ut2j.m1ice.fsm.FSM)_self,curState);
    };
  }
  
  private static State finalState(final FSM _self) {
    final fsm.aspects.FSMAspectFSMAspectProperties _self_ = fsm.aspects.FSMAspectFSMAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# State finalState()
    if (_self instanceof fr.ut2j.m1ice.fsm.FSM){
    	result = fsm.aspects.FSMAspect._privk3_finalState(_self_, (fr.ut2j.m1ice.fsm.FSM)_self);
    };
    return (fr.ut2j.m1ice.fsm.State)result;
  }
  
  private static void finalState(final FSM _self, final State finalState) {
    final fsm.aspects.FSMAspectFSMAspectProperties _self_ = fsm.aspects.FSMAspectFSMAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void finalState(State)
    if (_self instanceof fr.ut2j.m1ice.fsm.FSM){
    	fsm.aspects.FSMAspect._privk3_finalState(_self_, (fr.ut2j.m1ice.fsm.FSM)_self,finalState);
    };
  }
  
  protected static void _privk3_execute(final FSMAspectFSMAspectProperties _self_, final FSM _self) {
    EList<State> _state = _self.getState();
    for (final State state : _state) {
      {
        if ((state instanceof InitialState)) {
          FSMAspect.curState(_self, state);
        }
        if ((state instanceof FinalState)) {
          FSMAspect.finalState(_self, state);
        }
      }
    }
    String _name = FSMAspect.curState(_self).getName();
    String _plus = ("Initial state : " + _name);
    String _plus_1 = (_plus + " - Final state : ");
    String _name_1 = FSMAspect.finalState(_self).getName();
    String _plus_2 = (_plus_1 + _name_1);
    InputOutput.<String>println(_plus_2);
    EList<Transition> _transition = _self.getTransition();
    for (final Transition transition : _transition) {
      boolean _equals = FSMAspect.curState(_self).getName().equals(FSMAspect.finalState(_self).getName());
      boolean _not = (!_equals);
      if (_not) {
        boolean _equals_1 = FSMAspect.curState(_self).getName().equals(transition.getSource().getName());
        if (_equals_1) {
          String _name_2 = FSMAspect.curState(_self).getName();
          String _plus_3 = ("Transition from " + _name_2);
          String _plus_4 = (_plus_3 + " to ");
          String _name_3 = transition.getTarget().getName();
          String _plus_5 = (_plus_4 + _name_3);
          String _plus_6 = (_plus_5 + "...");
          InputOutput.<String>println(_plus_6);
          FSMAspect.curState(_self, transition.getTarget());
        }
      }
    }
    String _name_4 = FSMAspect.curState(_self).getName();
    String _plus_7 = ("Final state achieved : " + _name_4);
    InputOutput.<String>println(_plus_7);
  }
  
  protected static State _privk3_curState(final FSMAspectFSMAspectProperties _self_, final FSM _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurState") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (fr.ut2j.m1ice.fsm.State) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.curState;
  }
  
  protected static void _privk3_curState(final FSMAspectFSMAspectProperties _self_, final FSM _self, final State curState) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setCurState")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, curState);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.curState = curState;
    }
  }
  
  protected static State _privk3_finalState(final FSMAspectFSMAspectProperties _self_, final FSM _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getFinalState") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (fr.ut2j.m1ice.fsm.State) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.finalState;
  }
  
  protected static void _privk3_finalState(final FSMAspectFSMAspectProperties _self_, final FSM _self, final State finalState) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setFinalState")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, finalState);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.finalState = finalState;
    }
  }
}
