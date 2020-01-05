package com.cybertek.tests.com.cybertek.tests.day8_trypesOfelement2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckBoxesPractice {

    public static void main(String[] args) throws Exception {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/checkboxes");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[type='checkbox']:nth-of-type(1)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[type='checkbox']:nth-of-type(2)")).click();
        Thread.sleep(2000);

        List<WebElement> checkboxes=driver.findElements(By.tagName("input"));

        for (WebElement checkbox : checkboxes) {
            Thread.sleep(2000);

            if(!checkbox.isSelected()){
                checkbox.click();
            }
        }
        driver.quit();
    }
}
