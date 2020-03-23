package com.roskildebørnehave;

import java.util.ArrayList;
import java.util.List;

public class Forældreliste implements Liste {

    private ArrayList foraeldreliste;

    @Override
    public void tilføj(Object obj) {
        Forælder nytObj = (Forælder) obj;
        foraeldreliste.add(nytObj);
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
