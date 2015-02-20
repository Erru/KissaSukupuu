
package graafinenKayttoliittyma;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JTextArea;
import kissasukupuu.kissasukupuu.Kissa;
import kissasukupuu.kissasukupuu.Kissat;

/**
 *Lisää jo olemassa olevalle kissalle tietoja.
 * @author Erja
 */
public class LisaaTieto implements ActionListener{
    
    JTextArea nimi;
    JTextArea isa;
    JTextArea emo;
    JTextArea rotu;
    JTextArea vari;
    JTextArea sukupuoli;
    Kissat kissat;
    ArrayList<Kissa> lista;
    
    public LisaaTieto(JTextArea nimi, JTextArea isa, JTextArea emo, JTextArea rotu,
            JTextArea vari, JTextArea sukupuoli, Kissat kissat){
        
        this.nimi = nimi;
        this.isa = isa;
        this.emo = emo;
        this.rotu = rotu;
        this.vari = vari;
        this.sukupuoli = sukupuoli;
        this.kissat = kissat;
        this.lista = this.kissat.getKissat();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        Kissa kisu = this.kissaOnJoOlemassa(this.nimi.getText());
        
        if(kisu == null){
            this.nimi.setText("Kissaa ei ole olemassa");
            this.isa.setText("");
            this.emo.setText("");
            this.rotu.setText("");
            this.vari.setText("");
            this.sukupuoli.setText("");
        } else {
            if(this.annettuIsa() == true){
                if(this.kissaOnJoOlemassa(this.isa.getText()) == null){
                    kisu.lisaaIsaNimella(this.isa.getText());
                    this.lista.add(kisu.getIsa());
                } else {
                    kisu.lisaaIsa(this.kissaOnJoOlemassa(this.isa.getText()));
                }
            }
            
            if(this.annettuEmo() == true){
                if(this.kissaOnJoOlemassa(this.emo.getText()) == null){
                    kisu.lisaaEmoNimella(this.emo.getText());
                    this.lista.add(kisu.getEmo());
                } else {
                    kisu.lisaaEmo(this.kissaOnJoOlemassa(this.emo.getText()));
                }
            }
            
            if(this.annettuRotu() == true){
                kisu.lisaaRotu(this.rotu.getText());
            }
            
            if(this.annettuVari() == true){
                kisu.lisaaVari(this.vari.getText());
            }
            
            if(this.annettuSukupuoli() == true){
                kisu.lisaaSukupuoli(this.sukupuoli.getText());
            }
            
            this.tyhjenna();
        }
    }
    
    private Kissa kissaOnJoOlemassa(String nimi){
        for(Kissa kisu : this.lista){
            if (kisu.getNimi().equals(nimi)){
                return kisu;
        }
    }
        return null;
    }
    
    private boolean annettuIsa(){
        return !this.isa.getText().equals("");
    }
    
    private boolean annettuEmo(){
        return !this.emo.getText().equals("");
    }
    
    private boolean annettuRotu(){
        return !this.rotu.getText().equals("");
    }
    
    private boolean annettuVari(){
        return !this.vari.getText().equals("");
    }
    
    private boolean annettuSukupuoli(){
        return !this.vari.getText().equals("");
    }
    
    private void tyhjenna(){
        this.nimi.setText("");
        this.isa.setText("");
        this.emo.setText("");
        this.rotu.setText("");
        this.vari.setText("");
        this.sukupuoli.setText("");
    }
    
}
