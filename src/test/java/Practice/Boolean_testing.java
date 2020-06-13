package Practice;

import Reusable_classes.Abstract_Class;
import Reusable_classes.Reusable_Library_Loggers;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Boolean_testing extends Abstract_Class {

    @Test
    public void google() throws InterruptedException {

/*
        driver.navigate().to("http://www.yahoo.com");

        Reusable_Library_Loggers.userTypeAndHitEnter(driver, "//*[@id='header-search-input']", "QA", "Input and proceed", logger);


        Reusable_Library_Loggers.click(driver, "//*[contains(text(),'Wikipedia')]", "Selecting link", logger);

        Thread.sleep(2500);
        */
        driver.navigate().to("https://en.wikipedia.org/wiki/Quality_assurance");

if(driver.getPageSource().contains("Middle Ages")){
    System.out.println("Success");
}
        Boolean display = driver.findElement(By.xpath("//*[@title='Middle Ages']")).isDisplayed();
        System.out.println(display);


    }//end of the test annotation


}//end of the java class
