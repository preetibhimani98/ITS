package com.a.its;

import java.util.Date;

/**
 * Created by Abhi on 20 Jan 2018 020.
 */

public class User {
    String username;
    String fName;
    Date sessionExpiryDate;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setSessionExpiryDate(Date sessionExpiryDate) {
        this.sessionExpiryDate = sessionExpiryDate;
    }

    public String getUsername() {
        return username;
    }

    public String getFullName() {
        return fName;
    }

    public Date getSessionExpiryDate() {
        return sessionExpiryDate;
    }
}