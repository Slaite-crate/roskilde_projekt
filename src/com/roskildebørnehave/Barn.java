package com.roskildebørnehave;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Barn extends Person{

    private int alder;
    private Foraelder foraelder;

    public Barn(String fornavn, String efternavn, int cprNr, String adresse, String telefonnummer, String email) {
        super(fornavn, efternavn, cprNr, adresse, telefonnummer, email);
    }

    public int getAlder() {
        return alder;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }

    public Foraelder getForaelder() {
        return foraelder;
    }

    public void setForaelder(Foraelder foraelder) {
        this.foraelder = foraelder;
    }
    public int aldersOmregner(String cprNr){
        String holdParameter = cprNr;
        holdParameter = holdParameter.substring(0,6);
        String nyDato = "20"+holdParameter.substring(4,6)+"-";
        nyDato += holdParameter.substring(2,4);
        String idag = dato();
        return 0;
    }
    public String dato(){
        DateFormat df = new SimpleDateFormat("ddMMyy");
        Date idag = new Date();
        return df.format(idag);
    }
}
