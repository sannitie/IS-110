package Pass;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class Voksen extends Menneske {

    Folkeregister folk = new Folkeregister();


    public Voksen(Integer Persnr, String Navn, String Nasjonalitet, String Etternavn,Integer Fødenr) {
        super(Persnr, Navn, Nasjonalitet,Etternavn,Fødenr);
        folk.Array = new ArrayList<Menneske>();
    }
Scanner scan = new Scanner(System.in);

    @Override
    public void visNavn() {
        System.out.println(Navn + " " + Etternavn);
        
    }
}
