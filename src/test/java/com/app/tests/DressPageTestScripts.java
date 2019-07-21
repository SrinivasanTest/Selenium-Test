package com.app.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.pages.DressPageObject;
import com.app.pages.HomePageObjects;

public class DressPageTestScripts {
	DressPageObject dp;
	HomePageObjects hp;
	
	public DressPageTestScripts()
	{
	hp = new HomePageObjects();
	dp=new DressPageObject();
	}
	//Scenario 5
	@Test
	public void verifyHeaderCount() {
		hp.clickDresses();
		Assert.assertEquals(dp.getCountFromHeader(), dp.getProductCount(), "Failed: Not Equal");
	}
	//Scenario 4
	@Test
	public void verifySizesDisplay()
		{
		hp.clickDresses();
		dp.scrollDownPage();
		Assert.assertTrue(dp.getProductSizesDisplay(), "Failed: Different sizes not displayed");
	}
//Scenario 6
	@Test
	public void addProduct()
	{
		hp.clickDresses();
		dp.scrollDownDressesPage();
		dp.getFirstProduct();
		Assert.assertTrue(dp.getCartDisplay(), "Failed: Added product nopt displayed in cart");	
	}

}
