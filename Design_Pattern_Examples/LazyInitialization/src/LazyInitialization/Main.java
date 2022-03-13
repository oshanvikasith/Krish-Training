package LazyInitialization;

public class Main {
    public static void main(String[] args) {
        // creating the instance of the SingletonEagerInitialization using the static method get instance
        SingletonLazyInitialization singletonLazyInitialization = SingletonLazyInitialization.getInstance();

        // printing out the instance
        System.out.println(singletonLazyInitialization);

        // creating the another variable to store the singleton instance
        SingletonLazyInitialization s2 = SingletonLazyInitialization.getInstance();

        //printing out the second variable
        System.out.println(s2);
    }
}
