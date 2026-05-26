/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankovaaplikacia;

import java.util.Scanner;

/**
 *
 * @author matejmajerik
 */


public class Ucet {

    private boolean zablokovany = false;

    private int pin;
    private String meno;
    private int stavUctu;
    private int sporiaciUcet;
    private String cisloUctu;
    private int pomocouKodu;

    public Ucet(int pin, String meno, int stavUctu, int sporiaciUcet, String cisloUctu, int pomocouKodu) {
        this.pin = pin;
        this.meno = meno;
        this.stavUctu = stavUctu;
        this.sporiaciUcet = sporiaciUcet;
        this.cisloUctu = cisloUctu;
        this.pomocouKodu = pomocouKodu;
    }

    // GETTERY

    public int getPin() {
        return pin;
    }

    public String getMeno() {
        return meno;
    }

    public int getStavUctu() {
        return stavUctu;
    }

    public int getSporiaciUcet() {
        return sporiaciUcet;
    }

    public String getCisloUctu() {
        return cisloUctu;
    }

    public int getPomocouKodu() {
        return pomocouKodu;
    }

    public boolean jeZablokovany() {
        return zablokovany;
    }

    // SETTERY

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public void setStavUctu(int stavUctu) {
        this.stavUctu = stavUctu;
    }

    public void setSporiaciUcet(int sporiaciUcet) {
        this.sporiaciUcet = sporiaciUcet;
    }

    public void setCisloUctu(String cisloUctu) {
        this.cisloUctu = cisloUctu;
    }

    public void setPomocouKodu(int pomocouKodu) {
        this.pomocouKodu = pomocouKodu;
    }

    public void setZablokovany(boolean zablokovany) {
        this.zablokovany = zablokovany;
    }
}
