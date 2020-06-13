package complejo;


public class Complex {
  public Complex(){
      super();
  }
  public String suma(int a,int b,int c,int d){
      int real=a+c;
      int img=b+d;
      return real+"+"+img+"i";
  }
 
   public String resta(int a,int b,int c,int d){
      int real=a-c;
      int img=Math.abs(b-d);
      if(b>=d){
          return real+"+"+img+"i";
       }else{
          return real+"-"+img+"i";
      }   
    } 
   public String mult(int a,int b,int c,int d){
       return (a*c-b*d)+"+"+(a*d+c*b)+"i";
     } 
   public String  div(int a,int b,int c,int d){
     if(b*c-a*d>=0){  
       return (a*c+b*d)+"+"+(b*c-a*d)+"i";
        }else{
         return (a*c+b*d)+"-"+Math.abs(b*c-a*d)+"i";    
     } 
     
     }
   
   public String Pote_e(int a,int b){
       double real = Math.exp(a);
       return  real* Math.cos(b)+"+"+real*Math.sin(b)+"i";
       
   }
   public String sqrt(double a){
       if(a>=0){
           return ""+Math.sqrt(a);
       }else{
           a=Math.abs(a);
         return  Math.sqrt(a)+"i"; 
       }
   }
   public String Moivre(double a ,double b,int n){
       double norma = Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
       double angulo = Math.atan2(b, a);
       if(norma*Math.sin(angulo)>0){
       return  Math.round(Math.pow(norma,n)*Math.cos(angulo*n))+"+"+ Math.round(Math.pow(norma,n)*Math.sin(angulo*n))+"i";
   }else{
           return Math.round(Math.pow(norma,n)*Math.cos(angulo*n))+"-"+Math.abs(Math.abs(Math.pow(norma,n)*Math.sin(angulo*n)))+"i";
       }
     }
}
