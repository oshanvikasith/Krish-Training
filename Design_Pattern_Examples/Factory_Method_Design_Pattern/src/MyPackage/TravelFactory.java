package MyPackage;

public class TravelFactory {

    public static Travel createPackage(TravelCode travelCode){
        switch (travelCode){
            case Basic:
                return new BasicPackage();
            case Silver:
                return new SilverPackage();
            case Gold:
                return new GoldPackage();
            case Platinum:
                return new PlatinumPackage();
            default:
                return null;
        }

    }
}
