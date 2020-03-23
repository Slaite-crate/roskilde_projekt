package com.roskildebørnehave;
import java.util.ArrayList;

import java.util.List;

public class Medarbejderliste  implements Liste {
    private ArrayList<Ansat> medarbejderListe = new ArrayList <Ansat>();
    }

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

    }

    @Override
    public void slet() {

    }
}
