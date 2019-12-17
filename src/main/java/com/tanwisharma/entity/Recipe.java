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
    private String imageUrls;
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "recipes")
    private Set<User> users = new HashSet<User>();

    public Recipe() {
    }

    public Recipe(int recipeId, String title, String readyInMinutes, int servings, String imageUrls) {
        this.recipeId = recipeId;
        this.title = title;
        this.readyInMinutes = readyInMinutes;
        this.servings = servings;
        this.imageUrls = imageUrls;
    }

    public Recipe(int recipeId, String title, String readyInMinutes, int servings, String imageUrls, Set<User> users) {
        this.recipeId = recipeId;
        this.title = title;
        this.readyInMinutes = readyInMinutes;
        this.servings = servings;
        this.imageUrls = imageUrls;
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

    public String getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(String imageUrl) {
        this.imageUrls = imageUrls;
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
                ", imageUrls='" + imageUrls + '\'' +
                ", users=" + users +
                '}';
    }


}
