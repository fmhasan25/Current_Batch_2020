package Day_15_06062020.Yahoo_page;

import Reusable_classes.Abstract_Class;
import Reusable_classes.Reusable_Library_Loggers;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Yahoo_Homepage extends Abstract_Class {

    ExtentTest logger;
//We need to create a constructor method that defines
    //driver and logger to be reuse locally to this page class

    public Yahoo_Homepage(WebDriver driver) {


        super();
        PageFactory.initElements(driver, this);
        //local page logger gets set to abstract class logger when you use it in
        //page object concept
        //constructor inherits same name as your java class
        this.logger = super.logger;
    }//end of constructor

    //method of search field
    public Yahoo_Homepage searchField(String userValue){

        Reusable_Library_Loggers.userKeys(driver,"//*[@id='header-search-input']",userValue,"Search Field",logger);
        return new Yahoo_Homepage(driver);
        //the driver that i used is returning you the same yahoo homepage
    }//end of the searchField

    //method of search icon
    public Yahoo_Homepage searchIcon(){
        Reusable_Library_Loggers.click(driver,"//*[@id='header-desktop-search-button']","click",logger);
        return new Yahoo_Homepage(driver);
    }//end of the searchField

}//end of the java class

