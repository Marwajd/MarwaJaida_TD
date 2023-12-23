package MarwaJaida.Td1.Condition;
import java.util.Scanner;
public class Exo8 {
    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int mois, annee;
            do {
                System.out.print("Entrez le numéro du mois (1-12) : ");
                mois = scanner.nextInt();
                if(mois < 1 || mois > 12){
                    System.out.println("ce nombre de mois n'exite pas!!!");
                }
            } while (mois < 1 || mois > 12);

            do {
                System.out.print("Entrez l'année (1900-2100) : ");
                annee = scanner.nextInt();
                if(annee < 1900 || annee > 2100){
                    System.out.println("le nombre d'année doit compris entre 1900 et 2100!!");
                }
            } while (annee < 1900 || annee > 2100);

            int jours = 0;

            switch (mois) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    jours = 31;
                    break;
                case 4: case 6: case 9: case 11:
                    jours = 30;
                    break;
                case 2:
                    if ((annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0)) {
                        jours = 29;
                    } else {
                        jours = 28;
                    }
                    break;
                default:
                    System.out.println("Numéro de mois invalide !");
                    break;
            }

            if (jours != 0) {
                System.out.println("Nombre de jours pour le mois " + mois + " de l'année " + annee + " : " + jours);
            }
        }
    }


