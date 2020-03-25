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
        børneliste.remove(index);
    }

    public Barn findBarnForCprNr(int cpr) throws Exception {
        for (Barn a : børneliste){
            if (a.getCprNr() == cpr){
                return a;
            }
        }
        throw new Exception("ingen match på cpr nummer");
    }

    public int fåIndex(Barn barn){
        return børneliste.indexOf(barn);
    }

    public void tilføjKontaktperson(Barn barn, Kontaktperson kontaktperson){
        if (barn.getKontaktperson1() == null){
            barn.setKontaktperson1(kontaktperson);
        } else if (barn.getKontaktperson2() == null){
            barn.setKontaktperson2(kontaktperson);
        } else {
            System.out.println("barnet har to kontaktpersoner");
        }
    }

    public void seKontaktpersonsListe(){
        for (Barn a : børneliste){
            if (a.getKontaktperson1() != null){
                System.out.println(a.getKontaktperson1().toString());
            }
            if (a.getKontaktperson2() != null){
                System.out.println(a.getKontaktperson2().toString());
            }
        }
    }
}
