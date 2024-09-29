package com.tight.coupling;

public class UserManager {

    private UserDatabase userDatabase = new UserDatabase(); //both are connected via instances if anything changes we need to modify this all. wrong approach for production based applications.
    public String getUserInfo(){
        return userDatabase.getUserDetails();
    }
}
