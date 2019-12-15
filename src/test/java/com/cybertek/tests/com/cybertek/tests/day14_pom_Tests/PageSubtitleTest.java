package com.cybertek.tests.com.cybertek.tests.day14_pom_Tests;

import com.cybertek.tests.com.cybertek.pages.CalendarEventsPage;
import com.cybertek.tests.com.cybertek.pages.DashboardPage;
import com.cybertek.tests.com.cybertek.pages.LoginPage;
import com.cybertek.tests.com.cybertek.tests.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageSubtitleTest extends TestBase {


    @Test
    public void verifySubtitleTest(){

        LoginPage loginPage=new LoginPage();

        String username= ConfigurationReader.get("driver_username");
        String password= ConfigurationReader.get("driver_password");

        loginPage.login(username,password);

        DashboardPage dashboardPage=new DashboardPage();
        // expected title
        String expectedSubtitle="Quick Launchpad";
        // actual title from website
        String actualSubtitle=dashboardPage.getPageSubTitle();

        // verify titles are matching
        Assert.assertEquals(actualSubtitle,expectedSubtitle,"verify subtitles");

        dashboardPage.navigateToModule("Activities","Calendar Events");

        CalendarEventsPage calendarEventsPage=new CalendarEventsPage();

        Assert.assertEquals(calendarEventsPage.getPageSubTitle(),"Calendar Events","verify subtitles");

    }
}
