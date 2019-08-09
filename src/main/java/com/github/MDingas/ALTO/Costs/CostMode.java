package com.github.MDingas.ALTO.Costs;

/**
 * Modes that a cost can take. As per RFC 7285
 */
public enum CostMode {
    NUMERICAL, // Integer or floating point, positive or negative, on which operations can be performed
    ORDINAL, // Numerical values that state preference. The smaller the number, the higher the preference
}
