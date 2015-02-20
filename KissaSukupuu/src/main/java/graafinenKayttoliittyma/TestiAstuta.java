
package graafinenKayttoliittyma;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JTextArea;
import kissasukupuu.kissasukupuu.Kissa;
import kissasukupuu.kissasukupuu.Kissat;

/**
 *Luokka ottaa käyttäjän antamat kissan nimet ja testiastuttaa kissat, jos ne 
 * ovat molemmat olemassa. Testiastutus sisältää sekä pentujen värien ennustamisen
 * että sukukatokertoimen laskemisen parille tunnettujen kissojen perusteella.
 * @author Erja
 */
public class TestiAstuta implements ActionListener{

    JTextArea isa;
    JTextArea emo;
    JButton pennut;
    JButton isa1;
    JButton emo1;
    JButton isa2_1;
    JButton emo2_1;
    JButton isa2_2;
    JButton emo2_2;
    JButton isa3_1;
    JButton emo3_1;
    JButton isa3_2;
    JButton emo3_2;
    JButton isa3_3;
    JButton emo3_3;
    JButton isa3_4;
    JButton emo3_4;
    JButton isa4_1;
    JButton emo4_1;
    JButton isa4_2;
    JButton emo4_2;
    JButton isa4_3;
    JButton emo4_3;
    JButton isa4_4;
    JButton emo4_4;
    JButton isa4_5;
    JButton emo4_5;
    JButton isa4_6;
    JButton emo4_6;
    JButton isa4_7;
    JButton emo4_7;
    JButton isa4_8;
    JButton emo4_8;
    Kissat kissat;
    ArrayList<Kissa> lista;
    Kissa iska;
    Kissa aiti;
    
    
    public TestiAstuta(JTextArea isukki, JTextArea mamma, JButton pennut, JButton isa1, 
                    JButton emo1, JButton isa2_1, JButton emo2_1, JButton isa2_2,
                    JButton emo2_2, JButton isa3_1, JButton emo3_1, JButton isa3_2,
                    JButton emo3_2, JButton isa3_3, JButton emo3_3, JButton isa3_4,
                    JButton emo3_4, JButton isa4_1, JButton emo4_1, JButton isa4_2, 
                    JButton emo4_2, JButton isa4_3, JButton emo4_3, JButton isa4_4, 
                    JButton emo4_4, JButton isa4_5, JButton emo4_5, JButton isa4_6, 
                    JButton emo4_6, JButton isa4_7, JButton emo4_7, JButton isa4_8, 
                    JButton emo4_8, Kissat kissat){
        
        this.isa = isukki;
        this.emo = mamma;
        this.pennut = pennut;
        this.isa1 = isa1;
        this.emo1 = emo1;
        this.isa2_1 = isa2_1;
        this.emo2_1 = emo2_1;
        this.isa2_2 = isa2_2;
        this.emo2_2 = emo2_2;
        this.isa3_1 = isa3_1;
        this.emo3_1 = emo3_1;
        this.isa3_2 = isa3_2;
        this.emo3_2 = emo3_2;
        this.isa3_3 = isa3_3;
        this.emo3_3 = emo3_3;
        this.isa3_4 = isa3_4;
        this.emo3_4 = emo3_4;
        this.isa4_1 = isa4_1;
        this.emo4_1 = emo4_1;
        this.isa4_2 = isa4_2;
        this.emo4_2 = emo4_2;
        this.isa4_3 = isa4_3;
        this.emo4_3 = emo4_3;
        this.isa4_4 = isa4_4;
        this.emo4_4 = emo4_4;
        this.isa4_5 = isa4_5;
        this.emo4_5 = emo4_5;
        this.isa4_6 = isa4_6;
        this.emo4_6 = emo4_6;
        this.isa4_7 = isa4_7;
        this.emo4_7 = emo4_7;
        this.isa4_8 = isa4_8;
        this.emo4_8 = emo4_8;
        this.kissat = kissat;
        this.lista = kissat.getKissat();
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        this.iska = kissaListalla(this.isa.getText());
        this.aiti = kissaListalla(this.emo.getText());
        
        this.aloitus();
        
        if(iska == null && aiti == null){
            this.pennut.setText("<html> Annettuja vanhempia <br> ei ole olemassa </html>");
        } else if (iska == null){
            this.pennut.setText("<html> Annettua isaa <br> ei ole olemassa </html>");
        } else if (aiti == null){
            this.pennut.setText("<html> Annettua emoa <br> ei ole olemassa </html>");
        } else {
            this.asetaKissat();
            this.asetaIsanVanhemmat();
            this.asetaEmonVanhemmat();
            this.aseta3Polvi();
            this.aseta4Polvi();
            //kutsuu metodia joka ennustaa pentujen värit
            //kutsuu metodia, joka laskee sukukatokertoimen ja asettaa sen
        }
        
        
    }
    
    public Kissa kissaListalla(String nimi){
        for (Kissa kisu : this.lista){
            if(kisu.getNimi().equals(nimi)){
                return kisu;
            }
        }
        
        return null;
    }
    
