public class Main extends Persona{

        public static void main(String[] args) {
        Futbolista jugador = new Futbolista();
        jugador.nombre = "Ronaldinho";
        jugador.viajar();
        jugador.concentrarse();

        Entrenador tecnico = new Entrenador();
        tecnico.nombre = "Segundo Castillo";
        tecnico.viajar();
        tecnico.dirigirPartido();

        Masajista masajista = new Masajista();
        masajista.nombre = "Cryuft";
        masajista.viajar();
        masajista.darMasaje();
    }

}
