package structuri;

import org.testng.annotations.Test;

public class StructuriRepetitive {

    //structuri repetitive: for, while, foreach

    @Test
    public void testMethod() {
        //afisareNumereFor(30);
        //afisareNumereWhile();
        //afisareNumereDescrescator();
        //afisareNumerePare(10);
        //afisareNumereImpare(20);
        //afisareNumerePareImpare(10);
        numereDivizibile5(20);
    }

    //afiseaza toate numerele de la 1 la 20
    public void afisareNumereFor(int rangeMaxim) {
        for (int index=1; index<=rangeMaxim; index++){
            System.out.println("Numarul este: "+index);
        }
    }

    public void afisareNumereWhile() {
        int index = 1;
        while (index<=20) {
            System.out.println("Numarul afisat este: "+index);
            index++;
        }
    }

    public void afisareNumereDescrescator() {
        for (int index = 30; index >=1; index--){
            System.out.println(index);
        }
    }

    //afisam toate numerele pare pana la x valoare
    public void afisareNumerePare(int capatInterval) {
        int startInterval = 0;
        while (startInterval < capatInterval + 1) {
            if (startInterval%2==0) {
                System.out.println("Numarul " + startInterval + " este par.");
            }
            startInterval++;
        }

    }

    //afisam toate numerele impare pana la x valoare
    public void afisareNumereImpare(int capatInterval) {
        int startInterval = 0;
        while (startInterval < capatInterval + 1) {
            if (startInterval%2==1) {
                System.out.println("Numarul " + startInterval + " este impar.");
            }
            startInterval++;
        }

    }

    //afisam numere pare si impare alternativ
    public void afisareNumerePareImpare(int capatInterval) {
        int startInterval = 0;
        while (startInterval < capatInterval +1) {
            if (startInterval%2==0) {
                System.out.println("Numarul "+ startInterval +" este par.");
            } else
                System.out.println("Numarul "+ startInterval +" este impar.");
            startInterval ++;
        }
    }

    //afisam toate numerele care sunt divizibile cu 5 pana la x valoare
    public void numereDivizibile5 (int capatInterval) {
        for (int startInterval = 0; startInterval<=capatInterval; startInterval++){
            if (startInterval%5==0)
                System.out.println("Numarul "+ startInterval +" este divizibil cu 5.");
        }
    }
}
