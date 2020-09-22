package com.fellowship;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    private Pattern pattern;
    private Matcher matcher;
    private static final String FIRSTNAME = "^([A-Z][a-z]{8,})$";
    private static final String LASTNAME = "^([A-Z][a-z]{8,})$";
    public UserRegistration() {
        pattern = pattern.compile(FIRSTNAME);
        pattern = pattern.compile(LASTNAME);
    }
    public boolean validFirstName(String firstName) {
        matcher = pattern.matcher(firstName);
        return matcher.matches();


    }

    public boolean validLastName(String lastName) {
        matcher = pattern.matcher(lastName);
        return matcher.matches();
    }
}
