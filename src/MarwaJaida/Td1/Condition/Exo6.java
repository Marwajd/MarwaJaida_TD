package MarwaJaida.Td1.Condition;

import java.util.Scanner;

public class Exo6 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int A;
        System.out.print("Entrer la valeur de A : ");
        A=scanner.nextInt();
        int B;
        System.out.print("Entrer la valeur de B : ");
        B=scanner.nextInt();
        if (A>=0 && B>= 0 || A< 0 && B< 0 ){
            System.out.println("le produit de "+ A +" * "+ B +  " est positive");
        }else{
            System.out.println("le produit de " + A +" * "+ B +  " est négative");
        }
}}
