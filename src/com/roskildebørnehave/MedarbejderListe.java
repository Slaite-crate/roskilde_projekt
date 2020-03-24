package com.roskildebørnehave;
import java.util.ArrayList;

import java.util.List;

public class MedarbejderListe implements Liste {
    private ArrayList<Ansat> medarbejderListe = new ArrayList <Ansat>();

    @Override
    public void tilføj (Person person) {
     Ansat ansat = (Ansat)person;
     medarbejderListe.add(ansat);
    }

    @Override
    public void seListen() {
        System.out.println(medarbejderListe.toString());
    }

    @Override
    public void søg(String ord) {

    }

    @Override
    public void rediger(int index, Person person) {

    }

    @Override
    public void slet(int index) {

    }
}



