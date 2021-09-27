package com.automation.factory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.constants.FrameworkConstants;
import com.automation.driver.DriverManager;

public  class WaitFactory {

	public static WebElement waitTill(WaitStrategy waitstrategy, By by) {

		WebElement el = null;
		if (waitstrategy == WaitStrategy.Clickable) {
			el = new WebDriverWait(DriverManager.getDriver(), FrameworkConstants.getExplicitTime())
					.until(ExpectedConditions.elementToBeClickable(by));
		} else if (waitstrategy == WaitStrategy.Presence) {
			el = new WebDriverWait(DriverManager.getDriver(), FrameworkConstants.getExplicitTime())
					.until(ExpectedConditions.presenceOfElementLocated(by));
		} else if (waitstrategy == WaitStrategy.Visible) {
			el = new WebDriverWait(DriverManager.getDriver(), FrameworkConstants.getExplicitTime())
					.until(ExpectedConditions.visibilityOfElementLocated(by));
		}
		return el;
	}
}
