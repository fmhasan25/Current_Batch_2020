package Action_items.Abstract;

import java.util.Arrays;
import java.util.HashSet;

public class intersection_array_string {

    public static void main(String[] args) {

        //Defining the string array for letters
        String[] letters = {"a", "b", "c", "d","e"};

        //Defining the string array for vowel
        String[] vowel = {"a", "e", "i", "o","u"};

        //Defining the hashSet
        HashSet<String> set = new HashSet<>();

        //Adding the letters variable in the set
        set.addAll(Arrays.asList(letters));

        //Retaining the vowel from set
        set.retainAll(Arrays.asList(vowel));

        //printing the remaining elements in set
        System.out.println(set);

        //convert to array
        String[] remainedValue = {};
        remainedValue = set.toArray(remainedValue);

        System.out.println(Arrays.toString(remainedValue));

    }//end of the main method

}//end of the java class
