package org.lessons.inheritanceShop;

import java.math.BigDecimal;
import java.util.Random;


public class Smartphone extends Prodotto{
//Smarphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria


private String codiceIMEI;
private int memoriaGB;


public Smartphone(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva, int memoria){
   super(nome, descrizione, prezzo, iva);
   this.codiceIMEI = generateIMEI();
   if(memoria <= 0){
       memoria = 2;
   }
   this.memoriaGB = memoria;
};


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


@Override
public String toString(){
   return super.toString()+" imei: "+this.codiceIMEI+", memoria: "+this.memoriaGB+"GB";


}



//Altri metodi
private static String generateIMEI() {
   Random random = new Random();
   int[] imei = new int[15];


   // Genera le prime 14 cifre in modo casuale
   for (int i = 0; i < 14; i++) {
       imei[i] = random.nextInt(10);
   }


   // Calcola la cifra di controllo usando l'algoritmo di Luhn
   imei[14] = calculateLuhnChecksum(imei);


   // Converti l'array in una stringa
   StringBuilder imeiStr = new StringBuilder();
   for (int digit : imei) {
       imeiStr.append(digit);
   }
   return imeiStr.toString();
}


private static int calculateLuhnChecksum(int[] imei) {
       int sum = 0;
       for (int i = 0; i < 14; i++) {
           int digit = imei[i];
           if (i % 2 == 1) { // Ogni secondo numero viene raddoppiato
               digit *= 2;
               if (digit > 9) {
                   digit -= 9;
               }
           }
           sum += digit;
       }
       return (10 - (sum % 10)) % 10; // Calcola la cifra di controllo
   }







}

