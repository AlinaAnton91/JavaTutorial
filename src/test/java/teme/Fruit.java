package teme;

import org.testng.annotations.Test;

public class Fruit {

    public String nume;
    public String culoare;
    public String gust;
    public double greutate;
    public boolean esteExotic;

    @Test
    public void prezentareFruct() {
        nume = "Kiwi";
        culoare = "Maro";
        gust = "Dulce-acrisor";
        greutate = 0.2;
        esteExotic = true;


        System.out.println("Numele fructului este: "+nume);
        System.out.println("Fructul are culoarea: "+culoare);
        System.out.println("Gustul fructului este: "+gust);
        System.out.println("Fructul este unul exotic: "+esteExotic);
    }

    @Test
    public void prezentareFructe() {
        nume = "Mango";
        culoare = "Verde";
        gust = "Dulce";
        greutate = 0.4;
        esteExotic = true;

        System.out.println("Numele fructului este: "+nume);
        System.out.println("Fructul are culoarea: "+culoare);
        System.out.println("Gustul fructului este: "+gust);
        System.out.println("Fructul este unul exotic: "+esteExotic);
    }
}
