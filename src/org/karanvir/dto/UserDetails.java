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
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name="streetNumber", column = @Column(name = "Home_Street_Number")),
            @AttributeOverride(name="city", column = @Column(name = "Home_City")),
            @AttributeOverride(name="state", column = @Column(name = "Home_State")),
            @AttributeOverride(name="pinCode", column = @Column(name = "Home_Pincode"))
    })
    private Address homeAddress;
    @Embedded
    private Address officeAddress;

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(Address officeAddress) {
        this.officeAddress = officeAddress;
    }

    @Lob
    private String description;

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
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
