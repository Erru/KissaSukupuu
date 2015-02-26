
package graafinenKayttoliittyma;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import kissasukupuu.kissasukupuu.Kissa;
import kissasukupuu.kissasukupuu.Kissat;
import kissasukupuu.kissasukupuu.SukukatoLaskuri;
import kissasukupuu.kissasukupuu.VariKantajuus;

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
    SukukatoLaskuri laskuri;
    ArrayList<String> nimet;
    JButton sukukato;
    JLabel pentujenVarit;
    
    
    public TestiAstuta(JTextArea isukki, JTextArea mamma, JButton pennut, JButton isa1, 
                    JButton emo1, JButton isa2_1, JButton emo2_1, JButton isa2_2,
                    JButton emo2_2, JButton isa3_1, JButton emo3_1, JButton isa3_2,
                    JButton emo3_2, JButton isa3_3, JButton emo3_3, JButton isa3_4,
                    JButton emo3_4, JButton isa4_1, JButton emo4_1, JButton isa4_2, 
                    JButton emo4_2, JButton isa4_3, JButton emo4_3, JButton isa4_4, 
                    JButton emo4_4, JButton isa4_5, JButton emo4_5, JButton isa4_6, 
                    JButton emo4_6, JButton isa4_7, JButton emo4_7, JButton isa4_8, 
                    JButton emo4_8, Kissat kissat, JButton sukukato, JLabel varikentta){
        
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
        this.laskuri = new SukukatoLaskuri();
        this.nimet = new ArrayList();
        this.sukukato = sukukato;
        this.pentujenVarit = varikentta;
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
            
            this.taytaSukutaulu();
            
            //kutsuu metodia joka ennustaa pentujen värit
            //kutsuu metodia, joka laskee sukukatokertoimen ja asettaa sen
            this.keraaKissat();
            this.sukukato.setText("<html>" + String.valueOf(laskuri.getSukukatokerroin(this.nimet)) + "<br>" + laskuri.kerroPuuttuvista() + "</html>");
        
            this.pentujenVarit.setText(this.pennuilleVarit());
        }
        
        
    }
    
    public void taytaSukutaulu(){
        this.asetaKissat();
            this.asetaIsanVanhemmat();
            this.asetaEmonVanhemmat();
            this.aseta3Polvi();
            this.aseta4Polvi();
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
        
        this.asetaEiNullKissanVanhemmat(this.iska.getIsa(), this.isa3_1, this.emo3_1);
        this.asetaEiNullKissanVanhemmat(this.iska.getEmo(), this.isa3_2, this.emo3_2);
        this.asetaEiNullKissanVanhemmat(this.aiti.getIsa(), this.isa3_3, this.emo3_3);
        this.asetaEiNullKissanVanhemmat(this.aiti.getEmo(), this.isa3_4, this.emo3_4);
        
    }
    
    //tarkistaja metodi, joka vahtii ettei null kissat aiheuta ongelmia
    
    public boolean onkoNull(Kissa kissa){
        if(kissa == null){
            return true;
        } 
        return false;
    }
    
    public void asetaEiNullKissanVanhemmat(Kissa kissa, JButton isa, JButton emo){
        if (this.onkoNull(kissa) == false){
            Kissa isukki = kissa.getIsa();
            Kissa mamma = kissa.getEmo();
            this.asetaOlemassaOlevat(isa, emo, isukki, mamma);
        }
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
        if(this.onkoNull(this.iska.getIsa()) == false){
            this.asetaEiNullKissanVanhemmat(this.iska.getIsa().getIsa(), this.isa4_1, this.emo4_1);
            this.asetaEiNullKissanVanhemmat(this.iska.getIsa().getEmo(), this.isa4_2, this.emo4_2);
        }
        
        if(this.onkoNull(this.iska.getEmo()) == false){
            this.asetaEiNullKissanVanhemmat(iska.getEmo().getIsa(), this.isa4_3, this.emo4_3);
            this.asetaEiNullKissanVanhemmat(iska.getEmo().getEmo(), this.isa4_4, this.emo4_4);
        }
        
        if(this.onkoNull(this.aiti.getIsa()) == false){
            this.asetaEiNullKissanVanhemmat(this.aiti.getIsa().getIsa(), this.isa4_5, this.emo4_5);
            this.asetaEiNullKissanVanhemmat(this.aiti.getIsa().getEmo(), this.isa4_6, this.emo4_6);
        }
        
        if(this.onkoNull(this.aiti.getIsa()) == false){
            this.asetaEiNullKissanVanhemmat(aiti.getEmo().getIsa(), this.isa4_7, this.emo4_7);
            this.asetaEiNullKissanVanhemmat(aiti.getEmo().getEmo(), this.isa4_8, this.emo4_8);
        }
        
    }
    
    private void keraaKissat() {
        
        this.nimet.add(this.isa1.getText());
        this.nimet.add(this.emo1.getText());
        this.nimet.add(this.isa2_1.getText());
        this.nimet.add(this.emo2_1.getText());
        this.nimet.add(this.isa2_2.getText());
        this.nimet.add(this.emo2_2.getText());
        this.nimet.add(this.isa3_1.getText());
        this.nimet.add(this.emo3_1.getText());
        this.nimet.add(this.isa3_2.getText());
        this.nimet.add(this.emo3_2.getText());
        this.nimet.add(this.isa3_3.getText());
        this.nimet.add(this.emo3_3.getText());
        this.nimet.add(this.isa3_4.getText());
        this.nimet.add(this.emo3_4.getText());
        this.nimet.add(this.isa4_1.getText());
        this.nimet.add(this.emo4_1.getText());
        this.nimet.add(this.isa4_2.getText());
        this.nimet.add(this.emo4_2.getText());
        this.nimet.add(this.isa4_3.getText());
        this.nimet.add(this.emo4_3.getText());
        this.nimet.add(this.isa4_4.getText());
        this.nimet.add(this.emo4_4.getText());
        this.nimet.add(this.isa4_5.getText());
        this.nimet.add(this.emo4_5.getText());
        this.nimet.add(this.isa4_6.getText());
        this.nimet.add(this.emo4_6.getText());
        this.nimet.add(this.isa4_7.getText());
        this.nimet.add(this.emo4_7.getText());
        this.nimet.add(this.isa4_8.getText());
        this.nimet.add(this.emo4_8.getText());
        
        
    }
    
    public String pennuilleVarit(){
         VariKantajuus iskan = new VariKantajuus(this.iska);
         VariKantajuus aidin = new VariKantajuus(this.aiti);
         String varit = "<html>Pennut voivat <br> olla ainakin: <br>";
         
         varit += this.kuviottomat(iskan, aidin);
         varit += this.kuviolliset(iskan, aidin);
         
         varit += "</html>";
         
         return varit;
     }
    
    private String kuviottomat(VariKantajuus isan, VariKantajuus emon){
        String teksti = "";
        if(isan.kantaaKuviottomuutta() == true && emon.kantaaKuviottomuutta() == true){
            if(isan.kantaaTaysvaria() == true || emon.kantaaTaysvaria() == true){
                teksti += "musta <br>";
            }
            if(isan.kantaaDiluutiota() == true && emon.kantaaDiluutiota() == true){
                teksti += "sininen <br>";
            }
        } 
        
        return teksti;
    }
    
    private String kuviolliset(VariKantajuus isan, VariKantajuus emon){
        String teksti = "";
        
        if(isan.kantaaKuviollisuutta() == true || emon.kantaaKuviollisuutta() == true){
            if(isan.kantaaTaysvaria() == true || emon.kantaaTaysvaria()){
                teksti += "ruskeakuvioinen <br>";
            }
            if(isan.kantaaDiluutiota() == true && emon.kantaaDiluutiota() == true){
                teksti += "sinikuvioinen <br>";
            }
        }
        
        return teksti;
    } 
    
}
