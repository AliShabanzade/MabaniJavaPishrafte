import khodro.jadid.Mashin;

import java.util.Scanner;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args){
        for(int index = 0 ; index < args.length ; index++){
            out.println(args[index]);
        }

        //3 moteghayere mark , gonjayeshSandogh va noeDande az lahaze comiler ertebati ba hamin nam moteghayer dar
        // class Mahshin nadarad . chon in moteghayerha staric nist va serfan baraye yadavari class Mashin
        //be soorate hamnam tain shod ta bedanim ke constractore class Mashin che dadehaii niyaz dasht.
        String mark = args[0]; // in maghadir ra dar args method main set kardim
        String gonjayeshSandogh = args[1];
        String noeDande = args [2];
        Mashin mashin = new Mashin(mark , Integer.parseInt(gonjayeshSandogh) , noeDande);// hamchenin mitavan be jaye
        // moteghayerha  , args[0] ,  Integer.parseInt(args[1]) , args[2]  ra  gharar dad
        if(mashin.ayaDarHaleHarkatAst()){
            out.println("Mashin Dar Hale Harkat Ast");

        }else{
            out.println("Mashin Park Ast");
        }
        out.println(mashin.getMark());

        Scanner scanner = new Scanner(System.in);
        out.println("lotfan name khod ra vared konind ?");
        String nam= scanner.nextLine();

        out.println("lotfan sene khod ra vared konid ?");
        int sen = scanner.nextInt();

        out.println("mahale tavalod : ");
        String shahreTavalod = scanner.nextLine();


        out.println(nam + " " + sen + " " + shahreTavalod);







        out.println("Payane Ejra");
    }
}
