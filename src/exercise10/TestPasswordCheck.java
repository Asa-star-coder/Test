package exercise10;

import exercise9.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class TestPasswordCheck {

    @Test
    public void testSendingTextd() {

        //Arrange
        PasswordCheck pass = new PasswordCheck();
        boolean expected = true;

        //Act
        boolean actual = pass.check("password");

        //Assert
        assertEquals(expected, actual);



    }
}
