package DoubleChecking;

public class Main {
    public static void main(String[] args) {

        long start;
        long end;

        //1st attempt
        start = System.currentTimeMillis();
        DoubleCheckingPattern pattern1 = DoubleCheckingPattern.getInstance();
        end = System.currentTimeMillis();
        System.out.println("Time take to create the initial object:"+(end-start));

        // 2nd attempt
        start = System.currentTimeMillis();
        DoubleCheckingPattern pattern2 = DoubleCheckingPattern.getInstance();
        end = System.currentTimeMillis();
        System.out.println("Time taken to assign the object to second variable:"+(end-start));

    }
}
