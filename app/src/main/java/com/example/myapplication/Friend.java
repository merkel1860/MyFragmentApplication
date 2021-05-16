package com.example.myapplication;

import java.util.Date;

public class Friend {
    private String fname;
    private String lname;
    private String gender;
    private String email;
    private int mobile;
    private int dob ;
    private Date startingDate;
    private String synopssis;
    private boolean bestFriend;

    public Friend(String fname, String lname, int mobile, int dob, String synopssis) {
        this.fname = fname;
        this.lname = lname;
        this.mobile = mobile;
        this.dob = dob;
        this.synopssis = synopssis;
    }

    public boolean isBestFriend() {
        return bestFriend;
    }

    public void setBestFriend(boolean bestFriend) {
        this.bestFriend = bestFriend;
    }

    public Date getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(Date startingDate) {
        this.startingDate = startingDate;
    }

    public void setFullName(String fullName){
        String first =  fullName.substring(0,fullName.indexOf(" "));
        String last = fullName.substring(fullName.indexOf(" "), fullName.length());
        this.setFname(first);
        this.setLname(last);
    }

    public String getFullName(){
        return  fname+" " +lname;
    }
    public Friend() {
    }

    public String getSynopssis() {
        return synopssis;
    }

    public void setSynopssis(String synopssis) {
        this.synopssis = synopssis;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }
}
