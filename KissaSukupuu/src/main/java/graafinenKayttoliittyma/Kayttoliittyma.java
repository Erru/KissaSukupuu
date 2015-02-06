
package graafinenKayttoliittyma;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;
import kissasukupuu.kissasukupuu.Kissa;

public class Kayttoliittyma implements Runnable {

    private JFrame frame;

    public Kayttoliittyma() {
    }

    @Override
    public void run() {
        frame = new JFrame("Sukupuu");
        frame.setPreferredSize(new Dimension(1000, 600));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoKomponentit(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void luoKomponentit(Container container) {
        //muutan tätä ulkoasua vielä JPanelin avulla, jotta saan ikkunat reunat
        //haluamallani tavalla, tämä oli komponenttien luomista ja järjestämisen
        //kokeilu
        GridLayout layout = new GridLayout(17,7);
        container.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        
        //komponentit järjestyksessä
        //rivi 1
        JLabel vasenreuna = new JLabel("väriennustukset:");
        JButton isa4_1 = new JButton("isa4_1");
        JButton hae = new JButton("Hae kissa nimellä");
        //rivi 2
        JButton isa3_1 = new JButton("isa3_1");
        JButton emo4_1 = new JButton("emo3_1");
        JTextArea haku = new JTextArea("nimi");
        //rivi 3
        JButton isa2_1 = new JButton("isa2_1");
        JButton emo3_1 = new JButton("emo3_1");
        JButton isa4_2 = new JButton("isa4_2");
        JLabel tiedot = new JLabel("Tietojen lisäys:");
        //rivi 4
        JButton emo4_2 = new JButton("emo4_2");
        JLabel nimi = new JLabel("nimi:");
        //rivi 5
        JButton isa4_3 = new JButton("isa4_3");
        JTextArea kNimi = new JTextArea();
        //rivi 6
        JButton isa3_2 = new JButton("isa3_2");
        JButton emo4_3 = new JButton("emo4_3");
        JLabel isanNimi = new JLabel("Isän nimi:");
        //rivi 7
        JButton isa1 = new JButton("isa1");
        JButton emo2_1 = new JButton("emo2_1");
        JButton emo3_2 = new JButton("emo3_2");
        JButton isa4_4 = new JButton("isa4_4");
        JTextArea iNimi = new JTextArea();
        //rivi 8
        JButton kissa = new JButton("kissa");
        JButton emo4_4 = new JButton("emo4_4");
        JLabel emonNimi = new JLabel("Emon nimi:");
        //rivi 9
        JButton isa4_5 = new JButton("isa4_5");
        JTextArea eNimi = new JTextArea();
        //rivi 10
        JButton emo1 = new JButton("emo1");
        JButton isa2_2 = new JButton("isa2_2");
        JButton isa3_3 = new JButton("isa3_3");
        JButton emo4_5 = new JButton("emo4_5");
        JLabel rotu = new JLabel("rotu:");
        //rivi 11
        JButton emo3_3 = new JButton("emo3_3");
        JButton isa4_6 = new JButton("isa4_6");
        JTextArea kRotu = new JTextArea();
        //rivi 12
        JButton emo4_6 = new JButton("emo4_6");
        JLabel vari = new JLabel("väri:");
        //rivi 13
        JButton isa4_7 = new JButton("isa4_7");
        JTextArea kVari = new JTextArea();
        //rivi 14
        JButton emo2_2 = new JButton("emo2_3");
        JButton isa3_4 = new JButton("isa3_4");
        JButton emo4_7 = new JButton("emo4_7");
        JLabel sukupuoli = new JLabel("sukupuoli:");
        //rivi 15
        JButton emo3_4 = new JButton("emo3_4");
        JButton isa4_8 = new JButton("isa4_8");
        JTextArea fm = new JTextArea();
        //rivi 16
        JButton astutus = new JButton("Testiastuta kissat:");
        JButton emo4_8 = new JButton("emo4_8");
        JButton lisaaK = new JButton("Lisää uusi kissa");
        //rivi 17
        JTextArea kissa1 = new JTextArea();
        JTextArea kissa2 = new JTextArea();
        JButton lisaaT = new JButton("Lisää tietoja kissalle");
        
        
        //rivi 1
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 60;
        container.add(vasenreuna, c);
        container.add(isa4_1);
        container.add(hae);
        //rivi 2
        container.add(isa3_1);
        container.add(emo4_1);
        container.add(haku);
        //rivi 3
        container.add(isa2_1);
        container.add(emo3_1);
        container.add(isa4_2);
        container.add(tiedot);
        //rivi 4
        container.add(emo4_2);
        container.add(nimi);
        //rivi 5
        container.add(isa4_3);
        container.add(kNimi);
        //rivi 6
        container.add(isa3_2);
        container.add(emo4_3);
        container.add(isanNimi);
        //rivi 7
        container.add(isa1);
        container.add(emo2_1);
        container.add(emo3_1);
        container.add(isa4_4);
        container.add(iNimi);
        //rivi 8
        container.add(kissa);
        container.add(emo4_4);
        container.add(emonNimi);
        //rivi 9
        container.add(isa4_5);
        container.add(eNimi);
        //rivi 10
        container.add(emo1);
        container.add(isa2_2);
        container.add(isa3_3);
        container.add(emo4_5);
        container.add(rotu);
        //rivi 11
        container.add(emo3_3);
        container.add(isa4_6);
        container.add(kRotu);
        //rivi 12
        container.add(emo4_6);
        container.add(vari);
        //rivi 13
        container.add(isa4_7);
        container.add(kVari);
        //rivi 14
        container.add(emo2_2);
        container.add(isa3_4);
        container.add(emo4_7);
        container.add(sukupuoli);
        //rivi 15
        container.add(emo3_4);
        container.add(isa4_8);
        container.add(fm);
        //rivi 16
        container.add(astutus);
        container.add(emo4_8);
        container.add(lisaaK);
        //rivi 17
        container.add(kissa1);
        container.add(kissa2);
        container.add(lisaaT);

        
        //for(int i = 0; i < 68; i++){
        //    container.add(new JLabel("x"));
        //}
        
        
    }

    public JFrame getFrame() {
        return frame;
    }
    
    
}