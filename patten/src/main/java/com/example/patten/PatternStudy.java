package com.example.patten;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternStudy {

    public static void main(String[] args) {
//        String text = "Hi I am Lucy";
//        String regex = "\\bHi\\b.*\\bLucy\\b";
//        String text = "13245";
//        String regex = "\\b\\d?";
        String text = "Abc a";
        String regex = "^A[bc]?\\b";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);
//        Pattern.compile(regex).matcher(text);
//        boolean isPatter = Pattern.matches(regex, text);
        System.out.println("Test case is " + text);
        System.out.println("Regex case is " + regex);
        System.out.println("Result is " + m.find() + "");
    }
}
