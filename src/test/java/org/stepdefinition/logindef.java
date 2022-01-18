package org.stepdefinition;


import org.BaseClass.BaseClass;
import org.Pages.Login_Page;
import org.junit.Assert;
import org.openqa.selenium.By;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class logindef extends BaseClass{
	@Given("User should be in the Adactinhotel login page")
	public void user_should_be_in_the_Adactinhotel_login_page() {
		launchChrome();
		winMax();
		loadUrl("http://adactinhotelapp.com/");
	}
	Login_Page l;
		@When("User pass the value to the username field")
	public void user_pass_the_value_to_the_username_field() {
			l=new Login_Page();
			fill(l.getTextuser(), "bharathkanna");
	}
	
	@When("User pass the value to password field")
	public void user_pass_the_value_to_password_field() {
		l= new Login_Page();
	  fill(l.getTextpass(), "12345678");
	}

	@When("User clicks the login button")
	public void user_clicks_the_login_button() {
		l= new Login_Page();
	   btnClick(l.getLoginbutton());
	}

	@Then("User should be in Search hotel page")
	public void user_should_be_in_Search_hotel_page() {
	  boolean obj= driver.findElement(By.id("username_show")).isDisplayed();
	  Assert.assertTrue(obj);
	}
	 @Then("Close the browser")
	 public void close_the_browser() {
	     closeChrome();
}
}