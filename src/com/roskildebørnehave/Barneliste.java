package com.roskildebørnehave;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Barneliste implements Liste{

    private Map<Integer, Barn> barneliste;

    public Barneliste(){
        barneliste = new HashMap<Integer, Barn>();
    }

    @Override
    public void tilføj(Object obj) {
        Barn nytObj = (Barn) obj;
        barneliste.put(nytObj.getCprNr(),nytObj);
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
