/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankovaaplikacia;

/**
 *
 * @author matejmajerik
 */
public class VkladHotovosti {
 
    // metoda vezme prihlaseny ucet a vrati vysledok string
    public String vklad(Ucet ucet, int sumaNaVklad){
        
        if(sumaNaVklad <= 0 ){
            return "Chyba: Zadaná suma musí byť vačšia ako 0 €.";
        }
        
        ucet.stavUctu += sumaNaVklad;
        
        ZapisovacTransakcii z = new ZapisovacTransakcii();
      z.zapisPohyb(ucet.meno, "vklad", sumaNaVklad);
        
        return "Vklad bol úspešný, vložili ste "+ sumaNaVklad + "€.";
    }
}
