package org.page;

import org.blaze.DemoBlazeBass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecondPage extends DemoBlazeBass {
	public SecondPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Samsung galaxy s6']")
	private WebElement mobile;
	public WebElement getMobile() {
		return mobile;
	}
	
	@FindBy(xpath="//a[text()='Add to cart']")
	private WebElement addCart;
	public WebElement getAddCart() {
		return addCart;
	}
	@FindBy(xpath="//a[text()='Cart']")
	private WebElement cart;
	public WebElement getCart() {
		return cart;
	}
	
	@FindBy(xpath="//button[text()='Place Order']")
	private WebElement order;
	public WebElement getOrder() {
		return order;
	}
	
	
	
	
	

}
