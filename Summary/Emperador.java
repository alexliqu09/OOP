
package shogunato;


public class Emperador extends Japones implements Bienes{
    String apellido;
    public Emperador(String name,String apellido,String sex,double weight,double height){
              super(name,sex,weight,height);
              this.apellido=apellido;
    }
    
    @Override
    public void Imprimir(){
       System.out.println("EL nombre y apellido del Emperador es: " + super.Name()+" "+apellido+ "\n" +"El peso del Emperador: "+super.weight()+"\n"+"El tamaño del Empererador: "+super.Height());
    }
    
    public void Designar(){
        System.out.println("La administración es del Shogun");
    }
    
    public long Repartir_territorio(long arroz){
        
        return Bienes.Area_Territorio/arroz;
    }
    
}
