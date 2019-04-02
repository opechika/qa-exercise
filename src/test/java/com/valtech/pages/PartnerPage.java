package com.valtech.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.valtech.baseClass.ValtechCommon;

public class PartnerPage extends ValtechCommon{
	
	private List<WebElement> logos;
	
	
	public void clickOnALogo(int linkNo) throws Exception
	{
		closeCookiePolicy();
		scrollDown();
		scrollDown();
		
		waitForElementToBeClickable(".logo-block__logo");
		logos = getElementsByCssSelector(".logo-block__logo");
		moveToElement(logos.get(linkNo - 1));
		logos.get(linkNo - 1).click();
	}
	
	public void isTheRightPartnerDisplayed(String partner) throws Exception
	{
		waitForElementToDisplay(".masthead-people__visual");
		Assert.assertTrue(getCurrentDisplayedUrl().toLowerCase().contains(partner.toLowerCase()));
	}

}
