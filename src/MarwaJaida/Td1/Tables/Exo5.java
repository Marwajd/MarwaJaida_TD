package MarwaJaida.Td1.Tables;

public class Exo5 {
        public static void main(String[] args) {
            char[] T = {'D', 'E', 'C', 'A', 'L', 'A', 'G', 'E'};

            System.out.print("Tableau initial : ");
            for (char c : T) {
                System.out.print(c + " ");
            }
            System.out.println();

            // Décalage des éléments du tableau
            char premierElement = T[0];
            for (int i = 1; i < T.length; i++) {
                T[i - 1] = T[i];
            }
            T[T.length - 1] = premierElement;

            // Affichage du tableau modifié
            System.out.print("Tableau modifié : ");
            for (char c : T) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }


