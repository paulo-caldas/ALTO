package com.github.MDingas.ALTO.Resources;

import javax.ws.rs.core.MediaType;
import java.net.URI;
import java.net.URL;
import java.util.List;

/**
 * Abstract definition of an ALTO Resource. Concrete definitions (such as network or cost map),
 * must extend from this class
 */
public class ALTOResource {
    private URI uri; // URI from which to access such resource
    private MediaType mediaType;
    private List<MediaType> acceptTypes;
    private String name;
    private String tag; // Used to check how recent a resource is, compared to a similar one. Advised to use timestamps

    public ALTOResource(URI uri, MediaType mediaType, List<MediaType> acceptTypes, String name, String tag) {
        this.uri = uri;
        this.mediaType = mediaType;
        this.acceptTypes = acceptTypes;
        this.name = name;
        this.tag = tag;
    }

    public URI getUrl() {
        return uri;
    }

    public void setUri(URI uri) {
        this.uri = uri;
    }

    public MediaType getMediaType() {
        return mediaType;
    }

    public void setMediaType(MediaType mediaType) {
        this.mediaType = mediaType;
    }

    public List<MediaType> getAcceptTypes() {
        return acceptTypes;
    }

    public void setAcceptTypes(List<MediaType> acceptTypes) {
        this.acceptTypes = acceptTypes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
