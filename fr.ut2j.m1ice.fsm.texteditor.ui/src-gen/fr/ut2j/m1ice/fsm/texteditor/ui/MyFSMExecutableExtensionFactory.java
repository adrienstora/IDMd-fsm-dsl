/*
 * generated by Xtext 2.14.0
 */
package fr.ut2j.m1ice.fsm.texteditor.ui;

import com.google.inject.Injector;
import fr.ut2j.m1ice.fsm.texteditor.ui.internal.TexteditorActivator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MyFSMExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(TexteditorActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		TexteditorActivator activator = TexteditorActivator.getInstance();
		return activator != null ? activator.getInjector(TexteditorActivator.FR_UT2J_M1ICE_FSM_TEXTEDITOR_MYFSM) : null;
	}

}
