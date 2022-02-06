package models;

import framework.utils.LoggerUtility;

public class Geo {
    private String lat;
    private String lng;

    public Geo( String lat, String lng){
        this.lat = lat;
        this.lng = lng;
    }

    public boolean equals(Geo geo){
        LoggerUtility.info("Comparing objects of class Geo");
        return lat.equals(geo.getLat()) && lng.equals(geo.getLng());
    }

    public String getLat() {
        return lat;
    }

    public String getLng() {
        return lng;
    }
}
