package com.GlobalTimeZoneHarbor.GlobalTimeZoneHarbor.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TimeZone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String countryCode;
    private String timeZone;
    private String countryName;
    private String gmtOffSet;
    private String isCustomTimeZone;

    public TimeZone() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getGmtOffSet() {
        return gmtOffSet;
    }

    public void setGmtOffSet(String GMTOffSet) {
        this.gmtOffSet = GMTOffSet;
    }

    public String getIsCustomTimeZone() {
        return isCustomTimeZone;
    }

    public void setIsCustomTimeZone(String isCustomTimeZone) {
        this.isCustomTimeZone = isCustomTimeZone;
    }
}
