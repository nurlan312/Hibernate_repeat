package peaksoft.models;

import javax.persistence.*;

@Entity
@Table(name = "cities1")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "city_name")
    private String name;
    @Column(name = "city_location")
    private String location;
    private int population;
    private String mayor;

    public City( String name, String location, int population, String mayor) {
        this.name = name;
        this.location = location;
        this.population = population;
        this.mayor = mayor;
    }

    public City() {
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getMayor() {
        return mayor;
    }

    public void setMayor(String mayor) {
        this.mayor = mayor;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", population=" + population +
                ", mayor='" + mayor + '\'' +
                '}' + "\n";
    }
}
