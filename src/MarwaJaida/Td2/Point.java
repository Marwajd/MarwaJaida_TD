package MarwaJaida.Td2;

public class Point {
    private char nom;
    private  double abscisse;

    public Point(char nom, double abscisse) {
        this.nom = nom;
        this.abscisse = abscisse;
    }

    public char getNom() {
        return nom;
    }

    public void setNom(char nom) {
        this.nom = nom;
    }

    public double getAbscisse() {
        return abscisse;
    }

    public void setAbscisse(double abscisse) {
        this.abscisse = abscisse;
    }

    public void afficher(){
        System.out.print("le nom du point est : " +nom+ " et l'abscisse est : "+abscisse);
    }
    public void translation(double translation){
        abscisse+=translation;
    }


public static void main(String[] args){
    Point P1=new Point('A',5.0);
    System.out.println("");
    P1.afficher();
    System.out.println("");
    P1.translation(2.0);
    System.out.println("");
    P1.afficher();
}}

