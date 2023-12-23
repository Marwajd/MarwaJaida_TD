package MarwaJaida.Td1.Loop;
import java.util.Scanner;
public class Exo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N, i, position = 0, j = 1;
        int max = Integer.MIN_VALUE;
//3éme question

        for (i = 1; i <= 10; i++) {
            System.out.print("entre le " + i + " éme nombres :");
            N = scanner.nextInt();
            if (N == 0) {
                break; // Sortir si l'utilisateur entre 0
            }

            if (N > max) {
                max = N;
                //2éme questions
                position = j;
            }
            j++;
        }
        System.out.println("le maximum de ces 10 nombres est : " + max + " et sa posion est " + position);
    }
}
