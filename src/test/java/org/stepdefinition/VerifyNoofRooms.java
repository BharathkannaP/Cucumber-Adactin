package org.stepdefinition;

import static org.junit.Assert.assertSame;

import org.BaseClass.BaseClass;
import org.Pages.Search_Hotel;
import org.Pages.Select_Hotel_Next;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyNoofRooms extends BaseClass {
	public String roomselected;
	@When("Select no-ofrooms {string}")
	public void select_no_ofrooms(String room) {
		Search_Hotel search=new Search_Hotel();
		WebElement roominput=search.getDrproomnos();
		Select select=new Select(roominput);
		select.selectByVisibleText(room);
		roomselected=roominput.getAttribute("value");
		System.out.println(roomselected);
	}
	
	@Then("Verify that no. of rooms reflected according to the no. of rooms selected in search hotel page")
	public void verify_that_no_of_rooms_reflected_according_to_the_no_of_rooms_selected_in_search_hotel_page() {
	
		
		Select_Hotel_Next select=new Select_Hotel_Next();
		WebElement roombook=select.getNorooms();
		String roombooked=roombook.getAttribute("value");
		System.out.println(roombooked);
		assertSame(roomselected, roombooked);
	}

}
