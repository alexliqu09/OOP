
package shogunato;
/*
Si crea un metodo abstrracto,entonces obligatoriamente se debe crear una claSE ABSTRACTA.
los metodos abstractos solo se nombraran y cuando se hereden se deberan sobrescribir para cada una 
de las clase hijas.
*/
public abstract class Japones {
    
    private String name;
    private String sex;
    private double height; 
    private double weight;
    
    public Japones(String name,String sex,double height,double weight){
        this.name=name;
        this.sex=sex;    
        this.weight=weight;
        this.height=height;
        
    }
    
   public abstract void  Imprimir(); 
    
   public String Name(){
       return name;
   } 
   public String Sex(){
   return sex;
   } 
   public double Height(){
       return height;
   }
   public double weight(){
       return weight;
   }   
   
}
