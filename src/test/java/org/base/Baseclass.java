package org.base;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
public static WebDriver driver;
public static  WebDriver browLaunch(String bname) {
	if(bname.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	else if(bname.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
	else if(bname.equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}
	return driver;

}
public static void urlLaunch(String url,int i) {
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(i));
}

public static  String getTitle() {
	String title = driver.getTitle();
return title;
}

public static  String getCurrentUrl() {
	String currentUrl = driver.getCurrentUrl();
	return currentUrl;
}

public static void quit() {
driver.quit();
}

public static void close() {
	driver.close();

}

public static  void clickk(WebElement e) {
	e.click();

}

public static void sendkeys(WebElement e,String Value) {
	e.sendKeys(Value);
}

public static  String getText(WebElement t) {
	String text = t.getText();
	return text;
}

public static  String getAttribute(WebElement t,String i) {
	String attribute = t.getAttribute(i);
	return attribute;
}

public static  void selectByIndex( WebElement e,int index) {
	Select s=new Select(e);
s.selectByIndex(index);
}

public static  void selectByValue(WebElement e,String value) {
	Select s=new Select(e);
	s.selectByValue(value);
}


public static void selectByVisibleText(WebElement e,String text) {
	Select s=new Select(e);
			s.selectByVisibleText(text);
}

public static  List<WebElement> drive(String s,WebElement e) {
	List<WebElement> list = driver.findElements(By.tagName(s));
	return list;

}
public static String readExcel(String filename,String sheet,int row,int cell) throws IOException {
	File f= new File("C:\\Users\\udaya\\eclipse-workspace\\MavenTest\\src\\test\\resources\\Excel\\"+filename+".xlsx");
	FileInputStream si=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(si);
	Sheet k = w.getSheet(sheet);
Row ro = k.getRow(row);
Cell cell2 = ro.getCell(cell);
int Type = cell2.getCellType();	
String value=null;
if(Type==1) {
	value=cell2.getStringCellValue();
}	
else {
	if(DateUtil.isCellDateFormatted(cell2)) {
		Date dateCellValue = cell2.getDateCellValue();
	SimpleDateFormat sd= new SimpleDateFormat();
	value=sd.format(dateCellValue);
	}
	else {
		double numericCellValue = cell2.getNumericCellValue();
	long num=(long)numericCellValue;
 value= String.valueOf(num);

	}
}

return value;
}
public static void thr(int a) throws InterruptedException {
	Thread.sleep(a);
}




	

}
