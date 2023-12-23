package MarwaJaida.Td3;
//cette interface je lui donne le nom Employes pour eviter la redandance des noms
interface Employes {
    String getNom();
    String getPrenom();
    double gains();
}

class Patrons implements Employes {
    private String nom;
    private String prenom;
    private double salaire;

    public Patrons(String nom, String prenom, double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
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

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public double gains() {
        return salaire;
    }

    @Override
    public String toString() {
        return "Patrons{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", salaire=" + salaire +
                '}';
    }
}

class TravailleurCommissions implements Employes {
    private String nom;
    private String prenom;
    private double salaire;
    private double commission;
    private int quantite;

    public TravailleurCommissions(String nom, String prenom, double salaire, double commission) {
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
        this.commission = commission;
    }

    @Override
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public double gains() {
        return salaire + commission;
    }

    @Override
    public String toString() {
        return "TravailleurCommissions{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", quantite=" + quantite +
                '}';
    }
}

class TravailleurHoraires implements Employes{
    private String nom;
    private String prenom;
    private double retribution;
    private int heures;

    public TravailleurHoraires(String nom, String prenom, double retribution) {
        this.nom = nom;
        this.prenom = prenom;
        this.retribution = retribution;
    }

    @Override
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
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

    public double gains() {
        return retribution * heures;
    }

    @Override
    public String toString() {
        return "TravailleurHoraire{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", heures=" + heures +
                '}';
    }
}

class TestEmployes {
    public static void main(String[] args) {
        // Test de la classe Patron
        Patron patron1 = new Patron("Benani", "Amine", 5000);
        System.out.println(patron1);
        System.out.println("Salaire du patron : " + patron1.gains());
        // Test de la classe TravailleurCommissions
        TravailleurCommissions travailleur1 = new TravailleurCommissions("Alaoui", "Meryam", 2000, 100);
        travailleur1.setQuantite(50);
        System.out.println(travailleur1);
        System.out.println("Salaire du travailleur à commission : " + travailleur1.gains());
        // Test de la classe TravailleurHoraires
        TravailleurHoraires travailleur2 = new TravailleurHoraires("Benani", "Leila", 15);
        travailleur2.setHeures(120);
        System.out.println(travailleur2);
        System.out.println("Salaire du travailleur horaire : " + travailleur2.gains());
    }
}
