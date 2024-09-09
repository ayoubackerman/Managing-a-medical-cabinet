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
public class Consultation {
    private String date;
    private String Diagnostic;

    public Consultation(String date, String Diagnostic) {
        this.date = date;
        this.Diagnostic = Diagnostic;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDiagnostic() {
        return Diagnostic;
    }

    public void setDiagnostic(String Diagnostic) {
        this.Diagnostic = Diagnostic;
    }

    @Override
    public String toString() {
        return "Consultation{" + "date=" + date + ", Diagnostic=" + Diagnostic + '}';
    }
    
    
    
    
}
