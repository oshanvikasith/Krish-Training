import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter distance :");

        int distance = myScanner.nextInt();

        if(distance==0 || distance<0){
            System.out.print("Enter valid distance:");
            System.exit(0);
        }

        int time =0;
        int currentDistance =0;

        while(currentDistance<distance){
            currentDistance+=5;
            if(currentDistance>=distance){
                break;
            }
            time+=1;
            currentDistance+=3;

            if(currentDistance>=distance){
                break;
            }

            time+=2;
            currentDistance+=1;

            if(currentDistance>=distance){
                break;
            }
            time+=3;
        }

        System.out.println("Resting time:"+time);

    }


}
