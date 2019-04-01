package com.valtech.pages;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.valtech.baseClass.ValtechCommon;


public class HomePage extends ValtechCommon{
	
	private WebElement menuIcon;
	private WebElement cookie;
	private List<WebElement> links;
	
	public void closeCookiePolicy() throws Exception
	{
		cookie = getElementById("CybotCookiebotDialogBodyButtonAccept");
		cookie.click();
	}
	
	public void clickOnMenuIcon() throws Exception
	{
		waitForElementToDisplay(".icon-menu");
		
		menuIcon = getElementByClassName("icon-menu");
		
		menuIcon.click();
	}
	
	public void isLinkContainsInTheList(String link) throws Exception
	{
		waitForElementToDisplay(".site-nav__menu__primary");
		
		links = getElementsByCssSelector(".site-nav__menu__primary li");
		ArrayList<String> linkContainer = new ArrayList<String>();
		
		for(WebElement displayedLinks : links)
		{
			String linkText = displayedLinks.getText();
			linkContainer.add(linkText.toLowerCase());
		}
		
		Assert.assertTrue(link + " is not part of the links displayed on the website", 
													linkContainer.contains(link.toLowerCase()));
	}
}
