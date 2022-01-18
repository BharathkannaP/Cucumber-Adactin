package org.stepdefinition;

import org.BaseClass.BaseClass;
import org.Pages.Book_A_Hotel;
import org.Pages.Booked_Itinery;
import org.junit.Assert;
import io.cucumber.java.en.Then;




public class VerifyLogout extends BaseClass  {


	@Then("Enter the details and click on book now")
	public void enter_the_details_and_click_on_book_now() {
		
		 Book_A_Hotel b=new Book_A_Hotel();
		 fill(b.getFrstnametxt(), "Bk");
		 fill(b.getLastnametxt(), "kanna");
		 fill(b.getAdrstxt(), "Riga");
		 fill(b.getCcnotxt(), "1234567891236547");
		 ddStringVisibleText(b.getDrpcctype(), "American Express");
		 ddStringVisibleText(b.getDrpccxpmnth(), "January");
		 ddStringVisibleText(b.getDrpccxpyr(), "2022");
		 fill(b.getCvvtxt(), "123");
		 btnClick(b.getBtnbooknw());
		 
		 Booked_Itinery bi=new Booked_Itinery();
		 btnClick(bi.getBtnitinerylogout());
		 
		String logout=driver.getTitle();
		Assert.assertTrue(logout.contains("Adactin.com - Logout"));
	}
}
