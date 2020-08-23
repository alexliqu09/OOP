
package pagoapp;

import java.util.HashMap;
import java.util.Scanner;

public class PagoAPP {

    
    public static void main(String[] args) {
    
       Scanner Entrada = new Scanner(System.in);
       int i =0;
       int numero;
       int monto;
       int acumulado_efectivo=0;
       int acumulado_tarjeta=0;
       String formaPago;
       String Tarjeta_efectivo;
       String tipoTarjeta;
       
       System.out.println("Bienvenido a la casa de Pago");
     do{
       System.out.println("Pago de telefono");
       System.out.print("Monto: ");
       
       monto= Entrada.nextInt();
       
       System.out.println("\n");
       System.out.println("Forma de Pago:");
       
       formaPago=Entrada.nextLine();
       Validator v = new Validator(monto,formaPago);
       System.out.println("Tarjeta:T");
       System.out.println("Efectivo:E");
       System.out.println("Elije la forma de Pago(T/E):");
       
       Tarjeta_efectivo= Entrada.nextLine().toUpperCase();
       
       if(v.ValidatorT_E(Tarjeta_efectivo).equalsIgnoreCase("E")){
           acumulado_efectivo += v.p.getMonto();
           System.out.println("Gracias por su Pago"); 
       
       }else{
         
         System.out.println("Tarjetas");
         System.out.println("American Express:A");
         System.out.println("Visa:V");
         System.out.println("Master Card: M");
         System.out.println("ELija la tarjeta (A/V/M):");
         
         tipoTarjeta = Entrada.nextLine().toUpperCase();
         System.out.print("EL numero de tarjeta: ");
         int numero_tarjeta= Entrada.nextInt();
         numero = v.validation_numero_tarjeta(tipoTarjeta,numero_tarjeta);
         
         System.out.println("Numero de tarjeta: "+numero_tarjeta);
         
         if(numero==2){
         
             HashMap<Integer,Tarjeta> tarjeta =v.Validotor_Type_Card(tipoTarjeta);
         
             System.out.println("TARJETA: " +tipoTarjeta+","+tarjeta.get(numero_tarjeta).mes()+","+tarjeta.get(numero_tarjeta).año() );
             System.out.println("Gracias por su Pago");
             acumulado_tarjeta += v.p.getMonto(); 
         }else if(numero==1){
         
             HashMap<Integer,Tarjeta> tarjeta =v.Validotor_Type_Card(tipoTarjeta);
             System.out.println("Lo sentimos su tarjeta esta vecida: "+tarjeta.get(numero_tarjeta).mes()+":"+tarjeta.get(numero_tarjeta).año());
             System.out.println("Gracias por su Pago");
         }
       }
   
        i++;
       }while(i<3);  
    System.out.println("\n");
    System.out.println("Total de pago efectivo:"+acumulado_efectivo);
    System.out.println("Total de pago con tarjeta: "+acumulado_tarjeta);
    System.out.println("Total de pagos: "+(acumulado_efectivo+acumulado_tarjeta));
    System.out.println("Muchas gracias por su visita");
    
    }

    }
