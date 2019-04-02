package com.valtech.pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.valtech.baseClass.ValtechCommon;

public class ContactUsPage extends ValtechCommon
{
	private List<WebElement> offices;
	
	
	public void printNumberOfValtechOffices() throws Exception
	{
		offices = getElementsByCssSelector(".list-item");
		System.out.println(offices);
	}
	
}
