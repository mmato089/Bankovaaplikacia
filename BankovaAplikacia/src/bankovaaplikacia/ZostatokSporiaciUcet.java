package bankovaaplikacia;

/**
 *
 * @author matejmajerik
 */
public class ZostatokSporiaciUcet {
    
    public String aktualnyZostatokSporiaci(Ucet ucet){
        
        int stavSporiacehoUctu = ucet.getSporiaciUcet();
        
        ZapisovacTransakcii z = new ZapisovacTransakcii();
        z.zapisPohyb(ucet.getMeno(), "zobrazenie stavu sporiaceho účtu", stavSporiacehoUctu);
        
        // výstup
        return "Aktuálny zostatok na sporiacom účte je: " + stavSporiacehoUctu + "€";
    }
}
