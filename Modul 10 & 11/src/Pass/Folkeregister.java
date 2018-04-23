package Pass; /**
 * @Author: Nicolay Leknes & Joakim Schjølberg
 * date created: 4/16/2018
 * last edited: 4/16/2018
 */

import java.util.ArrayList;
import java.util.Scanner;
public class Folkeregister {
    ArrayList<Menneske> Array;

    /**
     * Lager konstruktor med ny instanse av arraylist,
     */
    public Folkeregister() {
        this.Array = new ArrayList<>();
    }

    public void register(Menneske M) {
        Array.add(M);


    }

    /**
     * Lager en if der vi deler inn menneske i enten voksen eller barn
     **/

    public void listAllHumans() {
        for (Menneske menneske : Array) {
            if (menneske instanceof Kvinne || menneske instanceof Mann) {
                System.out.print(menneske.Navn + " med " + "personnr " + menneske.getPersnr() + " er voksen " + "fra " + menneske.getNasjonalitet());
                System.out.println();

            } else if (menneske instanceof Gutt || menneske instanceof Jente) {
                System.out.print(menneske.Navn + " med " + "personnr " + menneske.getPersnr() + " er et barn" + "fra " + menneske.getNasjonalitet());
                System.out.println();
                try {
                    listAllHumans();
                    {
                        //   listAllHumans();
                    }
                } catch (NullPointerException list) {
                    // list.printStackTrace();
                }
            }
        }
    }
}

