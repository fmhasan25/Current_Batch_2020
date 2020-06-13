package Day_15_06062020.Yahoo_page;

import Reusable_classes.Abstract_Class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

public class Yahoo_Base_Class extends Abstract_Class {


    public Yahoo_Base_Class(WebDriver driver) {

        super();
        PageFactory.initElements(driver, this);

    }//end of constructor


    //Create a new name to refer to the actual page class
    //object for yahoo homepage
    public static Yahoo_Homepage yahoo_homepage() {
        Yahoo_Homepage yahoo_homepage = new Yahoo_Homepage(driver);
        return yahoo_homepage;
    }//end of object reference for yahoo homepage

    //object for yahoo search result page
    public static Yahoo_Search_Result_Page yahoo_search_result_page() {

        Yahoo_Search_Result_Page yahoo_search_result_page = new Yahoo_Search_Result_Page(driver);
        return yahoo_search_result_page;
    }//end of object reference for yahoo search result page


}//end of the java class
