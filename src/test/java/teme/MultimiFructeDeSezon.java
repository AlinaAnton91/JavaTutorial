package teme;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultimiFructeDeSezon {

    @Test
    public void testMethod() {

        fructeSezon();

    }

    public void fructeSezon() {

        Map<String, List<String>> fructeSezon = new HashMap<>();

        List<String> fructeIarna = new ArrayList<>();
        fructeIarna.add("Portocala");
        fructeIarna.add("Clementine");
        fructeIarna.add("Pomelo");

        List<String> fructeVara = new ArrayList<>();
        fructeVara.add("Pepene");
        fructeVara.add("Nectarine");
        fructeVara.add("Piersici");

        List<String> fructeToamna = new ArrayList<>();
        fructeToamna.add("Prune");
        fructeToamna.add("Struguri");

        fructeSezon.put("Iarna", fructeIarna);
        fructeSezon.put("Vara", fructeVara);
        fructeSezon.put("Toamna", fructeToamna);

        for(String fructeKey: fructeSezon.keySet()) {
            System.out.println("Fructele care pot fi gasite in sezonul de '" +fructeKey+ "' sunt: " + fructeSezon.get(fructeKey));
        }

    }
}


