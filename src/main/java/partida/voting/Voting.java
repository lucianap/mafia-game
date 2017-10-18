package partida.voting;

import partida.Jugador;

import java.util.*;
import java.util.stream.Collectors;

public class Voting {

    Map<Jugador, Integer> votados;
    List<Jugador> votaron;

    public Voting(){
        votados = new HashMap<>();
    }

    public void vote(Jugador to, Jugador from) {
        if(!votaron.contains(from)) {
            votados.merge(to, 1, (a, b) -> a + b);
        }
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
        return votaron.size();
    }

}
