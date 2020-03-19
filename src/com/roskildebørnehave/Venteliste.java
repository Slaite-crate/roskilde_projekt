package com.roskildebørnehave;

import java.util.Date;

public class Venteliste {
    Date tilfoejelsesTidspunkt;
    Barn barn;

    public Venteliste(Date tilfoejelsesTidspunkt, Barn barn) {
        this.tilfoejelsesTidspunkt = tilfoejelsesTidspunkt;
        this.barn = barn;
    }

    public Date getTilfoejelsesTidspunkt() {
        return tilfoejelsesTidspunkt;
    }

    public void setTilfoejelsesTidspunkt(Date tilfoejelsesTidspunkt) {
        this.tilfoejelsesTidspunkt = tilfoejelsesTidspunkt;
    }

    public Barn getBarn() {
        return barn;
    }

    public void setBarn(Barn barn) {
        this.barn = barn;
    }
}
