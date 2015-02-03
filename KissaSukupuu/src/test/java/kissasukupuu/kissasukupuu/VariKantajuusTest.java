
package kissasukupuu.kissasukupuu;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class VariKantajuusTest {
    Kissa kissa;
    VariKantajuus kannettavat;
    
    @Before
    public void setUp() {
        Kissa kissa = new Kissa("kisu", "kolli", "katti");
        kissa.lisaaVari("n 24");
        kissa.getEmo().lisaaVari("n");
        kissa.getIsa().lisaaVari("e 22");
        kannettavat = new VariKantajuus(kissa);
    }
    
    @Test
    public void kantaakoTaysvariaToimii(){
        boolean arvo = kannettavat.kantaaTaysvaria();
        assertEquals(true, arvo);
        //ei toimi jostain syystä, stack over flow error
    }
    
}
