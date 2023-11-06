/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Konstruktorr;

/**
 *
 * @author Irkhamnawan
 */
public class Organism {
    private String alatNafas;
    private String berkembangBiak;
    protected String jenisMakan;

    public String getAlatNafas() {
        return alatNafas;
    }

    public void setAlatNafas(String alatNafas) {
        this.alatNafas = alatNafas;
    }

    
    public String getBerkembangBiak() {
        return berkembangBiak;
    }

    public void setBerkembangBiak(String berkembangBiak) {
        this.berkembangBiak = berkembangBiak;
    }

    
        public Organism() {
            this.jenisMakan = "Insectivora";
        }
    
        public Organism(String jenisMakan) {
            this.jenisMakan = jenisMakan;
        }
        
        
    public String getJenisMakan() {
        return jenisMakan;
    }
    
    
}