    public void aloitus(){
        this.pennut.setText("X");
        this.isa1.setText("X");
        this.emo1.setText("X");
        this.isa2_1.setText("X");
        this.emo2_1.setText("X");
        this.isa2_2.setText("X");
        this.emo2_2.setText("X");
        this.isa3_1.setText("X");
        this.emo3_1.setText("X");
        this.isa3_2.setText("X");
        this.emo3_2.setText("X");
        this.isa3_3.setText("X");
        this.emo3_3.setText("X");
        this.isa3_4.setText("X");
        this.emo3_4.setText("X");
        this.isa4_1.setText("X");
        this.emo4_1.setText("X");
        this.isa4_2.setText("X");
        this.emo4_2.setText("X");
        this.isa4_3.setText("X");
        this.emo4_3.setText("X");
        this.isa4_4.setText("X");
        this.emo4_4.setText("X");
        this.isa4_5.setText("X");
        this.emo4_5.setText("X");
        this.isa4_6.setText("X");
        this.emo4_6.setText("X");
        this.isa4_7.setText("X");
        this.emo4_7.setText("X");
        this.isa4_8.setText("X");
        this.emo4_8.setText("X");
    }
    
    public void asetaKissat(){
        this.pennut.setText("pennut");
        this.asetaVanhemmat(this.isa1, this.emo1, this.iska, this.aiti);
    }
    
    public void asetaVanhemmat(JButton far, JButton mor,Kissa isukki, Kissa mamma){
        far.setText("<html>" + isukki.getNimi() + "<br>" + isukki.getSukupuoli() 
                + ", " + isukki.getRotu() + " " + isukki.getVari().getVari() + "</html>");
        mor.setText("<html>" + mamma.getNimi() + "<br>" + mamma.getSukupuoli() 
                + ", " + mamma.getRotu() + " " + mamma.getVari().getVari() + "</html>");
    }
    
    public void asetaEmonVanhemmat(){
        Kissa emonisa = this.aiti.getIsa();
        Kissa emonemo = this.aiti.getEmo();
        
        if(emonisa == null && emonemo == null){
            //ei tehdä mitään, koska vanhempia ei ole ohjelmassa
        } else if (emonisa == null){
            //aseta emonemo
            this.asetaKissa(this.emo2_2, emonemo);
        } else if (emonemo == null){
            //aseta emonisa
            this.asetaKissa(this.isa2_2, emonisa);
        } else {
            this.asetaVanhemmat(this.isa2_2, this.emo2_2, emonisa, emonemo);
        }
    }
    
    public void asetaIsanVanhemmat(){
        Kissa isanisa = this.iska.getIsa();
        Kissa isanemo = this.iska.getEmo();
        
        if(isanisa == null && isanemo == null){
            //ei tehdä mitään
        } else if (isanisa == null){
            //aseta isaemo
            this.asetaKissa(this.emo2_1, isanemo);
        } else if (isanemo == null){
            //aseta isanisa
            this.asetaKissa(this.isa2_1, isanisa);
        } else {
            this.asetaVanhemmat(this.isa2_1, this.emo2_1, isanisa, isanemo);
        }
    }
    
    public void asetaKissa(JButton annettu, Kissa mirri){
        annettu.setText("<html>" + mirri.getNimi() + "<br>" + mirri.getSukupuoli() 
                + ", " + mirri.getRotu() + " " + mirri.getVari().getVari() + "</html>");
    }
    
    public void aseta3Polvi(){
        Kissa i3_1 = this.iska.getIsa().getIsa();
        Kissa e3_1 = this.iska.getIsa().getEmo();
        this.asetaOlemassaOlevat(this.isa3_1, this.emo3_1, i3_1, e3_1);
        
        Kissa i3_2 = this.iska.getEmo().getIsa();
        Kissa e3_2 = this.iska.getEmo().getEmo(); 
        this.asetaOlemassaOlevat(this.isa3_2, this.emo3_2, i3_2, e3_2);
        
        Kissa i3_3 = this.aiti.getIsa().getIsa();
        Kissa e3_3 = this.aiti.getIsa().getEmo();
        this.asetaOlemassaOlevat(this.isa3_3, this.emo3_3, i3_3, e3_3);
        
        Kissa i3_4 = this.aiti.getEmo().getIsa();
        Kissa e3_4 = this.aiti.getEmo().getEmo();
        this.asetaOlemassaOlevat(this.isa3_4, this.emo3_4, i3_4, e3_4);
    }
    
    public void asetaOlemassaOlevat(JButton poikanappi, JButton tyttonappi, Kissa kolli, 
            Kissa naaras){
        
        Kissa kisu1 = kolli;
        Kissa kisu2 = naaras;
        
        if(kisu1 == null && kisu2 == null){
            //ei tehdä mitään
        } else if (kisu1 == null){
            this.asetaKissa(tyttonappi, kisu2);
        } else if (kisu2 == null){
            //aseta isanisa
            this.asetaKissa(poikanappi, kisu1);
        } else {
            this.asetaVanhemmat(poikanappi, tyttonappi, kisu1, kisu2);
        }
    }
    
    
    //ei toimi jostain syystä
    public void aseta4Polvi(){
        Kissa i4_1 = this.iska.getIsa().getIsa().getIsa();
        Kissa e4_1 = this.iska.getIsa().getIsa().getEmo();
        this.asetaOlemassaOlevat(this.isa4_1, this.emo4_1, i4_1, e4_1);
        
        Kissa i4_2 = this.iska.getIsa().getEmo().getIsa();
        Kissa e4_2 = this.iska.getIsa().getEmo().getEmo();
        this.asetaOlemassaOlevat(this.isa4_2, this.emo4_2, i4_2, e4_2);
        
        Kissa i4_3 = this.iska.getEmo().getIsa().getIsa();
        Kissa e4_3 = this.iska.getEmo().getIsa().getEmo();
        this.asetaOlemassaOlevat(this.isa4_3, this.emo4_3, i4_3, e4_3);
    }
    
}
