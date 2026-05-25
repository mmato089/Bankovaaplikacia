package bankovaaplikacia;
import javax.swing.JOptionPane; 

public class Prihlasovanie {

    public Ucet overUzivatela(Ucet m, Ucet j, Ucet l) {
        
     
        String zadaneMeno = JOptionPane.showInputDialog(null, "Zadajte meno držiteľa karty:"); //vyskakujuce okienko
        if (zadaneMeno == null) return null; // Ak klikne na Storno
        
        Ucet vybranyUcet = null;
        
        if (zadaneMeno.equals(m.getMeno())) {
            vybranyUcet = m;
        } else if (zadaneMeno.equals(j.getMeno())) {
            vybranyUcet = j;
        } else if (zadaneMeno.equals(l.getMeno())) {
            vybranyUcet = l;
        }
        
        
        
        //kontrola zablokovnaeho uctu
        
        if(vybranyUcet.jeZablokovany()){
            JOptionPane.showMessageDialog(null, "Tento účet je zablokovaný! Prístup zamietnutý.");
                return null;
        }
        
        
        if (vybranyUcet != null) {
            JOptionPane.showMessageDialog(null, "Meno je správne.");
            
            for (int i = 1; i <= 3; i++) {
               
                
                String zadanyPinStr = JOptionPane.showInputDialog(null, "Zadajte svoj PIN (Pokus " + i + "/3):"); //vyksakujuce okienko
                if (zadanyPinStr == null) return null; // Ak klikne na Storno
                
                
                //overnie proti znakom
                if (!zadanyPinStr.matches("\\d+")) {
        JOptionPane.showMessageDialog(null, "Zadali ste neplatné znaky! Skúste to znova.");
        
        continue;
    }
                
                
                
                int zadanyPin = Integer.parseInt(zadanyPinStr);
                
                if (zadanyPin == vybranyUcet.getPin()) {
                    JOptionPane.showMessageDialog(null, "PIN je správny! Vitajte, " + vybranyUcet.getMeno());
                    return vybranyUcet; 
                } else {
                    JOptionPane.showMessageDialog(null, "Chybny PIN kód!");
                    if (i == 3) {
                        
                        vybranyUcet.setZablokovany(true);
                        
                        JOptionPane.showMessageDialog(null, "3-krát zadaný zlý PIN. Karta bola zablokovaná pre ďalšie použitie. Pre odblokovanie prosím kontaktujte zákaznícku podporu na čísle 0830 700 003 !");
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Uživateľ s týmto menom neexistuje.");
        }
        
        return null; 
    }
}