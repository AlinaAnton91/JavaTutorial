package obiectConstructor2;

import java.util.List;

public class Sportiv {

    //OOP = Programare-orientata-obiect
    //Concepte: mostenire, incapsulare, polimorfism, abstractizare
    //Mostenire = conceptul prin care o clasa mosteneste o alta clasa
    //Cand are loc aceasta operatiune, intre cele doua clase se formeaza  relatia de parinte-copil
    //In Java, o clasa poate mosteni doar o singura clasa, 1:1
    //In momentul cand copilul mosteneste parintele, copilul trebuie sa apeleze constructorul din parinte (super)
    //Incapsulare = conceptul prin care putem defini comportamentul variabilelor in viata reala
    //Private = access control care atunci cand este folosit incapsuleaza valoarea variabilei in interiorul clasei
    //Ca sa expui o variabila private ai nevoie de conceptul get/set
    //Get/set are ca rol sa expuna/modifice valoarea unei variabile



    private String nume;
    private String prenume;
    private int varsta;
    private String adresa;
    private int salariu;


    public Sportiv(String nume, String prenume, int varsta, String adresa, int salariu) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.adresa = adresa;
        this.salariu = salariu;
    }

    public void prezentareSportiv() {
        System.out.println("Numele sportivului este " + nume + " " + prenume);
        System.out.println("Varsta sportivului este " + varsta + " ani");
        System.out.println("Adresa sportivului este " + adresa);
        System.out.println("Salariul sportivului este " + salariu);

    }

    public String getNume() {
        return nume;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }
    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getVarsta() {
        return varsta;
    }
    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getAdresa() {
        return adresa;
    }
    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public int getSalariu() {
        return salariu;
    }
}
