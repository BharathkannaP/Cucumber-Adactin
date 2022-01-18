package org.stepdefinition;

import static org.junit.Assert.assertSame;

import org.BaseClass.BaseClass;
import org.Pages.Search_Hotel;
import org.Pages.Select_Hotel_Next;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;

public class Verifydate extends BaseClass {
	@Then("Verify that check-in-date and check-out-dates are the same as selected in search hotel form")
	public void verify_that_check_in_date_and_check_out_dates_are_the_same_as_selected_in_search_hotel_form() {
		Search_Hotel s;
		Select_Hotel_Next s1;
		//Check in
		s=new Search_Hotel();
		WebElement r=s.getDrpdatein();
		System.out.println(r.getText());
		
		s1=new Select_Hotel_Next();
		WebElement r1=s1.getCheckindate();
		System.out.println(r1.getText());
		assertSame(r, r1);
		
		//Check out 
		s=new Search_Hotel();
		WebElement r2=s.getDrpdatein();
		System.out.println(r2.getText());
		
		s1=new Select_Hotel_Next();
		WebElement r3=s1.getCheckoutdate();
		System.out.println(r3.getText());
		assertSame(r2, r3);
	}}


