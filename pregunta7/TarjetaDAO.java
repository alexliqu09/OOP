
package pagoapp;

import java.util.*;


public class TarjetaDAO {
    private HashMap <String,String>tarjetas;
    private HashMap<Integer,Tarjeta>vis;
    private HashMap<Integer,Tarjeta>mas;
    private HashMap<Integer,Tarjeta>aex;
    private HashMap<Integer,Tarjeta>vacio;
    public TarjetaDAO(){
    }
    
  
    
   public int  VerificaTarjeta(Pago P){
        if(P.getChek()==0){
            System.out.println("Número de tarjeta no existe ");
            return P.getChek();
        }else if(P.getChek()==1){
            System.out.println("Existe número de esta tarjeta ");
            P.getChek();
        }else if (P.getChek()==2){
            System.out.println("Tarjeta no está vencida");
            P.getChek();
        }
       return -1;
    }
   
   public void setTarjeta(){
       tarjetas= new HashMap<String,String>();
       tarjetas.put("V","Visa");
       tarjetas.put("M", "MasterCard");
       tarjetas.put("A","America Express");
      }

  public HashMap <String,String> getTarjeta(){
      return tarjetas;
  }
  
  public void setVis(){
      vis = new HashMap<Integer,Tarjeta>();
      Tarjeta tar = new Tarjeta(2018, 1);
      vis.put(1,tar);
      vis.put(2,tar);
      vis.put(3,tar);
  }
  
  public HashMap<Integer,Tarjeta> getVis(){
      return vis;
  }
  
    public void setMas(){
      mas=new HashMap<Integer,Tarjeta>();
      Tarjeta tar = new Tarjeta(2020,1);
      mas.put(1,tar);
      Tarjeta tar1 = new Tarjeta(2020,11);
      mas.put(2,tar1);
      Tarjeta tar2 = new Tarjeta(2020,12);
      mas.put(3,tar2);
  }
    
 public HashMap<Integer,Tarjeta> getMas(){
     return mas;
 }
 
 public void setAex(){
      aex= new HashMap<Integer,Tarjeta>();
      aex.put(1,new Tarjeta(2021,1));
      aex.put(2,new Tarjeta(2021,1));
      aex.put(3,new Tarjeta(2021,1));
     
  }
 public HashMap<Integer,Tarjeta> getAex(){
      aex= new HashMap<Integer,Tarjeta>();
      aex.put(1,new Tarjeta(2021,1));
      aex.put(2,new Tarjeta(2021,1));
      aex.put(3,new Tarjeta(2021,1));
      return aex;
  }
 
 public HashMap<Integer,Tarjeta> getVacio(){
      return vacio;
 }

}
