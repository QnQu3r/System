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
 public class ChinskaFabryka implements FabrykaZabawek {
    public Zabawka produkujZabawkeWgGlosu (String glos) throws NieMaTakiejZabawki{
        if(glos.equalsIgnoreCase("Bul"))
            return new Rybka();
        else if(glos.equalsIgnoreCase("Hau"))
            return new Pies();
        else if(glos.equalsIgnoreCase("Miau"))
            return new Kot();
        else
        throw new NieMaTakiejZabawki();
        
    }
}
