package khodro;

import khodro.Khodro;
import khodro.jadid.Mashin;

public class Kashti extends Khodro {




    @Override
    public boolean ayaDarHaleHarkatAst() {
        protectedMethod();

        Mashin mashin = new Mashin();
        return false;
    }

    @Override
    public String getMark() {
        return "kashti";
    }
}
