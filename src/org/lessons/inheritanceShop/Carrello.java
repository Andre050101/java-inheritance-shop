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
        String nome;
        double price;
        BigDecimal prezzo;
        switch(scelta){
            case "smartphone":
            System.out.println("Digitare nome smartphone:");
            nome = in.nextLine();
            System.out.println("Quanto costa?");
            price = in.nextDouble();
            while(price <= 0){
                System.out.println("Prezzo non valido, reinserire valore(maggiore di 0, nulla è gratis ;) )");
                price = in.nextDouble();
            }
            prezzo = new BigDecimal(price);
            System.out.println("Da quanti gb di memoria? (4), (8), (16), (32), (64), (128), (256), (512), (1024)");
            int gb = in.nextInt();
            while(gb != 4 && gb != 8 && gb != 16 && gb != 32 && gb != 64 && gb != 128 && gb != 256 && gb != 512 && gb != 1024){
                System.out.println("Scelta non valida, riprovare!");
                gb = in.nextInt();
            }
            Smartphone acquisto = new Smartphone(nome, "", prezzo, new BigDecimal(0.22), gb);
            System.out.println(acquisto.toString());
            break;
            case "televisore":
            System.out.println("Digitare nome televisore:");
            nome = in.nextLine();
            System.out.println("Quanto costa?");
            price = in.nextDouble();
            while(price <= 0){
                System.out.println("Prezzo non valido, reinserire valore(maggiore di 0, nulla è gratis ;) )");
                price = in.nextDouble();
            }
            prezzo = new BigDecimal(price);
            System.out.println("Da quanti pollici? ");
            int pollici = in.nextInt();
            while(pollici <= 10){
                System.out.println("Dimensione inesistente, almeno 11 pollici!");
                pollici = in.nextInt();
            }
            System.out.println("Desideri una tv normale o una smartTV?");
            String smart = in.nextLine().toLowerCase();
            while(!smart.equals("tv normale") && !smart.equals("smarttv")){
                System.out.println("Errore! Selezionare una scelta valida tra le 2 soprastanti:");
                smart = in.nextLine().toLowerCase();
            }
            boolean typeTV = false;
            if(smart.equals("smarttv")){
                typeTV = true;
            }
            Televisore tvScelta = new Televisore(nome, "", prezzo, new BigDecimal(0.22), pollici, typeTV);
            System.out.println(tvScelta.toString());
            break;
            case "cuffie":
            System.out.println("Digitare nome cuffie:");
            nome = in.nextLine();
            System.out.println("Quanto costano?");
            price = in.nextDouble();
            while(price <= 0){
                System.out.println("Prezzo non valido, reinserire valore(maggiore di 0, nulla è gratis ;) )");
                price = in.nextDouble();
            }
            prezzo = new BigDecimal(price);
            System.out.println("Di che colore le vuoi?");
            String colore = in.nextLine();
            System.out.println("Le vuoi con cavo o wireless?");
            String typeHeadphones = in.nextLine().toLowerCase();
            while(!typeHeadphones.equals("con cavo") && !typeHeadphones.equals("wireless")){
                System.out.println("Scelta inesistente! Riprova:");
                typeHeadphones = in.nextLine().toLowerCase();
            }
            Cuffie cuffie = new Cuffie(nome, "", prezzo, new BigDecimal(0.22), colore, typeHeadphones);
            System.out.println(cuffie.toString());
            break;
        }
    }
 }
 