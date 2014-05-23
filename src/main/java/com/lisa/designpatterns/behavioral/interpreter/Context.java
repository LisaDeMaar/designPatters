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
public class Context 
{
   private String wordGiven;
   private String translationLanguage;
   private String translatedWord;
   
   
   private Context()
   {
       
   }
   
   private Context(Builder builder)
   {
       wordGiven = builder.wordGiven;
       translationLanguage = builder.translationLanguage;
       translatedWord = builder.translatedWord;
   }
   
   public static class Builder
   {
       private String wordGiven;
       private String translationLanguage;
       private String translatedWord;
       
       public Builder(String wordGiven)
       {
           this.wordGiven = wordGiven;
       }
       
       public Builder translationLanguage(String value) {
           
            translationLanguage = value;
            return this;
        }
       
         public Builder translationWord(String value) {
           
            translatedWord = value;
            return this;
        }
         
         public Context build()
         {
             return new Context(this);
         }
   }

    public String getWordGiven() {
        return wordGiven;
    }

    public String getTranslationLanguage() {
        return translationLanguage;
    }

    public String getTranslatedWord() {
        return translatedWord;
    }
   
   
   
}
