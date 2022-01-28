package org.stepdefinition;

import java.io.IOException;

import org.BaseClass.BaseClass;
import org.Pages.Search_Hotel;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Bookingfeature extends BaseClass {

	
	@When("Enter check-indate{string} later than the check-outdate{string} field as today + seven date and checkout today+five date and click search")
	public void enter_check_indate_later_than_the_check_outdate_field_as_today_seven_date_and_checkout_today_five_date_and_click_search(String indate, String outdate) {
		Search_Hotel search=new Search_Hotel();
		jsFill(indate,search.getDrpdatein());
		jsFill(outdate,search.getDrpdateout());
		btnClick(search.getBtnsubmit());
	}

	@Then("Verify that system gives an error saying check-indate should not be later than checkout-date")
	public void verify_that_system_gives_an_error_saying_check_indate_should_not_be_later_than_checkout_date() throws IOException {
		screenshot("Error message");

	}
	
}
