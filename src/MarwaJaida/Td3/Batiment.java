package MarwaJaida.Td3;

public class Batiment{

    private String adress;

    public Batiment(){
    }
    public Batiment(String adress){

        this.adress=adress;
    }
    public  String getAdress(){

        return adress;
    }

    public void setAdress(String adress){

        this.adress=adress;
    }

    public String toString(){

        return "L'adresse du Batiment est : "+ adress ;
    }
}
     class Maison extends Batiment {
         private int nbrchambre;

         public Maison() {
         }

         public Maison(int nbrchambre, String adress) {
             super(adress);
             this.nbrchambre = nbrchambre;

         }

         public int getNbrchamre() {
             return nbrchambre;
         }

         public void setNbrchambre(int nbrchambre) {
             this.nbrchambre = nbrchambre;
         }

         public String toString() {
             return " la maison se trouve à:" + getAdress() + " et il contient "
                     + getNbrchamre() + " chambres ";

         }
     }
    class Imeuble extends Batiment{
           private int nbAppart;

           public Imeuble(){}

        public Imeuble(String adress,int nbAppart){
               super(adress);
               this.nbAppart=nbAppart;
        }

        public int getNbAppart(){
               return nbAppart;
        }
        public void setNbAppart(int nbAppart){
               this.nbAppart=nbAppart;
        }
        public String toString(){
               return "l'immeuble se trouve à : " + getAdress() + " et il contient : "
                       + getNbAppart() +" appaertement ";
        }

        }

    class testBatiment{
    public static void main(String[]args){
        //Test de la class Batiment
        Batiment B1=new Batiment ("cartier Bourgonne ");
        System.out.println(B1);
        //Test de la class Maison
       Maison m1= new Maison(4,"Boulvard hay hassani");
        System.out.println(m1);
        //Test de la class Immeble
       Imeuble i1= new Imeuble("Boulvard hay hassani",25);
        System.out.println(i1);
   }
        }

