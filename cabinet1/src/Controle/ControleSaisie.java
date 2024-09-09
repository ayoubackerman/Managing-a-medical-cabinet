
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

/**
 *
 * @author Hatem
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher; 
import java.util.regex.Pattern; 

public class ControleSaisie {
     public  boolean isValid(String email) 
    { 
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ //verifier la strecture de l'adresse email
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$"; 
                              
        Pattern pat = Pattern.compile(emailRegex); 
        if (email == null) 
            return false; 
        return pat.matcher(email).matches(); 
    } 
    public boolean ValidString(String s)
{
    if(!(s.matches ("[a-zA-Z]+\\.?")) || ("".equals(s))){ //tester la validation du chaine de caractere
   return false;  
    }
         return true;
}
         
 public boolean TelVerif(String  x){
 if((x.length()>8)&&(x.length()<8))//tester la longueur du chaine
    
         return false;
 
         return true; 
 }
     
     public  boolean dateValidation(String date)
    {
      boolean status = false;
    if (checkDate(date)) {
      DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");//verifier la format du date
      dateFormat.setLenient(false);
      try {
        dateFormat.parse(date);
        status = true;
      } catch (Exception e) {
        status = false;
      }
    }
    return status;
    }
    
    static boolean checkDate(String date) {
    String pattern = "(0?[1-9]|[12][0-9]|3[01])\\/(0?[1-9]|1[0-2])\\/([0-9]{4})";//verifier la date
    boolean test = false;
    if (date.matches(pattern)) {
      test = true;
    }
    return test;
  }
    

public boolean GenreValid(String Ch)
{
 return (Ch.equals("Homme"))||(Ch.equals("Femme"))||(Ch.equals("Autre"));//verifier le genre du patient 
}

}
 
 
   
    

