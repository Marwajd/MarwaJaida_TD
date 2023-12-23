package MarwaJaida.Td1.Loop;

import java.util.Scanner;

public class Exo10 {
    public static void main (String[] args){
      //la fonction pow accepte des variables de types doubles il y on deux coix soit convrtit int en double ou en change vers double
       double  n=0,i,j,k;
       for(i=1;i<=9;i++){
           for(j=1;j<=i;j++){
               for(k=1;k<=j;k++){
                   System.out.println(i+" ^3 + " + j + " ^3 + " + k + " ^3 =" +(Math.pow(i,3)+Math.pow(j,3)+Math.pow(k,3)));
              n++;
               }
           }
       }
        System.out.println(n);
    }
}
