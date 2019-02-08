package org.karanvir.dto;

import javax.persistence.*;
import java.util.Date;

@Entity (name = "User_Details")
public class UserDetails {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
    @Column(name = "User_Name")
    private String userName;
    @Temporal(TemporalType.DATE)
    private Date dateOfJoining;

    private String address;
    @Lob
    private String description;

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



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
