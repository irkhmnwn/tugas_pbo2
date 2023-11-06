/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Konstruktorr;

/**
 *
 * @author Irkhamnawan
 */
public class Binatang extends Organism {
    private String namaSpesies;
    protected String habitat;
    private int jumlahKaki;

    public String getNamaSpesies() {
        return namaSpesies;
    }

    public void setNamaSpesies(String namaSpesies) {
        this.namaSpesies = namaSpesies;
    }

    
    public String getHabitat() {
        return habitat;
    }

    public void setJumlahKaki(int jumlahKaki) {
            this.jumlahKaki = jumlahKaki;
        }
    
    public int getJumlahKaki() {
        return jumlahKaki;
    }
    
 
        public Binatang() {
            super();
        }
        
        public Binatang(String habitat) {
            this.habitat = habitat;
        }

   
}
