package shogunato;

import java.lang.Math;

public class Daimiyo extends Shogun{
    
    public Daimiyo(String name,String apellido,String sex,double weight,double height,int total_Samurai){
        super(name,sex,weight,height,total_Samurai,apellido);
    }
    public void Imprimir(){
        System.out.println("EL nombre y apellido del Daimiyo es: " + super.Name()+" "+apellido+ "\n" +"El peso del Daimiyo: "+super.weight()+"\n"+"El tamaño del Daimiyo: "+super.Height()+"El número de Samurai que posee el Daimiyo es: "+NUM_Samurai());
    }
    
    public void Designar(){
        System.out.println("La tierra trabajan los campesinos");
        System.out.println("Samurai por la treta de la investidura protegeme de los otros Daimiyos");
    } 
        public long Repartir_territorio(long arroz){
        
        return Bienes.Area_Territorio/(arroz*(long)(Math.random()*10));
    }
}
