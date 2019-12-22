package com.cybertek.tests.com.cybertek.tests.day16_review;


import com.cybertek.tests.com.cybertek.pages.ContactInfoPage;
import com.cybertek.tests.com.cybertek.pages.ContactsPage;
import com.cybertek.tests.com.cybertek.pages.DashboardPage;
import com.cybertek.tests.com.cybertek.pages.LoginPage;
import com.cybertek.tests.com.cybertek.tests.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class verifyContactInfoTests extends TestBase {


    @Test
    public void contactDetailsTest(){
        extentLogger=report.createTest("contactDetailsTest");
        LoginPage loginPage=new LoginPage();
        String    username= ConfigurationReader.get("salesmanager_username");
        String    password= ConfigurationReader.get("salesmanager_password");
        extentLogger.info("username: "+username);
        extentLogger.info("password: "+password);
        extentLogger.info("Login as a sales manager");
        loginPage.login(username,password);



        ContactsPage contactsPage=new ContactsPage();
        extentLogger.info("Navigate to Customer-- Contacts Page");
        contactsPage.navigateToModule("Customers","Contacts");
        contactsPage.waitUntilLoaderScreenDisappear();
        extentLogger.info("Click on mbrackstone9@example.com email");
        contactsPage.getContantEmail("mbrackstone9@example.com").click();

        ContactInfoPage contactInfoPage=new ContactInfoPage();

        String actualFullname=contactInfoPage.fullname.getText();
        String expectedFullname="Ms Mariam Brackstone";


        extentLogger.info("Verify fullname is "+expectedFullname);
        Assert.assertEquals(actualFullname,expectedFullname,"Verify fullnames");

        extentLogger.info("Verify email is +18982323434");
        Assert.assertEquals(contactInfoPage.email.getText(),"mbrackstone9@example.com");
        extentLogger.info("Verify phone Number is mbrackstone9@example.com");
        Assert.assertEquals(contactInfoPage.phone.getText(),"+18982323434");
    }

}
