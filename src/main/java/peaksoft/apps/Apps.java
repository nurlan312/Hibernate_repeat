package peaksoft.apps;

import org.hibernate.Session;
import peaksoft.configs.HibernateConfigs;
import peaksoft.models.*;

import javax.persistence.Query;
import java.util.List;

public class Apps {

    public static void main(String[] args) {

        /**
         *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-* User class *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
         */
        HibernateConfigs.getSessionFactory();
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-* User class *-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
        User user1 = new User("Erkin", 65, 180, "Black");
        createTableUser(user1);

        User user2 = new User("Kanat", 75, 190, "Black");
        createTableUser(user2);

        User user3 = new User("Omur", 55, 160, "White");
        createTableUser(user3);

        User user4 = new User("Seit", 75, 170, "Silver");
        createTableUser(user4);

        System.out.println("Get all users: ");
        getAllUsers();

        System.out.println("Updated user: ");
        updateUser(1, "Erlan", 120, 190, "Black");

        System.out.println("Get by id: ");
        getByIdUser(2);

        System.out.println("Deleted by id: ");
        deleteByIdUser(4);

        System.out.println("Get all users: ");
        getAllUsers();

        System.out.println("Deleted all users");
        deleteAllUsers();
        System.out.println("");

        /**
         *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-* Student class *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
         */
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-* Student class *-*-*-**-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
        Student student1 = new Student("Ulukmyrza", "C#", 29, "ulukmyrza@gmail.com");
        createTableStudent(student1);

        Student student2 = new Student("Venera", "C++", 22, "venera@gmail.com");
        createTableStudent(student2);

        Student student3 = new Student("Mirbek", "Delphi", 37, "mirbek@gmail.com");
        createTableStudent(student3);

        Student student4 = new Student("Meerim", "Swift", 23, "meerim@gmail.com");
        createTableStudent(student4);

        System.out.println("Get all students:");
        getAllStudents();

        System.out.println("Update student:");
        updateStudent(1, "Shergazy", "Python", 23, "shergazy@gmail.com");

        System.out.println("Get by id student:");
        getByIdStudent(2);

        System.out.println("Delete by id:");
        deleteByIdStudent(3);

        System.out.println("Get all students:");
        getAllStudents();

        System.out.println("Successfully removed students:");
        deleteAllStudent();
        System.out.println("");

        /**
         *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-* Car class *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
         */
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-* Car class *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
        Car car1 = new Car("Audi", "White", 1.8, 220);
        createTableCar(car1);

        Car car2 = new Car("Porsche", "Black", 5.2, 650);
        createTableCar(car2);

        Car car3 = new Car("Mercedes-Benz", "Silver", 4.6, 420);
        createTableCar(car3);

        Car car4 = new Car("Tesla", "Blue", 5.6, 750);
        createTableCar(car4);

        System.out.println("Get all cars: ");
        getAllCars();

        System.out.println("Update car: ");
        updateCar(8, "Toyota", "Green", 3.2, 360);

        System.out.println("Get by id: ");
        getByIdCar(5);

        System.out.println("Deleted by id: ");
        deleteByIdCar(6);

        System.out.println("Get all cars: ");
        getAllCars();

        System.out.println("Deleted all cars: ");
        deleteAllCars();
        System.out.println("");

        /**
         *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-* Apricot class *-*-*-*-*-*--*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
         */
        System.out.println("\n *-*-*-*-*-*-*-*-*-*-*-*-*-* Apricot class *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-* \n");
        Apricot apricot1 = new Apricot("Brown", "Sweet", 980000000, "Kyrgyzstan", 5500);
        createTableApricot(apricot1);

        Apricot apricot2 = new Apricot("Yellow", "Sour", 15000000, "Uzbekistan", 2500);
        createTableApricot(apricot2);

        Apricot apricot3 = new Apricot("Red", "Sickly", 500000, "Tajikistan", 1500);
        createTableApricot(apricot3);

        Apricot apricot4 = new Apricot("Orange", "Tasteless", 8500000, "Turkey", 3500);
        createTableApricot(apricot4);

        System.out.println("Get all apricots:");
        getAllApricots();

        System.out.println("Get by id:");
        getByIdApricot(1);

        System.out.println("Updated apricot:");
        updateApricot(3, "Green", "Bitter", 6500000, "Kazakhstan", 2200);

        System.out.println("Deleted by id:");
        deleteByIdApricot(2);

        System.out.println("Get all apricots:");
        getAllApricots();

        System.out.println("Removed table apricots:");
        deleteAllApricots();
        System.out.println("");

        /**
         * *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-* Bank class *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
         */
        System.out.println("*-*-*-*-*-*-*-*-*-*-* Bank class *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-* \n");
        Bank bank1 = new Bank("Sberbank", "German Gref", "Ruble", "Russia");
        createTableBank(bank1);

        Bank bank2 = new Bank("JPMorgan Chase", "James Dimon", "Dollar", "USA");
        createTableBank(bank1);

        Bank bank3 = new Bank("InCore Bank Ag", "Nurlan Mamatkasym uulu", "Som", "Switzerland");
        createTableBank(bank1);

        Bank bank4 = new Bank("BakaiBank", "Solomko Oksana", "Som", "Kyrgyzstan");
        createTableBank(bank1);

        System.out.println("Get all banks:");
        getAllBanks();

        System.out.println("Get by id:");
        getByIdBank(10);

        System.out.println("Updated bank:");
        updateBank(9, "KyrgyzBanky", "Kubanych Bokontaev", "Som", "Kyrgyzstan");

        System.out.println("Deleted by id:");
        deleteByIdBank(12);

        System.out.println("Get all banks:");
        getAllBanks();

        System.out.println("Removed table banks:");
        deleteAllBanks();
        System.out.println("");

        /**
         *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-* City class *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
         */

        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-* City class *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
        City city1 = new City("Bishkek", "Kyrgyzstan", 2000000, "Ulukmyrza Talipov");
        createTableCity(city1);

        City city2 = new City("Osh", "Kyrgyzstan", 1500000, "Mirbek Abylov");
        createTableCity(city2);

        City city3 = new City("Yssyk-Kol", "Kyrgyzstan", 900000, "Bahtyiar Surantaev");
        createTableCity(city3);

        City city4 = new City("Batken", "Kyrgyzstan", 600000, "Kubanych Bakitay");
        createTableCity(city4);

        System.out.println("Get all cities:");
        getAllCities();

        System.out.println("Get by id:");
        getByIdCity(3);

        System.out.println("Updated city:");
        updateCity(4, "Batken", "Kyrgyzstan", 600000, "Venera Abydaeva");

        System.out.println("Deleted by id:");
        deleteByIdCity(2);

        System.out.println("Get all cities:");
        getAllCities();

        System.out.println("Removed table cities:");
        deleteAllCities();
        System.out.println("");

        /**
         *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-* Dog class *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
         */
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-* Dog class *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-* \n");
        Dog dog1 = new Dog("Ak it", 15, "White", 98);
        createTableDog(dog1);

        Dog dog2 = new Dog("Kara it", 25, "Black", 108);
        createTableDog(dog2);

        Dog dog3 = new Dog("Boz it", 25, "Silver", 118);
        createTableDog(dog3);

        Dog dog4 = new Dog("Sary it", 35, "Yellow", 128);
        createTableDog(dog4);

        System.out.println("Get all dogs:");
        getAllDogs();

        System.out.println("Get by id:");
        getByIdDog(3);

        System.out.println("Updated dog:");
        updateDog(3, "Ala it", 10, "Ala", 9);

        System.out.println("Deleted by id:");
        deleteByIdDog(2);

        System.out.println("Get all dogs:");
        getAllDogs();

        System.out.println("Removed table dogs:");
        deleteAllDogs();
        System.out.println("");

        /**
         *-*-*-*-*-*-*-*--*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-* Laptop class *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
         */
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-* Laptop class *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
        Laptop laptop1 = new Laptop("HP", 80000, "Core9", "Windows", 5.6);
        createTableLaptop(laptop1);

        Laptop laptop2 = new Laptop("Lenovo", 90000, "Core11", "Windows", 6.8);
        createTableLaptop(laptop2);

        Laptop laptop3 = new Laptop("Dell", 180000, "Core19", "Windows", 12.5);
        createTableLaptop(laptop3);

        Laptop laptop4 = new Laptop("Acer", 8000, "Core1", "Windows", 3.6);
        createTableLaptop(laptop4);

        System.out.println("Get all laptops:");
        getAllLaptops();

        System.out.println("Get by id:");
        getByIdLaptop(3);

        System.out.println("Updated laptop:");
        updateLaptop(4, "Sony", 16000, "Core7", "Windows", 6.6);

        System.out.println("Deleted by id:");
        deleteByIdLaptop(3);

        System.out.println("Get all laptops:");
        getAllLaptops();

        System.out.println("Removed table laptops:");
        deleteAllLaptops();
        System.out.println("");

        /**
         *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-* Pen class *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-**-*-*-*-*
         */
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-* Pen class *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
        Pen pen1 = new Pen("Parker", 2500000, "Black", 20);
        createTablePen(pen1);

        Pen pen2 = new Pen("Waterman", 2000000, "Blue", 18);
        createTablePen(pen2);

        Pen pen3 = new Pen("Visconti", 2200000, "Black", 17);
        createTablePen(pen3);

        Pen pen4 = new Pen("Lamy", 2300000, "Red", 22);
        createTablePen(pen4);

        Pen pen5 = new Pen("Kaweco", 1800000, "Blue", 16);
        createTablePen(pen5);

        Pen pen6 = new Pen("Relikan", 1600000, "Black", 12);
        createTablePen(pen6);

        System.out.println("Get all pens:");
        getAllPens();

        System.out.println("Updated pen:");
        updatePen(4, "Diplomat", 1100000, "Black", 15);

        System.out.println("Get all pens:");
        getAllPens();

        System.out.println("Removed table pens:");
        deleteAllPens();
        System.out.println("");

        /**
         *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-* Pharmacy class *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
         */
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-* Pharmacy class *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
        Pharmacy pharmacy1 = new Pharmacy("Samson-Farma", 987, 1235665, "Zamira Keldibaeva");
        createTablePharmacy(pharmacy1);

        Pharmacy pharmacy2 = new Pharmacy("Rigla", 327, 12355, "Elnura Tadjibaeva");
        createTablePharmacy(pharmacy2);

        Pharmacy pharmacy3 = new Pharmacy("Evalar", 87, 3565, "Gulsair Matraimova");
        createTablePharmacy(pharmacy3);

        Pharmacy pharmacy4 = new Pharmacy("Samson-Farma", 987, 1235665, "Zamira Keldibaeva");
        createTablePharmacy(pharmacy4);

        System.out.println("Get all pharmacies:");
        getAllPharmacies();

        System.out.println("Updated pharmacy:");
        updatePharmacy(4, "Neofarm", 98, 235665, "Meerim Baltabeva");

        System.out.println("Get all pens:");
        getAllPharmacies();

        System.out.println("Removed table pharmacies:");
        deleteAllPharmacies();
        System.out.println("");

        /**
         *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-* Phone class *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
         */
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-* Phone class *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
        Phone phone1 = new Phone("Poco", 45000, 5100, 5.2);
        createTablePhone(phone1);

        Phone phone2 = new Phone("Samsung", 95000, 5000, 6.2);
        createTablePhone(phone2);

        Phone phone3 = new Phone("Nokia", 25000, 3100, 4.3);
        createTablePhone(phone3);

        Phone phone4 = new Phone("Xiaomi", 65000, 4600, 4.8);
        createTablePhone(phone4);

        Phone phone5 = new Phone("Iphone", 145000, 6500, 5.4);
        createTablePhone(phone5);

        Phone phone6 = new Phone("Sony", 15000, 2800, 3.2);
        createTablePhone(phone6);

        System.out.println("Get all phones:");
        getAllPhones();

        System.out.println("Updated phone:");
        updatePhone(2, "Gigaset", 5000, 1100, 1.2);

        System.out.println("Get all pens:");
        getAllPhones();

        System.out.println("Removed table phones:");
        deleteAllPhones();
    }

