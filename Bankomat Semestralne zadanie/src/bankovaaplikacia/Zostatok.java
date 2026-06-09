/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankovaaplikacia;

/**
 *
 * @author matejmajerik
 */
public class Zostatok {
    
    public String aktualnyZostatok(Ucet ucet){
       
     
        return " Aktuálny zostatok na osobnom účte je: " + ucet.getStavUctu() + "€";
        
    }
}