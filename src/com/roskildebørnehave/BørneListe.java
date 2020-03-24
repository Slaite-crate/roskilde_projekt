package com.roskildebørnehave;

import java.util.ArrayList;

public class BørneListe implements Liste{

    private ArrayList<Barn> børneliste;

    public BørneListe(){
        børneliste = new ArrayList<>();
    }

    @Override
    public void tilføj(Person person) {
        Barn barn = (Barn) person;
        børneliste.add(barn);
    }

    @Override
    public void seListen() {
        System.out.println(børneliste.toString());
    }

    @Override
    public void søg(String navn) {
        for(Barn a : børneliste){
            if (a.getFornavn().toLowerCase().contains(navn.toLowerCase()) || a.getEfternavn().toLowerCase().contains(navn.toLowerCase())){
                System.out.println(a.toString());
            }
        }
    }

    @Override
    public void rediger(int index, Person person) {
        Barn barn = (Barn) person;
        børneliste.set(index, barn);
    }

    @Override
    public void slet(int index) {

    }
}
