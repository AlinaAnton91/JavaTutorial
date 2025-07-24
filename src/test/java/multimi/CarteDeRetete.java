package multimi;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarteDeRetete {

    @Test
    public void testMethod() {

        carteDeRetete();

    }

    public void carteDeRetete() {
        Map<String, List<String>> retete = new HashMap<>();

        List<String> ingredienteCiorbaDeFasole = new ArrayList<>();
        ingredienteCiorbaDeFasole.add("Fasole");
        ingredienteCiorbaDeFasole.add("Apa");
        ingredienteCiorbaDeFasole.add("Legume");

        List<String> ingredienteGratarDePui = new ArrayList<>();
        ingredienteGratarDePui.add("Pui");
        ingredienteGratarDePui.add("Gratar");
        ingredienteGratarDePui.add("Condimente");

        List<String> ingredienteAlbaCaZapada = new ArrayList<>();
        ingredienteAlbaCaZapada.add("Lapte");
        ingredienteAlbaCaZapada.add("Oua");
        ingredienteAlbaCaZapada.add("Faina");
        ingredienteAlbaCaZapada.add("Zeama de lamaie");
        ingredienteAlbaCaZapada.add("Zahar");

        retete.put("Ciorba de fasole", ingredienteCiorbaDeFasole);
        retete.put("Piept de pui la gratar", ingredienteGratarDePui);
        retete.put("Alba ca Zapada", ingredienteAlbaCaZapada);

        for(String retetaKey: retete.keySet()) {
            System.out.println("Reteta pe care o gatim astazi este '" +retetaKey+ "' iar ingredientele necesare sunt: " +retete.get(retetaKey));
        }

    }
}
