package com.tanwisharma.entity;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
/**
 * A Favorite class.
 *
 * @author tanwi
 */
@Entity(name = "Favorite")
@Table(name = "favorite")
public class Favorite implements java.io.Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    @Column(name="favorite_id")
    private int id;
    @Column(name = "recipeId")
    private String recipeId;
    @Column(name = "title")
    private String title;
    @ManyToOne
    @JoinColumn(name = "user_id",
            foreignKey = @ForeignKey(name = "favorites_user_id_fk")
    )
    private User user;

    /**
     * Favorite contructor
     */
    public Favorite() {
    }

    /**
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return
     */
    public String getRecipeId() {
        return recipeId;
    }

    /**
     * @param recipeId
     */
    public void setRecipeId(String recipeId) {
        this.recipeId = recipeId;
    }

    /**
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return "Favorite{" +
                "id=" + id +
                ", recipeId='" + recipeId + '\'' +
                ", title='" + title + '\'' +
                ", user=" + user +
                '}';
    }
}
