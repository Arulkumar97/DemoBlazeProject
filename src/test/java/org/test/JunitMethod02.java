package org.test;

import org.blaze.DemoBlazeBass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.page.OrderPage;

public class JunitMethod02 extends DemoBlazeBass {
	public static DemoBlazeBass test=new DemoBlazeBass();
	public static OrderPage page3=new OrderPage();
	@Test
	public void TC05() {
		page3=new OrderPage();
		WebElement submit = page3.getSubmit();
		test.click(submit);
		test.sleep(6000);
		WebElement logOut = page3.getLogOut();
		test.click(logOut);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
