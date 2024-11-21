package Liga;

public class Jugador {
//Atributos
    int idJugador,edad, numeroJugador;
    String nombreJugador, posicion;

//Metodos
    //Metodo constructor..
    public Jugador(){

    }
    public Jugador(String nombreJugador, int idJugador) {
        this.nombreJugador = nombreJugador;
        this.idJugador = idJugador;
    }
    public void ingresarDatosJugador(int edad,int numeroJugador, String posicion){
        this.edad =edad;
        this.numeroJugador = numeroJugador;
        this.posicion = posicion;
    }
    public String mostrarDatos(){
        return " El jugador "+ nombreJugador+" tiene "+edad+ " años y porta en su camisa el numero "+ numeroJugador+ " y juega en la posicion "+posicion;
    }
    public void entrenar(){
        System.out.println("El jugador puede entrenar");
    }
    public void jugar(){
        System.out.println("El jugador puede jugar");
    }
}
