package MyPackage;

public class Main {
    public static void main(String[] args) {

        // creating the object of the basic package and calling its Travel method
        Travel travel = TravelFactory.createPackage(TravelCode.Basic);
        travel.Travel();

        // creating the object of the silver package and calling its Travel method
        Travel travel1 = TravelFactory.createPackage(TravelCode.Silver);
        travel1.Travel();


    }
}
