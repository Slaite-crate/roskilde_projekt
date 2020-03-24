package com.roskildebørnehave;
import java.util.ArrayList;

import java.util.List;

public class Medarbejderliste  implements Liste {
    private ArrayList<Ansat> medarbejderListe = new ArrayList <Ansat>();


    @Override
    public void tilføj(Object obj) {
     Ansat nytObj=(Ansat)obj;
     medarbejderListe.add(nytObj);
    }

    @Override
    public List seListen() throws Exception{
        return null;
    }

    @Override
    public Person seEnhed(int index) throws Exception {
        return null;
    }

    @Override
    public void rediger(int index) {

    }

    @Override
    public void slet(int index) {

    }

}
