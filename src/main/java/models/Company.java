package models;

import framework.utils.LoggerUtility;

public class Company {
    private String name;
    private String catchPhrase;
    private String bs;

    public Company(String name, String catchPhrase, String bs){
        this.name = name;
        this.catchPhrase = catchPhrase;
        this.bs = bs;

    }

    public boolean equals(Company company){
        LoggerUtility.info("Comparing objects of class Company");
        return name.equals(company.getName()) && catchPhrase.equals(company.getCatchPhrase()) &&
                bs.equals(company.getBs());
    }

    public String getName() {
        return name;
    }

    public String getCatchPhrase() {
        return catchPhrase;
    }

    public String getBs() {
        return bs;
    }
}
