package EagerInitialization;

public class Main {
    public static void main(String[] args) {

            // creating the instance of the SingletonEagerInitialization using the static method get instance
            SingletonEagerInitialization singletonEagerInitialization = SingletonEagerInitialization.getInstance();

            // printing out the instance
            System.out.println(singletonEagerInitialization);

            // creating the another variable to store the singleton instance
            SingletonEagerInitialization s2 = SingletonEagerInitialization.getInstance();

            //printing out the second variable
            System.out.println(s2);



    }
}
