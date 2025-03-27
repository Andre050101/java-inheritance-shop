package org.lessons.inheritanceShop;

import java.math.BigDecimal;


public class Televisore extends Prodotto{
//Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no


private int dimensioniInPollici;
private boolean smart;


public Televisore(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva, int dim, boolean smart){
   super(nome, descrizione, prezzo, iva);
   if(dim<=0){
       dim=15;
   }
   this.dimensioniInPollici = dim;
   this.smart = smart;
}


//Getter e Setter
public int getDimensioni(){
   return this.dimensioniInPollici;
}


public void setDimensioni(int dim){
   if(dim<=0){
       dim=15;
   }
   this.dimensioniInPollici = dim;
}


public boolean getIsSmart(){
   return this.smart;
}


public void setIsSmart(boolean isSmart){
   this.smart = isSmart;
}




}
