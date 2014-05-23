/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lisa.designpatterns.behavioral.interpreter;

/**
 *
 * @author Lisa
 */
public class Spanish implements Expression
{
    @Override
    public String translateWord(String wordGiven)
    {
        String spanishTranslation = "";
        
        if(wordGiven == "sweet")
        {
            spanishTranslation = "dulce";
        }
        else if(wordGiven == "liefde")
        {
            spanishTranslation = "amor";
        }
        
        return spanishTranslation;
    }
            
    
}
