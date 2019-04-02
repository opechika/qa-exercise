package com.valtech.stepDefinitions;

import com.valtech.baseClass.ValtechCommon;
import com.valtech.pages.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ValtechSteps extends ValtechCommon{

	HomePage homepage = new HomePage();
	
	@Given("I navigate to Valtech homepage")
	public void i_navigate_to_Valtech_homepage() throws Throwable {
		
		launchUrl("https://www.valtech.com/en-gb/");
	    
	}

	@When("I click on menu icon")
	public void i_click_on_menu_icon() throws Throwable {
		
		homepage.closeCookiePolicy();
		homepage.clickOnMenuIcon();
	    
	}

	@Then("the menu dropdown contains {string}")
	public void the_menu_dropdown_contains(String link) throws Throwable {
		homepage.isLinkContainsInTheList(link);
	}
	
	@When("I click on {string} link")
	public void i_click_on_link(String link) throws Throwable {
	    homepage.clickOnOneOfTheLinks(link);
	}

	@Then("{int} project cases are displayed")
	public void project_cases_are_displayed(Integer num) throws Throwable {
	    homepage.howManyProjectCaseIsDisplayed(num);
	}


}
