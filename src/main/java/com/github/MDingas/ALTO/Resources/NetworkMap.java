package com.github.MDingas.ALTO.Resources;

import javax.ws.rs.core.MediaType;
import java.net.InetAddress;
import java.net.URL;
import java.util.List;
import java.util.Map;

/**
 * Aggregates a PID value into a list of network addresses
 */
public class NetworkMap extends ALTOResource {

    // Say we want all the addresses aggregated by "PID1"
    // List<InetAddress> aggregatedAddresses = aggregatedAddressesMap.get("PID1");
    private Map<String, List<InetAddress>> aggregatedAddressesMap;

    public NetworkMap(URL url, MediaType mediaType, List<MediaType> acceptTypes, String name, String tag, Map<String, List<InetAddress>> aggregatedAddressesMap) {
        super(url, mediaType, acceptTypes, name, tag);
        this.aggregatedAddressesMap = aggregatedAddressesMap;
    }
}
