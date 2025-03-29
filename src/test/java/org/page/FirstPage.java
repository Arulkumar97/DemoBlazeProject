package org.page;

import org.blaze.DemoBlazeBass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstPage extends DemoBlazeBass {
	public FirstPage() {
		PageFactory.initElements(driver, this);
	}
//	@FindBy(xpath="//a[text()='Sign up']")
//	private WebElement signUp;
//	public WebElement getSignUp() {
//		return signUp;
//	}
//	
//	@FindBy(xpath="(//input[@type='text'])[3]")
//	private WebElement name;
//	public WebElement getName() {
//		return name;
//	}
//	@FindBy(xpath="(//input[@type='password'])[1]")
//	private WebElement pass;
//	public WebElement getPass() {
//		return pass;
//	}
//	
//	@FindBy(xpath="//button[text()='Sign up']")
//	private WebElement sign;
//	public WebElement getSign() {
//		return sign;
//	}
	@FindBy(xpath="//a[text()='Log in']")
	private WebElement login;
	public WebElement getLogin() {
		return login;
	}
	@FindBy(xpath="(//input[@type='text'])[4]")
	private WebElement userName;
     public WebElement getUserName() {
		return userName;
	}
     
     @FindBy(xpath="(//input[@type='password'])[2]")
     private WebElement pass;
     public WebElement getPass() {
		return pass;
	}
     @FindBy(xpath="(//button[@type='button'])[9]")
     private WebElement log;
     public WebElement getLog() {
		return log;
	}
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
}
