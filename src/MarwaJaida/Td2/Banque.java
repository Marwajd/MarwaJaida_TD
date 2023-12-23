package MarwaJaida.Td2;

public class Banque {
    private int Ncompte;
    private float solde;
    private String Cin;

    public Banque(int ncompte, float solde, String cin) {
        Ncompte = ncompte;
        this.solde = solde;
        Cin = cin;
    }

    public int getNcompte() {
        return Ncompte;
    }

    public void setNcompte(int ncompte) {
        Ncompte = ncompte;
    }

    public float getSolde() {
        return solde;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }

    public String getCin() {
        return Cin;
    }

    public void setCin(String cin) {
        Cin = cin;
    }

    public void deposer(float somme){
        solde+=somme;
    }
    public void retirer(float somme){
        solde-=somme;
    }
    public float avoirsolde(){
        return solde;
    }

    public String avoirinf(){
        return "Banque{" +
                "Ncompte=" + Ncompte +
                ", solde=" + solde +
                ", Cin='" + Cin + '\'' +
                '}';
    }
    public static void main(String[]args){
        Banque B=new Banque(1500075,0,"AB 1200");
        System.out.println(B.avoirinf());


        B.deposer(500);
        System.out.println(B.avoirinf());
        B.retirer(200);
        System.out.println(B.avoirinf());
        System.out.println( B.avoirsolde());
    }
}
