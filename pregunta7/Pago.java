
package pagoapp;


public class Pago {
    private int monto;
    private String formaPago;
    private String tipoTarjeta;
    private int número;
    private int mes;
    private int año;
    private int check;
    
  public Pago(int monto,String formaPago){
    this.monto=monto;
    this.formaPago=formaPago;
  }
  public String getformaPago(){
      return formaPago;
  }
  
  public int getMonto(){
      return monto;
  }  
  
  public void setNumero(int número){
      this.número=número;
  }
  
  public void setTipoTarjeta(String tipoTarjeta){
      this.tipoTarjeta=tipoTarjeta;
  }
  
  public void setCheck(int chek){
      this.check=check;
  }

 public void setAño(int año){
     this.año=año;
 }
 public void setMes(int mes){
     this.mes= mes;
 }
 
  public int getChek(){
      return check;
  }
  public int getNumero(){
      return número; 
  }

  public String gettipoTarjeta(){
      return tipoTarjeta;
  }
  
  public int getAño(){
      return año;
  }
  
  public int getMes(){
      return mes;
  }
  
}
