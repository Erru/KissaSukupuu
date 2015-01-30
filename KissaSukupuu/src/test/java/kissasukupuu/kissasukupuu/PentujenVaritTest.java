
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
        emo = new Kissa("katti");
        isa = new Kissa("kolli");
        pennut = new PentujenVarit(emo, isa);
    }
    
    
}
