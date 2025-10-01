package com.papadbakery.util;

public class Validator {
    public static boolean isNotEmpty(String input) {
        return input != null && !input.trim().isEmpty();
    }
}
