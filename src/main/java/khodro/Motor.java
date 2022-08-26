package khodro;

public class Motor {

    boolean ayaRoshanAst;


    public void roshan() {

        ayaRoshanAst = true;
    }

    void khamoush() {

        ayaRoshanAst = false;
    }

    public boolean ayaDarHaleHarkatAst() {
        return ayaRoshanAst;
    }
}

