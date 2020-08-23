/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagoapp;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;


public class Validator {
    
    TarjetaDAO tarDAO;
    Pago p;
    
    
    public Validator(int monto,String formaPago){       
        this.tarDAO=new TarjetaDAO();
        tarDAO.setTarjeta();
        this.p=new Pago(monto,formaPago);
    }
    
    
   public String ValidatorT_E(String option){
       return option;
   }
   
   public HashMap<Integer,Tarjeta> Validotor_Type_Card(String T){
       if(T.equalsIgnoreCase("V")){
           tarDAO.setVis();
           return tarDAO.getVis();
       }
       if(T.equalsIgnoreCase("A")){
           tarDAO.setAex();
           return tarDAO.getAex();
       }
       if(T.equalsIgnoreCase("M")){
           tarDAO.setMas();
           return tarDAO.getMas();
       }
       return tarDAO.getVacio();
   }
   
  public int validation_numero_tarjeta(String T,int i){
           HashMap<Integer,Tarjeta>Validacion =  Validotor_Type_Card(T);
           Calendar FechaActual = new GregorianCalendar();
           
           if(FechaActual.get(Calendar.YEAR)==Validacion.get(i).año() && FechaActual.get(Calendar.MONTH)<=Validacion.get(i).mes()){
                return 2;
           }
           if(FechaActual.get(Calendar.YEAR)==Validacion.get(i).año() && FechaActual.get(Calendar.MONTH)>=Validacion.get(i).mes()){
                return 1;
           }
           if(FechaActual.get(Calendar.YEAR)>Validacion.get(i).año()){
                return 1;
           }
           if(FechaActual.get(Calendar.YEAR)<Validacion.get(i).año()){
                return 2;
           }
                
      return 0;
  
  }
  
}
