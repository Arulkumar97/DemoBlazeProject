package org.page;

import org.blaze.DemoBlazeBass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage extends DemoBlazeBass {
	public OrderPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//input[@type='text'])[4]")
	private WebElement name;
	public WebElement getName() {
		return name;
	}
	@FindBy(xpath="(//input[@class='form-control'])[6]")
	private WebElement country;
	public WebElement getCountry() {
		return country;
	}
	
	@FindBy(xpath="(//input[@class='form-control'])[7]")
	private WebElement city;
	public WebElement getCity() {
		return city;
	}
	
	@FindBy(xpath="(//input[@class='form-control'])[8]")
	private WebElement card;
	public WebElement getCard() {
		return card;
	}
	@FindBy(xpath="(//input[@class='form-control'])[9]")
	private WebElement month;
	public WebElement getMonth() {
		return month;
	}
	@FindBy(xpath="(//input[@class='form-control'])[10]")
	private WebElement year;
	public WebElement getYear() {
		return year;
	}
	@FindBy(xpath="(//button[@type='button'])[9]")
	private WebElement purchase;
	public WebElement getPurchase() {
		return purchase;
	}
	@FindBy(xpath="//button[text()='OK']")
	private WebElement submit;
	public WebElement getSubmit() {
		return submit;
	}
	@FindBy(xpath="//a[text()='Log out']")
	private WebElement logOut;
	public WebElement getLogOut() {
		return logOut;
	}
	
	
	
	
	
	
	

}
