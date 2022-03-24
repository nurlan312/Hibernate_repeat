package peaksoft.apps;

import org.hibernate.Session;
import peaksoft.configs.HibernateConfigs;
import peaksoft.models.*;

import javax.persistence.Query;
import java.util.List;

public class Apps {

    public static void main(String[] args) {

        HibernateConfigs.getSessionFactory();
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
        getByIdBank(3);

        System.out.println("Updated bank:");
        updateBank(3, "KyrgyzBanky", "Kubanych Bokontaev", "Som", "Kyrgyzstan");

        System.out.println("Deleted by id:");
        deleteByIdBank(4);

        System.out.println("Get all banks:");
        getAllBanks();

        System.out.println("Removed table apricots:");
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
}
