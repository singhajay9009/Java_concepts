package com.test.demo;

import org.junit.jupiter.api.*;

import java.lang.reflect.Field;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordStorageTest {

    private PasswordStorage passwordStorage;
    private static String userName;
    private static String password;

    @BeforeAll
    public static void init(){
        userName = "abcTRUYioq";
        password = "Abc$45";

    }

    @BeforeEach
    public void setUp() throws ReflectiveOperationException {

        passwordStorage = new PasswordStorage();

        setStaticField(PasswordStorage.class, "credStoreMap", new HashMap<>());
    }

    @AfterEach
    public void clear(){
        passwordStorage = null;
    }

    @Test
    @DisplayName("Storing valid UserName and Password returns 'SUCCESS")
    public void testValidCredentials(){
        String result = passwordStorage.storePassWord(userName, password);
        assertEquals("SUCCESS", result);
    }

    @Test
    @DisplayName("UserName can not be null/empty")
    public void testNullUserName(){
        Throwable exception = assertThrows(IllegalArgumentException.class,
                () -> passwordStorage.storePassWord(null, password));
        assertEquals("UserName can not be null", exception.getMessage());
    }

    @Test
    @DisplayName("Password can not be null/empty")
    public void testNullPassword(){
        Throwable exception = assertThrows(IllegalArgumentException.class,
                () -> passwordStorage.storePassWord(userName, null));
        assertEquals("Password can not be null", exception.getMessage());
    }

    @Test
    @DisplayName("Invalid UserName > 10 character length")
    public void testInvalidUserNameLength(){
        Throwable exception = assertThrows(IllegalArgumentException.class,
                () ->  passwordStorage.storePassWord("abcTRUYioqe", password));
        assertEquals("UserName can not be more than 10 character length", exception.getMessage());
    }

    @Test
    @DisplayName("UserName already exists")
    public void testDuplicateUserName(){
        passwordStorage.storePassWord(userName, password);
        assertEquals("UserName already exists", passwordStorage.storePassWord(userName, password));

    }
 /*
 in case of unit tests we would need to set static field using Reflection
  */
    // ref:  https://dzone.com/articles/how-to-change-private-static-final-fields
    private static void setStaticField(Class<?> clazz, String fieldName, Object value) throws ReflectiveOperationException{
        Field field = clazz.getDeclaredField(fieldName);
        field.setAccessible(true);

      //  Field modifiers = Field.class.getDeclaredField("modifiers");
     //   modifiers.setAccessible(true);

        field.set(null, value);
    }

}
