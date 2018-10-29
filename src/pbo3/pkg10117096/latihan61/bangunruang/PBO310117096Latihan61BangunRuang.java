/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117096.latihan61.bangunruang;

/**
 *
 * @author 
 * Nama         : Miftah Muhammad Sidqi
 * NIM          : 10117096
 * Kelas        : PBO 3
 * Deskripsi    : Program ini berisi program untuk menghitung bangun ruang
 */
public class PBO310117096Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bola b = new Bola();
        Tabung t = new Tabung();
        Kerucut k = new Kerucut();
        
        b.setR(7);
        System.out.println("Volume Bola : " + b.hitungVolume());
        
        t.setH(21);
        t.setR(10);
        System.out.println("Volume Tabung : " + t.hitungVolume());
        
        k.setR(14);
        k.setT(9);
        k.hitungSisiSelimut();
        System.out.println("Volume Kerucut : " + k.hitungVolume());
    }
    
}
