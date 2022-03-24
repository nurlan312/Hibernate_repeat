package peaksoft.models;

import javax.persistence.*;

@Entity
@Table(name = "apricots")
public class Apricot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "apricot_color")
    private String color;
    private String taste;
    private int weight;
    private String countryOfOrigin;
    @Column(name = "apricot_price")
    private int price;

    public Apricot(String color, String taste, int weight, String countryOfOrigin, int price) {
        this.color = color;
        this.taste = taste;
        this.weight = weight;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
    }

    public Apricot() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Apricot{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", taste='" + taste + '\'' +
                ", weight=" + weight +
                ", countryOfOrigin='" + countryOfOrigin + '\'' +
                ", price=" + price +
                '}' + "\n";
    }
}
