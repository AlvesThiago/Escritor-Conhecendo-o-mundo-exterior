package org.example.model;

public class User {

    private String email;
    private String key;


    public User(String email, String key) {
        this.email = email;
        this.key = key;
    }

    public User(){

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", key='" + key + '\'' +
                '}';
    }
}
