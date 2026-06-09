package bankovaaplikacia;
import javax.swing.JOptionPane; 


public class Prihlasovanie {

    public Ucet overUzivatela(String meno, int pin, Ucet m, Ucet j, Ucet l, Ucet t) {

        Ucet vybranyUcet = null;

        if (meno.equals(m.getMeno())) {
            vybranyUcet = m;
        } else if (meno.equals(j.getMeno())) {
            vybranyUcet = j;
        } else if (meno.equals(l.getMeno())) {
            vybranyUcet = l;
        }else if (meno.equals(t.getMeno())) {
            vybranyUcet = t;
        }

        if (vybranyUcet == null) {
            return null;
        }

        if (vybranyUcet.jeZablokovany()) {
            return null;
        }

        if (vybranyUcet.getPin() == pin) {
            vybranyUcet.setPocetPokusov(0);
            return vybranyUcet;
        }else{
            int pokusy = vybranyUcet.getPocetPokusov()+1;
            vybranyUcet.setPocetPokusov(pokusy);
            
            
            if (pokusy >= 3){
                vybranyUcet.setZablokovany(true);
            }
        }

        return null;
    }
}
