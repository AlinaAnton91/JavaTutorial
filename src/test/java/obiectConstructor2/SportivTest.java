package obiectConstructor2;

import org.testng.annotations.Test;

import java.util.Arrays;

public class SportivTest {

    @Test
    public void testMethod() {
        Fotbalist fotbalist = new Fotbalist("Fotbalist", "Fotbalist", 32, "Bucuresti", "Dinamo", "atacant");
        fotbalist.prezentareFotbalist();
        System.out.println();

        Gimnast gimnast = new Gimnast("Gimnast", "Gimnast", 24, "Iasi", "Locul II", Arrays.asList("Locul I", "Locul II"));
        gimnast.prezentareGimnast();
        System.out.println();

        Tenisman tenisman = new Tenisman("Tenisman", "Tenisman", 28, "Cluj", "Steaua");
        tenisman.prezentareTenisman();




    }
}
