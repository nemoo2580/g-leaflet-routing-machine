package org.peimari.gleaflet.client.resources;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.DataResource.DoNotEmbed;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.TextResource;

public interface LeafletRoutingMachineClientBundle extends ClientBundle {

    @Source("leaflet-routing-machine-2.3.0.min.js")
    @DoNotEmbed
    TextResource routingMachineScript();
    
    @Source("images/leaflet.routing.icons-2.3.0.png")
    ImageResource leaflet_routing_icons();
    
    @Source("images/routing-icon-2.3.0.png")
    ImageResource routing_icon();
    
    @Source("leaflet-routing-machine-2.3.0.css")
    @CssResource.NotStrict
    CssResource routingMachineCss();
}
