package org.stepdefinition;

import static org.junit.Assert.assertSame;

import org.BaseClass.BaseClass;
import org.Pages.Search_Hotel;
import org.Pages.Select_Hotel_Next;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;

public class VeifyRoomType extends BaseClass {
	@Then("verify that room type reflected is the same as selected in search hotel page")
	public void verify_that_room_type_reflected_is_the_same_as_selected_in_search_hotel_page() {
		
		Search_Hotel s=new Search_Hotel();
		WebElement r=s.getDrproomtype();
		System.out.println(r.getText());
		
		Select_Hotel_Next s1=new Select_Hotel_Next();
		WebElement r1=s1.getRoomtype();
		System.out.println(r1.getText());
		assertSame(r, r1);
}}
