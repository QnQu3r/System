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
public interface FabrykaZabawek {
    public Zabawka produkujZabawkeWgGlosu(String glos)  throws NieMaTakiejZabawki;
}
