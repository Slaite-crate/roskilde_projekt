package com.roskildebørnehave;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Medarbejderliste  implements Liste {
    private ArrayList<Ansat> medarbejderListe = new ArrayList <Ansat>();



    @Override
    public void tilføj(Object obj) {
     Ansat nytObj=(Ansat)obj;
     medarbejderListe.add(nytObj);
    }

    @Override
    public List seListen() {
        return null;
    }

    @Override
    public Object seEnhed(String s) {
        return null;
    }

    @Override
    public void rediger() {
        Scanner input = new Scanner(System.in);
        int index;
        index = input.nextInt();

        String fornavn;
        String efternavn;
        int cprNr;
        String adresse;
        String telefonnummer;
        String email;

        fornavn = medarbejderListe.get(index).getFornavn();
        efternavn = medarbejderListe.get(index).getEfternavn();
        cprNr = medarbejderListe.get(index).getCprNr();
        adresse = medarbejderListe.get(index).getAdresse();
        telefonnummer = medarbejderListe.get(index).getTelefonnummer();
        email = medarbejderListe.get(index).getEmail();

        System.out.println("Tast 1 for fornavn, 2 for efternavn, 3 for cprNr, 4 for adresse, 5 for telefonnummer, 6 for email");
        int valg = input.nextInt();
        if (valg == 1){
            System.out.println("Indtast nyt fornavn");
            fornavn = input.next();
        }
        else if(valg == 2) {
            System.out.println("Indtast nyt efternavn");
            efternavn = input.next();
        }
        else if(valg == 3) {
            System.out.println("Indtast nyt cprNr");
            cprNr = input.nextInt();
        }
        else if(valg == 4) {
            System.out.println("Indtast ny adresse");
            adresse = input.next();
        }
        else if(valg == 5) {
            System.out.println("Indtast nyt telefonnummer");
            telefonnummer = input.next();
        }
        else if(valg ==5) {
            System.out.println("Indtast ny email");
            email = input.next();
        }

        Ansat nyAnsat;
        nyAnsat = new Ansat(fornavn, efternavn, cprNr, adresse, telefonnummer, email);

        medarbejderListe.set(index, nyAnsat);

        System.out.println("Gemt");

    }

    @Override
    public void slet() {
    }
}
