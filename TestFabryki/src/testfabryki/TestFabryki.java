/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfabryki;

import factory.ChinskaFabryka;
import factory.FabrykaZabawek;
import factory.Zabawka;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class TestFabryki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // Scanner wej = new Scanner(System.in);
     FabrykaZabawek f = new MojaFabryka();
     
     
     //String glos;
     //   System.out.print("Podaj głos: ");
     //     glos = wej.nextLine();
     Zabawka z = f.produkujZabawkeWgGlosu("Gul");
     z.dajGlos();
     z.podajTyp();
}
}