    /**
     *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-* Apricot class *-*-*-*-*-*--*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
     */

    public static int createTableApricot(Apricot apricot) {
        try (Session session = HibernateConfigs.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.save(apricot);
            session.getTransaction().commit();
            session.close();
            System.out.println("Added successfully: " + apricot);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return apricot.getId();
    }

    public static List<Apricot> getAllApricots() {
        List<Apricot> apricotList = null;
        try (Session session = HibernateConfigs.getSessionFactory().openSession()) {
            session.beginTransaction();
            apricotList = session.createQuery("from Apricot").getResultList();
            session.getTransaction().commit();
            session.close();
            System.out.println("Finded " + apricotList.size() + " apricots");
            System.out.println(apricotList);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return apricotList;
    }

    public static void updateApricot(int id, String color, String taste, int weight, String countryOfOrigin, int price) {
        try (Session session = HibernateConfigs.getSessionFactory().openSession()) {
            session.beginTransaction();
            Apricot apricot = session.get(Apricot.class, id);
            apricot.setColor(color);
            apricot.setTaste(taste);
            apricot.setWeight(weight);
            apricot.setCountryOfOrigin(countryOfOrigin);
            apricot.setPrice(price);
            session.getTransaction().commit();
            session.close();
            System.out.println("Successfully updated: " + apricot);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static Apricot getByIdApricot(int id) {
        Apricot apricot = null;
        try (Session session = HibernateConfigs.getSessionFactory().openSession()) {
            session.beginTransaction();
            apricot = session.get(Apricot.class, id);
            session.getTransaction().commit();
            session.close();
            System.out.println("Get by id: " + apricot);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return apricot;
    }

    public static void deleteByIdApricot(int id) {
        try (Session session = HibernateConfigs.getSessionFactory().openSession()) {
            session.beginTransaction();
            Apricot apricot = session.get(Apricot.class, id);
            session.delete(apricot);
            session.getTransaction().commit();
            session.close();
            System.out.println("Successfully deleted by id: " + apricot);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void deleteAllApricots() {
        try (Session session = HibernateConfigs.getSessionFactory().openSession()) {
            session.beginTransaction();
            Query hql = session.createQuery("delete from Apricot");
            hql.executeUpdate();
            session.getTransaction().commit();
            session.close();
            System.out.println("Table deleted successfully");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-* Bank class *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
     */

    public static int createTableBank(Bank bank) {
        try {
            Session session = HibernateConfigs.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(bank);
            session.getTransaction().commit();
            session.close();
            System.out.println("Added successfully: " + bank);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return bank.getId();
    }

    public static List<Bank> getAllBanks() {
        List<Bank> bankList = null;
        try {
            Session session = HibernateConfigs.getSessionFactory().openSession();
            session.beginTransaction();
            bankList = session.createQuery("from Bank").getResultList();
            session.getTransaction().commit();
            session.close();
            System.out.println("Finded " + bankList.size() + " bakns");
            System.out.println(bankList);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return bankList;
    }

    public static Bank getByIdBank(int id) {
        Bank bank = null;
        try {
            Session session = HibernateConfigs.getSessionFactory().openSession();
            session.beginTransaction();
            bank = session.get(Bank.class, id);
            session.getTransaction().commit();
            session.close();
            System.out.println("Get by id: " + bank);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return bank;
    }

    public static void deleteByIdBank(int id) {
        try {
            Session session = HibernateConfigs.getSessionFactory().openSession();
            session.beginTransaction();
            Bank bank = session.get(Bank.class, id);
            session.getTransaction().commit();
            session.close();
            System.out.println("successfully deleted: " + bank);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void deleteAllBanks() {
        try {
            Session session = HibernateConfigs.getSessionFactory().openSession();
            session.beginTransaction();
            Query hql = session.createQuery("delete from Bank");
            hql.executeUpdate();
            session.getTransaction().commit();
            session.close();
            System.out.println("Successfully removed banks");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void updateBank(int id, String name, String owner, String currency, String location) {
        try {
            Session session = HibernateConfigs.getSessionFactory().openSession();
            session.beginTransaction();
            Bank bank = session.get(Bank.class, id);
            bank.setName(name);
            bank.setOwner(owner);
            bank.setCurrency(currency);
            bank.setLocation(location);
            session.getTransaction().commit();
            session.close();
            System.out.println("Successfully updated bank: " + bank);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-* City class *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
     */

    public static int createTableCity(City city) {
        try (Session session = HibernateConfigs.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.save(city);
            session.getTransaction().commit();
            session.close();
            System.out.println("Added successfully" + city);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return city.getId();
    }

    public static List<City> getAllCities() {
        List<City> cityList = null;
        try {
            Session session = HibernateConfigs.getSessionFactory().openSession();
            session.beginTransaction();
            cityList = session.createQuery("from City").getResultList();
            session.getTransaction().commit();
            session.close();
            System.out.println("Finded " + cityList.size() + " cities");
            System.out.println(cityList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cityList;
    }

    public static void updateCity(int id, String name, String location, int population, String mayor) {
        try {
            Session session = HibernateConfigs.getSessionFactory().openSession();
            session.beginTransaction();
            City city = session.get(City.class, id);
            city.setName(name);
            city.setLocation(location);
            city.setPopulation(population);
            city.setMayor(mayor);
            session.getTransaction().commit();
            session.close();
            System.out.println("Successfully updated: " + city);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static City getByIdCity(int id) {
        City city = null;
        try {
            Session session = HibernateConfigs.getSessionFactory().openSession();
            session.beginTransaction();
            city = session.get(City.class, id);
            session.getTransaction().commit();
            session.close();
            System.out.println("Get by id: " + city);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return city;
    }

    public static void deleteByIdCity(int id) {
        try {
            Session session = HibernateConfigs.getSessionFactory().openSession();
            session.beginTransaction();
            City city = session.get(City.class, id);
            session.delete(city);
            session.getTransaction().commit();
            session.close();
            System.out.println("Successfully deleted id: " + city);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deleteAllCities() {
        try {
            Session session = HibernateConfigs.getSessionFactory().openSession();
            session.beginTransaction();
            Query hql = session.createQuery("delete from City");
            hql.executeUpdate();
            session.getTransaction().commit();
            session.close();
            System.out.println("Successfully removed cities");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-* Dog class *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
     */

    public static int createTableDog(Dog dog) {
        try (Session session = HibernateConfigs.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.save(dog);
            session.getTransaction().commit();
            session.close();
            System.out.println("Added successfully: " + dog);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dog.getId();
    }

    public static List<Dog> getAllDogs() {
        List<Dog> dogList = null;
        try (Session session = HibernateConfigs.getSessionFactory().openSession()) {
            session.beginTransaction();
            dogList = session.createQuery("from Dog").getResultList();
            session.getTransaction().commit();
            session.close();
            System.out.println("Finded " + dogList.size() + " dogs");
            System.out.println(dogList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dogList;
    }

    public static void updateDog(int id, String name, int age, String color, int weight) {
        try (Session session = HibernateConfigs.getSessionFactory().openSession()) {
            session.beginTransaction();
            Dog dog = session.get(Dog.class, id);
            dog.setName(name);
            dog.setAge(age);
            dog.setColor(color);
            dog.setWeight(weight);
            session.getTransaction().commit();
            session.close();
            System.out.println("Successfully updated: " + dog);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Dog getByIdDog(int id) {
        Dog dog = null;
        try (Session session =HibernateConfigs.getSessionFactory().openSession()) {
            session.beginTransaction();
            dog = session.get(Dog.class, id);
            session.getTransaction().commit();
            session.close();
            System.out.println("Get by id:" + dog);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dog;
    }

    public static void deleteByIdDog(int id) {
        try (Session session = HibernateConfigs.getSessionFactory().openSession()) {
            session.beginTransaction();
            Dog dog = session.get(Dog.class, id);
            session.delete(dog);
            session.getTransaction().commit();
            session.close();
            System.out.println("Deleted by id: " + dog);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deleteAllDogs() {
        try (Session session = HibernateConfigs.getSessionFactory().openSession()) {
            session.beginTransaction();
            Query hql = session.createQuery("delete from Dog");
            hql.executeUpdate();
            session.getTransaction().commit();
            session.close();
            System.out.println("Successfully deleted table Dog");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     *-*-*-*-*-*-*-*--*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-* Laptop class *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
     */

    public static int createTableLaptop(Laptop laptop) {
        try {
            Session session = HibernateConfigs.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(laptop);
            session.getTransaction().commit();
            session.close();
            System.out.println("Added successfully: " + laptop);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return laptop.getId();
    }

    public  static List<Laptop> getAllLaptops() {
        List<Laptop> laptopList = null;
        try {
            Session session = HibernateConfigs.getSessionFactory().openSession();
            session.beginTransaction();
            laptopList = session.createQuery("from Laptop").getResultList();
            session.getTransaction().commit();
            session.close();
            System.out.println("Finded " + laptopList.size() + " laptops");
            System.out.println(laptopList);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return laptopList;
    }

    public static void updateLaptop(int id, String brand, int price, String CPU, String OS, double inch) {
        try {
            Session session = HibernateConfigs.getSessionFactory().openSession();
            session.beginTransaction();
            Laptop laptop = session.get(Laptop.class, id);
            laptop.setBrand(brand);
            laptop.setPrice(price);
            laptop.setCPU(CPU);
            laptop.setOS(OS);
            laptop.setInch(inch);
            session.getTransaction().commit();
            session.close();
            System.out.println("Successfully updated: " + laptop);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deleteByIdLaptop(int id) {
        try {
            Session session = HibernateConfigs.getSessionFactory().openSession();
            session.beginTransaction();
            Laptop laptop = session.get(Laptop.class, id);
            session.delete(laptop);
            session.getTransaction().commit();
            session.close();
            System.out.println("Deleted by id: " + laptop);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Laptop getByIdLaptop(int id) {
        Laptop laptop = null;
        try {
            Session session = HibernateConfigs.getSessionFactory().openSession();
            session.beginTransaction();
            laptop = session.get(Laptop.class, id);
            session.getTransaction().commit();
            session.close();
            System.out.println("Get by id: " + laptop);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return laptop;
    }

    public static void deleteAllLaptops() {
        try {
            Session session = HibernateConfigs.getSessionFactory().openSession();
            session.beginTransaction();
            Query hql = session.createQuery("delete from Laptop");
            hql.executeUpdate();
            session.getTransaction().commit();
            session.close();
            System.out.println("Successfully removed Laptops");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-* Pen class *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
     */

    public static int createTablePen(Pen pen) {
        try (Session session = HibernateConfigs.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.save(pen);
            session.getTransaction().commit();
            session.close();
            System.out.println("Added successfully: " + pen);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return pen.getId();
    }

    public static List<Pen> getAllPens() {
        List<Pen> penList = null;
        try (Session session = HibernateConfigs.getSessionFactory().openSession()) {
            session.beginTransaction();
            penList = session.createQuery("from Pen").getResultList();
            session.getTransaction().commit();
            session.close();
            System.out.println("Number " + penList.size() + " pens");
            System.out.println(penList);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return penList;
    }

    public static void updatePen(int id, String manufacturer, int price, String color, int height) {
        try (Session session = HibernateConfigs.getSessionFactory().openSession()) {
            session.beginTransaction();
            Pen pen = session.get(Pen.class, id);
            pen.setManufacturer(manufacturer);
            pen.setPrice(price);
            pen.setColor(color);
            pen.setHeight(height);
            session.getTransaction().commit();
            session.close();
            System.out.println("Successfully updated: " + pen);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void deleteAllPens() {
        try (Session session = HibernateConfigs.getSessionFactory().openSession()) {
            session.beginTransaction();
            Query hql = session.createQuery("delete from Pen");
            hql.executeUpdate();
            session.getTransaction().commit();
            session.close();
            System.out.println("Successfully removed pens");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-* Pharmacy class *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
     */

    public static int createTablePharmacy(Pharmacy pharmacy) {
        try {
            Session session = HibernateConfigs.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(pharmacy);
            session.getTransaction().commit();
            session.close();
            System.out.println("Added successfully: " + pharmacy);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pharmacy.getId();
    }

    public static List<Pharmacy> getAllPharmacies() {
        List<Pharmacy> pharmacyList = null;
        try {
            Session session = HibernateConfigs.getSessionFactory().openSession();
            session.beginTransaction();
            pharmacyList = session.createQuery("from Pharmacy").getResultList();
            session.getTransaction().commit();
            session.close();
            System.out.println("Finded " + pharmacyList.size() + " pharmacies");
            System.out.println(pharmacyList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pharmacyList;
    }

    public static void updatePharmacy(int id, String name, int numberOfSets, int numberOfEmployees, String owner) {
        try {
            Session session = HibernateConfigs.getSessionFactory().openSession();
            session.beginTransaction();
            Pharmacy pharmacy = session.get(Pharmacy.class, id);
            pharmacy.setName(name);
            pharmacy.setNumberOfSets(numberOfSets);
            pharmacy.setNumberOfEmployees(numberOfEmployees);
            pharmacy.setOwner(owner);
            System.out.println("Successfully updated: " + pharmacy);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deleteAllPharmacies() {
        try {
            Session session = HibernateConfigs.getSessionFactory().openSession();
            session.beginTransaction();
            Query hql = session.createQuery("delete from Pharmacy");
            hql.executeUpdate();
            session.getTransaction().commit();
            session.close();
            System.out.println("Successfully removed pharmacies");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-* Phone class *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
     */

    public static int createTablePhone(Phone phone) {
        try {
            Session session = HibernateConfigs.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(phone);
            session.getTransaction().commit();
            session.close();
            System.out.println("Added successfully: " + phone);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return phone.getId();
    }

    public static List<Phone> getAllPhones() {
        List<Phone> phoneList = null;
        try (Session session = HibernateConfigs.getSessionFactory().openSession()) {
            session.beginTransaction();
            phoneList = session.createQuery("from Phone ").getResultList();
            session.getTransaction().commit();
            session.close();
            System.out.println("Finded " + phoneList.size() + " phones");
            System.out.println(phoneList);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return phoneList;
    }

    public static void updatePhone(int id, String brand, int price, int batteryCapacity, double inch) {
        try (Session session = HibernateConfigs.getSessionFactory().openSession()) {
            session.beginTransaction();
            Phone phone = session.get(Phone.class, id);
            phone.setBrand(brand);
            phone.setPrice(price);
            phone.setBatteryCapacity(batteryCapacity);
            phone.setInch(inch);
            session.getTransaction().commit();
            session.close();
            System.out.println("Successfully updated:  " + phone);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void deleteAllPhones() {
        try (Session session = HibernateConfigs.getSessionFactory().openSession()) {
            session.beginTransaction();
            Query hql = session.createQuery("delete from Phone");
            hql.executeUpdate();
            session.getTransaction().commit();
            session.close();
            System.out.println("Successfully removed phones");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-* Car class *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
     */
    public static int createTableCar(Car car) {
        try (Session session = HibernateConfigs.getSessionFactory().openSession()) {
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
        try (Session session = HibernateConfigs.getSessionFactory().openSession()) {
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
        try (Session session = HibernateConfigs.getSessionFactory().openSession()) {
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

    public static Car getByIdCar(int id) {
        Car car = null;
        try (Session session = HibernateConfigs.getSessionFactory().openSession()) {
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

    public static void deleteByIdCar(int id) {
        try (Session session = HibernateConfigs.getSessionFactory().openSession()) {
            session.beginTransaction();
            Car car = session.get(Car.class, id);
            session.delete(car);
            session.getTransaction().commit();
            session.close();
            System.out.println("Successfully deleted by id: " + car);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void deleteAllCars() {
        try (Session session = HibernateConfigs.getSessionFactory().openSession()) {
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

    /**
     *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-* Student class *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
     */
    public static int createTableStudent(Student student) {
        try {
            Session session = HibernateConfigs.getSessionFactory().openSession();
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
        try (Session session = HibernateConfigs.getSessionFactory().openSession()) {
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
            Session session = HibernateConfigs.getSessionFactory().openSession();
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

    public static Student getByIdStudent(int id) {
        Student student = null;
        try {
            Session session = HibernateConfigs.getSessionFactory().openSession();
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

    public static void deleteByIdStudent(int id) {
        try (Session session = HibernateConfigs.getSessionFactory().openSession()) {
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
        try (Session session = HibernateConfigs.getSessionFactory().openSession()) {
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

    /**
     *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-* User class *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
     */
    public static int createTableUser(User user) {
        try {
            Session session = HibernateConfigs.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();
            session.close();
            System.out.println("Added successfully: " + user);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return user.getId();
    }

    public static List<User> getAllUsers() {
        List<User> userList = null;
        try (Session session = HibernateConfigs.getSessionFactory().openSession()) {
            session.beginTransaction();
            userList = session.createQuery("from User").getResultList();
            session.getTransaction().commit();
            session.close();
            System.out.println("Number " + userList.size() + " users.");
            System.out.println(userList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userList;
    }

    public static void updateUser(int id, String user_name, int weight, int height, String hairColor) {
        try (Session session = HibernateConfigs.getSessionFactory().openSession()) {
            session.beginTransaction();
            User user = session.get(User.class, id);
            user.setName(user_name);
            user.setWeight(weight);
            user.setHeight(height);
            user.setHairColor(hairColor);
            session.getTransaction().commit();
            session.close();
            System.out.println("Successfully update: " + user_name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static User getByIdUser(int id) {
        User user = null;
        try (Session session = HibernateConfigs.getSessionFactory().openSession()) {
            session.beginTransaction();
            user = session.get(User.class, id);
            session.getTransaction().commit();
            session.close();
            System.out.println("Get by id: " + user);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return user;
    }

    public static void deleteByIdUser(int id) {
        try (Session session = HibernateConfigs.getSessionFactory().openSession()) {
            session.beginTransaction();
            User user = session.get(User.class, id);
            session.delete(user);
            session.getTransaction().commit();
            session.close();
            System.out.println("Successfully deleted: " + user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deleteAllUsers() {
        try (Session session = HibernateConfigs.getSessionFactory().openSession()) {
            session.beginTransaction();
            Query hql = session.createQuery("delete from User");
            hql.executeUpdate();
            session.getTransaction().commit();
            session.close();
            System.out.println("Successfully deleted all data in users");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
