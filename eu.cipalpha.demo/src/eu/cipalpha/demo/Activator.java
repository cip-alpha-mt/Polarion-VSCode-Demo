package eu.cipalpha.demo;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.polarion.alm.tracker.ITrackerService;

public class Activator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	@Override
	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("eu.cipalpha.demo was started!");
		System.out.println(ITrackerService.class.getCanonicalName());
		Activator.context = bundleContext;
	}

	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
	}

}
