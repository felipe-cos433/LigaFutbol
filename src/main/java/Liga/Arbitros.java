package Liga;

public class Arbitros {

    //Atributos
    int idarbitro,edad,aniosExper;
    double salario;
    String nombreArbitro,posicion;

    //Metodos


    public Arbitros(int idarbitro, String nombreArbitro, String posicion) {
        this.idarbitro = idarbitro;
        this.nombreArbitro = nombreArbitro;
        this.posicion = posicion;
    }
    public void pitar(){
        System.out.println("El arbitro pita partidos");
    }
    public void informes(){
        System.out.println("El arbitro realiza informes de los partidos");
    }
    public void sanciones(){
        System.out.println("El arbitro puede sancionar jugadores y equipos");
    }
}
