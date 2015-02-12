
package kissasukupuu.kissasukupuu;

import static java.rmi.Naming.list;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Iterator;

/**
 *Luokka hoitaa kissojen säilyttämisen listan muodossa, jotta niitä voidaan hakea
 * nimellä eri yhteyksissä.
 */
public class Kissat {
    ArrayList<Kissa> kaikki;
    
    public Kissat(){
        this.kaikki = new ArrayList();
    }
    
    public void lisaaKissa(Kissa kissa){
        this.kaikki.add(kissa);
    }
    
    public ArrayList<Kissa> getKissat(){
        return this.kaikki;
    }
    
    public void poistaKissa(Kissa kissa){
        ArrayList<Kissa> poistettava = new ArrayList<>();
        
        for(Kissa kisu : kaikki){
            if(kisu.getNimi().equals(kissa.getNimi())){
                poistettava.add(kisu);
            }
        }
        
        kaikki.removeAll(poistettava);
    }
    

    
}
