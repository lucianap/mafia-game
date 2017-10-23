import partida.Jugador;
import roles.*;

import java.util.ArrayList;
import java.util.List;

public class BasicScheme {

    Jugador mafia1 = new Jugador("mafia1", RolFactory.getMafiaRole(), true);
    Jugador mafia2 = new Jugador("mafia2", RolFactory.getMafiaRole(), true);

    Jugador civil1 = new Jugador("civil1", RolFactory.getCivilianRole(), true);
    Jugador civil2 = new Jugador("civil2", RolFactory.getCivilianRole(), true);
    Jugador civil3 = new Jugador("civil3", RolFactory.getCivilianRole(), true);
    Jugador civil4 = new Jugador("civil4", RolFactory.getCivilianRole(), true);

    Jugador med = new Jugador("med", RolFactory.getMedRole(), true);
    Jugador police = new Jugador("police", RolFactory.getPoliceRole(), true);

    List<Jugador> jugadores = new ArrayList<Jugador>();

    public BasicScheme(){
        jugadores.add(mafia1);
        jugadores.add(mafia2);
        jugadores.add(civil1);
        jugadores.add(civil2);
        jugadores.add(civil3);
        jugadores.add(civil4);
        jugadores.add(med);
        jugadores.add(police);
    }

    public List<Jugador> getPlayersList() {
        return jugadores;
    }
}
