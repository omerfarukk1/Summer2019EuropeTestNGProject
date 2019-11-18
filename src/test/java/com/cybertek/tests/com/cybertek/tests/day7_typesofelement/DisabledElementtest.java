package com.cybertek.tests.com.cybertek.tests.day7_typesofelement;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisabledElementtest {


    @Test
    public void test1(){

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement greenRadioButton=driver.findElement(By.id("green"));
        System.out.println("is element enabled"+ greenRadioButton.isEnabled());

        Assert.assertFalse(greenRadioButton.isEnabled(),"Verify that green disabled");

        greenRadioButton.click();
    }
    @Test
    public void test2(){

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        WebElement inputBox=driver.findElement(By.cssSelector("#input-example>input"));

        System.out.println("is input enabled"+inputBox.isEnabled());

        inputBox.sendKeys("Mike Simith");




    }
}
