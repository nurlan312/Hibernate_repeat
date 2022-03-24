package peaksoft.models;

import javax.persistence.*;

@Entity
@Table(name = "laptops")
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String brand;
    @Column(name = "laptop_price")
    private int price;
    private String CPU;
    private String OS;
    @Column(name = "laptop_inch")
    private double inch;

    public Laptop(String brand, int price, String CPU, String OS, double inch) {
        this.brand = brand;
        this.price = price;
        this.CPU = CPU;
        this.OS = OS;
        this.inch = inch;
    }

    public Laptop() {
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

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public double getInch() {
        return inch;
    }

    public void setInch(double inch) {
        this.inch = inch;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", CPU='" + CPU + '\'' +
                ", OS='" + OS + '\'' +
                ", inch=" + inch +
                '}' + "\n";
    }
}
