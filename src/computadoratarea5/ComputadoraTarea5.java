/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computadoratarea5;

import ico.fes.componentes.CPU;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Teclado;
import ico.fes.computadora.PC;

/**
 *
 * @author papis
 */
public class ComputadoraTarea5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PC pcN1 = new PC();
        pcN1.setCpu(new CPU("Intel", "Core i5", 1));
        Monitor[] tmpMonitors = new Monitor[2];
        tmpMonitors[0] = new Monitor("HP", "N246V", 24);
        tmpMonitors[1] = new Monitor("HP", "V194", 18);
        pcN1.setMonitores(tmpMonitors);
        pcN1.setMouse(new Mouse("Logitech", "G502", "Agarre de palma"));
        pcN1.setTeclado(new Teclado("Logitech", "Prodigy G213", 120, 13));
        
        System.out.println(pcN1);
        System.out.println(pcN1.getMonitores()[0]);
        System.out.println(pcN1.getMonitores()[1]);
        
        PC pcN2 = new PC(0, 0, null, new Mouse("Acer", "Wireless optical mouse", "Agarre de palma"), new Teclado("Logitech", "K400 PLUS", 100, 7), new CPU("AMD", "Ryzen 7", 3));
        System.out.println(pcN2);
       
    }
    
}
