package MarwaJaida.Td1.Loop;
import java.util.Scanner;
public class Exo7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, i, j;
        System.out.print("entrer nbr de ligne : ");
        n = scanner.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println( );
        }
    }
}
