package domain;

public class Persona {

    private final int idPersona;
    private static int contadorPersonas;

    //PRIMERA VEZ QUE SE CARGA EN MEMORIA LA CLASE
    static {
        System.out.println("Ejecucion bloque estatico");
        ++Persona.contadorPersonas;

    }
    
    // CADA VEZ QUE SE CREE UNA CLASE!
    {
        System.out.println("Ejecucion bloque no estatico");
        this.idPersona = Persona.contadorPersonas++;
       
    }
    
    public Persona(){
        System.out.println("Ejecución del constructor");
    }

    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
    
}
