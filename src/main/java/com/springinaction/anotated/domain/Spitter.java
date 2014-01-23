package com.springinaction.anotated.domain;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name="Spitter")
public class Spitter {
    @Id
    @GeneratedValue
    private long id;

    @Column(name ="name")
    private String name;

    @Column(name = "username")
    @Size(min=3, max=20, message="Username must be between 3 and 20 characters long.")
    @Pattern(regexp="^[a-zA-Z0-9]+$",message="Username must be alphanumeric with no spaces")
    private String username;

    @Column(name = "fullName")
    @Size(min=3, max=50, message="Your full name must be between 3 and 50 characters long.")
    private String fullName;

    @Size(min=6, max=20,message="The password must be at least 6 characters long.")
    @Column(name = "password")
    private String password;

    @Column(name = "email")
    @Pattern(regexp="[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}",message="Invalid email address.")
    private String email;

    @Column(name = "updateByEmail")
    private Boolean updateByEmail;

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getUpdateByEmail() {
        return updateByEmail;
    }

    public void setUpdateByEmail(Boolean updateByEmail) {
        this.updateByEmail = updateByEmail;
    }
}
