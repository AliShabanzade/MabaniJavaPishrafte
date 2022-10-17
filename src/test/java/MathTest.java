import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathTest {

    @Test
    void Bayad_Amaliyate_Riyazi_Anjam_Dehad() {
        double moteghayer = 1.5;



        double meghdareMotlagh = Math.abs(moteghayer);


        assertEquals(1.5 , meghdareMotlagh); // static import shode
        assertEquals(1 , Math.cos(0));  // static import shode

    }
}
