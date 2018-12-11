/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfabryki;

import factory.Zabawka;

/**
 *
 * @author student
 */
 public class Indyk implements Zabawka{
       
        public void gulgocz(){
        System.out.println("Gul");
    }
    public void podajTyp(){
        System.out.println("Indyk");
        
    }
    public void dajGlos(){
        gulgocz();
    }
}
