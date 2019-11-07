package com.cybertek.tests.com.cybertek.tests.Day4_Basiclocators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Id_locatorTest {

    public static void main(String[] args) {


        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement dontClickButton=driver.findElement(By.id("disappearing_button"));

        dontClickButton.click();

        driver.quit();









    }
}
