package nl.novi.javaprogrammeren;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class WizardTest {

    @Test
    void myFirstUnitTest() {
        //Arrange
        Wizard wizard = new Wizard();
        //Act
        wizard.setName("Harry");
        //Assert
        assertEquals("Harry", wizard.getName());
    }
}
