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

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEfternavn() {
        return efternavn;
    }

    public void setEfternavn(String efternavn) {
        this.efternavn = efternavn;
    }

    public int getCprNr() {
        return cprNr;
    }

    public void setCprNr(int cprNr) {
        this.cprNr = cprNr;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "/nfornavn: " + fornavn + " efternavn: " + efternavn;
    }

}