/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Konstruktorr;

/**
 *
 * @author Irkhamnawan
 */
public class Tumbuhan extends Organism {
    private String habitat;
    private String namaSpesies;
    protected String jenisBatang;

    /**
     * @return the habitat
     */
    public String getHabitat() {
        return habitat;
    }

    /**
     * @param habitat the habitat to set
     */
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    /**
     * @return the namaSpesies
     */
    public String getNamaSpesies() {
        return namaSpesies;
    }

    /**
     * @param namaSpesies the namaSpesies to set
     */
    public void setNamaSpesies(String namaSpesies) {
        this.namaSpesies = namaSpesies;
    }

      
        public Tumbuhan() {
            this.jenisBatang = "Berkambium";
        }
        
        public Tumbuhan(String jenisBatang) {
            this.jenisBatang = jenisBatang;
        }
    
    public String getJenisBatang() {
        return jenisBatang;
    }
    
}
