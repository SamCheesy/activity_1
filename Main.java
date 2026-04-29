import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Scanner LOL=new Scanner(System.in);
        System.out.println("Ingrese el numero del ejercicio que desea ver, solo se puede 1 o 2:");
        int option=LOL.nextInt();

        if(option==1) {
            System.out.println("la cadena es: abababaab.");
            System.out.println(Knuth_Morris_Pratt_Algorithm2());
        }

        else if (option==2) {
            System.out.println("la cadena es: abababbaa.");
            System.out.println(Knuth_Morris_Pratt_Algorithm1());
        }
        else{
            System.out.println("Opcion no valida");
        }

        System.out.println("Para ver la otra opcion reincicie el codigo ");
    }


    public static String Knuth_Morris_Pratt_Algorithm1(){
        String [] PapaSmurf={"a","b","a","b","a","a"};  // keyword // b)

        String [] Smurfette={"a","b","a","b","a","b","b","a","a"}; // test

        int _lenght1=PapaSmurf.length;
        int _lenght2=Smurfette.length;

        int [] failure=new int[_lenght1];
        failure[0]=0;
        int t=0;

        // Se reutiliza el codigo de la funcion fallo para poder hacer uso del algoritmo de KMP

        for (int i=1;i<_lenght1;i++){

            while(t>0 && (PapaSmurf[i].compareTo(PapaSmurf[t]))!=0) {
                t = failure[t-1];
            } // fin del while loop
            if((PapaSmurf[i].compareTo(PapaSmurf[t]))==0){
                t=t+1;
                failure[i]=t;
            } // fin del if

            else {
                failure[i]=0;
            }// fin del else
        }

        int s=0; // variable propia del pseudocodigo

        for (int i=1;i<=_lenght2;i++){

            while(s>0 && (Smurfette[i-1].compareTo(PapaSmurf[s]))!=0){
                s=failure[s-1];
            }
            if ((Smurfette[i-1].compareTo(PapaSmurf[s]))==0){
                s=s+1;
            } //fin del if

            if(s==_lenght1){
                return "yes";
            }
        }// fin del for loop
        return "no";

    } //fin de la funcion

    public static String Knuth_Morris_Pratt_Algorithm2(){
        String [] PapaSmurf={"a","b","a","b","a","a"};  // keyword // b)

        String [] Smurfette={"a","b","a","b","a","b","a","a","b"}; // test

        int _lenght1=PapaSmurf.length;
        int _lenght2=Smurfette.length;

        int [] failure=new int[_lenght1];
        failure[0]=0;
        int t=0;

        // Se reutiliza el codigo de la funcion fallo para poder hacer uso del algoritmo de KMP

        for (int i=1;i<_lenght1;i++){

            while(t>0 && (PapaSmurf[i].compareTo(PapaSmurf[t]))!=0) {
                t = failure[t-1];
            } // fin del while loop
            if((PapaSmurf[i].compareTo(PapaSmurf[t]))==0){
                t++;
                failure[i]=t;
            } // fin del if

            else {
                failure[i]=0;
            }// fin del else
        }

        int s=0; // variable propia del pseudocodigo

        for (int i=1;i<=_lenght2;i++){

            while(s>0 && (Smurfette[i-1].compareTo(PapaSmurf[s]))!=0){
                s=failure[s-1];
            }
            if ((Smurfette[i-1].compareTo(PapaSmurf[s]))==0){
                s=s+1;
            } //fin del if

            if(s==_lenght1){
                return "yes";
            }
        }// fin del for loop
        return "no";

    }
}