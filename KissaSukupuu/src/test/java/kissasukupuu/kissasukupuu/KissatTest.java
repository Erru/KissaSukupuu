
package kissasukupuu.kissasukupuu;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class KissatTest {
    Kissat kaikki;
    
    
    @Before
    public void setUp() {
        kaikki = new Kissat();
        
    }
    
   @Test
   public void lisaaKissaToimii(){
       kaikki.lisaaKissa(new Kissa("kisu"));
       assertEquals(1,kaikki.getKissat().size());
   }
   
   @Test
   public void poistaKissaToimii(){
       kaikki.lisaaKissa(new Kissa("kisu"));
       Kissa kolli = new Kissa("kolli");
       kaikki.lisaaKissa(kolli);
       kaikki.poistaKissa(kolli);
       assertEquals(1, kaikki.getKissat().size());
   }
}
