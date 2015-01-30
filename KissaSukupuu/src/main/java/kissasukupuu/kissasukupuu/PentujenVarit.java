
package kissasukupuu.kissasukupuu;


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
    
    public void voiTullaKuviollisia(){
        if(emon.kantaaKuviollisuutta() == true || isan.kantaaKuviollisuutta() == true){
            this.kuviollinen = true;
        } else {
            this.kuviollinen = false;
        }
    }
    
    public void voiTullaKuviottomia(){
        if(emon.kantaaKuviottomuutta() == true && isan.kantaaKuviottomuutta() == true){
            this.kuvioton = true;
        } else {
            this.kuvioton = false;
        }
    }
    
    public void voiTullaDiluutiota(){
        if(emon.kantaaDiluutiota() == true && isan.kantaaDiluutiota() == true){
            this.diluutio = true;
        } else {
            this.diluutio = false;
        }
    }
    
    public void voiTullaTaysvarisia(){
        if(emon.kantaaTaysvaria() == true || isan.kantaaTaysvaria() == true){
            this.taysvari = true;
        } else {
            this.taysvari = false;
        }
    }
    
    public void voiTullaKlassistaTabbya(){
        if(emon.kantaaTabbya() == true && isan.kantaaTabbya()){
            this.tabby = true;
        } else {
            this.tabby = false;
        }
    }
}
