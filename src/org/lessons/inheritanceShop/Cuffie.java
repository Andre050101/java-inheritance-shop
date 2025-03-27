package org.lessons.inheritanceShop;

import java.math.BigDecimal;


public class Cuffie extends Prodotto{
//Cuffie, caratterizzate dal colore e se sono wireless o cablate
private String colore;
private String wire;


public Cuffie(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva, String colore, String wire){
   super(nome, descrizione, prezzo, iva);
   this.colore = colore;
   if(!wire.toLowerCase().equals("wireless") && !wire.toLowerCase().equals("cablate")){
       wire = "cablate";
   }
   this.wire = wire;
}


//Getter e Setter
public String getColore(){
   return this.colore;
}


public void setColore(String colore){
   this.colore = colore;
}


public String getWire(){
   return this.wire;
}


public void setWire(String wire){
   if(!wire.toLowerCase().equals("wireless") && !wire.toLowerCase().equals("cablate")){
       wire = "cablate";
   }
   this.wire = wire;
}
}


