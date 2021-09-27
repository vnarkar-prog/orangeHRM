package com.automation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.automation.driver.DriverManager;

public final class LoginpageTests extends BaseTest {

	private LoginpageTests() {

	}

	@Test
	public void test1() {
		// Driver.initDriver();
		DriverManager.getDriver().findElement(By.name("q")).sendKeys("Testing Mini Bytes", Keys.ENTER);
	}

}
