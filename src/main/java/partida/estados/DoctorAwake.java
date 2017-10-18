package partida.estados;

import partida.Estado;
import partida.Jugador;
import partida.Partida;
import roles.Med;

public class DoctorAwake extends Estado {

    private Partida partida;
    public DoctorAwake(Partida partida) {
        this.partida = partida;
    }

    public void performActionUpon(Jugador j, Med me) {
        j.setAlive(true);
        System.out.println("Doctor "+ me.toString() + " saves " + j.toString());
        nextState();
    }

    public void nextState() {
        partida.getCurrentRound().setCurrentState(partida.getCurrentRound().getDaytime());
    }

    @Override
    public void run() throws Exception {
        System.out.println("Doctor, please awake");

    }

    public String toString(){
        return "Doctor Awake";
    }

}
