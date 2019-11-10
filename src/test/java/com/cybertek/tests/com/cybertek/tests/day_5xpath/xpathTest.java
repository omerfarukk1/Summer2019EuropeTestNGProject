package com.cybertek.tests.com.cybertek.tests.day_5xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class xpathTest {

    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement button3=driver.findElement(By.xpath("//button[@onclick='button3()']"));

        button3.click();
    }
}
