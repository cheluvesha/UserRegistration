package com.fellowship;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    private Pattern pattern;
    private Matcher matcher;
    private static final String FIRSTNAME = "^([A-Z][a-z]{8,})$";
    public UserRegistration() {
        pattern = pattern.compile(FIRSTNAME);
    }
    public boolean validFirstName(String firstName) {
        matcher = pattern.matcher(firstName);
        return matcher.matches();
    }
}
