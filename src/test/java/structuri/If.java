package structuri;

import org.testng.annotations.Test;

public class If {

    @Test
    public void ruleazaTeste() {
        verificaUmbrela(true);
        verificaOra(22);
        verificaTemperatura(5);
        verificaAcces(19, true);
        verificaStareSpirit(false, true);
        verificNumarPar(3);
    }

    public void verificaUmbrela(boolean ploua) {
        if (ploua) {
            System.out.println("Ia umbrela!");
        }
    }

    public void verificaOra(int ora) {
        if (ora >= 21) {
            System.out.println("E târziu! Mergi la culcare.");
        } else {
            System.out.println("Mai poți sta puțin.");
        }
    }

    public void verificaTemperatura(int temperatura) {
        if (temperatura < 10) {
            System.out.println("E frig! Poartă o geacă.");
        }
    }

    public void verificaAcces(int varsta, boolean areBuletin) {
        if (varsta >= 18 && areBuletin) {
            System.out.println("Poți intra în club.");
        } else {
            System.out.println("Acces interzis.");
        }
    }

    public void verificaStareSpirit(boolean obosit, boolean ziProasta) {
        if (obosit || ziProasta) {
            System.out.println("Ia o pauză. Ai nevoie de odihnă.");
        } else {
            System.out.println("Ești ok, poți continua.");
        }
    }

    public void verificNumarPar(int numar) {
        //Cat impartire = /
        //Rest impartire = %

        if (numar%2==0) {
            System.out.println("Numarul "+numar+" este par.");
        } else {
            System.out.println("Numarul "+numar+" este impar.");
        }
    }


}
