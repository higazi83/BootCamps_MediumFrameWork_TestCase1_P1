package com.TutorialNinjaPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register_Page {
public WebDriver driver;
	
	@FindBy(id = "input-firstname")
	private WebElement firstNameField;

	@FindBy(id = "input-lastname")
	private WebElement lastNameField;
	
	@FindBy(id = "input-email")
	private WebElement emailField;
	
	@FindBy(id = "input-telephone")
	private WebElement telephoneField;
	
	@FindBy(id = "input-password")
	private WebElement passwordField;

	@FindBy(id = "input-confirm")
	private WebElement confirmPasswordField;
	
	@FindBy(name = "agree")
	private WebElement privacyPolicyCheckBox;
	
	@FindBy(xpath = "//input[@name = 'newsletter' and @value = '1']")
	private WebElement newsLetterRadioButton;
	
	@FindBy(css = "input.btn.btn-primary")
	private WebElement continueButton;
	
	public Register_Page(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	public void enterFirstname() {
		firstNameField.sendKeys("ahmad");
	}
	public void enterLastName() {
		lastNameField.sendKeys("khalil");
	}
	
	public void enterEmail() {
		emailField.sendKeys("higazi86@hotmail.com");
	}
	public void enterTelephone() {
		telephoneField.sendKeys("1234567890");
	}
	public void enterPassword() {
		passwordField.sendKeys("higazi83@");
	}
	public void enterConfirmPassword() {
		confirmPasswordField.sendKeys("higazi83@");
		
	}
	public void clickOnPrivacycheckbox() {
		privacyPolicyCheckBox.click();
	}
	public void clickOnNewsLetterButton() {
		newsLetterRadioButton.click();
	}
	public AccountSucessPage clickOnContinueButton() {
		continueButton.submit();
		return new  AccountSucessPage (driver);
	}
}
