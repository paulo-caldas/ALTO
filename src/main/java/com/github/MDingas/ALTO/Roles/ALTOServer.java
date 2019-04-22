package com.github.MDingas.ALTO.Roles;

import com.github.MDingas.ALTO.Costs.CostInfo;
import com.github.MDingas.ALTO.Resources.ALTOResource;
import com.github.MDingas.ALTO.Resources.GenericMulticostMap;
import com.github.MDingas.ALTO.Resources.NetworkMap;
import org.json.JSONObject;

import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Encapsulation of all the business logic that can be done by an ALTO Server
 */
public class ALTOServer {

    private URL domainName; // URL from which to access the ALTO Server
    private URL databaseName; // URL from which to access the database
    private Map<String, ALTOResource> resourceMap; // Maps resource name to a concrete resource

    public ALTOServer(URL domainName, URL databaseName) {
        this.domainName = domainName;
        this.databaseName = databaseName;
        this.resourceMap = new HashMap<>();
    }

    public URL getDomainName() {
        return domainName;
    }

    /**
     * Query central database and load ALTO Resources to main memory
     */
    private void importData() {

    }

    public NetworkMap getNetworkMap(
            URI uri,
            List<String> pidFilter) {

        return null;
    }

    public GenericMulticostMap getMulticostMap(
            URI uri,
            List<CostInfo> costFilter,
            List<String> srcPIDFilter,
            List<String> dstPIDFilter) {

        return null;
    }
}
