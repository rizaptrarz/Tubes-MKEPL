package com.mycompany.tubesmkepl;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.HashMap;

public class LoginTest {

    @Test
    void testLoginSuccess() {
        HashMap<String, String> userMap = new HashMap<>();
        userMap.put("admin", "12345"); 

        boolean result = Login.validasiLogin(userMap, "admin", "12345");

        assertTrue(result, "Login harusnya berhasil dengan kredensial yang benar");
    }

    @Test
    void testLoginFail_WrongPassword() {
        HashMap<String, String> userMap = new HashMap<>();
        userMap.put("admin", "12345");

        boolean result = Login.validasiLogin(userMap, "admin", "salahpassword");

        assertFalse(result, "Login harusnya gagal jika password salah");
    }
    
    @Test
    void testLoginFail_UserNotFound() {
        HashMap<String, String> userMap = new HashMap<>();
        userMap.put("admin", "12345");

        boolean result = Login.validasiLogin(userMap, "penyusup", "12345");

        assertFalse(result, "Login harusnya gagal jika username tidak ditemukan");
    }
}