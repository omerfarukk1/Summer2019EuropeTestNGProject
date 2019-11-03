package com.cybertek.tests.com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseandQuit {

    public static void main(String[] args) throws InterruptedException{

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://practice.cybertekschool.com");

        Thread.sleep(3000);

        driver.close();

        driver =new ChromeDriver();

        driver.get("https://practice.cybertekschool.com/open_new_tab");

        Thread.sleep(5000);

        driver.quit();
    }
}
