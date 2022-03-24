package peaksoft.configs;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;
import peaksoft.models.Student;

import javax.persistence.Query;
import java.util.List;
import java.util.Properties;

public class HibernateConfigStudent {

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration();
                Properties properties = new Properties();
                properties.put(Environment.DRIVER, "org.postgresql.Driver");
                properties.put(Environment.USER, "postgres");
                properties.put(Environment.PASS, "Tvrandot");
                properties.put(Environment.HBM2DDL_AUTO, "create");
                properties.put(Environment.URL, "jdbc:postgresql://localhost:5432/postgres");
                properties.put(Environment.SHOW_SQL, "true");
//                properties.put(Environment.FORMAT_SQL, "true");
                configuration.setProperties(properties);
                configuration.addAnnotatedClass(Student.class);

                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties()).build();
                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            } catch (Exception e) {
                e.getMessage();
            }
        }
        return sessionFactory;
    }

    public static int createTableStudent(Student student) {
        try {
            Session session = HibernateConfigStudent.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(student);
            session.getTransaction().commit();
            session.close();
            System.out.println("Added successfully" + student);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return student.getId();
    }

    public static void updateStudent(int id, String name, String course, int age, String email) {
        try (Session session = HibernateConfigStudent.getSessionFactory().openSession()) {
            session.beginTransaction();
            Student student = session.get(Student.class, id);
            student.setName(name);
            student.setCourse(course);
            student.setAge(age);
            student.setEmail(email);
            session.getTransaction().commit();
            session.close();
            System.out.println("Successfully updated: " + name);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static List<Student> getAllStudents() {
        List<Student> studentList = null;
        try {
            Session session = HibernateConfigStudent.getSessionFactory().openSession();
            session.beginTransaction();
            studentList = session.createQuery("from Student").getResultList();
            session.getTransaction().commit();
            session.close();
            System.out.println("Finded " + studentList.size() + " student");
            System.out.println(studentList);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return studentList;
    }

    public static Student getById(int id) {
        Student student = null;
        try {
            Session session = HibernateConfigStudent.getSessionFactory().openSession();
            session.beginTransaction();
            student = session.get(Student.class, id);
            session.getTransaction().commit();
            session.close();
            System.out.println("Get by id: " + student);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return student;
    }

    public static void deleteById(int id) {
        try (Session session = HibernateConfigStudent.getSessionFactory().openSession()) {
            session.beginTransaction();
            Student student = session.get(Student.class, id);
            session.delete(student);
            session.getTransaction().commit();
            session.close();
            System.out.println("Successfully deleted: " + student);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void deleteAllStudent() {
        try (Session session = HibernateConfigStudent.getSessionFactory().openSession()) {
            session.beginTransaction();
            Query hql = session.createQuery("delete from Student");
            hql.executeUpdate();
            session.getTransaction().commit();
            session.close();
            System.out.println("Successfully deleted all data in students");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public static void dropTableStudent() {
//        try {
//            Session session = HibernateConfig.getSessionFactory().openSession();
//            session.beginTransaction();
//            Query hql = session.createQuery("drop table Student");
//            hql.executeUpdate();
//            session.getTransaction().commit();
//            session.close();
//            System.out.println("successfully drop table Student");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
}