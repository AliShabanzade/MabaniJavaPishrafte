package khodro.jadid;

import khodro.Gearbox;
import khodro.Khodro;
import khodro.Ranande;
import khodro.SandoghDar;

// Mashin is a Khodro : car is a vehicle
public class Mashin extends Khodro implements Gearbox, SandoghDar { // Dry : don t repeat yourself


    private boolean ayaDarBazAst;
    private String mark;
    private int gonjayeshSandogh;
    private String noeDande;

    private Ranande ranande;



    public Mashin() {

    }

    public Mashin ( String Mark){
        this.mark=Mark;

    }

    public Mashin ( String mark , int gonjayeshSandogh , String noeDadnde   ){
        this.mark=mark;
        this.gonjayeshSandogh=gonjayeshSandogh;
        this.noeDande=noeDadnde;
    }








   void bazKardadneDar() {

        ayaDarBazAst = true;
    }


    void bastaneDar() {

        ayaDarBazAst = false;
    }


     public boolean ayaDarHaleHarkatAst() {

        protectedMethod();

        if (!ayaDarBazAst && ayaRoshanAst) {

            return true;
        } else {

            return false;
        }


    }

    @Override
    public String getMark() {
        return mark;
    }


    @Override
    public String typeDande() {
        return "Automatic";
    }

    @Override
    public int gonjayeshSandogh() {
        return 100;
    }
}
