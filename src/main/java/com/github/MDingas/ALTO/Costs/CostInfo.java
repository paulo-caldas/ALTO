package com.github.MDingas.ALTO.Costs;

/**
 *  Meta information about a cost
 */
public class CostInfo {
    private CostMode mode;
    private String metric;
    private String description;

    public CostInfo() {
        this.metric = null;
        this.description = null;
        this.mode = null;
    }

    public CostInfo(CostMode mode, String metric, String description) {
        this.mode = mode;
        this.metric = metric;
        this.description = description;
    }

    public CostInfo(CostInfo c) {
        this.mode = c.getMode();
        this.description = c.getDescription();
        this.metric = c.getMetric();
    }

    public CostMode getMode() {
        return mode;
    }

    public void setMode(CostMode mode) {
        this.mode = mode;
    }

    public String getMetric() {
        return metric;
    }

    public void setMetric(String metric) {
        this.metric = metric;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}