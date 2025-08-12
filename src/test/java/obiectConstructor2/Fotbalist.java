package obiectConstructor2;

public class Fotbalist extends Sportiv {
    public String echipa;
    public String pozitieSportiv;

    public Fotbalist(String nume, String prenume, int varsta, String adresa, String echipa, String pozitieSportiv) {
        super(nume, prenume, varsta, adresa);
        this.echipa = echipa;
        this.pozitieSportiv = pozitieSportiv;
    }

    public void prezentareFotbalist() {
        prezentareSportiv();
        System.out.println("Echipa din care face parte fotbalistul este " + echipa);
        System.out.println("Pozitia pe care joaca fotbalistul este " + pozitieSportiv);
    }
}
