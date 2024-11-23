/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author Dell 5421
 */
public class PacienteCF extends superClaseCF {
    private int NroHistorialCF;
    private  String EnfermedaCF; 

    public PacienteCF(int NroHistorialCF, String EnfermedaCF, String NombreCF, int EdadCF, String DireccionCF) {
        super(NombreCF, EdadCF, DireccionCF);
        this.NroHistorialCF = NroHistorialCF;
        this.EnfermedaCF = EnfermedaCF;
    }

    public int getNroHistorialCF() {
        return NroHistorialCF;
    }

    public void setNroHistorialCF(int NroHistorialCF) {
        this.NroHistorialCF = NroHistorialCF;
    }

    public String getEnfermedaCF() {
        return EnfermedaCF;
    }

    public void setEnfermedaCF(String EnfermedaCF) {
        this.EnfermedaCF = EnfermedaCF;
    }

    
    
    
}
