public class MashinTest {


    // Nested class
    class Mashin{

        //dade
        boolean ayaMashinRoshanAst;
        boolean ayaDarMashinBazAst;
        double toul;
        double arz;
        String mark;



        // (tabe) methode
        void roshan(){
            System.out.println("mashin roshan ast");
            ayaMashinRoshanAst = true;
        }


        void khamoush() {
            System.out.println("mashin khamoosh ast");
            ayaMashinRoshanAst= false;
        }


        void bazKardadneDar(){
            System.out.println("dar mashin baz ast");
            ayaDarMashinBazAst=true;
        }


        void bastaneDar(){
            System.out.println("dar mashin baste ast");
            ayaDarMashinBazAst=false;
        }


        void harkat(){
            // mahshin roshan bashad va dare mashin baste bashad(rule)

            if(!ayaDarMashinBazAst && ayaMashinRoshanAst){
                System.out.println("mashin dar hale harkat ast");
            }else{
                System.out.println("mahsin park ast");
        }


    }

}
