package roles;

import partida.Jugador;
import partida.Partida;

public interface Rol {

    void performActionUpon(Jugador j, Partida p);

    boolean isMafia();

    String toString();

}
