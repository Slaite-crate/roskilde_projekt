package com.roskildebørnehave;

public abstract class Person {
    private String fornavn;
    private String efternavn;
    private int cprNr;
    private String adresse;
    private String telefonnummer; // hvis man skal kunne skrive '+45' eller lign.
    private String email;

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