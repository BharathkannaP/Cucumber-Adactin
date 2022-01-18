package org.stepdefinition;

import static org.junit.Assert.assertSame;

import org.BaseClass.BaseClass;
import org.Pages.Search_Hotel;
import org.Pages.Select_Hotel_Next;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;

public class VerifyNoofRooms extends BaseClass {
	
	@Then("Verify that no. of rooms reflected according to the no. of rooms selected in search hotel page")
	public void verify_that_no_of_rooms_reflected_according_to_the_no_of_rooms_selected_in_search_hotel_page() {
	  
		Search_Hotel s=new Search_Hotel();
		WebElement no=s.getDrproomnos();
		System.out.println(no.getText());
		
		Select_Hotel_Next s1=new Select_Hotel_Next();
		WebElement no1=s1.getNorooms();
		System.out.println(no1.getText());
		assertSame(no, no1);
	}

}
