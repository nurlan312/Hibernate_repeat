package peaksoft.configs;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;
import peaksoft.models.*;

import java.util.Properties;

public class HibernateConfigs {

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
                properties.put(Environment.SHOW_SQL, "ture");
                configuration.setProperties(properties);
                configuration.addAnnotatedClass(Apricot.class);
                configuration.addAnnotatedClass(Bank.class);
                configuration.addAnnotatedClass(City.class);
                configuration.addAnnotatedClass(Dog.class);
                configuration.addAnnotatedClass(Laptop.class);
                configuration.addAnnotatedClass(Pen.class);
                configuration.addAnnotatedClass(Pharmacy.class);
                configuration.addAnnotatedClass(Phone.class);

                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties()).build();
                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return sessionFactory;
    }
}
