/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankovaaplikacia;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author matejmajerik
 */
public class ZapisovacTransakcii {
    public void zapisPohyb(String meno, String operacia, int suma){
       try{
           //text bude dopisovat na koniec súboru a nezmaze stary (pomoc od AI)
            FileWriter fw = new FileWriter("transakcie.txt", true);
            
            fw.write(meno + " vykonal " + operacia + " v hodnote " + suma +" EUR.\n");
            
            fw.close();
       } catch(IOException e){
           System.out.println("Chyba zapisu");
       }
        
    }
}
