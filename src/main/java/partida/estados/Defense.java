package partida.estados;

import partida.Estado;
import partida.Jugador;
import partida.Partida;
import partida.voting.Voting;

public class Defense extends Estado {

    Partida partida;
    Voting partialDeliberation;

    public Defense(Partida p, Voting partialDeliberation) {
        this.partida = p;
    }

    public void nextState() {
        partida.getCurrentRound().setCurrentState(partida.getCurrentRound().getFinalDeliberation());
    }

    @Override
    public void run() throws Exception {
        System.out.println("Now the most voted will have 1 minute to defend themselves.");
        for(Jugador j: partialDeliberation.getMoreVoted()) {
            System.out.println("Now, please "+ j.getName() + " defend your case.");
            Thread.sleep(1000l);
        }

        nextState();

    }

    public String toString(){
        return "Defense";
    }
}
