
package graafinenKayttoliittyma;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;
import kissasukupuu.kissasukupuu.Kissa;
import kissasukupuu.kissasukupuu.Kissat;

/**
 * Ohjelman graafinen käyttöliittymä.
 * 
*/

public class Kayttoliittyma implements Runnable {

    private JFrame frame;
    private Kissat kissat;
    
    //vasenreuna
    JLabel vasenreuna;
    
    //keskus
    JButton kissa;
    JButton isa1;
    JButton emo1;
    JButton isa2_1;
    JButton emo2_1;
    JButton isa2_2;
    JButton emo2_2;
    

    public Kayttoliittyma(Kissat kissat) {
        this.kissat = kissat;
        //vasenreuna
        this.vasenreuna = new JLabel("<html> väriennustukset: <br> musta </html>");
        //keskus
        kissa = new JButton("<html>" + "Errun Hehkeä herttuatar" + "<br>" + "F, EUR e 24" + "</html>");
        isa1 = new JButton("isa1");
        emo1 = new JButton("emo1");
        isa2_1 = new JButton("isa2_1");
        emo2_1 = new JButton("emo2_1");
        isa2_2 = new JButton("isa2_2");
        emo2_2 = new JButton("emo2_2");
        
    }

    @Override
    public void run() {
        frame = new JFrame("Sukupuu");
        frame.setPreferredSize(new Dimension(1200, 700));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoKomponentit(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    /**
     * Luo paneelikomponentit ja lisää ne ulkoasuun.
     * @param container 
     */
    private void luoKomponentit(Container container) {
        //muutan tätä ulkoasua vielä JPanelin avulla, jotta saan ikkunat reunat
        //haluamallani tavalla, tämä oli komponenttien luomista ja järjestämisen
        //kokeilu
        container.setLayout(new BorderLayout());
        
        JPanel vasen = luoVasenSivu();
        JPanel oikea = luoOikeaSivu();
        
        JPanel keskus = luoKeskusta();
        
        container.add(vasen, BorderLayout.WEST);
        container.add(oikea, BorderLayout.EAST);
        container.add(luoAlaosa(), BorderLayout.SOUTH);
        container.add(keskus);
        
        //JButton.setText();
    }
    
    private JPanel luoVasenSivu(){
        JPanel panel = new JPanel(new GridLayout(1,1));
        
        
        panel.add(vasenreuna);
        
        return panel;
    }
    
    private JPanel luoOikeaSivu(){
        JPanel panel = new JPanel(new GridLayout(17,1));
        
        JButton hae = new JButton("Hae kissa nimellä");
        JTextArea haku = new JTextArea("nimi");
        JLabel tiedot = new JLabel("Tietojen lisäys:");
        JLabel nimi = new JLabel("nimi:");
        JTextArea kNimi = new JTextArea();
        JLabel isanNimi = new JLabel("Isän nimi:");
        JTextArea iNimi = new JTextArea();
        JLabel emonNimi = new JLabel("Emon nimi:");
        JTextArea eNimi = new JTextArea();
        JLabel rotu = new JLabel("rotu:");
        JTextArea kRotu = new JTextArea();
        JLabel vari = new JLabel("väri:");
        JTextArea kVari = new JTextArea();
        JLabel sukupuoli = new JLabel("sukupuoli (F/M):");
        JTextArea fm = new JTextArea();
        JButton lisaaK = new JButton("Lisää uusi kissa");
        JButton lisaaT = new JButton("Lisää tietoja kissalle");
        
        //miten tällaiseen saa komponentteja kahdesta panelista? haluan col1 kissa
        //JButtonin, en hakunappulaa tähän
        HaeKissa hakija = new HaeKissa(this.kissat,haku, this.kissa, this.isa1, 
                this.emo1, this.isa2_1, this.emo2_1, this.isa2_2, this.emo2_2);
        hae.addActionListener(hakija);
        
        panel.add(hae);
        panel.add(haku);
        panel.add(tiedot);
        panel.add(nimi);
        panel.add(kNimi);
        panel.add(isanNimi);
        panel.add(iNimi);
        panel.add(emonNimi);
        panel.add(eNimi);
        panel.add(rotu);
        panel.add(kRotu);
        panel.add(vari);
        panel.add(kVari);
        panel.add(sukupuoli);
        panel.add(fm);
        panel.add(lisaaK);
        panel.add(lisaaT);
        
        return panel;
    }
    
    private JPanel luoKeskusta(){
        JPanel panel = new JPanel(new GridLayout(1,5));
        
        panel.add(luoCol1());
        panel.add(luoCol2());
        panel.add(luoCol3());
        panel.add(luoCol4());
        panel.add(luoCol5());
        
        return panel;
    }
    
    private JPanel luoCol1(){
        JPanel panel = new JPanel(new GridLayout(1,1));
        
        panel.add(kissa);
        
        return panel;
    }
    
    private JPanel luoCol2(){
        JPanel panel = new JPanel(new GridLayout(2,1));
        
        panel.add(isa1);
        panel.add(emo1);
        
        return panel;
    }
    
    private JPanel luoCol3(){
        JPanel panel = new JPanel(new GridLayout(4,1));
        
        panel.add(isa2_1);
        panel.add(emo2_1);
        panel.add(isa2_2);
        panel.add(emo2_2);
        
        return panel;
    }
    
    private JPanel luoCol4(){
        JPanel panel = new JPanel(new GridLayout(8,1));
        
        JButton isa3_1 = new JButton("isa3_1");
        JButton emo3_1 = new JButton("emo3_1");
        JButton isa3_2 = new JButton("isa3_2");
        JButton emo3_2 = new JButton("emo3_2");
        JButton isa3_3 = new JButton("isa3_3");
        JButton emo3_3 = new JButton("emo3_3");
        JButton isa3_4 = new JButton("isa3_4");
        JButton emo3_4 = new JButton("emo3_4");
        
        panel.add(isa3_1);
        panel.add(emo3_1);
        panel.add(isa3_2);
        panel.add(emo3_2);
        panel.add(isa3_3);
        panel.add(emo3_3);
        panel.add(isa3_4);
        panel.add(emo3_4);
        
        return panel;
    }
    
    private JPanel luoCol5(){
        JPanel panel = new JPanel(new GridLayout(16,1));
        
        JButton isa4_1 = new JButton("isa4_1");
        JButton emo4_1 = new JButton("emo3_1");
        JButton isa4_2 = new JButton("isa4_2");
        JButton emo4_2 = new JButton("emo4_2");
        JButton isa4_3 = new JButton("isa4_3");
        JButton emo4_3 = new JButton("emo4_3");
        JButton isa4_4 = new JButton("isa4_4");
        JButton emo4_4 = new JButton("emo4_4");
        JButton isa4_5 = new JButton("isa4_5");
        JButton emo4_5 = new JButton("emo4_5");
        JButton isa4_6 = new JButton("isa4_6");
        JButton emo4_6 = new JButton("emo4_6");
        JButton isa4_7 = new JButton("isa4_7");
        JButton emo4_7 = new JButton("emo4_7");
        JButton isa4_8 = new JButton("isa4_8");
        JButton emo4_8 = new JButton("<html>" + "emo4_8" + "<br>" + "F, EUR X XX" + "</html>");
        //alimmainen on tekstin sijoittelu testi
        
        panel.add(isa4_1);
        panel.add(emo4_1);
        panel.add(isa4_2);
        panel.add(emo4_2);
        panel.add(isa4_3);
        panel.add(emo4_3);
        panel.add(isa4_4);
        panel.add(emo4_4);
        panel.add(isa4_5);
        panel.add(emo4_5);
        panel.add(isa4_6);
        panel.add(emo4_6);
        panel.add(isa4_7);
        panel.add(emo4_7);
        panel.add(isa4_8);
        panel.add(emo4_8);
        
        return panel;
    }
    
    private JPanel luoAlaosa(){
        JPanel panel = new JPanel(new GridLayout(1,5));
        
        JButton astutus = new JButton("Testiastuta kissat:");
        JLabel emo = new JLabel("emo:");
        JTextArea kissa1 = new JTextArea("emo");
        JLabel isa = new JLabel("isä:");
        JTextArea kissa2 = new JTextArea("isa");
        
        panel.add(astutus);
        panel.add(emo);
        panel.add(kissa1);
        panel.add(isa);
        panel.add(kissa2);
        
        return panel;
    }

    public JFrame getFrame() {
        return frame;
    }
    
    
}