
package kissasukupuu.kissasukupuu;

import java.util.ArrayList;

/**
 * Laskee sukupuusta kissan tai testiastutuksen sukukatokertoimen yhdistelmän
 * arviointia varten. 0.9-1 on tavoiteltava tilanne.
 */

public class SukukatoLaskuri {
    ArrayList<String> kissat;
    ArrayList<String> uniikitNimet;
    int puuttuvat;
    double sukukatokerroin;
    
    public SukukatoLaskuri(){
        //tyhjä, jotta samaa laskuria voidaan käyttää eri sukupuissa
    }
    
    /**
     * Ottaa vastaan kissalistan ja poimii siltä uniikit kissat nimen perusteella.
     * 
     * @param lista sukutaulussa esiintyvistä kissoista
     */
    public void uniikitNimet(ArrayList<String> lista){
        this.kissat = lista;
         this.uniikitNimet= new ArrayList<>();
        
        for(String nimi : this.kissat){
            if(!uniikitNimet.contains(nimi) && !nimi.equals("X")){
                uniikitNimet.add(nimi);
            } else if (nimi.equals("X")){
                puuttuvat += 1;
            }
        }
    }
    
    /**
     * Laskee sukukatokertoimen. Asettaa sukukatokertoimeksi nollan, jos taulussa
     * ei ole yhtään kissoja (edes vanhempia kissalle).
     */
    
    public void laskeSukukatokerroin(){
        double uniikit = this.uniikitNimet.size();
        double kaikki = this.kissat.size() - puuttuvat;
        if(kaikki == 0){
            this.sukukatokerroin = 0.0;
        } else {
            this.sukukatokerroin = uniikit / kaikki;
        }
        
    }
    
    public double getSukukatokerroin(ArrayList<String> lista){
        this.uniikitNimet(lista);
        this.laskeSukukatokerroin();
        return this.sukukatokerroin;
    }
    
    public ArrayList<String> getUniikitNimet(){
        return this.uniikitNimet;
    }
    
    /**
     * Palauttaa tiedon siitä kuinka monta kissaa puuttuu täydellisestä sukutaulusta.
     * @return 
     */
    
    public String kerroPuuttuvista(){
        return " <html> tiedossa olevien <br> kissojen mukaan, <br> " + this.puuttuvat 
                + " kissaa puuttuu <br> sukutaulun 30 kissasta </html>";
    }
    
    
    
    
}
