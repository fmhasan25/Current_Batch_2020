package Action_items.ActionItem_09;

import Reusable_classes.Abstract_Class;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

public class MetLife_Switch_Tabs extends Abstract_Class {

    ExtentTest logger;

    public MetLife_Switch_Tabs(WebDriver driver) {
        //Creating the page object for the
        super();
        PageFactory.initElements(driver, this);

        this.logger = super.logger;
    }//end of the constructor

    public MetLife_Switch_Tabs switchTabs(int index) {
        //Creating array for existing windows
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        //switching to the window selected by the index
        driver.switchTo().window(tabs.get(index));
        return new MetLife_Switch_Tabs(driver);
    }//end of the switching method


}//end of the java class
