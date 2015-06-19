package org.peimari.gleaflet.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

public class RoutingPlan extends JavaScriptObject implements ILayer {
  
  protected RoutingPlan() {}
  
  public static native RoutingPlan create(JsArray<LatLng> waypoints, RoutingPlanOptions options) 
  /*-{
    return new $wnd.L.Routing.plan(waypoints, options);
  }-*/;
}
