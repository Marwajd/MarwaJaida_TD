package MarwaJaida.Td1.Condition;
import java.util.Scanner;
public class Exo9 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int X;
        System.out.print("saisie la premiere variable : ");
        X=scanner.nextInt();
        int Y;
        System.out.print("saisie la deuxiéme variable : ");
        Y=scanner.nextInt();
        int a;
        if(X>Y){
            a=X;
            X=Y;
            Y=a;

        }
           System.out.println("les deux variables sont dans l'ordre croissant "+ X + " et "+Y);
    }

}
