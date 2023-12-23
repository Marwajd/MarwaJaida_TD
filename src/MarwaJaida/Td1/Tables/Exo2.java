package MarwaJaida.Td1.Tables;

import java.util.Scanner;

public class Exo2 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int N,i=0;
        System.out.print("Saisie un entier  N= ");
        N=scanner.nextInt();
        int bin[]=new int[50];
        int x=N;
        do {
                bin[i] = x % 2;
                x /= 2;
                i++;

        }while (x != 0) ;
        System.out.print("La représentation binaire de " + N + " est : ");
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(bin[j]);
        }
        }

    }


