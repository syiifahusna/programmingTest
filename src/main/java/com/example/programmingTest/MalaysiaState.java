package com.example.programmingTest;

public class MalaysiaState {

    private String name;
    private String city;
    private String postcode;

    public MalaysiaState(){};

    public MalaysiaState(String name, String city, String postcode) {
        this.name = name;
        this.city = city;
        this.postcode = postcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    @Override
    public String toString() {
        return "{" +
                "\"name\":\"" + name + "\"," +
                "\"city:\":\"" + city + "\"," +
                "\"postcode\":\"" + postcode + "\"" +
                "}";
    }
}
