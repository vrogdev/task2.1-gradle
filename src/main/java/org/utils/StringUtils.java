package org.utils;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (!NumberUtils.isParsable(str))
            throw new IllegalArgumentException("string is not parsable value");

        Number number = NumberUtils.createNumber(str);

        double strNumber = number.doubleValue();

        return strNumber > 0;
    }
}