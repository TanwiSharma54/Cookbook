package com.tanwisharma.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * A Entity class for Role.
 *
 * @author tanwi
 */
@Entity(name = "Role")
@Table(name = "role")
public class Role implements Serializable {
    @Id
    @GenericGenerator(name = "native",strategy = "native")
    @Column(name = "id")
    private int id ;
    @Column(name = "role_name")
    private String role_name;
    @Column(name = "user_name")
    private String user_name;
    @OneToOne(mappedBy="User")
    private User user;
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }



    /**
     * Role constructor
     */
    public Role() {
    }

    public Role(int id, String role_name, String user_name, User user) {
        this.id = id;
        this.role_name = role_name;
        this.user_name = user_name;
        this.user = user;
    }

    public Role(String role_name, String user_name, User user) {
        this.role_name = role_name;
        this.user_name = user_name;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }


}
