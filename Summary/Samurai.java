
package shogunato;


public class Samurai extends Japones implements Bushido  {
    
    String apellido;
    
    public Samurai(String name,String sex,double weight,double height,String apellido){
         super(name,sex,weight,height);
         this.apellido=apellido;
    }
     
    public void Imprimir(){
         System.out.println("EL nombre y apellido del Samurai es: " + super.Name()+" "+apellido+ "\n" +"El peso del Samurai: "+super.weight()+"\n"+"El tamaño del Samurai:"+super.Height());
     }
     
    public void BUSHIDO(){
        
       System.out.println("El códgo de Samurai");       
       for(String e:Bushido.bushido){
           System.out.println(e);
       }
       
       }
    
}
