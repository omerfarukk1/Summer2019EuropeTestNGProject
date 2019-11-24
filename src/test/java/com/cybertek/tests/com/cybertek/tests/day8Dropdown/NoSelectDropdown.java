package com.cybertek.tests.com.cybertek.tests.day8Dropdown;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class NoSelectDropdown {

    @Test
    public void test1() throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement dropdownElement=driver.findElement(By.id("dropdownMenuLink"));

        dropdownElement.click();

       List<WebElement> listofLinks =driver.findElements(By.className("dropdown-item"));

        System.out.println("Number of links: "+listofLinks.size());
        // print the text of each link
        for (WebElement listofLink : listofLinks) {

            System.out.println("list of Link = " + listofLink.getText());

        }
        // 1st of the list
        System.out.println(listofLinks.get(0).getText());

        listofLinks.get(3).click();

        //driver.findElement(By.linkText("Yahoo"));



    }
}
