package peaksoft.models;

import javax.persistence.*;

@Entity
@Table(name = "phones")
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "phone_brand")
    private String brand;
    @Column(name = "phone_price")
    private int price;
    private int batteryCapacity;
    @Column(name = "phone_inch")
    private double inch;

    public Phone(String brand, int price, int batteryCapacity, double inch) {
        this.brand = brand;
        this.price = price;
        this.batteryCapacity = batteryCapacity;
        this.inch = inch;
    }

    public Phone() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public double getInch() {
        return inch;
    }

    public void setInch(double inch) {
        this.inch = inch;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", batteryCapacity=" + batteryCapacity +
                ", inch=" + inch +
                '}' + "\n";
    }
}
