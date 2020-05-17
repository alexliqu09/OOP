 /*
Lo que pasó con el anterior problema es que no eran atributos de
de tipo privado y cualquiera puede acceder y cambiar los valores,
por está razón encapsulamos los valores.

Pero al ser datos de tipo privado solo se puede declarar en esta clase y no en la principal 
esto se ve mejor si utilizan editores como eclipse,Neat beans que te muestran el error.

Para ello nosotros usamos los metodos getter y setter;
*/

public class Microprocesador{ 
private String [] nombre = new String [4];

private int [] edad = new int [4];

private double [] num_transistores= new double [4];

private int []  Memoria_virtual = new int [4]; 


public Microprocesador(){

  nombre = new String []{"8046SX","Pentium","Pentium Pro","Pentium II"};

  edad= new int []{1991,1993,1995,1997};

  num_transistores = new double [] {1185000,3100000,5500000,7500000};

  Memoria_virtual = new int [] {64,64,64,64};
}

public String Escribir(int i){ 
/*metodo getter nos permite ver el valor de nuestra propiedad y siempre devuelve un valor*/

  return "el nombre del Microprocesador es: "+ nombre[i];
}

public void Setter(int i){
/*Nos permite modificar valores y no devuelve nada*/
  Memoria_virtual[i]=32;
}
/*Otro metodo getter para imprimir la memoria virtual*/
public String Num_Mem(int i){

  return "EL numero de memoria virtual es: "+ Memoria_virtual[i];
}

}
