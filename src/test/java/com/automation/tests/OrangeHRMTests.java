package com.automation.tests;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.automation.orangeHRM.pages.LoginPage;

public final class OrangeHRMTests extends BaseTest {

	@Test(dataProvider = "LoginData")
	public void loginLogoutTest(String username, String password) {

		LoginPage lp = new LoginPage();
		String title = lp.setUsername(username).setPassword(password).clickLogin().clickWelcome().clickLogout()
				.getTitle();

		assertThat(title).isEqualTo("OrangeHRM");

	}

	@DataProvider(name = "LoginData")
	public Object[][] getData() {

		return new Object[][] { { "Admin", "admin123" } };

	}

}
