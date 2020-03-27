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
                listeManager.gemBarnListe();
            }
            if (valg == 2){
                listeManager.seBarnListe();
            }
        }
    }

    public void opretBarn(){
        System.out.println("skriv navn: ");
        String navn = sc.next();
        navn += sc.nextLine();
        System.out.println(navn);
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
    }

    public void barnMenu(){
        System.out.println("1: opret barn");
        System.out.println("2: se barn liste");
        System.out.println("3: søg barn");
        System.out.println("4: rediger barn");
    }

}