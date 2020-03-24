package com.roskildebørnehave;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venteliste implements Liste{
    private List<Barn> venteliste;

    public Venteliste() {
        this.venteliste = new ArrayList<>();
    }

    @Override
    public void tilføj(Object obj) {
        Barn nytObj=(Barn)obj;
        if (venteliste != null){
            if(venteliste.contains(nytObj)){
                System.out.println("Objektet findes allerede på listen");
            }
        }
        else{
            venteliste.add(nytObj);
            nytObj.setTilføjelsesTidspunkt(LocalDate.now());
        }
    }

    @Override
    public void seListen() throws Exception {
        if (venteliste == null){
            System.out.println("Listen er tom!");
        }else
            System.out.println(venteliste);
    }

    @Override
    public void seEnhed(int index) throws Exception {
        for(Barn b : venteliste){
            if(index == b.getCprNr()) {
                System.out.println(b);
            }
            else {
                System.out.println("Barnet med dette cprnr:" + index + "findes ikke på listen");
            }
        }
    }

    @Override
    public void rediger(int index) {
        for(Barn b : venteliste){
            if(index == b.getCprNr()) {
                System.out.println("Hvad vil du rette på "+ b.getFornavn() + " " + b.getEfternavn());
            }
            else {
                System.out.println("Barnet med dette cprnr:" + index + "findes ikke på listen");
            }
        }
    }

    @Override
    public void slet(int index) {
        for(Barn b : venteliste){
            if(index == b.getCprNr()) {
                venteliste.remove(b);
            }
            else {
                System.out.println("Barnet med dette cprnr:" + index + "findes ikke på listen");
            }
        }
    }
}
