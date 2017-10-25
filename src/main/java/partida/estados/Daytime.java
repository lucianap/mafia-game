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
        System.out.println("Players being killed: " + partida.playersToBeKilled());
        partida.killPlayers();
        Thread.sleep(100l);
        nextState();
    }

    public void nextState() {
        partida.getCurrentRound().setCurrentState(partida.getCurrentRound().getPartialDeliberation());
    }

    public String toString(){
        return "Daytime";
    }

}
