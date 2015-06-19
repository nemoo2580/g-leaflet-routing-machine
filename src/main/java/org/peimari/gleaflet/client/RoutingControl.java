package org.peimari.gleaflet.client;

import com.google.gwt.core.client.JavaScriptObject;

public class RoutingControl extends JavaScriptObject implements ILayer {
  
  protected RoutingControl() {}
  
  public static native RoutingControl create(RoutingControlOptions options) 
  /*-{
    return new $wnd.L.Routing.control(options);
  }-*/;
}
