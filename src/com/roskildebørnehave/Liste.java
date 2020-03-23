package com.roskildebørnehave;

import java.util.List;

public interface Liste {
    //tilføj til liste
    public void tilføj(Object obj);
    //se hele listen
    public List seListen();
    //se enhed på listen (søg)
    public Object seEnhed(String s) throws Exception;
    //rediger enhed på liste
    public void rediger();
    //slet enhed fra liste
    public void slet();
}
