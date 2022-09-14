import khodro.Khodro;
import khodro.jadid.Mashin;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MashinTest {



    @Test
    void Mashin_Bayad_Harkat_Konad_Vaghti_Dar_Baste_Ast_Va_Mahshin_Roshan_Ast() {

        //Given
        Khodro Benz = new Mashin("Benz");
        Khodro volvo = new Mashin("Volvo");



        //When
        boolean ayaHarkatMikonad=Benz.ayaDarHaleHarkatAst();

        volvo.roshan();

        boolean ayaVolvoHarkatMikonad=volvo.ayaDarHaleHarkatAst();

        //Then
        Assertions.assertFalse(ayaHarkatMikonad);
        Assertions.assertTrue(ayaVolvoHarkatMikonad);





    }






}
