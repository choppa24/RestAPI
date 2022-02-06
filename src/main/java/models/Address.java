package models;

import framework.utils.LoggerUtility;

public class Address {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private Geo geo;

    public Address(String street, String suite, String city, String  zipcode, Geo geo){
        this.street = street;
        this.suite = suite;
        this.city = city;
        this.zipcode = zipcode;
        this.geo = geo;
    }

    public boolean equals(Address address){
        LoggerUtility.info("Comparing objects of class Address");
        return street.equals(address.getStreet()) && suite.equals(address.getSuite()) &&
                city.equals(address.getCity()) && zipcode.equals(address.getZipcode()) &&
                geo.equals(address.getGeo());
    }

    public String getStreet() {
        return street;
    }

    public String getSuite() {
        return suite;
    }

    public String getCity() {
        return city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public Geo getGeo() {
        return geo;
    }
}
