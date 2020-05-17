//Algunas librerias útiles

import java.util.Scanner;
import java.lang.Math;

public class Clases{
/*programacación Orientada a objetos*/

/*
objeto: Para decirlo de manera sencilla daremos el ejemplo de los coches.
Un coche posee ciertas caracterisitcas como maqrcas,número de ruedas,las dimensiones que possee este,la velocidad max que alcanza,etc.
Y también posee habilidades la cual por dar un ejemplo sería aumentar la velociad.

-A las caracteristicas de los objetos les llamamos atributos.
-A los habilidades que posee nuestro objeto le llamamos  métodos.


CLases: Pensemos en un conjunto de objetos que comparten los mismo atributos y métodos.

Siguiendo el ejemplo del coche.Los coches de manera individual pueden tener diferentes nombres("Toyota","Mitsubishi") de marcas,también pueden tener  diferentes dimnesiones ,pero aun asi poseen un nombre de marca y una dimensión.

*/
    public static  void main(String [] args){
/*No es misterio que Java sea un lenguaje 100% orientado a objetos*/
     Scanner Entrada= new Scanner(System.in);
/*Para pedir datos al usuario nosotros instanciamos(creamos un objeto de la clase Scanner)*/


/* instanciamos (creamos un objeto de la clase Microprocesador)*/      
     Coche auto = new Coche();  

/*Imprimimos nuestros atributos */    
     System.out.println("los datos del auto");
     System.out.println("el nombre de nuestro coche: "+auto.nombre);
     System.out.println("la velocidad del coche: "+auto.velocidad+"m/s");
     System.out.println("el numero de ruedas de nuestro coche: "+auto.ruedas);
    }

}
