package partida;

import roles.Rol;

public class Jugador {

    private String name;
    private Rol rol;
    private boolean alive;
    private boolean eliminated;

    public Jugador(String name, Rol rol, boolean alive) {
        this.name = name;
        this.rol = rol;
        this.alive = alive;
        this.eliminated = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public boolean isMafia(){
        return rol.isMafia();
    }

    public void vote(Jugador j, Partida p) {
        p.vote(this, j);
    }

    public String toString(){
        return "Player " + name;
    }

    public boolean isEliminated() {
        return eliminated;
    }

    public void eliminate() {
        this.eliminated = true;
    }

}
