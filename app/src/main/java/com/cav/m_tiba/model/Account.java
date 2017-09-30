package com.cav.m_tiba.model;

/**
 * Created by wasike on 29/09/17.
 */

public class Account {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String dateOfBirth;
    private String providerName;


    public Account(){}

        public Account(String id,String firstName,String lastName,String email,String phoneNumber,
                   String dateOfBirth,String providerName ){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.providerName = providerName;
        }

        public String getId(){
            return id;
        }

        public String getFirstName(){
            return firstName;

        }

        public String getLastName(){
        return lastName;
        }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getProviderName() {
        return providerName;
    }
}

