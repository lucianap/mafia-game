package partida.voting;

import partida.Jugador;

import java.util.*;
import java.util.stream.Collectors;

public abstract class AbstractVoting<T> {

    protected Map<Jugador, Integer> votados;
    protected HashMap<T, Jugador> whoVoteWho;

    public AbstractVoting(){
        votados = new HashMap<>();
        whoVoteWho = new HashMap<>();
    }

    public void vote(Jugador to, T from) {
        votados.merge(to, 1, (a, b) -> a + b);
        whoVoteWho.put(from, to);
    }

    public List<Jugador> getMoreVoted(){
        if(votados.isEmpty())
            return Collections.emptyList();
        long max = votados.values().stream().max(Comparator.naturalOrder()).get();
        return votados.entrySet().stream()
                .filter(e -> e.getValue() == max)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    public int numberOfVotes(){
        return whoVoteWho.keySet().size();
    }

    public void changeVote(Jugador to, T from){
        if(whoVoteWho.get(from) != null) {
            //Update whoVotesWho list
            Jugador firstVoted = whoVoteWho.get(from);
            whoVoteWho.put(from, to);

            //I delete one vote from the first voted player
            int votes = votados.get(firstVoted) - 1;
            votados.put(firstVoted, votes);

            //Vote new player
            vote(to, from);
        } else {
            System.out.println("You can't change your vote if you had not voted first!");
        }

    }

}
