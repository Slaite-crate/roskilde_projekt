package com.roskildebørnehave;
import java.util.ArrayList;

import java.util.List;

public class Medarbejderliste  implements Liste {
    private ArrayList<Ansat> medarbejderListe = new ArrayList <Ansat>();

    @Override
    public void tilføj (Object obj) {
     Ansat nytObj=(Ansat)obj;
     medarbejderListe.add(nytObj);
    }

    @Override
    public List seListen() {
        return medarbejderListe;
    }

    @Override
    public Object seEnhed(int index) throws Exception {
        /*for(Ansat a : medarbejderListe){
            if (a.toString() != null && a.toString().equals(s)){
                return a;
            }
        }*/
        throw new Exception("Navnet eksisterer ikke");
    }

    @Override
    public void rediger(int index) {

    }

    @Override
    public void slet(int index) {

    }


}



