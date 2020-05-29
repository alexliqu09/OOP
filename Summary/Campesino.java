
package shogunato;



public class Campesino extends Japones {

    public Campesino(String name,String sex,double weight,double height){
        super(name,sex,weight,height);
    }

    public void Imprimir(){
        System.out.println("EL nombre del Campesino es: " + super.Name()+ "\n" +"El peso del Campesino: "+super.weight()+"\n"+"El tamaño del Campesino: "+super.Height());
    }
    public double Impuesto(double arroz){
        double impuesto= (arroz*2)/3;
        return impuesto;
    }
    public double Produccion(){
        double Produc= Math.random()*90;
        return Produc;
    }

}
