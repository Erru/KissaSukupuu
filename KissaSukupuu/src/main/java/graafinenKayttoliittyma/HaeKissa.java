
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
 *Luokka ottaa hakukenttään laitetun kissan nimen ja etsii ja luo sen kissan
 *  sukutaulun. Luokka myös laskee kissalle sukukatokertoimen tunnettujen kissojen
 *  mukaan ja kertoo mitä värejä se kantaa varmasti.
 */
public class HaeKissa implements ActionListener{
    
    private JTextArea hakukentta;
    private JButton haettu;
    private Kissat kisut;
    private Kissa kissa;
    private JButton isa;
    private JButton emo;
    private JButton isa2_1;
    private JButton emo2_1;
    private JButton isa2_2;
    private JButton emo2_2;
    private JButton isa3_1;
    private JButton emo3_1;
    private JButton isa3_2;
    private JButton emo3_2;
    private JButton isa3_3;
    private JButton emo3_3;
    private JButton isa3_4;
    private JButton emo3_4;
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
    JButton sukukato;
    ArrayList<Kissa> lista;
    Kissa iska;
    Kissa aiti;
    SukukatoLaskuri laskuri;
    ArrayList<String> nimet;
    JLabel varit;
    
    public HaeKissa(Kissat kisut, JTextArea lahde, JButton kohde, JButton isa, 
                    JButton emo, JButton isa2_1, JButton emo2_1, JButton isa2_2,
                    JButton emo2_2, JButton isa3_1, JButton emo3_1, JButton isa3_2,
                    JButton emo3_2, JButton isa3_3, JButton emo3_3, JButton isa3_4,
                    JButton emo3_4, JButton isa4_1, JButton emo4_1, JButton isa4_2, 
                    JButton emo4_2, JButton isa4_3, JButton emo4_3, JButton isa4_4, 
                    JButton emo4_4, JButton isa4_5, JButton emo4_5, JButton isa4_6, 
                    JButton emo4_6, JButton isa4_7, JButton emo4_7, JButton isa4_8, 
                    JButton emo4_8, JButton sukukato, JLabel varikentta){
        this.hakukentta = lahde;
        this.haettu = kohde;
        this.kisut = kisut;
        this.isa = isa;
        this.emo = emo;
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
        this.lista = kisut.getKissat();
        this.laskuri = new SukukatoLaskuri();
        this.nimet = new ArrayList();
        this.sukukato = sukukato;
        this.varit = varikentta;
    }
    
    /**
     * Etsii annetun nimen perusteella kissan Kissat luokan ylläpitämästä listasta.
     * Jos kissaa ei löydy, asetetaan kissa null arvoiseksi.
     * @param nimi 
     */
    
    public void etsiKissaNimella(String nimi){
        ArrayList<Kissa> kissat = this.kisut.getKissat();
        for(Kissa kisu : kissat){
            if(kisu.getNimi().equals(nimi)){
                //lisää tähän vielä, ettei kirjaimen koolla ole väliä
                this.kissa = kisu;
                break;
            } else {
                this.kissa = null;
            }
        }
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        this.aloitus();
        this.etsiKissaNimella(this.hakukentta.getText());
        //col1
        this.asetaKissa();
        //col2
        if(this.onkoNull(this.kissa) == false){
            if(kissa.getIsa() == null){
            } else {
              this.asetaIsa(); 
            }
            if(kissa.getEmo() == null){
            } else {
              this.asetaEmo();
            }
        }
        
        //col3
        this.asetaCol3();
        //col4
        this.asetaCol4();
        //col5
        this.asetaCol5();
        
        this.hakukentta.setText("nimi");
        
        this.keraaKissat();
        if(laskuri.getSukukatokerroin(nimet) == 0.0){
            this.sukukato.setText("<html> tyhjä sukutaulu, <br> sukukatokerrointa <br> ei voida laskea </html>");
        } else {
            this.sukukato.setText("<html>" + String.valueOf(laskuri.getSukukatokerroin(this.nimet)) + "<br>" + laskuri.kerroPuuttuvista() + "</html>");
        
        }
        
        this.varit.setText(this.kannettavatVarit());
        
    }

