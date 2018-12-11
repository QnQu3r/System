/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;
 


     class Rybka implements Zabawka {
    public void bulgaj(){
        System.out.println("Bul");
    }
    public void podajTyp(){
        System.out.println("Rybka");
        
    }
    public void dajGlos(){
        bulgaj();
    }
}

