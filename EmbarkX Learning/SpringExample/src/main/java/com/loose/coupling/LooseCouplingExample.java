package com.loose.coupling;

public class LooseCouplingExample {
    public static void main(String[] args) {
        String awais = "Awais";
        awais.toUpperCase();
        System.out.println(awais);
        //className      objectName       //MemoryAlocatter   // defualt constructor          
        UserDataProvider databaseProvider = new               UserDatabaseProvider();
                                                              // parametorized contructor.   
        UserManager userManagerWithDB = new                   UserManager(databaseProvider);
                         // objectName       // defined method in User Manager class
        System.out.println(userManagerWithDB.getUserInfo());
                                                                
        UserDataProvider webServiceDataProvider = new WebServiceDataProvider();
        UserManager userManagerWithWebService = new UserManager(webServiceDataProvider);
        System.out.println(userManagerWithWebService.getUserInfo());
    }
}
