package com.test.demo;

import org.junit.jupiter.api.*;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PasswordStorageServiceTest {

    private PasswordStorageService passwordStorageService;
    private static String userName;
    private static String password;

    @BeforeAll
    public static void init(){
        userName = "abcTRUYioq";
        password = "Abc$45";
    }

    @BeforeEach
    public void setUp(){
        passwordStorageService = new PasswordStorageService(new HashMap<>());
    }

    @Test
    @DisplayName("Storing valid UserName and Password returns 'SUCCESS")
    public void testValidCredentials(){
        String result = passwordStorageService.storePassWord(userName, password);
        assertEquals("SUCCESS", result);
    }

    @Test
    @DisplayName("UserName can not be null/empty")
    public void testNullUserName(){
        Throwable exception = assertThrows(IllegalArgumentException.class,
                () -> passwordStorageService.storePassWord(null, password));
        assertEquals("UserName can not be null", exception.getMessage());
    }

    @Test
    @DisplayName("Password can not be null/empty")
    public void testNullPassword(){
        Throwable exception = assertThrows(IllegalArgumentException.class,
                () -> passwordStorageService.storePassWord(userName, null));
        assertEquals("Password can not be null", exception.getMessage());
    }

    @Test
    @DisplayName("Invalid UserName > 10 character length")
    public void testInvalidUserNameLength(){
        Throwable exception = assertThrows(IllegalArgumentException.class,
                () ->  passwordStorageService.storePassWord("abcTRUYioqe", password));
        assertEquals("UserName can not be more than 10 character length", exception.getMessage());
    }

    @Test
    @DisplayName("UserName already exists")
    public void testDuplicateUserName(){
        passwordStorageService.storePassWord(userName, password);
        assertEquals("UserName already exists", passwordStorageService.storePassWord(userName, password));
    }

    @Test
    @DisplayName("UserName does not exist")
    public void testRetrievePassword(){
        String result = passwordStorageService.retrievePassWord(userName);
        assertEquals("UserName does not exist", result);
    }

    @Test
    @DisplayName("Password is retrieved")
    public void testRetrievePassWordSuccess(){
       // passwordStorageService.storePassWord(userName, password);

        Map<String, String> credStoreMap = mock(Map.class);
        passwordStorageService = new PasswordStorageService(credStoreMap);

        when(credStoreMap.containsKey(userName)).thenReturn(true);
        when(credStoreMap.get(userName)).thenReturn(password);

        assertEquals(password, passwordStorageService.retrievePassWord(userName));

    }

    @Test
    @DisplayName("Password is retrieved- without mock")
    public void testRetrievePassWordSuccess_2(){
        Map<String, String> credStoreMap = new HashMap<>();
        credStoreMap.put(userName, password);

        passwordStorageService = new PasswordStorageService(credStoreMap);

        assertEquals(password, passwordStorageService.retrievePassWord(userName));
    }

    @Test
    @DisplayName("UserName does not exists")
    public void testRetrievePassWordUserName(){
        assertEquals("UserName does not exist", passwordStorageService.retrievePassWord(userName));
    }

}
