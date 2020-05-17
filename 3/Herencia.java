import java.util.Scanner;
import java.lang.Math;
//En este ejemplo veremos como usar la herencia en Java
//El algortimo trata de aplicar el concepto del perceptrón

public class Herencia{

     public static void main(String []args){

     int [] intput = new int [6];
     double bias = Math.random()/10; 
        
     for(int i=0;i<intput.length;i++){
        intput[i]= (int)(Math.random()*10+1);
     }
      

    Hija perceptron = new Hija(intput,bias);//Creamos un objeto de la clase Hija
    
    perceptron.Mostrar_Datos();//Aplicamos los métodos   
  
    double Y = perceptron.perceptron(intput.length);
    
    Y=perceptron.sigmoide(Y);
   
    if(Y>=0.48){
    System.out.println(1+"\n");
    
   }else{
    System.out.print(0+"\n");
   }  
   
   


 }


}
