package staticKeyword;

import org.testng.annotations.Test;

public class StaticTest {

    @Test
    public void testMethod() {
        Elev Alina = new Elev("Anton", "Alina", "12A");
        Elev Alex = new Elev("Dorha", "Alex", "10B");

        Alina.infoElev();
        Alex.infoElev();
    }
}
