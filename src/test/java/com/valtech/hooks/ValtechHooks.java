package com.valtech.hooks;

import com.valtech.baseClass.ValtechCommon;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class ValtechHooks extends ValtechCommon
{
	@Before
	public void setUp() throws Exception
	{
		LaunchBrowser("Chrome");
	}
	
	@After
	public void tearDown() throws Exception
	{
		closeBrowser();
	}
}
