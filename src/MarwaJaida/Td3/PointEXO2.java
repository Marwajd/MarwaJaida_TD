package MarwaJaida.Td3;

class Point2 {
    private int x, y;

    public Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void deplace(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public void affCoord() {
        System.out.println("Coordonnees : " + x + " " + y);
    }
}

class PointNom extends Point {
    private char nom;

    public PointNom(int x, int y, char nom) {
        super(x, y);
        this.nom = nom;
    }

    public void setNom(char nom) {
        this.nom = nom;
    }

    public void setPointNom(int x, int y, char nom) {
        this.nom = nom;
        super.deplace(x, y);
    }

    public void affCoordNom() {
        System.out.println("Coordonnees : " + getX() + " " + getY() + ", Nom : " + nom);
    }
}

public class PointEXO2 {
    public static void main(String[] args) {

        PointNom P = new PointNom(3, 5, 'A');
        P.affCoordNom();

        P.setNom('B');
       P.affCoordNom();

       P.setPointNom(1, 2, 'C');
        P.affCoordNom();
    }
}

