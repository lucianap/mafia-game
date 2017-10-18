package roles;

import partida.Jugador;
import partida.Partida;

public class Civilian implements Rol {

    public void performActionUpon(Jugador j, Partida p) {
        p.performActionUpon(j, this);
    }

    public boolean isMafia() {
        return false;
    }

    public String toString() {
        return "Civil";
    }


}
