package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class SettingsPage extends TestBase {
	
	@FindBy(xpath="//button[@id=\"settings\"]")
	public WebElement settings_button;
	
	@FindBy(xpath="//button[@id=\"settings-users\"]")
	public WebElement user_button;
	
	@FindBy(xpath="//input[@id=\"employees-search-input\"]")
	public WebElement user_search;
	
	@FindBy(xpath="//button[@id=\"employees-search-button\"]")
	public WebElement user1_button;
	
	@FindBy(xpath="//table/tbody/tr[1]/td[1]")
	public WebElement user_table;
	
	@FindBy(xpath="//button[@id=\"employees-add-user-button\"]")
	public WebElement user_adduser;
	
	@FindBy(xpath="//input[@id=\"employee-modal-first-name-input\"]")
	public WebElement user_firstname;
	
	@FindBy(xpath="//input[@id=\"employee-modal-last-name-input\"]")
	public WebElement user_lastname;
	
	@FindBy(xpath="//input[@id=\"employee-modal-employee-number-input\"]")
	public WebElement user_employeeno;
	
	@FindBy(xpath="//input[@id=\"employee-modal-phone-number-input\"]")
	public WebElement user_phno;
	
	@FindBy(xpath="//input[@id=\"employee-modal-date-of-birth-input\"]")
	public WebElement user_dob;
	
	@FindBy(xpath="//option[@value=\"MEMBER\"]")
	public WebElement user_role_member;
	
	@FindBy(xpath="//option[@value=\"ADMIN\"]")
	public WebElement user_role_admin;
	
	@FindBy(xpath="//*[contains(text(),\"Create\")]")
	public WebElement user_create;
	
	@FindBy(xpath="//*[contains(text(),\"Cancel\")]")
	public WebElement user_cancel;
	
	@FindBy(xpath="//div[@id=\"5\"]")
	public WebElement users_div;
	
	
	public WebElement usernmae; 
	
	public SettingsPage(){
		PageFactory.initElements(driver, this);
	
	}

}
