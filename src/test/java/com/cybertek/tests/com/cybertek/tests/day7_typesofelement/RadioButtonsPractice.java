package com.cybertek.tests.com.cybertek.tests.day7_typesofelement;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RadioButtonsPractice {
    public static void main(String[] args) throws Exception{

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");
       // driver.findElement(By.xpath("//label[text()='Yellow']/preceding-sibling::input")).click();
       // Thread.sleep(2000);
       // driver.findElement(By.xpath("//label[text()='Green']/preceding-sibling::input")).click();
        List<WebElement> radioButtons=driver.findElements(By.cssSelector("input[type='radio']"));
        for (WebElement radioButton : radioButtons) {
            System.out.println(radioButton.getAttribute("id")+"-"+radioButton.isEnabled());

        }
        driver.quit();


    }
}
