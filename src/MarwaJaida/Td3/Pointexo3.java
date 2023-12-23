package MarwaJaida.Td3;

class point2 {
    protected int x, y;

    public point2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void affCoord() {
        System.out.println("Coordonnees : " + x + " " + y);
    }

    public void affiche() {
        System.out.println("Coordonnees : " + x + " " + y);
    }
}

class Centre extends point2 {
    private char nom;

    public Centre(int x, int y, char nom) {
        super(x, y);
        this.nom = nom;
    }

    public void affNom() {
        System.out.println("Nom : " + nom);
    }


    public void affiche() {
        super.affiche();
        System.out.println("Nom : " + nom);
    }
}

class Cercle extends Centre {
    private double rayon;

    public Cercle(int x, int y, char nom, double rayon) {
        super(x, y, nom);
        this.rayon = rayon;
    }

    public double calculeAir() {
        return Math.PI * rayon * rayon;
    }

    public static void main(String[] args) {
        //Test de la class Centre
        Centre c1 = new Centre(2, 3, 'A');
        c1.affCoord();
        c1.affNom();
        c1.affiche();
        //Test de la class Cercle
        Cercle cercle = new Cercle(3, 4, 'B', 2.0);
        cercle.affiche();
        double air = cercle.calculeAir();
        System.out.println("Aire du cercle est : " + air);
    }
}

