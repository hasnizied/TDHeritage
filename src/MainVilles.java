import java.util.ArrayList;

public class MainVilles extends Ville{

    Ville v1 = new Ville("Tunis", 60000) ;
    Ville v2 = new Ville("Tabarka", 23000) ;
    Ville v3 = new Ville("Sfax") ;
    Ville v4 = new Ville("Gabes") ;
    Ville v5 = new Ville("Sousse", 32000) ;

    ArrayList<Ville> lstVilles = new ArrayList<Ville>();

    private void AffiucheVille(){
        for (Ville ville : lstVilles) {
            System.out.println(ville);
                    }
        System.out.println("-------------------------------------------");
    }
    public void MainVilles() {
        lstVilles.add(v1);
        lstVilles.add(v2);
        lstVilles.add(v3);
        lstVilles.add(v4);
        lstVilles.add(v5);

        AffiucheVille();
        lstVilles.remove(v2);
        AffiucheVille();
    }







}
