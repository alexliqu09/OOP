/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagoapp;

import java.util.*;

/**
 *
 * @author alex
 */
public class Tarjeta {
    private int año;
    private int mes;
    
    public Tarjeta(int año,int mes){
        this.año=año;
        this.mes=mes;
    }
 public int año(){
     return año;
 }    
 public int mes(){
     return mes;
 }

}
