package com.fellowship;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    @Test
    public void givenFirstNameWhenProperReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean validate = userRegistration.validFirstName("Cheluvesha");
        Assert.assertTrue(validate);
    }

    @Test
    public void givenLastNameWhenProperReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean validate = userRegistration.validLastName("Bharatha");
        Assert.assertTrue(validate);
    }

    @Test
    public void givenEmailWhenProperReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean validate = userRegistration.validEmail("abc.xyz.@bl.co.in");
        Assert.assertTrue(validate);
    }

    @Test
    public void givenMobileNumberWhenProperReturntrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean validate = userRegistration.validMobileNumber("91 8081234567");
        Assert.assertTrue(validate);
    }
}
