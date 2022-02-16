package com.example.programmingTest;

import javax.persistence.*;

@Entity
@Table
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String dob;
    private String address;
    private String postcode;
    private String state_id;

    public Person(){};

    public Person(int id, String name, String dob, String address, String postcode, String state_id) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.postcode = postcode;
        this.state_id = state_id;
    }

    public Person(String name, String dob, String address, String postcode, String state_id) {
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.postcode = postcode;
        this.state_id = state_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getState_id() {
        return state_id;
    }

    public void setState_id(String state_id) {
        this.state_id = state_id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", address='" + address + '\'' +
                ", postcode='" + postcode + '\'' +
                ", state_id=" + state_id +
                '}';
    }
}
