package MarwaJaida.Td1.Condition;
import java.util.Scanner;
public class Exo5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int heures;
        do {
            System.out.print("Saisie l'heure : ");
            heures = scanner.nextInt();
            if (heures < 0 || heures > 23) {
                System.out.println("L'heure saisie doit être entre 0 et 23");
            }
        } while (heures < 0 || heures > 23);

        scanner.nextLine();

        char langue;
        System.out.println("Entrez 'f' pour français et 'a' pour anglais : ");
        langue = scanner.nextLine().charAt(0);

        String message = "";

        if (heures >= 0 && heures < 18) {
            if (langue == 'f') {
                message = "Bonjour";
            } else if (langue == 'a') {
                message = "Good Morning";
            }
        } else if (heures >= 18 && heures <= 22) {
            if (langue == 'f') {
                message = "Bonsoir";
            } else if (langue == 'a') {
                message = "Good Evening";
            }
        } else {
            if (langue == 'f') {
                message = "Bonne nuit";
            } else if (langue == 'a') {
                message = "Good Night";
            }
        }

        System.out.println(message);
    }
}


