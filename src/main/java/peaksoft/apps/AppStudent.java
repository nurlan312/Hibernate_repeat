package peaksoft.apps;

import peaksoft.configs.HibernateConfigStudent;
import peaksoft.configs.HibernateConfigUser;
import peaksoft.models.Car;
import peaksoft.models.Student;
import peaksoft.models.User;

public class AppStudent {
    public static void main( String[] args ) {

        HibernateConfigStudent.getSessionFactory();
        Student student1 = new Student("Ulukmyrza", "C#", 29, "ulukmyrza@gmail.com");
        HibernateConfigStudent.createTableStudent(student1);

        Student student2 = new Student("Venera", "C++", 22, "venera@gmail.com");
        HibernateConfigStudent.createTableStudent(student2);

        Student student3 = new Student("Mirbek", "Delphi", 37, "mirbek@gmail.com");
        HibernateConfigStudent.createTableStudent(student3);

        Student student4 = new Student("Meerim", "Swift", 23, "meerim@gmail.com");
        HibernateConfigStudent.createTableStudent(student4);

        System.out.println("Get all students:");
        HibernateConfigStudent.getAllStudents();

        System.out.println("Update student:");
        HibernateConfigStudent.updateStudent(1, "Shergazy", "Python", 23, "shergazy@gmail.com");

        System.out.println("Get by id student:");
        HibernateConfigStudent.getById(2);

        System.out.println("Delete by id:");
        HibernateConfigStudent.deleteById(3);

        System.out.println("Get all students:");
        HibernateConfigStudent.getAllStudents();

        HibernateConfigStudent.deleteAllStudent();
    }
}
