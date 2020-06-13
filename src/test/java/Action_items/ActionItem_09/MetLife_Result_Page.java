package Action_items.ActionItem_09;

import Reusable_classes.Abstract_Class;
import Reusable_classes.Reusable_Library_Loggers;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MetLife_Result_Page extends Abstract_Class {

    ExtentTest logger;
    public MetLife_Result_Page(WebDriver driver){
        super();
        //Creating the page object
        PageFactory.initElements(driver,this);
        this.logger=super.logger;
    }//end of the constructor

    public MetLife_Result_Page confirmationOfDental(){
        //Capturing the confirmation message
        String confirmation=Reusable_Library_Loggers.captureText(driver,"//div[@class='col-sm-8']","Capture confirmation message",logger);
        //Splitting the confirmation message
        String []confirmedDentalProgram=confirmation.split(" ");
        //printing the desired dental program
        System.out.println("The search result is " + confirmedDentalProgram[3]);

        return new MetLife_Result_Page(driver);
    }//end of the method

    public MetLife_Result_Page ScreenShot(){
//Taking the screenshot of the confirmation page
Reusable_Library_Loggers.getScreenShot(driver,logger,"Picture of confirmation page");
        return new MetLife_Result_Page(driver);
    }//end of the method

}//end of the java class
