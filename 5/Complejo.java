
package complejo;


public class Complejo {

    
    public static void main(String[] args) {
        Complex C = new Complex();
        System.out.println("suma"+C.suma(3, 4, 3, 2));
        System.out.println("resta"+C.resta(4, 2, 6, 3));
        System.out.println("multi: "+C.mult(5, 1, -3, 3));
        System.out.println("divi: "+C.div(5, 1, 7, 6));   
        System.out.println("potencia_e: "+C.Pote_e(5, 1));
        System.out.println("raiz cuadrada_ "+ C.sqrt(-3));
        System.out.println("potencia"+ C.Moivre(7,3,4));
        
    }
    
}
