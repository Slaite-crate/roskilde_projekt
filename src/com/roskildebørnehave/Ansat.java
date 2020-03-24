package com.roskildebørnehave;

public class Ansat extends Person {


    public Ansat(String fornavn, String efternavn, int cprNr, String adresse, String telefonnummer, String email) {
        super(fornavn, efternavn, cprNr, adresse, telefonnummer, email);
    }

    @Override
    public String toString(){
        return "Navn: " + getFornavn() + " " + getEfternavn() + " " + "CprNr: " + getCprNr() + " " + "Adresse: " + getAdresse() + " " + "Tlf: " + getTelefonnummer() + " " + "Email: " + getEmail();
    }



}
