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
    }
    
    public Kissa(String nimi, String isa, String emo){
        this.nimi = nimi;
        this.isa = new Kissa(isa);
        this.emo = new Kissa(emo);
        this.rotu = "X";
        this.vari = new Vari("X");
        this.sukupuoli = "X";
    }
    
    public void lisaaIsa(String nimi){
        this.isa = new Kissa(nimi);
    }
    
    public void lisaaEmo(String nimi){
        this.emo = new Kissa(nimi);
    }
    
    public void lisaaRotu(String rotu){
        this.rotu = rotu;
    }
    
    public void lisaaVari(String vari){
        this.vari = new Vari(vari);
    }
    
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
