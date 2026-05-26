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
 
    public String vklad(Ucet ucet, int sumaNaVklad){
        
        if(sumaNaVklad <= 0 ){
            return "Chyba: Zadaná suma musí byť väčšia ako 0 €.";
        }
        
     
        ucet.setStavUctu(ucet.getStavUctu() + sumaNaVklad);
        
        ZapisovacTransakcii z = new ZapisovacTransakcii();
        z.zapisPohyb(ucet.getMeno(), "vklad", sumaNaVklad);
        
        return "Vklad bol úspešný, vložili ste " + sumaNaVklad + "€.";
    }
}
