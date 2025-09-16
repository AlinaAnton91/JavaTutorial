package obiectConstructor2;

import java.util.List;

public class Gimnast extends Sportiv {
    private String clasament;
    private List<String> trofee;

    public Gimnast(String nume, String prenume, int varsta, String adresa, int salariu, String clasament, List<String> trofee) {
        super(nume, prenume, varsta, adresa, salariu);
        this.clasament = clasament;
        this.trofee = trofee;
    }

    public void prezentareGimnast() {
        prezentareSportiv();
        System.out.println("Clasamentul pe care se afla gimnastul este " + clasament);
        System.out.println("Trofeele castigate de gimnast sunt " + trofee);
    }

    public String getClasament() {
        return clasament;
    }
    public void setClasament(String clasament) {
        this.clasament = clasament;
    }

    public List<String> getTrofee() {
        return trofee;
    }
    public void setTrofee(List<String> trofee) {
        this.trofee = trofee;
    }
}
