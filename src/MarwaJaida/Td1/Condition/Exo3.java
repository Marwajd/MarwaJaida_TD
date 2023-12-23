package MarwaJaida.Td1.Condition;

import java.util.Scanner;

public class Exo3 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("entrer la valeur de a : ");
        int a =scanner.nextInt();
        System.out.print("entrer la valeurs de b : ");
        int b=scanner.nextInt();
        int somme=a+b;
        if(somme % 2==0){
            System.out.println("la somme est pair");
        } else{
        System.out.println("la somme est impair");
    }
        int produit =a*b;

        if(produit % 2==0){
            System.out.println("le produit est pair");
        } else{
            System.out.println("le produit est impair");
        }
        if (somme >= 0) {
            System.out.println("la somme est positive");
        }else{
            System.out.println("la somme est negative");
        }
        if (produit >= 0) {
            System.out.println("le produit est positive");
        }else{
            System.out.println("le produit est negative");
        }

}}
