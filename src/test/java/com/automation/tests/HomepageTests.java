package com.automation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.automation.driver.DriverManager;

public final class HomepageTests extends BaseTest {

	private HomepageTests() {

	}

	@Test
	public void test2() {

		DriverManager.getDriver().findElement(By.name("q")).sendKeys("Testing Mini Bytes", Keys.ENTER);
		
		
	}
}
