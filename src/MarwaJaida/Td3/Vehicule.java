package MarwaJaida.Td3;

public class Vehicule {

    protected int nbPassager;

    public Vehicule(int n){
        this.nbPassager=n;
    }

    public String toString(){
        return " le nombre de passager dans la vehicule est : "+ nbPassager;
    }
}
class Moto extends Vehicule {
    private int nbRoues = 2;
    //Lorsqu'une classe enfant étend une classe parente sans constructeur par défaut (sans paramètres), et si la classe enfant
    // ne définit pas explicitement de constructeur, Java tente d'appeler
    // le constructeur par défaut de la classe parente, qui n'existe pas.
    // Cela génère une erreur de compilation car
    // aucun constructeur par défaut n'est disponible dans la classe parente.
//la solution soit declarer un constructeur sans parametre dans la classe parente ou
    //déclarer explicitement dans la classe enfant

    public Moto(int nbPassager ,int nbRoues){
        super(nbPassager);
        this.nbRoues=nbRoues;
    }
}

class Avion extends Vehicule{
    private int nbMoteur;
    public Avion(int nbP){
        super(nbP);
    }
    public Avion(int nbP,int nbM){
        super(nbP);
        this.nbMoteur=nbM;
    }
}

class Triporteur extends Moto{
    private int nbRoue = 4;
    public Triporteur(int nbRoues,int nbRoue){
        super(nbRoues,nbRoue);
        this.nbRoue=nbRoue;
    }
}

