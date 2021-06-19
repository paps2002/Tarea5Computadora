/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.componentes;

/**
 *
 * @author papis
 */
public class Monitor {
    
    private String marca;
    private String Modelo;
    private int pulgadas;

    public Monitor() {
    }

    public Monitor(String marca, String Modelo, int pulgadas) {
        this.marca = marca;
        this.Modelo = Modelo;
        this.pulgadas = pulgadas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    @Override
    public String toString() {
        return "Monitor{" + "marca=" + marca + ", Modelo=" + Modelo + ", pulgadas=" + pulgadas + '}';
    }
    
    
}
