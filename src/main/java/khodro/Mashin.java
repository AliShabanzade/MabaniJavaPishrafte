package khodro;

public class Mashin {

    boolean ayaRoshanAst;
    boolean ayaDarBazAst;
    String mark;

    Ranande ranande;


    //Nested Class
    public Mashin() {

    }

    public Mashin ( String Mark){
        this.mark=Mark;

    }





    public void roshan() {

        ayaRoshanAst = true;
    }


    void khamoush() {

        ayaRoshanAst = false;
    }


    void bazKardadneDar() {

        ayaDarBazAst = true;
    }


    void bastaneDar() {

        ayaDarBazAst = false;
    }


     public boolean ayaDarHaleHarkatAst() {


        if (!ayaDarBazAst && ayaRoshanAst) {

            return true;
        } else {

            return false;
        }


    }
}
