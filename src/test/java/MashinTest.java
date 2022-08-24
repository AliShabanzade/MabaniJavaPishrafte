import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MashinTest {



    @Test
    void Mashin_Bayad_Harkat_Konad_Vaghti_Dar_Baste_Ast_Va_Mahshin_Roshan_Ast() {

        //Given
        Mashin Benz = new Mashin("Benz");
        Mashin volvo = new Mashin("Volvo");


        //When
        boolean ayaHarkatMikonad=Benz.ayaMashinDarHaleHarkatAst();
        volvo.roshan();
        boolean ayaVolvoHarkatMikonad=volvo.ayaMashinDarHaleHarkatAst();

        //Then
        Assertions.assertFalse(ayaHarkatMikonad);
        Assertions.assertTrue(ayaVolvoHarkatMikonad);

        //object Mashin
//        Mashin mashin= new Mashin();
//        mashin.bazKardadneDar();
//        mashin.bastaneDar();
//
//
//        System.out.println("aya dare mashin baz ast? " + mashin.ayaDarMashinBazAst);
//
//        mashin.ayaMashinDarHaleHarkatAst();
//
//        System.out.println("-------------------------------------------------------");
//
//
//        Mashin pride = new Mashin("pride");
//        pride.roshan();
//        pride.bazKardadneDar();
//
//        pride.ayaMashinDarHaleHarkatAst();



    }





    // Nested class
    class Mashin {


        //dade
        boolean ayaMashinRoshanAst;
        boolean ayaDarMashinBazAst;
        String mark;

        Mashin() {
            System.out.println("Yek mashin bedoone dade sakhte shod");
        }

        Mashin ( String Mark){
            this.mark=Mark;
            System.out.println("Yek Mashin " + this.mark + " sakhte shod ");
        }




        // (tabe) methode
        void roshan() {
            System.out.println("mashin roshan ast");
            ayaMashinRoshanAst = true;
        }


        void khamoush() {
            System.out.println("mashin khamoosh ast");
            ayaMashinRoshanAst = false;
        }


        void bazKardadneDar() {
            System.out.println("dar mashin baz ast");
            ayaDarMashinBazAst = true;
        }


        void bastaneDar() {
            System.out.println("dar mashin baste ast");
            ayaDarMashinBazAst = false;
        }


        boolean ayaMashinDarHaleHarkatAst() {
            // mahshin roshan bashad va dare mashin baste bashad(rule)

            if (!ayaDarMashinBazAst && ayaMashinRoshanAst) {
                System.out.println("mashin dar hale harkat ast");
                return true;
            } else {
                System.out.println("mahsin park ast");
                return false;
            }


        }
    }
}
