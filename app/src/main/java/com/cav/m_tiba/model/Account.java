package com.cav.m_tiba.model;

/**
 * Created by wasike on 29/09/17.
 */

public class Account {
    private String id;
    private String name;
    private String email;
    private String phoneNumber;
    private String dateAdded;
    private String providerName;

//    public Account{}
    public Account(String id,String name,String email,String phoneNumber,
                   String dateAdded,String providerName ){
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dateAdded = dateAdded;
        this.providerName = providerName;
    }

        public String getId(){
            return id;
        }

        public String getName(){
            return name;

        }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public String getProviderName() {
        return providerName;
    }
}

