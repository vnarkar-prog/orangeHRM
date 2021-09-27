package com.automation.driver;

import java.util.Objects;

import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.constants.ConfigProperties;
import com.automation.constants.FrameworkConstants;
import com.automation.utils.ReadPropertyFile;

public class Driver {

	private Driver() {

	}

	public static void initDriver() throws Exception {
		if (Objects.isNull(DriverManager.getDriver())) {

			System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromeDriverPath());
			DriverManager.setDriver(new ChromeDriver());
			DriverManager.getDriver().manage().window().maximize();
			DriverManager.getDriver().get(ReadPropertyFile.getValue(ConfigProperties.url));
		}
	}

	public static void quitDriver() {
		if (Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.getDriver().quit();
			DriverManager.unLoad();
		}
	}

}
