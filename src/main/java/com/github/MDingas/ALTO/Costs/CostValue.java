package com.github.MDingas.ALTO.Costs;

/**
 * Value itself of a cost. At the time being, a string is fine
 */
public class CostValue {
    private String value;

    public CostValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
