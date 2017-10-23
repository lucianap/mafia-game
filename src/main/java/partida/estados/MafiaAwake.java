package partida.estados;

import partida.Estado;
import partida.Jugador;
import partida.Partida;
import partida.voting.MafiaVoting;
import roles.Mafia;
import roles.Rol;

import java.util.ArrayList;
import java.util.List;

public class MafiaAwake extends Estado {

    private Partida partida;
    private MafiaVoting deliberation;

    public MafiaAwake(Partida p) {
        this.partida = p;
        deliberation = new MafiaVoting();
    }

    public void performActionUpon(Jugador j, Mafia me) {
        deliberation.voteOrChangeVote(j, me);
        if ((deliberation.numberOfVotes() == partida.numberOfMafiasAlive()) && deliberation.getMoreVoted().size() == 1) {
            Jugador killed = deliberation.getMoreVoted().get(0);
            System.out.println("Mafia " + me.toString() + " kills " + killed.toString());
            killed.setAlive(false);
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
