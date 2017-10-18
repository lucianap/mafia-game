package roles;

import partida.Jugador;
import partida.Partida;

public class Police implements Rol {

    public void performActionUpon(Jugador j, Partida p) {
        p.performActionUpon(j, this);
    }

    public boolean isMafia() {
        return false;
    }

    public String toString() {
        return "Police";
    }

}
