package com.roskildebørnehave;

public class Foraelder extends Person{
    private Barn barn;

    public Foraelder(String fornavn, String efternavn, int cprNr, String adresse, String telefonnummer, String email) {
        super(fornavn, efternavn, cprNr, adresse, telefonnummer, email);
    }

    public Barn getBarn() {
        return barn;
    }

    public void setBarn(Barn barn) {
        this.barn = barn;
    }

}
