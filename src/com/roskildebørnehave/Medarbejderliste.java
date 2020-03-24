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
        int index;
        index = 1;

        Scanner ind = new Scanner(System.in);
        System.out.println("1 for Fornavn, 2 for Efternavn, 3 for cprNr, 4 for Adresse, 5 for Telefonnummer, 6 for Email");
        if(ind.nextInt() == 1){
            System.out.println("Skriv nyt fornavn");
            medarbejderliste.set(1,ind.nextString())
        }


        System.out.println("Indtast ny information");
        nyAnsat = ind.next
        Ansat nyAnsat;
        medarbejderListe.set(index, nyAnsat);
        System.out.println("Gemt");

    }

    @Override
    public void slet() {
    }
}
