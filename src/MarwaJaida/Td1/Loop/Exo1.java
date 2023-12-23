package MarwaJaida.Td1.Loop;
import java.util.Scanner;
public class Exo1 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int N;
        int i;
        int factoriel=1;

        System.out.print("Entrer un entier : ");
        N=scanner.nextInt();
    for(i=1;i<=N;i++){
        factoriel =factoriel *i ;
        }
     System.out.println("la factoriel de "+ N +" ! ="+factoriel);
    }

}
