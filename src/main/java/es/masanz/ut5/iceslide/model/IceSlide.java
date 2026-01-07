package es.masanz.ut5.iceslide.model;

import static es.masanz.ut5.iceslide.model.Celda.*;

public class IceSlide {

    // TODO 01: Definicion de atributos

    private Nivel curLevel;
    private int[][] escenario;
    private int filaJugador, columnaJugador;

    public IceSlide(int altura, int anchura){
        // TODO 02: conscructor 1
       this.columnaJugador = altura;
       this.filaJugador = anchura;


    }

    public IceSlide(int[][] escenario){
        // TODO 03: conscructor 2
       clonarEscenario(escenario);
       int filas = escenario.length;
       int columnas = escenario[0].length;


        boolean encontrado = false;

        for (int i = 0; i <filas && !encontrado; i++) {
            for (int j = 0; j < columnas && !encontrado; j++) {
                /*
                if(this.escenario[i][j] == Celda.JUGADOR){
                   filaJugador = i;
                   columnaJugador = j;
                   encontrado = true;
                }
                
                 */
            }
        }

        if (!encontrado){
            filaJugador = 0;
            columnaJugador = 0;
        }


    }

    private void clonarEscenario(int[][] escenario) {
        // TODO 04: clonar la matriz facilitada sobre el atributo escenario

        filaJugador = escenario.length;
        columnaJugador  = escenario[0].length;

        int[] [] clonar = new int[filaJugador][columnaJugador];


            for (int j = 0; j < filaJugador; j++) {

                for (int k = 0; k < columnaJugador; k++) {
                   clonar[j][k] =  escenario[j][k];
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

        int nuevaFila = filaJugador + despFila;
        int nuevaCol = columnaJugador + despCol;

        if (nuevaFila < 0 || nuevaFila >= escenario.length || nuevaCol < 0 || nuevaCol >= escenario[0].length){
            return;
        }



        for (int i = 0; i < escenario.length; i++) {

            if ( VACIO!= null && HIELO!=null){
                /*
                desplazarHielo(despFila,despCol,);

                 */
            }
        }



    }

    private boolean desplazarHielo(int filaHielo, int colHielo, int despFila, int despCol) {
        // TODO 07: desplazar el bloque de hielo siguiendo las reglas indicadas

        for (int i = 0; i <colHielo ; i++) {
            for (int j = 0; j < filaHielo; j++) {
                if(Celda.VACIO != null){
                    moverJugador(despFila,despCol);
                    return true;

                }else if (FUEGO != null){
                    /*
                    CHARCO;

                     */
                }


            }



        }



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
