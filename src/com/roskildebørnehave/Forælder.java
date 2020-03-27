package com.roskildebørnehave;

public class Forælder {
    int ID;
    String navn;

    public Forælder(int ID, String navn){
        this.ID = ID;
        this.navn = navn;
    }

    public int getID() {
        return ID;
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
}
