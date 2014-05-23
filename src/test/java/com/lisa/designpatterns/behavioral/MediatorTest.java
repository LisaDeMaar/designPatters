/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lisa.designpatterns.behavioral;


import com.lisa.designpatterns.behavioral.mediator.AmericanSeller;
import com.lisa.designpatterns.behavioral.mediator.Buyer;
import com.lisa.designpatterns.behavioral.mediator.DollarConverter;
import com.lisa.designpatterns.behavioral.mediator.FrenchBuyer;
import com.lisa.designpatterns.behavioral.mediator.Mediator;
import com.lisa.designpatterns.behavioral.mediator.SwedishBuyer;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author 210211911
 */
public class MediatorTest {
    
    public MediatorTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void MediatorMethod()
    {
                Mediator mediator = new Mediator();

		Buyer swedishBuyer = new SwedishBuyer(mediator);
		Buyer frenchBuyer = new FrenchBuyer(mediator);
		float sellingPriceInDollars = 10.0f;
		AmericanSeller americanSeller = new AmericanSeller(mediator, sellingPriceInDollars);
		DollarConverter dollarConverter = new DollarConverter(mediator);
                

		float swedishBidInKronor = 55.0f;
		while (!swedishBuyer.attemptToPurchase(swedishBidInKronor)) {
			swedishBidInKronor += 15.0f;
		}

		float frenchBidInEuros = 3.0f;
		while (!frenchBuyer.attemptToPurchase(frenchBidInEuros)) {
			frenchBidInEuros += 1.5f;
		}
                
                Assert.assertEquals(mediator, mediator);
              
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}