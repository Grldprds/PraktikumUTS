/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author Geral
 */
class Balok {
    int panjang;
    int lebar;
    int tinggi;

    public Balok() {
        panjang = 1;
        lebar = 1;
        tinggi = 1;
    }

    public Balok(int panjangbaru, int lebarbaru, int tinggibaru) {
        panjang = panjangbaru;
        lebar = lebarbaru;
        tinggi = tinggibaru;
    }

    public int getLuas() {
        return 2 * ((panjang * lebar)+(panjang * tinggi)+(lebar * tinggi));
    }

    public int getKeliling() {
        return 4 * (panjang + lebar + tinggi);
    }
    
    public int getVolume(){
        return panjang * lebar * tinggi;
    }

    public void setPanjang(int panjangbaru) {
        panjang = panjangbaru;
    }

    public void setLebar(int lebarbaru) {
        lebar = lebarbaru;
    }
    
    public void setTinggi(int tinggibaru) {
        tinggi = tinggibaru;
    }
}
public class soal4 {
     public static void main(String[] args) {
        Balok balok1 = new Balok();

        System.out.println("Balok dengan panjang : " + balok1.panjang + ", lebar : " + balok1.lebar + " dan tinggi : " + balok1.tinggi + ". Luasnya : " + balok1.getLuas() + ", sedangkan kelilingnya : " + balok1.getKeliling() + " dan volumenya : " + balok1.getVolume());

        Balok balok2 = new Balok();

        balok2.setPanjang(30);
        balok2.setLebar(40);
        balok2.setTinggi(50);

        System.out.println("Balok dengan panjang : " + balok2.panjang + ", lebar : " + balok2.lebar + " dan tinggi : " + balok2.tinggi + ". Luasnya : " + balok2.getLuas() + ", sedangkan kelilingnya : " + balok2.getKeliling() + " dan volumenya : " + balok2.getVolume());


        Balok balok3 = new Balok();

        balok3.setPanjang(25);
        balok3.setLebar(35);
        balok3.setTinggi(45);

        System.out.println("Balok dengan panjang : " + balok3.panjang + ", lebar : " + balok3.lebar + " dan tinggi : " + balok3.tinggi + ". Luasnya : " + balok3.getLuas() + ", sedangkan kelilingnya : " + balok3.getKeliling() + " dan volumenya : " + balok3.getVolume());

    }
}
