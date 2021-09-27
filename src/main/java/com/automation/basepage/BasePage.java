package com.automation.basepage;

import org.openqa.selenium.By;

import com.automation.factory.WaitFactory;
import com.automation.factory.WaitStrategy;

public class BasePage {

	public void sendkeys(By by, String value, WaitStrategy waitstrategy) {
		WaitFactory.waitTill(waitstrategy, by).sendKeys(value);
	}

	public void click(By by, WaitStrategy waitstrategy) {
		WaitFactory.waitTill(waitstrategy, by).click();
	}

}
