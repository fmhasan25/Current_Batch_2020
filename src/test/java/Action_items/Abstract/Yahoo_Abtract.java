package Action_items.Abstract;

import Reusable_classes.Abstract_Class;
import Reusable_classes.Reusable_Library_Loggers;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class Yahoo_Abtract extends Abstract_Class {

    @Test
    public void yahoo() throws InterruptedException {

        //Defining the extent info report for navigating to yahoo
        logger.log(LogStatus.INFO, "Navigating to yahoo website");

        //Navigating to yahoo website
        driver.navigate().to("https://www.yahoo.com");

        //Delay for 3 sec
        Thread.sleep(2500);

        //Entering the  input in the search box and proceeding
        Reusable_Library_Loggers.userTypeAndHitEnter(driver, "//*[@id='header-search-input']", "QA", "Input and proceed", logger);

        Thread.sleep(2500);

        //Selecting the desired link
        Reusable_Library_Loggers.click(driver, "//*[contains(text(),'Wikipedia')]", "Selecting link", logger);

        //defining the logger info for switching window
        logger.log(LogStatus.INFO,"Switching to new window");

        //Defining the existing tabs and Switching to the second tab
        ArrayList<String>tabs= new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        //Delaying for 3 sec
        Thread.sleep(3000);


        //Defining the variable for element if displayed or not
        Boolean display = driver.findElement(By.xpath("//*[contains(text(),'Middle Ages')]")).isDisplayed();

        if(display=true) {

            //Defining the logger info for the existence of desired phrase
            logger.log(LogStatus.PASS,"phrase exists");

            //Printing statement for the if condition
            System.out.println("The phrase exists in the page verified by using Boolean syntax");

        }else{
            //Defining the logger info for the existence of desired phrase
            logger.log(LogStatus.PASS,"phrase doesn't exist");

            //Printing statement for the else condition
            System.out.println("The phase doesn't exist in the page verified by using Boolean syntax");
        }//end of the if-else condition


        //Another approach to verify if the phrase exists

        if(driver.getPageSource().contains("Middle Ages")){
            System.out.println("The phrase exists in the page verified by using page source & contains");
        }else{
            System.out.println("The phase doesn't exist in the page verified by using page source & contains");
        }//end of the if-else condition


        //Capturing the screenshot of the final page
        Reusable_Library_Loggers.getScreenShot(driver,logger,"Screenshot of the final page");


    }//end of the test annotation

}//end of the java class
