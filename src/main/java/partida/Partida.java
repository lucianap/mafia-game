package partida;

import partida.estados.*;
import roles.Civilian;
import roles.Mafia;
import roles.Med;
import roles.Police;

import java.util.List;

public class Partida {

    private Ronda currentRound;
    private List<Jugador> jugadores;

    public Partida(List<Jugador> jugadores) {
        this.jugadores = jugadores;
        currentRound = new Ronda(this);

        try {
            startPartida();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int numberOfPlayers(){
        return jugadores.size();
    }

    private void startPartida() throws Exception {
        this.currentRound.getCurrentState().run();
    }


    public boolean ends(){
        boolean shouldEnd = false;
        if(mafiaWins() || townWins()) {
            shouldEnd = true;
        }
        return shouldEnd;
    }

    public long numberOfMafiasAlive(){
        long aliveMafias = jugadores.stream().filter(j -> (j.isMafia() && j.isAlive())).count();
        return aliveMafias;
    }

    private boolean mafiaWins(){
        int mafias = 0;
        int civilians = 0;
        for(Jugador j: jugadores) {
            if(j.isAlive() && j.isMafia()) {
                mafias++;
            } else if (j.isAlive() && !j.isMafia()) {
                civilians++;
            }
        }

        return (mafias > civilians);
    }

    private boolean townWins(){
        return (numberOfMafiasAlive() == 0);
    }

    public Ronda getCurrentRound() {
        return currentRound;
    }

    public void nextRound() {
        if(!ends()) {
            this.currentRound = new Ronda(this);
        } else if(mafiaWins()) {
            System.out.println("The mafia wins!");
        } else if(townWins()){
            System.out.println("The townpeople wins!");
        }
    }

    public void performActionUpon(Jugador j, Med me) {
        this.currentRound.getCurrentState().performActionUpon(j, me);
    }
    public void performActionUpon(Jugador j, Police me) {
        this.currentRound.getCurrentState().performActionUpon(j, me);
    }
    public void performActionUpon(Jugador j, Civilian me) {
        this.currentRound.getCurrentState().performActionUpon(j, me);
    }
    public void performActionUpon(Jugador j, Mafia me) {
        this.currentRound.getCurrentState().performActionUpon(j, me);
    }

}
