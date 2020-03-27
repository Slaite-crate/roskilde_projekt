package com.roskildebørnehave;

public class Forbindelse {
    int barnID;
    int forælderID;
    Barn barn;
    Forælder forælder;

    public Forbindelse(Barn barn, Forælder forælder){
        this.barn = barn;
        this.forælder = forælder;
        this.barnID = barn.getID();
        this.forælderID = forælder.getID();
    }

    public String gemTilFil(){
        return barnID + " % " + forælderID;
    }
}