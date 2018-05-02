package Pass; /**
 * @Author: Nicolay Leknes & Joakim Schjølberg
 * date created: 4/16/2018
 * last edited: 4/16/2018
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
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
            //   Scanner scan = new Scanner(System.in);
            // String oo = scan.nextLine();

            if (menneske instanceof Kvinne || menneske instanceof Mann) {
                System.out.print(menneske.Navn + " med " + "personnr " + menneske.getPersnr() + " er voksen " + "fra " + menneske.getNasjonalitet());
                System.out.println();

            } else if (menneske instanceof Gutt || menneske instanceof Jente) {
                System.out.print(menneske.Navn + " med " + "personnr " + menneske.getPersnr() + " er et barn" + "fra " + menneske.getNasjonalitet());
                System.out.println();
            }
        }
    }
  /**  public void sjekkalder() {
        Array.get(0).getFødenr();
        Date date = new Date();
        if (Array.get()
        System.out.println(date);
**/
        public void sjekkAlder() {

// Denne datoen blir oprettet som den samme datoen hver gang(kanskje datoen og klokkeslett objektet blir oprettet?)
// som betyr at den sikkert aldri blir lik fødenummeret.
            Date date = new Date();

            if (Array.get(0).equals(date)) {
                System.out.println(date);
            }
        }
    public void sjekkAlder2() {

        Date date = new Date();
/**
        if (myArrayList.get(0).equals(date)) {
            System.out.println(date);
 **/
        }
    }
