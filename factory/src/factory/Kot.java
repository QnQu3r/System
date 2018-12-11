/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author student
 */
class Kot implements Zabawka {
    public void miaucz(){
        System.out.println("Miau");
    }
    public void podajTyp(){
        System.out.println("Kot");
        
    }
    public void dajGlos(){
        miaucz();
    }
}
