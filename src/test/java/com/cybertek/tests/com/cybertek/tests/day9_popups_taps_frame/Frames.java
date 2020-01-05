package com.cybertek.tests.com.cybertek.tests.day9_popups_taps_frame;

import com.cybertek.utilities.Driver;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Frames {

    @Test
    public void frameTest1(){

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/iframe");
        driver.switchTo().frame("mce_0_ifr");
        driver.findElements(By.id("tinymce")).clear();
        driver.findElement(By.id("tinymce")).sendKeys("Test Automation");
        driver.switchTo().defaultContent();
        driver.quit();

    }
}
