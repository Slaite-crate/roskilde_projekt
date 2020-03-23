package com.roskildebørnehave;

public abstract class Person {
    protected String fornavn;
    protected String efternavn;
    protected int cprNr;
    protected String adresse;
    protected String telefonnummer; // hvis man skal kunne skrive '+45' eller lign.
    protected String email;

    public Person(String fornavn, String efternavn, int cprNr, String adresse, String telefonnummer, String email) {
        this.fornavn = fornavn;
        this.efternavn = efternavn;
        this.cprNr = cprNr;
        this.adresse = adresse;
        this.telefonnummer = telefonnummer;
        this.email = email;
    }

    @Override
    public String toString() {
        return fornavn + " " + efternavn;
    }

}