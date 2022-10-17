import forooshande.Forooshande;
import khodro.jadid.Mashin;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ForooshandeMashinTest {


    @Test
    void Bayad_Tedade_Kole_Mashinhaye_Forookhte_Shode_Ra_Be_Dast_Avarim () {
        Forooshande ali= new Forooshande();
        Forooshande naser = new Forooshande();

        ali.foroosheMashin();
        ali.foroosheMashin();
        ali.foroosheMashin();
        ali.foroosheMashin();
        naser.foroosheMashin();







        Assertions.assertEquals(5 , Mashin.tedadeForoosh);


    }
}
