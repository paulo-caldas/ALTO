package com.github.MDingas.ALTO.Resources;

import com.github.MDingas.ALTO.Costs.Cost;
import org.apache.commons.lang3.tuple.Pair;

import javax.ws.rs.core.MediaType;
import java.net.URL;
import java.util.List;
import java.util.Map;

/**
 * Attributes one of more costs to a link,
 * where a link is defined between two strings.
 * If the strings are PIDs, its a cost map, if they
 * are network addresses, its an endpoint cost map
 */
public class GenericMulticostMap extends ALTOResource {

    // Say we want the routing-cost between PID0 and PID1:
    // Cost c = multicostMapMap.get(new Pair("PID0", "PID1")).get("routing-cost");
    Map<Pair<String, String>, Map<String, Cost>> multicostMapMap;

    public GenericMulticostMap(URL url, MediaType mediaType, List<MediaType> acceptTypes, String name, String tag, Map<Pair<String, String>, Map<String, Cost>> genericMulticostMap) {
        super(url, mediaType, acceptTypes, name, tag);
        this.multicostMapMap = genericMulticostMap;
    }
}
