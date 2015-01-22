
package kissasukupuu.kissasukupuu;

public class Vari {
    String vari;
    
    public Vari(String vari){
        this.vari = vari;
    }
    
    public String getPohjavari(){
        if(!vari.equals("X")){
            String[] parts = vari.split(" ");
            String pohjavari = parts[0];
        
            return pohjavari;
        } else {
            return "X";
        }
    }
    
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
