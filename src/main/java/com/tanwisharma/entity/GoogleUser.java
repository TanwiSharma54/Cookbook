package com.tanwisharma.entity;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * The type GoogleUser
 */
@Entity(name = "GoogleUser")
@Table(name = "GoogleUser")
public class GoogleUser {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO, generator="native")
    @GenericGenerator(name = "native",strategy = "native")
    private int userId;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    private Set<Recipe> recipes = new HashSet<Recipe>(0);

    public GoogleUser() {
    }

    public GoogleUser(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public GoogleUser(String name, String email, Set<Recipe> recipes) {
        this.name = name;
        this.email = email;
        this.recipes = recipes;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "user_recipe", joinColumns = {
            @JoinColumn(name = "userId", nullable = false, updatable = false) },
            inverseJoinColumns = { @JoinColumn(name = "recipeId",
                    nullable = false, updatable = false) })
    public Set<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(Set<Recipe> recipes) {
        this.recipes = recipes;
    }

    @Override
    public String toString() {
        return "GoogleUser{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", recipes=" + recipes +
                '}';
    }
}
