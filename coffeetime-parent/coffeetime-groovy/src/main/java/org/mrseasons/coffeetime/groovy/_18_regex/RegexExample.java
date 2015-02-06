package org.mrseasons.coffeetime.groovy._18_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by mrseasons on 2/6/15.
 */
public class RegexExample {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("1010");
        String input = "1010";
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            input = matcher.replaceFirst("0101");
            System.out.println(input);              //0101
        }

    }
}
