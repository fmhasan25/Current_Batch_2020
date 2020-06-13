package Day_15_06062020.Yahoo_page;

import Reusable_classes.Abstract_Class;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class Yahoo_Page_Object_Search_Result extends Abstract_Class {

    @Test
    public void Yahoo_Search_Result() throws InterruptedException {

        ArrayList<String >cars=new ArrayList<>();
        cars.add("BMW");
        logger.log(LogStatus.INFO,"Navigating to yahoo homepage");
        driver.navigate().to("https://www.yahoo.com");
        Thread.sleep(2500);
        Yahoo_Base_Class.yahoo_homepage().searchField(cars.get(0));
        //click on search icon
        Yahoo_Base_Class.yahoo_homepage().searchIcon();
        Thread.sleep(2500);
        //scroll to the bottom of the page
        Yahoo_Base_Class.yahoo_search_result_page().scrollToBottom();

        //getting search number
        Yahoo_Base_Class.yahoo_search_result_page().searchNumber();



    }//end of the test method


}//end of the java class
