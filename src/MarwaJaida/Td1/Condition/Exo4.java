package MarwaJaida.Td1.Condition;

import java.util.Scanner;

public class Exo4 {
    public static void main(String[] args) {
        double moyenne;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Entrer la moyenne d'étudiants : ");
            moyenne = scanner.nextDouble();
            if (moyenne < 10 || moyenne > 20) {
                System.out.println("La moyenne doit être entre 10 et 20.");
            }
        } while (moyenne < 10 || moyenne > 20);

        if (moyenne >= 16) {
            System.out.println("La mention de l'étudiant est T.Bien");
        } else if (moyenne >= 14) {
            System.out.println("La mention de l'étudiant est Bien");
        } else if (moyenne >= 12) {
            System.out.println("La mention de l'étudiant est A.Bien");
        } else if (moyenne >= 10) {
            System.out.println("La mention de l'étudiant est Passable");
        } else {
            System.out.println("Cette moyenne n'a pas de mention.");
        }
    }
}
