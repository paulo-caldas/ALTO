package com.github.MDingas.ALTO.Roles;

import com.github.MDingas.ALTO.Resources.ALTOResource;
import org.json.JSONObject;

import java.net.URI;
import java.net.URL;

/**
 * Encapsulation of all the operations that can be done by an ALTO Client
 */
public class ALTOClient {

    private URL currentALTOServerURL; // ALTO Server URL from which to make queries

    public ALTOClient (URL currentALTOServerURL) {
        this.currentALTOServerURL = currentALTOServerURL;
    }

    public ALTOResource getALTOResource(URI uri) {
        // TODO

        return null;
    }

    public ALTOResource getALTOResource(URI uri, JSONObject params) {
        // TODO

        return null;
    }
}
