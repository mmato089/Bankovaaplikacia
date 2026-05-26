package bankovaaplikacia;
import javax.swing.JOptionPane; 


public class Prihlasovanie {

    public Ucet overUzivatela(String meno, int pin, Ucet m, Ucet j, Ucet l) {

        Ucet vybranyUcet = null;

        if (meno.equals(m.getMeno())) {
            vybranyUcet = m;
        } else if (meno.equals(j.getMeno())) {
            vybranyUcet = j;
        } else if (meno.equals(l.getMeno())) {
            vybranyUcet = l;
        }

        if (vybranyUcet == null) {
            return null;
        }

        if (vybranyUcet.jeZablokovany()) {
            return null;
        }

        if (vybranyUcet.getPin() == pin) {
            return vybranyUcet;
        }

        return null;
    }
}
