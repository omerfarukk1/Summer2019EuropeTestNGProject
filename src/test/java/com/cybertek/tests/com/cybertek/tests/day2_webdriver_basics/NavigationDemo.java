package com.cybertek.tests.com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {

    public static void main(String[] args) throws InterruptedException{

        WebDriverManager.chromedriver().setup();


        WebDriver driver = new ChromeDriver();

         //navigate to website
        driver.get("https://www.google.com");



         //another way of opening website
        driver.navigate().to("https://www.facebook.com");

         //goes back to previous webpage
        driver.navigate().back();

        //goes back to forvard webpage
        driver.navigate().forward();

         // refresh the page
        driver.navigate().refresh();



    }
}
