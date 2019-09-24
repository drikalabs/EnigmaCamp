package com.enigma.util;

public class StringUtil {
    public static String getLeftPadingZero(int number, int padding){
        return String.format("%"+padding+"s",number).replaceAll(" ","0");
    }
}
