package MarwaJaida.Td1.Loop;

import java.util.Scanner;
public class Exo8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, i, j;
        System.out.print("entrer nbr de ligne : ");
        n = scanner.nextInt();
        for (i = 0; i < n; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (i = n-1; i > 0; i--) {
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println( );
        }
}}

