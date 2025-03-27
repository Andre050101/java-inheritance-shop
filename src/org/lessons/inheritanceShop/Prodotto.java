package org.lessons.inheritanceShop;

import java.util.Random;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Prodotto {
   private int codice;
   private String nome;
   private String descrizione;
   private BigDecimal prezzo;
   private BigDecimal iva;


   //Costruttore senza parametri
   public Prodotto(){
       Random rand = new Random();
       this.codice = rand.nextInt(99999);
       this.nome = "Prodotto senza nome";
       this.descrizione = "No descrizione";
       this.prezzo = new BigDecimal(0);
       this.iva = new BigDecimal(0);
   }
   //Costruttore con tutti i valori passati
   public Prodotto(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva){
       Random rand = new Random();
       this.codice = rand.nextInt(99999);
       this.nome = nome;
       this.descrizione = descrizione;
       this.prezzo = prezzo;
       this.iva = iva;
   }


   //Getter e Setter
   public int getCodice(){
       return this.codice;
   }


   public String getNome(){
       if(this.nome != null)
           return this.nome;
       return "Prodotto senza nome";
   }


   public void setNome(String nome){
       this.nome = nome;
   }


   public String getDescrizione(){
       if(this.descrizione != null)
           return this.descrizione;
       return "Prodotto senza descrizione";
   }


   public void setDescrizione(String descrizione){
       this.descrizione = descrizione;
   }


   public BigDecimal getPrezzo(){
       return this.prezzo;
   }


   public void setPrezzo(BigDecimal prezzo){
       this.prezzo = prezzo;
   }


   public BigDecimal getIva(){
       return this.iva;
   }


   public void setIva(BigDecimal iva){
       this.iva = iva;
   }


   //Other methods
   public BigDecimal getPriceWIva(){
       if(prezzo != null && iva != null){
           return prezzo.add(prezzo.multiply(iva)).setScale(2, RoundingMode.DOWN);
       }
       return null;
   }
   @Override
   public String toString(){
       if(nome != null){
           String extName = "nome Prodotto:"+this.nome+", codice:"+this.codice+", Prezzo: "+this.prezzo+"€";
           return extName;
       }
       return null;
      
   }


}
