
package shogunato;

public class Shogun extends Emperador {
      private int  total_Samurai;
    
    public Shogun(String name,String sex,double weight,double height,int total_Samurai,String apellido){
     super(name,apellido,sex,weight,height);
     this.total_Samurai=total_Samurai;
      }
    
    @Override
    public void Imprimir(){
       System.out.println("EL nombre y apellido  del Shogun es: " + super.Name()+" "+apellido+ "\n" +"El peso del Shogun: "+super.weight()+"\n"+"El tamaño del Shogun: "+super.Height()+"El número de Samurai que posee el Shogun es: "+NUM_Samurai());
    }
    
    public void Designar(){
        System.out.println("La tierra sera distribuida entre los daimiyo");
        System.out.println("El poder militar sera dado a los Samurai");
    } 
    
    public int NUM_Samurai(){
        return total_Samurai;
    }

}
