package DoubleChecking;

public class DoubleCheckingPattern {

    private static volatile DoubleCheckingPattern instance;

    private DoubleCheckingPattern(){
        if(instance!=null){
            // stop creating instance using reflection api methods
            throw new RuntimeException("Instance already exists");
        }
    }

    public static DoubleCheckingPattern getInstance(){

        if(instance==null){
            synchronized (DoubleCheckingPattern.class){
                if(instance==null){
                    instance = new DoubleCheckingPattern();
                }
            }
        }

        return instance;
    }

}
