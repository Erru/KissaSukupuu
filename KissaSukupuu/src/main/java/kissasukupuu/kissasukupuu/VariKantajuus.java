
package kissasukupuu.kissasukupuu;

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
    Boolean diluutio;
    Boolean kuviottomuus;
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
    
    public void kantaakoDiluutiota(){
        if(kPohjavari.contains("d") || kPohjavari.contains("e") || kPohjavari.contains("g")){
            this.diluutio = true;
        } else if (iPohjavari.contains("d") || iPohjavari.contains("e")){
           this.diluutio = true;
        } else if (ePohjavari.contains("d") || ePohjavari.contains("e") || ePohjavari.contains("g")){
            this.diluutio = true;
        } else {
            this.diluutio = false;
        }
    }
    
    public void kantaakoKuviottomuutta(){
        if(kKuvio.equals("kuvioton")||iKuvio.equals("kuvioton")||eKuvio.equals("kuvioton")){
            this.kuviottomuus = true;
        } else {
            this.kuviottomuus = false;
        }
    }
    
    public void kantaakoKlassistaTabbyKuviota(){
        if(kKuvio.contains("22")||iKuvio.contains("22")||eKuvio.contains("22")){
            this.tabbykuvio = true;
        } else {
            this.tabbykuvio = false;
        }
    }
    
    
    
    public boolean kantaaDiluutiota(){
        return this.diluutio;
    }
    
    public boolean kantaaKuviottomuutta(){
        return this.kuviottomuus;
    }
    
    public boolean kantaaTabbya(){
        return this.tabbykuvio;
    }
    
}
