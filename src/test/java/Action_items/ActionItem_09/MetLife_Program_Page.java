package Action_items.ActionItem_09;

import Reusable_classes.Abstract_Class;
import Reusable_classes.Reusable_Library_Loggers;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MetLife_Program_Page extends Abstract_Class {

    ExtentTest logger;
    public MetLife_Program_Page(WebDriver driver){
super();
//Creating the page object for the
        PageFactory.initElements(driver,this);
        this.logger=super.logger;
    }//end of the constructor

    public MetLife_Program_Page ScrollUp(String userInput){
        //Selecting the dental program
        //Scrolling up to ppo
        Reusable_Library_Loggers.scroll(driver, "//td[contains(text(),'Coverage Type - "+userInput+"')]", "Scroll up", logger);
        return new MetLife_Program_Page(driver);
    }//end of the selectDental method


    public MetLife_Program_Page selectDental(String userInput){
        //Selecting the dental program
        Reusable_Library_Loggers.click(driver,"//*[@class='"+userInput+"']","Clicking checkbox",logger);

        return new MetLife_Program_Page(driver);
    }//end of the selectDental method

    public MetLife_Program_Page enrollProgram(){
//Enrolling into the program
        Reusable_Library_Loggers.click(driver,"(//*[@class='btn btn-success']) [1]","Enroll in Program",logger);

        return new MetLife_Program_Page(driver);
    }//end of the selectDental method

    public MetLife_Program_Page MeLife_Popup_ReferralCode(String userValue){
        //creating the syntax for applying the referral code
        Reusable_Library_Loggers.userTypeAndHitEnter(driver,"//*[@id='txtBxPromocode']",userValue,"Applying referral code",logger);

        return new MetLife_Program_Page(driver);
    }//end of the method

    public MetLife_Program_Page errorMessage(){
        //Capturing the error message
        Reusable_Library_Loggers.captureText(driver,"//span[contains(text(),'Referral Code was not recognized')]","Error Message",logger);

        return new MetLife_Program_Page(driver);
    }//end of the method

    public MetLife_Program_Page withoutReferralCode(){
        //enrolling without the referral code
        Reusable_Library_Loggers.click(driver,"//a[@class='btn btn-primaryborder']","Enroll without referral code",logger);

        return new MetLife_Program_Page(driver);
    }//end of the method

}//end of the java class
