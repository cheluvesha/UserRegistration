package com.fellowship;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    private Pattern pattern;
    private Matcher matcher;
    private static final String FIRSTNAME = "^[A-Z]{1}([a-z]{2,15})*";
    public UserRegistration() {
        pattern = pattern.compile(FIRSTNAME);
    }
    public boolean validFirstName(String firstName) {
        matcher = pattern.matcher(firstName);
        return matcher.matches();


    }
}
