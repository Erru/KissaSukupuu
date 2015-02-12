package kissasukupuu.kissasukupuu;

import graafinenKayttoliittyma.Kayttoliittyma;
import javax.swing.SwingUtilities;

public class App 
{
    public static void main( String[] args ){
        Kissat kissat = new Kissat();
        Kayttoliittyma kayttoliittyma = new Kayttoliittyma(kissat);
        SwingUtilities.invokeLater(kayttoliittyma);
        
        Kissa kisu1 = new Kissa("Minttunen", "isukki", "mamma");
        kisu1.lisaaSukupuoli("F");
        kisu1.lisaaRotu("EUR");
        kisu1.lisaaVari("fs 24");
        
        kissat.lisaaKissa(kisu1);
        kissat.lisaaKissa(kisu1.getIsa());
        kissat.lisaaKissa(kisu1.getEmo());
    }
}
