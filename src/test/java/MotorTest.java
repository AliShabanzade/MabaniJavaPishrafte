import khodro.Khodro;
import khodro.Motor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class MotorTest {

    @Test
    void Motor_Bayad_Harkat_Konad_Vaghti_Roshan_Ast() {
        //Given
        Khodro motor = new Motor();

        //When
        motor.roshan();
        boolean ayaHarkatMikonad = motor.ayaDarHaleHarkatAst();



        //Then
        Assertions.assertTrue(ayaHarkatMikonad);
    }
}
