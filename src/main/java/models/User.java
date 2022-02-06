package models;

import framework.utils.LoggerUtility;

public class User {
    private int id;
    private String name;
    private String username;
    private String email;
    private Address address;
    private String phone;
    private String website;
    private Company company;

    public User(int id, String name, String userName, String email, Address address, String phone, String website, Company company){
        this.id = id;
        this.name = name;
        this.username = userName;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.website = website;
        this.company = company;
    }


    public boolean equals(User user){
        LoggerUtility.info("Comparing objects of class User");
        return id == user.getId() && name.equals(user.getName()) && username.equals(user.getUsername()) &&
                email.equals(user.getEmail()) && address.equals(user.getAddress()) && phone.equals(user.getPhone()) &&
                website.equals(user.getWebsite()) && company.equals(user.getCompany());
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public Address getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getWebsite() {
        return website;
    }

    public Company getCompany() {
        return company;
    }
}
