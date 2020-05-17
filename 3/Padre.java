/*Explicando un poco de la Herencia */
/*-Veamos la herencia como una familia el abuelo posee una patrimonio el cual se le entragará a sus hijos
  -Otro ejemplo veamos a la herencia como un ser vivo,pero ¿Qué es un ser vivo? vemos que la definición de ser vivo
   es muy abstracto dentro de ellos tenemos las bacterias,las plantas ,los animales y pensando animales estos son carnivoros y hervivoros(por mensionar dos) donde los dos tienen la misma función comer pero ellos comen de diferente manera o diferentes métodos para conseguirlo.
 */

//En este ejemplo vemos que la clase padre posee atributos como intput y un método,el cual es mostrar datos ahora vamos 
//a la clase Hija


public abstract class Padre{//La clase padre siempre va  a ser de tipo abstracto 

 int [] intput = new int [6];
 
 public Padre(int [] intput){//constructotr de la clase Padre
  
 this.intput = intput;

/*Este "this" hace referencia al atributo input y en nuestro constructor le pasaremos como parametros un vector
  se le puede poner otro nombre al vector,pero para lo hice intencionalmente para que sepan que existe esta manera
  de declarar.
*/

}

  public void Mostrar_Datos(){
       for(int i=0;i<6;i++){
         System.out.println("nuestros vector es: "+ this.intput[i]);
       }
   }

}
