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
    private String NroHistorialCF;
    private  String EnfermedaCF; 

    public PacienteCF(String NroHistorialCF, String EnfermedaCF, String NombreCF, String EdadCF, String DireccionCF) {
        super(NombreCF, EdadCF, DireccionCF);
        this.NroHistorialCF = NroHistorialCF;
        this.EnfermedaCF = EnfermedaCF;
    }

    public String getNroHistorialCF() {
        return NroHistorialCF;
    }

    public void setNroHistorialCF(String NroHistorialCF) {
        this.NroHistorialCF = NroHistorialCF;
    }

    public String getEnfermedaCF() {
        return EnfermedaCF;
    }

    public void setEnfermedaCF(String EnfermedaCF) {
        this.EnfermedaCF = EnfermedaCF;
    }

  
    
    
}
