
package graafinenKayttoliittyma;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JTextArea;
import kissasukupuu.kissasukupuu.Kissa;
import kissasukupuu.kissasukupuu.Kissat;

/**
 *Ottaa käyttäjän lisäämät tiedot ja luo niiden pohjalta uuden kissan kissalistaan.
 * @author Erja
 */
public class LisaaKissa implements ActionListener{

    JTextArea nimi;
    JTextArea isa;
    JTextArea emo;
    JTextArea rotu;
    JTextArea vari;
    JTextArea sukupuoli;
    Kissat kissat;
    ArrayList<Kissa> lista;
    
    public LisaaKissa(JTextArea nimi, JTextArea isa, JTextArea emo, JTextArea rotu,
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
        
        if(this.kissaOnJoOlemassa() == true){
            this.nimi.setText("Kissa tällä nimellä on jo olemassa");
            this.isa.setText("");
            this.emo.setText("");
            this.rotu.setText("");
            this.vari.setText("");
            this.sukupuoli.setText("");
            
        } else {
            this.lisaaKissa();
            this.nimi.setText("");
            this.isa.setText("");
            this.emo.setText("");
            this.rotu.setText("");
            this.vari.setText("");
            this.sukupuoli.setText("");
        }
        
    }
    
    /**
     * Tarkistaa, ettei annetun nimistä kissaa ole jo olemassa.
     * @return 
     */
    
    public boolean kissaOnJoOlemassa(){
        for(Kissa kisu : this.lista){
            if (kisu.getNimi().equals(this.nimi.getText())){
                return true;
        }
    }
        return false;
    }
    
    /**
     * Lisää kissan ohjelman kissalistaan, jos kissaa ei ole ennestään.
     */
    
    public void lisaaKissa(){
        if(this.kissaOnJoOlemassa() == false){
            Kissa uusi = new Kissa(this.nimi.getText());
            uusi.lisaaRotu(this.rotu.getText());
            uusi.lisaaVari(this.vari.getText());
            uusi.lisaaSukupuoli(this.sukupuoli.getText());
            
            if(this.isaOnJoOlemassa() == false){
                uusi.lisaaIsaNimella(this.isa.getText());
            } else {
                for(Kissa kisu : this.lista){
                    if(kisu.getNimi().equals(this.isa.getText())){
                        uusi.lisaaIsa(kisu);
                    }
                }
            }
            
            if(this.emoOnJoOlemassa() == false){
                uusi.lisaaEmoNimella(this.emo.getText());
            } else {
                for(Kissa kisu : this.lista){
                    if(kisu.getNimi().equals(this.emo.getText())){
                        uusi.lisaaEmo(kisu);
                    }
                }
            }
            this.lista.add(uusi);
        }
        
    }
    
    public boolean isaOnJoOlemassa(){
        for(Kissa kisu : this.lista){
                if(kisu.getNimi().equals(this.isa.getText())){
                    return true;
                }
            }
        return false;
    }
    
    public boolean emoOnJoOlemassa(){
        for(Kissa kisu : this.lista){
            if(kisu.getNimi().equals(this.emo.getText())){
                return true;
            }
        }
        return false;
    }
}
