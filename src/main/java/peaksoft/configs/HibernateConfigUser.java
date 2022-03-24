package peaksoft.configs;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;
import peaksoft.models.Car;
import peaksoft.models.User;

import javax.persistence.Query;
import java.util.List;
import java.util.Properties;

public class HibernateConfigUser {

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration();
                Properties properties = new Properties();
                properties.put(Environment.DRIVER, "org.postgresql.Driver");
                properties.put(Environment.URL, "jdbc:postgresql://localhost:5432/postgres");
                properties.put(Environment.USER, "postgres");
                properties.put(Environment.PASS, "Tvrandot");
                properties.put(Environment.HBM2DDL_AUTO, "create");
                properties.put(Environment.SHOW_SQL, "true");
                configuration.setProperties(properties);
                configuration.addAnnotatedClass(User.class);
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

    public static void shutDown() {
        getSessionFactory().close();
    }

    public static int createTableUser(User user) {
        try {
            Session session = HibernateConfigUser.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();
            session.close();
            System.err.println("Added successfully: " + user);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return user.getId();
    }

    public static List<User> getAllUsers() {
        List<User> userList = null;
        try (Session session = HibernateConfigUser.getSessionFactory().openSession()) {
            session.beginTransaction();
            userList = session.createQuery("from User").getResultList();
            session.getTransaction().commit();
            session.close();
            System.err.println("Number " + userList.size() + " users.");
            System.err.println(userList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userList;
    }

    public static void updateUser(int id, String user_name, int weight, int height, String hairColor) {
        try (Session session = HibernateConfigUser.getSessionFactory().openSession()) {
            session.beginTransaction();
            User user = session.get(User.class, id);
            user.setName(user_name);
            user.setWeight(weight);
            user.setHeight(height);
            user.setHairColor(hairColor);
            session.getTransaction().commit();
            session.close();
            System.err.println("Successfully update: " + user_name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static User getById(int id) {
        User user = null;
        try (Session session = HibernateConfigUser.getSessionFactory().openSession()) {
            session.beginTransaction();
            user = session.get(User.class, id);
            session.getTransaction().commit();
            session.close();
            System.err.println("Get by id: " + user);
            return user;
        } finally {
            HibernateConfigUser.getSessionFactory();
        }
    }

    public static void deleteById(int id) {
        try (Session session = HibernateConfigUser.getSessionFactory().openSession()) {
            session.beginTransaction();
            User user = session.get(User.class, id);
            session.delete(user);
            session.getTransaction().commit();
            session.close();
            System.err.println("Successfully deleted: " + user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deleteAllUsers() {
        try (Session session = HibernateConfigUser.getSessionFactory().openSession()) {
            session.beginTransaction();
            Query hql = session.createQuery("delete from User");
            hql.executeUpdate();
            session.getTransaction().commit();
            session.close();
            System.err.println("Successfully deleted all data in users");
        }
    }
}
