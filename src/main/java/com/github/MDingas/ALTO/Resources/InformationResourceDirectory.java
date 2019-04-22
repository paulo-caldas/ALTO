package com.github.MDingas.ALTO.Resources;

import com.github.MDingas.ALTO.Costs.CostInfo;

import javax.ws.rs.core.MediaType;
import java.net.URI;
import java.util.List;
import java.util.Map;

/**
 * Class that the ALTO Server shares to the clients to serve as an index
 * to the available content it posesses
 */
public class InformationResourceDirectory extends ALTOResource {

    private Map<String, ALTOResource> resourceMetaInfoMap; // Contains meta information of all the resources the server knows of
    private Map<String, CostInfo>  costInfoMap; // Contains meta information of all the costs the server knows of

    public InformationResourceDirectory(URI uri, MediaType mediaType, List<MediaType> acceptTypes, String name, String tag, Map<String, ALTOResource> resourceMetaInfoMap, Map<String, CostInfo> costInfoMap) {
        super(uri, mediaType, acceptTypes, name, tag);
        this.resourceMetaInfoMap = resourceMetaInfoMap;
        this.costInfoMap = costInfoMap;
    }
}
