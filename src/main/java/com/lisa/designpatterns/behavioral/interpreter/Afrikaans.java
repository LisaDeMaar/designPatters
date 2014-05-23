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
public class Afrikaans implements Expression
{
    @Override
    public String translateWord(String wordGiven)
    {
        String afrikaansTranslation = "";
        
        if(wordGiven == "cheese")
        {
            afrikaansTranslation = "kaas";
        }
        else if(wordGiven == "carne")
        {
            afrikaansTranslation = "vleis";
        }
        
        return afrikaansTranslation;
    }
    
    
}
