package Day16_06072020;

import Day_15_06062020.Yahoo_page.Yahoo_Base_Class;
import Reusable_classes.Abstract_Class;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class Yahoo_Page_Object_Search_Result extends Abstract_Class {
    @Test
    public void Yahoo_Search_Result() throws InterruptedException {

        //using arrayList to define array test date
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Lexus");
        cars.add("BMW");
        cars.add("Mercedes");

        //we are using reference name for page classes which is defined on Yahoo base class

        for (int i = 0; i < cars.size(); i++) {

            logger.log(LogStatus.INFO, "Navigating to yahoo homepage");
            driver.navigate().to("https://www.yahoo.com");
            Thread.sleep(2500);

            //calling searchField method from yahoo home page
            Yahoo_Base_Class.yahoo_homepage().searchField(cars.get(i));

            //calling search method from yahoo search result page
            Yahoo_Base_Class.yahoo_homepage().searchIcon();

            Thread.sleep(2500);

            //calling scroll to button method from yahoo search result page
            Yahoo_Base_Class.yahoo_search_result_page().scrollToBottom();

            //calling searchNumber method from yahoo search result page
            Yahoo_Base_Class.yahoo_search_result_page().searchNumber();

        }//end of the for loop

    }//end of the test method

}//end of the java class
