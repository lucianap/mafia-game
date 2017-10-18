package partida.estados;

import partida.Estado;
import partida.Jugador;
import partida.Partida;

import java.util.List;

public class Daytime extends Estado {

    Partida partida;

    public Daytime(Partida p) {
        this.partida = p;
    }

    public void run() throws Exception {
        Thread.sleep(100l);
    }

    public void nextState() {
        partida.getCurrentRound().setCurrentState(partida.getCurrentRound().getPartialDeliberation());
    }

    public String toString(){
        return "Daytime";
    }

}
