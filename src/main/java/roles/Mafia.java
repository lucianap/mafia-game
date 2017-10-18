package roles;

import partida.Jugador;
import partida.Partida;

public class Mafia implements Rol {

    public void performActionUpon(Jugador j, Partida p) {
        p.performActionUpon(j, this);
    }

    public boolean isMafia() {
        return true;
    }

    public String toString() {
        return "Mafia";
    }

}
