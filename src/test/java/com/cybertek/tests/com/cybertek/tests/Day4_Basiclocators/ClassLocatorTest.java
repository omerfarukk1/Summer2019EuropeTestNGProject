package com.cybertek.tests.com.cybertek.tests.Day4_Basiclocators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassLocatorTest {

    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");


        // navigate to website
        driver.get("http://practice.cybertekschool.com/sign_up");


        WebElement homeLink=driver.findElement(By.className("nav-link"));

        homeLink.click();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement messageElement=driver.findElement(By.className("h3"));

        String message=messageElement.getText();
        System.out.println(message);

        System.out.println(driver.findElement(By.className("h3")).getText());

         driver.quit();








    }
}
