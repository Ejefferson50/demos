package com.zipcodewilmington;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainApplication {
    public static void main(String[] args) {
        new MainApplication().demo();
    }

    public void demo() {
        String text = "H_A";
        String patternString = "\\w";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);
        for (int i = 0; matcher.find(); i++) {
            System.out.println(new StringBuilder()
                    .append("\n-------------------")
                    .append("\nValue = " + matcher.group())
                    .append("\nMatch Number = " + i)
                    .append("\nStarting index = " + matcher.start())
                    .append("\nEnding index = " + matcher.end())
                    .toString());

        }
    }
}
