package MarwaJaida.Td1.Tables;

import java.util.Scanner;

public class Exo1 {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        int N,i ;

        do{
        System.out.print("Entrer la taille de tableau ");
        N= scanner.nextInt();

        }while(N>50||N<10);
        int tab[]=new int[N];
        System.out.println("Remplissez le tableau :");
        for (i = 0; i < tab.length; i++) {
           System.out.print("T[ " + i + " ]= ");
            tab[i] = scanner.nextInt();
        }

        int max=tab[0];
        int min=tab[0];
        for(i=0;i< tab.length;i++) {
            if (tab[i] > max) max = tab[i];

            if (tab[i] < min) min = tab[i];
        }
            System.out.println("le max est "+max+ "et min est " +min);

    }
}
