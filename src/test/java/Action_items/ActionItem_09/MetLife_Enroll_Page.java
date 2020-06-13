package Action_items.ActionItem_09;

import Reusable_classes.Abstract_Class;
import Reusable_classes.Reusable_Library_Loggers;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

public class MetLife_Enroll_Page extends Abstract_Class {

    ExtentTest logger;

    public MetLife_Enroll_Page(WebDriver driver) {

        super();
        PageFactory.initElements(driver, this);
        this.logger = super.logger;

    }//end of the constructor

    public MetLife_Enroll_Page clickEnroll() {

        Reusable_Library_Loggers.click(driver, "//*[contains(text(),'Enroll Now')]", "Clicking Enroll Now", logger);
        return new MetLife_Enroll_Page(driver);
    }//end of the enroll now method




}//end of the java class
