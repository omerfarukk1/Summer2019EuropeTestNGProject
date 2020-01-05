package com.cybertek.tests.day7_testNG;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

public class TestNGDemo {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before suite");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("before test");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class");
    }
    @BeforeMethod
    public void setup(){
        System.out.println("Before method");
    }

    @Ignore
    @Test(priority = 3)
    public void test1(){

        String word1="Java";
        String word2="Java";
        System.out.println("Test 1");
        Assert.assertEquals(word1,word2);
    }
    @Test(priority = 2)
    public void Test2(){

        String word1="Javascript";
        String word2="Javascript";
        System.out.println("Test 2");
        Assert.assertEquals(word1,word2);
    }
    @Test(priority = 1)
    public void Test3(){
        Assert.assertTrue(15>10);
        System.out.println("Test3");
        throw new SkipException("Just Skipped");
    }
    @AfterMethod
    public void teatDown(){
        System.out.println("After Method");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("After Test");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("After suite");
    }
}
