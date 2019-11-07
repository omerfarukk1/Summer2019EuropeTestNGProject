package com.cybertek.tests.com.cybertek.tests.day3_Webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyURLnotChanged {

    /**Verify URL not changed
     * open browser
     * go to http://practice.cybertekschool.com/forgot_password Links to an external site.
     * click on Retrieve password
     * verify that url did not change
     */

    public static void main(String[] args) {

        WebDriver driver=WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");

        // save url to String variable

        String  expectedUrl=driver.getCurrentUrl();

        // click on retrieve password

        WebElement retrievePasswordButton=driver.findElement(By.id("form_submit"));

        retrievePasswordButton.click();

        String actualUrl=driver.getCurrentUrl();

        // verify url is not change
        if(expectedUrl.equals(actualUrl)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }

         // close the browser

        driver.quit();


    }
}
