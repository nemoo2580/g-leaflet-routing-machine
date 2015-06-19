package org.peimari.gleaflet.client;

import org.peimari.gleaflet.client.resources.LeafletRoutingMachineResourceIncjector;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

public class RoutingControlOptions extends JavaScriptObject {
  
  static {
    LeafletRoutingMachineResourceIncjector.ensureInjected();
  }
  
  protected RoutingControlOptions() {}

  public static native RoutingControlOptions create() 
  /*-{
    return {};
  }-*/;

  public native final void setWaypoints(JsArray<LatLng> waypoints) 
  /*-{
    this.waypoints = waypoints;
  }-*/;
  
  public native final void setPlan(RoutingPlan plan) 
  /*-{
    this.plan = plan;
  }-*/;
  
  public native final void setFitSelectedRoutes(boolean fitSelectedRoutes) 
  /*-{
    this.fitSelectedRoutes = fitSelectedRoutes;
  }-*/;
  
  public native final void setAutoRoute(boolean autoRoute) 
  /*-{
    this.autoRoute = autoRoute;
  }-*/;
  
  public native final void setRouteWhileDragging(boolean routeWhileDragging) 
  /*-{
    this.routeWhileDragging = routeWhileDragging;
  }-*/;
  
  public native final void setRouteDragInterval(int routeDragInterval) 
  /*-{
    this.routeDragInterval = routeDragInterval;
  }-*/;
  
  public native final void setWaypointMode(String waypointMode) 
  /*-{
    this.routeDragInterval = routeDragInterval;
  }-*/;
  
  public native final void setUseZoomParameter(Boolean useZoomParameter) 
  /*-{
    this.useZoomParameter = useZoomParameter;
  }-*/;
}
