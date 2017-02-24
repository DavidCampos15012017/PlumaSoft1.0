
package plumasoft1.pkg0;


public class avestruz {
     /* 
    Estos atributos definen las cantidades de cada tipo de ave y
    se utilizarán en los métodos sett para calcular los costos
    */ 
   private int cantidadPolluelo;// 
   private int cantidadJoven;// 
   private int cantidadAdulto;

   
     
   // Publicación de la cantidad de Polluelo
    public int getCantidadPolluelo() {
        return cantidadPolluelo;
    }

    public void setCantidadPolluelo(int cantidadPolluelo) // En el main se invoca este método para tener acceso a la variable cantidadPolluelo que es privada
    {
        
        this.cantidadPolluelo = cantidadPolluelo;
        polluelo(cantidadPolluelo);// Invocamos al método polluelo, el cual realiza los cálculos de costos de los sacos para este tipo de Ave
    }
   
   
    public int getCantidadJoven()
    {
        return cantidadJoven;
    }

    public void setCantidadJoven(int cantidadJoven) // En el main se invoca este método para tener acceso a la variable cantidadJoven que es privada
    {
        this.cantidadJoven = cantidadJoven;
        joven(cantidadJoven);// Invocamos al método joven, el cual realiza los cálculos de costos de los sacos para este tipo de Ave
    }

    public int getCantidadAdulto() 
    {
        return cantidadAdulto;
    }

    public void setCantidadAdulto(int cantidadAdulto) // En el main se invoca este método para tener acceso a la variable cantidadAdulto que es privada
    {
        this.cantidadAdulto = cantidadAdulto;
        adulto(cantidadAdulto);// Invocamos al método adulto, el cual realiza los cálculos de costos de los sacos para este tipo de Ave
    }

   
   
   
   
   
 
    
    private void polluelo(int cantPolluelo) // método del tipo seeter
    {
        int descuentoPolluelo;// Es la variable que contendrá el monto a pagar según la cantidad de sacos
/*Invocamos al método cantidadSacos con el parámetro de la cantidad de polluelos el cual nos retorna la
cantidad de sacos de alimento para Polluelos
así multiplicamos por el costo, 5840 para obtener el total a pagar según la cantidad de sacos para esa ave*/
        descuentoPolluelo = cantidadSacos(cantPolluelo)*5840;
        System.out.printf("Costo de alimento de Polluelo:  ȼ%d\nCantidad de Sacos: %d\n-------------------------------------------\n", descuentoPolluelo,cantidadSacos(cantPolluelo));
    }// fin del método polluelo
    
    
    private void joven(int cantJoven) // método del tipo seeter
    {
        int descuentoJoven;// Es la variable que contendrá el monto a pagar según la cantidad de sacos
/*Invocamos al método cantidadSacos con el parámetro de la cantidad de Jóvenes el cual nos retorna la
cantidad de sacos de alimento para Jovenes
así multiplicamos por el costo, 10045 para obtener el total a pagar según la cantidad de sacos para esa ave*/
        descuentoJoven = cantidadSacos(cantJoven)*10045;
        System.out.printf("Costo de alimento de Jóven: ȼ%d\nCantidad de Sacos: %d\n-------------------------------------------\n", descuentoJoven,cantidadSacos(cantJoven));
    }// fin del método Joven
    
    
    
    private void adulto(int cantiAdulto) // método del tipo seeter
    {
        int descuentoAdulto;// Es la variable que contendrá el monto a pagar según la cantidad de sacos
/*Invocamos al método cantidadSacos con el parámetro de la cantidad de polluelos el cual nos retorna la
cantidad de sacos de alimento para adultos
así multiplicamos por el costo, 23200 para obtener el total a pagar según la cantidad de sacos para esa ave*/
        descuentoAdulto = cantidadSacos(cantiAdulto)*23200;
        System.out.printf("Costo de alimento de Adulto: ȼ%d\nCantidad de Sacos: %d\n-------------------------------------------\n", descuentoAdulto,cantidadSacos(cantiAdulto));
    }// fin del método adulto
    
    
    private int cantidadSacos(int cantAve) // Este método calcula en base a la cantidad de polluelos la cantidad de sacos correspondientes
    {
       int cantSacos=1;
       
        if (cantAve%2==0)// Si la cantidad es par, la cantidad de sacos es la mitad ya que cada ave come medio saco
        {
            cantSacos=cantAve/2;
        }
        if (cantAve%2!=0)
        {
          
           cantSacos=(cantAve/2)+1;// Si la cantidad es impar, se debe agregar un saco
        }
        return cantSacos;
    }// Fin del método sacos
}
