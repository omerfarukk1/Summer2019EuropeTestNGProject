package com.cybertek.tests.com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getUrlandTitle {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();

        driver.get("https://practice.cybertekschool.com");

        // get title of of the page
        String title =driver.getTitle();

        System.out.println("title=" +title);
        // get currenturl of page
        String currentUrl= driver.getCurrentUrl();

        System.out.println("currentUrl = " + currentUrl);
        // get page source code
        String pageSource = driver.getPageSource();

        System.out.println("pageSource = " + pageSource);







    }
}
