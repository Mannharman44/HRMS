package com.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hrms.pages.LoginPage;
import com.hrms.utils.CommonMethods;

public class LoginPageTest extends CommonMethods{
	@Test
	public void login() {
		LoginPage login=new LoginPage();
		sendText(login.username,"Admin");
		sendText(login.password,"Hum@nhrm123");
		click(login.loginBtn);

	}
	
//	@Test
//	public void negativeLogin() {
//		LoginPage login=new LoginPage();
//		sendText(login.username,"Adimn");
//		click(login.loginBtn);
//		String ex="Password cannot be empty";
//		Assert.assertEquals(login.err.getText(), ex);
//	}
}
