package peaksoft.models;

import javax.persistence.*;

@Entity
@Table(name = "users3")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "user_name", length = 15)
    private String name;
    @Column(name = "user_weight", length = 2)
    private int weight;
    @Column(name = "user_height", length = 2)
    private int height;
    @Column(name = "user_hair_color")
    private String hairColor;

    public User(String name, int weight, int height, String hairColor) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.hairColor = hairColor;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", hairColor='" + hairColor + '\'' +
                '}' + "\n";
    }
}
