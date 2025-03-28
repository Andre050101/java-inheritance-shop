package org.lessons.inheritanceShop;

import java.util.Scanner;
import java.math.BigDecimal;
public class Carrello {
    //Create una classe Carrello con metodo main, in cui chiedete all’utente di valorizzare un carrello di prodotti con dati inseriti tramite scanner.
 
 
    //Durante la richiesta di valorizzazione chiedete all’utente se sta inserendo uno Smarphone o un Televisore o Cuffie e in base alla scelta dell’utente utilizzate il costruttore opportuno.
 
 
    //Al termine dell’inserimento stampate il carrello (fate l’override del metodo toString per restituire le informazioni da stampare per ogni classe)
  
 
    //Bonus: Aggiungete alla classe Prodotto un metodo per il calcolo del prezzo scontato per clienti con tessera fedeltà, che applica al prezzo uno sconto del 2%. Per gli Smartphone, lo sconto è del 5% se la quantità di memoria è inferiore a 32GB, altrimenti rimane del 2%. Per i Televisori lo sconto è del 10% se la televisione non è smart, altrimenti rimane del 2%. Per le Cuffie lo sconto è del 7% se sono cablate, altrimenti rimane del 2%.Nella classe carrello chiedere all’utente se possiede una carta fedeltà, In base alla risposta, calcolare il totale del carrello come somma dei prezzi base o dei prezzi scontati.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
 
 
        System.out.println("Benvenuto, che prodotto desideri acquistare? Smartphone, Televisore o Cuffie?");
        String scelta = in.nextLine().toLowerCase();
        while(!scelta.equals("smartphone") && !scelta.equals("televisore") && !scelta.equals("cuffie") ){
            System.out.println("Scelta inesistente, riprovare! ");
            scelta = in.nextLine().toLowerCase();
        }
        switch(scelta){
            case "smartphone":
            System.out.println("Digitare nome smartphone:");
            String nome = in.nextLine();
            System.out.println("Quanto costa?");
            double price = in.nextDouble();
            BigDecimal prezzo = new BigDecimal(price);
            System.out.println("Da quanti gb di memoria? (64), (128), (256), (512), (1024)");
            int gb = in.nextInt();
            while(gb != 64 && gb != 128 && gb != 256 && gb != 512 && gb != 1024){
                System.out.println("Scelta non valida, riprovare!");
                gb = in.nextInt();
            }
            Smartphone acquisto = new Smartphone(nome, "", prezzo, new BigDecimal(0.22), gb);
            System.out.println(acquisto.toString());
            break;
            case "televisore":
            System.out.println("Televisore");
            break;
            case "cuffie":
            System.out.println("Cuffie");
            break;
        }
    }
 }
 