package com.github.MDingas.ALTO.Roles;

import com.github.MDingas.ALTO.Resources.GenericMulticostMap;
import com.github.MDingas.ALTO.Resources.NetworkMap;

import java.net.URL;

/**
 * Encapsulation of all the operations that can be done by a third party, to upload information
 */
public class ALTOResourceUploader {

    private URL currentALTOServerURL; // ALTO Server URL from which to upload

    public ALTOResourceUploader() {
    }

    public void connect() {

    }

    public void uploadNetworkMap(NetworkMap networkMap) {
        // TODO

    }

    public void uploadCostMap(GenericMulticostMap genericMulticostMap) {
        // TODO
    }
}
