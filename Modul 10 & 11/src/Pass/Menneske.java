package Pass;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public abstract class Menneske {
    Integer Persnr;
    String Navn;
    String Etternavn;
    String Nasjonalitet;
    Integer Fødenr;
    public Menneske(Integer persnr, String Navn, String Nasjonalitet, String Etternavn, Integer fødenr) {
        this.Persnr = persnr;
        this.Navn = Navn;
        this.Nasjonalitet = Nasjonalitet;
        this.Etternavn = Etternavn;
        this.Fødenr = Fødenr;
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

    public Integer getFødenr(){
        return Fødenr;
    }
    public void visNavn() {
        System.out.println(Navn);
    }
}