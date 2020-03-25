package com.roskildebørnehave;

import java.util.Scanner;

public class Menu {
    Scanner sc;
    BørneListe børneliste;
    MedarbejderListe medarbejderListe;


    public Menu(){
        børneliste = new BørneListe();
        medarbejderListe = new MedarbejderListe();
        sc = new Scanner(System.in);
    }

    public void start(){
        Menu();
    }

    private void Menu(){
        int valg = 0;
        while (valg != 999) {
            System.out.println("1: tilføj til liste");
            System.out.println("2: se liste");
            System.out.println("3: søg listen");
            System.out.println("4: rediger listen");
            System.out.println("5: slet fra listen");
            System.out.println("999: stop program");
            valg = sc.nextInt();
            if (valg == 1) {
                System.out.println("1: tilføj til barn");
                System.out.println("2: tilføj til kontaktperson");
                System.out.println("3: tilføj til medarbejder");
                int input = sc.nextInt();
                tilføjOplysninger(input);
            }
            if (valg == 2) {
                System.out.println("1: se til barn");
                System.out.println("2: se til kontakt");
                System.out.println("3: se til medarbejder");
                int input = sc.nextInt();
                seListe(input);
            }
            if (valg == 3) {
                System.out.println("1: søg i børnelisten");
                System.out.println("2: søg i kontaktpersoner");
                System.out.println("3: søg i medarbejderlisten");
                int input = sc.nextInt();
                søg(input);
            }
            if (valg == 4) {
                System.out.println("1: ret et barn");
                System.out.println("2: ret en kontaktperson");
                System.out.println("3: ret en medarbejder");
                int input = sc.nextInt();
                rediger(input);
            }
            if (valg == 5){
                System.out.println("1: slet et barn");
                System.out.println("2: slet en kontaktperson");
                System.out.println("3: slet en medarbejder");
                int input = sc.nextInt();
                slet(input);
            }
        }
    }

    private void tilføjOplysninger(int tal){
        String fornavn;
        String efternavn;
        int cprNr;
        String adresse;
        String telefonnummer;
        String email;

        System.out.println("tilføj fornavn");
        fornavn = sc.next();
        System.out.println("tilføj efternavn");
        efternavn = sc.next();
        System.out.println("tilføj cprNr");
        cprNr = sc.nextInt();
        System.out.println("tilføj adresse");
        adresse = sc.next();
        System.out.println("tilføj telefonnummer");
        telefonnummer = sc.next();
        System.out.println("tilføj email");
        email = sc.next();

        if (tal == 1) {
            Barn barn = new Barn(fornavn, efternavn, cprNr, adresse, telefonnummer, email);
            børneliste.tilføj(barn);
            System.out.println("vil du tilføje et nytbarn?");
        }
        if (tal == 2) {
            //tilføj kontaktperson
        }
        if (tal == 3) {
            Ansat ansat = new Ansat(fornavn, efternavn, cprNr, adresse, telefonnummer, email);
            medarbejderListe.tilføj(ansat);
            System.out.println("vil du tilføje en ny medarbejder?");
        }
    }

    private void seListe(int valg){
        if (valg == 1){
            børneliste.seListen();
        }
        if (valg == 2){
            //se kontaktperson liste
        }
        if (valg == 3){
            medarbejderListe.seListen();
        }
    }

    private void søg(int valg){
        System.out.println("skriv navn du vil søge på");
        String navn = sc.next();
        if (valg == 1){
            børneliste.søg(navn);
        }
        if (valg == 2){
            //søg kontaktpersoner
        }
        if (valg == 3){
            medarbejderListe.søg(navn);
        }
    }

    private void rediger(int valg) {
        try {
            if (valg == 1) {
                System.out.println("indtast cpr nummer");
                int cpr = sc.nextInt();
                Barn barn = børneliste.findBarnForCprNr(cpr);
                int index = børneliste.fåIndex(barn);

                System.out.println("ret fornavn");
                barn.setFornavn(sc.next());
                System.out.println("ret efternavn");
                barn.setEfternavn(sc.next());
                System.out.println("ret cpr nummer");
                barn.setCprNr(sc.nextInt());
                System.out.println("ret adresse");
                barn.setAdresse(sc.next());
                System.out.println("ret telefonnummer");
                barn.setTelefonnummer(sc.next());
                System.out.println("ret email");
                barn.setEmail(sc.next());

                børneliste.rediger(index, barn);
            }
        } catch (Exception e){

        }
    }

    private void slet(int valg){
        try {
            if (valg == 1) {
                System.out.println("indtast cpr nummer for barn du vil slette");
                int cpr = sc.nextInt();
                Barn barn = børneliste.findBarnForCprNr(cpr);
                int index = børneliste.fåIndex(barn);
                børneliste.slet(index);
            }
        } catch (Exception e){

        }
    }

}
