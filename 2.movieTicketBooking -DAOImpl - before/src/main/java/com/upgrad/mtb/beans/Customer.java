package com.upgrad.mtb.beans;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter

public class Customer {

    private int id;

    private String firstName;
    private String lastName;

    private String username;

    private String password;

    private Date dateOfBirth;
    private int userTypeId;

    private List<String> phoneNumbers;

    public Customer() {
    }

    public Customer(int id, String firstName, String lastName, String username, String password, Date dateOfBirth, int userTypeId, List<String> phoneNumbers) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.userTypeId = userTypeId;
        this.phoneNumbers = phoneNumbers;
    }
}
