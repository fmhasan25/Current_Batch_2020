package Day3_04182020;

public class Loop_conditionals_statememnts {

    public static void main(String[] args) {

        String[] city = new String[4];
        city[0] = "Brooklyn";
        city[1] = "Queens";
        city[2] = "Manhattan";
        city[3] = "Bronx";

          for(int i = 0;i<city.length;i++){
            //using if else if condition
            //string can have equal() command or == but integer must have ==
            //equal command when the expected value is matching the array
            //equalIgnoreCase command will ignore case sensitivity as long as the array value
            //spelling is correct

            /*if (city[i] == "Brooklyn") {
                System.out.println("My city is " + city[i]);
            }//end of if condition
            else if (city[i].equals("Queens")) {
                System.out.println("My city is " + city[i]);

            }//end of else if condition
            else if (city[i].equalsIgnoreCase("Manhattan")) {// equalsIgnoreCase is only used for String
                System.out.println("My city is " + city[i]);*/
               //using or || operators to meet the same conditions as above
                if (city [i].equals("Brooklyn")||city[i] =="Queens"){
                    //True||true=True
                    System.out.println("My city is "+ city[i]);
                }//end of operator condition
        }//end of the for loop


    }//end of the main method
}//end of the java class
