package org.peimari.gleaflet.client;

import org.peimari.gleaflet.client.resources.LeafletRoutingMachineResourceIncjector;

import com.google.gwt.core.client.JavaScriptObject;

public class RoutingPlanOptions extends JavaScriptObject {
  
  static {
    LeafletRoutingMachineResourceIncjector.ensureInjected();
  }
  
  protected RoutingPlanOptions() {}

  public static native RoutingPlanOptions create() 
  /*-{
    return {};
  }-*/;

  public native final void setAddWaypoints(boolean addWaypoints) 
  /*-{
    this.addWaypoints = addWaypoints;
  }-*/;
  
  public native final void setDraggableWaypoints(boolean draggableWaypoints) 
  /*-{
    this.draggableWaypoints = draggableWaypoints;
  }-*/;
  
  public native final void setDragStyles(PathOptions dragStyles) 
  /*-{
    this.dragStyles = dragStyles;
  }-*/;
  
  public native final void setRouteWhileDragging(boolean routeWhileDragging) 
  /*-{
    this.routeWhileDragging = routeWhileDragging;
  }-*/;
}
