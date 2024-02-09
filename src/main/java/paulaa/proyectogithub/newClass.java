/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paulaa.proyectogithub;

/**
 *
 * @author AlumnoMañana
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*Cambios*/
public class newClass {
    public static void main(String[] args) {
        // Ejemplo de uso con código postal español
        String codigoPostal = "65670";
        Pattern pattern = Pattern.compile("^[0-5][0-9]{4}$");
        Matcher matcher = pattern.matcher(codigoPostal);
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("El código postal es válido.");
        } else {
            System.out.println("El código postal no es válido.");
        }
    }
}
