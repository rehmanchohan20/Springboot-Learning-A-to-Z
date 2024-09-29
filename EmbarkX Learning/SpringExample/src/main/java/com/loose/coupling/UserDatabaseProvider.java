package com.loose.coupling;

// A - MySQL, PostgreSQL
// B - Web Services, MongoDB
public class UserDatabaseProvider implements UserDataProvider{
    @Override
    public String getUserDetails(){
        //Directly Access database here
        return "User Details from database";
    }
}
