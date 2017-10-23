import org.junit.Assert;
import org.junit.Test;
import partida.Partida;

public class EstadosTest {

    @Test
    public void EstadosTest(){
        BasicScheme scheme = new BasicScheme();

        Partida partida1 = new Partida(scheme.getPlayersList());
    }

    @Test
    public void MafiaAwakeTest(){

        BasicScheme scheme = new BasicScheme();

        Partida partida1 = new Partida(scheme.getPlayersList());

        //First partida must starts at nighttime
        partida1.getCurrentRound().getCurrentState().toString().equals("NightTime");

        //Civil wont do anything
        scheme.civil1.getRol().performActionUpon(scheme.civil2, partida1);

        //Mafia changes voting
        scheme.mafia1.getRol().performActionUpon(scheme.police, partida1);
        scheme.mafia1.getRol().performActionUpon(scheme.civil3, partida1);

        //MAFIA KILLS!
        scheme.mafia2.getRol().performActionUpon(scheme.police, partida1);
        scheme.mafia1.getRol().performActionUpon(scheme.police, partida1);

        //Police asks
        scheme.police.getRol().performActionUpon(scheme.mafia1, partida1);

        //Doctor saves police
        scheme.med.getRol().performActionUpon(scheme.police, partida1);





    }


}
