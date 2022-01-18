package org.stepdefinition;

import org.BaseClass.BaseClass;
import org.Pages.Search_Hotel;
import org.Pages.Select_Hotel_Next;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SelectHotelisdisplayed extends BaseClass {
	
	Search_Hotel s;
	@When("Enter check-in date as today")
		public void enter_check_in_date_as_today() {
		s=new Search_Hotel();
		fill(s.getDrpdatein(),"23/01/2022");
		
	}

	@When("Enter check-out date as today+one date")
	public void enter_check_out_date_as_today_one_date() {
		s=new Search_Hotel();
		fill(s.getDrpdateout(),"21/01/2022");
	}

	@When("Select No of-adults as two")
	public void select_No_of_adults_as_two() {
		s=new Search_Hotel();
		ddStringVisibleText(s.getDrpadult(), "1 - One");
	}

	@When("Select No of-children as zero")
	public void select_No_of_children_as_zero() {
		s=new Search_Hotel();
		ddStringVisibleText(s.getDrpchild(), "0 - None");
	   
	}

	@Then("Click on Search button")
	public void click_on_Search_button() {
		s=new Search_Hotel();
		btnClick(s.getBtnsubmit());
	    
	}
	
	@Then("Verify that hotel location displayed is the same as selected in search Hotel form")
	public void verify_that_hotel_location_displayed_is_the_same_as_selected_in_search_Hotel_form() {
		Select_Hotel_Next s1=new Select_Hotel_Next();
		WebElement loc=s1.getLocation();
		loc.getText();
		String actual="Sydney";
		Assert.assertEquals(loc, actual);
		quiteChrome();
	   
	}
}
