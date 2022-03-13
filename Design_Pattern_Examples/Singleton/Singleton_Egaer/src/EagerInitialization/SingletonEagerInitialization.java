package EagerInitialization;

public class SingletonEagerInitialization {

    private static final SingletonEagerInitialization EAGER_INITIALIZATION = new SingletonEagerInitialization();

    private SingletonEagerInitialization(){

    }

    public static SingletonEagerInitialization getInstance(){
        return EAGER_INITIALIZATION;
    }

}
