/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3ejercicio6;
/**
 *
 * @author marti
 */
public class Tarea3Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [] diasSemana = new String [7];
        diasSemana[0]="Lunes";
        diasSemana[1]="Martes";
        diasSemana[2]="Miercoles";
        diasSemana[3]="Jueves";
        diasSemana[4]="Viernes";
        diasSemana[5]="Sabado";
        diasSemana[6]="Domingo";  
        for (int i=0;i<7;i++){
            System.out.println(diasSemana[i]);
        }
    }
    
}
