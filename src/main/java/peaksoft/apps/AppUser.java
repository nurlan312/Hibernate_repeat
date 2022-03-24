package peaksoft.apps;

import peaksoft.configs.HibernateConfigUser;
import peaksoft.models.User;

public class AppUser {

    public static void main(String[] args) {

        HibernateConfigUser.getSessionFactory();
        User user1 = new User("Erkin", 65, 180, "Black");
        HibernateConfigUser.createTableUser(user1);

        User user2 = new User("Kanat", 75, 190, "Black");
        HibernateConfigUser.createTableUser(user2);

        User user3 = new User("Omur", 55, 160, "White");
        HibernateConfigUser.createTableUser(user3);

        User user4 = new User("Seit", 75, 170, "Silver");
        HibernateConfigUser.createTableUser(user4);

        System.out.println("Get all users: ");
        HibernateConfigUser.getAllUsers();

        System.out.println("Updated user: ");
        HibernateConfigUser.updateUser(1, "Erlan", 120, 190, "Black");

        System.out.println("Get by id: ");
        HibernateConfigUser.getById(2);

        System.out.println("Deleted by id: ");
        HibernateConfigUser.deleteById(4);

        System.out.println("Get all users: ");
        HibernateConfigUser.getAllUsers();

        System.out.println("Deleted all users");
        HibernateConfigUser.deleteAllUsers();
    }
}
