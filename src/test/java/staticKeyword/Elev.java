package staticKeyword;

public class Elev {
    public String nume;
    public String prenume;
    public String clasa;
    public static String scoala = "Emil Botta";

    public Elev(String nume, String prenume, String clasa) {
        this.nume = nume;
        this.prenume = prenume;
        this.clasa = clasa;

    }

    public void infoElev() {
        System.out.println("Numele elevului este: " + nume);
        System.out.println("Prenumele elevului este: " + prenume);
        System.out.println("Clasa din care face parte elevul este: " + clasa);
        System.out.println("Scoala din care face parte elevul este: " + scoala);
    }
}
