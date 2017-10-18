import org.junit.Test;
import partida.Partida;

public class PartidaTest {

    @Test
    public void EstadosTest(){
        BasicScheme scheme = new BasicScheme();

        Partida partida1 = new Partida(scheme.getPlayersList());

        //First partida must starts at nighttime
        partida1.getCurrentRound().getCurrentState().toString().equals("NightTime");

    }


}
