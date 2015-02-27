
package kissasukupuu.kissasukupuu;

/**
 * Osaa erotella EMS koodin mukaisesti annetusta väristä pohjavärin ja kuvion.
 * Käytetään hyväksi värikantajuuksien selvittämiseksi ja testiastutuksen
 * pentujen värien ennustamiseksi.
 */

public class Vari {
    String vari;
    
    public Vari(String vari){
        this.vari = vari;
    }
    /**
     * Pilkkoo kaksiosaisen värin pohjaväriin ja kuvioon ja palauttaa pohjavärin.
     * Mikäli väriä ei ole asetettu, palauttaa määrittelemättömän värin eli "X".
     * 
     * @return pohjaväri eroteltuna kokonaisväristä
     */
    public String getPohjavari(){
        if(!vari.equals("X")){
            String[] parts = vari.split(" ");
            String pohjavari = parts[0];
        
            return pohjavari;
        } else {
            return "X";
        }
    }
    
    /**
     * Pilkkoo kissan värin pohjaväriin ja kuvioon, jos väri on tarpeeksi pitkä
     * sisältääkseen kuvion ja palauttaa kuvion tai tiedon kuviottomuudesta.
     * @return 
     */
    
    public String getKuvio(){
        if(!vari.equals("X")){
            
            if(vari.length() <= 2){
                return "kuvioton";
            } else {
                String[] parts = vari.split(" ");
                String kuvio = parts[1];
                
                if(kuvio.contains("2")){
                    return kuvio;
                } else {
                    return "kuvioton"; 
            }
            }
                
        } else {
            return "X";
        }
        
    }
    
    public String getVari(){
        return this.vari;
    }
}
