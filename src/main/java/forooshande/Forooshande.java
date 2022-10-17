package forooshande;


import khodro.jadid.Mashin;


public class Forooshande {

    public static String[] nameForooshandegan = new String[10];

    static {
        nameForooshandegan[0] = "ali"; // ali is static member in nameForooshandegan array
        nameForooshandegan[1] = "ahmad";  // ahmad is static member in nameForooshandegan array

    }
    public void foroosheMashin() {

        Mashin.tedadeForoosh++;

    }
}
