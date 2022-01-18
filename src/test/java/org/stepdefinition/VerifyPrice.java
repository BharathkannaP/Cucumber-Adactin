package org.stepdefinition;

import org.BaseClass.BaseClass;
import org.Pages.Book_A_Hotel;
import org.Pages.Select_Hotel_Next;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;


public class VerifyPrice extends BaseClass {
	@Then("Select the hotel and click on continue button")
	public void select_the_hotel_and_click_on_continue_button() {
	    Select_Hotel_Next s= new Select_Hotel_Next();
	    btnClick(s.getBtnradio());
	    btnClick(s.getBtncontinue());
	}

	
	@Then("Verify the total price\\(excl GST) is being calculated as \\(price-pernight*no-ofrooms*no-ofdays)")
	public void verify_the_total_price_excl_GST_is_being_calculated_as_price_pernight_no_ofrooms_no_ofdays() {
		Book_A_Hotel bh= new Book_A_Hotel();
		WebElement room=bh.getNoofrooms();
		String s=room.getText();
		int i=Integer.parseInt(s);
		
		WebElement days=bh.getTotaldays();
		String s1=days.getText();
		int j=Integer.parseInt(s1);
		
		WebElement price=bh.getPricepernight();
		String s2=price.getText();
		int k=Integer.parseInt(s2);
		
		//price-pernight*no-ofrooms*no-ofdays
		int l=i*j*k;
		
		WebElement ptot=bh.getTotalprice();
		String s3=ptot.getText();
		int m=Integer.parseInt(s3);
		
		Assert.assertEquals(l, m);
		
	
	
		
		
		
	
	}

}
