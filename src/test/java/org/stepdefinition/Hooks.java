package org.stepdefinition;

import org.BaseClass.BaseClass;
import org.Pages.Login_Page;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass{

	@Before(order=1)
	public void chromeExecution() {
		launchChrome();

	}
	@Before(order=2)
	public void maximizeWindow() {
		winMax();
	}
	@Before(order=3)
	public void Urllaunch() {
		loadUrl("http://adactinhotelapp.com/");
	}
	@Before(order=4)
	public void login() {
		Login_Page login= new Login_Page();
		fill(login.getTextuser(), "bharathkanna");
		fill(login.getTextpass(),"12345678");
		btnClick(login.getLoginbutton());
	}
	@After
	public void afterExecution() {
		closeChrome();
	}
}