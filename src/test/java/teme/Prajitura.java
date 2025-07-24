package teme;

import org.testng.annotations.Test;


public class Prajitura {
    public String numePrajitura;
    public String gustPrajitura;
    public String ingredientePrajitura;
    public String vendorPrajitura;
    public double pretPrajitura;

    public void sablonPrajitura(String param1, String param2, String param3,
                                String param4, double param5) {
        numePrajitura=param1;
        gustPrajitura=param2;
        ingredientePrajitura=param3;
        vendorPrajitura=param4;
        pretPrajitura=param5;

        System.out.println("Nume prajitura: "+numePrajitura);
        System.out.println("Gustul prajiturii este: "+gustPrajitura);
        System.out.println("Prajitura contine urmatoarele ingrediente: "+ingredientePrajitura);
        System.out.println("Prajitura este vanduta de: "+vendorPrajitura);
        System.out.println("Pretul prajiturii: "+pretPrajitura);
    }

    @Test
    public void listaPrajituri() {
        sablonPrajitura("Amandina","Foarte dulce","Ciocolata neagra, blat de cacao, crema de unt cu ciocolata", "Palibo",15.0);
        System.out.println();

        sablonPrajitura("Savarina","Dulce","Frisca, blat cu vanilie, sirop vanilie","Blanca",11.0);
        System.out.println();

        sablonPrajitura("Profiterol","Foarte dulce","Ciocolata, blat de vanilie, choux, crema de vanilie, inghetata","Luv Bakery",16.0);
        System.out.println();

        sablonPrajitura("Ecler","Dulce","Vanilie, frisca, ciocolata, caramel, choux de vanilie","Cake Expert",11.5);
        System.out.println();
    }
}
