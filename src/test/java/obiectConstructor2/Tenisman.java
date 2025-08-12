package obiectConstructor2;

public class Tenisman extends Sportiv {
    public String club;

    public Tenisman(String nume, String prenume, int varsta, String adresa, String club) {
        super(nume, prenume, varsta, adresa);
        this.club = club;
    }

    public void prezentareTenisman() {
        prezentareSportiv();
        System.out.println("Clubul din care face parte tenismanul este " + club);
    }
}
