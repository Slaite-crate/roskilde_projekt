package com.roskildebørnehave;

import java.util.Scanner;

public class Menu {
    Scanner sc;
    BørneListe børneliste;

    public Menu(){
        børneliste = new BørneListe();
        sc = new Scanner(System.in);
    }

    public void start(){
        boolean kør = true;
        while (kør){
            hovedMenu();
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            if (input == 1){
                børneMenu();
            }
            if (input == 4){
                kør = false;
            }
        }
    }

    private void børneMenu(){
        System.out.println("1: tilføj barn");
        System.out.println("2: se liste over børn");
        System.out.println("3: søg listen");
        System.out.println("4: rediger listen");
        System.out.println("5: slet fra listen");
        int valg = sc.nextInt();
        if (valg == 1){
            Person person = tilføjOplysninger(1);
            børneliste.tilføj(person);
        }
        if (valg == 2){
            børneliste.seListen();
        }
        if (valg == 3){
            System.out.println("intast navn: ");
            String navn = sc.next();
            børneliste.søg(navn);
        }
        if (valg == 4){

        }
    }

    private Person tilføjOplysninger(int tal){
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
            return new Barn(fornavn, efternavn, cprNr, adresse, telefonnummer, email);
        }
        if (tal == 2) {
            return new Kontaktperson(fornavn, efternavn, cprNr, adresse, telefonnummer, email);
        }
        else {
            return new Ansat(fornavn, efternavn, cprNr, adresse, telefonnummer, email);
        }
    }

    private void hovedMenu(){
        System.out.println("1: børn");
        System.out.println("2: kontaktperson");
        System.out.println("3: medarbejder");
        System.out.println("4: afslut program");
    }
}
