package Action_items.ActionItem_09;

import Reusable_classes.Abstract_Class;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

public class MetLife_Base_Class extends Abstract_Class {

    public MetLife_Base_Class (WebDriver driver){
        super();
        PageFactory.initElements(driver,this);

    }//end of the constructor

    public static MetLife_Home_Page metLife_home_page(){
        //Creating page object variable for home page
        MetLife_Home_Page metLife_home_page= new MetLife_Home_Page(driver);
        return metLife_home_page;
    }//end of the MetLife home page method

    public static MetLife_Enroll_Page metLife_enroll_page(){
        //Creating page object variable for enroll page
        MetLife_Enroll_Page metLife_enroll_page= new MetLife_Enroll_Page(driver);
     return metLife_enroll_page;
    }//end of the MetLife enroll page method

    public static MetLife_Switch_Tabs metLife_switch_tabs(){
        //Creating page object variable switching
        MetLife_Switch_Tabs metLife_switch_tabs=new MetLife_Switch_Tabs(driver);
        return metLife_switch_tabs;
    }//end of the switching method

    public static MetLife_ZipCode_Page metLife_zipCode_page(){
        //Creating page object variable for zipcode page
        MetLife_ZipCode_Page metLife_zipCode_page= new MetLife_ZipCode_Page(driver);
        return metLife_zipCode_page;
    }//end of the MetLife zipCode page method

    public static MetLife_Program_Page metLife_program_page(){
        //Creating page object variable for program page
        MetLife_Program_Page metLife_program_page=new MetLife_Program_Page(driver);

        return metLife_program_page;
    }//end of the MetLife program page method


    public static MetLife_Result_Page metLife_result_page(){
        //Creating page object variable for Result page
       MetLife_Result_Page metLife_result_page= new MetLife_Result_Page(driver);

        return metLife_result_page;
    }//end of the MetLife Result page method
}//end of the java class
