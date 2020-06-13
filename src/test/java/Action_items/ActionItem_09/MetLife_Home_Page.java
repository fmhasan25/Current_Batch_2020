package Action_items.ActionItem_09;

import Reusable_classes.Abstract_Class;
import Reusable_classes.Reusable_Library_Loggers;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MetLife_Home_Page extends Abstract_Class{
    ExtentTest logger;
    public MetLife_Home_Page(WebDriver driver) {
        super();
    //Creating the page object for the homepage
            PageFactory.initElements(driver, this);

            this.logger = super.logger;

        }//end of the constructor

        public MetLife_Home_Page verifyTitle(){
        //Verify the title with the expected
        Reusable_Library_Loggers.verifyTitle(driver,"Insurance and Employee Benefits | MetLife",logger);

        return new MetLife_Home_Page(driver);
        }//end of the verifyTitle method

        public MetLife_Home_Page mouseHover() {

            //Mouse hovering over solution
            Reusable_Library_Loggers.mouseHover(driver, "(//*[contains(text(),'SOLUTION')]) [1]", "Hovering over Solution", logger);
            return new MetLife_Home_Page(driver);
        }//end of the mouseHover method

        public MetLife_Home_Page MetLifeAlongDental() {
            //Clicking the metLife Take along dental
            Reusable_Library_Loggers.click(driver, "//*[contains(text(),'MetLife TakeAlong Dental')]", "Clicking MetLife TakeAlong Dental", logger);
            return new MetLife_Home_Page(driver);
        }//end of the MetLifeAlongDental method



}//end of the java class
