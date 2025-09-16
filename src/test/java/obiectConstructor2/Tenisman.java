package obiectConstructor2;

public class Tenisman extends Sportiv {
    private String club;

    public Tenisman(String nume, String prenume, int varsta, String adresa, int salariu, String club) {
        super(nume, prenume, varsta, adresa, salariu);
        this.club = club;
    }

    public void prezentareTenisman() {
        prezentareSportiv();
        System.out.println("Clubul din care face parte tenismanul este " + club);
    }

    public String getClub() {
        return club;
    }
    public void setClub(String club) {
        this.club = club;
    }
}
