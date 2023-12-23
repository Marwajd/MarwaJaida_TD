package MarwaJaida.Td2;

public class Temps {
    private int heures;
    private int minutes;
    private int secondes;

    public Temps() {
    }

    public Temps(int heures) {
        this.heures = heures;
    }

    public Temps(int heures, int minutes) {
        this.heures = heures;
        this.minutes = minutes;
    }

    public Temps(int heures, int minutes, int secondes) {
        this.heures = heures;
        this.minutes = minutes;
        this.secondes = secondes;
    }

    public int getHeures() {
        return heures;
    }

    public void setHeures(int heures) {
        this.heures = heures;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSecondes() {
        return secondes;
    }

    public void setSecondes(int secondes) {
        this.secondes = secondes;
    }
    public Temps(Temps t){
        this.heures=t.getHeures();
        this.minutes=t.getMinutes();
        this.secondes=t.getSecondes();
    }

    @Override
    public String toString() {
        return "Temps{" +
                "" + heures +
                " : " + minutes +
                " :" + secondes +
                '}';
    }

    public void ajouterheures(int heures){

        this.heures=(this.heures+heures)%24;
    }
    public void ajouterminutes(int minutes){
        int totalminutes =this.heures * 60 + this.minutes+minutes;
        this.heures= (totalminutes / 60) %24;
        this.minutes= totalminutes % 60;
    }
    public void ajoutersecondes(int secondes){
        int totalsecondes = this.heures*3600 + this.minutes * 60 + this.secondes+secondes;
        this.heures=(totalsecondes / 3600) % 24;
        this.minutes=(totalsecondes / 60) % 60;
        this.secondes= ( totalsecondes % 60 ) ;
    }
    public static void main(String[]args){
        Temps T1=new Temps();
        Temps T2=new Temps(17);
        Temps T3=new Temps(17,30);
        Temps T4=new Temps(17,30,40);
        System.out.println("le temps avant l'addition:"+T4.toString());
        T4.ajouterheures(2);
        T4.ajouterminutes(40);
        T4.ajoutersecondes(40);
        System.out.println("le temps aprés l'addition:"+T4.toString());
    }

}
