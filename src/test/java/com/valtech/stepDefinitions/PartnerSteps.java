package com.valtech.stepDefinitions;

import com.valtech.baseClass.ValtechCommon;
import com.valtech.pages.PartnerPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PartnerSteps extends ValtechCommon {
	
	PartnerPage partnerpage = new PartnerPage();

	@Given("I navigate to Valtech partner page")
	public void i_navigate_to_Valtech_partner_page() throws Throwable {
		launchUrl("https://www.valtech.com/en-gb/partners/");
	}

	@When("I click on {int} logo on the list")
	public void i_click_on_logo_on_the_list(Integer noOnTheList) throws Throwable {
	  partnerpage.clickOnALogo(noOnTheList);
	}

	@Then("{string} is displayed")
	public void is_displayed(String partner) throws Throwable {
		
	   partnerpage.isTheRightPartnerDisplayed(partner);
	}
}
