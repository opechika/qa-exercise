package com.valtech.pages;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.valtech.baseClass.ValtechCommon;


public class HomePage extends ValtechCommon{
	
	private WebElement menuIcon;
	private List<WebElement> links;
	private List<WebElement> cases;
	
	
	
	public void clickOnMenuIcon() throws Exception
	{
		waitForElementToDisplay(".icon-menu");
		
		menuIcon = getElementByClassName("icon-menu");
		
		menuIcon.click();
	}
	
	public void isLinkContainsInTheList(String link) throws Exception
	{
		waitForElementToDisplay(".site-nav__menu__primary");
		
		listOfLinks();
		ArrayList<String> linkContainer = new ArrayList<String>();
		
		for(WebElement displayedLinks : links)
		{
			String linkText = displayedLinks.getText();
			linkContainer.add(linkText.toLowerCase());
		}
		
		Assert.assertTrue(link + " is not part of the links displayed on the website", 
													linkContainer.contains(link.toLowerCase()));
	}
	
	public void clickOnOneOfTheLinks(String link) throws Exception
	{
		waitForElementToDisplay(".site-nav__menu__primary");
		
		listOfLinks();
	
		
		for(WebElement displayedLinks : links)
		{
			String linkText = displayedLinks.getText();
			
			if(linkText.equalsIgnoreCase(link))
			{
				displayedLinks.click();
			}
		}
	}

	private void listOfLinks() throws Exception {
		links = getElementsByCssSelector(".site-nav__menu__primary li");
	}
	
	public void howManyProjectCaseIsDisplayed(int num) throws Exception
	{
		cases = getElementsByCssSelector("[href*='/work/'] h4");
		
		int noOfCases = cases.size();
		
		Assert.assertTrue(noOfCases + " is not equal to " + num, noOfCases == num);
		
		for(WebElement project : cases)
		{
			String projectText = project.getText();
			if(!projectText.isEmpty())
				System.out.println(projectText);
		}
		
	}
}
