package partida.voting;

import partida.Jugador;
import roles.Rol;

public class MafiaVoting extends AbstractVoting<Rol> {

    int getNumberOfVotes(){
        return whoVoteWho.size();
    }

    public void voteOrChangeVote(Jugador to, Rol me){
        if(whoVoteWho.get(me) != null) {
            this.changeVote(to, me);
        } else {
            this.vote(to, me);
        }
    }
}
