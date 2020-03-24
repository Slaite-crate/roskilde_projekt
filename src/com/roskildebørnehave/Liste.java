package com.roskildebørnehave;

import java.util.List;

public interface Liste {
    //tilføj til liste
    public void tilføj(Object obj);
    //se hele listen
    public void seListen() throws Exception;
    //se enhed på listen (søg)
    public void seEnhed(int index) throws Exception;
    //rediger enhed på liste
    public void rediger(int index);
    //slet enhed fra liste
    public void slet(int index);
}
