package variabilaMetoda;

import org.testng.annotations.Test;

public class Fruct {
    public String nume;
    public String culoare;
    public String gust;
    public double greutate;
    public boolean esteExotic;
    public double pret;

    @Test
    public void metodaTest() {
        prezentareFruct("Mar","Rosu","Acrisor",0.5,false,6.0);
        //calculPretVariabilaLocala();
        calculPretDiscount(10);
        System.out.println();

        prezentareFruct("Para","Galbena","Dulce",0.7,false,8.0);
        calculPretDiscount(20);
        System.out.println();

        prezentareFruct("Capsuna","Rosu","Dulce",0.1,true,15.0);
        calculPretDiscount(5);
    }

    public void prezentareFruct(String param1,String param2,
                                String param3,double param4,
                                boolean param5, double param6) {
        nume=param1;
        culoare=param2;
        gust=param3;
        greutate=param4;
        esteExotic=param5;
        pret=param6;

        System.out.println("Numele fructului este: "+nume);
        System.out.println("Culoarea este: "+culoare);
        System.out.println("Gustul fructului este: "+gust);
        System.out.println("Greutatea fructului este: "+greutate);
        System.out.println("Fructul este exotic?: "+esteExotic);
        System.out.println("Pretul este: "+pret);
    }

    public void calculPretVariabilaLocala() {
        double pret=8.5;
        System.out.println("Pretul standard este: "+pret);
    }

    public void calculPretDiscount(int procent) {
        double pretFinal=pret-((pret*procent)/100);
        System.out.println("Pretul standard este: "+pret+", insa, cu o reducere de "+procent+"% pretul final este de "+pretFinal);
    }
}
