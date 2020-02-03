package fsm.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.ut2j.m1ice.fsm.FinalState;
import fsm.aspects.StateAspect;

@Aspect(className = FinalState.class)
@SuppressWarnings("all")
public class FinalStateAspect extends StateAspect {
}
