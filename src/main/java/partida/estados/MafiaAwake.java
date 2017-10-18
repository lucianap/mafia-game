package partida.estados;

import partida.Estado;
import partida.Jugador;
import partida.Partida;
import partida.voting.Voting;
import roles.Mafia;

public class MafiaAwake extends Estado {

    private Partida partida;

    public MafiaAwake(Partida p) {
        this.partida = p;
    }

    private int votes = 0;
    public void performActionUpon(Jugador j, Mafia me) {
        votes++;
        if(votes == partida.numberOfMafiasAlive()) {
            votes = 0;
            System.out.println("Mafia " + me.toString() + " kills " + j.toString());
            j.setAlive(false);
            nextState();
        }
    }

    public void nextState() {
        partida.getCurrentRound().setCurrentState(partida.getCurrentRound().getPoliceAwake());
    }

    @Override
    public void run() throws Exception {
        System.out.println("Mafia, please awake");
    }

    public String toString(){
        return "Mafia Awake";
    }
}
