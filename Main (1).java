import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner LOL=new Scanner(System.in);
 String pattern="Salve los bastard munchen";
        int h=pattern.length();
        System.out.println(pattern);

        System.out.println("Ingrese el numero del ejercicio que desea ver, solo se puede 1,2 o 3");
        int number=LOL.nextInt();

        if(number==1){failure_function_exercise_1();}

        else if (number==2){failure_function_exercise_2();}
        else if (number==3) {
            failure_function_exercise_3();
        }
        else {
            System.out.println("Opcion no valida");
        }

        System.out.println("Para poder ver las otras opciones vuelva a correr el codigo");

    }

    //funcion de fallo or failure function
    public static  void failure_function_exercise_1(){
        // array de palabras
        String [] word={"a","b","a","b","a","b","a","a","b"};
        // array de la funcion de fallo
        int _length=word.length;
        int [] failure=new int [_length];

        //----
        failure[0]=0; //asigancion por default propia del psudocodigo
        int t=0; // variable propia del pseudocodigo

        for (int i=1;i<_length;i++){

            while(t>0 && (word[i].compareTo(word[t]))!=0) {
                t = failure[t-1];
            } // fin del while loop
            if((word[i].compareTo(word[t]))==0){
                t++;
                failure[i]=t;
            } // fin del if

                else {
                    failure[i]=0;
            }// fin del else
            } //fin del for loop


        for (int XD:failure){
            System.out.println(XD);
        }
    }

    public static  void failure_function_exercise_2(){
        // array de palabras
        String [] word={"a","a","a","a","a","a"};
        // array de la funcion de fallo
        int _length=word.length;
        int [] failure=new int [_length];

        //----
        failure[0]=0; //asigancion por default propia del psudocodigo
        int t=0; // variable propia del pseudocodigo

        for (int i=1;i<_length;i++){

            while(t>0 && (word[i].compareTo(word[t]))!=0) {
                t = failure[t-1];
            } // fin del while loop
            if((word[i].compareTo(word[t]))==0){
                t++;
                failure[i]=t;
            } // fin del if

            else {
                failure[i]=0;
            }// fin del else
        } //fin del for loop


        for (int XD:failure){
            System.out.println(XD);
        }
    }

    public static  void failure_function_exercise_3(){
        // array de palabras
        String [] word={"a","b","b","a","a","b","b"};
        // array de la funcion de fallo
        int _length=word.length;
        int [] failure=new int [_length];

        //----
        failure[0]=0; //asigancion por default propia del psudocodigo
        int t=0; // variable propia del pseudocodigo

        for (int i=1;i<_length;i++){

            while(t>0 && (word[i].compareTo(word[t]))!=0) {
                t = failure[t-1];
            } // fin del while loop
            if((word[i].compareTo(word[t]))==0){
                t++;
                failure[i]=t;
            } // fin del if

            else {
                failure[i]=0;
            }// fin del else
        } //fin del for loop


        for (int XD:failure){
            System.out.println(XD);
        }
    }
}
