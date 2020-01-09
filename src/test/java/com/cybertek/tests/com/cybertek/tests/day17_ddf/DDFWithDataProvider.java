package com.cybertek.tests.com.cybertek.tests.day17_ddf;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDFWithDataProvider {

    @DataProvider
    public Object[][] testData(){

        String[][] data={

                {"GoT","5"},
                {"HIMYM","6"},
                {"POI","10"},
                {"BB","7"},
                {"BBT","3"},
                {"Chernobyl","8"},
                {"Prison Break","8"}
        };

        return data;
    }
    // get data from data provider and pass as and argument
    @Test(dataProvider = "testData")
    public void test1(String tvShow, String rating){

        System.out.println("Tv show :"+tvShow+" has rating :"+ rating);

    }
}
