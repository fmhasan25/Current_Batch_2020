package Action_items.Abstract;

import Reusable_classes.Abstract_Class;
import Reusable_classes.Reusable_Library;
import Reusable_classes.Reusable_Library_Loggers;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

public class Washington_Abstract extends Abstract_Class {

    @Test
    public void washington(){

        //Logger info for the navigating to website
        logger.log(LogStatus.PASS,"Navigating to the website");

        //Navigating to the website
        driver.navigate().to("https://faculty.washington.edu/chudler/java/boxes.html");
        int j;
        int i=0;
        while (i<100){
            //logger info for clicking the checkbox
            logger.log(LogStatus.PASS,"Clicking the checkboxes");

            //Clicking the checkboxes
            if(i%5!=0) {
                Reusable_Library.clickByIndex(driver, "//*[@type='checkbox']", i, "clicking the checkbox");
            }
            i++;

        j=0+i;
        if(j==100){
            logger.log(LogStatus.INFO,"Taking the screenshot of the final result");
            //Taking the screenShot of the final result
            Reusable_Library_Loggers.getScreenShot(driver,logger,"Picture of the selected checkbox");
        }//end of the nested loop

        }//end of the while loop

    }//end of the

}//end of the java class
