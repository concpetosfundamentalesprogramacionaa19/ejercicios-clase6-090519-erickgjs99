/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejosswitch;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class UsoSwitch5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
        String placa = "";
       
       System.out.printf("Ingrese su placa\n");
       placa = entrada.nextLine();
    
       
        char valor = placa.charAt(0);
                
        switch(valor){
            case 'o':
            case'O':
                System.out.printf("Su placa%s es del Oro %s\n", 
                        valor, placa.toUpperCase());
                break;
            
            case 'e':
            case 'E':
                System.out.printf("Su placa %s es de Esmeraldas %s\n", 
                        valor, placa.toUpperCase());
                break;    
            
            case 'g':
            case 'G':
                System.out.printf("Su placa %s es del Guayas %s\n", 
                        valor, placa.toLowerCase());
                break;    
                
                 case 'r':
            case 'R':
                System.out.printf("Su placa %s es de Los Rios %s\n", 
                        valor, placa.toLowerCase());
                break;   
                
                 case 'm':
            case 'M':
                System.out.printf("Su placa %s es de Manabi %s\n", 
                        valor, placa.toLowerCase());
                break;    
                
                 case 'y':
            case 'Y':
                System.out.printf("Su placa %s es de Santa Elena %s\n", 
                        valor, placa.toLowerCase());
                break;    
                
                 case 'j':
            case 'J':
                System.out.printf("Su placa %s es de Santo DOmingo de los "
                        + "Tsachilas %s\n", 
                        valor, placa.toLowerCase());
                break;  
                
                
                
            default:
                System.out.println("Tus placas son de otra region");
                
        }
        
    }
}
