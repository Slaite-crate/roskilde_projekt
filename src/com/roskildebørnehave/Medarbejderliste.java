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

        int valg = input.nextInt();
        if (valg == 1){
            fornavn = input.next();
        }
        efternavn = input.next();
        cprNr = input.nextInt();
        adresse = "københavn";
        telefonnummer = "123498765";
        email = "noget@mail.com";

        Ansat nyAnsat;
        nyAnsat = new Ansat(fornavn, efternavn, cprNr, adresse, telefonnummer, email);

        medarbejderListe.set(index, nyAnsat);

        System.out.println("Gemt");

    }

    @Override
    public void slet() {
    }
}
