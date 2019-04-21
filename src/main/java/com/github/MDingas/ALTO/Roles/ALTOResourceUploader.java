package com.github.MDingas.ALTO.Roles;

import com.github.MDingas.ALTO.Costs.Cost;
import com.github.MDingas.ALTO.Resources.ALTOResource;
import org.apache.commons.lang3.tuple.Pair;

import java.net.InetAddress;
import java.net.URL;
import java.util.List;
import java.util.Map;

/**
 * Encapsulation of all the operations that can be done by a third party, to upload information
 */
public class ALTOResourceUploader {

    private URL currentALTOServerURL; // ALTO Server URL from which to upload

    public ALTOResourceUploader(URL currentALTOServerURL) {
        this.currentALTOServerURL = currentALTOServerURL;
    }

    public void uploadNetworkMap(String resourceName, Map<String, List<InetAddress>> networkMap) {
        // TODO

    }

    public void uploadCostMap(String resourceName, Map<Pair<String, String>, Map<String, Cost>> costMap) {
        // TODO
    }
}
