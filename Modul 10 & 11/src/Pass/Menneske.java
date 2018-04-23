package Pass;

import java.io.IOException;
import java.util.ArrayList;
public abstract class Menneske {
    Integer Persnr;
    String Navn;
    String Etternavn;
    String Nasjonalitet;

    public Menneske(Integer persnr, String Navn, String Nasjonalitet, String Etternavn) {
        this.Persnr = persnr;
        this.Navn = Navn;
        this.Nasjonalitet = Nasjonalitet;
        this.Etternavn = Etternavn;
    }

    public String getNavn() {
        return Navn;
    }

    public Integer getPersnr() {
        return Persnr;
    }

    public String getNasjonalitet() {
        return Nasjonalitet;
    }

    public void visNavn() {
        System.out.println(Navn);
    }
}