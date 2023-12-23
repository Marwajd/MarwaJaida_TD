package MarwaJaida.Td1.Loop;
import java.util.Scanner;
public class Exo4 {

 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  int a, b;
  System.out.print("Entrez le premier entier  : ");
  a = scanner.nextInt();
  System.out.print("Entrez le deuxième entier  : ");
  b = scanner.nextInt();
  if (a <= 0 || b <= 0) {
   System.out.println("Les entiers doivent être positifs et non nuls.");
  } else {
   while (b != 0) {
    int r = a % b;
    a = b;
    b = r;
   }
   System.out.println("Le PGCD de ces nombres  est : " + a);
  }
 }
}
