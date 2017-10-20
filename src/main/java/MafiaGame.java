import partida.Jugador;
import partida.Partida;
import roles.Civilian;
import roles.Mafia;
import roles.Med;
import roles.Police;

import java.util.ArrayList;
import java.util.List;

public class MafiaGame {

    public static void main(String[] args) {

        List<Jugador> jugadores = new ArrayList<Jugador>();
        int numberOfPlayers = 9;
        int numberOfMafias = 2;

        Jugador mafia1 = new Jugador("mafia1", new Mafia(), true);
        Jugador mafia2 = new Jugador("mafia2", new Mafia(), true);

        Jugador civil1 = new Jugador("civil1", new Civilian(), true);
        Jugador civil2 = new Jugador("civil2", new Civilian(), true);
        Jugador civil3 = new Jugador("civil3", new Civilian(), true);
        Jugador civil4 = new Jugador("civil4", new Civilian(), true);

        Jugador med = new Jugador("med", new Med(), true);
        Jugador police = new Jugador("police", new Police(), true);

        jugadores.add(mafia1);
        jugadores.add(mafia2);


        jugadores.add(civil1);
        jugadores.add(civil2);
        jugadores.add(civil3);
        jugadores.add(civil4);
        jugadores.add(med);
        jugadores.add(police);

        Partida p = new Partida(jugadores);

        mafia1.getRol().performActionUpon(civil1, p);
        mafia2.getRol().performActionUpon(civil1, p);

        police.getRol().performActionUpon(med, p);








    }



}
