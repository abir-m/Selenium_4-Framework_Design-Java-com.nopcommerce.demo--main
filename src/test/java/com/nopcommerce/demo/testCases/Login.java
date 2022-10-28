package com.nopcommerce.demo.testCases;

import org.testng.annotations.Test;
import com.nopcommerce.demo.pageObject.LoginPagePO;
import base.BaseTest;

public class Login extends BaseTest {

	@Test
	public void LoginTest() {
		LoginPagePO loginpagepo = new LoginPagePO();
		loginpagepo.enterEmail("admin@yourstore.com");
		loginpagepo.enterPassword("admin");
		loginpagepo.clickOnLogin();
		logger.info("Login is Successful");

	}
}
