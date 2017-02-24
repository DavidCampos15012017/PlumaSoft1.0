
/*
    PlumaSoft v1.0
    UNED, 824-Programación Intermedia, I Cuatrimestre 2017
    Estudiante: David Campos Castro
    ID: 701980296
    Tarea 1
*/
package plumasoft1.pkg0;
import java.util.Scanner;
public class PlumaSoft10 {

    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);// Creamos un objeto entrada de la clase Scanner para el ingreso de datos
       avestruz nuevaAve = new avestruz();// Creamos un objeto nuevaAve de la clase Avestruz para manipular los métodos de esta.
        boolean continuar=true;
        int opcion;
        
        do{
            
            try
            {
                System.out.print("\n\t\tPlumaSoft 1.0\n-------------------------------------------\n"
                    +"Sistema de control para compra de alimentos \nde Avestruces según su etapa de crecimiento\n");
                System.out.printf("\n1-Avestruces Polluelo\n2-Avestruces Jovenes-\n3-Avestruces Adulto\n4-Salir\nOpción:");
                opcion = entrada.nextInt();// Solicita una opción del menú.
                
                switch(opcion){
                    case 1:
                    {
                        int cantidadPolluelo;// definimos la cantidad de Avestruces Polluelos
                        System.out.print("\tAlimento para Polluelos\n-------------------------------------------\n");
                        System.out.print("Ingrese la cantidad de Polluelos: ");
                        cantidadPolluelo = entrada.nextInt();
                        nuevaAve.setCantidadPolluelo(cantidadPolluelo);// Invocamos al método setCantidadPolluelo del objeto nuevaAve
                        break;
                    }
                    case 2:
                    {
                        int cantidadJoven;// definimos la cantidad de Avestruces Jóvenes
                        System.out.print("\tAlimento para Jóvenes\n-------------------------------------------\n");
                        System.out.print("Ingrese la cantidad de Jóvenes: ");
                        cantidadJoven = entrada.nextInt();
                        nuevaAve.setCantidadJoven(cantidadJoven);// Invocamos al método setCantidadJoven del objeto nuevaAve
                        break;
                    }
                    case 3:
                    {
                        int cantidadAdultos;// Definimos la cantidad de Avestruces Adultas
                        System.out.print("\tAlimento para Adultos\n-------------------------------------------\n");
                        System.out.print("Ingrese la cantidad de Adultos: ");
                        cantidadAdultos = entrada.nextInt();
                        nuevaAve.setCantidadAdulto(cantidadAdultos);// Invocamos al método setCantidadAdulto del objeto nuevaAve
                        break;
                    }
                    
                    case 4:
                    {
                        continuar = false;
                        System.out.print("SISTEMA FINALIZADO...");
                        break;
                    }
                    default:
                    {
                      System.out.print("\nOpción no válida\n");
                      
                    }  // fin default  
                }
            }// fin del try
            catch (Exception e) // Atrapa la excepción y termina el ciclo
            {
               
               System.out.print("¡¡¡ OPCIÓN INVÁLIDA !!! ");
               break;
              
            }// fin del catch
           
        
        }while(continuar);
        
    }
    
    }
    

