package partida;

import roles.Rol;

public class Jugador {

    private String name;
    private Rol rol;
    private boolean alive;

    public Jugador(String name, Rol rol, boolean alive) {
        this.name = name;
        this.rol = rol;
        this.alive = alive;
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

    public Jugador vote(Jugador j) {
        return j;
    }

    public String toString(){
        return "Player " + name;
    }


}
