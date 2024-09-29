package com.tight.coupling;




// A - MySQL, PostgreSQL
// B - Web Services, MongoDB
public class UserDatabase {
    public String getUserDetails() {
        //Directly Access database here
        return "User Details from database";
    }
}
