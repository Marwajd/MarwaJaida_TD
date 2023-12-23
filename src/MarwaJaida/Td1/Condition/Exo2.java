package MarwaJaida.Td1.Condition;

import java.util.Scanner;

public class Exo2 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Entrer la valeurs de  a= ");
        double a=scanner.nextDouble();
        System.out.print("Entrer la valeurs de b= ");
        double b=scanner.nextDouble();
        System.out.print("Entrer la valeurs de c= ");
        double c=scanner.nextDouble();
       double delta= b*b-4*a*c;
        double racinedelta=Math.sqrt(delta);
        if(delta>0){
           double x1=  (-b+racinedelta)/(2*a);
            double x2=  (-b-racinedelta)/(2*a);
            System.out.println("les solutions de l'equation dans R sont : "+ x1 + "et" + x2 );
        }
        else if(delta==0){
            double x=(-b)/2*a;
            System.out.println("la solution de l'equation est : "+ x);
    }
  else{

         System.out.println("l'equation n'a pas de solution dans R");}
}}
