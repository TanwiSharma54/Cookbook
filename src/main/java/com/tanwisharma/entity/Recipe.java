package com.tanwisharma.entity;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "Recipe")
@Table(name = "Recipe")
public class Recipe implements java.io.Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "recipeId", unique = true, nullable = false)
    private int recipeId;
    @Column(name = "title")
    private String title;
    @Column(name = "readyInMinutes")
    private String readyInMinutes;
    @Column(name = "servings")
    private int servings;
    @Column(name = "imageUrl")
    private String imageUrl;
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "recipes")
    private Set<User> users = new HashSet<User>();

    public Recipe() {
    }

    public Recipe(int recipeId, String title, String readyInMinutes, int servings, String imageUrl) {
        this.recipeId = recipeId;
        this.title = title;
        this.readyInMinutes = readyInMinutes;
        this.servings = servings;
        this.imageUrl = imageUrl;
    }

    public Recipe(int recipeId, String title, String readyInMinutes, int servings, String imageUrl, Set<User> users) {
        this.recipeId = recipeId;
        this.title = title;
        this.readyInMinutes = readyInMinutes;
        this.servings = servings;
        this.imageUrl = imageUrl;
        this.users = users;
    }

    public int getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(int recipeId) {
        this.recipeId = recipeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReadyInMinutes() {
        return readyInMinutes;
    }

    public void setReadyInMinutes(String readyInMinutes) {
        this.readyInMinutes = readyInMinutes;
    }

    public int getServings() {
        return servings;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }


    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
    @Override
    public String toString() {
        return "Recipe{" +
                "recipeId=" + recipeId +
                ", title='" + title + '\'' +
                ", readyInMinutes='" + readyInMinutes + '\'' +
                ", servings=" + servings +
                ", imageUrl='" + imageUrl + '\'' +
                ", users=" + users +
                '}';
    }
}
