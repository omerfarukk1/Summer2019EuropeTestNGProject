package com.cybertek.tests.com.cybertek.tests.Day4_Basiclocators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NameLocatorTest {

    public static void main(String[] args) {


        WebDriver  driver= WebDriverFactory.getDriver("chrome");


         // navigate to website
        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullNameInput=driver.findElement(By.name("full_name"));

        fullNameInput.sendKeys("Mike Smith");

        WebElement emailInput=driver.findElement(By.name("email"));

        emailInput.sendKeys("redox@gmail.com");

        WebElement signUpButton=driver.findElement(By.name("wooden_spoon"));

        signUpButton.click();

        WebElement messageElement=driver.findElement(By.name("signup_message"));

        String actualMessage=messageElement.getText();

        String expectedMessage="Thank you for signing up. Click the button below to return to the home page.";

        if(expectedMessage.equals(actualMessage)){

            System.out.println("PASS");
        }else{
            System.out.println("FAIL");

            System.out.println("expectedMessage = " + expectedMessage);
            System.out.println("actualMessage = " + actualMessage);
        }

         driver.quit();


    }
}
