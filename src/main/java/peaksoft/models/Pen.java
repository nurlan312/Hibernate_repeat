package peaksoft.models;

import javax.persistence.*;

@Entity
@Table(name = "pens")
public class Pen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String manufacturer;
    @Column(name = "pen_price")
    private int price;
    @Column(name = "pen_color")
    private String color;
    private int height;

    public Pen(String manufacturer, int price, String color, int height) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.color = color;
        this.height = height;
    }

    public Pen() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "id=" + id +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", height=" + height +
                '}' + "\n";
    }
}
