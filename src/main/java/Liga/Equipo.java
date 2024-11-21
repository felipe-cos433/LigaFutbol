package Liga;

public class Equipo {

    //Atributos

    int codEquipo,titulos;
    String nombreEquipo,ciudad,
            mascota,estadio,nomina,entrenar;

    //Metodos

//Metodo constructor
    public Equipo(int codEquipo, String nombreEquipo) {
        this.codEquipo = codEquipo;
        this.nombreEquipo = nombreEquipo;
    }
    public void ingresarEquipo(int titulos,String ciudad, String mascota){
        this.titulos= titulos;
        this.ciudad= ciudad;
        this.mascota= mascota;
    }
    public String mostrarEquipo(){
        return " El equipo "+nombreEquipo+" Es local en la ciudad de "+ciudad+" tiene "+titulos+" titulos en sus vitrinas y su mascota es "+mascota;
    }
    public void contratarJugadores(){
        System.out.println("El equipo contrata jugadores");
    }
    public void generarentrenamientos(){
        System.out.println("El equipo genera entrenamientos");
    }
    public void jugarTorneos(){
        System.out.println("El equipos juega torneos");
    }
}
