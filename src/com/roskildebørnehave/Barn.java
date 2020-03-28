package com.roskildebørnehave;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Barn {
    private String navn;
    private String cprNummer;
    private int alder;
    private boolean venteliste;
    private String tilføjelsesDato;

    public Barn(String navn, String cprNummer, int alder, boolean venteliste, String tilføjelsesDato) {
        this.navn = navn;
        this.cprNummer = cprNummer;
        this.alder = alder;
        this.venteliste = venteliste;
        this.tilføjelsesDato = tilføjelsesDato;
    }

    public Barn(String navn, String cprNummer, boolean venteliste) {
        this.navn = navn;
        this.cprNummer = cprNummer;
        this.venteliste = venteliste;
        this.alder = aldersOmregner(cprNummer);
        this.tilføjelsesDato = dato();
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getCprNummer() {
        return cprNummer;
    }

    public void setCprNummer(String cprNummer) {
        this.cprNummer = cprNummer;
    }

    public int getAlder() {
        return alder;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }

    public boolean isVenteliste() {
        return venteliste;
    }

    public void setVenteliste(boolean venteliste) {
        this.venteliste = venteliste;
    }

    public String getTilføjelsesDato() {
        return tilføjelsesDato;
    }

    public void setTilføjelsesDato(String tilføjelsesDato) {
        this.tilføjelsesDato = tilføjelsesDato;
    }

    private int aldersOmregner(String cprNr){
        String nyDato = "20" + cprNr.substring(4,6) + "-";
        nyDato += cprNr.substring(2,4) + "-";
        nyDato += cprNr.substring(0,2);
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
        return "navn:   " + navn + " " + "\nalder:  " + alder + "\ncpr nummer:  " + cprNummer;
    }

    public String gemTilFil(){
        return navn + " % " + cprNummer + " % " + alder + " % " + venteliste + " % " + tilføjelsesDato;
    }
}
