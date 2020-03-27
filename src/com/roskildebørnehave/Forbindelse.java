package com.roskildebørnehave;

public class Forbindelse {
    String barnID;
    String forælderID;
    Barn barn;
    Forælder forælder;

    public Forbindelse(Barn barn, Forælder forælder){
        this.barn = barn;
        this.forælder = forælder;
        this.barnID = barn.getCprNummer();
        this.forælderID = forælder.getCprNummer();
    }

    public String gemTilFil(){
        return barnID + " % " + forælderID;
    }
}