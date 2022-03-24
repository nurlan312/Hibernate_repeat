package peaksoft.configs;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;
import peaksoft.models.Car;

import javax.persistence.Query;
import java.util.List;
import java.util.Properties;

public class HibernateConfigCar {

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration();
                Properties properties = new Properties();
                properties.put(Environment.DRIVER, "org.postgresql.Driver");
                properties.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQL9Dialect");
                properties.put(Environment.URL, "jdbc:postgresql://localhost:5432/postgres");
                properties.put(Environment.USER, "postgres");
                properties.put(Environment.PASS, "Tvrandot");
                properties.put(Environment.HBM2DDL_AUTO, "create");
                properties.put(Environment.FORMAT_SQL, "true");
                configuration.setProperties(properties);
                configuration.addAnnotatedClass(Car.class);

                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties()).build();
                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return sessionFactory;
    }

    public static int createTableCar(Car car) {
        try (Session session = HibernateConfigCar.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.save(car);
            session.getTransaction().commit();
            session.close();
            System.out.println("Added successfully: " + car);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return car.getId();
    }

    public static List<Car> getAllCars() {
        List<Car> carList = null;
        try (Session session = HibernateConfigCar.getSessionFactory().openSession()) {
            session.beginTransaction();
            carList = session.createQuery("from Car").getResultList();
            session.getTransaction().commit();
            session.close();
            System.out.println("Number " + carList.size() + " car");
            System.out.println(carList);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return carList;
    }

    public static void updateCar(int id, String mark, String color, double capacity, int speed) {
        try (Session session = HibernateConfigCar.getSessionFactory().openSession()) {
            session.beginTransaction();
            Car car = session.get(Car.class, id);
            car.setMark(mark);
            car.setColor(color);
            car.setCapacity(capacity);
            car.setSpeed(speed);
            session.getTransaction().commit();
            session.close();
            System.out.println("Successfully updated: " + car);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static Car getById(int id) {
        Car car = null;
        try (Session session = HibernateConfigCar.getSessionFactory().openSession()) {
            session.beginTransaction();
            car = session.get(Car.class, id);
            session.getTransaction().commit();
            session.close();
            System.out.println("Get by id: " + car);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return car;
    }

    public static void deleteById(int id) {
        try (Session session = HibernateConfigCar.getSessionFactory().openSession()) {
            session.beginTransaction();
            Car car = session.get(Car.class, id);
            session.delete(car);
            session.getTransaction().commit();
            session.close();
            System.out.println("Successfully deleted by id: " + car);
        }
    }

    public static void deleteAllCars() {
        try (Session session = HibernateConfigCar.getSessionFactory().openSession()) {
            session.beginTransaction();
            Query hql = session.createQuery("delete from Car");
            hql.executeUpdate();
            session.getTransaction().commit();
            session.close();
            System.out.println("Table deleted successfully");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}