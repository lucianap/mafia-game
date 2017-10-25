package partida;

import partida.estados.*;
import partida.voting.PlayersVoting;

public class Ronda {

    private Estado nighttime;
    private Estado mafiaAwake;
    private Estado policeAwake;
    private Estado doctorAwake;
    private Estado daytime;
    private Estado partialDeliberation;
    private Estado defense;
    private Estado finalDeliberation;
    private Estado currentState;

    private PlayersVoting deliberation;


    public Ronda(Partida p){
        this.deliberation = new PlayersVoting();
        nighttime = new NightTime(p);
        mafiaAwake = new MafiaAwake(p);
        policeAwake = new PoliceAwake(p);
        doctorAwake = new DoctorAwake(p);
        daytime = new Daytime(p);
        partialDeliberation = new PartialDeliberation(p, deliberation);
        defense = new Defense(p, deliberation);
        finalDeliberation = new FinalDeliberation(p, deliberation);

        currentState = nighttime;
    }

    public void setDeliberation(PlayersVoting partialDeliberation) {
        this.deliberation = partialDeliberation;
    }

    public Estado getCurrentState() {
        return currentState;
    }

    public void setCurrentState(Estado currentState) {
        this.currentState = currentState;
        try {
            this.currentState.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Estado getFinalDeliberation() {
        return finalDeliberation;
    }

    public Estado getDefense() {
        return defense;
    }

    public Estado getPartialDeliberation() {
        return partialDeliberation;
    }

    public Estado getDaytime() {
        return daytime;
    }

    public Estado getDoctorAwake() {
        return doctorAwake;
    }

    public Estado getPoliceAwake() {
        return policeAwake;
    }

    public Estado getMafiaAwake() {
        return mafiaAwake;
    }

    public Estado getNighttime() {
        return nighttime;
    }

}
