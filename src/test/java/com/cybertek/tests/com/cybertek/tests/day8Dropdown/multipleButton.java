package com.cybertek.tests.com.cybertek.tests.day8Dropdown;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class multipleButton {

    @Test
    public  void test1(){

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        System.out.println("buttons.size() = " + buttons.size());
        //verify that you got 6 webelements
        Assert.assertEquals(buttons.size(),6,"Verify we got 6 buttons");
        for (WebElement button : buttons) {
            System.out.println(button.getText());
        }
    }
    @Test
    public void test2(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        //wrong locator but we are not getting any error, we are getting empty list
        List<WebElement> buttons = driver.findElements(By.tagName("buttonasdasdasda"));
        System.out.println(buttons.size());
    }
}
