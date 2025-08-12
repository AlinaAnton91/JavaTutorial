package obiectConstructor2;

import java.util.List;

public class Gimnast extends Sportiv {
    public String clasament;
    public List<String> trofee;

    public Gimnast(String nume, String prenume, int varsta, String adresa, String clasament, List<String> trofee) {
        super(nume, prenume, varsta, adresa);
        this.clasament = clasament;
        this.trofee = trofee;
    }

    public void prezentareGimnast() {
        prezentareSportiv();
        System.out.println("Clasamentul pe care se afla gimnastul este " + clasament);
        System.out.println("Trofeele castigate de gimnast sunt " + trofee);
    }
}
