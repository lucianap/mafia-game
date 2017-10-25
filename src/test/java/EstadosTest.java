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

        System.out.println("Partida state: " + partida1.getCurrentRound().getCurrentState());

        //Police asks
        scheme.police.getRol().performActionUpon(scheme.mafia1, partida1);

        System.out.println("Partida state: " + partida1.getCurrentRound().getCurrentState());

        //Doctor saves police
        scheme.med.getRol().performActionUpon(scheme.police, partida1);

        System.out.println("Partida state: " + partida1.getCurrentRound().getCurrentState());

        scheme.civil1.vote(scheme.civil3, partida1);
        scheme.civil2.vote(scheme.civil3, partida1);
        scheme.civil1.vote(scheme.civil3, partida1);
        scheme.civil3.vote(scheme.civil1, partida1);
        scheme.civil4.vote(scheme.med, partida1);
        scheme.police.vote(scheme.civil3, partida1);
        scheme.mafia1.vote(scheme.civil3, partida1);
        scheme.med.vote(scheme.civil3, partida1);
        scheme.police.vote(scheme.civil1, partida1);
        scheme.mafia2.vote(scheme.civil1, partida1);


        System.out.println("Partida state: " + partida1.getCurrentRound().getCurrentState());






    }


}
