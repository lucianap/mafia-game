package partida.estados;

import partida.Estado;
import partida.Jugador;
import partida.Partida;
import partida.voting.PlayersVoting;

public class FinalDeliberation extends Estado {

    Partida partida;
    PlayersVoting finalDeliberation;

    public FinalDeliberation(Partida p){
        this.partida = p;
    }

    public void nextState() {
        partida.nextRound();
    }

    @Override
    public void run() throws Exception {
        System.out.println("Now, anyone will change your vote?");
    }

    public String toString(){
        return "Final deliberation";
    }

    public void vote(Jugador from, Jugador to){
        finalDeliberation.vote(to, from);
    }

}
