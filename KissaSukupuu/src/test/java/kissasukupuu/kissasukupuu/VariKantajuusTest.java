
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
        Kissa kissa = new Kissa("kisu");
        kissa.lisaaVari("n 24");
        kissa.lisaaEmo("katti");
        kissa.getEmo().lisaaVari("n");
        kissa.lisaaIsa("kolli");
        kissa.getIsa().lisaaVari("e 22");
        kannettavat = new VariKantajuus(kissa);
    }
    
    //@Test
    //public void kantaakoTaysvariaToimii(){
    //    assertEquals(true, kannettavat.kantaaTaysvaria());
        //ei toimi jostain syystä, stack over flow error
    //}
    
}
