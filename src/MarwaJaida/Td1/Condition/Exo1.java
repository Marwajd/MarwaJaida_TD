package MarwaJaida.Td1.Condition;


import java.util.Scanner;
public class Exo1 {
    public static void main(String[] args){

    Scanner scanner= new Scanner(System.in);
    System.out.print(" Entrer X =  ");
        int x =scanner.nextInt();
        System.out.print(" Entrer  Y =  ");
        int y =scanner.nextInt();
        System.out.print(" Entrer Z =  ");
        int z =scanner.nextInt();
        int max = x;

        if(max < y){
            max = y;
        }
             if(max<z) {
            max=z;
                 }

             if(max<x){
            max=x;
               }

        System.out.println("le maximum des trois entiers " + x + " , " + y + " et " + z + " est : " +max);






}}
