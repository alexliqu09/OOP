/*Debemos recordar que en Java solo se puede heredar de un clase superiror.
Por este motivo se recurre a las interfaces las cuales estas si pueden ser multiples.

public class Ejemplo extends Person implements implen1,impl2,impl3...{

Lo que se encuentra en nuestra interface  son varables que podemos crear y 
funciones que si o si en donde se implementen las interfaces,se debe crear esta función.

*/
package shogunato;

public interface Bienes {
  long Area_Territorio= 377975;//km^2
  long Repartir_territorio(long arroz);
  void Designar();  
}
