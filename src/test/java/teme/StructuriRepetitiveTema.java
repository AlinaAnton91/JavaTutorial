package teme;

import org.testng.annotations.Test;

public class StructuriRepetitiveTema {

    @Test
    public void ruleazaTeste() {
        metodaWhile(1);
        metodaDoWhile(0);
        metodaFor();

    }

    public void metodaWhile(int i) {
        System.out.println("Metoda While");
        while (i <= 5) {
            System.out.println("Pasul " + i);
            i++;
        }
        System.out.println();
    }

    public void metodaDoWhile(int i) {
        System.out.println("Metoda Do-While");
        do {
            System.out.println("Execut o dată, chiar dacă condiția e falsă.");
            i++;
        } while (i <= 1);
        System.out.println();
    }

    public void metodaFor() {
        System.out.println("Metoda For");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Salut! Sunt la pasul " + i);
        }
    }

}
