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
import java.util.regex.Matcher; 
import java.util.regex.Pattern; 
public class Dossier {
    private int DossoerID;
    private String Nom;
    private String Prenom;
    private String DateNai ;
    private int  Tel;
    private String Email;

    public Dossier(int DossoerID, String Nom, String Prenom, String DateNai, int Tel,String Email) {
        this.DossoerID = DossoerID;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.DateNai = DateNai;
        this.Tel = Tel;
        this.Email=Email;
    }

    public int getDossoerID() {//La méthode get renvoie la valeur de la variable 
        return DossoerID;
    }

    public void setDossoerID(int DossoerID) {//la méthode set définit la valeur
        this.DossoerID = DossoerID;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public String getDateNai() {
        return DateNai;
    }

    public void setDateNai(String DateNai) {
        this.DateNai = DateNai;
    }

    public int getTel() {
        return Tel;
    }

    public void setTel(int Tel) {
        this.Tel = Tel;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    @Override
    public String toString() {
        return "Dossier{" + "DossoerID=" + DossoerID + ", Nom=" + Nom + ", Prenom=" + Prenom + ", DateNai=" + DateNai + ", Tel=" + Tel + ", Email=" + Email + '}';
    }
    
}
