package MarwaJaida.Td2;

public class Rectangle {
    private double longueur;
    private double largeur;

    public Rectangle() {
    }

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }
    public Rectangle(Rectangle r){
        this.longueur=r.getLongueur();
        this.largeur=r.getLargeur();
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "longueur=" + longueur +
                ", largeur=" + largeur +
                '}';
    }
    public double perimetre(){
        return 2*largeur+longueur;
    }
    public double aire(){
        return largeur*longueur;
    }
    public boolean iscarre(){
        return longueur==largeur;
    }
    public static void main(String[]args){
        Rectangle R1=new Rectangle();
        Rectangle R2=new Rectangle(5.0,3.0);
        System.out.println("les propriéte d'un rectangle avant modification : " +R2.toString());
         R2.setLongueur(3.0);
        R2.setLargeur(5.0);
        System.out.println("les propriéte d'un rectangle aprés modification : " +R2.toString());
        System.out.println("le périmetre de rectangle est : " +R2.perimetre());
        System.out.println("l'air de rectangle est : " +R2.aire());
        System.out.println("est ce que le rectangle R2 est carre ? "+R2.iscarre());

    }

}
