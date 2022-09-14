package khodro;

public abstract class Khodro {

    protected void protectedMethod(){
        System.out.println("this method is protected");
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
