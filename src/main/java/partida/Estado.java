package partida;

import roles.Civilian;
import roles.Mafia;
import roles.Med;
import roles.Police;

public abstract class Estado {

    public void vote(Jugador from, Jugador to) {}

    public void performActionUpon(Jugador j, Med me) {}
    public void performActionUpon(Jugador j, Police me) {}
    public void performActionUpon(Jugador j, Civilian me) {}
    public void performActionUpon(Jugador j, Mafia me) {}
    public abstract void nextState();
    public abstract void run() throws Exception ;

}
