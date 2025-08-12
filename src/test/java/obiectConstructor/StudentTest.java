package obiectConstructor;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class StudentTest {

    @Test
    public void testMethod() {
        Student alex = new Student(1, "Dorha", "Alex", "UBB", "Mate-Info", Arrays.asList(10.0, 7.0, 8.0, 7.0), "05.05.2025");
        alex.prezentareStudent();
        alex.calculMedie();

        System.out.println();

        Student alina = new Student(2, "Anton", "Alina", "UBB", "Informatica", Arrays.asList(9.0, 10.0, 9.0, 10.0), "01.03.2024");
        alina.prezentareStudent();
        alina.calculMedie();

        System.out.println();

        Student lavinia = new Student(3, "Bodriug", "Lavinia", "UBB", "Informatica-Germana", Arrays.asList(10.0, 10.0, 9.0, 10.0, 9.0), "02.04.2023");
        lavinia.prezentareStudent();
        lavinia.calculMedie();
        lavinia.nume = "Dorha";
        lavinia.clasa = "BA";
        lavinia.prezentareStudent();
        lavinia.eligibilPentruBursa();

        System.out.println("=================================================");

        System.out.println("Prezentarea studentilor din generatia 2025 este urmatoarea: ");
        List<Student> generatia2025 = Arrays.asList(alex, alina, lavinia);
        for (int index = 0; index<generatia2025.size(); index++){
            System.out.println("--Prezentam studentul cu numele si prenumele " + generatia2025.get(index).nume + " " + generatia2025.get(index).prenume);
            generatia2025.get(index).prezentareStudent();

        }


    }
}
