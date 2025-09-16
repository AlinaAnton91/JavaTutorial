package obiectConstructor2;

public class Fotbalist extends Sportiv {
    private String echipa;
    private String pozitieSportiv;

    public Fotbalist(String nume, String prenume, int varsta, String adresa, int salariu, String echipa, String pozitieSportiv) {
        super(nume, prenume, varsta, adresa, salariu);
        this.echipa = echipa;
        this.pozitieSportiv = pozitieSportiv;
    }

    public void prezentareFotbalist() {
        prezentareSportiv();
        System.out.println("Echipa din care face parte fotbalistul este " + echipa);
        System.out.println("Pozitia pe care joaca fotbalistul este " + pozitieSportiv);
    }

    public String getEchipa() {
        return echipa;
    }
    public void setEchipa(String echipa) {
        this.echipa = echipa;
    }

    public String getPozitieSportiv() {
        return pozitieSportiv;
    }
    public void setPozitieSportiv(String pozitieSportiv) {
        this.pozitieSportiv = pozitieSportiv;
    }
}
