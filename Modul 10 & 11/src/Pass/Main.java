package Pass;

import java.util.Scanner;

public class Main {
Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Mann Mr = new Mann(1332,"Even","Svensk","Larsen",111112);
        Gutt G = new Gutt(666, "Knut", "Polen", "Lystad",2222);
        Jente J = new Jente(333, "Lisa", "Sverige", "Mongosen",24242424);
        Kvinne Ms = new Kvinne(777, "Beatrice", "Brasil", "Mordekaiser",242424);
        Folkeregister k = new Folkeregister();

        Mr.visNavn();
        k.register(G);
        k.register(Mr);
        k.register(Ms);
        k.register(J);
        k.listAllHumans();
        k.sjekkAlder();
        /**
         System.out.println();
         System.out.print(O.getNavn());
         System.out.println();
         System.out.print(O.getNasjonalitet());
         System.out.println();
         System.out.print(O.getPersnr());
         **/
    }
}



