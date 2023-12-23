package MarwaJaida.Td1.Tables;

import java.util.Scanner;

public class Exo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seuil, i, nombreEtudiants;
        do {
            System.out.print("Entrer un seuil entre 0 et 20 : ");
            seuil = scanner.nextInt();
        } while (seuil < 0 || seuil > 20);

        // Saisie du nombre d'étudiants qui va etre la taille de tab
        do {
            System.out.print("Entrer le nombre d'étudiants (max. 10) : ");
            nombreEtudiants = scanner.nextInt();
        } while (nombreEtudiants <= 0 || nombreEtudiants > 10);

        int[] moyennes = new int[nombreEtudiants];

        // Saisie des moyennes des étudiants
        for (i = 0; i <= nombreEtudiants; i++) {
            do {
                System.out.print("Moy[ "+ i + "] = ");
                moyennes[i] = scanner.nextInt();
            } while (moyennes[i] < 0 || moyennes[i] > 20);
        }
   //    j= nombreEtudiantsSupSeuil
        int j = 0;

        // Comptage des étudiants ayant une moyenne supérieure ou égale au seuil
        for (i = 0; i < nombreEtudiants; i++) {
            if (moyennes[i] >= seuil) {
               j++;
            }
        }

        System.out.println("Le nombre d'étudiants avec une moyenne supérieure ou égale au seuil est : " + j);
    }}