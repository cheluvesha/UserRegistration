package com.fellowship;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstNameWhenProperReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validFirstName("Cheluvesha");
        Assert.assertTrue(result);
    }
}
