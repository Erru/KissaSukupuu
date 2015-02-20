
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
    
    public HaeKissa(Kissat kisut, JTextArea lahde, JButton kohde, JButton isa, 
                    JButton emo, JButton isa2_1, JButton emo2_1, JButton isa2_2,
                    JButton emo2_2, JButton isa3_1, JButton emo3_1, JButton isa3_2,
                    JButton emo3_2, JButton isa3_3, JButton emo3_3, JButton isa3_4,
                    JButton emo3_4, JButton isa4_1, JButton emo4_1, JButton isa4_2, 
                    JButton emo4_2, JButton isa4_3, JButton emo4_3, JButton isa4_4, 
                    JButton emo4_4, JButton isa4_5, JButton emo4_5, JButton isa4_6, 
                    JButton emo4_6, JButton isa4_7, JButton emo4_7, JButton isa4_8, 
                    JButton emo4_8){
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
        this.asetaCol4();
        //col5
        this.asetaCol5();
        
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
    
    public void asetaCol4(){
        this.aseta3_1();
        this.aseta3_2();
        this.aseta3_3();
        this.aseta3_4();
    }
    
    public void aseta3_1(){
        Kissa isa3_1 = this.kissa.getIsa().getIsa().getIsa();
        this.isa3_1.setText("<html>" + isa3_1.getNimi() + "<br>" + isa3_1.getSukupuoli() 
                + ", " + isa3_1.getRotu() + " " + isa3_1.getVari().getVari() + "</html>");
        
        Kissa emo3_1 = this.kissa.getIsa().getIsa().getEmo();
        this.emo3_1.setText("<html>" + emo3_1.getNimi() + "<br>" + emo3_1.getSukupuoli() 
                + ", " + emo3_1.getRotu() + " " + emo3_1.getVari().getVari() + "</html>");
    }
    
    public void aseta3_2(){
        Kissa isa3_2 = this.kissa.getIsa().getEmo().getIsa();
        this.isa3_2.setText("<html>" + isa3_2.getNimi() + "<br>" + isa3_2.getSukupuoli() 
                + ", " + isa3_2.getRotu() + " " + isa3_2.getVari().getVari() + "</html>");
        
        Kissa emo3_2 = this.kissa.getIsa().getEmo().getEmo();
        this.emo3_2.setText("<html>" + emo3_2.getNimi() + "<br>" + emo3_2.getSukupuoli() 
                + ", " + emo3_2.getRotu() + " " + emo3_2.getVari().getVari() + "</html>");
    }
    
    public void aseta3_3(){
        Kissa isa3_3 = this.kissa.getEmo().getIsa().getIsa();
        this.isa3_3.setText("<html>" + isa3_3.getNimi() + "<br>" + isa3_3.getSukupuoli() 
                + ", " + isa3_3.getRotu() + " " + isa3_3.getVari().getVari() + "</html>");
        
        Kissa emo3_3 = this.kissa.getEmo().getIsa().getEmo();
        this.emo3_3.setText("<html>" + emo3_3.getNimi() + "<br>" + emo3_3.getSukupuoli() 
                + ", " + emo3_3.getRotu() + " " + emo3_3.getVari().getVari() + "</html>");
    }
    
    public void aseta3_4(){
        Kissa isa3_4 = this.kissa.getEmo().getEmo().getIsa();
        this.isa3_4.setText("<html>" + isa3_4.getNimi() + "<br>" + isa3_4.getSukupuoli() 
                + ", " + isa3_4.getRotu() + " " + isa3_4.getVari().getVari() + "</html>");
        
        Kissa emo3_4 = this.kissa.getEmo().getEmo().getEmo();
        this.emo3_4.setText("<html>" + emo3_4.getNimi() + "<br>" + emo3_4.getSukupuoli() 
                + ", " + emo3_4.getRotu() + " " + emo3_4.getVari().getVari() + "</html>");
    }
    
    public void asetaCol5(){
        this.aseta4_1();
        this.aseta4_2();
        this.aseta4_3();
        this.aseta4_4();
        this.aseta4_5();
        this.aseta4_6();
        this.aseta4_7();
        this.aseta4_8();
    }
    
    public void aseta4_1(){
        Kissa isa4_1 = this.kissa.getIsa().getIsa().getIsa().getIsa();
        this.isa4_1.setText("<html>" + isa4_1.getNimi() + "<br>" + isa4_1.getSukupuoli() 
                + ", " + isa4_1.getRotu() + " " + isa4_1.getVari().getVari() + "</html>");
        
        Kissa emo4_1 = this.kissa.getIsa().getIsa().getIsa().getEmo();
        this.emo4_1.setText("<html>" + emo4_1.getNimi() + "<br>" + emo4_1.getSukupuoli() 
                + ", " + emo4_1.getRotu() + " " + emo4_1.getVari().getVari() + "</html>");
    }
    
    public void aseta4_2(){
        Kissa isa4_2 = this.kissa.getIsa().getIsa().getEmo().getIsa();
        this.isa4_2.setText("<html>" + isa4_2.getNimi() + "<br>" + isa4_2.getSukupuoli() 
                + ", " + isa4_2.getRotu() + " " + isa4_2.getVari().getVari() + "</html>");
        
        Kissa emo4_2 = this.kissa.getIsa().getIsa().getEmo().getEmo();
        this.emo4_2.setText("<html>" + emo4_2.getNimi() + "<br>" + emo4_2.getSukupuoli() 
                + ", " + emo4_2.getRotu() + " " + emo4_2.getVari().getVari() + "</html>");
    }
    
    public void aseta4_3(){
        Kissa isa4_3 = this.kissa.getIsa().getEmo().getIsa().getIsa();
        this.isa4_3.setText("<html>" + isa4_3.getNimi() + "<br>" + isa4_3.getSukupuoli() 
                + ", " + isa4_3.getRotu() + " " + isa4_3.getVari().getVari() + "</html>");
        
        Kissa emo4_3 = this.kissa.getIsa().getEmo().getIsa().getEmo();
        this.emo4_3.setText("<html>" + emo4_3.getNimi() + "<br>" + emo4_3.getSukupuoli() 
                + ", " + emo4_3.getRotu() + " " + emo4_3.getVari().getVari() + "</html>");
    }
    
    public void aseta4_4(){
        Kissa isa4_4 = this.kissa.getIsa().getEmo().getEmo().getIsa();
        this.isa4_4.setText("<html>" + isa4_4.getNimi() + "<br>" + isa4_4.getSukupuoli() 
                + ", " + isa4_4.getRotu() + " " + isa4_4.getVari().getVari() + "</html>");
        
        Kissa emo4_4 = this.kissa.getIsa().getEmo().getEmo().getEmo();
        this.emo4_4.setText("<html>" + emo4_4.getNimi() + "<br>" + emo4_4.getSukupuoli() 
                + ", " + emo4_4.getRotu() + " " + emo4_4.getVari().getVari() + "</html>");
    }
    
    public void aseta4_5(){
        Kissa isa4_5 = this.kissa.getEmo().getIsa().getIsa().getIsa();
        this.isa4_5.setText("<html>" + isa4_5.getNimi() + "<br>" + isa4_5.getSukupuoli() 
                + ", " + isa4_5.getRotu() + " " + isa4_5.getVari().getVari() + "</html>");
        
        Kissa emo4_5 = this.kissa.getEmo().getIsa().getIsa().getEmo();
        this.emo4_5.setText("<html>" + emo4_5.getNimi() + "<br>" + emo4_5.getSukupuoli() 
                + ", " + emo4_5.getRotu() + " " + emo4_5.getVari().getVari() + "</html>");
    }
    
    public void aseta4_6(){
        Kissa isa4_6 = this.kissa.getEmo().getIsa().getEmo().getIsa();
        this.isa4_6.setText("<html>" + isa4_6.getNimi() + "<br>" + isa4_6.getSukupuoli() 
                + ", " + isa4_6.getRotu() + " " + isa4_6.getVari().getVari() + "</html>");
        
        Kissa emo4_6 = this.kissa.getEmo().getIsa().getEmo().getEmo();
        this.emo4_6.setText("<html>" + emo4_6.getNimi() + "<br>" + emo4_6.getSukupuoli() 
                + ", " + emo4_6.getRotu() + " " + emo4_6.getVari().getVari() + "</html>");
    }
    
    public void aseta4_7(){
        Kissa isa4_7 = this.kissa.getEmo().getEmo().getIsa().getIsa();
        this.isa4_7.setText("<html>" + isa4_7.getNimi() + "<br>" + isa4_7.getSukupuoli() 
                + ", " + isa4_7.getRotu() + " " + isa4_7.getVari().getVari() + "</html>");
        
        Kissa emo4_7 = this.kissa.getEmo().getEmo().getIsa().getEmo();
        this.emo4_7.setText("<html>" + emo4_7.getNimi() + "<br>" + emo4_7.getSukupuoli() 
                + ", " + emo4_7.getRotu() + " " + emo4_7.getVari().getVari() + "</html>");
    }
    
    public void aseta4_8(){
        Kissa isa4_8 = this.kissa.getEmo().getEmo().getEmo().getIsa();
        this.isa4_8.setText("<html>" + isa4_8.getNimi() + "<br>" + isa4_8.getSukupuoli() 
                + ", " + isa4_8.getRotu() + " " + isa4_8.getVari().getVari() + "</html>");
        
        Kissa emo4_8 = this.kissa.getEmo().getEmo().getEmo().getEmo();
        this.emo4_8.setText("<html>" + emo4_8.getNimi() + "<br>" + emo4_8.getSukupuoli() 
                + ", " + emo4_8.getRotu() + " " + emo4_8.getVari().getVari() + "</html>");
    }
    
}
    
            