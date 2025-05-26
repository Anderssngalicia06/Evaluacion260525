public class Main extends Persona{

        public static void main(String[] args) {
        Futbolista jugador = new Futbolista();
        jugador.nombre = "Benzema";
        jugador.viajar();
        jugador.concentrarse();

        Entrenador tecnico = new Entrenador();
        tecnico.nombre = "Xavi";
        tecnico.viajar();
        tecnico.dirigirPartido();

        Masajista masajista = new Masajista();
        masajista.nombre = "Messi";
        masajista.viajar();
        masajista.darMasaje();
    }

}
