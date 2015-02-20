package kissasukupuu.kissasukupuu;

import graafinenKayttoliittyma.Kayttoliittyma;
import javax.swing.SwingUtilities;

public class App 
{
    public static void main( String[] args ){
        Kissat kissat = new Kissat();
        Kayttoliittyma kayttoliittyma = new Kayttoliittyma(kissat);
        SwingUtilities.invokeLater(kayttoliittyma);
        
        PieniMuisti muisti = new PieniMuisti(kissat);
    }
}
