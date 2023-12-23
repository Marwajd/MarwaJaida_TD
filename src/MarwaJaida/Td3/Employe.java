package MarwaJaida.Td3;

public abstract class Employe {
protected String nom;
protected String prenom;

public Employe(){

}
    public Employe(String nom,String Prenom){
        this.nom=nom;
        this.prenom=prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
    public abstract double gains();
}
class Patron extends Employe{

    private double salaire;

    public Patron (){
    }

    public Patron(String nom,String prenom,int salaire){
        super(nom,prenom);
        this.salaire=salaire;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "Patron{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", salaire=" + salaire +
                '}';
    }
    public double gains(){
        return salaire;
    }
}
class TravailleurCommission extends Employe{
    protected double salaire;
    protected double commision;
    protected int quantite;

    public TravailleurCommission(){}

    public TravailleurCommission(String nom,String prenom,double salaire,double commision){
        super(nom,prenom);
        this.salaire=salaire;
        this.commision=commision;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public double getCommision() {
        return commision;
    }

    public void setCommision(double commision) {
        this.commision = commision;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    @Override
    public String toString() {
        return "TravailleurCommission{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", quantite=" + quantite +
                '}';
    }
    public double gains(){

        return salaire+commision;
    }
}

class TravailleurHorraire extends Employe{
    private double retribution;
    private int heures;

    public TravailleurHorraire(){

    }
    public TravailleurHorraire(String nom,String prenom,double retribution){
        super(nom,prenom);
        this.retribution=retribution;
    }

    public double getRetribution() {
        return retribution;
    }

    public void setRetribution(double retribution) {
        this.retribution = retribution;
    }

    public int getHeures() {
        return heures;
    }

    public void setHeures(int heures) {
        this.heures = heures;
    }

    @Override
    public String toString() {
        return "TravailleurHorraire{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", heures=" + heures +
                '}';
    }
    public double gains(){

          return  retribution*heures;
        }

}
class TestEmploye {
    public static void main(String[] args) {
        // Test de la classe Patron
        Patron patron1 = new Patron("Benani", "Amine", 5000);
        System.out.println(patron1);
        System.out.println("Salaire du patron : " + patron1.gains());

        // Test de la classe TravailleurCommission
        TravailleurCommission travailleur1 = new TravailleurCommission("Alaoui", "Meryam", 2000, 100);
        travailleur1.setQuantite(50);
        System.out.println(travailleur1);
        System.out.println("Salaire du travailleur à commission : " + travailleur1.gains());

        // Test de la classe TravailleurHoraire
        TravailleurHorraire travailleur2 = new TravailleurHorraire("Benani", "Leila", 15);
        travailleur2.setHeures(120);
        System.out.println(travailleur2);
        System.out.println("Salaire du travailleur horaire : " + travailleur2.gains());
    }
}

//"rétribution" fait référence à la rémunération horaire ou au taux horaire que
// reçoit un employé pour chaque heure travaillée.
// C'est le montant payé par heure de travail
