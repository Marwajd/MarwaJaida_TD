package MarwaJaida.Td1.Tables;
import java.util.Scanner;

public class Exo4 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n, i, j;
    System.out.print("entrer la tailles des lignes du matrice : ");
    n=scanner.nextInt();

    int A[][] = new int[n][n];
    int B[][] = new int[n][n];
    for(i=0;i<n;i++)

    {
        for (j = 0; j < n; j++) {
            System.out.print("A[" + i + "][" + j + "]=");
            A[i][j] = scanner.nextInt();
        }
    }
     for( i= 0; i < n; i++){

        for (j = 0; j < n; j++) {
            System.out.print("B[" + i + "][" + j + "]=");
            B[i][j] = scanner.nextInt();
        }
    }

    int S[][] = new int[n][n];
     for(i = 0;i < n; i++) {
        for (j = 0; j < n; j++) {
            S[i][j] = A[i][j] + B[i][j];
            System.out.print(S[i][j] + " ");
        }
        System.out.println();
    }
}}