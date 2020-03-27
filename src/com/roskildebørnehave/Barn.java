package com.roskildebørnehave;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Barn {
    private int ID;
    private String navn;
    private String cprNummer;
    private int alder;
    private boolean venteliste;
    private String tilføjelsesDato;

    public Barn(int ID, String navn, String cprNummer, int alder, boolean venteliste, String tilføjelsesDato) {
        this.ID = ID;
        this.navn = navn;
        this.cprNummer = cprNummer;
        this.alder = alder;
        this.venteliste = venteliste;
        this.tilføjelsesDato = tilføjelsesDato;
    }

    public Barn(int ID, String navn, String cprNummer, boolean venteliste) {
        this.ID = ID;
        this.navn = navn;
        this.cprNummer = cprNummer;
        this.venteliste = venteliste;
        this.alder = aldersOmregner(cprNummer);
        this.tilføjelsesDato = dato();
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getID(){
        return ID;
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
        return "\nnavn: " + navn;
    }

    public String gemTilFil(){
        return ID + " % " + navn + " % " + cprNummer + " % " + alder + " % " + venteliste + " % " + tilføjelsesDato;
    }
}
