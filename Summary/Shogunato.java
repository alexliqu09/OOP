
package shogunato;


public class Shogunato {

    public static void main(String[] args) {
      Samurai S = new Samurai("Sakamoto","M",1.67,67, "Ryōma");
     S.BUSHIDO();
     S.Imprimir();
     
     Campesino C = new Campesino("Ginjirō ","M",1.40,50);
     System.out.println("el  impuesto es: "+C.Impuesto(20));
     C.Imprimir();
    
    
    }
    
    
}
