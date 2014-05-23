/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lisa.designpatterns.behavioral;

import com.lisa.designpatterns.behavioral.interpreter.Afrikaans;
import com.lisa.designpatterns.behavioral.interpreter.Context;
import com.lisa.designpatterns.behavioral.interpreter.English;
import com.lisa.designpatterns.behavioral.interpreter.Expression;
import com.lisa.designpatterns.behavioral.interpreter.Spanish;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Lisa
 */


public class InterpreterTest {
    
    public InterpreterTest() {
    }
    @Test
    public void InterpreterTest() 
    {
        String translatedWord = "";
        String translatedWord2 = "";
        String translatedWord3 = "";
        
        //English translation
       Expression expression = new English();
       Context context = new Context.Builder("brood")
               .translationLanguage("English")
               .translationWord(translatedWord)
               .build();
       translatedWord = expression.translateWord(context.getWordGiven());
       Assert.assertEquals(translatedWord, "bread", "Test Translation to english.");
       
       //Afrikaans Translation
       Expression expression2 = new Afrikaans();
       Context context2 = new Context.Builder("carne")
               .translationLanguage("Afrikaans")
               .translationWord(translatedWord2)
               .build();
       translatedWord2 = expression2.translateWord(context2.getWordGiven());
       Assert.assertEquals(translatedWord2, "vleis", "Test Translation to afrikaans.");
       
       //Spanish Translation
       Expression expression3 = new Spanish();
       Context context3 = new Context.Builder("sweet")
               .translationLanguage("Spanish")
               .translationWord(translatedWord3)
               .build();
       translatedWord3 = expression3.translateWord(context3.getWordGiven());
       Assert.assertEquals(translatedWord3, "dulce", "Test Translation to spanish.");
       
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
