package Liga;

public class Main {
    public static void main (String[] args){
        Operaciones op = new Operaciones(10,20);
        Operaciones op2 = new Operaciones(10.5,20.5);
        System.out.println("La suma de enteros es "+op.suma(10,20));
        System.out.println("La suma de decimales es "+op2.suma(10.5,20.5));
    }
    }
       /* Jugador jugador1 = new Jugador(" Cristiano Ronaldo " ,  10 );
        Equipo equipo1 = new Equipo(100 ," Deportivo tapitas ");

        jugador1.ingresarDatosJugador(39 , 7 ," Delantero ");
        System.out.println(jugador1.mostrarDatos());
        equipo1.ingresarEquipo( 2 ," cipaquira " ,"Gato ");
        System.out.println(equipo1.mostrarEquipo());
        System.out.println(equipo1.nombreEquipo);
    }
}*/
