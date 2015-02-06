
package kissasukupuu.kissasukupuu;

import java.util.ArrayList;

/**
 * Laskee sukupuusta kissan tai testiastutuksen sukukatokertoimen yhdistelmän
 * arviointia varten. 0.9-1 on tavoiteltava tilanne.
 */

public class SukukatoLaskuri {
    ArrayList<Kissa> kissat;
    ArrayList<String> nimet;
    double sukukatokerroin;
    
    public SukukatoLaskuri(){
        //tyhjä, jotta samaa laskuria voidaan käyttää eri sukupuissa
    }
    
    /**
     * Ottaa vastaan kissalistan ja poimii siltä uniikit kissat nimen perusteella.
     * 
     * @param lista sukutaulussa esiintyvistä kissoista
     */
    public void uniikitNimet(ArrayList<Kissa> lista){
        this.kissat = lista;
         this.nimet= new ArrayList<>();
        
        for(Kissa kissa : this.kissat){
            String nimi = kissa.getNimi();
            if(!nimet.contains(nimi)){
                nimet.add(nimi);
            }
        }
    }
    
    public void laskeSukukatokerroin(){
        double uniikit = this.nimet.size();
        double kaikki = this.kissat.size();
        this.sukukatokerroin = uniikit / kaikki;
    }
    
    public double getSukukatokerroin(){
        return this.sukukatokerroin;
    }
    
    public ArrayList<String> getUniikitNimet(){
        return this.nimet;
    }
    
    
    
    
}
