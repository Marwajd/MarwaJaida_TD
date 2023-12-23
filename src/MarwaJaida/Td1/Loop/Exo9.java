package MarwaJaida.Td1.Loop;

import java.util.Scanner;

public class Exo9 {
    public static void main(String[]args){
Scanner scanner=new Scanner(System.in);
int N;
System.out.print("Saisie un entier : ");
N=scanner.nextInt();
int nbr=N;//pour stocker N
int somme=0;
;//pour récurer le dérniers chiffre de N
        while(nbr!=0){
            int chiffre =nbr%10;
            somme+=chiffre; //Ajouter ce chiffre à la somme
            nbr/=10;
        }
        System.out.println(" la somme des chiffres d’un nombre entier " + N + " est " + somme);
    }
}
