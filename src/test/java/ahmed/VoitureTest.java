package ahmed;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class VoitureTest {
    @Test
    void when_getmarque_should_return_same_marque_of_instanciate_car() {
        // Arrange
        Voiture voiture = new Voiture("Ferrari", 5000);

        // Act
        String expectedMarque = "Ferrari";
        String marque = voiture.getMarque();

        // Verify
        Assertions.assertEquals(marque, expectedMarque, "Doit être " + expectedMarque);
    }

    @Test
    void constructor_should_set_marque_and_prix() {
        // Arrange & Act
        Voiture voiture = new Voiture("Tesla", 60000);

        // Verify
        Assertions.assertEquals("Tesla", voiture.getMarque(), "La marque doit être Tesla");
        Assertions.assertEquals(60000, voiture.getPrix(), "Le prix doit être 60000");
    }

    @Test
    void setMarque_should_change_marque() {
        // Arrange
        Voiture voiture = new Voiture();
        voiture.setMarque("Toyota");

        // Act
        String marque = voiture.getMarque();

        // Verify
        Assertions.assertEquals("Toyota", marque, "La marque doit être Toyota");
    }

    @Test
    void setPrix_should_change_prix() {
        // Arrange
        Voiture voiture = new Voiture();
        voiture.setPrix(30000);

        // Act
        double prix = voiture.getPrix();

        // Verify
        Assertions.assertEquals(30000, prix, "Le prix doit être 30000");
    }

    @Test
    void toString_should_return_correct_format() {
        // Arrange
        Voiture voiture = new Voiture("Honda", 20000);

        // Act
        String expectedString = "\"Car\":{\"marque\":\"Honda\",\"prix\":20000.0}";
        String resultString = voiture.toString();

        // Verify
        Assertions.assertEquals(expectedString, resultString, "La représentation sous forme de chaîne doit être correcte");
    }
}
