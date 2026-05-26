package bankovaaplikacia;
import javax.swing.JOptionPane; 

/**
 * @author matejmajerik
 */

public class VyberHotovostiPomocouKodu {
    
    public Ucet overKod(int zadanyKod, Ucet m, Ucet j, Ucet l) {

        if (zadanyKod == m.getPomocouKodu()) {
            return m;
        } else if (zadanyKod == j.getPomocouKodu()) {
            return j;
        } else if (zadanyKod == l.getPomocouKodu()) {
            return l;
        }

        return null;
    }
}
