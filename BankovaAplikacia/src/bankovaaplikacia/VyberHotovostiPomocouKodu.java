package bankovaaplikacia;
import javax.swing.JOptionPane; 

/**
 * @author matejmajerik
 */
public class VyberHotovostiPomocouKodu {
    
    public void overUzivatela(Ucet m, Ucet j, Ucet l) {
        
        // vypytanie kodu cez okienko
        int zadanyKod = Integer.parseInt(JOptionPane.showInputDialog(null, "Zadajte vygenerovaný kód:"));
        
        Ucet vybranyUcet = null;
        
  
        if (zadanyKod == m.getPomocouKodu()) {
            vybranyUcet = m;
        } else if (zadanyKod == j.getPomocouKodu()) {
            vybranyUcet = j;
        } else if (zadanyKod == l.getPomocouKodu()) {
            vybranyUcet = l;
        }
      
        if (vybranyUcet != null) {
            JOptionPane.showMessageDialog(null, "Kód bol správny. Presmerovávam do okna s výberom...");
            
            // zapis transakcie do suboru
            ZapisovacTransakcii z = new ZapisovacTransakcii();
            z.zapisPohyb(vybranyUcet.meno, "prihlásenie kódom", zadanyKod);
            
            // presmerovanie do noveho menu
            KonzoloveMenu menu = new KonzoloveMenu();
            menu.menuIbaPreVyber(vybranyUcet);
        } else { 
            JOptionPane.showMessageDialog(null, "Chyba: Tento kód neexistuje!");
        }
    }
}