package khodro;

import static java.lang.System.out;

public abstract class Khodro {

    protected void protectedMethod(){
        out.println("this method is protected");
    }

    protected boolean ayaRoshanAst;

    public void roshan() {

        ayaRoshanAst = true;
    }

    void khamoush() {

        ayaRoshanAst = false;
    }

    public abstract boolean ayaDarHaleHarkatAst();

    public abstract String getMark();




}
