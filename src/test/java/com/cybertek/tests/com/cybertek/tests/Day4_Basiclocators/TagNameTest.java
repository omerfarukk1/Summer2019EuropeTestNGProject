package com.cybertek.tests.com.cybertek.tests.Day4_Basiclocators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TagNameTest {

    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");


        // navigate to website
        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullNameInput=driver.findElement(By.tagName("input"));

        fullNameInput.sendKeys("Mike Smith With TagName");

        WebElement emailInput=driver.findElement(By.name("email"));

        emailInput.sendKeys("mike@gmail.com");

        WebElement signUpButton=driver.findElement(By.tagName("button"));

        signUpButton.click();

        WebElement messageElement=driver.findElement(By.tagName("h3"));

        String message=messageElement.getText();

        System.out.println(message);

        System.out.println(driver.findElement(By.tagName("h3")).getText());

        driver.quit();

    }
}
