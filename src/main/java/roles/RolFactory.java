package roles;

public class RolFactory {

    public static Rol getCivilianRole(){
        return new Civilian();
    }

    public static Rol getMafiaRole(){
        return new Mafia();
    }

    public static Rol getMedRole(){
        return new Med();
    }

    public static Rol getPoliceRole(){
        return new Police();
    }

}
