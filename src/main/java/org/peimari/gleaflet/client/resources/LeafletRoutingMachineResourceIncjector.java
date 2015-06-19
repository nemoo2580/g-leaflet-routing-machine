package org.peimari.gleaflet.client.resources;

import org.peimari.gleaflet.client.resources.LeafletResourceInjector;

import com.google.gwt.core.client.GWT;

public class LeafletRoutingMachineResourceIncjector {
  
  protected static LeafletRoutingMachineClientBundle bundle;

  public static void ensureInjected() {
    if (bundle == null) {
      LeafletResourceInjector.ensureInjected();
      bundle = GWT.create(LeafletRoutingMachineClientBundle.class);
      LeafletRoutingMachineResourceIncjector injector = GWT
          .create(LeafletRoutingMachineResourceIncjector.class);
      injector.injectResources();
    }
  }
  
  /**
   * Override this with deferred binding to customize injected stuff
   */
  protected void injectResources() {
    bundle.routingMachineCss().ensureInjected();
    injectScript(bundle.routingMachineScript().getText());
  }

  private static native void injectScript(String script)
  /*-{
      $wnd.eval(script);
  }-*/;
}
