package MarwaJaida.Td1.Condition;
import java.util.Scanner;
public class Exo7 {
    public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
int N;
do{
    System.out.println("Saisie un entier : ");
    N=scanner.nextInt();
    if(N>900 ||N <100) {
        System.out.println("l'entier doit se composer de trois chiffres");
    }
    }while(N>900 || N <100);
        int X=N/100;
        int Y =(N%100)/10;
        int Z =N%10;
        System.out.println("Les nombres formés par les chiffres de N sont :");
        System.out.print("" + X + Y + Z + ", ");
        System.out.print("" + Y + X + Z + ", ");
        System.out.print("" + Z + Y + X + ", ");
        System.out.print("" + X + Z + Y + ", ");
        System.out.print("" + Z + X + Y + ", ");
        System.out.print("" + Y + Z + X+ "");
    }
    }

