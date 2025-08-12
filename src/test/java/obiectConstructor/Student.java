package obiectConstructor;

import java.sql.SQLOutput;
import java.util.List;

public class Student {

    //programarea moderna se bazeaza pe cele doua concepte: constructor si obiect
    //constructor = are ca rol sa initializeze variabilele unei clase
    //exista mai multe tipuri de constructori: cu parametri si fara parametri
    //un constructor se recunoaste dupa numele clasei
    //un constructor poate sa fie public sau private
    //public Student() {}
    //intr-o clasa putem avea mai multi constructori diferentiati prin numarul sau tipul de parametri
    //obiect = reprezinta instanta unei clase
    //dintr-o clasa putem face mai multe obiecte
    //in momentul cand se instantiaza un obiect, se apeleaza constructorul din clasa
    //un obiect se instantiaza folosing cuvantul 'new'

    public int id;
    public String nume;
    public String prenume;
    public String scoala;
    public String clasa;
    public List<Double> note;
    public String data;


    public Student(int id, String nume, String prenume, String scoala, String clasa, List<Double> note, String data) {
        this.id = id;
        this.nume = nume;
        this.prenume = prenume;
        this.scoala = scoala;
        this.clasa = clasa;
        this.note = note;
        this.data = data;
    }

    public void prezentareStudent() {
        System.out.println("Numele studentului este " + nume);
        System.out.println("Prenumele studentului este " + prenume);
        System.out.println("Scoala unde merge studentul este " + scoala);
        System.out.println("Clasa in care invata studentul este " + clasa);
        System.out.println("Notele pe care le are studentul sunt " + note);
    }

    public void eligibilPentruBursa() {
        if (data.contains("2023")){
            System.out.println("Este eligibil pentru bursa");
        } else
            System.out.println("Nu este eligibil pentru bursa");
    }
    public void calculMedie() {
        double suma = 0;
        for (int index=0; index < note.size(); index++) {
            suma = suma + note.get(index);
        }
        double medie = suma/ note.size();

        System.out.println("Studentul " + nume + " " + prenume + " are " + note.size() + " note");
        System.out.println("Pe baza numarului de note, studentul " + nume + " " + prenume + " are media " + medie);

    }
}
