package kissasukupuu.kissasukupuu;

/**
 * Luokka tallettaa kissalle nimen, vanhemmat, varin, rodun ja sukupuolen,
 * jotta ne voidaan näyttää sukutaulussa ja värien kantajuudet voidaan määrittää
 * pentujen värien ennustamiseksi.
 */

public class Kissa {
    Kissa isa;
    Kissa emo;
    String nimi;
    String rotu;
    Vari vari;
    String sukupuoli;
    
    public Kissa(String nimi){
        this.nimi = nimi;
        this.rotu = "X";
        this.vari = new Vari("X");
        this.sukupuoli = "X";
        this.isa = null;
        this.emo = null;
    }
    
    /**
     * Vaihtoehtoinen tapa luoda kissa, jos sen vanhemmat halutaan lisätä kissan
     * kanssa samaan aikaan.
     * @param nimi
     * @param isa
     * @param emo 
     */
    
    public Kissa(String nimi, String isa, String emo){
        this.nimi = nimi;
        this.isa = new Kissa(isa);
        this.emo = new Kissa(emo);
        this.rotu = "X";
        this.vari = new Vari("X");
        this.sukupuoli = "X";
    }
    
    /**
     * Asettaa kissalle isän, joka saa annetun nimen.
     * @param nimi 
     */
    
    public void lisaaIsaNimella(String nimi){
        this.isa = new Kissa(nimi);
    }
    
    /**
     * Asettaa kissalle jo olemassa olevan isän.
     * @param kissa 
     */
    
    public void lisaaIsa(Kissa kissa){
        this.isa = kissa;
    }
    
    /**
     * Asettaa kissalle emon, joka saa annetun nimen.
     * @param nimi 
     */
    
    public void lisaaEmoNimella(String nimi){
        this.emo = new Kissa(nimi);
    }
    
    /**
     * Asettaa kissalle jo olemassa olevan emon.
     * @param kissa 
     */
    
    public void lisaaEmo(Kissa kissa){
        this.emo = kissa;
    }
    
    /**
     * Lisää kissalle annetun rodun.
     * @param rotu 
     */
    
    public void lisaaRotu(String rotu){
        this.rotu = rotu;
    }
    
    /**
     * Lisää kissalle annetun värin.
     * @param vari 
     */
    
    public void lisaaVari(String vari){
        this.vari = new Vari(vari);
    }
    
    /**
     * Lisää kissalle annetun sukupuolen kertovan stringin.
     * @param sukupuoli 
     */
    
    public void lisaaSukupuoli(String sukupuoli){
        this.sukupuoli = sukupuoli;
    }
    
    public String getNimi(){
        return this.nimi;
    }
    
    public Kissa getIsa(){
        return this.isa;
    }
    
    public Kissa getEmo(){
        return this.emo;
    }
    
    public String getRotu(){
        return this.rotu;
    }
    
    public Vari getVari(){
        return this.vari;
    }
    
    public String getSukupuoli(){
        return this.sukupuoli;
    }
    
    
    
    
    
}
