
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
    ArrayList<Kissa> kissat;
    
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
        kissat.add(kissa1);
        kissat.add(kissa2);
        kissat.add(kissa3);
        kissat.add(kissa4);
        kissat.add(kissa5);
        kissat.add(kissa6);
        kissat.add(kissa7);
        kissat.add(kissa8);
        kissat.add(kissa9);
        kissat.add(kissa10);
        
    }
    
    @Test
    public void uniikitNimetToimii(){
        laskuri.uniikitNimet(kissat);
        assertEquals(8, laskuri.getUniikitNimet().size());
    }
    
    @Test
    public void laskeSukukatokerroinToimii(){
        laskuri.uniikitNimet(kissat);
        laskuri.laskeSukukatokerroin();
        assertEquals(0.8, laskuri.getSukukatokerroin(), 0.001);
    }
    
    
}
