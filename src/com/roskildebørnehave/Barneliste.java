package com.roskildebørnehave;

import java.util.ArrayList;
import java.util.List;

public class Barneliste implements Liste{

    private ArrayList<Barn> barneliste;

    public Barneliste(){
        barneliste = new ArrayList<Barn>();
    }

    @Override
    public void tilføj(Object obj) {
        Barn nytObj = (Barn) obj;
        barneliste.add(nytObj);
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
