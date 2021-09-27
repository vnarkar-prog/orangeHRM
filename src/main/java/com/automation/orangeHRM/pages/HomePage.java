package com.automation.orangeHRM.pages;

import org.openqa.selenium.By;

import com.automation.basepage.BasePage;
import com.automation.factory.WaitStrategy;

public class HomePage extends BasePage {

	private final By linkWelcome = By.xpath("//a[@id='welcome']");
	private final By linkLogout = By.xpath("//a[text()='Logout']");

	public HomePage clickWelcome() {
		click(linkWelcome, WaitStrategy.Clickable);
		return this;
	}

	public LoginPage clickLogout() {
		click(linkLogout, WaitStrategy.Clickable);
		return new LoginPage();
	}

}
