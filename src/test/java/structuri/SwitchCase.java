package structuri;

import org.testng.annotations.Test;

public class SwitchCase {

    //switch case este o structura alternative care se focuseaza pe evaluarea unei valori fata de conditie(if)
    //este o structura foarte des folosita in situatiile in care cazurile sunt destul de bine definite
    //sintaxa este mult mai friendly fata de if

    @Test
    public void testMethod() {
        zileSaptamana(9);
    }

    //afisam o zi a saptamanii
    //2=>azi este marti

    public void zileSaptamana(int ziSaptamana) {
        switch (ziSaptamana) {
            case 1:
                System.out.println("Azi este luni.");
                break;
            case 2:
                System.out.println("Azi este marti.");
                break;
            case 3:
                System.out.println("Azi este miercuri.");
                break;
            case 4:
                System.out.println("Azi este joi.");
                break;
            case 5:
                System.out.println("Azi este vineri.");
                break;
            case 6:
                System.out.println("Azi este sambata.");
                break;
            case 7:
                System.out.println("Azi este duminica.");
                break;
            default:
                System.out.println("Zi invalida");
        }
    }

    public void zileSaptamana2(int ziSaptamana) {
        if (ziSaptamana == 1)
            System.out.println("Azi este luni.");
    }
}
