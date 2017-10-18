package partida.estados;

import partida.Estado;
import partida.Jugador;
import partida.Partida;
import roles.Police;

public class PoliceAwake extends Estado {

    Partida partida;

    public void performActionUpon(Jugador j, Police me) {
        System.out.println("Police " + me.toString() + " ask if " + j.toString() + "is mafia? " + j.isMafia());
        nextState();
    }

    public PoliceAwake(Partida p) {
        this.partida = p;
    }

    public void nextState() {
        partida.getCurrentRound().setCurrentState(partida.getCurrentRound().getDoctorAwake());
    }

    @Override
    public void run() throws Exception {
        System.out.println("Police, please awake.");
    }

    public String toString(){
        return "Police Awake";
    }

}
