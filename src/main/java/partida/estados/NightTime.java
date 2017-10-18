package partida.estados;

import partida.Estado;
import partida.Partida;

public class NightTime extends Estado {

    Partida partida;

    public NightTime(Partida p) {
        this.partida = p;
    }

    public void nextState() {
        partida.getCurrentRound().setCurrentState(partida.getCurrentRound().getMafiaAwake());
    }

    @Override
    public void run() throws Exception {
        System.out.println("It's nighttime, so everybody goes to sleep.");
        try {
            Thread.sleep(1000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        nextState();
    }

    public String toString(){
        return "NightTime";
    }
}
