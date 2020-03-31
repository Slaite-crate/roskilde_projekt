package com.roskildebørnehave;

import java.util.Scanner;

public class Menu {
    ListeManager listeManager;
    Scanner sc;

    public Menu(){
        listeManager = new ListeManager();
        sc = new Scanner(System.in);
    }

    public void start(){
        boolean kør = true;
        while (kør) {
            barnMenu();
            int valg = sc.nextInt();
            if (valg == 1){
                opretBarn();
            }
            if (valg == 2){
                listeManager.seBarnListe();
            }
            if (valg == 3){
                søgBarn();
            }
            if (valg == 4){
                tilFøjForælder();
            }
        }
    }

    public void opretBarn(){
        System.out.println("skriv navn: ");
        String navn = sc.next();
        navn += sc.nextLine();
        System.out.println("skriv cpr nummer: ");
        String cpr = sc.next();
        System.out.println("tilføj til venteliste\n1: ja\n2: nej");
        int valg = sc.nextInt();
        boolean venteliste;
        if (valg == 1){
            venteliste = true;
        } else {
            venteliste = false;
        }
        listeManager.opretBarn(navn, cpr, venteliste);
        //gem barn
        listeManager.gemBarnListe();
    }

    public void søgBarn(){
        System.out.println("skriv navn: ");
        String navn = sc.next();
        navn += sc.nextLine();
        listeManager.søgBarn(navn);
    }

    public void barnMenu(){
        System.out.println("1: opret barn");
        System.out.println("2: se barn liste");
        System.out.println("3: søg barn");
        System.out.println("4: rediger barn");
    }

    public void tilFøjForælder(){
        String navn;
        String cpr;
        String adresse;
        int telefonnummer;
        String barncpr;
        System.out.println("skriv navn: ");
        navn = sc.next();
        navn += sc.nextLine();

        System.out.println("skriv cpr: ");
        cpr = sc.next();

        System.out.println("skriv addresse: ");
        adresse = sc.next();
        adresse += sc.nextLine();

        System.out.println("skriv telefonnummer: ");
        telefonnummer = sc.nextInt();

        System.out.println("skriv barn cpr: ");
        barncpr = sc.next();

        listeManager.tilføjForælder(navn, cpr, adresse, telefonnummer, barncpr);
        listeManager.gemForælderListe();
        listeManager.gemForbindelseListe();
    }

}