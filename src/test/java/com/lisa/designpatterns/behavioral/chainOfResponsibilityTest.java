/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lisa.designpatterns.behavioral;


import com.lisa.designpatterns.behavioral.chainOfResponsibility.EarthHandler;
import com.lisa.designpatterns.behavioral.chainOfResponsibility.MercuryHandler;
import com.lisa.designpatterns.behavioral.chainOfResponsibility.PlanetEnum;
import com.lisa.designpatterns.behavioral.chainOfResponsibility.PlanetHandler;
import com.lisa.designpatterns.behavioral.chainOfResponsibility.VenusHandler;
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
public class chainOfResponsibilityTest {
    
    public chainOfResponsibilityTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void chainOfResMethod()
    {
        PlanetHandler chain = setUpChain();
        
                

		chain.handleRequest(PlanetEnum.VENUS);
		chain.handleRequest(PlanetEnum.MERCURY);
		chain.handleRequest(PlanetEnum.EARTH);
		chain.handleRequest(PlanetEnum.JUPITER);
                
                Assert.assertEquals(chain, chain);
                
                
               
    }
 public static PlanetHandler setUpChain() 
                {
		PlanetHandler mercuryHandler = new MercuryHandler();
		PlanetHandler venusHandler = new VenusHandler();
		PlanetHandler earthHandler = new EarthHandler();

		mercuryHandler.setSuccessor(venusHandler);
		venusHandler.setSuccessor(earthHandler);

		return mercuryHandler;
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