public class POO{

public static void main(String [] args){

Microprocesador intel = new Microprocesador();
/* instaciamos "creamos un objeto de classe Microprocesador"*/

for(int i=0;i<4;i++){

System.out.println((i+1) +": "+intel.Escribir(i)+"\n");

}
//probamos nuestros metodos setter
intel.Setter(3);

for(int i=0;i<4;i++){

System.out.println((i+1) +": "+intel.Num_Mem(i)+"\n");

}


}


}
