
package kissasukupuu.kissasukupuu;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class KissaTest {
    Kissa kissa;
    
    @Before
    public void setUp() {
        kissa = new Kissa("kisu");
    }
    
    @Test
    public void luoKissaToimiiVanhempienKanssa(){
        kissa = new Kissa("kisu", "kolli", "katti");
        assertEquals("kisu", kissa.getNimi());
        assertEquals("kolli", kissa.getIsa().getNimi());
        assertEquals("katti", kissa.getEmo().getNimi());
    }
    
    @Test
    public void getNimiToimii(){
        assertEquals("kisu", kissa.getNimi());
    }
    
    @Test
    public void lisaaIsaToimii(){
        kissa.lisaaIsa("kolli");
        assertEquals("kolli", kissa.getIsa().getNimi());
    }
    
    @Test
    public void lisaaEmoToimii(){
        kissa.lisaaEmo("katti");
        assertEquals("katti", kissa.getEmo().getNimi());
    }
    
    @Test
    public void lisaaRotuToimii(){
        kissa.lisaaRotu("EUR");
        assertEquals("EUR", kissa.getRotu());
    }
    
    @Test
    public void lisaaVariToimii(){
        kissa.lisaaVari("fs 24");
        assertEquals("fs 24", kissa.getVari().getVari());
    }
    
    @Test
    public void lisaaSukupuoliToimii(){
        kissa.lisaaSukupuoli("F");
        assertEquals("F", kissa.getSukupuoli());
    }
}
