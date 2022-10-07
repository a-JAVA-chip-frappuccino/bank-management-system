package com.springframework.bank.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {

    /*@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long user_id;*/
    
    @Id
    private String username;
    private String password;

    /*@ManyToMany
    @JoinTable(name = "user_account", joinColumns = @JoinColumn(name = "username"),
                inverseJoinColumns = @JoinColumn(name = "account_id"))
    private Set<User> users = new HashSet<>();*/

    // constructor

    public User() {}

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // getters and setters

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /*public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }*/

    // overriding methods

    @Override
    public String toString() {
        return "Username: " + username + "\n"
                + "Password: " + password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        User user = (User) o;

        //TODO: translate to non-ternary syntax
        return username != null ? username.equals(user.username) : user.username == null;
    }

    @Override
    public int hashCode() {
        //TODO: translate to non-ternary syntax
        return username != null ? username.hashCode() : 0;
    }

}
