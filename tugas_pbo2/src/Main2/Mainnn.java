/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main2;

import Konstruktorr.Binatang;
import Konstruktorr.Vertebrata;
import Konstruktorr.Tumbuhan;
import Konstruktorr.Dikotil;

public class Mainnn {
    public static void main(String[] args) {
        Vertebrata kadal = new Vertebrata();
        kadal.setNama("Kadal");
        kadal.setNamaSpesies("Reptil");
        kadal.setAlatNafas("Paru-paru");
        kadal.setBerkembangBiak("Bertelur");
        kadal.setJumlahKaki(4);
        kadal.setMakanan("Serangga kecil");
        
        System.out.println("Nama hewan: "+ kadal.getNama());
        System.out.println("Spesies: "+ kadal.getNamaSpesies());
        System.out.println("Golongan: "+ kadal.getJenisMakan());
        System.out.println("Habitat: "+ kadal.getHabitat());
        System.out.println("Bernafas dengan "+ kadal.getAlatNafas());
        System.out.println("Berkembang biak dengan cara "+ kadal.getBerkembangBiak());
        System.out.println("Memiliki jumlah kaki "+ kadal.getJumlahKaki());
        System.out.println("Makanan nya yaitu "+ kadal.getMakanan());
    
        
        System.out.println("");
        System.out.println("=========================================");
        System.out.println("");
        
        
        Dikotil mangga = new Dikotil();
        mangga.setNama("Mangga");
        mangga.setNamaSpesies("Mangifera Indica");
        mangga.setAlatNafas("Daun");
        mangga.setBerkembangBiak("Generatif & Vegetatif");
        mangga.setHabitat("Darat");
        mangga.setBiji("dapat dibelah menjadi dua");
        
        System.out.println("Nama tumbuhan: " + mangga.getNama());
        System.out.println("Spesies: " + mangga.getNamaSpesies());
        System.out.println("Bernafas dengan " + mangga.getAlatNafas());
        System.out.println("Berkembang biak dengan " + mangga.getBerkembangBiak());
        System.out.println("Memiliki batang yang " + mangga.getJenisBatang());
        System.out.println("Memiliki habitat di " + mangga.getHabitat());
        System.out.println("Memiliki jenis biji yang " + mangga.getBiji());
    }
}
