
package kissasukupuu.kissasukupuu;

import java.util.ArrayList;

/**
 *Säilyttää muistissa pienen määrän kissoja sukupuun testailua varten.
 * @author Erja
 */
public class PieniMuisti {
    ArrayList<Kissa> lista;
    Kissa Didi;
    Kissa sinfonia;
    Kissa bette;
    Kissa utopia;
    Kissa siniminttu;
    Kissa macho;
    Kissa pupu;
    Kissa rambler;
    Kissa marilyn;
    
    
    public PieniMuisti(Kissat kissat){
        this.lista = kissat.getKissat();
        
        //tähän lisäys metodeja
        this.NutunSukupuu();
    }
    
    /**
     * Asettelee luotujen apumetodien avulla pienen määrän kissoja ohjelmalle.
     */
    
    public void NutunSukupuu(){
        this.NuttuJaVanhemmat();
        this.DidinVanhemmat();
        this.sinfonianVanhemmat();
        this.betenVanhemmat();
        this.utopianVanhemmat();
    }
    
    /**
     * Lisää kissat Nuttu ja Minttu ja Didille tietoja.
     */
    
    public void NuttuJaVanhemmat(){
        Kissa Nuttu = new Kissa("Errun Hehkeä herttuatar");
        Kissa Minttu = new Kissa("Minttunen"); //ei vanhempia, koska noviisi
        Didi = new Kissa("Pinkkitassun Dionysos");
        
        //Nutulle vanhemmat
        Nuttu.lisaaEmo(Minttu);
        Nuttu.lisaaIsa(Didi);
        //värit
        Nuttu.lisaaVari("e 24");
        Minttu.lisaaVari("fs 24");
        Didi.lisaaVari("d 24");
        //rodut
        Nuttu.lisaaRotu("EUR");
        Minttu.lisaaRotu("EUR");
        Didi.lisaaRotu("EUR");
        //sukupuolet
        Nuttu.lisaaSukupuoli("F");
        Minttu.lisaaSukupuoli("F");
        Didi.lisaaSukupuoli("M");
        
        lista.add(Nuttu);
        lista.add(Minttu);
        
    }
    
    /**
     * Luo Didin vanhemmat ja lisää Didin.
     */
    
    public void DidinVanhemmat(){
        sinfonia = new Kissa("Mäkikatin Sinfonia");
        bette = new Kissa("Pinkkitassun Bette");
        
        Didi.lisaaEmo(bette);
        Didi.lisaaIsa(sinfonia);
        
        //rotu
        sinfonia.lisaaRotu("EUR");
        bette.lisaaRotu("EUR");
        //väri
        sinfonia.lisaaVari("a 24");
        bette.lisaaVari("f 22");
        //sukupuoli
        sinfonia.lisaaSukupuoli("M");
        bette.lisaaSukupuoli("F");
        
        lista.add(Didi);
    }
    
    /**
     * Lisää sinfonian ja luo sille vanhemmat.
     */
    
    public void sinfonianVanhemmat(){
        utopia = new Kissa("Mäkikatin Utopia");
        siniminttu = new Kissa("Mäkikatin Siniminttu");
        
        sinfonia.lisaaEmo(siniminttu);
        sinfonia.lisaaIsa(utopia);
        
        //rotu
        utopia.lisaaRotu("EUR");
        siniminttu.lisaaRotu("EUR");
        //väri
        utopia.lisaaVari("a 24");
        siniminttu.lisaaVari("a 24");
        //sukupuoli
        utopia.lisaaSukupuoli("M");
        siniminttu.lisaaSukupuoli("F");
        
        lista.add(sinfonia);
        lista.add(siniminttu);
    }
    
    /**
     * Lisää Beten ja luo sille vanhemmat.
     */
    
    public void betenVanhemmat(){
        macho = new Kissa("Silkkiturkin Menevä Macho");
        pupu = new Kissa("Feronian Magnolia Purpurea");
        
        bette.lisaaEmo(pupu);
        bette.lisaaIsa(macho);
        
        //rotu
        macho.lisaaRotu("EUR");
        pupu.lisaaRotu("EUR");
        //väri
        macho.lisaaVari("d 22");
        pupu.lisaaVari("f 22");
        //sukupuoli
        macho.lisaaSukupuoli("M");
        pupu.lisaaSukupuoli("F");
        
        lista.add(bette);
        lista.add(macho);
        lista.add(pupu);
    }
    
    /**
     * Lisää Utopian ja luo sille vanhemmat, jotka myös lisätään.
     */
    
    public void utopianVanhemmat(){
        rambler = new Kissa("Delicatin Rambler");
        marilyn = new Kissa("Mäkikatin Marilyn");
        
        utopia.lisaaEmo(marilyn);
        utopia.lisaaIsa(rambler);
        
        //rotu
        marilyn.lisaaRotu("EUR");
        rambler.lisaaRotu("EUR");
        //väri
        marilyn.lisaaVari("a 24");
        rambler.lisaaVari("a 24");
        //sukupuoli
        rambler.lisaaSukupuoli("M");
        marilyn.lisaaSukupuoli("F");
        
        lista.add(utopia);
        lista.add(rambler);
        lista.add(marilyn);
    }
    
}
