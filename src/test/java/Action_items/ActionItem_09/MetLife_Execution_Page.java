package Action_items.ActionItem_09;

import Reusable_classes.Abstract_Class;
import com.relevantcodes.extentreports.LogStatus;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class MetLife_Execution_Page extends Abstract_Class {

    @Test
    public void ExecutionPage() throws InterruptedException, IOException, BiffException {

        Workbook readableFile;
        Sheet readableSheet;

        //Defining the excel path
        readableFile = Workbook.getWorkbook(new File("src/main/java/Excel/MetLife.xls"));
        //Defining the Excel sheet
        readableSheet = readableFile.getSheet(0);

        //printing the extent report message
        logger.log(LogStatus.INFO, "Navigating to the MetLife website");

        //Navigating to MetLife website
        driver.navigate().to("https://www.metlife.com");
        //Delaying for 2.5 sec
        Thread.sleep(2500);

        MetLife_Base_Class.metLife_home_page().verifyTitle();
        //Mouse hovering over Solution button
        MetLife_Base_Class.metLife_home_page().mouseHover();

        //Delaying for 2.5 sec
        Thread.sleep(2500);

        //Clicking the MetLife takeAlong Dental from drop down
        MetLife_Base_Class.metLife_home_page().MetLifeAlongDental();


        for (int i = 1; i < 4; i++) {

            //Clicking the Enroll now button
            MetLife_Base_Class.metLife_enroll_page().clickEnroll();
            Thread.sleep(3500);

            //Switching to to the new tab
            MetLife_Base_Class.metLife_switch_tabs().switchTabs(1);
            Thread.sleep(2500);

            //Creating variable for zipCodes from data driven source
            String zipCodes = readableSheet.getCell(0, i).getContents();
            //Entering the zipCode in the search box
            MetLife_Base_Class.metLife_zipCode_page().EnterZipCode(zipCodes);
            Thread.sleep(5000);

            //Scroll up to PPO
            MetLife_Base_Class.metLife_program_page().ScrollUp("PPO");

            //Delay for 2.5 sec
            Thread.sleep(2500);

            //Creating variable for dental program from data driven source
            String dentalProgram = readableSheet.getCell(1, i).getContents();
            //Selecting the dental program by clicking the checkbox
            MetLife_Base_Class.metLife_program_page().selectDental(dentalProgram);

            //Delay for 2 sec
            Thread.sleep(2000);

            //Clicking enroll to the dental program
            MetLife_Base_Class.metLife_program_page().enrollProgram();
            Thread.sleep(2000);


            //Creating variable for referral Code from data driven source
            String referralCode = readableSheet.getCell(2, i).getContents();
            //Applying the referral code in the box
            MetLife_Base_Class.metLife_program_page().MeLife_Popup_ReferralCode(referralCode);

            //Capturing the error Message
            MetLife_Base_Class.metLife_program_page().errorMessage();

            //Clicking enroll without referral code
            MetLife_Base_Class.metLife_program_page().withoutReferralCode();

            //Delay for 2 sec
            Thread.sleep(2000);

            //Printing out the confirmed dental program
            MetLife_Base_Class.metLife_result_page().confirmationOfDental();

            //Taking the screenshot of the confirmation page
            MetLife_Base_Class.metLife_result_page().ScreenShot();

            //Closing the current window
            driver.close();

            //Switching back to the parent tab
            MetLife_Base_Class.metLife_switch_tabs().switchTabs(0);


        }//end of for loop

    }//end of the test method


}//end of the java class
