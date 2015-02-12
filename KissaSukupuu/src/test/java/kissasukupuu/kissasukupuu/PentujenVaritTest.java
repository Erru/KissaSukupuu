
package kissasukupuu.kissasukupuu;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PentujenVaritTest {
    PentujenVarit pennut;
    Kissa emo;
    Kissa isa;
   
    @Before
    public void setUp() {
        emo = new Kissa("katti", "eIsä", "eEmo");
        isa = new Kissa("kolli", "iIsä", "iEmo");
        emo.lisaaVari("n 24");
        emo.getIsa().lisaaVari("a 22");
        emo.getEmo().lisaaVari("n");
        isa.lisaaVari("e");
        isa.getIsa().lisaaVari("d 22");
        isa.getEmo().lisaaVari("f 23");
        pennut = new PentujenVarit(emo, isa);
    }
    
    @Test
    public void voiTullaKuviollisiaToimii(){
        assertEquals(true, pennut.kuviollisia());
    }
    
    @Test
    public void voiTullaKuviottomiaToimii(){
        assertEquals(true, pennut.kuviottomia());
    }
    
    @Test
    public void voiTullaDiluutiotaToimii(){
        assertEquals(true, pennut.diluutioita());
    }
    
    @Test
    public void voiTullaTaysvarisiaToimii(){
        assertEquals(true, pennut.taysvari());
    }
    
    @Test
    public void voiTullaKlassistaTabbyaToimii(){
        assertEquals(true, pennut.klassinenTabby());
    }
    
}
