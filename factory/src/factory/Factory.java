/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Factory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       /* Pies burek = new Pies();
       burek.dajGlos();
       burek.podajTyp();
       burek.szczekaj();
        
       System.out.println("");
       
       Kot filemon = new Kot();
       filemon.dajGlos();
       filemon.miaucz();
       filemon.podajTyp();
       
       System.out.println("");
       
       Rybka nemo = new Rybka();
       nemo.bulgaj();
       nemo.podajTyp();
       nemo.dajGlos();
      }*/
     Scanner wej = new Scanner(System.in);
     FabrykaZabawek f = new ChinskaFabryka();
     String glos;
        System.out.print("Podaj głos: ");
         glos = wej.nextLine();
     Zabawka z = f.produkujZabawkeWgGlosu(glos);
     z.dajGlos();
     z.podajTyp();
}
}
