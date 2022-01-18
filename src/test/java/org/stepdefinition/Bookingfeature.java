package org.stepdefinition;

import java.io.IOException;

import org.BaseClass.BaseClass;
import org.Pages.Login_Page;
import org.Pages.Search_Hotel;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Bookingfeature extends BaseClass {

	@Given("Launch hotel reservation application")
	public void launch_hotel_reservation_application() {
		launchChrome();
		winMax();
		loadUrl("http://adactinhotelapp.com/");
	    
	}
	
	@When("Login to the application using username and password")
	public void login_to_the_application_using_username_and_password() {
		Login_Page l= new Login_Page();
		fill(l.getTextuser(), "bharathkanna");
		fill(l.getTextpass(),"12345678");
		btnClick(l.getLoginbutton());
	   
	}
	Search_Hotel s;
	@And("Select location as Sydney")
	public void select_location_as_Sydney() {
	    s= new Search_Hotel();
	   ddStringVisibleText(s.getDrplocation(), "Sydney");
	}

	@And("Select hotel as hotel creek")
	public void select_hotel_as_hotel_creek() {
		s=new Search_Hotel();
		ddStringVisibleText(s.getDrphotels(), "Hotel Creek");
	    
	}

	@And("Select room type as standard")
	public void select_room_type_as_standard() {
		s=new Search_Hotel();
		ddStringVisibleText(s.getDrproomtype(), "Standard");
	}
	@And("Select no-ofrooms as oneday")
	public void select_no_ofrooms_as_oneday() {
		s=new Search_Hotel();
		ddStringValue(s.getDrproomnos(), "2");
		wait(1000);
	}

	@And("Enter check-indate later than the check-outdate field as today + seven date and checkout today+five date and click search")
	public void enter_check_indate_later_than_the_check_outdate_field_as_today_seven_date_and_checkout_today_five_date_and_click_search() {
		s=new Search_Hotel();
		fill(s.getDrpdatein(),"23/01/2022");
		fill(s.getDrpdateout(),"21/01/2022");
		btnClick(s.getBtnsubmit());
	}

	@Then("Verify that system gives an error saying check-indate should not be later than checkout-date")
	public void verify_that_system_gives_an_error_saying_check_indate_should_not_be_later_than_checkout_date() throws IOException {
		screenshot("img");

	}
	
}
