package es.masanz.ut5.iceslide.model;

public class IceSlide {

    // TODO 01: Definicion de atributos

    private int curLevel;
    private int[][] escenario;
    private int filaJugador, columnaJugador;

    public IceSlide(int altura, int anchura){
        // TODO 02: conscructor 1
        altura = 0;
        anchura = 0;
    }

    public IceSlide(int[][] escenario){
        // TODO 03: conscructor 2

        if(filaJugador == 0 && columnaJugador == 0){
            IceSlide(filaJugador, columnaJugador);
        }else {
            clonarEscenario(escenario);

        }

    }

    private void clonarEscenario(int[][] escenario) {
        // TODO 04: clonar la matriz facilitada sobre el atributo escenario


    }

    private boolean encontrarJugador() {
        // TODO 05: localizar la celda tipo JUGADOR en el atributo escenario
        return false;
    }

    public void moverJugador(int despFila, int despCol){
        // TODO 06: desplazar el jugador siguiendo las reglas indicadas
    }

    private boolean desplazarHielo(int filaHielo, int colHielo, int despFila, int despCol) {
        // TODO 07: desplazar el bloque de hielo siguiendo las reglas indicadas
        return false;
    }

    public boolean completado(){
        // TODO 08: indicar si el nivel ha sido resuelto
        return false;
    }

    public int[][] getEscenario() {
        // TODO 09: devolver el objeto correspondiente
        return null;
    }
}
