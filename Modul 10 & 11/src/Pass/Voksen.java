package Pass;


public class Voksen extends Menneske {
    public Voksen(Integer Persnr, String Navn, String Nasjonalitet, String Etternavn) {
        super(Persnr, Navn, Nasjonalitet, Etternavn);

    }

    @Override
    public void visNavn() {
        System.out.println(Navn + " " + Etternavn);
        
    }
}
