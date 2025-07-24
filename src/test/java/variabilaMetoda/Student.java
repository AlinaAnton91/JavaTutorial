package variabilaMetoda;

import org.testng.annotations.Test;

public class Student {

    //Recunoastem o clasa intr-un fisier java dupa cuvantul 'class'
    //Continutul clasei se va gasi intre cele doua acolade
    //Intr-un fisier java putem avea mai multe clase diferentiate prin numele acestora
    //Desi se poate, nu este un practice bun sa avem mai mult de o clasa intr-un fisier java
    //Clasa = sablon specific unei entitati
    //O clasa poate sa contina una sau mai multe proprieti dar si una sau mai multe metode
    //Proprietate = atributul unei clase
    //Exista doua tipuri de proprietati: variabila globala si locala
    //Variabila globala = proprietate care este vizibila peste tot in clasa noastra
    //Variabila globala = public tipvariabila numevariabila;
    //O variabila globala/locala poate sau nu sa contina o valoare
    //Variabila locala = proprietate care este vizibila doar in metoda definita
    //Variabila locala = tipvariabila numevariabila;
    //Metoda = actiunea unei clase
    //Exista doua tipuri de metode: void si return
    //Metoda void = metoda care afiseaza rezultatul actiunilor
    //Metoda return = metoda care returneaza rezultatul actiunilor
    //Metoda void = public void numemetoda() {}


    public String nume;
    public String prenume;
    public int varsta;
    public double inaltime;
    public float greutate;
    public char sex;
    public boolean areSesiune;

    @Test
    public void prezentareStudent() {
        nume = "Anton";
        prenume = "Alina";
        varsta = 34;
        inaltime = 1.75;
        greutate = 62.0f;
        sex = 'F';
        areSesiune = true;

        System.out.println("Numele studentului este: "+nume);
        System.out.println("Prenumele studentului este: "+prenume);
        System.out.println("Varsta studentului este: "+varsta);



    }


}
