package MarwaJaida.Td3;

public abstract class Figure {
    protected String nom;

    public Figure(String nom) {
        this.nom=nom;
    }



    public abstract double getPerimetre();
    public abstract double getAire();
    public String toString(){
        return "la figure  : " + nom + " est de perimetre "+ getPerimetre()+ "et de aire "
                +getAire();
    }
}
class Disque extends Figure{
    private double centre;
    private double rayon;

    public double getCentre() {
        return centre;
    }

    public void setCentre(double centre) {
        this.centre = centre;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    public Disque(){
        super("Disque");
    }

    public Disque(double centre,double rayon){
        super("Disque");
        this.centre=centre;
        this.rayon=rayon;

    }
public Disque(double centre,double rayon,String nom){
        super(nom);
    this.centre=centre;
    this.rayon=rayon;
}

    @Override
    public double getPerimetre() {
        return 2*Math.PI*rayon;
    }

    @Override
    public double getAire() {
        return Math.PI*Math.pow(rayon,2);
    }
}
class Rectangle extends Figure{
    private double largeur ;
    private double longueur ;
    public Rectangle(){
        super("Rectangle");
    }
    public Rectangle(double largeur,double longueur ){
        super("Rectangle");
        this.largeur=largeur;
        this.longueur=longueur;

    }
    public Rectangle(double largeur,double longueur,String nom){
        super(nom);
        this.largeur=largeur;
        this.longueur=longueur;
    }
    public double getLargeur(){return largeur;
    }
    public double getLongueur(){
        return longueur;
    }
    public double getPerimetre(){
        return 2*(longueur+largeur);
    }
    public double getAire(){
        return longueur *largeur;
    }
}
class Testfigure{
    public static void main(String[]args){
     Disque D1= new Disque(0,2,"D") ;
        System.out.println(D1);
        Rectangle R1= new Rectangle(3,2,"R") ;
        System.out.println(R1);

    }
}
