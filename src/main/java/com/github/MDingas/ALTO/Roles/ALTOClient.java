package com.github.MDingas.ALTO.Roles;

import com.github.MDingas.ALTO.Costs.CostInfo;
import com.github.MDingas.ALTO.Resources.ALTOResource;
import com.github.MDingas.ALTO.Resources.GenericMulticostMap;
import com.github.MDingas.ALTO.Resources.NetworkMap;

import java.net.URI;
import java.net.URL;
import java.rmi.NoSuchObjectException;
import java.util.List;

/**
 * Encapsulation of all the operations that can be done by an ALTO Client
 */
public class ALTOClient {

    private URL currentALTOServerURL; // ALTO Server URL from which to make queries

    public ALTOClient () {
    }

    public void connect(URL url) {
        // TODO
    }

    private ALTOResource getFilteredAltoResource(
            URI uri,
            List<String> pids,
            List<CostInfo> costs,
            List<String> srcPids,
            List<String> dstPids) {

        // TODO create packet, send, and return response

        return null;
    }

    public NetworkMap getNetworkMap(
            URI uri,
            List<String> pidFilter)
            throws NoSuchObjectException {
        ALTOResource resource = getFilteredAltoResource(uri, pidFilter, null, null, null);

        if (resource instanceof NetworkMap) {
            return (NetworkMap) resource;
        } else {
            throw new NoSuchObjectException("Requested resource does not exist");
        }
    }

    public GenericMulticostMap getMulticostMap(
            URI uri,
            List<CostInfo> costFilter,
            List<String> srcPIDFilter,
            List<String> dstPIDFilter)
            throws NoSuchObjectException {

        ALTOResource resource = getFilteredAltoResource(uri, null, costFilter, srcPIDFilter, dstPIDFilter);

        if (resource instanceof GenericMulticostMap) {
            return (GenericMulticostMap) resource;
        } else {
            throw new NoSuchObjectException("Requested resource does not exist");
        }

    }
}
