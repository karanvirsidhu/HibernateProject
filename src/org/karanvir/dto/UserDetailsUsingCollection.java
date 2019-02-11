package org.karanvir.dto;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.*;

@Entity(name = "User_Details_Collection")
public class UserDetailsUsingCollection {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
    @Column(name = "User_Name")
    private String userName;
    @Temporal(TemporalType.DATE)
    private Date dateOfJoining;

    @ElementCollection
    @GenericGenerator(name="hilo-gen",strategy = "seqhilo")
    @CollectionId(columns = {@Column(name="Address_Id")}, type =@Type(type="long"), generator = "hilo-gen")
    private List<Address> listOfAddresses = new ArrayList<>();

    public List<Address> getListOfAddresses() {
        return listOfAddresses;
    }

    public void setListOfAddresses(List<Address> listOfAddresses) {
        this.listOfAddresses = listOfAddresses;
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
