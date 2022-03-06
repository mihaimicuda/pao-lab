public class Application {

    //this will be assigned last - when creating an object
    String name = "MyApp";
    String secondName;

    static int counter;

    //this will execute second - when creating an object
    {
        System.out.println("non-static bloc");
        secondName = "MySecondApp";
    }

    //this will execute first - without instantiating an object
    static {
        System.out.println("static bloc initialization");
        counter = 5;
    }

    public static void main(String[] args) {
        Application app = new Application();
    }
}
