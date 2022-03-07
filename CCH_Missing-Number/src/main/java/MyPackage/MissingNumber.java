package MyPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        String sequence;
        System.out.println("Enter sequence (Separate with a comma):");
        sequence = myScanner.next();


        int totalNumber = sequence.split(",").length;
        String[] myArray = new String[totalNumber];
        myArray=sequence.split(",");
        int minimum =100;
        int maximum =0;
        int amountNotInSequence =0;
        List<Integer> myList = new ArrayList<>();
        List<Integer> ordered = new ArrayList<>();
        List<Integer> notInSequence = new ArrayList<>();

        for(int i=0;i<myArray.length;i++){
            if(Integer.parseInt(myArray[i])<minimum){
                minimum=Integer.parseInt(myArray[i]);
            }
            if(Integer.parseInt(myArray[i])>maximum){
                maximum=Integer.parseInt(myArray[i]);
            }

            myList.add(Integer.parseInt(myArray[i]));
        }

        for(int i=minimum;i<=maximum;i++){
            if(myList.contains(i)){
                ordered.add(i);
            }
            else{
                notInSequence.add(i);
                ++amountNotInSequence;
            }
        }

        if(amountNotInSequence>=2){
            System.out.println("More than 2 characters are missing in the sequence");
        }
        else if(amountNotInSequence==1){
            System.out.println("sequence in order:"+ordered);
            System.out.println("Missing character"+notInSequence);

        }
        else{
            System.out.println("Sequence in order:"+ordered);
            System.out.println("Missing number is located at the start or end");
        }



    }
}
