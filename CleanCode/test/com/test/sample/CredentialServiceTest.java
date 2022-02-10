package com.test.sample;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class CredentialServiceTest {

    private Map<String, String> credMap;
    private CredentialService credentialService;

    @BeforeEach
    public void setUp(){
        credMap = new HashMap<>();
        credentialService = new CredentialService(credMap);
    }
    @Test
    public void shouldReturnTrueOnAddForValidCredentials(){
        String userName = "Adam";
        String password = "Tc12$wer";
        boolean addCred = credentialService.add(userName, password);
        assertTrue(addCred);
    }

    @Test
    public void shouldThrowExceptionOnAddIfUserAlreadyExists(){
        String userName = "Elena";
        String password = "c56FG#67";
        credMap.put(userName, password);
        String newPassword = "cYh7t#67";

        Exception exception = assertThrows(IllegalArgumentException.class,
                ()-> credentialService.add(userName, newPassword));

        assertEquals("User already exists!", exception.getMessage());
    }

    @Test
    public void shouldThrowExceptionIfPasswordLengthInvalid(){
        String userName = "Alexander";
        String password = "c45H@6a";
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> credentialService.add(userName, password));
        assertEquals("Password must be minimum 8 character length", exception.getMessage());
    }

    @Test
    public void shouldThrowExceptionIfUserNameIsNull(){
        String userName = null;
        String password = "c4G5@6aWqwer";
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> credentialService.add(userName, password));
        assertEquals("userName can't be null or empty", exception.getMessage());
    }

    @Test
    public void shouldThrowExceptionIfUserNameIsEmpty(){
        String userName = "";
        String password = "c4G5@6aWqwer";
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> credentialService.add(userName, password));
        assertEquals("userName can't be null or empty", exception.getMessage());
    }

    @Test
    public void shouldThrowExceptionIfUserNameIsEmptyHavingMultipleBlankSpaces(){
        String userName = "   ";
        String password = "c4G5@tryY %";
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> credentialService.add(userName, password));
        assertEquals("userName can't be null or empty", exception.getMessage());
    }

}
