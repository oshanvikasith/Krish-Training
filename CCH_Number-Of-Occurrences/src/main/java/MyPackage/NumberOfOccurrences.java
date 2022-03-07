package MyPackage;

import java.util.*;

public class NumberOfOccurrences {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word;
        System.out.println("Enter word :");
        word = scanner.next();

        String[] wordArray = new String[word.split("").length];
        wordArray = word.split("");

        Set<String> linkedHashSet = new LinkedHashSet<>();

        for(int i=0;i< wordArray.length;i++){
            linkedHashSet.add(wordArray[i]);
        }

        int count=0;

        for (String i : linkedHashSet) {
            for(int k=0;k<wordArray.length;k++){
                if(wordArray[k].equals(i)){
                    ++count;
                }
            }
            System.out.println(i+":"+count);
            count=0;
        }
    }
}
