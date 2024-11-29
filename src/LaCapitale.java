import java.util.ArrayList;

public class LaCapitale extends Ville {
    public String nomDuPays;
    public Ville ville;

    ArrayList<LaCapitale> listlaCapitale = new ArrayList<LaCapitale>();
    ArrayList<Ville> lstVilles = new ArrayList<Ville>();
    public String getNomDuPays() {
        return nomDuPays;
    }

    public void setNomDuPays(String nomDuPays) {
        this.nomDuPays = nomDuPays;
    }

    public Ville getVille() {
        return ville;
    }

    public void setVille(Ville ville) {
        this.ville = ville;
    }




    public LaCapitale(String nomDuPays, Ville ville) {
        this.nomDuPays = nomDuPays;
        this.ville = ville;

    }

    public LaCapitale( ) {


    }



    public String toString()
    {
        return  "Capitale de  " + this.getNomDuPays()  + " : " +  ville.toString() ;
    }



   ;
   private void affichecapitals(){
       for (LaCapitale l : listlaCapitale) {
           System.out.println(l);
       }
    }

    public void MainLaCapitale() {


        listlaCapitale.add(new LaCapitale("Tunisie",new Ville("Tunis",12460000)));
        listlaCapitale.add(new LaCapitale("Algerie",new Ville("Alger",45610000)));
        listlaCapitale.add(new LaCapitale("Maroc",new Ville("Rabat",37840000)));

        affichecapitals();

    }

}
