
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
        assertEquals(true, kannettavat.kantaaTaysvaria());
    }
    
    @Test
    public void kantaakoDiluutiotaToimii(){
        assertEquals(true, kannettavat.kantaaDiluutiota());
    }
    
    @Test
    public void kantaakoKuviottomuuttaToimii(){
        assertEquals(true, kannettavat.kantaaKuviottomuutta());
    }
    
    @Test
    public void kantaakoKuviollisuuttaToimii(){
        assertEquals(true, kannettavat.kantaaKuviollisuutta());
    }
    
    @Test
    public void kantaakoTabbyaToimii(){
        assertEquals(true, kannettavat.kantaaTabbya());
        boolean arvo = kannettavat.kantaaTaysvaria();
        assertEquals(true, arvo);
    }
    
}
