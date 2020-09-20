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
}
