package com.roskildebørnehave;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Barn extends Person{

    private int alder;
    private Kontaktperson kontaktperson1;
    private Kontaktperson kontaktperson2;


    public Barn(String fornavn, String efternavn, int cprNr, String adresse, String telefonnummer, String email) {
        super(fornavn, efternavn, cprNr, adresse, telefonnummer, email);
        this.alder = aldersOmregner(cprNr);
    }

    public int getAlder() {
        return alder;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }

    public Kontaktperson getKontaktperson1() {
        return kontaktperson1;
    }

    public void setKontaktperson1(Kontaktperson kontaktperson) {
        this.kontaktperson1 = kontaktperson;
    }

    public Kontaktperson getKontaktperson2() {
        return kontaktperson2;
    }

    public void setKontaktperson2(Kontaktperson kontaktperson) {
        this.kontaktperson2 = kontaktperson;
    }

    private int aldersOmregner(int cprNr){
        String holdParameter = Integer.toString(cprNr);
        String nyDato = "20" + holdParameter.substring(4,6) + "-";
        nyDato += holdParameter.substring(2,4) + "-";
        nyDato += holdParameter.substring(4,6);
        String idag = dato();
        LocalDate start = LocalDate.parse(idag);
        LocalDate slut = LocalDate.parse(nyDato);
        Period p =  Period.between(slut, start);
        return p.getYears();
    }

    private String dato(){
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date idag = new Date();
        return df.format(idag);
    }

    @Override
    public String toString(){
        return "Navn: " + getFornavn() + " " + getEfternavn() + " " + "CprNr: " + getCprNr() + " " + "Adresse: " + getAdresse() + " " + "Tlf: " + getTelefonnummer() + " " + "Email: " + getEmail() + " " + "Kontaktperson: " + kontaktperson1 + " " + "Kontaktperson: " + kontaktperson2;
    }

}
