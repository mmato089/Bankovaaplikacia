package bankovaaplikacia;
import javax.swing.JOptionPane; 

/**
 * @author matejmajerik
 */
public class KonzoloveMenu {
    
    public void menuPoPrihlaseni(Ucet prihlasenyUcet){
        Zostatok zostatokSluzba = new Zostatok();
        VyberHotovosti vyberSluzba = new VyberHotovosti();
        VkladHotovosti vkladSluzba = new VkladHotovosti();
        
        boolean pokracovat = true;
        
        // Cyklus drží používateľa v menu, kým nezvolí odchod (4)
        while (pokracovat) {
            
            // Číslo operácie (pridaná možnosť 4. Odist)
            int volba = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "Vyberte operáciu:\n1. Výber hotovosti\n2. Vklad hotovosti\n3. Stav účtu\n4. Odísť"));
            
            if(volba == 1){
                // Vypýtame si sumu na výber
                int sumaVyber = Integer.parseInt(JOptionPane.showInputDialog(null, "Zadajte sumu, ktorú chcete vybrať:"));
                
                // Spustíme tvoj výber
                String vysledokVyberu = vyberSluzba.vyber(prihlasenyUcet, sumaVyber);
                JOptionPane.showMessageDialog(null, vysledokVyberu);
               
            } else if(volba == 2){
                // suma na vklad
                int sumaVklad = Integer.parseInt(JOptionPane.showInputDialog(null, "Zadajte sumu, ktorú chcete vložiť:"));
                
                // spustenie vkladu
                String vysledokVkladu = vkladSluzba.vklad(prihlasenyUcet, sumaVklad);
                JOptionPane.showMessageDialog(null, vysledokVkladu);
               
            } else if(volba == 3){
                
                zostatokSluzba.aktualnyZostatok(prihlasenyUcet);
                
                String kompletneInfo  = "====== INFORMACIE O ÚČTE ======\n"+
                      "Majiteľ: "+prihlasenyUcet.meno +"\n"+
                       "Číslo účtu: " + prihlasenyUcet.cisloUctu + "\n" +
                       "----------------------------------------\n"+       
                        "Osobný účet: " + prihlasenyUcet.stavUctu + "€\n"+
                        "Sporiaci účet: " + prihlasenyUcet.sporiaciUcet + "€\n"+ 
                        "==============================";
                
                // zobrazenie stavu účtu
                JOptionPane.showMessageDialog(null, kompletneInfo);
                
            } else if(volba == 4){
                // bezpecne ukoncenie cyklu
                JOptionPane.showMessageDialog(null, "Ďakujeme, že používate naše služby. Dovidenia!");
                pokracovat = false; 
                
            } else { 
                JOptionPane.showMessageDialog(null, "Neplatná voľba.");
            }
        }
    }
    
    public void menuIbaPreVyber(Ucet prihlasenyUcet) {
        Zostatok zostatokSluzba = new Zostatok();
        VyberHotovosti vyberSluzba = new VyberHotovosti();
        
        boolean pokracovat = true;
        
        // Cyklus drží používateľa s kódom v menu, kým nezvolí odchod (2)
        while (pokracovat) {
            
            // Používateľ s kódom má na výber iba Výber alebo Odchod
            int volba = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "Vyberte operáciu:\n1. Výber hotovosti\n2. Odísť"));
            
            if (volba == 1) {
                // zostatok pred výberom
                JOptionPane.showMessageDialog(null, zostatokSluzba.aktualnyZostatok(prihlasenyUcet));
                
                // Vyber Penazi
                int sumaVyber = Integer.parseInt(JOptionPane.showInputDialog(null, "Zadajte sumu, ktorú chcete vybrať:"));
                
                // zapis do suboru a uskutočnenie výberu
                String vysledokVyberu = vyberSluzba.vyber(prihlasenyUcet, sumaVyber);
                JOptionPane.showMessageDialog(null, vysledokVyberu);
                
            } else if (volba == 2) {
                // Ukončenie pre výber kódom
                JOptionPane.showMessageDialog(null, "Kód bol uzavretý. Dovidenia!");
                pokracovat = false;
                
            } else {
                JOptionPane.showMessageDialog(null, "Neplatná voľba.");
            }
        }
    }
}