package com.test.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PasswordStorage {

    private Map<String, String> credStoreMap = new HashMap<>();

    public String storePassWord(String userName, String password) {

        userName = Optional.ofNullable(userName).orElseThrow(() -> new IllegalArgumentException("UserName can not be null"));
        password = Optional.ofNullable(password).orElseThrow(() -> new IllegalArgumentException("Password can not be null"));

        if(userName.length()> 10) throw new IllegalArgumentException("UserName can not be more than 10 character length");

        if(!credStoreMap.containsKey(userName)){
            credStoreMap.put(userName, password);
            return "SUCCESS";
        }else{
            return "UserName already exists";
        }

    }

    public String retrievePassWord(String userName){
        userName = Optional.ofNullable(userName).orElseThrow(() -> new IllegalArgumentException("UserName can not be null"));

        if(credStoreMap.containsKey(userName)){
            return credStoreMap.get(userName);
        }else{
            return "userName does not exist";
        }
    }
}
