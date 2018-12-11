/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfabryki;

import factory.ChinskaFabryka;
import factory.Zabawka;

/**
 *
 * @author student
 */
public class MojaFabryka extends ChinskaFabryka {
    public Zabawka produkujZabawkeWgGlosu(String glos){
        if(glos.equalsIgnoreCase("Gul"))
        {
            /*if(Math.random()> 0.5)
                return new Nurek();
            else */
                return new Indyk();
        }
        else return super.produkujZabawkeWgGlosu(glos);
    }
}
