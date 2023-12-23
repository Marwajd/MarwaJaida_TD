package MarwaJaida.Td1.Loop;

import java.util.Scanner;

public class Exo2 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int N,S=0,i;
        System.out.print("Entrer un entier :");
        N=scanner.nextInt();
        for(i=1;i<N;i+=2){

                S+=i;
        }
        System.out.println("la somme des entiers impairs inférieurs à " +N+" est " + S );
    }
}
