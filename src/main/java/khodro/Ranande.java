package khodro;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.security.spec.RSAOtherPrimeInfo;

// outer class
public class Ranande {

    private String noeGavahiname = "Paye 1"; // run time
    private static String nam= "Farhad";  // compile time

    // non-static Nested  class : inner class
    public class Gavahiname{
        public void print(){
            System.out.println("non static nested class");
            System.out.println(noeGavahiname);
            System.out.println(nam);
        }

    }



    // static nested  class
    public static class StaticGavahiname{
        public void print(){
            System.out.println("static nested class");
          //  System.out.println(noeGavahiname); // chon noe gavahiname static nist dar class static kar nemikonad.
            // noe static compile time ast va ghabl az noe non static (run time) tarif mishavad.
            System.out.println(nam);
        }



    }





}
