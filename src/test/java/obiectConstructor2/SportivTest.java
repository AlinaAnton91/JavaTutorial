package obiectConstructor2;

import org.testng.annotations.Test;

import java.util.Arrays;

public class SportivTest {

    @Test
    public void testMethod() {
        Fotbalist fotbalist = new Fotbalist("Fotbalist", "Fotbalist", 32, "Bucuresti", 1500, "Dinamo", "atacant");
        fotbalist.prezentareFotbalist();
        fotbalist.setNume("Nu are nume");
        fotbalist.setPrenume("Are un nou prenume");
        fotbalist.setVarsta(33);
        fotbalist.prezentareFotbalist();
        System.out.println();
        System.out.println(fotbalist.getSalariu());

//        Gimnast gimnast = new Gimnast("Gimnast", "Gimnast", 24, "Iasi", 5000, "Locul II", Arrays.asList("Locul I", "Locul II"));
//        gimnast.prezentareGimnast();
//        System.out.println();
//
//        Tenisman tenisman = new Tenisman("Tenisman", "Tenisman", 28, "Cluj", 2500, "Steaua");
//        tenisman.prezentareTenisman();




    }
}
