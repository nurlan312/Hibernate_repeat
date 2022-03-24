package peaksoft.models;

import javax.persistence.*;

@Entity
@Table(name = "pharmacies")
public class Pharmacy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "pharmacy_name")
    private String name;
    private int numberOfSets;
    private int numberOfEmployees;
    @Column(name = "pharmacy_owner")
    private String owner;

    public Pharmacy(String name, int numberOfSets, int numberOfEmployees, String owner) {
        this.name = name;
        this.numberOfSets = numberOfSets;
        this.numberOfEmployees = numberOfEmployees;
        this.owner = owner;
    }

    public Pharmacy() {
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

    public int getNumberOfSets() {
        return numberOfSets;
    }

    public void setNumberOfSets(int numberOfSets) {
        this.numberOfSets = numberOfSets;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", numberOfSets=" + numberOfSets +
                ", numberOfEmployees=" + numberOfEmployees +
                ", owner='" + owner + '\'' +
                '}' + "\n";
    }
}
