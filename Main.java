import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean valid = false;
        Scanner keyboard = new Scanner(System.in);
        //String input = keyboard.nextLine();
        String input = "CAT MONDAYS RACECAR TACOS";
        String[] fourWords = input.split(" ");
        for (int i = 0; i <= fourWords.length-1; i++) {
            //System.out.println(fourWords[i]);
            String[] fourWordLetters = fourWords[i].split("");
            //System.out.println(Arrays.toString(fourWordLetters));
            String[] reverseWord;

            for (int j = fourWordLetters.length-1; j >= 0; j++){
                reverseWord[i] = fourWordLetters[j];
            }
        }

    public void reverse





    }
}