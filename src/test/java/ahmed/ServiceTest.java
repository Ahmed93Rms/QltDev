package ahmed;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ServiceTest {

    @Test
    public void testAjouterEtPrix() {
        Statistique statistique = new Service();
        Voiture voiture1 = new Voiture("Toyota", 10000);
        Voiture voiture2 = new Voiture("Honda", 15000);
        Voiture voiture3 = new Voiture("BMW", 30000);
        Voiture voiture4 = new Voiture("Audi", 25000);
        Voiture voiture5 = new Voiture("Mercedes", 40000);

        statistique.ajouter(voiture1);
        statistique.ajouter(voiture2);
        statistique.ajouter(voiture3);
        statistique.ajouter(voiture4);
        statistique.ajouter(voiture5);

        // Prix sans remise : 10000 + 15000 + 30000 + 25000 + 40000 = 120000
        // Remise : 0%, 5%, 10%, 15%, 20%
        int prixAttendu = 10000 + (15000 - 750) + (30000 - 3000) + (25000 - 3750) + (40000 - 8000);
        assertEquals(prixAttendu, statistique.prix());
    }

    @Test
    public void testPrixSansVoitures() {
        Statistique statistique = new Service();
        assertThrows(ArithmeticException.class, statistique::prix);
    }
}