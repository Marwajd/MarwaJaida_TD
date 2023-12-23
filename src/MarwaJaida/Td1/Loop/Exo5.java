package MarwaJaida.Td1.Loop;

import java.util.Scanner;

public class Exo5 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
    int n ,u1=0,u2=1,u=0,i;
         System.out.print("entrer un entier: ");
        n=scanner.nextInt();
        if (n < 0) {
            System.out.println("l'entier saisie doit etre positive");

        }else{
            if(n==0){
                u=u1;
            }
            else if(n==1){
                u=u2;
            }
            else{
                //boucle for pour calculer les termes successifs de la suite
                for(i=2;i<=n;i++){
                    u=u1+u2;
                    u1=u2;
                    u2=u;

                }
            }
            System.out.println("le " + n + " ème terme de la suite est : " + u);
        }



    }


}
