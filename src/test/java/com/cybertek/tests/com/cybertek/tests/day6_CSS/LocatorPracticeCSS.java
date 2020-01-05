package com.cybertek.tests.com.cybertek.tests.day6_CSS;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorPracticeCSS {

    public static void main(String[] args) throws Exception {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/registration_form");
        driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("James");
        driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Bond");
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("James@cybertekschool.com");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("James1234");
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("James12345");
        driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("777-777-7777");
        driver.findElement(By.cssSelector("input[name='birthday']")).sendKeys("10/10/1970");
        Select select=new Select(driver.findElement(By.cssSelector("select[name='job_title']")));
        driver.findElement(By.cssSelector("input[value='male']")).click();
        select.selectByVisibleText("SDET");
        driver.findElement(By.id("wooden_spoon")).click();
        Thread.sleep(3000);
        driver.quit();
    }
}
