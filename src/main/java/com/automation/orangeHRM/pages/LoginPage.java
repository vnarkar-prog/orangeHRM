package com.automation.orangeHRM.pages;

import org.openqa.selenium.By;

import com.automation.basepage.BasePage;
import com.automation.driver.DriverManager;
import com.automation.factory.WaitStrategy;

public final class LoginPage extends BasePage {

	private final By textUsername = By.id("txtUsername");
	private final By textpassword = By.id("txtPassword");
	private final By btnLogin = By.id("btnLogin");

	public LoginPage setUsername(String username) {
		sendkeys(textUsername, username, WaitStrategy.Presence);
		return this;
	}

	public LoginPage setPassword(String password) {
		sendkeys(textpassword, password, WaitStrategy.Presence);
		return this;
	}

	public HomePage clickLogin() {
		click(btnLogin, WaitStrategy.Clickable);
		return new HomePage();
	}

	public String getTitle() {

		return DriverManager.getDriver().getTitle();
	}

}
