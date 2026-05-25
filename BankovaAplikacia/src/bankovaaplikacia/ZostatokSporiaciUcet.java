package bankovaaplikacia;

/**
 *
 * @author matejmajerik
 */
public class ZostatokSporiaciUcet {
    
    public String aktualnyZostatokSporiaci(Ucet ucet){
        
        
        int stavSporiacehoUctu = ucet.getSporiaciUcet();
        
        ZapisovacTransakcii z = new ZapisovacTransakcii();
      z.zapisPohyb(ucet.meno, "zobrazil stavu osobného účtu", stavSporiacehoUctu);
        
        
        // zapis na vystup
        return " Aktualny zostatok na sporiacom účte je: " + ucet.sporiaciUcet + "€";
    }
}