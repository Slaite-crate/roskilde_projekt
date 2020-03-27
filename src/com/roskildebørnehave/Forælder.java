package com.roskildebørnehave;

public class Forælder {
    String navn;
    String cprNummer;
    String adresse;
    int telefonnummer;

    public Forælder(String navn, String cprNummer, String adresse, int telefonnummer) {
        this.navn = navn;
        this.cprNummer = cprNummer;
        this.adresse = adresse;
        this.telefonnummer = telefonnummer;
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

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(int telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    public String gemTilFil(){
        return navn + " % " + cprNummer + " % " + adresse + " % " + telefonnummer;
    }
}
