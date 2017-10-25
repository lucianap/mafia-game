package partida.estados;

import partida.Estado;
import partida.Jugador;
import partida.Partida;
import partida.voting.PlayersVoting;

public class PartialDeliberation extends Estado {

    Partida partida;
    PlayersVoting deliberation;

    public PartialDeliberation(Partida p, PlayersVoting deliberation){
        this.partida = p;
        this.deliberation = deliberation;
    }

    public void nextState() {
        partida.getCurrentRound().setCurrentState(partida.getCurrentRound().getDefense());
    }

    @Override
    public void run() throws Exception {
        System.out.println("Now, I'll wait until everyone votes.");
    }

    public String toString(){
        return "Partial deliberation";
    }

    public void vote(Jugador from, Jugador to){
        deliberation.vote(to, from);
        if(deliberation.numberOfVotes() == partida.numberOfPlayers()) {
            partida.getCurrentRound().setDeliberation(deliberation);
            nextState();
        }
    }

}
