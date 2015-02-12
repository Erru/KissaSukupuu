
package graafinenKayttoliittyma;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JTextArea;
import kissasukupuu.kissasukupuu.Kissa;
import kissasukupuu.kissasukupuu.Kissat;

/**
 *Luokka ottaa hakukenttään laitetun kissan nimen ja etsii ja luo sen kissan
 *  sukutaulun.
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
    //private JButton ;
    //private JButton ;
    
    public HaeKissa(Kissat kisut, JTextArea lahde, JButton kohde, JButton isa, 
                    JButton emo, JButton isa2_1, JButton emo2_1, JButton isa2_2,
                    JButton emo2_2){
        this.hakukentta = lahde;
        this.haettu = kohde;
        this.kisut = kisut;
        this.isa = isa;
        this.emo = emo;
        this.isa2_1 = isa2_1;
        this.emo2_1 = emo2_1;
        this.isa2_2 = isa2_2;
        this.emo2_2 = emo2_2;
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
    
    //huolehdi, että ne vanhemmat joita ei löydy tulevat X merkeillä sukutauluun
    @Override
    public void actionPerformed(ActionEvent e) {
        this.aloitus();
        this.etsiKissaNimella(this.hakukentta.getText());
        //col1
        this.asetaKissa();
        //col2
        this.asetaIsa();
        this.asetaEmo();
        //col3
        this.asetaCol3();
        //col4
        
        //col5
        
        this.hakukentta.setText("nimi");
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
    }
    
    /**
     * Asettaa oikean nimen ja tiedot sukutauluun kissan kohdalle. 
     * Jos kissaa ei löydy, ilmoittaa siitä hakijalle.
     */
    
    public void asetaKissa(){
        if(this.kissa == null){
            this.haettu.setText("<html> Ei löydy <br>'" + this.hakukentta.getText() 
                + "'<br> nimistä kissaa, <br>tarkista kirjoitusasu <br>tai lisää kissa </html>");
        
        } else {
        this.haettu.setText("<html>" + this.kissa.getNimi() + "<br>" + this.kissa.getSukupuoli() 
                + ", " + this.kissa.getRotu() + " " + this.kissa.getVari().getVari() + "</html>");
        }
    }
    
    /**
     * Asettaa isän tiedot sukutauluun. Jos isää ei löydy, ei tee mitään.
     */
    
    public void asetaIsa(){
        this.isa.setText("<html>" + this.kissa.getIsa().getNimi() + "<br>" + 
                this.kissa.getIsa().getSukupuoli() + ", " + this.kissa.getIsa().getRotu() + " " 
                + this.kissa.getIsa().getVari().getVari() + "</html>");
        
        
    }
    
    /**
     * Asettaa emon tiedot sukutauluun. Jos emoa ei löydy, ei tee mitään.
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
        this.asetaIsanVanhemmat();
        this.asetaEmonVanhemmat();
    }
    
    
    public void asetaIsanVanhemmat(){
        Kissa isa = this.kissa.getIsa().getIsa();
        this.isa2_1.setText("<html>" + isa.getNimi() + "<br>" + isa.getSukupuoli() 
                + ", " + isa.getRotu() + " " + isa.getVari().getVari() + "</html>");
        
        
        Kissa emo = this.kissa.getIsa().getEmo();
        this.emo2_1.setText("<html>" + emo.getNimi() + "<br>" + emo.getSukupuoli() 
                + ", " + emo.getRotu() + " " + emo.getVari().getVari() + "</html>");
        
    }
    
    public void asetaEmonVanhemmat(){
        Kissa isa = this.kissa.getEmo().getIsa();
        this.isa2_2.setText("<html>" + isa.getNimi() + "<br>" + isa.getSukupuoli() 
                + ", " + isa.getRotu() + " " + isa.getVari().getVari() + "</html>");
        
        
        Kissa emo = this.kissa.getEmo().getEmo();
        this.emo2_2.setText("<html>" + emo.getNimi() + "<br>" + emo.getSukupuoli() 
                + ", " + emo.getRotu() + " " + emo.getVari().getVari() + "</html>");
    }
}
    
            