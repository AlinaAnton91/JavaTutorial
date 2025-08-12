package obiectConstructor2;

import java.util.List;

public class Sportiv {

    //OOP = Programare-orientata-obiect
    //Concepte: mostenire, incapsulare, polimorfism, abstractizare
    //Mostenire = conceptul prin care o clasa mosteneste o alta clasa
    //Cand are loc aceasta operatiune, intre cele doua clase se formeaza  relatia de parinte-copil
    //In Java, o clasa poate mosteni doar o singura clasa, 1:1
    //In momentul cand copilul mosteneste parintele, copilul trebuie sa apeleze constructorul din parinte (super)


    public String nume;
    public String prenume;
    public int varsta;
    public String adresa;


    public Sportiv(String nume, String prenume, int varsta, String adresa) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.adresa = adresa;
    }

    public void prezentareSportiv() {
        System.out.println("Numele sportivului este " + nume + " " + prenume);
        System.out.println("Varsta sportivului este " + varsta + " ani");
        System.out.println("Adresa sportivului este " + adresa);

    }




}
