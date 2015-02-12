
package kissasukupuu.kissasukupuu;

/**
 * Luokka auttaa määrittämään minkä värisiä pentuja voi tulla käyttäen hyväkseen
 * värikantajuustietoja kissoista. Käytetään testiastutuksen yhteydessä.
 * 
 */

public class PentujenVarit {
    Kissa emo;
    Kissa isa;
    Boolean taysvari;
    Boolean diluutio;
    Boolean kuvioton;
    Boolean kuviollinen;
    Boolean tabby;
    Boolean tiikeri;
    Boolean taplikas;
    Boolean kilpikonna;
    Boolean punainenPoika;
    Boolean punainenTytto;
    Boolean valkolaikku;
    VariKantajuus emon;
    VariKantajuus isan;
    
    
    public PentujenVarit(Kissa emo, Kissa isa){
        this.emo = emo;
        this.isa = isa;
        emon = new VariKantajuus(emo);
        isan = new VariKantajuus(isa);
    }
    
    /**
     * Hakee kantaako emo tai isä kuviollisuutta ja määrittää tämän perusteella
     * voiko pennuista tulla kuviollisia asettaen totuusarvon.
     */
    
    public void voiTullaKuviollisia(){
        if(emon.kantaaKuviollisuutta() == true || isan.kantaaKuviollisuutta() == true){
            this.kuviollinen = true;
        } else {
            this.kuviollinen = false;
        }
    }
    
    /**
     * Hakee kantaako emo tai isä kuviollisuutta ja määrittää tämän perusteella
     * voiko pennuista tulla kuviottomia.
     */
    
    public void voiTullaKuviottomia(){
        if(emon.kantaaKuviottomuutta() == true && isan.kantaaKuviottomuutta() == true){
            this.kuvioton = true;
        } else {
            this.kuvioton = false;
        }
    }
    
    /**
     * Hakee kantaako emo tai isä diluutiota ja määrittää tämän perusteella voiko
     * pennuista tulla diluutiovärisiä.
     */
    
    public void voiTullaDiluutiota(){
        if(emon.kantaaDiluutiota() == true && isan.kantaaDiluutiota() == true){
            this.diluutio = true;
        } else {
            this.diluutio = false;
        }
    }
    
    /**
     * Hakee kantaako emo tai isä täysväriä (diluution vastakohta) ja määrittää
     * tämän perusteella voiko pennuista tulla täysvärisiä.
     */
    
    public void voiTullaTaysvarisia(){
        if(emon.kantaaTaysvaria() == true || isan.kantaaTaysvaria() == true){
            this.taysvari = true;
        } else {
            this.taysvari = false;
        }
    }
    
    /**
     * Hakee kantaako emo tai isä klassista tabby -kuviota ja määrittää tämän
     * perusteella voiko pennuista tulla tabby-kuvioisia.
     */
    
    public void voiTullaKlassistaTabbya(){
        if(emon.kantaaTabbya() == true && isan.kantaaTabbya()){
            this.tabby = true;
        } else {
            this.tabby = false;
        }
    }
    
    public boolean kuviollisia(){
        this.voiTullaKuviollisia();
        return this.kuviollinen;
    }
    
    public boolean kuviottomia(){
        this.voiTullaKuviottomia();
        return this.kuvioton;
    }
    
    public boolean diluutioita(){
        this.voiTullaDiluutiota();
        return this.diluutio;
    }
    
    public boolean taysvari(){
        this.voiTullaTaysvarisia();
        return this.taysvari;
    }
    
    public boolean klassinenTabby(){
        this.voiTullaKlassistaTabbya();
        return this.tabby;
    }
}
