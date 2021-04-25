package com.qa.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;
import com.qa.opencart.utils.Contants;

public class LoginPageTest extends BaseTest {


	@Test(priority = 1)
	public void loginPageTitleTest(){
		String title = loginPage.getLoginPateTitle();
		System.out.println("login page title : " + title);
		Assert.assertEquals(title, Contants.LOGIN_PAGE_TITLE);
		
	}
	
	@Test(priority = 2)
	public void forgotPwdLinkTest(){
		Assert.assertTrue(loginPage.isForgotPwdLinkExist());;
	}

	@Test(priority = 3)
	public void loginTest(){
		accPage = loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		Assert.assertEquals(accPage.getAccPageTitle(),Contants.HOME_PAGE_TITLE);
	}
	
}


