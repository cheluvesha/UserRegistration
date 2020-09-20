package com.fellowship;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    private Pattern pattern;
    private Matcher matcher;
    private static final String FIRSTNAME = "^[A-Z]{1}[a-z]{2,}$";
    private static final String LASTNAME = "^[A-Z]{1}[a-z]{2,}$";
    private static final String EMAIL = "^[A-Za-z0-9+_.-]+@(.+)$";
    private static final String MNUMBER = "^[91]+[ ]{0,1}+[6-9][0-9]{9}$";
    private static final String MIN8PASSWORD = "^.{8,}$";
    private static final String PASS1UPPERCASE = ".*[A-Z].*";
    private static final String PASSWITHNUM = "^[A-Za-z0-9]{8,}";
    private static final String PASSSYMBOL = "^[0-9A-Za-z]*[!@#$%&][A-Za-z0-9]*$";
    public UserRegistration() {
       // pattern = pattern.compile(FIRSTNAME);
       // pattern = pattern.compile(LASTNAME);
        pattern = pattern.compile(EMAIL);
       // pattern = pattern.compile(MNUMBER);
       // pattern = pattern.compile(MIN8PASSWORD);
       // pattern = pattern.compile(PASS1UPPERCASE);
       // pattern = pattern.compile(PASSWITHNUM);
      //  pattern = pattern.compile(PASSSYMBOL);
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
    public boolean validPassWith8Chars(String pass8Chars) {
        matcher = pattern.matcher(pass8Chars);
        return matcher.matches();
    }

    public boolean validPass1UpperCase(String passWithUppercase) {
        matcher = pattern.matcher(passWithUppercase);
        return matcher.matches();
    }

    public boolean validPassWithNum(String passWithNum) {
        matcher = pattern.matcher(passWithNum);
        return matcher.matches();
    }

    public boolean validPassWithSymbol(String passSymbol) {
        matcher = pattern.matcher(passSymbol);
        return matcher.matches();
    }
}
