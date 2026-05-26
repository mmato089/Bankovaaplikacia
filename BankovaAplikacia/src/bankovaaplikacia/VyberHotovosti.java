/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankovaaplikacia;

/**
 *
 * @author matejmajerik
 */

// Metoda vezme ucet, sumu na vyber a vykona jednoduchu matemtatiku,v ysledok vrati ako String
public class VyberHotovosti {
    public String vyber(Ucet ucet, int sumaNaVyber){
        
      int aktualnyZostatok = ucet.getStavUctu();
      
      if(aktualnyZostatok >=sumaNaVyber){
      
      ucet.setStavUctu(aktualnyZostatok - sumaNaVyber);
      
      ZapisovacTransakcii z = new ZapisovacTransakcii();
      z.zapisPohyb(ucet.getMeno(), "vyber", sumaNaVyber);
      
      return " Výber bol úspešný, Vybrali ste :" +sumaNaVyber +"€";
    }
      else {
          return"Nedostatok finančných prostriedkov na bankovom účte";
        }
    }
    }