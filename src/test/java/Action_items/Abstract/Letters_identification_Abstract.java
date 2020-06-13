package Action_items.Abstract;

import org.testng.annotations.Test;

import java.util.ArrayList;

public class Letters_identification_Abstract {

    public static void main(String[] args) {

        //Defining the array for letters
        ArrayList<String> letter = new ArrayList<>();
        letter.add("a");
        letter.add("b");
        letter.add("c");
        letter.add("d");
        letter.add("e");

        //Defining the array for vowels
        ArrayList<String> vowel = new ArrayList<>();
        vowel.add("a");
        vowel.add("e");
        vowel.add("i");
        vowel.add("o");
        vowel.add("u");


        for (int i = 0; i < letter.size(); i++) {

            if (letter.get(i) == "a" || letter.get(i) == "e") {
                System.out.println("The letter is " + letter.get(i) + " which is vowel");
            } else {
                System.out.println("The letter is " + letter.get(i) + " which is consonant");
            }//end of the nested loop


        }//end of the for loop

    }//end of the test annotation
}//end of the java class



