package khodro;

public class NameKhodroChapKon {

    Khodro[] khodroha;

    // Constructor
    public NameKhodroChapKon(Khodro[] khodroha) {
        this.khodroha = khodroha;


    }

    public String execute() {

        String nameKhodroha = "";

        for (int neshaneGar = 0; neshaneGar < khodroha.length; neshaneGar++) {
            Khodro vasileNaghliye = khodroha[neshaneGar];
            if (neshaneGar != khodroha.length -1 ) {
                nameKhodroha = nameKhodroha + vasileNaghliye.getMark() + "-";

            } else {
                nameKhodroha = nameKhodroha + vasileNaghliye.getMark();

            }

        }
         return nameKhodroha;



    }
}


