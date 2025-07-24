package multimi;

import org.testng.annotations.Test;

import java.util.*;

public class Masini {

    @Test
    public void testMethod() {

        //masini();
        //masini2();
        masini3();
    }

    public void masini() {
        Map<String, String> masini = new HashMap<>();
        masini.put("Audi", "Q3");
        masini.put("Dacia", "Sandero");

        for(String masinaKey: masini.keySet()) {
            System.out.println("Brandul masinii este "+masinaKey);
            System.out.println("Modelul masinii este "+masini.get(masinaKey));
        }
    }

    public void masini2() {
        Map<String, List<String>> masini = new HashMap<>();

        List<String> modeleAudi = new ArrayList<>();
        modeleAudi.add("Q3");
        modeleAudi.add("A5");
        modeleAudi.add("Q7");

        List<String> modeleDacia = new ArrayList<>();
        modeleDacia.add("Sandero");
        modeleDacia.add("Logan");
        modeleDacia.add("Duster");

        masini.put("Audi", modeleAudi);
        masini.put("Dacia", modeleDacia);

        for(String masinaKey: masini.keySet()) {
            System.out.print("Brandul masinii este "+masinaKey);
            System.out.println(" iar modelele disponibile sunt "+masini.get(masinaKey));
        }
    }

    public void masini3() {
        Map<String, List<String>> masini = new HashMap<>();

        List<String> modeleAudi = Arrays.asList("Q3", "A5", "Q7");
        //modeleAudi.add("Q3");
        //modeleAudi.add("A5");
        //modeleAudi.add("Q7");

        List<String> modeleDacia = new ArrayList<>();
        modeleDacia.add("Sandero");
        modeleDacia.add("Logan");
        modeleDacia.add("Duster");

        masini.put("Audi", modeleAudi);
        masini.put("Dacia", modeleDacia);

        for(String masinaKey: masini.keySet()) {
            System.out.print("Brandul masinii este "+masinaKey);
            System.out.println(" iar modelele disponibile sunt "+masini.get(masinaKey));
        }
    }

}
