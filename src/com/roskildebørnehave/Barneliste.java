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
        return barneliste;
    }

    @Override
    public Object seEnhed(String s) {
        ;
    }

    @Override
    public void rediger() {

    }

    @Override
    public void slet() {

    }
}
