package com.joysistvi.stage2.Activity13;

public class UserAccount {
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private String password;

//    public UserAccount(){
//
//    }

    public UserAccount(String firstName, String lastName, String address, String email, String password){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.password = password;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || email.isEmpty()) {
            System.out.println("Email cannot be empty.");
        } else if (!email.contains("@") || !email.contains(".")) {
            System.out.println("Invalid email format.");
        } else {
            this.email = email;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password == null || password.length() < 8) {
            System.out.println("Password must be at least 8 characters.");
        } else {
            this.password = password;
        }
    }
}
