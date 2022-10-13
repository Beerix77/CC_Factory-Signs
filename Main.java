import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean valid = false;
        //Scanner keyboard = new Scanner(System.in);
        //String input = keyboard.nextLine();
        String input = "CAT MONDAYS RACECAR TACOS";

        String[] fourWords = input.split(" ");
        System.out.println(Arrays.toString(fourWords));

        for (int i = 0; i < fourWords.length; i++) {
            //System.out.println(fourWords[i]);
            String[] fourWordLetters = fourWords[i].split("");
            String words = ArrayList.toString(fourWordLetters);
            System.out.println(words[0]);
            //System.out.println(words[i]);


        }






    }
}