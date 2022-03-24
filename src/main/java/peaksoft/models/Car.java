package peaksoft.models;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "car_mark", length = 15)
    private String mark;
    @Column(name = "car_color", length = 25)
    private String color;
    @Column(scale = 15)
    private double capacity;
    @Column(length = 360)
    private int speed;

    public Car(String mark, String color, double capacity, int speed) {
        this.mark = mark;
        this.color = color;
        this.capacity = capacity;
        this.speed = speed;
    }

    public Car() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", color='" + color + '\'' +
                ", capacity=" + capacity +
                ", speed=" + speed +
                '}' + "\n";
    }
}
