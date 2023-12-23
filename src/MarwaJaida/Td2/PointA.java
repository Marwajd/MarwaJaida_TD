package MarwaJaida.Td2;

public class PointA {
    private char nom;
    private double X,Y;

    public PointA() {
    }

    public PointA(char nom, double x, double y) {
        this.nom = nom;
        X = x;
        Y = y;
    }

    public char getNom() {
        return nom;
    }

    public void setNom(char nom) {
        this.nom = nom;
    }

    public double getX() {
        return X;
    }

    public void setX(double x) {
        X = x;
    }

    public double getY() {
        return Y;
    }

    public void setY(double y) {
        Y = y;
    }

    @Override
    public String toString() {
        return "PointA{" +
                "nom=" + nom +
                ", X=" + X +
                ", Y=" + Y +
                '}';
    }
    public double Norme(){
        return Math.sqrt((X*X+Y*Y));
    }
public static void main(String[]args){
        PointA p1=new PointA('A',5,2);
    p1.setNom('B');
        System.out.println("le nom du point est:"+p1.getNom());
    System.out.println("les coordonnée  du point est:"+p1.getX()+","+p1.getY());

    System.out.println("la norme du point est :"+p1.Norme());

}
}
