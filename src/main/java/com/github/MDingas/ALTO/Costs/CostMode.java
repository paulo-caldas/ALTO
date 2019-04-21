package com.github.MDingas.ALTO.Costs;

/**
 * As per RFC 7285
 */
enum CostMode {
    NUMERICAL, // 1, 2, 3.0, etc
    ORDINAL, // numerical value that states preference. The smallest the number, the higher the preference
    NOMINAL // "up", "down", "example", etc
}