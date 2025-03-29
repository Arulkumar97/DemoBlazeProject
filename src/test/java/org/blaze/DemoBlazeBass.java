package org.blaze;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoBlazeBass {
	public static WebDriver driver;
	public JavascriptExecutor js;
	
	public void browserType(String type) {
		switch (type) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
			
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
            break;
		default:
			break;
		}

	}
	
	public void lanchUrl(String url) {
		driver.get(url);

	}
	
	public void textBox(WebElement element,String value) {
		element.sendKeys(value);

	}
	public void click(WebElement element) {
		element.click();

	}
	public void alertPass() {
		Alert alert = driver.switchTo().alert();
		alert.accept();

	}
	public void selectBase(WebElement element,String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);

	}
	public void ActionBase(WebElement element) {
		Actions t=new Actions(driver);
        t.moveToElement(element).perform();
	}
	
	public void keyBoard(WebElement element) {
		try {
			element.click();
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
		} catch (Exception e) {
			
		}
		

	}
	public void passKey(WebElement element,String text) {
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','"+text+"')", element);

	}
	public void scrollAction(int num) {
		js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,"+num+")");

	}
	public void screenShot(String name) {
		try {
			TakesScreenshot t=(TakesScreenshot)driver;
	        File src = t.getScreenshotAs(OutputType.FILE);
	        File file = new File("C:\\Users\\HP\\Pictures\\Camera\\"+name+".png");
	        FileUtils.copyFile(src, file);
		} catch (Exception e) {
			
		}
		
	}
	public void sleep(int value) {
		try {
			Thread.sleep(value);
		} catch (Exception e) {
			
		}
		

	}
	
	public static String getDataWorkbook(String name,int num1,int num2) throws IOException {
		String value=null;
		File file = new File("C:\\Users\\HP\\Documents\\Ms Excel\\New folder\\Excel sheet.xlsx");
		FileInputStream files = new FileInputStream(file);
        Workbook book=new XSSFWorkbook(files);
        Sheet sheet = book.getSheet(name);
        Row row = sheet.getRow(num1);
        Cell cell = row.getCell(num2);
        CellType cellType = cell.getCellType();
        
        switch (cellType) {
		case STRING:
		 value = cell.getStringCellValue();
			break;
		case NUMERIC:
			if(DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
				value = simpleDateFormat.format(dateCellValue);
			}
			else {
				double numericCellValue = cell.getNumericCellValue();
	            BigDecimal valueOf = BigDecimal.valueOf(numericCellValue);
			    value = valueOf.toString();
			    	break;
		}
		default:
			break;
		}
        
        return value;
        
        
        
        
	}
	
	
	
	
	
	

}
