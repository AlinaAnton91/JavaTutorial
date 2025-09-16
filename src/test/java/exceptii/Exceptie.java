package exceptii;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptie {

    @Test
    public void testMethod () throws FileNotFoundException {
        //printFileContent();
        //printArrayNumbers();
        checkStudentAge();
        //printFileContentV2();
    }

    //Incercam sa citim continutul dintr-un fisier
    //Checked & unchecked exceptions

    //Checked exception = will be marked when writing the code
    public void printFileContent() {
        File file = new File("path-ul catre fisier");
        try {
            System.out.println("A intrat pe try");
            FileInputStream content = new FileInputStream(file);
            System.out.println("Try 2");
        } catch (FileNotFoundException e) {
            System.out.println("A intrat pe catch");
        } finally {
            System.out.println("A intrat pe finally");
        }

    }

    //Unchecked exception = will throw an error after running the test
    public void printArrayNumbers() {
        int[] numere = new int[2];
        numere[0] = 5;
        numere[1] = 8;
        //numere[2] = 12;

        for (int index = 0; index<numere.length; index++){
            System.out.println("Numarul este " + numere[index]);
        }
    }

    public void checkStudentAge() {
        int varsta = 16;
        if (varsta < 18) {
            throw new RuntimeException("Nu servim tigari minorilor!");
        } else {
            System.out.println("Esti major, iti putem servi tigari!");
        }
    }

    public void printFileContentV2() throws FileNotFoundException {
        File file = new File("path-ul catre fisier");
        FileInputStream content = new FileInputStream(file);

    }
}
