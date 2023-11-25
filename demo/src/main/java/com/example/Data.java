package com.example;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public class Data{

    public static class Datum {
        private long id;
        private Status status;
        private Name name;
        private BigDecimal monthlySalary;
        private LocalDate birthday;
        private String username;
        private String password;
        private String[] emails;
        private String phoneNumber;
        private Location location;
        private String website;
        private String domain;
        private Job job;
        private CreditCard creditCard;
        private UUID uuid;
        private String objectId;

        public long getID(){ 
            return id; 
        }
        public void setID(long value){ 
            this.id = value; 
        }

        public Status getStatus(){ 
            return status; 
        }
        public void setStatus(Status value){ 
            this.status = value; 
        }

        public Name getName(){ 
            return name; 
        }
        public void setName(Name value){ 
            this.name = value; 
        }

        public BigDecimal getMonthlySalary(){ 
            return monthlySalary; 
        }
        public void setMonthlySalary(BigDecimal value){ 
            this.monthlySalary = value; 
        }

        public LocalDate getBirthday(){ 
            return birthday;
        }
        public void setBirthday(LocalDate value){
            this.birthday = value; 
        }

        public String getUsername(){ 
            return username; 
        }
        public void setUsername(String value){
            this.username = value; 
        }

        public String getPassword(){ 
            return password; 
        }
        public void setPassword(String value){ 
            this.password = value;
        }

        public String[] getEmails(){ 
            return emails; 
        }
        public void setEmails(String[] value){ 
            this.emails = value; 
        }

        public String getPhoneNumber(){ 
            return phoneNumber; 
        }
        public void setPhoneNumber(String value){ 
            this.phoneNumber = value; 
        }

        public Location getLocation(){ 
            return location; 
        }
        public void setLocation(Location value){ 
            this.location = value; 
        }

        public String getWebsite(){ 
            return website; 
        }
        public void setWebsite(String value){ 
            this.website = value; 
        }

        public String getDomain(){ 
            return domain; 
        }
        public void setDomain(String value){ 
            this.domain = value; 
        }

        public Job getJob(){ 
            return job; 
        }
        public void setJob(Job value){ 
            this.job = value;
        }

        public CreditCard getCreditCard(){ 
            return creditCard; 
        }
        public void setCreditCard(CreditCard value){ 
            this.creditCard = value; 
        }

        public UUID getUUID(){ 
            return uuid; 
        }
        public void setUUID(UUID value){ 
            this.uuid = value; 
        }

        public String getObjectId(){
            return objectId; 
        }
        public void setObjectId(String value){ 
            this.objectId = value; 
        }

    }

    public static class Coordinates {
        private double latitude;
        private double longitude;
    
        public double getLatitude(){
            return latitude;
        }
        public void setLatitude(double value){ 
            this.latitude = value; 
        }
    
        public double getLongitud(){ 
            return longitude;
        }
        public void setLongitude(double value){ 
            this.longitude = value; 
        }
    }

    public static class CreditCard {
        private String number;
        private String cvv;
        private Issuer issuer;
    
        public String getNumber(){ 
            return number;
        }
        public void setNumber(String value){ 
            this.number = value; 
        }
    
        public String getCvv(){ 
            return cvv; 
        }
        public void setCvv(String value){ 
            this.cvv = value; 
        }
    
        public Issuer getIssuer(){ 
            return issuer; 
        }
        public void setIssuer(Issuer value){ 
            this.issuer = value; 
        }
    }

    public static class Job {
        private String title;
        private String descriptor;
        private String area;
        private String type;
        private String company;
    
        public String getTitle(){
            return title; 
        }
        public void setTitle(String value){ 
            this.title = value; 
        }
    
        public String getDescriptor(){ 
            return descriptor; 
        }
        public void setDescriptor(String value){ 
            this.descriptor = value; 
        }
    
        public String getArea(){ 
            return area; 
        }
        public void setArea(String value){ 
            this.area = value; 
        }
    
        public String getType(){
            return type; 
        }
        public void setType(String value){ 
            this.type = value; 
        }
    
        public String getCompany(){ 
            return company; 
        }
        public void setCompany(String value){ 
            this.company = value; 
        }
    }

    public static class Location {
        private String street;
        private String city;
        private String state;
        private String country;
        private String zip;
        private Coordinates coordinates;
    
        public String getStreet(){ 
            return street; 
        }
        public void setStreet(String value){ 
            this.street = value; 
        }
    
        public String getCity(){ 
            return city; 
        }
        public void setCity(String value){ 
            this.city = value; 
        }
    
        public String getState(){ 
            return state; 
        }
        public void setState(String value){ 
            this.state = value; 
        }
    
        public String getCountry(){ 
            return country; 
        }
        public void setCountry(String value){ 
            this.country = value; 
        }
    
        public String getZip(){ 
            return zip; 
        }
        public void setZip(String value){ 
            this.zip = value; 
        }
    
        public Coordinates getCoordinates(){ 
            return coordinates; 
        }
        public void setCoordinates(Coordinates value){ 
            this.coordinates = value; 
        }
    }

    public static class Name {
        private String first;
        private String middle;
        private String last;
    
        public String getFirst(){ 
            return first; 
        }
        public void setFirst(String value){ 
            this.first = value; 
        }
    
        public String getMiddle(){ 
            return middle; 
        }
        public void setMiddle(String value){ 
            this.middle = value; 
        }
    
        public String getLast(){ 
            return last; 
        }
        public void setLast(String value){ 
            this.last = value; 
        }
    }

    public enum Status {
        ACTIVE, DISABLED;

        public String toValue() {
            switch (this) {
                case ACTIVE: return "ACTIVE";
                case DISABLED: return "DISABLED";
            }
            return null;
        }

        public static Status forValue(String value) throws IOException {
            if (value.equals("ACTIVE")){
                return ACTIVE;
            }
            if (value.equals("DISABLED")){
                return DISABLED;
            }
            throw new IOException("Cannot deserialize Status");
        }
    }

    public enum Issuer {
        american_express, diners_club, discover, jcb, maestro, mastercard, visa;
    
        public String toValue() {
            switch (this) {
                case american_express: return "american_express";
                case diners_club: return "diners_club";
                case discover: return "discover";
                case jcb: return "jcb";
                case maestro: return "maestro";
                case mastercard: return "mastercard";
                case visa: return "visa";
            }
            return null;
        }
    
        public static Issuer forValue(String value) throws IOException {
            if (value.equals("american_express")){
                return american_express;
            } 
            if (value.equals("diners_club")){
                return diners_club;
            } 
            if (value.equals("discover")){
                return discover;
            }
            if (value.equals("jcb")){
                return jcb;
            }
            if (value.equals("maestro")){
                return maestro;
            }
            if (value.equals("mastercard")){
                return mastercard;
            }
            if (value.equals("visa")){
                return visa;
            }
            throw new IOException("Cannot deserialize Issuer");
        }
    }

    public static class Root {
        private Datum[] data;
    
        public Datum[] getData(){
            return data; 
        }
        public void setData(Datum[] value){ 
            this.data = value; 
        }
    }

}