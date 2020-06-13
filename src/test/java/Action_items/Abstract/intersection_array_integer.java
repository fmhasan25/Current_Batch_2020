package Action_items.Abstract;

import java.util.Arrays;
import java.util.HashSet;

public class intersection_array_integer {


    public static void main(String[] args)
    {
        Integer[] firstArray = {0,1,2,3,4,6,7,8,9};
        Integer[] secondArray = {1,3,5,9};

        HashSet<Integer> set = new HashSet<>();

        set.addAll(Arrays.asList(firstArray));

        set.retainAll(Arrays.asList(secondArray));

      //  System.out.println(set);

        //convert to array
        Integer[] intersection = {};
        intersection = set.toArray(intersection);

        System.out.println(Arrays.toString(intersection));
    }

}//end of the java class
