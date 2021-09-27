package com.automation.driver;

import org.openqa.selenium.WebDriver;

public class DriverManager {

	private DriverManager() {

	}

	private static ThreadLocal<WebDriver> dr = new ThreadLocal();

	public static WebDriver getDriver() {
		return dr.get();
	}

	public static void setDriver(WebDriver driverRef) {
		dr.set(driverRef);
	}

	public static void unLoad() {
		dr.remove();
	}

}
