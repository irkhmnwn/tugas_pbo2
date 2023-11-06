/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Konstruktorr;

/**
 *
 * @author Irkhamnawan
 */
public class Vertebrata extends Binatang {
    
    private String nama;
    private String makanan;
    
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    
    public String getMakanan() {
        return makanan;
    }

    public void setMakanan(String makanan) {
        this.makanan = makanan;
    }
    
    
        public Vertebrata() {
                super("Darat");
        }
        
        public Vertebrata(String jenisMakan) {
            this.jenisMakan = jenisMakan;
        }
        
}
        
