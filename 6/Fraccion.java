
package problema_4;

public class Fraccion {
   
     public Fraccion(){
       super();
     }
     
     public String suma(int a,int b,int c,int d){
         int z1 = a*d+c*b;
         int z2 = b*d;
         return simplificar(z1,z2);
     }
     
     public String resta(int a,int b,int c,int d){
         int z1 = a*d-c*b;
         int z2 = b*d;
         return simplificar(z1,z2);
     }
     
    public String mult(int a,int b,int c,int d){
         int z1 = a*c;
         int z2 = b*d;
        return simplificar(z1,z2);
     }
    
    public String inversa (int a,int b){
        return simplificar(b,a);
    }
    
    public String oputesto(int a,int b){
        return simplificar((-1)*a,b);
    }
    
    public String dividir(int a,int b,int c,int d){
        int z = a*d;
        int z2= b*c;
        return simplificar(z,z2);
       //       return z +"/"+ z2;  
    }
    
    public String simplificar(int a,int b){
        int r;
        int a1=a;
        int b1=b;
        while(b!=0){
            r=a%b;
            a=b;
            b=r;
        }
        int MCD=a;
        int a2=a1/MCD;
        int b2=b1/MCD ;
        return a2+"/"+b2;
    }
    public String Pot(int a,int b,int pot){
        int c = (int)Math.pow(a, pot);
        int d = (int)Math.pow(b, pot);
        return simplificar(c,d);
    }
}
