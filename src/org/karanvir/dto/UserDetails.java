package org.karanvir.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity (name = "User_Details")
public class UserDetails {
    @Id
    private int userId;
    private String userName;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }



}
