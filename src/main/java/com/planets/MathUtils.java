package com.planets;

import java.math.BigDecimal;

public class MathUtils {

    public static double round(double val) {
        return new BigDecimal(String.valueOf(val)).setScale(2, BigDecimal.ROUND_HALF_EVEN).doubleValue();
    }
}
