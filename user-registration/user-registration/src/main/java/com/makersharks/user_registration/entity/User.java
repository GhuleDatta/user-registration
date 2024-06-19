package com.makersharks.user_registration.entity;

import jakarta.persistence.*;

@Entity
@Table(name="User")
public class User {
    // declaring user fields //
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="user_name")
    private String userName;

    @Column(name="email_id")
    private String emailId;

    @Column(name="password")
    private String password;

    // declare constructor //

    public User(int id,String userName,String emailId,String password)
    {
        this.id=id;
        this.userName=userName;
        this.emailId=emailId;
        this.password=password;
    }

    public User()
    {

    }

    // declare private members //

    public int getId()
    {
        return id;
    }

    public String getUser()
    {
        return userName;
    }
    public void setUser(String userName)
    {
        this.userName=userName;
    }

    public String getEmailId()
    {
        return emailId;
    }

    public void setEmailId(String emailId)
    {
        this.emailId=emailId;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password=password;
    }

    // Overriding toString() //

    @Override
    public String toString()
    {
        return "User Name: "+getUser()+" Email Id: "+getEmailId()+" Password: "+getPassword();
    }



}
