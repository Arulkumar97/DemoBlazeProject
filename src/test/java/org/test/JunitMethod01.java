package org.test;

import java.io.IOException;

import org.blaze.DemoBlazeBass;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.page.FirstPage;
import org.page.OrderPage;
import org.page.SecondPage;

public class JunitMethod01 extends DemoBlazeBass{
	public static DemoBlazeBass test=new DemoBlazeBass();
	public static FirstPage page1=new FirstPage();
	public static SecondPage page2=new SecondPage();
	public static OrderPage page3=new OrderPage();
	
	@BeforeClass
	public static void TC01() throws IOException {
		test.browserType("chrome");
		test.lanchUrl("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		page1=new FirstPage();
		WebElement login = page1.getLogin();
		test.click(login);
		test.sleep(2000);
		WebElement userName = page1.getUserName();
		test.textBox(userName,getDataWorkbook("Sheet1", 1, 0));
		WebElement pass = page1.getPass();
		test.textBox(pass,getDataWorkbook("Sheet1",1,1));
		WebElement log = page1.getLog();
		test.click(log);
		test.sleep(5000);
		//st.screenShot("LoginPage");
		//st.sleep(2000);
	    test.scrollAction(600);
		
	}
	@Before
	public void TC02() {
		page2=new SecondPage();
		WebElement mobile = page2.getMobile();
		test.click(mobile);
		test.sleep(3000);
	    WebElement addCart = page2.getAddCart();
		test.click(addCart);
		test.sleep(2000);
		test.alertPass();
	}
	
	@Test
	public void TC03() {
		page2=new SecondPage();
		WebElement cart = page2.getCart();
		test.click(cart);
		WebElement order = page2.getOrder();
        test.click(order);
        test.sleep(2000);
	}
	
	@After
	public void TC04() {
        page3=new OrderPage();
        WebElement name = page3.getName();
		test.textBox(name, "Kumar");
		WebElement country = page3.getCountry();
		test.textBox(name, "India");
		WebElement city = page3.getCity();
		test.passKey(city, "Rasipuram");
		WebElement card = page3.getCard();
		test.textBox(card, "123443211234");
		test.scrollAction(300);
		WebElement month = page3.getMonth();
		test.textBox(month, "June");
		WebElement year = page3.getYear();
		test.textBox(year, "2025");
		WebElement purchase = page3.getPurchase();
		test.click(purchase);
		test.sleep(2000);
		
		System.out.println("completed");
		System.out.println("checking");
		
		System.out.println("ok");
		System.out.println("excfvgs");
	}
	
		
		
		
		
	

}
