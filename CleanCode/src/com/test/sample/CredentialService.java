package com.test.sample;

import java.util.Map;
import java.util.Optional;

/**
 * The CredentialService class provides methods
 */
public class CredentialService {
    private Map<String, String> credentials;

    public CredentialService(Map<String, String> credentials){
        this.credentials = credentials;
    }

    public boolean add(String userName, String password) {
        if(Optional.ofNullable(userName).isEmpty() || userName.trim().equals("")) throw new IllegalArgumentException("userName can't be null or empty");
        if(credentials.containsKey(userName)) throw new IllegalArgumentException("User already exists!");
        if(password.length() < 8) throw new IllegalArgumentException("Password must be minimum 8 character length");

        credentials.put(userName, password);
        return true;
    }
}
