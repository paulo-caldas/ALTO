package com.github.MDingas.ALTO.Costs;

import java.util.Optional;

/**
 * Meta information about a cost. As per RFC 7285
 */
public class CostInfo {
    private CostMode mode; // Modes that a cost can take
    private String metric; // Identifier of what the cost metric is. E.g, "routing-cost", "hop-count", "bandwidth"
    private Optional<String> description; // Brief description of what the cost is. Not obligatory, thus optional

    public CostInfo(CostMode mode, String metric) {
        this.mode = mode;
        this.metric = metric;
        this.description = Optional.empty();
    }

    public CostInfo(CostMode mode, String metric, String description) {
        this.mode = mode;
        this.metric = metric;
        this.description = Optional.of(description);
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

    public Optional<String> getDescription() {
        return description;
    }

    public void setDescription(Optional<String> description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "(" + this.mode.toString() + "," + this.metric + "," + this.description.orElse("") + ")";
    }
}
