import java.lang.Math;

/*
Cuando hablamos de polimorfismo podemos verlo de esta manera,nosotros podemos instanciar un objeto de
la superclase donde podemos almacenar un objeto de la subclase o clase hija.
Esto lo veremos mejor con un ejemplo.
*/
public class Polimorfismo{

   public static void main(String []args){
   
        double [][] input = new double [3][3];
        double [] sum = new double [3];
        double [][] soft = new double [3][3];
        
        
        for(int i=0;i<3;i++)sum[i]=0;
        
        for(int i=0;i<3;i++){
           for(int j=0;j<3;j++){
           input[i][j]=Math.random();
           
           }
        } 
   /* 
   Como vemos aquí creamos un vector de la clase Funciones y F[0] es de la misma clase Funciones
   ,pero el F[1] es de la clase es de la clase M_Funcion.
   En conclusión,vemos que podemos crear un objeto de la superclase o clase padre donde se alamaceno 
   un objeto de la clase Hija (M_Funcion). 
     */   
        Funciones [] F = new Funciones [2];
        F[0] = new Funciones(input) {};
        F[1]= new M_Funcion(input); 
        F[1].print();
        
        M_Funcion A = new M_Funcion(input);
        
        soft=A.Softmax(A.suma(sum));
       
       
        
       for (double [] e : soft ){
          for(double i : e ){
           System.out.print(i + " ");
          }
        System.out.print("\n");
        }
     }


}

abstract class Funciones{

   double [][] input= new double [3][3];
   
   public Funciones(double [][] input)
   {
             this.input=input;    
    }
    
    
   public void print(){
        
        for (double [] e : input ){
          for(double i : e ){
           System.out.print(i + " ");
          }
        System.out.print("\n");
        }
   
    }
   
    
}

class M_Funcion extends Funciones{

double  [][] Soft = new double[3][3];

    public M_Funcion(double [][] input){
           super(input);
    }
    
    
    
 public double [] suma(double [] sum){   
   
   Soft = super.input;
   
  for(int i=0;i<3;i++)
    for(int j=0;j<3;j++){
        sum[i]+=Math.exp(Soft[i][j]);
    }
    return sum;
 
 }
    
 public double [][] Softmax(double [] sum){
 
  Soft = super.input;
  
  double [][] soft = new double [3][3];
   
   for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
       soft[i][j]=(Math.exp(Soft[i][j])/sum[i]);
       
      }
      
   }
          
  return soft;
 }
 
/*
Uno nota importante es que se reecribió la función 
print() y lo que va a imprimir  es lo  reescrito.
*/
   public void print(){
        System.out.println(" esto se va ha imprimir");
   }
   
}
