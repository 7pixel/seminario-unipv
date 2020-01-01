package exercise01;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SomeAssertions {

    /**
     * Obiettivo 1: fai compilare questo test, aggiungi tutte le librerie
     * necessarie
     *
     * Obiettivo 2: esegui questo test: l'obiettivo è raggiunto solo se riesci
     * a vedere la barra verde di questo test
     */
    @Test
    public void example() {
        assertEquals(1,1);
    }


    /**
     * Obiettivo 1: vedere la prima barra rossa, hai raggiunto l'obiettivo solo
     * dopo che hai lanciato tutti i test e vedi che solo questo non passsa
     * devi trovare nel messaggio di errore il punto in cui dice che "1" è
     * diverso da "2"
     *
     * Obiettivo 2: fai passare questo test, cambia uno dei numeri e fallo
     * passare.
     */
//    @Test
//    public void redTest() {
//        assertEquals(1,2);
//    }


     /**
      * Obiettivo 1: vedere questo test rosso
      * Obiettivo 2: farlo passare scrivendo il risultato mancante
      */
//    @Test
//    public void somma() {
//        int result = 1+2;
//        assertEquals(___,result);
//    }


    /**
     * Obiettivo 1: lanciare il test e vedere che indica che il metodo è
     * deprecato.
     * Obiettivo 2: correggere il test usando la versione di assertEquals
     * con la tolleranza
     * Obiettivo 3: spiegare perché il metodo è stato deprecato
     */
//     @Test
//    public void comparingFloatOrDoubles() {
//        double result = Math.sqrt(3*3 + 4*4);
//
//        assertEquals(5, result);
//        //assertEquals(5, result, 0.0001);
//    }

    private final int ___ = -1;
}

