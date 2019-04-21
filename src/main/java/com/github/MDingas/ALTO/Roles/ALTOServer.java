package com.github.MDingas.ALTO.Roles;

import com.github.MDingas.ALTO.Resources.ALTOResource;
import org.json.JSONObject;

import java.net.URL;
import java.util.HashMap;
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

    /**
     * No parameters given, thus only use this method when a GET request is used (RFC 7285)
     * @param url path to the resource
     * @return requested resource
     */
    public ALTOResource getALTOResource(URL url) {

        return null;
    }

    /**
     * Parameters are given, thus use this method only when a POST request is used (RFC 7285)
     * @param url path to the resource
     * @param params additional parameters to filter requests, as per
     * @return
     */
    public ALTOResource getALTOResource(URL url, JSONObject params) {

        return null;
    }

}
