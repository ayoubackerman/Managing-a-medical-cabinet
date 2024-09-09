/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Hatem
 */
public class Prescription {
    private String Medicament;
    private String Analayse;
    private String ActeRadio ;

    public Prescription(String Medicament, String Analayse, String ActeRadio) {
        this.Medicament = Medicament;
        this.Analayse = Analayse;
        this.ActeRadio = ActeRadio;
    }

    public String getMedicament() {
        return Medicament;
    }

    public void setMedicament(String Medicament){
        this.Medicament = Medicament;
    }

    public String getAnalayse() {
        return Analayse;
    }

    public void setAnalayse(String Analayse) {
        this.Analayse = Analayse;
    }

    public String getActeRadio() {
        return ActeRadio;
    }

    public void setActeRadio(String ActeRadio) {
        this.ActeRadio = ActeRadio;
    }

    @Override
    public String toString() {
        return "Prescription{" + "Medicament=" + Medicament + ", Analayse=" + Analayse + ", ActeRadio=" + ActeRadio + '}';
    }
}
