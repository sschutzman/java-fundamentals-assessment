import java.util.ArrayList;

public class Assessment {

    public static int square(int x) {
        return x*x;
    }

    public static int sum(double x, double y) {
        return (int) (x + y);

    }

    public static double average(double[] array)
    {
        int sum = 0;
        for(double i : array) sum += i;
        return ((double) sum)/array.length;
    }
    private static ArrayList<User> capitalizeRecords(ArrayList<User> userArr) {
        System.out.println("============== User() Test Begins =============");
        User u1 = new User("washingtoN", "navarrO", true);
        System.out.println("Should be washingtoN: "+u1.getFirstName());
        System.out.println("Should be navarrO: "+u1.getLastName());
        System.out.println("Should be true: "+u1.isAdmin());
        System.out.println("washingtoN navarrO says: "+u1.sayHello());

        User u2 = new User("maRy", "syMs", false);
        System.out.println("Should be maRy: "+u2.getFirstName());
        System.out.println("Should be syMs: "+u2.getLastName());
        System.out.println("Should be false: "+u2.isAdmin());
        System.out.println("maRy syMs says: "+u2.sayHello());

        User u6 = new User("tIto", "valieNte", true);
        System.out.println("Should be tIto: "+u6.getFirstName());
        System.out.println("Should be valieNte: "+u6.getLastName());
        System.out.println("Should be true: "+u6.isAdmin());
        System.out.println("tIto valieNte says: "+u6.sayHello());

        try {
            User u3 = new User("Steve", null, true);
        } catch (IllegalArgumentException e) {
            System.out.println("Last Name Null Successfully Caught (User): "+e.getMessage());
        }

        try {
            User u4 = new User(null, "Stevenson", false);
        } catch (IllegalArgumentException e) {
            System.out.println("First Name Null Successfully Caught (User): "+e.getMessage());
        }

        try {
            User u5 = new User(null, null, false);
        } catch (IllegalArgumentException e) {
            System.out.println("Full Name Null Successfully Caught (User): "+e.getMessage());
        }
        System.out.println("=============== User() Test Ends ==============\n");

        System.out.println("======== capitalizeRecords() Test Begins ======");
        userArr = new ArrayList<>();
        userArr.add(u1);
        userArr.add(u2);
        userArr.add(u6);
        ArrayList<User> retArr = Assessment.capitalizeRecords(userArr);

        System.out.println("== Following should be properly capitalized: ==");
        for(User user : retArr) {
            System.out.println("First Name: "+user.getFirstName());
            System.out.println("Last Name: "+user.getLastName());
            System.out.println("Admin: "+user.isAdmin());
            System.out.println(user.sayHello());
        }
        System.out.println("======== capitalizeRecords() Test Ends ========");

        return retArr;
    }

    public static void main(String[] args) {
        System.out.println("============= square() Test Begins =============");
        System.out.println("Assessment.square(3) = " + Assessment.square(3) + " should be 9.");
        System.out.println("Assessment.square(5) = " + Assessment.square(5) + " should be 25.");
        System.out.println("Assessment.square(10) = " + Assessment.square(10) + " should be 100.");
        System.out.println("============== square() Test Ends ==============\n");

        System.out.println("============== sum() Test Begins ==============");
        System.out.println("Assessment.sum(3,5) = " + Assessment.sum(3, 5) + " should be 8.");
        System.out.println("Assessment.sum(-23,-91) = " + Assessment.sum(-23, -91) + " should be -114.");
        System.out.println("Assessment.sum(65.3,-28) = " + Assessment.sum((int) 65.3, -28) + " should be 37.3.");
        System.out.println("Assessment.sum(-231.321,-99.32) = " + Assessment.sum(-231.321, -99.32) + " should be 330.641 or very close to it.");
        System.out.println("=============== sum() Test Ends ===============\n");

        System.out.println("============ average() Test Begins ============");
        double[] arr1 = {3, 4, 5, 6, 7};
        System.out.println("Assessment.average({3,4,5,6,7}) = " + Assessment.average(arr1) + " should be 5.0.");
        System.out.println("============= average() Test Ends =============\n");

        System.out.println("============= Person() Test Begins ============");
        try {
            Person p1 = new Person("Po", "Lin");
            System.out.println("First name should be Po: " + p1.getFirstName());
            System.out.println("Last name should be Lin: " + p1.getLastName());
            p1.setFirstName("Yumi");
            p1.setLastName("Jeon");
            System.out.println("Name set to new");
            System.out.println("First name should be Yumi: " + p1.getFirstName());
            System.out.println("Last name should be Jeon: " + p1.getLastName());
            System.out.println("Yumi Jeon says: " + p1.sayHello());
        } catch (IllegalArgumentException e) {
            System.out.println("This Shouldn\'t Happen: " + e.getMessage());
        }

        try {
            Person p2 = new Person("Abby", null);
        } catch (IllegalArgumentException e) {
            System.out.println("Last Name Null Successfully Caught (Person): " + e.getMessage());
        }

        try {
            Person p2 = new Person(null, "Perez");
        } catch (IllegalArgumentException e) {
            System.out.println("First Name Null Successfully Caught (Person): " + e.getMessage());
        }

        try {
            Person p2 = new Person(null, null);
        } catch (IllegalArgumentException e) {
            System.out.println("Full Name Null Successfully Caught (Person): " + e.getMessage());
        }
        System.out.println("============== Person() Test Ends =============\n");

        System.out.println("============== User() Test Begins =============");
        User u1 = new User("washingtoN", "navarrO", true);
        System.out.println("Should be washingtoN: " + u1.getFirstName());
        System.out.println("Should be navarrO: " + u1.getLastName());
        System.out.println("Should be true: " + u1.isAdmin());
        System.out.println("washingtoN navarrO says: " + u1.sayHello());

        User u2 = new User("maRy", "syMs", false);
        System.out.println("Should be maRy: " + u2.getFirstName());
        System.out.println("Should be syMs: " + u2.getLastName());
        System.out.println("Should be false: " + u2.isAdmin());
        System.out.println("maRy syMs says: " + u2.sayHello());

        User u6 = new User("tIto", "valieNte", true);
        System.out.println("Should be tIto: " + u6.getFirstName());
        System.out.println("Should be valieNte: " + u6.getLastName());
        System.out.println("Should be true: " + u6.isAdmin());
        System.out.println("tIto valieNte says: " + u6.sayHello());

        try {
            User u3 = new User("Steve", null, true);
        } catch (IllegalArgumentException e) {
            System.out.println("Last Name Null Successfully Caught (User): " + e.getMessage());
        }

        try {
            User u4 = new User(null, "Stevenson", false);
        } catch (IllegalArgumentException e) {
            System.out.println("First Name Null Successfully Caught (User): " + e.getMessage());
        }

        try {
            User u5 = new User(null, null, false);
        } catch (IllegalArgumentException e) {
            System.out.println("Full Name Null Successfully Caught (User): " + e.getMessage());
        }
        System.out.println("=============== User() Test Ends ==============\n");
    }




}
