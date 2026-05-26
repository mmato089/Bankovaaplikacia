/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


package bankovaaplikacia;

public class BankovaAplikacia {

    public static void main(String[] args) {

        Ucet Matej = new Ucet(1234, "Matej Majerik", 250, 1500, "SK22 1100 0000 7890", 159753);
        Ucet Jozef = new Ucet(123456, "Jozef Mrkvicka", 50000, 150000, "SK22 0000 7891", 753159);
        Ucet Lucia = new Ucet(4321, "Lucia Valova", 2400, 5000, "SK22 0000 7891", 124578);

        // SPUSTENIE GUI
        java.awt.EventQueue.invokeLater(() -> {
            new GUI().setVisible(true);
        });
    }
}
