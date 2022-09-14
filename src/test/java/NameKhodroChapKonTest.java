import khodro.Khodro;
import khodro.jadid.Mashin;
import khodro.Motor;
import khodro.NameKhodroChapKon;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NameKhodroChapKonTest {

    @Test
    void Bayad_Name_Khodro_Ra_Chap_Konad() {
        // Given
        Khodro benz = new Mashin("Benz" , 120 , "Automatic");
        Khodro volvo = new Mashin("Volvo" , 80 , "Dasti");
        Khodro motor = new Motor();
        Khodro kashti = new Kashti();
        Khodro[] khodroha={benz , volvo , motor , kashti};
        NameKhodroChapKon nameKhodroChapKon = new NameKhodroChapKon(khodroha);

        // When
        String listeNameKhodroha = nameKhodroChapKon.execute();

        // Then
        Assertions.assertEquals("Benz-Volvo-Motor-kashti" , listeNameKhodroha);
    }
}
