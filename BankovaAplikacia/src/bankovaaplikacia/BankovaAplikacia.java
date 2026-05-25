/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankovaaplikacia;
import java.util.Scanner;
/**
 *
 * @author matejmajerik
 */
public class BankovaAplikacia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    int option1 = 1;
    int option2 = 2;
     
     Ucet Matej = new Ucet(1234,"Matej Majerik", 250,1500,"SK22 1100 0000 7890",159753);
     Ucet Jozef = new Ucet(123456,"Jozef Mrkvicka",50000,150000, "SK22 0000 7891",753159);
     Ucet Lucia = new Ucet(4321,"Lucia Valova",2400,5000,"SK22 0000 7891",124578);
     
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1. Vlozte kartu");
        System.out.println("2. Vyber pomocou kodu");
        
   int option = sc.nextInt();
   
if (option == option1){
    
    Prihlasovanie systemPrihlasenia  = new Prihlasovanie();
    Ucet prihlasenyUcet = systemPrihlasenia.overUzivatela(Matej, Jozef, Lucia);
    
    
    if(prihlasenyUcet != null){
        
       KonzoloveMenu menu = new KonzoloveMenu(); // vytvorime sluzbu
       menu.menuPoPrihlaseni(prihlasenyUcet);
      
    }
    
}
else if(option == option2){
    
    //sluzba pre vyber kodom
    VyberHotovostiPomocouKodu vyberKodomSluzba = new VyberHotovostiPomocouKodu();
    vyberKodomSluzba.overUzivatela(Matej, Jozef, Lucia);
         
      }   
  }
}