package com.automation.constants;

public class FrameworkConstants {

	private FrameworkConstants() {
// It will not allow to create object 
	}

	private static final String CHROMEDRIVERPATH = System.getProperty("user.dir")
			+ "/src/test/resources/executables/chromedriver.exe";

	private static final int ExplicitWait = 10;

	public static String getChromeDriverPath() {
		return CHROMEDRIVERPATH;
	}

	public static int getExplicitTime() {
		return ExplicitWait;
	}

}
