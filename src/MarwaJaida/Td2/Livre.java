package MarwaJaida.Td2;

public class Livre {
    private String titre;
    private String auteur;
    private double prix;
    private int annee;

    public Livre() {
    }

    public Livre(String titre) {
        this.titre = titre;
    }

    public Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
    }

    public Livre(String titre, String auteur, double prix) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
    }

    public Livre(String titre, String auteur, double prix, int annee) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
        this.annee = annee;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }
    public Livre(Livre l){
        this.titre=l.getTitre();
        this.auteur=l.getAuteur();
        this.prix=l.getPrix();
        this.annee=l.getAnnee();
    }

    @Override
    public String toString() {
        return "Livre{" +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", prix=" + prix +
                ", annee=" + annee +
                '}';
    }
    public static void main(String[]args){
        Livre L1=new Livre();
        Livre L2=new Livre("La Boite à merveille ");
        Livre L3=new Livre("La Boite à merveille","Ahmed sefrioui");
        Livre L4=new Livre("La Boite à merveille","Ahmed sefrioui",180);
        Livre L5=new Livre("La Boite à merveille","Ahmed sefrioui",180,2000);
        Livre L6=new Livre(L5);
        System.out.println("le titre de livre choisie est :" +L2.getTitre());
        System.out.println("l'auteur de  de livre choisie est :" +L3.getAuteur());
        System.out.println("le prix de livre choisie est :" +L4.getPrix());
        System.out.println("l'année de production de livre choisie est :" +L5.getAnnee());
        System.out.println("la copie de livre choisie est :" +L5.toString());
    }
}
