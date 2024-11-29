public class Ville
{
 private int  nbrHabits;
 private String nomDeVille;

    public int getNbrHabits() {
        return nbrHabits;
    }

    public void setNbrHabits(int nbrHabits) {
        this.nbrHabits = nbrHabits;
    }

    public String getNomDeVille() {
        return nomDeVille;
    }

    public void setNomDeVille(String nomDeVille) {
        this.nomDeVille = nomDeVille;
    }


    public String toString()
    {
        return  "Ville : " + this.getNomDeVille() + "| Nombre d'habitans : " + ( (this.getNbrHabits() != 0) ? this.getNbrHabits() : "Non Indique" )  ;
    }


    public Ville( String nomDeVille,int nbrHabits){
            this.nomDeVille=nomDeVille;
            this.nbrHabits=nbrHabits;
    }
    public Ville( String nomDeVille){
        this.nomDeVille=nomDeVille;
        this.nbrHabits=0;
    }

    public Ville( ){

    }

}


