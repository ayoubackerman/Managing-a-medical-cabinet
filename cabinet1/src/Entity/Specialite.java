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
public class Specialite {
    
   private String Specialite;
   private String Nom_du_Specialiste;

    public Specialite(String Specialite, String Nom_du_Specialiste) {
        this.Specialite = Specialite;
        this.Nom_du_Specialiste = Nom_du_Specialiste;
    }

    public String getSpecialite() {
        return Specialite;
    }

    public void setSpecialite(String Specialite) {
        this.Specialite = Specialite;
    }

    public String getNom_du_Specialiste() {
        return Nom_du_Specialiste;
    }

    public void setNom_du_Specialiste(String Nom_du_Specialiste) {
        this.Nom_du_Specialiste = Nom_du_Specialiste;
    }

    @Override
    public String toString() {
        return "Specialite{" + "Specialite=" + Specialite + ", Nom_du_Specialiste=" + Nom_du_Specialiste + '}';
    }
    
}
