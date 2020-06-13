package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class google_firefox {

    public static void main(String[] args) {
       System.setProperty("webdriver.gecko.driver","src/main/resources/geckodriver 2");
        WebDriver driver= new FirefoxDriver();
        driver.navigate().to("https://www.google.com");


    }//end of the main method


}//end of the java class
