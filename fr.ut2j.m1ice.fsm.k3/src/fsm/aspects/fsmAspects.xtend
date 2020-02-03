package fsm.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.ut2j.m1ice.fsm.FSM
import fr.ut2j.m1ice.fsm.State
import fr.ut2j.m1ice.fsm.Transition
import fr.ut2j.m1ice.fsm.InitialState
import fr.ut2j.m1ice.fsm.FinalState

import static extension fsm.aspects.FSMAspect.*
import static extension fsm.aspects.StateAspect.*
import static extension fsm.aspects.TransitionAspect.*
import static extension fsm.aspects.InitialStateAspect.*
import static extension fsm.aspects.FinalStateAspect.*

import fr.ut2j.m1ice.fsm.FsmPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI

class Interpreter {
	def static void main(String[] args) {
		FsmPackage.eINSTANCE.class
		Resource$Factory.Registry.INSTANCE.extensionToFactoryMap.put("xmi", new XMIResourceFactoryImpl);
		var Resource resource = new ResourceSetImpl().getResource(URI.createURI('/Users/adrienstora/Documents/ICE/M1/S1/Ingénierie des Modèles/Gemoc/fr.ut2j.m1ice.fsm/model/FSM.xmi'), true)
		var myFSM = resource.contents.get(0) as FSM
		myFSM.execute
	}
}

@Aspect(className=FSM)
class FSMAspect {
	var State curState;
	var State finalState;
	def void execute() {
		for (State state : _self.state) {
			if (state instanceof InitialState) {
				_self.curState = state
			}
			if (state instanceof FinalState) {
				_self.finalState = state
			}
		}
		println("Initial state : " + _self.curState.name + " - Final state : " + _self.finalState.name)
		for (Transition transition : _self.transition) {
			if (!(_self.curState.name.equals(_self.finalState.name))) {
				if (_self.curState.name.equals(transition.source.name)) {
					println("Transition from " + _self.curState.name + " to " + transition.target.name + "...")
					_self.curState = transition.target
				}
			}
		}
		println("Final state achieved : " + _self.curState.name)
	}
}

@Aspect(className=State)
class StateAspect {

}

@Aspect(className=Transition)
class TransitionAspect {

}

@Aspect(className=InitialState)
class InitialStateAspect extends StateAspect {

}

@Aspect(className=FinalState)
class FinalStateAspect extends StateAspect {

}



