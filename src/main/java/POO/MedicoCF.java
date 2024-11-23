/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author Dell 5421
 */
public class MedicoCF  extends superClaseCF {
    private  String EspecialidadCF; 
    private int aniosExperienciaCF;

    public MedicoCF(String EspecialidadCF, int aniosExperienciaCF, String NombreCF, int EdadCF, String DireccionCF) {
        super(NombreCF, EdadCF, DireccionCF);
        this.EspecialidadCF = EspecialidadCF;
        this.aniosExperienciaCF = aniosExperienciaCF;
    }

    public String getEspecialidadCF() {
        return EspecialidadCF;
    }

    public void setEspecialidadCF(String EspecialidadCF) {
        this.EspecialidadCF = EspecialidadCF;
    }

    public int getAniosExperienciaCF() {
        return aniosExperienciaCF;
    }

    public void setAniosExperienciaCF(int aniosExperienciaCF) {
        this.aniosExperienciaCF = aniosExperienciaCF;
    }

    
    
}
