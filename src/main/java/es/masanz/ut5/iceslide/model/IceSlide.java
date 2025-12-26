package es.masanz.ut5.iceslide.model;

import static es.masanz.ut5.iceslide.model.Celda.*;

public class IceSlide {

    // TODO 01: Definicion de atributos

    private int curLevel;
    private int[][] escenario;
    private int filaJugador, columnaJugador;

    public IceSlide(int altura, int anchura){
        // TODO 02: conscructor 1
       this.columnaJugador = altura;
       this.filaJugador = anchura;
    }

    public IceSlide(int[][] escenario){
        // TODO 03: conscructor 2

        if(filaJugador == 0 && columnaJugador == 0){
            new IceSlide(filaJugador, columnaJugador);
        }else {
            clonarEscenario(escenario);

        }

    }

    private void clonarEscenario(int[][] escenario) {
        // TODO 04: clonar la matriz facilitada sobre el atributo escenario
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < columnaJugador; j++) {

                for (int k = 0; k < filaJugador; k++) {
                   int a =  escenario[j][k];
                }
            }
        }

    }

    private boolean encontrarJugador() {
        // TODO 05: localizar la celda tipo JUGADOR en el atributo escenario


        for (int i = 0; i < escenario.length; i++) {
            int i1 = escenario[columnaJugador][filaJugador];


            if (JUGADOR !=null){
                return true;
            }
        }




        return false;
    }

    public void moverJugador(int despFila, int despCol){
        // TODO 06: desplazar el jugador siguiendo las reglas indicadas

        for (int i = 0; i < escenario.length; i++) {
//            if( Celda.VACIO && Celda.HIELO &&  despFila == filaJugador && despCol == columnaJugador){
//                despFila++;
//                despCol++;
//            }
        }


    }

    private boolean desplazarHielo(int filaHielo, int colHielo, int despFila, int despCol) {
        // TODO 07: desplazar el bloque de hielo siguiendo las reglas indicadas
        return false;
    }

    public boolean completado(){
        // TODO 08: indicar si el nivel ha sido resuelto

        for (int i = 0; i <escenario.length; i++) {
            if (HIELO == null){
                return true;
            }
        }

        return false;
    }

    public int[][] getEscenario() {
        // TODO 09: devolver el objeto correspondiente
        return escenario;
    }
}
