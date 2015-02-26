
package kissasukupuu.kissasukupuu;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class SukukatoLaskuriTest {
    SukukatoLaskuri laskuri;
    ArrayList<String> kissat;
    
    @Before
    public void setUp() {
        laskuri = new SukukatoLaskuri();
        kissat = new ArrayList<>();
        Kissa kissa1 = new Kissa("kisu");
        Kissa kissa2 = new Kissa("misu");
        Kissa kissa3 = new Kissa("kolli");
        Kissa kissa4 = new Kissa("katti");
        Kissa kissa5 = new Kissa("kolli");
        Kissa kissa6 = new Kissa("katti");
        Kissa kissa7 = new Kissa("mirri");
        Kissa kissa8 = new Kissa("murri");
        Kissa kissa9 = new Kissa("matti");
        Kissa kissa10 = new Kissa("mutti");
        kissat.add(kissa1.getNimi());
        kissat.add(kissa2.getNimi());
        kissat.add(kissa3.getNimi());
        kissat.add(kissa4.getNimi());
        kissat.add(kissa5.getNimi());
        kissat.add(kissa6.getNimi());
        kissat.add(kissa7.getNimi());
        kissat.add(kissa8.getNimi());
        kissat.add(kissa9.getNimi());
        kissat.add(kissa10.getNimi());
        
    }
    
    @Test
    public void uniikitNimetToimii(){
        laskuri.uniikitNimet(kissat);
        assertEquals(8, laskuri.getUniikitNimet().size());
    }
    
    @Test
    public void laskeSukukatokerroinToimii(){
        assertEquals(0.8, laskuri.getSukukatokerroin(kissat), 0.001);
    }
    
    
}
