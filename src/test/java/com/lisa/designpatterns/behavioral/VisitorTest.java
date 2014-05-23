/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lisa.designpatterns.behavioral;


import com.lisa.designpatterns.behavioral.visitor.NumberElement;
import com.lisa.designpatterns.behavioral.visitor.NumberVisitor;
import com.lisa.designpatterns.behavioral.visitor.SumVisitor;
import com.lisa.designpatterns.behavioral.visitor.ThreeElement;
import com.lisa.designpatterns.behavioral.visitor.TotalSumVisitor;
import com.lisa.designpatterns.behavioral.visitor.TwoElement;
import java.util.ArrayList;
import java.util.List;
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
public class VisitorTest {
    
    public VisitorTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void VisitorMethod()
    {
                TwoElement two1 = new TwoElement(3, 3);
		TwoElement two2 = new TwoElement(2, 7);
		ThreeElement three1 = new ThreeElement(3, 4, 5);

		List<NumberElement> numberElements = new ArrayList<NumberElement>();
		numberElements.add(two1);
		numberElements.add(two2);
		numberElements.add(three1);

		System.out.println("Visiting element list with SumVisitor");
		NumberVisitor sumVisitor = new SumVisitor();
		sumVisitor.visit(numberElements);

		System.out.println("\nVisiting element list with TotalSumVisitor");
		TotalSumVisitor totalSumVisitor = new TotalSumVisitor();
		totalSumVisitor.visit(numberElements);
		System.out.println("Total sum:" + totalSumVisitor.getTotalSum());
                
                Assert.assertNotEquals(two1, two2);
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