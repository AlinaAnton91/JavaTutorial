package multimi;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Multimi {

    //multime = colectie de valori de acelasi tip
    //multimi = array, list, set, map (foreach)

    @Test
    public void testMethod() {
        //afisareColegi();
        //afisareColegi2();
        //afisareColegi3();
        afisareMasini();
    }

    //Array
    public void afisareColegi() {
        String[] colegi = new String[5];
        colegi[0] = "Radu";
        colegi[1] = "Cosmin";
        colegi[2] = "Andreea";
        colegi[3] = "Octav";
        colegi[4] = "Alexandra";
        for (int index = 0; index < colegi.length; index++) {
            System.out.println("Numele colegului meu este: "+ colegi[index]);
        }
    }

    //List
    public void afisareColegi2() {
        List<String> colegi = new ArrayList<>();
        colegi.add("Radu");
        colegi.add("Cosmin");
        colegi.add("Andreea");
        colegi.add("Octav");
        colegi.add("Alexandra");
        for (int index = 0; index < colegi.size(); index++) {
            System.out.println("Numele colegului meu este: "+ colegi.get(index));
        }
    }

    //Map
    public void afisareColegi3() {
        Map<String, String> colegi = new HashMap<>();
        colegi.put("5A", "Radu");
        colegi.put("5B", "Cosmin");
        colegi.put("7C", "Andreea");
        colegi.put("6B", "Alex");
        for (String key: colegi.keySet()){
            System.out.println("Clasa in care se afla colegul meu este: "+key);
            System.out.println("Numele colegului este: "+colegi.get(key));
        }
    }

    //Map
    public void afisareMasini() {
        Map<String, String> masini = new HashMap<>();
        masini.put("Audi", "Q4");
        masini.put("Opel", "Corsa");
        masini.put("Dacia", "Sandero");
        for (String key: masini.keySet()){
            System.out.println("Marca masinii este: "+key);
            System.out.println("Modelul masinii este: "+masini.get(key));
        }
    }
}
