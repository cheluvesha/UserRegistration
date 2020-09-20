package com.fellowship;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    private Pattern pattern;
    private Matcher matcher;
    private static final String FIRSTNAME = "^[A-Z]{1}[a-z]{2,}$";
    private static final String LASTNAME = "^[A-Z]{1}[a-z]{2,}$";
    private static final String EMAIL = "^[a-zA-Z0-9.]+[@][a-zA-Z0-9]+[.]co(m|.in)$";
    private static final String MNUMBER = "^[91]+[ ]{0,1}+[6-9][0-9]{9}$";
    public UserRegistration() {
        pattern = pattern.compile(FIRSTNAME);
        pattern = pattern.compile(LASTNAME);
        pattern = pattern.compile(EMAIL);
        pattern = pattern.compile(MNUMBER);

    }
    public boolean validFirstName(String firstName) {
        matcher = pattern.matcher(firstName);
        return matcher.matches();
    }

    public boolean validLastName(String lastName) {
        matcher = pattern.matcher(lastName);
        return matcher.matches();
    }

    public boolean validEmail(String email) {
        matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public boolean validMobileNumber(String number) {
        matcher = pattern.matcher(number);
        return matcher.matches();
    }
}
