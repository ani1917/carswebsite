package utils;

import java.io.File;
import java.io.FileNotFoundException;
import utils.ExcelUtility;
import java.util.ArrayList;

public class DataUtil {

	 public static ArrayList<Object[]> getExcelData(String fileName,String tabName) throws FileNotFoundException {
	        String path = System.getProperty("user.dir") + File.separator + 
	                 "resources"+ File.separator+fileName;
	        String excelTab = tabName;
	        ArrayList<Object[]> data = new ArrayList<Object[]>();//only objects array only we can pass.
	        ExcelUtility utility = new ExcelUtility(excelTab, path);
	      //sheetname--tab name
	        for (int rowNum = 2; rowNum <= utility.getRowCount(excelTab); rowNum++) {
	            String fname = utility.getCellData(excelTab, "FirstName", rowNum);
	            String lname = utility.getCellData(excelTab, "LastName", rowNum);
	            String email = utility.getCellData(excelTab, "Email", rowNum);
	            String mobile = utility.getCellData(excelTab, "PhoneNumber", rowNum);
	            String password = utility.getCellData(excelTab, "Password", rowNum);
	            Object obj[] = { fname,lname,email,mobile,password};
	            data.add(obj);
	        }
	        return data;
	 }
}
