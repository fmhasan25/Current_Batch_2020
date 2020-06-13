package Action_items;

import Reusable_classes.Abstract_Class;
import Reusable_classes.Reusable_Library_Loggers;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class Action_item_by_june09 extends Abstract_Class {

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

        //Defining the existing tabs and Switching to the second tab
        ArrayList<String>tabs= new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        //Delaying for 3 sec
        Thread.sleep(3000);

        //Defining the variable for element if displayed or not
        Boolean display = driver.findElement(By.xpath("//*[contains(text(),'Middle Ages')]")).isDisplayed();

        if(display=true) {
            System.out.println("The phrase exists in the page verified by using Boolean syntax");
        }else{
            System.out.println("The phase doesn't exist in the page verified by using Boolean syntax");
        }//end of the if-else condition


        //Another approach to verify if the phrase exists

        if(driver.getPageSource().contains("Middle Ages")){
            System.out.println("The phrase exists in the page verified by using page source & contains");
        }else{
            System.out.println("The phase doesn't exist in the page verified by using page source & contains");
        }//end of the if-else condition

    }//end of the test annotation

}//end of the java class
