package kissasukupuu.kissasukupuu;

import graafinenKayttoliittyma.Kayttoliittyma;
import javax.swing.SwingUtilities;

public class App 
{
    public static void main( String[] args ){
        Kayttoliittyma kayttoliittyma = new Kayttoliittyma();
        SwingUtilities.invokeLater(kayttoliittyma);
    }
}
