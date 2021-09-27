package com.automation.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

import com.automation.constants.ConfigProperties;

public final class ReadPropertyFile {

	private ReadPropertyFile() {

	}

	private static Properties property = new Properties();
	static {
		try {
			FileInputStream fis = new FileInputStream(
					System.getProperty("user.dir") + "/src/test/resources/config/config.properties");
			property.load(fis);
		} catch (IOException e) {

		}

	}

	public static String getValue(ConfigProperties key) throws Exception {

		if (Objects.isNull(key)) {
			throw new Exception("Check config.properties file for correct key");
		}
		return property.getProperty(key.name().toLowerCase());

	}

}
