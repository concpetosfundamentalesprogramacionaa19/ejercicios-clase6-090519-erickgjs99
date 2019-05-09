/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasbasicas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class EstructurasBasicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // TODO code application logic here
         String mensajeFinal = "";
         String nombre = "Erick Gonzalo";
         String apellido = "Jaramillo Soto";
         String profesion = "Estudiante";
         int perod = 1;
         mensajeFinal = String.format("%s%s%s",mensajeFinal, 
              "Informe de la ciudad de Loja\n", "Listado de personas: \n\n");
         
         
    while(perod < 5){
        System.out.printf("Ingrese sus Nombres\n");
        nombre = entrada.nextLine();
        System.out.printf("Ingrese sus Apellidos\n");
        apellido = entrada.nextLine();
        System.out.printf("Ingrese sus Profesion\n");
        profesion = entrada.nextLine();
        mensajeFinal = String.format("%sPersona %d: %s %s - %s\n", mensajeFinal,
                perod, nombre, apellido, profesion);
        perod = perod + 1; // para que contador se incremente
    } 
        
     System.out.printf("%s", mensajeFinal);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
   
    
    
    
    
    
    
    
    
    
    
    
    
    
}
