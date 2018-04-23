package Pass;

public class Main {

    public static void main(String[] args) {
        Mann Mr = new Mann(999, "Ola", "Norge", "Norwegen");
        Gutt G = new Gutt(666, "Knut", "Polen", "Lystad");
        Jente J = new Jente(333,"Lisa","Sverige", "Mongosen");
        Kvinne Ms = new Kvinne(777,"Beatrice","Brasil", "Mordekaiser");
        Folkeregister k = new Folkeregister();
        k.register(G);
        k.register(Mr);
        k.register(Ms);
        k.register(J);
        k.listAllHumans();

        Voksen v = new Voksen(999,"Ola","Norge","Nordmann");
        v.visNavn();
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


