package Action_items.ActionItem_09;

import Reusable_classes.Abstract_Class;
import Reusable_classes.Reusable_Library_Loggers;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MetLife_ZipCode_Page extends Abstract_Class {

    ExtentTest logger;

    public MetLife_ZipCode_Page(WebDriver driver) {
        super();

        PageFactory.initElements(driver, this);
        this.logger = super.logger;
    }//end of the constructor


    public MetLife_ZipCode_Page EnterZipCode(String userInput) {
        //Reusable_Library_Loggers.click(driver,"//*[@class='form-control']","clicking",logger);

        Reusable_Library_Loggers.userTypeAndHitEnter(driver, "//*[@id='txtZipCode']", userInput, "Enter zip code", logger);

        return new MetLife_ZipCode_Page(driver);
    }//end of the enterZipCode method


}//end of the java class
