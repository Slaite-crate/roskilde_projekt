package com.roskildebørnehave;

import java.util.List;

public interface Liste {
    //tilføj til liste
    public void tilføj(Person person);

    //se hele listen
    public void seListen();

    //se enhed på listen (søg)
    public void søg(String navn);

    //rediger enhed på liste
    public void rediger(int index, Person person);

    //slet enhed fra liste
    public void slet(int index);
}
