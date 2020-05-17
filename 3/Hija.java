import java.util.Scanner;
import java.lang.Math;

/*En la clase hija vemos que heredo el atributo intput de Padre y además el método MostrarDatos*/

class Hija extends Padre{//Para que herede de un clase se debe poner "extends"
 
  int [] intput = new int [6];
  double weight;
  double bias;
  double output;

  public Hija(int [] intput,double bias){
/*Nuestro constructor  vemos la función "super" y esto es porque ya la varible intput ya fue inicializada en padre 
  y ya no es necesario volverla ha a declararlo.(Por eso se usa super)
  Entonces bastaria con declarar los otros atributos.
*/
    super(intput);   
    this.bias=bias;
  }    
  //creamos algunos métodos para comenzar que funcione nuestro problema del perceptron
  public double sigmoide(double output){
       this.output=output;
      double Y =(1/(1+Math.exp((-1)*this.output)));
      
     return Y;
  }        
    
  public double perceptron(int dim){

     this.output=0;

     for(int i=0;i<dim;i++){
        this.weight=Math.random()*10+1;
        this.output+=this.intput[i];  
    }

    this.output+=this.bias;
     
    return this.output;
   }   
 /*Como se dijo el ejemplo de los animales en el método padre se usaba para solo imprimir el intput pero en la clase hija
   Ya no lo usamos para imprimir el Intput sino el parámetro de bais.(Tiene como finalida imprimir pero los dos varian en  que la hija imprime  el bias y el padre el intput.Podemos crear otra clase que herede padre y que imprima el intput también o sino que la hija pueda imprimir tanto 
el intput como el parámetro de bias.)          
 Nota: También si no se creaba la función Mostrar_Datos en la clase Hija entonces por defecto se puede usar el Mostrar_Datos de 
 la clase padre.
 Perceptron.Mostrar_Datos();//de la clase Padre 
 imprime --> lo que está en el método de la clase Padre.
 */ 
   public void Mostrar_Datos(){
         System.out.println("nuestros bias es: "+this.bias);

   }
  //Dato inportante un clase solo puede hederar de solo una otra clase.No existe :(class Hija extends Padre,Padre2)solo 1.    
      
} 
