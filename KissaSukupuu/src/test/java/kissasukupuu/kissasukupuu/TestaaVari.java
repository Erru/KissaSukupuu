
package kissasukupuu.kissasukupuu;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class TestaaVari {
    Vari vari;
    
    @Before
    public void setUp() {
        vari = new Vari("fs 24");
    }
    
    @Test
    public void getPohjavariToimii(){
        assertEquals("fs", vari.getPohjavari());
    }
    
    @Test
    public void getPohjavariToimiiIlmanVaria(){
        vari = new Vari("X");
        assertEquals("X", vari.getPohjavari());
    }
    
    @Test
    public void getKuvioToimii(){
        assertEquals("24", vari.getKuvio());
    }
    
    @Test
    public void getKuvioToimiiKuviottomalla(){
        vari = new Vari("fs");
        assertEquals("kuvioton", vari.getKuvio());
    }
    
    @Test
    public void getKuvioToimiiIlmanVaria(){
        vari = new Vari("X");
        assertEquals("X", vari.getKuvio());
    }
    
}
