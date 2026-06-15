package com.mycompany.tubesmkpl;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {

    @Test
    void testLoginSuccess() {
        Login login = new Login();

        boolean result = login.authenticate("admin", "12345");

        assertTrue(result);
    }

    @Test
    void testLoginFail() {
        Login login = new Login();

        boolean result = login.authenticate("admin", "salahpassword");

        assertFalse(result);
    }
}

class Login {

    public boolean authenticate(String username, String password) {
        return username.equals("admin")
                && password.equals("12345");
    }
}