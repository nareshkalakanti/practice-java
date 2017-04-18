//package com.java.test;
//
//import static org.junit.Assert.*;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
//import jxl.Sheet;
//import jxl.Workbook;
//import jxl.write.Label;
//import jxl.write.WritableSheet;
//import jxl.write.WritableWorkbook;
//
//public class ReadfromExel {
//
//	@Test
//	public void test() throws Exception {
//FileInputStream fi=new FileInputStream("D:\\workspace\\seleniumAutomation\\TestData\\Eknath.xls");
//Workbook w=Workbook.getWorkbook(fi);
//Sheet s=w.getSheet("Sheet1");
//Thread.sleep(2000);
//FileOutputStream fo=new FileOutputStream("D:\\workspace\\seleniumAutomation\\Result\\Result.xls");
//WritableWorkbook wb=Workbook.createWorkbook(fo);
//WritableSheet ws=wb.createSheet("Sheet1",0);
//for(int i=1; i<=s.getRows();i++)
//{
//	for(int j=0; j<=s.getColumns(); j++)
//	{
//		System.out.println(s.getCell(j, i).getContents());
//	}
//}Label un=new Label(0,0, "Usename");
//Label ps=new Label(1,0, "password");
//ws.addCell(un);
//ws.addCell(ps);
//wb.write();
//wb.close();
//
//	}
//
//}
