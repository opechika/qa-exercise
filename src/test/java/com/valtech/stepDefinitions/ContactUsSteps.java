package com.valtech.stepDefinitions;

import com.valtech.baseClass.ValtechCommon;
import com.valtech.pages.ContactUsPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ContactUsSteps extends ValtechCommon{

	ContactUsPage contact = new ContactUsPage();
	
	@Given("I navigate to Valtech contact page")
	public void i_navigate_to_Valtech_contact_page() throws Throwable {
	    launchUrl("https://www.valtech.com/en-gb/about/contact-us/");
	}
	
	@Then("the total number of Valtech offices is displayed")
	public void the_total_number_of_Valtech_offices_is_displayed() throws Throwable {
		contact.closeCookiePolicy();
	    contact.printNumberOfValtechOffices();
	}
}
