package bankovaaplikacia;

/**
 *
 * @author matejmajerik
 */
public class ZostatokSporiaciUcet {
    
    public String aktualnyZostatokSporiaci(Ucet ucet){
        
        int stavSporiacehoUctu = ucet.getSporiaciUcet();
      
        return "Aktuálny zostatok na sporiacom účte je: " + stavSporiacehoUctu + "€";
    }
}
