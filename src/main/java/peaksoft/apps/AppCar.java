package peaksoft.apps;

import peaksoft.configs.HibernateConfigCar;
import peaksoft.models.Car;

public class AppCar {

    public static void main(String[] args) {

        HibernateConfigCar.getSessionFactory();
        Car car1 = new Car("Audi", "White", 1.8, 220);
        HibernateConfigCar.createTableCar(car1);

        Car car2 = new Car("Porsche", "Black", 5.2, 650);
        HibernateConfigCar.createTableCar(car2);

        Car car3 = new Car("Mercedes-Benz", "Silver", 4.6, 420);
        HibernateConfigCar.createTableCar(car3);

        Car car4 = new Car("Tesla", "Blue", 5.6, 750);
        HibernateConfigCar.createTableCar(car4);

        System.out.println("Get all cars: ");
        HibernateConfigCar.getAllCars();

        System.out.println("Update car: ");
        HibernateConfigCar.updateCar(1, "Toyota", "Green", 3.2, 360);

        System.out.println("Get by id: ");
        HibernateConfigCar.getById(4);

        System.out.println("Deleted by id: ");
        HibernateConfigCar.deleteById(3);

        System.out.println("Get all cars: ");
        HibernateConfigCar.getAllCars();

        System.out.println("Deleted all cars: ");
        HibernateConfigCar.deleteAllCars();
    }
}