    /**
     * Sukutaulu aina haun alussa tyhjäksi eli ettei vääriä kissoja jää hengaamaan
     * kohtiin, joihin ei löydy kissaa.
     */
    public void aloitus(){
        this.haettu.setText("X");
        this.isa.setText("X");
        this.emo.setText("X");
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
    
    /**
     * Asettaa oikean nimen ja tiedot sukutauluun kissan kohdalle. 
     * Jos kissaa ei löydy, ilmoittaa siitä hakijalle.
     */
    
    public void asetaKissa(){
        if(this.kissa == null){
            this.haettu.setText("<html> Ei löydy <br>'" + this.hakukentta.getText() 
                + "'<br> nimistä kissaa, <br>tarkista kirjoitusasu <br>tai lisää kissa </html>");
            this.sukukato.setText("sukukato");
            this.varit.setText("väriennustukset:");
        } else {
        this.haettu.setText("<html>" + this.kissa.getNimi() + "<br>" + this.kissa.getSukupuoli() 
                + ", " + this.kissa.getRotu() + " " + this.kissa.getVari().getVari() + "</html>");
        }
    }
    
    /**
     * Asettaa isän tiedot sukutauluun.
     */
    
    public void asetaIsa(){
        this.isa.setText("<html>" + this.kissa.getIsa().getNimi() + "<br>" + 
                this.kissa.getIsa().getSukupuoli() + ", " + this.kissa.getIsa().getRotu() + " " 
                + this.kissa.getIsa().getVari().getVari() + "</html>");
        
        
    }
    
    /**
     * Asettaa emon tiedot sukutauluun.
     */
    
    public void asetaEmo(){
        this.emo.setText("<html>" + this.kissa.getEmo().getNimi() + "<br>" + 
                this.kissa.getEmo().getSukupuoli() + ", " + this.kissa.getEmo().getRotu() + " " 
                + this.kissa.getEmo().getVari().getVari() + "</html>");
        
        
    }
    
    /**
     * Asettaa 2 sukupolven tiedot sukutauluun apumetodien avulla, jos kissat
     * löytyvät.
     */
    
    public void asetaCol3(){
        this.asetaEiNullKissanVanhemmat(this.kissa.getIsa(), this.isa2_1, this.emo2_1);
        this.asetaEiNullKissanVanhemmat(this.kissa.getEmo(), this.isa2_2, this.emo2_2);
    }
    
    /**
     * Asettaa 3 polven kissat sukutauluun.
     */
    
    public void asetaCol4(){
        
        if(this.onkoNull(this.kissa.getIsa()) == false){
            this.asetaEiNullKissanVanhemmat(this.kissa.getIsa().getIsa(), this.isa3_1, this.emo3_1);
            this.asetaEiNullKissanVanhemmat(this.kissa.getIsa().getEmo(), this.isa3_2, this.emo3_2);
        }
        
        if(this.onkoNull(this.kissa.getEmo()) == false){
            this.asetaEiNullKissanVanhemmat(this.kissa.getEmo().getIsa(), this.isa3_3, this.emo3_3);
            this.asetaEiNullKissanVanhemmat(this.kissa.getEmo().getEmo(), this.isa3_4, this.emo3_4);
        }
        
        
    }
    
    /**
     * Asettaa 4 polven kissat sukutauluun.
     */
    
    public void asetaCol5(){
        
        if(this.onkoNull(this.kissa.getIsa()) == false){
            if(this.onkoNull(this.kissa.getIsa().getIsa()) == false){
            this.asetaEiNullKissanVanhemmat(this.kissa.getIsa().getIsa().getIsa(), this.isa4_1, this.emo4_1);
            this.asetaEiNullKissanVanhemmat(this.kissa.getIsa().getIsa().getEmo(), this.isa4_2, this.emo4_2);
            }
            if(this.onkoNull(this.kissa.getIsa().getEmo()) == false){
                this.asetaEiNullKissanVanhemmat(this.kissa.getIsa().getEmo().getIsa(), this.isa4_3, this.emo4_3);
                this.asetaEiNullKissanVanhemmat(this.kissa.getIsa().getEmo().getEmo(), this.isa4_4, this.emo4_4);
            }
        }
        
        if(this.onkoNull(this.kissa.getEmo()) == false){
            if(this.onkoNull(this.kissa.getEmo().getIsa()) == false){
            this.asetaEiNullKissanVanhemmat(this.kissa.getEmo().getIsa().getIsa(), this.isa4_5, this.emo4_5);
            this.asetaEiNullKissanVanhemmat(this.kissa.getEmo().getIsa().getEmo(), this.isa4_6, this.emo4_6);
            }
            if(this.onkoNull(this.kissa.getEmo().getEmo()) == false){
                this.asetaEiNullKissanVanhemmat(this.kissa.getEmo().getEmo().getIsa(), this.isa4_7, this.emo4_7);
                this.asetaEiNullKissanVanhemmat(this.kissa.getEmo().getEmo().getEmo(), this.isa4_8, this.emo4_8);
            }
        }
        
    }
    
    /**
     * Tarkistaa onko annettua kissaa olemassa.
     * @param kissa
     * @return 
     */
    
     public boolean onkoNull(Kissa kissa){
        if(kissa == null){
            return true;
        } 
        return false;
    }
     
     /**
      * Asettaa annetun kissan vanhemmat JButtoneiden teksteihin, jos kissa on olemassa.
      * @param kissa
      * @param isa
      * @param emo 
      */
    
     public void asetaEiNullKissanVanhemmat(Kissa kissa, JButton isa, JButton emo){
        if (this.onkoNull(kissa) == false){
            Kissa isukki = kissa.getIsa();
            Kissa mamma = kissa.getEmo();
            this.asetaOlemassaOlevat(isa, emo, isukki, mamma);
        }
    }
     
     /**
      * Asettaa annetut kissat JButtoneihin, jos ne ovat olemassa.
      * @param poikanappi
      * @param tyttonappi
      * @param kolli
      * @param naaras 
      */
     
     public void asetaOlemassaOlevat(JButton poikanappi, JButton tyttonappi, Kissa kolli, 
            Kissa naaras){
        
        Kissa kisu1 = kolli;
        Kissa kisu2 = naaras;
        
        if(kisu1 == null && kisu2 == null){
            //ei tehdä mitään
        } else if (kisu1 == null){
            this.asetaKissa(tyttonappi, kisu2);
        } else if (kisu2 == null){
            this.asetaKissa(poikanappi, kisu1);
        } else {
            this.asetaVanhemmat(poikanappi, tyttonappi, kisu1, kisu2);
        }
    }
     
     /**
      * Asettaa annetun kissan JButtoniin.
      * @param annettu
      * @param mirri 
      */
     
     public void asetaKissa(JButton annettu, Kissa mirri){
        annettu.setText("<html>" + mirri.getNimi() + "<br>" + mirri.getSukupuoli() 
                + ", " + mirri.getRotu() + " " + mirri.getVari().getVari() + "</html>");
    }
     
     public void asetaVanhemmat(JButton far, JButton mor,Kissa isukki, Kissa mamma){
        far.setText("<html>" + isukki.getNimi() + "<br>" + isukki.getSukupuoli() 
                + ", " + isukki.getRotu() + " " + isukki.getVari().getVari() + "</html>");
        mor.setText("<html>" + mamma.getNimi() + "<br>" + mamma.getSukupuoli() 
                + ", " + mamma.getRotu() + " " + mamma.getVari().getVari() + "</html>");
    }
     
     /**
      * Kerää listan kissoista, jotka on asetettu sukutauluun sukukatokertoimen
      * laskemiseksi.
      */
     
     private void keraaKissat() {
        
        this.nimet.add(this.isa.getText());
        this.nimet.add(this.emo.getText());
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
     
     /**
      * Selvittää mitä värejä kissa kantaa ja tuottaa niistä String muotoisen
      * kokonaisuuden käyttäjälle esitettäväksi.
      * @return 
      */
     
     public String kannettavatVarit(){
         VariKantajuus kantaja = new VariKantajuus(this.kissa);
         String varit = "<html>Kissa kantaa varmasti: <br>";
         if(kantaja.kantaaTaysvaria() == true){
             varit = varit + "täysväriä <br>";
         }
         if(kantaja.kantaaDiluutiota() == true){
             varit += "diluutiota <br>";
         }
         if(kantaja.kantaaKuviollisuutta() == true){
             varit += "kuviollisuutta <br>";
         }
         if(kantaja.kantaaKuviottomuutta() == true){
             varit += "kuviottomuutta <br>";
         }
         if(kantaja.kantaaTabbya() == true){
             varit += "klassista tabby kuviota <br>";
         }
         varit += "</html>";
         
         return varit;
     }
     
     
    
}
    
            