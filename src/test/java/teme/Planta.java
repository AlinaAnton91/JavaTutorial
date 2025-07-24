package teme;

import org.testng.annotations.Test;

public class Planta {

    //Definim variabilele globale
    public String nume;
    public String culoare;
    public double inaltime;
    public boolean necesitaSoare;


    //Adaugam o metoda void pentru a afisa rezultatele
    @Test
    public void prezentarePlanta() {
        nume = "Ficus Ginseng";
        culoare = "Verde";
        inaltime = 45;
        necesitaSoare = true;

        System.out.println ("Numele plantei este: "+nume);
        System.out.println ("Culoarea plantei este: "+culoare);
        System.out.println ("Planta are o inaltime de "+inaltime);
        System.out.println("Planta necesita expunere la soare: "+necesitaSoare);
    }
}
