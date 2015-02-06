
package kissasukupuu.kissasukupuu;

/**
 * Luokka mitä värejä annettu kissa kantaa käyttäen apumaan dominoivissa väreissä
 * kissaa itseään ja resessiivisten värien kanssa myös kissan vanhempia. Kertoo
 * vain mitä värejä kissa varmasti kantaa (resessiiviset värit voivat tulla
 * monen sukupolven takaa).
 * 
 */

public class VariKantajuus {
    Kissa kantaja;
    Kissa isa;
    Kissa emo;
    Vari kVari;
    Vari iVari;
    Vari eVari;
    String kPohjavari;
    String iPohjavari;
    String ePohjavari;
    String kKuvio;
    String iKuvio;
    String eKuvio;
    Boolean taysvari;
    Boolean diluutio;
    Boolean kuviottomuus;
    Boolean kuviollisuus;
    Boolean tabbykuvio;
    
    public VariKantajuus(Kissa kissa){
        this.kantaja = kissa;
    }
    
    public void haeVanhemmat(){
        isa = kantaja.getIsa();
        emo = kantaja.getEmo();
    }
    
    public void haeVarit(){
        this.kVari = kantaja.getVari();
        this.iVari = isa.getVari();
        this.eVari = emo.getVari();
    }
    
    public void erotteleKuvioJaVari(){
        kPohjavari = kVari.getPohjavari();
        kKuvio = kVari.getKuvio();
        
        iPohjavari = iVari.getPohjavari();
        iKuvio = iVari.getKuvio();
        
        ePohjavari = eVari.getPohjavari();
        eKuvio = eVari.getKuvio();
    }
    
    public void kantaakoTaysvaria(){
        this.haeVanhemmat();
        this.haeVarit();
        this.erotteleKuvioJaVari();
        if(kPohjavari.contains("n") || kPohjavari.contains("d") || kPohjavari.contains("f")){
            this.taysvari = true;
        } else {
            this.taysvari = false;
        }
    }
    
    public void kantaakoDiluutiota(){
        this.haeVanhemmat();
        this.haeVarit();
        this.erotteleKuvioJaVari();
        if(kPohjavari.contains("a") || kPohjavari.contains("e") || kPohjavari.contains("g")){
            this.diluutio = true;
        } else if (iPohjavari.contains("a") || iPohjavari.contains("e")){
           this.diluutio = true;
        } else if (ePohjavari.contains("a") || ePohjavari.contains("e") || ePohjavari.contains("g")){
            this.diluutio = true;
        } else {
            this.diluutio = false;
        }
    }
    
    public void kantaakoKuviottomuutta(){
        this.haeVanhemmat();
        this.haeVarit();
        this.erotteleKuvioJaVari();
        if(kKuvio.equals("kuvioton")||iKuvio.equals("kuvioton")||eKuvio.equals("kuvioton")){
            this.kuviottomuus = true;
        } else {
            this.kuviottomuus = false;
        }
    }
    
    public void kantaakoKuviollisuutta(){
        this.haeVanhemmat();
        this.haeVarit();
        this.erotteleKuvioJaVari();
        if(!kKuvio.equals("kuvioton")){
            this.kuviollisuus = true;
        } else {
            this.kuviollisuus = false;
        }
    }
    
    public void kantaakoKlassistaTabbyKuviota(){
        this.haeVanhemmat();
        this.haeVarit();
        this.erotteleKuvioJaVari();
        if(kKuvio.contains("22")||iKuvio.contains("22")||eKuvio.contains("22")){
            this.tabbykuvio = true;
        } else {
            this.tabbykuvio = false;
        }
    }
    
    public boolean kantaaTaysvaria(){
        this.kantaakoTaysvaria();
        return this.taysvari;
    }
    
    public boolean kantaaDiluutiota(){
        this.kantaakoDiluutiota();
        return this.diluutio;
    }
    
    public boolean kantaaKuviottomuutta(){
        this.kantaakoKuviottomuutta();
        return this.kuviottomuus;
    }
    
    public boolean kantaaKuviollisuutta(){
        this.kantaakoKuviollisuutta();
        return this.kuviollisuus;
    }
    
    public boolean kantaaTabbya(){
        this.kantaakoKlassistaTabbyKuviota();;
        return this.tabbykuvio;
    }
    
    
    
}
