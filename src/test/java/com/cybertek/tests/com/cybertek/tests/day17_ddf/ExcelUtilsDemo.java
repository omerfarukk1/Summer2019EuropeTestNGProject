package com.cybertek.tests.com.cybertek.tests.day17_ddf;

import com.cybertek.utilities.ExcelUtil;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ExcelUtilsDemo {

 @Test
    public void readExcelFile(){

     // create an object from ExcelUtil
     //it accepts two argument
     //Argument 1: location of the file(path)
     //Argument 2:sheet that we want to open(sheetName)

     ExcelUtil qa3short=new ExcelUtil("src/test/resourses/Vytracktestdata.xlsx","QA3-short");

     // how many row in the sheets
     System.out.println("Row Count: "+qa3short.rowCount());

     //how many columns in the sheet
     System.out.println("Column counts: "+qa3short.columnCount());

     // get Columns names
     System.out.println("Columns names:"+qa3short.getColumnsNames());
     // get all data in list of maps
     List<Map<String, String>> dataList = qa3short.getDataList();


     //print them one by one for each row
     for (Map<String, String> onerow : dataList) {

         System.out.println( onerow);

     }

      String[][] dataArray=qa3short.getDataArray();

     System.out.println(Arrays.deepToString(dataArray));
 }
}
