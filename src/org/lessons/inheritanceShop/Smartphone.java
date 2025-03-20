package org.lessons.inheritanceShop;

import java.math.BigDecimal;

public class Smartphone extends Prodotto{
//Smarphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria

private String codiceIMEI;
private int memoriaGB;

public Smartphone(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva, String imei, int memoria){
    super(nome, descrizione, prezzo, iva);
    this.codiceIMEI = imei;
    if(memoria <= 0){
        memoria = 2;
    }
    this.memoriaGB = memoria;
}

//Getter e setter
public String getIMEI(){
    return this.codiceIMEI;
}

public void setIMEI(String imei){
    this.codiceIMEI = imei;
}

public int getMemoria(){
    return this.memoriaGB;
}

public void setMemoria(int memoria){
    if(memoria <= 0)
        memoria = 2;
    this.memoriaGB = memoria;    
}
}
